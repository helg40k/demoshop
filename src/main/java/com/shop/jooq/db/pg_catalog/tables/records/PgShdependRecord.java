/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.pg_catalog.tables.records;


import com.shop.jooq.db.pg_catalog.tables.PgShdepend;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgShdependRecord extends TableRecordImpl<PgShdependRecord> implements Record7<Long, Long, Long, Integer, Long, Long, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_shdepend.dbid</code>.
     */
    public void setDbid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_shdepend.dbid</code>.
     */
    public Long getDbid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_shdepend.classid</code>.
     */
    public void setClassid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_shdepend.classid</code>.
     */
    public Long getClassid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_shdepend.objid</code>.
     */
    public void setObjid(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_shdepend.objid</code>.
     */
    public Long getObjid() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_shdepend.objsubid</code>.
     */
    public void setObjsubid(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_shdepend.objsubid</code>.
     */
    public Integer getObjsubid() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_shdepend.refclassid</code>.
     */
    public void setRefclassid(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_shdepend.refclassid</code>.
     */
    public Long getRefclassid() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_shdepend.refobjid</code>.
     */
    public void setRefobjid(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_shdepend.refobjid</code>.
     */
    public Long getRefobjid() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_shdepend.deptype</code>.
     */
    public void setDeptype(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_shdepend.deptype</code>.
     */
    public String getDeptype() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, Long, Long, Integer, Long, Long, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Long, Long, Long, Integer, Long, Long, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgShdepend.PG_SHDEPEND.DBID;
    }

    @Override
    public Field<Long> field2() {
        return PgShdepend.PG_SHDEPEND.CLASSID;
    }

    @Override
    public Field<Long> field3() {
        return PgShdepend.PG_SHDEPEND.OBJID;
    }

    @Override
    public Field<Integer> field4() {
        return PgShdepend.PG_SHDEPEND.OBJSUBID;
    }

    @Override
    public Field<Long> field5() {
        return PgShdepend.PG_SHDEPEND.REFCLASSID;
    }

    @Override
    public Field<Long> field6() {
        return PgShdepend.PG_SHDEPEND.REFOBJID;
    }

    @Override
    public Field<String> field7() {
        return PgShdepend.PG_SHDEPEND.DEPTYPE;
    }

    @Override
    public Long component1() {
        return getDbid();
    }

    @Override
    public Long component2() {
        return getClassid();
    }

    @Override
    public Long component3() {
        return getObjid();
    }

    @Override
    public Integer component4() {
        return getObjsubid();
    }

    @Override
    public Long component5() {
        return getRefclassid();
    }

    @Override
    public Long component6() {
        return getRefobjid();
    }

    @Override
    public String component7() {
        return getDeptype();
    }

    @Override
    public Long value1() {
        return getDbid();
    }

    @Override
    public Long value2() {
        return getClassid();
    }

    @Override
    public Long value3() {
        return getObjid();
    }

    @Override
    public Integer value4() {
        return getObjsubid();
    }

    @Override
    public Long value5() {
        return getRefclassid();
    }

    @Override
    public Long value6() {
        return getRefobjid();
    }

    @Override
    public String value7() {
        return getDeptype();
    }

    @Override
    public PgShdependRecord value1(Long value) {
        setDbid(value);
        return this;
    }

    @Override
    public PgShdependRecord value2(Long value) {
        setClassid(value);
        return this;
    }

    @Override
    public PgShdependRecord value3(Long value) {
        setObjid(value);
        return this;
    }

    @Override
    public PgShdependRecord value4(Integer value) {
        setObjsubid(value);
        return this;
    }

    @Override
    public PgShdependRecord value5(Long value) {
        setRefclassid(value);
        return this;
    }

    @Override
    public PgShdependRecord value6(Long value) {
        setRefobjid(value);
        return this;
    }

    @Override
    public PgShdependRecord value7(String value) {
        setDeptype(value);
        return this;
    }

    @Override
    public PgShdependRecord values(Long value1, Long value2, Long value3, Integer value4, Long value5, Long value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgShdependRecord
     */
    public PgShdependRecord() {
        super(PgShdepend.PG_SHDEPEND);
    }

    /**
     * Create a detached, initialised PgShdependRecord
     */
    public PgShdependRecord(Long dbid, Long classid, Long objid, Integer objsubid, Long refclassid, Long refobjid, String deptype) {
        super(PgShdepend.PG_SHDEPEND);

        setDbid(dbid);
        setClassid(classid);
        setObjid(objid);
        setObjsubid(objsubid);
        setRefclassid(refclassid);
        setRefobjid(refobjid);
        setDeptype(deptype);
    }
}