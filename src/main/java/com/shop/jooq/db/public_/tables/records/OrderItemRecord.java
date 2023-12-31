/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.public_.tables.records;


import com.shop.jooq.db.public_.tables.OrderItem;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrderItemRecord extends UpdatableRecordImpl<OrderItemRecord> implements Record4<Integer, Integer, Integer, BigDecimal> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.order_item.order_id</code>.
     */
    public void setOrderId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.order_item.order_id</code>.
     */
    public Integer getOrderId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.order_item.item_id</code>.
     */
    public void setItemId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.order_item.item_id</code>.
     */
    public Integer getItemId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.order_item.quantity</code>. the count of the item
     * in the order
     */
    public void setQuantity(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.order_item.quantity</code>. the count of the item
     * in the order
     */
    public Integer getQuantity() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.order_item.amount</code>. quantity * price
     */
    public void setAmount(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.order_item.amount</code>. quantity * price
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, Integer, Integer, BigDecimal> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, Integer, Integer, BigDecimal> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return OrderItem.ORDER_ITEM.ORDER_ID;
    }

    @Override
    public Field<Integer> field2() {
        return OrderItem.ORDER_ITEM.ITEM_ID;
    }

    @Override
    public Field<Integer> field3() {
        return OrderItem.ORDER_ITEM.QUANTITY;
    }

    @Override
    public Field<BigDecimal> field4() {
        return OrderItem.ORDER_ITEM.AMOUNT;
    }

    @Override
    public Integer component1() {
        return getOrderId();
    }

    @Override
    public Integer component2() {
        return getItemId();
    }

    @Override
    public Integer component3() {
        return getQuantity();
    }

    @Override
    public BigDecimal component4() {
        return getAmount();
    }

    @Override
    public Integer value1() {
        return getOrderId();
    }

    @Override
    public Integer value2() {
        return getItemId();
    }

    @Override
    public Integer value3() {
        return getQuantity();
    }

    @Override
    public BigDecimal value4() {
        return getAmount();
    }

    @Override
    public OrderItemRecord value1(Integer value) {
        setOrderId(value);
        return this;
    }

    @Override
    public OrderItemRecord value2(Integer value) {
        setItemId(value);
        return this;
    }

    @Override
    public OrderItemRecord value3(Integer value) {
        setQuantity(value);
        return this;
    }

    @Override
    public OrderItemRecord value4(BigDecimal value) {
        setAmount(value);
        return this;
    }

    @Override
    public OrderItemRecord values(Integer value1, Integer value2, Integer value3, BigDecimal value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OrderItemRecord
     */
    public OrderItemRecord() {
        super(OrderItem.ORDER_ITEM);
    }

    /**
     * Create a detached, initialised OrderItemRecord
     */
    public OrderItemRecord(Integer orderId, Integer itemId, Integer quantity, BigDecimal amount) {
        super(OrderItem.ORDER_ITEM);

        setOrderId(orderId);
        setItemId(itemId);
        setQuantity(quantity);
        setAmount(amount);
    }
}
