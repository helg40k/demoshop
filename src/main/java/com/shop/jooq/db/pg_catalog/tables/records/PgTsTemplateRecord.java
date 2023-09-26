/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.pg_catalog.tables.records;


import com.shop.jooq.db.pg_catalog.tables.PgTsTemplate;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgTsTemplateRecord extends UpdatableRecordImpl<PgTsTemplateRecord> implements Record5<Long, String, Long, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_ts_template.oid</code>.
     */
    public void setOid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_template.oid</code>.
     */
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_template.tmplname</code>.
     */
    public void setTmplname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_template.tmplname</code>.
     */
    public String getTmplname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_template.tmplnamespace</code>.
     */
    public void setTmplnamespace(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_template.tmplnamespace</code>.
     */
    public Long getTmplnamespace() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_template.tmplinit</code>.
     */
    public void setTmplinit(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_template.tmplinit</code>.
     */
    public String getTmplinit() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_template.tmpllexize</code>.
     */
    public void setTmpllexize(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_template.tmpllexize</code>.
     */
    public String getTmpllexize() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, String, Long, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Long, String, Long, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgTsTemplate.PG_TS_TEMPLATE.OID;
    }

    @Override
    public Field<String> field2() {
        return PgTsTemplate.PG_TS_TEMPLATE.TMPLNAME;
    }

    @Override
    public Field<Long> field3() {
        return PgTsTemplate.PG_TS_TEMPLATE.TMPLNAMESPACE;
    }

    @Override
    public Field<String> field4() {
        return PgTsTemplate.PG_TS_TEMPLATE.TMPLINIT;
    }

    @Override
    public Field<String> field5() {
        return PgTsTemplate.PG_TS_TEMPLATE.TMPLLEXIZE;
    }

    @Override
    public Long component1() {
        return getOid();
    }

    @Override
    public String component2() {
        return getTmplname();
    }

    @Override
    public Long component3() {
        return getTmplnamespace();
    }

    @Override
    public String component4() {
        return getTmplinit();
    }

    @Override
    public String component5() {
        return getTmpllexize();
    }

    @Override
    public Long value1() {
        return getOid();
    }

    @Override
    public String value2() {
        return getTmplname();
    }

    @Override
    public Long value3() {
        return getTmplnamespace();
    }

    @Override
    public String value4() {
        return getTmplinit();
    }

    @Override
    public String value5() {
        return getTmpllexize();
    }

    @Override
    public PgTsTemplateRecord value1(Long value) {
        setOid(value);
        return this;
    }

    @Override
    public PgTsTemplateRecord value2(String value) {
        setTmplname(value);
        return this;
    }

    @Override
    public PgTsTemplateRecord value3(Long value) {
        setTmplnamespace(value);
        return this;
    }

    @Override
    public PgTsTemplateRecord value4(String value) {
        setTmplinit(value);
        return this;
    }

    @Override
    public PgTsTemplateRecord value5(String value) {
        setTmpllexize(value);
        return this;
    }

    @Override
    public PgTsTemplateRecord values(Long value1, String value2, Long value3, String value4, String value5) {
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
     * Create a detached PgTsTemplateRecord
     */
    public PgTsTemplateRecord() {
        super(PgTsTemplate.PG_TS_TEMPLATE);
    }

    /**
     * Create a detached, initialised PgTsTemplateRecord
     */
    public PgTsTemplateRecord(Long oid, String tmplname, Long tmplnamespace, String tmplinit, String tmpllexize) {
        super(PgTsTemplate.PG_TS_TEMPLATE);

        setOid(oid);
        setTmplname(tmplname);
        setTmplnamespace(tmplnamespace);
        setTmplinit(tmplinit);
        setTmpllexize(tmpllexize);
    }
}
