/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.pg_catalog.tables;


import com.shop.jooq.db.pg_catalog.PgCatalog;
import com.shop.jooq.db.pg_catalog.tables.records.PgStatDatabaseRecord;

import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
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
public class PgStatDatabase extends TableImpl<PgStatDatabaseRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_database</code>
     */
    public static final PgStatDatabase PG_STAT_DATABASE = new PgStatDatabase();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatDatabaseRecord> getRecordType() {
        return PgStatDatabaseRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_database.datid</code>.
     */
    public final TableField<PgStatDatabaseRecord, Long> DATID = createField(DSL.name("datid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_database.datname</code>.
     */
    public final TableField<PgStatDatabaseRecord, String> DATNAME = createField(DSL.name("datname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_database.numbackends</code>.
     */
    public final TableField<PgStatDatabaseRecord, Integer> NUMBACKENDS = createField(DSL.name("numbackends"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_database.xact_commit</code>.
     */
    public final TableField<PgStatDatabaseRecord, Long> XACT_COMMIT = createField(DSL.name("xact_commit"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_database.xact_rollback</code>.
     */
    public final TableField<PgStatDatabaseRecord, Long> XACT_ROLLBACK = createField(DSL.name("xact_rollback"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_database.blks_read</code>.
     */
    public final TableField<PgStatDatabaseRecord, Long> BLKS_READ = createField(DSL.name("blks_read"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_database.blks_hit</code>.
     */
    public final TableField<PgStatDatabaseRecord, Long> BLKS_HIT = createField(DSL.name("blks_hit"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_database.tup_returned</code>.
     */
    public final TableField<PgStatDatabaseRecord, Long> TUP_RETURNED = createField(DSL.name("tup_returned"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_database.tup_fetched</code>.
     */
    public final TableField<PgStatDatabaseRecord, Long> TUP_FETCHED = createField(DSL.name("tup_fetched"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_database.tup_inserted</code>.
     */
    public final TableField<PgStatDatabaseRecord, Long> TUP_INSERTED = createField(DSL.name("tup_inserted"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_database.tup_updated</code>.
     */
    public final TableField<PgStatDatabaseRecord, Long> TUP_UPDATED = createField(DSL.name("tup_updated"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_database.tup_deleted</code>.
     */
    public final TableField<PgStatDatabaseRecord, Long> TUP_DELETED = createField(DSL.name("tup_deleted"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_database.conflicts</code>.
     */
    public final TableField<PgStatDatabaseRecord, Long> CONFLICTS = createField(DSL.name("conflicts"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_database.temp_files</code>.
     */
    public final TableField<PgStatDatabaseRecord, Long> TEMP_FILES = createField(DSL.name("temp_files"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_database.temp_bytes</code>.
     */
    public final TableField<PgStatDatabaseRecord, Long> TEMP_BYTES = createField(DSL.name("temp_bytes"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_database.deadlocks</code>.
     */
    public final TableField<PgStatDatabaseRecord, Long> DEADLOCKS = createField(DSL.name("deadlocks"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_database.checksum_failures</code>.
     */
    public final TableField<PgStatDatabaseRecord, Long> CHECKSUM_FAILURES = createField(DSL.name("checksum_failures"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_database.checksum_last_failure</code>.
     */
    public final TableField<PgStatDatabaseRecord, OffsetDateTime> CHECKSUM_LAST_FAILURE = createField(DSL.name("checksum_last_failure"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_database.blk_read_time</code>.
     */
    public final TableField<PgStatDatabaseRecord, Double> BLK_READ_TIME = createField(DSL.name("blk_read_time"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_database.blk_write_time</code>.
     */
    public final TableField<PgStatDatabaseRecord, Double> BLK_WRITE_TIME = createField(DSL.name("blk_write_time"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_database.session_time</code>.
     */
    public final TableField<PgStatDatabaseRecord, Double> SESSION_TIME = createField(DSL.name("session_time"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_database.active_time</code>.
     */
    public final TableField<PgStatDatabaseRecord, Double> ACTIVE_TIME = createField(DSL.name("active_time"), SQLDataType.DOUBLE, this, "");

    /**
     * The column
     * <code>pg_catalog.pg_stat_database.idle_in_transaction_time</code>.
     */
    public final TableField<PgStatDatabaseRecord, Double> IDLE_IN_TRANSACTION_TIME = createField(DSL.name("idle_in_transaction_time"), SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_database.sessions</code>.
     */
    public final TableField<PgStatDatabaseRecord, Long> SESSIONS = createField(DSL.name("sessions"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_database.sessions_abandoned</code>.
     */
    public final TableField<PgStatDatabaseRecord, Long> SESSIONS_ABANDONED = createField(DSL.name("sessions_abandoned"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_database.sessions_fatal</code>.
     */
    public final TableField<PgStatDatabaseRecord, Long> SESSIONS_FATAL = createField(DSL.name("sessions_fatal"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_database.sessions_killed</code>.
     */
    public final TableField<PgStatDatabaseRecord, Long> SESSIONS_KILLED = createField(DSL.name("sessions_killed"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_database.stats_reset</code>.
     */
    public final TableField<PgStatDatabaseRecord, OffsetDateTime> STATS_RESET = createField(DSL.name("stats_reset"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    private PgStatDatabase(Name alias, Table<PgStatDatabaseRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatDatabase(Name alias, Table<PgStatDatabaseRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"pg_stat_database\" as  SELECT d.oid AS datid,\n    d.datname,\n        CASE\n            WHEN (d.oid = (0)::oid) THEN 0\n            ELSE pg_stat_get_db_numbackends(d.oid)\n        END AS numbackends,\n    pg_stat_get_db_xact_commit(d.oid) AS xact_commit,\n    pg_stat_get_db_xact_rollback(d.oid) AS xact_rollback,\n    (pg_stat_get_db_blocks_fetched(d.oid) - pg_stat_get_db_blocks_hit(d.oid)) AS blks_read,\n    pg_stat_get_db_blocks_hit(d.oid) AS blks_hit,\n    pg_stat_get_db_tuples_returned(d.oid) AS tup_returned,\n    pg_stat_get_db_tuples_fetched(d.oid) AS tup_fetched,\n    pg_stat_get_db_tuples_inserted(d.oid) AS tup_inserted,\n    pg_stat_get_db_tuples_updated(d.oid) AS tup_updated,\n    pg_stat_get_db_tuples_deleted(d.oid) AS tup_deleted,\n    pg_stat_get_db_conflict_all(d.oid) AS conflicts,\n    pg_stat_get_db_temp_files(d.oid) AS temp_files,\n    pg_stat_get_db_temp_bytes(d.oid) AS temp_bytes,\n    pg_stat_get_db_deadlocks(d.oid) AS deadlocks,\n    pg_stat_get_db_checksum_failures(d.oid) AS checksum_failures,\n    pg_stat_get_db_checksum_last_failure(d.oid) AS checksum_last_failure,\n    pg_stat_get_db_blk_read_time(d.oid) AS blk_read_time,\n    pg_stat_get_db_blk_write_time(d.oid) AS blk_write_time,\n    pg_stat_get_db_session_time(d.oid) AS session_time,\n    pg_stat_get_db_active_time(d.oid) AS active_time,\n    pg_stat_get_db_idle_in_transaction_time(d.oid) AS idle_in_transaction_time,\n    pg_stat_get_db_sessions(d.oid) AS sessions,\n    pg_stat_get_db_sessions_abandoned(d.oid) AS sessions_abandoned,\n    pg_stat_get_db_sessions_fatal(d.oid) AS sessions_fatal,\n    pg_stat_get_db_sessions_killed(d.oid) AS sessions_killed,\n    pg_stat_get_db_stat_reset_time(d.oid) AS stats_reset\n   FROM ( SELECT 0 AS oid,\n            NULL::name AS datname\n        UNION ALL\n         SELECT pg_database.oid,\n            pg_database.datname\n           FROM pg_database) d;"));
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_database</code> table
     * reference
     */
    public PgStatDatabase(String alias) {
        this(DSL.name(alias), PG_STAT_DATABASE);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_database</code> table
     * reference
     */
    public PgStatDatabase(Name alias) {
        this(alias, PG_STAT_DATABASE);
    }

    /**
     * Create a <code>pg_catalog.pg_stat_database</code> table reference
     */
    public PgStatDatabase() {
        this(DSL.name("pg_stat_database"), null);
    }

    public <O extends Record> PgStatDatabase(Table<O> child, ForeignKey<O, PgStatDatabaseRecord> key) {
        super(child, key, PG_STAT_DATABASE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgStatDatabase as(String alias) {
        return new PgStatDatabase(DSL.name(alias), this);
    }

    @Override
    public PgStatDatabase as(Name alias) {
        return new PgStatDatabase(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatDatabase rename(String name) {
        return new PgStatDatabase(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatDatabase rename(Name name) {
        return new PgStatDatabase(name, null);
    }
}