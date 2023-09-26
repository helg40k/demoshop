/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.pg_catalog.tables;


import com.shop.jooq.db.pg_catalog.PgCatalog;
import com.shop.jooq.db.pg_catalog.tables.records.PgTimezoneNamesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.types.YearToSecond;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgTimezoneNames extends TableImpl<PgTimezoneNamesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_timezone_names</code>
     */
    public static final PgTimezoneNames PG_TIMEZONE_NAMES = new PgTimezoneNames();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgTimezoneNamesRecord> getRecordType() {
        return PgTimezoneNamesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_timezone_names.name</code>.
     */
    public final TableField<PgTimezoneNamesRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_timezone_names.abbrev</code>.
     */
    public final TableField<PgTimezoneNamesRecord, String> ABBREV = createField(DSL.name("abbrev"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_timezone_names.utc_offset</code>.
     */
    public final TableField<PgTimezoneNamesRecord, YearToSecond> UTC_OFFSET = createField(DSL.name("utc_offset"), SQLDataType.INTERVAL, this, "");

    /**
     * The column <code>pg_catalog.pg_timezone_names.is_dst</code>.
     */
    public final TableField<PgTimezoneNamesRecord, Boolean> IS_DST = createField(DSL.name("is_dst"), SQLDataType.BOOLEAN, this, "");

    private PgTimezoneNames(Name alias, Table<PgTimezoneNamesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgTimezoneNames(Name alias, Table<PgTimezoneNamesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"pg_timezone_names\" as  SELECT pg_timezone_names.name,\n    pg_timezone_names.abbrev,\n    pg_timezone_names.utc_offset,\n    pg_timezone_names.is_dst\n   FROM pg_timezone_names() pg_timezone_names(name, abbrev, utc_offset, is_dst);"));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_timezone_names</code> table
     * reference
     */
    public PgTimezoneNames(String alias) {
        this(DSL.name(alias), PG_TIMEZONE_NAMES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_timezone_names</code> table
     * reference
     */
    public PgTimezoneNames(Name alias) {
        this(alias, PG_TIMEZONE_NAMES);
    }

    /**
     * Create a <code>pg_catalog.pg_timezone_names</code> table reference
     */
    public PgTimezoneNames() {
        this(DSL.name("pg_timezone_names"), null);
    }

    public <O extends Record> PgTimezoneNames(Table<O> child, ForeignKey<O, PgTimezoneNamesRecord> key) {
        super(child, key, PG_TIMEZONE_NAMES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgTimezoneNames as(String alias) {
        return new PgTimezoneNames(DSL.name(alias), this);
    }

    @Override
    public PgTimezoneNames as(Name alias) {
        return new PgTimezoneNames(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTimezoneNames rename(String name) {
        return new PgTimezoneNames(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTimezoneNames rename(Name name) {
        return new PgTimezoneNames(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, YearToSecond, Boolean> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}