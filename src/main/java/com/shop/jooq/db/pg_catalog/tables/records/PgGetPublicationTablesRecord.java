/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.pg_catalog.tables.records;


import com.shop.jooq.db.pg_catalog.tables.PgGetPublicationTables;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgGetPublicationTablesRecord extends TableRecordImpl<PgGetPublicationTablesRecord> implements Record3<Long, Object[], Object> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_get_publication_tables.relid</code>.
     */
    public void setRelid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_publication_tables.relid</code>.
     */
    public Long getRelid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_publication_tables.attrs</code>.
     */
    public void setAttrs(Object[] value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_publication_tables.attrs</code>.
     */
    public Object[] getAttrs() {
        return (Object[]) get(1);
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
    public void setQual(Object value) {
        set(2, value);
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
    public Object getQual() {
        return get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, Object[], Object> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Long, Object[], Object> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgGetPublicationTables.PG_GET_PUBLICATION_TABLES.RELID;
    }

    @Override
    public Field<Object[]> field2() {
        return PgGetPublicationTables.PG_GET_PUBLICATION_TABLES.ATTRS;
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
    public Field<Object> field3() {
        return PgGetPublicationTables.PG_GET_PUBLICATION_TABLES.QUAL;
    }

    @Override
    public Long component1() {
        return getRelid();
    }

    @Override
    public Object[] component2() {
        return getAttrs();
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
    public Object component3() {
        return getQual();
    }

    @Override
    public Long value1() {
        return getRelid();
    }

    @Override
    public Object[] value2() {
        return getAttrs();
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
    public Object value3() {
        return getQual();
    }

    @Override
    public PgGetPublicationTablesRecord value1(Long value) {
        setRelid(value);
        return this;
    }

    @Override
    public PgGetPublicationTablesRecord value2(Object[] value) {
        setAttrs(value);
        return this;
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
    public PgGetPublicationTablesRecord value3(Object value) {
        setQual(value);
        return this;
    }

    @Override
    public PgGetPublicationTablesRecord values(Long value1, Object[] value2, Object value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgGetPublicationTablesRecord
     */
    public PgGetPublicationTablesRecord() {
        super(PgGetPublicationTables.PG_GET_PUBLICATION_TABLES);
    }

    /**
     * Create a detached, initialised PgGetPublicationTablesRecord
     */
    public PgGetPublicationTablesRecord(Long relid, Object[] attrs, Object qual) {
        super(PgGetPublicationTables.PG_GET_PUBLICATION_TABLES);

        setRelid(relid);
        setAttrs(attrs);
        setQual(qual);
    }
}
