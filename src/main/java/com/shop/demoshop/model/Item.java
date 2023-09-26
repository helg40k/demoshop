package com.shop.demoshop.model;

import io.leangen.graphql.annotations.GraphQLQuery;

import java.math.BigDecimal;

public class Item {

    @GraphQLQuery(name = "id")
    private Integer id;
    @GraphQLQuery(name = "sku")
    private String sku;
    @GraphQLQuery(name = "description")
    private String description;
    @GraphQLQuery(name = "price")
    private BigDecimal price;
    @GraphQLQuery(name = "quantity")
    private Integer quantity;
    @GraphQLQuery(name = "amount")
    private BigDecimal amount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        return id.equals(item.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
