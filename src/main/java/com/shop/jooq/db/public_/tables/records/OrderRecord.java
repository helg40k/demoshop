/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.public_.tables.records;


import com.shop.jooq.db.public_.tables.Order;

import java.math.BigDecimal;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrderRecord extends UpdatableRecordImpl<OrderRecord> implements Record3<Integer, Integer, BigDecimal> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.order.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.order.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.order.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.order.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.order.total</code>.
     */
    public void setTotal(BigDecimal value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.order.total</code>.
     */
    public BigDecimal getTotal() {
        return (BigDecimal) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, Integer, BigDecimal> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, Integer, BigDecimal> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Order.ORDER.ID;
    }

    @Override
    public Field<Integer> field2() {
        return Order.ORDER.USER_ID;
    }

    @Override
    public Field<BigDecimal> field3() {
        return Order.ORDER.TOTAL;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getUserId();
    }

    @Override
    public BigDecimal component3() {
        return getTotal();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getUserId();
    }

    @Override
    public BigDecimal value3() {
        return getTotal();
    }

    @Override
    public OrderRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public OrderRecord value2(Integer value) {
        setUserId(value);
        return this;
    }

    @Override
    public OrderRecord value3(BigDecimal value) {
        setTotal(value);
        return this;
    }

    @Override
    public OrderRecord values(Integer value1, Integer value2, BigDecimal value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OrderRecord
     */
    public OrderRecord() {
        super(Order.ORDER);
    }

    /**
     * Create a detached, initialised OrderRecord
     */
    public OrderRecord(Integer id, Integer userId, BigDecimal total) {
        super(Order.ORDER);

        setId(id);
        setUserId(userId);
        setTotal(total);
    }
}
