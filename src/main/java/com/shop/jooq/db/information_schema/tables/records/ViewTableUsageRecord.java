/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.information_schema.tables.records;


import com.shop.jooq.db.information_schema.tables.ViewTableUsage;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewTableUsageRecord extends TableRecordImpl<ViewTableUsageRecord> implements Record6<String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>information_schema.view_table_usage.view_catalog</code>.
     */
    public void setViewCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.view_table_usage.view_catalog</code>.
     */
    public String getViewCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.view_table_usage.view_schema</code>.
     */
    public void setViewSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.view_table_usage.view_schema</code>.
     */
    public String getViewSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.view_table_usage.view_name</code>.
     */
    public void setViewName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.view_table_usage.view_name</code>.
     */
    public String getViewName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.view_table_usage.table_catalog</code>.
     */
    public void setTableCatalog(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.view_table_usage.table_catalog</code>.
     */
    public String getTableCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.view_table_usage.table_schema</code>.
     */
    public void setTableSchema(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.view_table_usage.table_schema</code>.
     */
    public String getTableSchema() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.view_table_usage.table_name</code>.
     */
    public void setTableName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.view_table_usage.table_name</code>.
     */
    public String getTableName() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, String, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<String, String, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return ViewTableUsage.VIEW_TABLE_USAGE.VIEW_CATALOG;
    }

    @Override
    public Field<String> field2() {
        return ViewTableUsage.VIEW_TABLE_USAGE.VIEW_SCHEMA;
    }

    @Override
    public Field<String> field3() {
        return ViewTableUsage.VIEW_TABLE_USAGE.VIEW_NAME;
    }

    @Override
    public Field<String> field4() {
        return ViewTableUsage.VIEW_TABLE_USAGE.TABLE_CATALOG;
    }

    @Override
    public Field<String> field5() {
        return ViewTableUsage.VIEW_TABLE_USAGE.TABLE_SCHEMA;
    }

    @Override
    public Field<String> field6() {
        return ViewTableUsage.VIEW_TABLE_USAGE.TABLE_NAME;
    }

    @Override
    public String component1() {
        return getViewCatalog();
    }

    @Override
    public String component2() {
        return getViewSchema();
    }

    @Override
    public String component3() {
        return getViewName();
    }

    @Override
    public String component4() {
        return getTableCatalog();
    }

    @Override
    public String component5() {
        return getTableSchema();
    }

    @Override
    public String component6() {
        return getTableName();
    }

    @Override
    public String value1() {
        return getViewCatalog();
    }

    @Override
    public String value2() {
        return getViewSchema();
    }

    @Override
    public String value3() {
        return getViewName();
    }

    @Override
    public String value4() {
        return getTableCatalog();
    }

    @Override
    public String value5() {
        return getTableSchema();
    }

    @Override
    public String value6() {
        return getTableName();
    }

    @Override
    public ViewTableUsageRecord value1(String value) {
        setViewCatalog(value);
        return this;
    }

    @Override
    public ViewTableUsageRecord value2(String value) {
        setViewSchema(value);
        return this;
    }

    @Override
    public ViewTableUsageRecord value3(String value) {
        setViewName(value);
        return this;
    }

    @Override
    public ViewTableUsageRecord value4(String value) {
        setTableCatalog(value);
        return this;
    }

    @Override
    public ViewTableUsageRecord value5(String value) {
        setTableSchema(value);
        return this;
    }

    @Override
    public ViewTableUsageRecord value6(String value) {
        setTableName(value);
        return this;
    }

    @Override
    public ViewTableUsageRecord values(String value1, String value2, String value3, String value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewTableUsageRecord
     */
    public ViewTableUsageRecord() {
        super(ViewTableUsage.VIEW_TABLE_USAGE);
    }

    /**
     * Create a detached, initialised ViewTableUsageRecord
     */
    public ViewTableUsageRecord(String viewCatalog, String viewSchema, String viewName, String tableCatalog, String tableSchema, String tableName) {
        super(ViewTableUsage.VIEW_TABLE_USAGE);

        setViewCatalog(viewCatalog);
        setViewSchema(viewSchema);
        setViewName(viewName);
        setTableCatalog(tableCatalog);
        setTableSchema(tableSchema);
        setTableName(tableName);
    }
}
