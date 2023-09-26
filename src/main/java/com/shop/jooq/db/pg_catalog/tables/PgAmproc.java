/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.pg_catalog.tables;


import com.shop.jooq.db.pg_catalog.Keys;
import com.shop.jooq.db.pg_catalog.PgCatalog;
import com.shop.jooq.db.pg_catalog.tables.records.PgAmprocRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgAmproc extends TableImpl<PgAmprocRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_amproc</code>
     */
    public static final PgAmproc PG_AMPROC = new PgAmproc();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgAmprocRecord> getRecordType() {
        return PgAmprocRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_amproc.oid</code>.
     */
    public final TableField<PgAmprocRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_amproc.amprocfamily</code>.
     */
    public final TableField<PgAmprocRecord, Long> AMPROCFAMILY = createField(DSL.name("amprocfamily"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_amproc.amproclefttype</code>.
     */
    public final TableField<PgAmprocRecord, Long> AMPROCLEFTTYPE = createField(DSL.name("amproclefttype"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_amproc.amprocrighttype</code>.
     */
    public final TableField<PgAmprocRecord, Long> AMPROCRIGHTTYPE = createField(DSL.name("amprocrighttype"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_amproc.amprocnum</code>.
     */
    public final TableField<PgAmprocRecord, Short> AMPROCNUM = createField(DSL.name("amprocnum"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_amproc.amproc</code>.
     */
    public final TableField<PgAmprocRecord, String> AMPROC = createField(DSL.name("amproc"), SQLDataType.VARCHAR.nullable(false), this, "");

    private PgAmproc(Name alias, Table<PgAmprocRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgAmproc(Name alias, Table<PgAmprocRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_amproc</code> table reference
     */
    public PgAmproc(String alias) {
        this(DSL.name(alias), PG_AMPROC);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_amproc</code> table reference
     */
    public PgAmproc(Name alias) {
        this(alias, PG_AMPROC);
    }

    /**
     * Create a <code>pg_catalog.pg_amproc</code> table reference
     */
    public PgAmproc() {
        this(DSL.name("pg_amproc"), null);
    }

    public <O extends Record> PgAmproc(Table<O> child, ForeignKey<O, PgAmprocRecord> key) {
        super(child, key, PG_AMPROC);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<PgAmprocRecord> getPrimaryKey() {
        return Keys.PG_AMPROC_OID_INDEX;
    }

    @Override
    public List<UniqueKey<PgAmprocRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_AMPROC_FAM_PROC_INDEX);
    }

    @Override
    public PgAmproc as(String alias) {
        return new PgAmproc(DSL.name(alias), this);
    }

    @Override
    public PgAmproc as(Name alias) {
        return new PgAmproc(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgAmproc rename(String name) {
        return new PgAmproc(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgAmproc rename(Name name) {
        return new PgAmproc(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, Long, Long, Long, Short, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}
