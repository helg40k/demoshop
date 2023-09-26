/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.pg_catalog.tables.records;


import com.shop.jooq.db.pg_catalog.tables.PgLsTmpdir;

import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgLsTmpdirRecord extends TableRecordImpl<PgLsTmpdirRecord> implements Record3<String, Long, OffsetDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_ls_tmpdir.name</code>.
     */
    public void setName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ls_tmpdir.name</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_ls_tmpdir.size</code>.
     */
    public void setSize(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ls_tmpdir.size</code>.
     */
    public Long getSize() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_ls_tmpdir.modification</code>.
     */
    public void setModification(OffsetDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_ls_tmpdir.modification</code>.
     */
    public OffsetDateTime getModification() {
        return (OffsetDateTime) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, Long, OffsetDateTime> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<String, Long, OffsetDateTime> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return PgLsTmpdir.PG_LS_TMPDIR.NAME;
    }

    @Override
    public Field<Long> field2() {
        return PgLsTmpdir.PG_LS_TMPDIR.SIZE;
    }

    @Override
    public Field<OffsetDateTime> field3() {
        return PgLsTmpdir.PG_LS_TMPDIR.MODIFICATION;
    }

    @Override
    public String component1() {
        return getName();
    }

    @Override
    public Long component2() {
        return getSize();
    }

    @Override
    public OffsetDateTime component3() {
        return getModification();
    }

    @Override
    public String value1() {
        return getName();
    }

    @Override
    public Long value2() {
        return getSize();
    }

    @Override
    public OffsetDateTime value3() {
        return getModification();
    }

    @Override
    public PgLsTmpdirRecord value1(String value) {
        setName(value);
        return this;
    }

    @Override
    public PgLsTmpdirRecord value2(Long value) {
        setSize(value);
        return this;
    }

    @Override
    public PgLsTmpdirRecord value3(OffsetDateTime value) {
        setModification(value);
        return this;
    }

    @Override
    public PgLsTmpdirRecord values(String value1, Long value2, OffsetDateTime value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgLsTmpdirRecord
     */
    public PgLsTmpdirRecord() {
        super(PgLsTmpdir.PG_LS_TMPDIR);
    }

    /**
     * Create a detached, initialised PgLsTmpdirRecord
     */
    public PgLsTmpdirRecord(String name, Long size, OffsetDateTime modification) {
        super(PgLsTmpdir.PG_LS_TMPDIR);

        setName(name);
        setSize(size);
        setModification(modification);
    }
}
