/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.pg_catalog.tables.records;


import com.shop.jooq.db.pg_catalog.tables.PgNamespace;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgNamespaceRecord extends UpdatableRecordImpl<PgNamespaceRecord> implements Record4<Long, String, Long, String[]> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_namespace.oid</code>.
     */
    public void setOid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_namespace.oid</code>.
     */
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_namespace.nspname</code>.
     */
    public void setNspname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_namespace.nspname</code>.
     */
    public String getNspname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_namespace.nspowner</code>.
     */
    public void setNspowner(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_namespace.nspowner</code>.
     */
    public Long getNspowner() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_namespace.nspacl</code>.
     */
    public void setNspacl(String[] value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_namespace.nspacl</code>.
     */
    public String[] getNspacl() {
        return (String[]) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, String, Long, String[]> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Long, String, Long, String[]> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgNamespace.PG_NAMESPACE.OID;
    }

    @Override
    public Field<String> field2() {
        return PgNamespace.PG_NAMESPACE.NSPNAME;
    }

    @Override
    public Field<Long> field3() {
        return PgNamespace.PG_NAMESPACE.NSPOWNER;
    }

    @Override
    public Field<String[]> field4() {
        return PgNamespace.PG_NAMESPACE.NSPACL;
    }

    @Override
    public Long component1() {
        return getOid();
    }

    @Override
    public String component2() {
        return getNspname();
    }

    @Override
    public Long component3() {
        return getNspowner();
    }

    @Override
    public String[] component4() {
        return getNspacl();
    }

    @Override
    public Long value1() {
        return getOid();
    }

    @Override
    public String value2() {
        return getNspname();
    }

    @Override
    public Long value3() {
        return getNspowner();
    }

    @Override
    public String[] value4() {
        return getNspacl();
    }

    @Override
    public PgNamespaceRecord value1(Long value) {
        setOid(value);
        return this;
    }

    @Override
    public PgNamespaceRecord value2(String value) {
        setNspname(value);
        return this;
    }

    @Override
    public PgNamespaceRecord value3(Long value) {
        setNspowner(value);
        return this;
    }

    @Override
    public PgNamespaceRecord value4(String[] value) {
        setNspacl(value);
        return this;
    }

    @Override
    public PgNamespaceRecord values(Long value1, String value2, Long value3, String[] value4) {
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
     * Create a detached PgNamespaceRecord
     */
    public PgNamespaceRecord() {
        super(PgNamespace.PG_NAMESPACE);
    }

    /**
     * Create a detached, initialised PgNamespaceRecord
     */
    public PgNamespaceRecord(Long oid, String nspname, Long nspowner, String[] nspacl) {
        super(PgNamespace.PG_NAMESPACE);

        setOid(oid);
        setNspname(nspname);
        setNspowner(nspowner);
        setNspacl(nspacl);
    }
}