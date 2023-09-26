/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.pg_catalog.tables.records;


import com.shop.jooq.db.pg_catalog.tables.PgIndexes;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgIndexesRecord extends TableRecordImpl<PgIndexesRecord> implements Record5<String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_indexes.schemaname</code>.
     */
    public void setSchemaname(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_indexes.schemaname</code>.
     */
    public String getSchemaname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_indexes.tablename</code>.
     */
    public void setTablename(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_indexes.tablename</code>.
     */
    public String getTablename() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_indexes.indexname</code>.
     */
    public void setIndexname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_indexes.indexname</code>.
     */
    public String getIndexname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_indexes.tablespace</code>.
     */
    public void setTablespace(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_indexes.tablespace</code>.
     */
    public String getTablespace() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_indexes.indexdef</code>.
     */
    public void setIndexdef(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_indexes.indexdef</code>.
     */
    public String getIndexdef() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<String, String, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return PgIndexes.PG_INDEXES.SCHEMANAME;
    }

    @Override
    public Field<String> field2() {
        return PgIndexes.PG_INDEXES.TABLENAME;
    }

    @Override
    public Field<String> field3() {
        return PgIndexes.PG_INDEXES.INDEXNAME;
    }

    @Override
    public Field<String> field4() {
        return PgIndexes.PG_INDEXES.TABLESPACE;
    }

    @Override
    public Field<String> field5() {
        return PgIndexes.PG_INDEXES.INDEXDEF;
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
        return getIndexname();
    }

    @Override
    public String component4() {
        return getTablespace();
    }

    @Override
    public String component5() {
        return getIndexdef();
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
        return getIndexname();
    }

    @Override
    public String value4() {
        return getTablespace();
    }

    @Override
    public String value5() {
        return getIndexdef();
    }

    @Override
    public PgIndexesRecord value1(String value) {
        setSchemaname(value);
        return this;
    }

    @Override
    public PgIndexesRecord value2(String value) {
        setTablename(value);
        return this;
    }

    @Override
    public PgIndexesRecord value3(String value) {
        setIndexname(value);
        return this;
    }

    @Override
    public PgIndexesRecord value4(String value) {
        setTablespace(value);
        return this;
    }

    @Override
    public PgIndexesRecord value5(String value) {
        setIndexdef(value);
        return this;
    }

    @Override
    public PgIndexesRecord values(String value1, String value2, String value3, String value4, String value5) {
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
     * Create a detached PgIndexesRecord
     */
    public PgIndexesRecord() {
        super(PgIndexes.PG_INDEXES);
    }

    /**
     * Create a detached, initialised PgIndexesRecord
     */
    public PgIndexesRecord(String schemaname, String tablename, String indexname, String tablespace, String indexdef) {
        super(PgIndexes.PG_INDEXES);

        setSchemaname(schemaname);
        setTablename(tablename);
        setIndexname(indexname);
        setTablespace(tablespace);
        setIndexdef(indexdef);
    }
}
