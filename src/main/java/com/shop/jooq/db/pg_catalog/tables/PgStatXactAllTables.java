/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.pg_catalog.tables;


import com.shop.jooq.db.pg_catalog.PgCatalog;
import com.shop.jooq.db.pg_catalog.tables.records.PgStatXactAllTablesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row11;
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
public class PgStatXactAllTables extends TableImpl<PgStatXactAllTablesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_xact_all_tables</code>
     */
    public static final PgStatXactAllTables PG_STAT_XACT_ALL_TABLES = new PgStatXactAllTables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatXactAllTablesRecord> getRecordType() {
        return PgStatXactAllTablesRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.relid</code>.
     */
    public final TableField<PgStatXactAllTablesRecord, Long> RELID = createField(DSL.name("relid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.schemaname</code>.
     */
    public final TableField<PgStatXactAllTablesRecord, String> SCHEMANAME = createField(DSL.name("schemaname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.relname</code>.
     */
    public final TableField<PgStatXactAllTablesRecord, String> RELNAME = createField(DSL.name("relname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.seq_scan</code>.
     */
    public final TableField<PgStatXactAllTablesRecord, Long> SEQ_SCAN = createField(DSL.name("seq_scan"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.seq_tup_read</code>.
     */
    public final TableField<PgStatXactAllTablesRecord, Long> SEQ_TUP_READ = createField(DSL.name("seq_tup_read"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.idx_scan</code>.
     */
    public final TableField<PgStatXactAllTablesRecord, Long> IDX_SCAN = createField(DSL.name("idx_scan"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.idx_tup_fetch</code>.
     */
    public final TableField<PgStatXactAllTablesRecord, Long> IDX_TUP_FETCH = createField(DSL.name("idx_tup_fetch"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.n_tup_ins</code>.
     */
    public final TableField<PgStatXactAllTablesRecord, Long> N_TUP_INS = createField(DSL.name("n_tup_ins"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.n_tup_upd</code>.
     */
    public final TableField<PgStatXactAllTablesRecord, Long> N_TUP_UPD = createField(DSL.name("n_tup_upd"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.n_tup_del</code>.
     */
    public final TableField<PgStatXactAllTablesRecord, Long> N_TUP_DEL = createField(DSL.name("n_tup_del"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_xact_all_tables.n_tup_hot_upd</code>.
     */
    public final TableField<PgStatXactAllTablesRecord, Long> N_TUP_HOT_UPD = createField(DSL.name("n_tup_hot_upd"), SQLDataType.BIGINT, this, "");

    private PgStatXactAllTables(Name alias, Table<PgStatXactAllTablesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatXactAllTables(Name alias, Table<PgStatXactAllTablesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"pg_stat_xact_all_tables\" as  SELECT c.oid AS relid,\n    n.nspname AS schemaname,\n    c.relname,\n    pg_stat_get_xact_numscans(c.oid) AS seq_scan,\n    pg_stat_get_xact_tuples_returned(c.oid) AS seq_tup_read,\n    (sum(pg_stat_get_xact_numscans(i.indexrelid)))::bigint AS idx_scan,\n    ((sum(pg_stat_get_xact_tuples_fetched(i.indexrelid)))::bigint + pg_stat_get_xact_tuples_fetched(c.oid)) AS idx_tup_fetch,\n    pg_stat_get_xact_tuples_inserted(c.oid) AS n_tup_ins,\n    pg_stat_get_xact_tuples_updated(c.oid) AS n_tup_upd,\n    pg_stat_get_xact_tuples_deleted(c.oid) AS n_tup_del,\n    pg_stat_get_xact_tuples_hot_updated(c.oid) AS n_tup_hot_upd\n   FROM ((pg_class c\n     LEFT JOIN pg_index i ON ((c.oid = i.indrelid)))\n     LEFT JOIN pg_namespace n ON ((n.oid = c.relnamespace)))\n  WHERE (c.relkind = ANY (ARRAY['r'::\"char\", 't'::\"char\", 'm'::\"char\", 'p'::\"char\"]))\n  GROUP BY c.oid, n.nspname, c.relname;"));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_xact_all_tables</code> table
     * reference
     */
    public PgStatXactAllTables(String alias) {
        this(DSL.name(alias), PG_STAT_XACT_ALL_TABLES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_xact_all_tables</code> table
     * reference
     */
    public PgStatXactAllTables(Name alias) {
        this(alias, PG_STAT_XACT_ALL_TABLES);
    }

    /**
     * Create a <code>pg_catalog.pg_stat_xact_all_tables</code> table reference
     */
    public PgStatXactAllTables() {
        this(DSL.name("pg_stat_xact_all_tables"), null);
    }

    public <O extends Record> PgStatXactAllTables(Table<O> child, ForeignKey<O, PgStatXactAllTablesRecord> key) {
        super(child, key, PG_STAT_XACT_ALL_TABLES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStatXactAllTables as(String alias) {
        return new PgStatXactAllTables(DSL.name(alias), this);
    }

    @Override
    public PgStatXactAllTables as(Name alias) {
        return new PgStatXactAllTables(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatXactAllTables rename(String name) {
        return new PgStatXactAllTables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatXactAllTables rename(Name name) {
        return new PgStatXactAllTables(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<Long, String, String, Long, Long, Long, Long, Long, Long, Long, Long> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}
