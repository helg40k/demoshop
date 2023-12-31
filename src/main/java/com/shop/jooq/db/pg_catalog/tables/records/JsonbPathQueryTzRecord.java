/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.pg_catalog.tables.records;


import com.shop.jooq.db.pg_catalog.tables.JsonbPathQueryTz;

import org.jooq.Field;
import org.jooq.JSONB;
import org.jooq.Record1;
import org.jooq.Row1;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JsonbPathQueryTzRecord extends TableRecordImpl<JsonbPathQueryTzRecord> implements Record1<JSONB> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>pg_catalog.jsonb_path_query_tz.jsonb_path_query_tz</code>.
     */
    public void setJsonbPathQueryTz(JSONB value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.jsonb_path_query_tz.jsonb_path_query_tz</code>.
     */
    public JSONB getJsonbPathQueryTz() {
        return (JSONB) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row1<JSONB> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    @Override
    public Row1<JSONB> valuesRow() {
        return (Row1) super.valuesRow();
    }

    @Override
    public Field<JSONB> field1() {
        return JsonbPathQueryTz.JSONB_PATH_QUERY_TZ.JSONB_PATH_QUERY_TZ_;
    }

    @Override
    public JSONB component1() {
        return getJsonbPathQueryTz();
    }

    @Override
    public JSONB value1() {
        return getJsonbPathQueryTz();
    }

    @Override
    public JsonbPathQueryTzRecord value1(JSONB value) {
        setJsonbPathQueryTz(value);
        return this;
    }

    @Override
    public JsonbPathQueryTzRecord values(JSONB value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JsonbPathQueryTzRecord
     */
    public JsonbPathQueryTzRecord() {
        super(JsonbPathQueryTz.JSONB_PATH_QUERY_TZ);
    }

    /**
     * Create a detached, initialised JsonbPathQueryTzRecord
     */
    public JsonbPathQueryTzRecord(JSONB jsonbPathQueryTz) {
        super(JsonbPathQueryTz.JSONB_PATH_QUERY_TZ);

        setJsonbPathQueryTz(jsonbPathQueryTz);
    }
}
