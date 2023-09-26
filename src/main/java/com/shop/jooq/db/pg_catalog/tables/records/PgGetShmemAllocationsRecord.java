/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.pg_catalog.tables.records;


import com.shop.jooq.db.pg_catalog.tables.PgGetShmemAllocations;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgGetShmemAllocationsRecord extends TableRecordImpl<PgGetShmemAllocationsRecord> implements Record4<String, Long, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_get_shmem_allocations.name</code>.
     */
    public void setName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_shmem_allocations.name</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_shmem_allocations.off</code>.
     */
    public void setOff(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_shmem_allocations.off</code>.
     */
    public Long getOff() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_get_shmem_allocations.size</code>.
     */
    public void setSize(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_get_shmem_allocations.size</code>.
     */
    public Long getSize() {
        return (Long) get(2);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_get_shmem_allocations.allocated_size</code>.
     */
    public void setAllocatedSize(Long value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_get_shmem_allocations.allocated_size</code>.
     */
    public Long getAllocatedSize() {
        return (Long) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, Long, Long, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, Long, Long, Long> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return PgGetShmemAllocations.PG_GET_SHMEM_ALLOCATIONS.NAME;
    }

    @Override
    public Field<Long> field2() {
        return PgGetShmemAllocations.PG_GET_SHMEM_ALLOCATIONS.OFF;
    }

    @Override
    public Field<Long> field3() {
        return PgGetShmemAllocations.PG_GET_SHMEM_ALLOCATIONS.SIZE;
    }

    @Override
    public Field<Long> field4() {
        return PgGetShmemAllocations.PG_GET_SHMEM_ALLOCATIONS.ALLOCATED_SIZE;
    }

    @Override
    public String component1() {
        return getName();
    }

    @Override
    public Long component2() {
        return getOff();
    }

    @Override
    public Long component3() {
        return getSize();
    }

    @Override
    public Long component4() {
        return getAllocatedSize();
    }

    @Override
    public String value1() {
        return getName();
    }

    @Override
    public Long value2() {
        return getOff();
    }

    @Override
    public Long value3() {
        return getSize();
    }

    @Override
    public Long value4() {
        return getAllocatedSize();
    }

    @Override
    public PgGetShmemAllocationsRecord value1(String value) {
        setName(value);
        return this;
    }

    @Override
    public PgGetShmemAllocationsRecord value2(Long value) {
        setOff(value);
        return this;
    }

    @Override
    public PgGetShmemAllocationsRecord value3(Long value) {
        setSize(value);
        return this;
    }

    @Override
    public PgGetShmemAllocationsRecord value4(Long value) {
        setAllocatedSize(value);
        return this;
    }

    @Override
    public PgGetShmemAllocationsRecord values(String value1, Long value2, Long value3, Long value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgGetShmemAllocationsRecord
     */
    public PgGetShmemAllocationsRecord() {
        super(PgGetShmemAllocations.PG_GET_SHMEM_ALLOCATIONS);
    }

    /**
     * Create a detached, initialised PgGetShmemAllocationsRecord
     */
    public PgGetShmemAllocationsRecord(String name, Long off, Long size, Long allocatedSize) {
        super(PgGetShmemAllocations.PG_GET_SHMEM_ALLOCATIONS);

        setName(name);
        setOff(off);
        setSize(size);
        setAllocatedSize(allocatedSize);
    }
}
