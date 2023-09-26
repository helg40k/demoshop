/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.pg_catalog.tables.records;


import com.shop.jooq.db.pg_catalog.tables.PgLogicalSlotPeekChanges;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgLogicalSlotPeekChangesRecord extends TableRecordImpl<PgLogicalSlotPeekChangesRecord> implements Record3<Object, Long, String> {

    private static final long serialVersionUID = 1L;

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setLsn(Object value) {
        set(0, value);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public Object getLsn() {
        return get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_logical_slot_peek_changes.xid</code>.
     */
    public void setXid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_logical_slot_peek_changes.xid</code>.
     */
    public Long getXid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_logical_slot_peek_changes.data</code>.
     */
    public void setData(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_logical_slot_peek_changes.data</code>.
     */
    public String getData() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Object, Long, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Object, Long, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Field<Object> field1() {
        return PgLogicalSlotPeekChanges.PG_LOGICAL_SLOT_PEEK_CHANGES.LSN;
    }

    @Override
    public Field<Long> field2() {
        return PgLogicalSlotPeekChanges.PG_LOGICAL_SLOT_PEEK_CHANGES.XID;
    }

    @Override
    public Field<String> field3() {
        return PgLogicalSlotPeekChanges.PG_LOGICAL_SLOT_PEEK_CHANGES.DATA;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Object component1() {
        return getLsn();
    }

    @Override
    public Long component2() {
        return getXid();
    }

    @Override
    public String component3() {
        return getData();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Object value1() {
        return getLsn();
    }

    @Override
    public Long value2() {
        return getXid();
    }

    @Override
    public String value3() {
        return getData();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public PgLogicalSlotPeekChangesRecord value1(Object value) {
        setLsn(value);
        return this;
    }

    @Override
    public PgLogicalSlotPeekChangesRecord value2(Long value) {
        setXid(value);
        return this;
    }

    @Override
    public PgLogicalSlotPeekChangesRecord value3(String value) {
        setData(value);
        return this;
    }

    @Override
    public PgLogicalSlotPeekChangesRecord values(Object value1, Long value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgLogicalSlotPeekChangesRecord
     */
    public PgLogicalSlotPeekChangesRecord() {
        super(PgLogicalSlotPeekChanges.PG_LOGICAL_SLOT_PEEK_CHANGES);
    }

    /**
     * Create a detached, initialised PgLogicalSlotPeekChangesRecord
     */
    public PgLogicalSlotPeekChangesRecord(Object lsn, Long xid, String data) {
        super(PgLogicalSlotPeekChanges.PG_LOGICAL_SLOT_PEEK_CHANGES);

        setLsn(lsn);
        setXid(xid);
        setData(data);
    }
}
