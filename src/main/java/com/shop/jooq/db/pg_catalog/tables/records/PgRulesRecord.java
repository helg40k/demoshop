/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.pg_catalog.tables.records;


import com.shop.jooq.db.pg_catalog.tables.PgRules;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgRulesRecord extends TableRecordImpl<PgRulesRecord> implements Record4<String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_rules.schemaname</code>.
     */
    public void setSchemaname(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_rules.schemaname</code>.
     */
    public String getSchemaname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_rules.tablename</code>.
     */
    public void setTablename(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_rules.tablename</code>.
     */
    public String getTablename() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_rules.rulename</code>.
     */
    public void setRulename(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_rules.rulename</code>.
     */
    public String getRulename() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_rules.definition</code>.
     */
    public void setDefinition(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_rules.definition</code>.
     */
    public String getDefinition() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return PgRules.PG_RULES.SCHEMANAME;
    }

    @Override
    public Field<String> field2() {
        return PgRules.PG_RULES.TABLENAME;
    }

    @Override
    public Field<String> field3() {
        return PgRules.PG_RULES.RULENAME;
    }

    @Override
    public Field<String> field4() {
        return PgRules.PG_RULES.DEFINITION;
    }

    @Override
    public String component1() {
        return getSchemaname();
    }

    @Override
    public String component2() {
        return getTablename();
    }

    @Override
    public String component3() {
        return getRulename();
    }

    @Override
    public String component4() {
        return getDefinition();
    }

    @Override
    public String value1() {
        return getSchemaname();
    }

    @Override
    public String value2() {
        return getTablename();
    }

    @Override
    public String value3() {
        return getRulename();
    }

    @Override
    public String value4() {
        return getDefinition();
    }

    @Override
    public PgRulesRecord value1(String value) {
        setSchemaname(value);
        return this;
    }

    @Override
    public PgRulesRecord value2(String value) {
        setTablename(value);
        return this;
    }

    @Override
    public PgRulesRecord value3(String value) {
        setRulename(value);
        return this;
    }

    @Override
    public PgRulesRecord value4(String value) {
        setDefinition(value);
        return this;
    }

    @Override
    public PgRulesRecord values(String value1, String value2, String value3, String value4) {
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
     * Create a detached PgRulesRecord
     */
    public PgRulesRecord() {
        super(PgRules.PG_RULES);
    }

    /**
     * Create a detached, initialised PgRulesRecord
     */
    public PgRulesRecord(String schemaname, String tablename, String rulename, String definition) {
        super(PgRules.PG_RULES);

        setSchemaname(schemaname);
        setTablename(tablename);
        setRulename(rulename);
        setDefinition(definition);
    }
}
