package com.shop.demoshop.model;

import io.leangen.graphql.annotations.GraphQLQuery;

import java.math.BigDecimal;
import java.util.List;

public class Order {

    @GraphQLQuery(name = "id")
    private Integer id;
    @GraphQLQuery(name = "user")
    private User user;
    @GraphQLQuery(name = "total")
    private BigDecimal total;
    @GraphQLQuery(name = "items")
    private List<Item> items;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        return id.equals(order.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
