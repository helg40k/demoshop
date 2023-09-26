/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.pg_catalog.tables.records;


import com.shop.jooq.db.pg_catalog.tables.PgSeclabel;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgSeclabelRecord extends UpdatableRecordImpl<PgSeclabelRecord> implements Record5<Long, Long, Integer, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_seclabel.objoid</code>.
     */
    public void setObjoid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_seclabel.objoid</code>.
     */
    public Long getObjoid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_seclabel.classoid</code>.
     */
    public void setClassoid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_seclabel.classoid</code>.
     */
    public Long getClassoid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_seclabel.objsubid</code>.
     */
    public void setObjsubid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_seclabel.objsubid</code>.
     */
    public Integer getObjsubid() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_seclabel.provider</code>.
     */
    public void setProvider(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_seclabel.provider</code>.
     */
    public String getProvider() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_seclabel.label</code>.
     */
    public void setLabel(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_seclabel.label</code>.
     */
    public String getLabel() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record4<Long, Long, Integer, String> key() {
        return (Record4) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, Long, Integer, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Long, Long, Integer, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgSeclabel.PG_SECLABEL.OBJOID;
    }

    @Override
    public Field<Long> field2() {
        return PgSeclabel.PG_SECLABEL.CLASSOID;
    }

    @Override
    public Field<Integer> field3() {
        return PgSeclabel.PG_SECLABEL.OBJSUBID;
    }

    @Override
    public Field<String> field4() {
        return PgSeclabel.PG_SECLABEL.PROVIDER;
    }

    @Override
    public Field<String> field5() {
        return PgSeclabel.PG_SECLABEL.LABEL;
    }

    @Override
    public Long component1() {
        return getObjoid();
    }

    @Override
    public Long component2() {
        return getClassoid();
    }

    @Override
    public Integer component3() {
        return getObjsubid();
    }

    @Override
    public String component4() {
        return getProvider();
    }

    @Override
    public String component5() {
        return getLabel();
    }

    @Override
    public Long value1() {
        return getObjoid();
    }

    @Override
    public Long value2() {
        return getClassoid();
    }

    @Override
    public Integer value3() {
        return getObjsubid();
    }

    @Override
    public String value4() {
        return getProvider();
    }

    @Override
    public String value5() {
        return getLabel();
    }

    @Override
    public PgSeclabelRecord value1(Long value) {
        setObjoid(value);
        return this;
    }

    @Override
    public PgSeclabelRecord value2(Long value) {
        setClassoid(value);
        return this;
    }

    @Override
    public PgSeclabelRecord value3(Integer value) {
        setObjsubid(value);
        return this;
    }

    @Override
    public PgSeclabelRecord value4(String value) {
        setProvider(value);
        return this;
    }

    @Override
    public PgSeclabelRecord value5(String value) {
        setLabel(value);
        return this;
    }

    @Override
    public PgSeclabelRecord values(Long value1, Long value2, Integer value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgSeclabelRecord
     */
    public PgSeclabelRecord() {
        super(PgSeclabel.PG_SECLABEL);
    }

    /**
     * Create a detached, initialised PgSeclabelRecord
     */
    public PgSeclabelRecord(Long objoid, Long classoid, Integer objsubid, String provider, String label) {
        super(PgSeclabel.PG_SECLABEL);

        setObjoid(objoid);
        setClassoid(classoid);
        setObjsubid(objsubid);
        setProvider(provider);
        setLabel(label);
    }
}
