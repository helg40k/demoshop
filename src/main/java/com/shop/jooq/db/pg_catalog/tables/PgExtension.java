/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.pg_catalog.tables;


import com.shop.jooq.db.pg_catalog.Keys;
import com.shop.jooq.db.pg_catalog.PgCatalog;
import com.shop.jooq.db.pg_catalog.tables.records.PgExtensionRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
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
public class PgExtension extends TableImpl<PgExtensionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_extension</code>
     */
    public static final PgExtension PG_EXTENSION = new PgExtension();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgExtensionRecord> getRecordType() {
        return PgExtensionRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_extension.oid</code>.
     */
    public final TableField<PgExtensionRecord, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_extension.extname</code>.
     */
    public final TableField<PgExtensionRecord, String> EXTNAME = createField(DSL.name("extname"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_extension.extowner</code>.
     */
    public final TableField<PgExtensionRecord, Long> EXTOWNER = createField(DSL.name("extowner"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_extension.extnamespace</code>.
     */
    public final TableField<PgExtensionRecord, Long> EXTNAMESPACE = createField(DSL.name("extnamespace"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_extension.extrelocatable</code>.
     */
    public final TableField<PgExtensionRecord, Boolean> EXTRELOCATABLE = createField(DSL.name("extrelocatable"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_extension.extversion</code>.
     */
    public final TableField<PgExtensionRecord, String> EXTVERSION = createField(DSL.name("extversion"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_extension.extconfig</code>.
     */
    public final TableField<PgExtensionRecord, Long[]> EXTCONFIG = createField(DSL.name("extconfig"), SQLDataType.BIGINT.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_extension.extcondition</code>.
     */
    public final TableField<PgExtensionRecord, String[]> EXTCONDITION = createField(DSL.name("extcondition"), SQLDataType.CLOB.getArrayDataType(), this, "");

    private PgExtension(Name alias, Table<PgExtensionRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgExtension(Name alias, Table<PgExtensionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_extension</code> table reference
     */
    public PgExtension(String alias) {
        this(DSL.name(alias), PG_EXTENSION);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_extension</code> table reference
     */
    public PgExtension(Name alias) {
        this(alias, PG_EXTENSION);
    }

    /**
     * Create a <code>pg_catalog.pg_extension</code> table reference
     */
    public PgExtension() {
        this(DSL.name("pg_extension"), null);
    }

    public <O extends Record> PgExtension(Table<O> child, ForeignKey<O, PgExtensionRecord> key) {
        super(child, key, PG_EXTENSION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<PgExtensionRecord> getPrimaryKey() {
        return Keys.PG_EXTENSION_OID_INDEX;
    }

    @Override
    public List<UniqueKey<PgExtensionRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_EXTENSION_NAME_INDEX);
    }

    @Override
    public PgExtension as(String alias) {
        return new PgExtension(DSL.name(alias), this);
    }

    @Override
    public PgExtension as(Name alias) {
        return new PgExtension(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgExtension rename(String name) {
        return new PgExtension(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgExtension rename(Name name) {
        return new PgExtension(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, String, Long, Long, Boolean, String, Long[], String[]> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
