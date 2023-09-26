/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.pg_catalog.tables.records;


import com.shop.jooq.db.pg_catalog.tables.PgForeignServer;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgForeignServerRecord extends UpdatableRecordImpl<PgForeignServerRecord> implements Record8<Long, String, Long, Long, String, String, String[], String[]> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_foreign_server.oid</code>.
     */
    public void setOid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_server.oid</code>.
     */
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_server.srvname</code>.
     */
    public void setSrvname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_server.srvname</code>.
     */
    public String getSrvname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_server.srvowner</code>.
     */
    public void setSrvowner(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_server.srvowner</code>.
     */
    public Long getSrvowner() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_server.srvfdw</code>.
     */
    public void setSrvfdw(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_server.srvfdw</code>.
     */
    public Long getSrvfdw() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_server.srvtype</code>.
     */
    public void setSrvtype(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_server.srvtype</code>.
     */
    public String getSrvtype() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_server.srvversion</code>.
     */
    public void setSrvversion(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_server.srvversion</code>.
     */
    public String getSrvversion() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_server.srvacl</code>.
     */
    public void setSrvacl(String[] value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_server.srvacl</code>.
     */
    public String[] getSrvacl() {
        return (String[]) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_foreign_server.srvoptions</code>.
     */
    public void setSrvoptions(String[] value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_foreign_server.srvoptions</code>.
     */
    public String[] getSrvoptions() {
        return (String[]) get(7);
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
    public Row8<Long, String, Long, Long, String, String, String[], String[]> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Long, String, Long, Long, String, String, String[], String[]> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgForeignServer.PG_FOREIGN_SERVER.OID;
    }

    @Override
    public Field<String> field2() {
        return PgForeignServer.PG_FOREIGN_SERVER.SRVNAME;
    }

    @Override
    public Field<Long> field3() {
        return PgForeignServer.PG_FOREIGN_SERVER.SRVOWNER;
    }

    @Override
    public Field<Long> field4() {
        return PgForeignServer.PG_FOREIGN_SERVER.SRVFDW;
    }

    @Override
    public Field<String> field5() {
        return PgForeignServer.PG_FOREIGN_SERVER.SRVTYPE;
    }

    @Override
    public Field<String> field6() {
        return PgForeignServer.PG_FOREIGN_SERVER.SRVVERSION;
    }

    @Override
    public Field<String[]> field7() {
        return PgForeignServer.PG_FOREIGN_SERVER.SRVACL;
    }

    @Override
    public Field<String[]> field8() {
        return PgForeignServer.PG_FOREIGN_SERVER.SRVOPTIONS;
    }

    @Override
    public Long component1() {
        return getOid();
    }

    @Override
    public String component2() {
        return getSrvname();
    }

    @Override
    public Long component3() {
        return getSrvowner();
    }

    @Override
    public Long component4() {
        return getSrvfdw();
    }

    @Override
    public String component5() {
        return getSrvtype();
    }

    @Override
    public String component6() {
        return getSrvversion();
    }

    @Override
    public String[] component7() {
        return getSrvacl();
    }

    @Override
    public String[] component8() {
        return getSrvoptions();
    }

    @Override
    public Long value1() {
        return getOid();
    }

    @Override
    public String value2() {
        return getSrvname();
    }

    @Override
    public Long value3() {
        return getSrvowner();
    }

    @Override
    public Long value4() {
        return getSrvfdw();
    }

    @Override
    public String value5() {
        return getSrvtype();
    }

    @Override
    public String value6() {
        return getSrvversion();
    }

    @Override
    public String[] value7() {
        return getSrvacl();
    }

    @Override
    public String[] value8() {
        return getSrvoptions();
    }

    @Override
    public PgForeignServerRecord value1(Long value) {
        setOid(value);
        return this;
    }

    @Override
    public PgForeignServerRecord value2(String value) {
        setSrvname(value);
        return this;
    }

    @Override
    public PgForeignServerRecord value3(Long value) {
        setSrvowner(value);
        return this;
    }

    @Override
    public PgForeignServerRecord value4(Long value) {
        setSrvfdw(value);
        return this;
    }

    @Override
    public PgForeignServerRecord value5(String value) {
        setSrvtype(value);
        return this;
    }

    @Override
    public PgForeignServerRecord value6(String value) {
        setSrvversion(value);
        return this;
    }

    @Override
    public PgForeignServerRecord value7(String[] value) {
        setSrvacl(value);
        return this;
    }

    @Override
    public PgForeignServerRecord value8(String[] value) {
        setSrvoptions(value);
        return this;
    }

    @Override
    public PgForeignServerRecord values(Long value1, String value2, Long value3, Long value4, String value5, String value6, String[] value7, String[] value8) {
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
     * Create a detached PgForeignServerRecord
     */
    public PgForeignServerRecord() {
        super(PgForeignServer.PG_FOREIGN_SERVER);
    }

    /**
     * Create a detached, initialised PgForeignServerRecord
     */
    public PgForeignServerRecord(Long oid, String srvname, Long srvowner, Long srvfdw, String srvtype, String srvversion, String[] srvacl, String[] srvoptions) {
        super(PgForeignServer.PG_FOREIGN_SERVER);

        setOid(oid);
        setSrvname(srvname);
        setSrvowner(srvowner);
        setSrvfdw(srvfdw);
        setSrvtype(srvtype);
        setSrvversion(srvversion);
        setSrvacl(srvacl);
        setSrvoptions(srvoptions);
    }
}
