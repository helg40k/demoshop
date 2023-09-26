/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.pg_catalog.tables;


import com.shop.jooq.db.pg_catalog.Keys;
import com.shop.jooq.db.pg_catalog.PgCatalog;
import com.shop.jooq.db.pg_catalog.tables.records.PgTransformRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
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
public class PgTransform extends TableImpl<PgTransformRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_transform</code>
     */
    public static final PgTransform PG_TRANSFORM = new PgTransform();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgTransformRecord> getRecordType() {
        return PgTransformRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_transform.oid</code>.
     */
    public final TableField<PgTransformRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_transform.trftype</code>.
     */
    public final TableField<PgTransformRecord, Long> TRFTYPE = createField(DSL.name("trftype"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_transform.trflang</code>.
     */
    public final TableField<PgTransformRecord, Long> TRFLANG = createField(DSL.name("trflang"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_transform.trffromsql</code>.
     */
    public final TableField<PgTransformRecord, String> TRFFROMSQL = createField(DSL.name("trffromsql"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_transform.trftosql</code>.
     */
    public final TableField<PgTransformRecord, String> TRFTOSQL = createField(DSL.name("trftosql"), SQLDataType.VARCHAR.nullable(false), this, "");

    private PgTransform(Name alias, Table<PgTransformRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgTransform(Name alias, Table<PgTransformRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_transform</code> table reference
     */
    public PgTransform(String alias) {
        this(DSL.name(alias), PG_TRANSFORM);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_transform</code> table reference
     */
    public PgTransform(Name alias) {
        this(alias, PG_TRANSFORM);
    }

    /**
     * Create a <code>pg_catalog.pg_transform</code> table reference
     */
    public PgTransform() {
        this(DSL.name("pg_transform"), null);
    }

    public <O extends Record> PgTransform(Table<O> child, ForeignKey<O, PgTransformRecord> key) {
        super(child, key, PG_TRANSFORM);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<PgTransformRecord> getPrimaryKey() {
        return Keys.PG_TRANSFORM_OID_INDEX;
    }

    @Override
    public List<UniqueKey<PgTransformRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_TRANSFORM_TYPE_LANG_INDEX);
    }

    @Override
    public PgTransform as(String alias) {
        return new PgTransform(DSL.name(alias), this);
    }

    @Override
    public PgTransform as(Name alias) {
        return new PgTransform(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTransform rename(String name) {
        return new PgTransform(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTransform rename(Name name) {
        return new PgTransform(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<Long, Long, Long, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}
