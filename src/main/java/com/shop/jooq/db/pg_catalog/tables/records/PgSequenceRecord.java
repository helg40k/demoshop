/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.pg_catalog.tables.records;


import com.shop.jooq.db.pg_catalog.tables.PgSequence;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgSequenceRecord extends UpdatableRecordImpl<PgSequenceRecord> implements Record8<Long, Long, Long, Long, Long, Long, Long, Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_sequence.seqrelid</code>.
     */
    public void setSeqrelid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_sequence.seqrelid</code>.
     */
    public Long getSeqrelid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_sequence.seqtypid</code>.
     */
    public void setSeqtypid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_sequence.seqtypid</code>.
     */
    public Long getSeqtypid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_sequence.seqstart</code>.
     */
    public void setSeqstart(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_sequence.seqstart</code>.
     */
    public Long getSeqstart() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_sequence.seqincrement</code>.
     */
    public void setSeqincrement(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_sequence.seqincrement</code>.
     */
    public Long getSeqincrement() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_sequence.seqmax</code>.
     */
    public void setSeqmax(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_sequence.seqmax</code>.
     */
    public Long getSeqmax() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_sequence.seqmin</code>.
     */
    public void setSeqmin(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_sequence.seqmin</code>.
     */
    public Long getSeqmin() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_sequence.seqcache</code>.
     */
    public void setSeqcache(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_sequence.seqcache</code>.
     */
    public Long getSeqcache() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_sequence.seqcycle</code>.
     */
    public void setSeqcycle(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_sequence.seqcycle</code>.
     */
    public Boolean getSeqcycle() {
        return (Boolean) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, Long, Long, Long, Long, Long, Long, Boolean> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Long, Long, Long, Long, Long, Long, Long, Boolean> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgSequence.PG_SEQUENCE.SEQRELID;
    }

    @Override
    public Field<Long> field2() {
        return PgSequence.PG_SEQUENCE.SEQTYPID;
    }

    @Override
    public Field<Long> field3() {
        return PgSequence.PG_SEQUENCE.SEQSTART;
    }

    @Override
    public Field<Long> field4() {
        return PgSequence.PG_SEQUENCE.SEQINCREMENT;
    }

    @Override
    public Field<Long> field5() {
        return PgSequence.PG_SEQUENCE.SEQMAX;
    }

    @Override
    public Field<Long> field6() {
        return PgSequence.PG_SEQUENCE.SEQMIN;
    }

    @Override
    public Field<Long> field7() {
        return PgSequence.PG_SEQUENCE.SEQCACHE;
    }

    @Override
    public Field<Boolean> field8() {
        return PgSequence.PG_SEQUENCE.SEQCYCLE;
    }

    @Override
    public Long component1() {
        return getSeqrelid();
    }

    @Override
    public Long component2() {
        return getSeqtypid();
    }

    @Override
    public Long component3() {
        return getSeqstart();
    }

    @Override
    public Long component4() {
        return getSeqincrement();
    }

    @Override
    public Long component5() {
        return getSeqmax();
    }

    @Override
    public Long component6() {
        return getSeqmin();
    }

    @Override
    public Long component7() {
        return getSeqcache();
    }

    @Override
    public Boolean component8() {
        return getSeqcycle();
    }

    @Override
    public Long value1() {
        return getSeqrelid();
    }

    @Override
    public Long value2() {
        return getSeqtypid();
    }

    @Override
    public Long value3() {
        return getSeqstart();
    }

    @Override
    public Long value4() {
        return getSeqincrement();
    }

    @Override
    public Long value5() {
        return getSeqmax();
    }

    @Override
    public Long value6() {
        return getSeqmin();
    }

    @Override
    public Long value7() {
        return getSeqcache();
    }

    @Override
    public Boolean value8() {
        return getSeqcycle();
    }

    @Override
    public PgSequenceRecord value1(Long value) {
        setSeqrelid(value);
        return this;
    }

    @Override
    public PgSequenceRecord value2(Long value) {
        setSeqtypid(value);
        return this;
    }

    @Override
    public PgSequenceRecord value3(Long value) {
        setSeqstart(value);
        return this;
    }

    @Override
    public PgSequenceRecord value4(Long value) {
        setSeqincrement(value);
        return this;
    }

    @Override
    public PgSequenceRecord value5(Long value) {
        setSeqmax(value);
        return this;
    }

    @Override
    public PgSequenceRecord value6(Long value) {
        setSeqmin(value);
        return this;
    }

    @Override
    public PgSequenceRecord value7(Long value) {
        setSeqcache(value);
        return this;
    }

    @Override
    public PgSequenceRecord value8(Boolean value) {
        setSeqcycle(value);
        return this;
    }

    @Override
    public PgSequenceRecord values(Long value1, Long value2, Long value3, Long value4, Long value5, Long value6, Long value7, Boolean value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgSequenceRecord
     */
    public PgSequenceRecord() {
        super(PgSequence.PG_SEQUENCE);
    }

    /**
     * Create a detached, initialised PgSequenceRecord
     */
    public PgSequenceRecord(Long seqrelid, Long seqtypid, Long seqstart, Long seqincrement, Long seqmax, Long seqmin, Long seqcache, Boolean seqcycle) {
        super(PgSequence.PG_SEQUENCE);

        setSeqrelid(seqrelid);
        setSeqtypid(seqtypid);
        setSeqstart(seqstart);
        setSeqincrement(seqincrement);
        setSeqmax(seqmax);
        setSeqmin(seqmin);
        setSeqcache(seqcache);
        setSeqcycle(seqcycle);
    }
}
