/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.public_;


import com.shop.jooq.db.DefaultCatalog;
import com.shop.jooq.db.public_.tables.Item;
import com.shop.jooq.db.public_.tables.Order;
import com.shop.jooq.db.public_.tables.OrderItem;
import com.shop.jooq.db.public_.tables.User;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.item</code>.
     */
    public final Item ITEM = Item.ITEM;

    /**
     * The table <code>public.order</code>.
     */
    public final Order ORDER = Order.ORDER;

    /**
     * The table <code>public.order_item</code>.
     */
    public final OrderItem ORDER_ITEM = OrderItem.ORDER_ITEM;

    /**
     * The table <code>public.user</code>.
     */
    public final User USER = User.USER;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Item.ITEM,
            Order.ORDER,
            OrderItem.ORDER_ITEM,
            User.USER
        );
    }
}
