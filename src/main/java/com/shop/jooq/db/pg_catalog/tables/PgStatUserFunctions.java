/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.pg_catalog.tables;


import com.shop.jooq.db.pg_catalog.PgCatalog;
import com.shop.jooq.db.pg_catalog.tables.records.PgStatUserFunctionsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatUserFunctions extends TableImpl<PgStatUserFunctionsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_user_functions</code>
     */
    public static final PgStatUserFunctions PG_STAT_USER_FUNCTIONS = new PgStatUserFunctions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatUserFunctionsRecord> getRecordType() {
        return PgStatUserFunctionsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_user_functions.funcid</code>.
     */
    public final TableField<PgStatUserFunctionsRecord, Long> FUNCID = createField(DSL.name("funcid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_user_functions.schemaname</code>.
     */
    public final TableField<PgStatUserFunctionsRecord, String> SCHEMANAME = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_user_functions.funcname</code>.
     */
    public final TableField<PgStatUserFunctionsRecord, String> FUNCNAME = createField(DSL.name("funcname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_user_functions.calls</code>.
     */
    public final TableField<PgStatUserFunctionsRecord, Long> CALLS = createField(DSL.name("calls"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_user_functions.total_time</code>.
     */
    public final TableField<PgStatUserFunctionsRecord, Double> TOTAL_TIME = createField(DSL.name("total_time"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_user_functions.self_time</code>.
     */
    public final TableField<PgStatUserFunctionsRecord, Double> SELF_TIME = createField(DSL.name("self_time"), SQLDataType.DOUBLE, this, "");

    private PgStatUserFunctions(Name alias, Table<PgStatUserFunctionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatUserFunctions(Name alias, Table<PgStatUserFunctionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"pg_stat_user_functions\" as  SELECT p.oid AS funcid,\n    n.nspname AS schemaname,\n    p.proname AS funcname,\n    pg_stat_get_function_calls(p.oid) AS calls,\n    pg_stat_get_function_total_time(p.oid) AS total_time,\n    pg_stat_get_function_self_time(p.oid) AS self_time\n   FROM (pg_proc p\n     LEFT JOIN pg_namespace n ON ((n.oid = p.pronamespace)))\n  WHERE ((p.prolang <> (12)::oid) AND (pg_stat_get_function_calls(p.oid) IS NOT NULL));"));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_user_functions</code> table
     * reference
     */
    public PgStatUserFunctions(String alias) {
        this(DSL.name(alias), PG_STAT_USER_FUNCTIONS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_user_functions</code> table
     * reference
     */
    public PgStatUserFunctions(Name alias) {
        this(alias, PG_STAT_USER_FUNCTIONS);
    }

    /**
     * Create a <code>pg_catalog.pg_stat_user_functions</code> table reference
     */
    public PgStatUserFunctions() {
        this(DSL.name("pg_stat_user_functions"), null);
    }

    public <O extends Record> PgStatUserFunctions(Table<O> child, ForeignKey<O, PgStatUserFunctionsRecord> key) {
        super(child, key, PG_STAT_USER_FUNCTIONS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStatUserFunctions as(String alias) {
        return new PgStatUserFunctions(DSL.name(alias), this);
    }

    @Override
    public PgStatUserFunctions as(Name alias) {
        return new PgStatUserFunctions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatUserFunctions rename(String name) {
        return new PgStatUserFunctions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatUserFunctions rename(Name name) {
        return new PgStatUserFunctions(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, String, String, Long, Double, Double> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
