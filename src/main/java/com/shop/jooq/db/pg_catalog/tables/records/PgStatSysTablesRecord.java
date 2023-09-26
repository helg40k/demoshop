/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.pg_catalog.tables.records;


import com.shop.jooq.db.pg_catalog.tables.PgStatSysTables;

import java.time.OffsetDateTime;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatSysTablesRecord extends TableRecordImpl<PgStatSysTablesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.relid</code>.
     */
    public void setRelid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.relid</code>.
     */
    public Long getRelid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.schemaname</code>.
     */
    public void setSchemaname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.schemaname</code>.
     */
    public String getSchemaname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.relname</code>.
     */
    public void setRelname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.relname</code>.
     */
    public String getRelname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.seq_scan</code>.
     */
    public void setSeqScan(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.seq_scan</code>.
     */
    public Long getSeqScan() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.seq_tup_read</code>.
     */
    public void setSeqTupRead(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.seq_tup_read</code>.
     */
    public Long getSeqTupRead() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.idx_scan</code>.
     */
    public void setIdxScan(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.idx_scan</code>.
     */
    public Long getIdxScan() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.idx_tup_fetch</code>.
     */
    public void setIdxTupFetch(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.idx_tup_fetch</code>.
     */
    public Long getIdxTupFetch() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.n_tup_ins</code>.
     */
    public void setNTupIns(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.n_tup_ins</code>.
     */
    public Long getNTupIns() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.n_tup_upd</code>.
     */
    public void setNTupUpd(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.n_tup_upd</code>.
     */
    public Long getNTupUpd() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.n_tup_del</code>.
     */
    public void setNTupDel(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.n_tup_del</code>.
     */
    public Long getNTupDel() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.n_tup_hot_upd</code>.
     */
    public void setNTupHotUpd(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.n_tup_hot_upd</code>.
     */
    public Long getNTupHotUpd() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.n_live_tup</code>.
     */
    public void setNLiveTup(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.n_live_tup</code>.
     */
    public Long getNLiveTup() {
        return (Long) get(11);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.n_dead_tup</code>.
     */
    public void setNDeadTup(Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.n_dead_tup</code>.
     */
    public Long getNDeadTup() {
        return (Long) get(12);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_sys_tables.n_mod_since_analyze</code>.
     */
    public void setNModSinceAnalyze(Long value) {
        set(13, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_sys_tables.n_mod_since_analyze</code>.
     */
    public Long getNModSinceAnalyze() {
        return (Long) get(13);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.n_ins_since_vacuum</code>.
     */
    public void setNInsSinceVacuum(Long value) {
        set(14, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.n_ins_since_vacuum</code>.
     */
    public Long getNInsSinceVacuum() {
        return (Long) get(14);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.last_vacuum</code>.
     */
    public void setLastVacuum(OffsetDateTime value) {
        set(15, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.last_vacuum</code>.
     */
    public OffsetDateTime getLastVacuum() {
        return (OffsetDateTime) get(15);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.last_autovacuum</code>.
     */
    public void setLastAutovacuum(OffsetDateTime value) {
        set(16, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.last_autovacuum</code>.
     */
    public OffsetDateTime getLastAutovacuum() {
        return (OffsetDateTime) get(16);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.last_analyze</code>.
     */
    public void setLastAnalyze(OffsetDateTime value) {
        set(17, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.last_analyze</code>.
     */
    public OffsetDateTime getLastAnalyze() {
        return (OffsetDateTime) get(17);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.last_autoanalyze</code>.
     */
    public void setLastAutoanalyze(OffsetDateTime value) {
        set(18, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.last_autoanalyze</code>.
     */
    public OffsetDateTime getLastAutoanalyze() {
        return (OffsetDateTime) get(18);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.vacuum_count</code>.
     */
    public void setVacuumCount(Long value) {
        set(19, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.vacuum_count</code>.
     */
    public Long getVacuumCount() {
        return (Long) get(19);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.autovacuum_count</code>.
     */
    public void setAutovacuumCount(Long value) {
        set(20, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.autovacuum_count</code>.
     */
    public Long getAutovacuumCount() {
        return (Long) get(20);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.analyze_count</code>.
     */
    public void setAnalyzeCount(Long value) {
        set(21, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.analyze_count</code>.
     */
    public Long getAnalyzeCount() {
        return (Long) get(21);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_sys_tables.autoanalyze_count</code>.
     */
    public void setAutoanalyzeCount(Long value) {
        set(22, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_sys_tables.autoanalyze_count</code>.
     */
    public Long getAutoanalyzeCount() {
        return (Long) get(22);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatSysTablesRecord
     */
    public PgStatSysTablesRecord() {
        super(PgStatSysTables.PG_STAT_SYS_TABLES);
    }

    /**
     * Create a detached, initialised PgStatSysTablesRecord
     */
    public PgStatSysTablesRecord(Long relid, String schemaname, String relname, Long seqScan, Long seqTupRead, Long idxScan, Long idxTupFetch, Long nTupIns, Long nTupUpd, Long nTupDel, Long nTupHotUpd, Long nLiveTup, Long nDeadTup, Long nModSinceAnalyze, Long nInsSinceVacuum, OffsetDateTime lastVacuum, OffsetDateTime lastAutovacuum, OffsetDateTime lastAnalyze, OffsetDateTime lastAutoanalyze, Long vacuumCount, Long autovacuumCount, Long analyzeCount, Long autoanalyzeCount) {
        super(PgStatSysTables.PG_STAT_SYS_TABLES);

        setRelid(relid);
        setSchemaname(schemaname);
        setRelname(relname);
        setSeqScan(seqScan);
        setSeqTupRead(seqTupRead);
        setIdxScan(idxScan);
        setIdxTupFetch(idxTupFetch);
        setNTupIns(nTupIns);
        setNTupUpd(nTupUpd);
        setNTupDel(nTupDel);
        setNTupHotUpd(nTupHotUpd);
        setNLiveTup(nLiveTup);
        setNDeadTup(nDeadTup);
        setNModSinceAnalyze(nModSinceAnalyze);
        setNInsSinceVacuum(nInsSinceVacuum);
        setLastVacuum(lastVacuum);
        setLastAutovacuum(lastAutovacuum);
        setLastAnalyze(lastAnalyze);
        setLastAutoanalyze(lastAutoanalyze);
        setVacuumCount(vacuumCount);
        setAutovacuumCount(autovacuumCount);
        setAnalyzeCount(analyzeCount);
        setAutoanalyzeCount(autoanalyzeCount);
    }
}
