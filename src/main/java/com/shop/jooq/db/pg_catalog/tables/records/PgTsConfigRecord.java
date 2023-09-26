/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.pg_catalog.tables.records;


import com.shop.jooq.db.pg_catalog.tables.PgTsConfig;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgTsConfigRecord extends UpdatableRecordImpl<PgTsConfigRecord> implements Record5<Long, String, Long, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_ts_config.oid</code>.
     */
    public void setOid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_config.oid</code>.
     */
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_config.cfgname</code>.
     */
    public void setCfgname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_config.cfgname</code>.
     */
    public String getCfgname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_config.cfgnamespace</code>.
     */
    public void setCfgnamespace(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_config.cfgnamespace</code>.
     */
    public Long getCfgnamespace() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_config.cfgowner</code>.
     */
    public void setCfgowner(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_config.cfgowner</code>.
     */
    public Long getCfgowner() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_ts_config.cfgparser</code>.
     */
    public void setCfgparser(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ts_config.cfgparser</code>.
     */
    public Long getCfgparser() {
        return (Long) get(4);
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
    public Row5<Long, String, Long, Long, Long> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<Long, String, Long, Long, Long> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgTsConfig.PG_TS_CONFIG.OID;
    }

    @Override
    public Field<String> field2() {
        return PgTsConfig.PG_TS_CONFIG.CFGNAME;
    }

    @Override
    public Field<Long> field3() {
        return PgTsConfig.PG_TS_CONFIG.CFGNAMESPACE;
    }

    @Override
    public Field<Long> field4() {
        return PgTsConfig.PG_TS_CONFIG.CFGOWNER;
    }

    @Override
    public Field<Long> field5() {
        return PgTsConfig.PG_TS_CONFIG.CFGPARSER;
    }

    @Override
    public Long component1() {
        return getOid();
    }

    @Override
    public String component2() {
        return getCfgname();
    }

    @Override
    public Long component3() {
        return getCfgnamespace();
    }

    @Override
    public Long component4() {
        return getCfgowner();
    }

    @Override
    public Long component5() {
        return getCfgparser();
    }

    @Override
    public Long value1() {
        return getOid();
    }

    @Override
    public String value2() {
        return getCfgname();
    }

    @Override
    public Long value3() {
        return getCfgnamespace();
    }

    @Override
    public Long value4() {
        return getCfgowner();
    }

    @Override
    public Long value5() {
        return getCfgparser();
    }

    @Override
    public PgTsConfigRecord value1(Long value) {
        setOid(value);
        return this;
    }

    @Override
    public PgTsConfigRecord value2(String value) {
        setCfgname(value);
        return this;
    }

    @Override
    public PgTsConfigRecord value3(Long value) {
        setCfgnamespace(value);
        return this;
    }

    @Override
    public PgTsConfigRecord value4(Long value) {
        setCfgowner(value);
        return this;
    }

    @Override
    public PgTsConfigRecord value5(Long value) {
        setCfgparser(value);
        return this;
    }

    @Override
    public PgTsConfigRecord values(Long value1, String value2, Long value3, Long value4, Long value5) {
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
     * Create a detached PgTsConfigRecord
     */
    public PgTsConfigRecord() {
        super(PgTsConfig.PG_TS_CONFIG);
    }

    /**
     * Create a detached, initialised PgTsConfigRecord
     */
    public PgTsConfigRecord(Long oid, String cfgname, Long cfgnamespace, Long cfgowner, Long cfgparser) {
        super(PgTsConfig.PG_TS_CONFIG);

        setOid(oid);
        setCfgname(cfgname);
        setCfgnamespace(cfgnamespace);
        setCfgowner(cfgowner);
        setCfgparser(cfgparser);
    }
}
