/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.pg_catalog.tables.records;


import com.shop.jooq.db.pg_catalog.tables.PgStatDatabaseConflicts;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatDatabaseConflictsRecord extends TableRecordImpl<PgStatDatabaseConflictsRecord> implements Record7<Long, String, Long, Long, Long, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_stat_database_conflicts.datid</code>.
     */
    public void setDatid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_database_conflicts.datid</code>.
     */
    public Long getDatid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_database_conflicts.datname</code>.
     */
    public void setDatname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_database_conflicts.datname</code>.
     */
    public String getDatname() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_database_conflicts.confl_tablespace</code>.
     */
    public void setConflTablespace(Long value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_database_conflicts.confl_tablespace</code>.
     */
    public Long getConflTablespace() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_database_conflicts.confl_lock</code>.
     */
    public void setConflLock(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_database_conflicts.confl_lock</code>.
     */
    public Long getConflLock() {
        return (Long) get(3);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_database_conflicts.confl_snapshot</code>.
     */
    public void setConflSnapshot(Long value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_database_conflicts.confl_snapshot</code>.
     */
    public Long getConflSnapshot() {
        return (Long) get(4);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_database_conflicts.confl_bufferpin</code>.
     */
    public void setConflBufferpin(Long value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_database_conflicts.confl_bufferpin</code>.
     */
    public Long getConflBufferpin() {
        return (Long) get(5);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stat_database_conflicts.confl_deadlock</code>.
     */
    public void setConflDeadlock(Long value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stat_database_conflicts.confl_deadlock</code>.
     */
    public Long getConflDeadlock() {
        return (Long) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, String, Long, Long, Long, Long, Long> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Long, String, Long, Long, Long, Long, Long> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgStatDatabaseConflicts.PG_STAT_DATABASE_CONFLICTS.DATID;
    }

    @Override
    public Field<String> field2() {
        return PgStatDatabaseConflicts.PG_STAT_DATABASE_CONFLICTS.DATNAME;
    }

    @Override
    public Field<Long> field3() {
        return PgStatDatabaseConflicts.PG_STAT_DATABASE_CONFLICTS.CONFL_TABLESPACE;
    }

    @Override
    public Field<Long> field4() {
        return PgStatDatabaseConflicts.PG_STAT_DATABASE_CONFLICTS.CONFL_LOCK;
    }

    @Override
    public Field<Long> field5() {
        return PgStatDatabaseConflicts.PG_STAT_DATABASE_CONFLICTS.CONFL_SNAPSHOT;
    }

    @Override
    public Field<Long> field6() {
        return PgStatDatabaseConflicts.PG_STAT_DATABASE_CONFLICTS.CONFL_BUFFERPIN;
    }

    @Override
    public Field<Long> field7() {
        return PgStatDatabaseConflicts.PG_STAT_DATABASE_CONFLICTS.CONFL_DEADLOCK;
    }

    @Override
    public Long component1() {
        return getDatid();
    }

    @Override
    public String component2() {
        return getDatname();
    }

    @Override
    public Long component3() {
        return getConflTablespace();
    }

    @Override
    public Long component4() {
        return getConflLock();
    }

    @Override
    public Long component5() {
        return getConflSnapshot();
    }

    @Override
    public Long component6() {
        return getConflBufferpin();
    }

    @Override
    public Long component7() {
        return getConflDeadlock();
    }

    @Override
    public Long value1() {
        return getDatid();
    }

    @Override
    public String value2() {
        return getDatname();
    }

    @Override
    public Long value3() {
        return getConflTablespace();
    }

    @Override
    public Long value4() {
        return getConflLock();
    }

    @Override
    public Long value5() {
        return getConflSnapshot();
    }

    @Override
    public Long value6() {
        return getConflBufferpin();
    }

    @Override
    public Long value7() {
        return getConflDeadlock();
    }

    @Override
    public PgStatDatabaseConflictsRecord value1(Long value) {
        setDatid(value);
        return this;
    }

    @Override
    public PgStatDatabaseConflictsRecord value2(String value) {
        setDatname(value);
        return this;
    }

    @Override
    public PgStatDatabaseConflictsRecord value3(Long value) {
        setConflTablespace(value);
        return this;
    }

    @Override
    public PgStatDatabaseConflictsRecord value4(Long value) {
        setConflLock(value);
        return this;
    }

    @Override
    public PgStatDatabaseConflictsRecord value5(Long value) {
        setConflSnapshot(value);
        return this;
    }

    @Override
    public PgStatDatabaseConflictsRecord value6(Long value) {
        setConflBufferpin(value);
        return this;
    }

    @Override
    public PgStatDatabaseConflictsRecord value7(Long value) {
        setConflDeadlock(value);
        return this;
    }

    @Override
    public PgStatDatabaseConflictsRecord values(Long value1, String value2, Long value3, Long value4, Long value5, Long value6, Long value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatDatabaseConflictsRecord
     */
    public PgStatDatabaseConflictsRecord() {
        super(PgStatDatabaseConflicts.PG_STAT_DATABASE_CONFLICTS);
    }

    /**
     * Create a detached, initialised PgStatDatabaseConflictsRecord
     */
    public PgStatDatabaseConflictsRecord(Long datid, String datname, Long conflTablespace, Long conflLock, Long conflSnapshot, Long conflBufferpin, Long conflDeadlock) {
        super(PgStatDatabaseConflicts.PG_STAT_DATABASE_CONFLICTS);

        setDatid(datid);
        setDatname(datname);
        setConflTablespace(conflTablespace);
        setConflLock(conflLock);
        setConflSnapshot(conflSnapshot);
        setConflBufferpin(conflBufferpin);
        setConflDeadlock(conflDeadlock);
    }
}
