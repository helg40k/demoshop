package com.shop.demoshop.service;

import com.shop.demoshop.model.Order;
import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import org.jooq.DSLContext;
import org.jooq.JSON;
import org.jooq.Record3;
import org.jooq.Record4;
import org.jooq.Record5;
import org.jooq.Result;
import org.jooq.SelectGroupByStep;
import org.jooq.SelectOnConditionStep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

import static com.shop.jooq.db.public_.tables.Item.ITEM;
import static com.shop.jooq.db.public_.tables.Order.ORDER;
import static com.shop.jooq.db.public_.tables.OrderItem.ORDER_ITEM;
import static com.shop.jooq.db.public_.tables.User.USER;
import static org.jooq.impl.DSL.jsonObject;
import static org.jooq.impl.DSL.multisetAgg;

@Service
@GraphQLApi
public class QueryService {

    @Autowired
    private DSLContext dsl;

    @GraphQLQuery(name = "orders")
    public List<Order> getOrders(@GraphQLArgument(name = "country") String country) {
        SelectOnConditionStep<Record4<Integer, BigDecimal, JSON, Result<Record5<Integer, BigDecimal, String, String, BigDecimal>>>> selectQuery = dsl
                .select(
                        ORDER.ID,
                        ORDER.TOTAL,
                        jsonObject(
                                USER.ID,
                                USER.NAME,
                                USER.EMAIL,
                                USER.COUNTRY
                        ).as("user"),
                        multisetAgg(
                                ORDER_ITEM.QUANTITY,
                                ORDER_ITEM.AMOUNT,
                                ITEM.SKU,
                                ITEM.DESCRIPTION,
                                ITEM.PRICE
                        ).as("items")
                )
                .from(ORDER)
                .join(USER)
                .on(ORDER.USER_ID.eq(USER.ID))
                .join(ORDER_ITEM)
                .on(ORDER.ID.eq(ORDER_ITEM.ORDER_ID))
                .join(ITEM)
                .on(ITEM.ID.eq(ORDER_ITEM.ITEM_ID));

        SelectGroupByStep<Record4<Integer, BigDecimal, JSON, Result<Record5<Integer, BigDecimal, String, String, BigDecimal>>>> condition;
        if (null != country) {
            condition = selectQuery.where(USER.COUNTRY.eq(country));
        } else {
            condition = selectQuery;
        }

        return condition
                .groupBy(
                        ORDER.ID,
                        ORDER.TOTAL,
                        USER.ID,
                        USER.NAME,
                        USER.EMAIL,
                        USER.COUNTRY
                )
                .fetchInto(Order.class);
    }

    @GraphQLQuery(name = "ordersWithoutItems")
    public List<Order> getOrdersWithoutItems(@GraphQLArgument(name = "country") String country) {
        SelectOnConditionStep<Record3<Integer, BigDecimal, JSON>> selectQuery = dsl
                .select(
                        ORDER.ID,
                        ORDER.TOTAL,
                        jsonObject(
                                USER.ID,
                                USER.NAME,
                                USER.EMAIL,
                                USER.COUNTRY
                        ).as("user")
                )
                .from(ORDER)
                .join(USER)
                .on(ORDER.USER_ID.eq(USER.ID));

        SelectGroupByStep<Record3<Integer, BigDecimal, JSON>> condition;
        if (null != country) {
            condition = selectQuery.where(USER.COUNTRY.eq(country));
        } else {
            condition = selectQuery;
        }

        return condition
                .fetchInto(Order.class);
    }

}
