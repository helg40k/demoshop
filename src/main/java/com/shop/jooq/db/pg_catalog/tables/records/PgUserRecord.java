/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.pg_catalog.tables.records;


import com.shop.jooq.db.pg_catalog.tables.PgUser;

import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgUserRecord extends TableRecordImpl<PgUserRecord> implements Record9<String, Long, Boolean, Boolean, Boolean, Boolean, String, OffsetDateTime, String[]> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_user.usename</code>.
     */
    public void setUsename(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_user.usename</code>.
     */
    public String getUsename() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_user.usesysid</code>.
     */
    public void setUsesysid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_user.usesysid</code>.
     */
    public Long getUsesysid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_user.usecreatedb</code>.
     */
    public void setUsecreatedb(Boolean value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_user.usecreatedb</code>.
     */
    public Boolean getUsecreatedb() {
        return (Boolean) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_user.usesuper</code>.
     */
    public void setUsesuper(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_user.usesuper</code>.
     */
    public Boolean getUsesuper() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_user.userepl</code>.
     */
    public void setUserepl(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_user.userepl</code>.
     */
    public Boolean getUserepl() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_user.usebypassrls</code>.
     */
    public void setUsebypassrls(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_user.usebypassrls</code>.
     */
    public Boolean getUsebypassrls() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_user.passwd</code>.
     */
    public void setPasswd(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_user.passwd</code>.
     */
    public String getPasswd() {
        return (String) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_user.valuntil</code>.
     */
    public void setValuntil(OffsetDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_user.valuntil</code>.
     */
    public OffsetDateTime getValuntil() {
        return (OffsetDateTime) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_user.useconfig</code>.
     */
    public void setUseconfig(String[] value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_user.useconfig</code>.
     */
    public String[] getUseconfig() {
        return (String[]) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<String, Long, Boolean, Boolean, Boolean, Boolean, String, OffsetDateTime, String[]> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<String, Long, Boolean, Boolean, Boolean, Boolean, String, OffsetDateTime, String[]> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return PgUser.PG_USER.USENAME;
    }

    @Override
    public Field<Long> field2() {
        return PgUser.PG_USER.USESYSID;
    }

    @Override
    public Field<Boolean> field3() {
        return PgUser.PG_USER.USECREATEDB;
    }

    @Override
    public Field<Boolean> field4() {
        return PgUser.PG_USER.USESUPER;
    }

    @Override
    public Field<Boolean> field5() {
        return PgUser.PG_USER.USEREPL;
    }

    @Override
    public Field<Boolean> field6() {
        return PgUser.PG_USER.USEBYPASSRLS;
    }

    @Override
    public Field<String> field7() {
        return PgUser.PG_USER.PASSWD;
    }

    @Override
    public Field<OffsetDateTime> field8() {
        return PgUser.PG_USER.VALUNTIL;
    }

    @Override
    public Field<String[]> field9() {
        return PgUser.PG_USER.USECONFIG;
    }

    @Override
    public String component1() {
        return getUsename();
    }

    @Override
    public Long component2() {
        return getUsesysid();
    }

    @Override
    public Boolean component3() {
        return getUsecreatedb();
    }

    @Override
    public Boolean component4() {
        return getUsesuper();
    }

    @Override
    public Boolean component5() {
        return getUserepl();
    }

    @Override
    public Boolean component6() {
        return getUsebypassrls();
    }

    @Override
    public String component7() {
        return getPasswd();
    }

    @Override
    public OffsetDateTime component8() {
        return getValuntil();
    }

    @Override
    public String[] component9() {
        return getUseconfig();
    }

    @Override
    public String value1() {
        return getUsename();
    }

    @Override
    public Long value2() {
        return getUsesysid();
    }

    @Override
    public Boolean value3() {
        return getUsecreatedb();
    }

    @Override
    public Boolean value4() {
        return getUsesuper();
    }

    @Override
    public Boolean value5() {
        return getUserepl();
    }

    @Override
    public Boolean value6() {
        return getUsebypassrls();
    }

    @Override
    public String value7() {
        return getPasswd();
    }

    @Override
    public OffsetDateTime value8() {
        return getValuntil();
    }

    @Override
    public String[] value9() {
        return getUseconfig();
    }

    @Override
    public PgUserRecord value1(String value) {
        setUsename(value);
        return this;
    }

    @Override
    public PgUserRecord value2(Long value) {
        setUsesysid(value);
        return this;
    }

    @Override
    public PgUserRecord value3(Boolean value) {
        setUsecreatedb(value);
        return this;
    }

    @Override
    public PgUserRecord value4(Boolean value) {
        setUsesuper(value);
        return this;
    }

    @Override
    public PgUserRecord value5(Boolean value) {
        setUserepl(value);
        return this;
    }

    @Override
    public PgUserRecord value6(Boolean value) {
        setUsebypassrls(value);
        return this;
    }

    @Override
    public PgUserRecord value7(String value) {
        setPasswd(value);
        return this;
    }

    @Override
    public PgUserRecord value8(OffsetDateTime value) {
        setValuntil(value);
        return this;
    }

    @Override
    public PgUserRecord value9(String[] value) {
        setUseconfig(value);
        return this;
    }

    @Override
    public PgUserRecord values(String value1, Long value2, Boolean value3, Boolean value4, Boolean value5, Boolean value6, String value7, OffsetDateTime value8, String[] value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgUserRecord
     */
    public PgUserRecord() {
        super(PgUser.PG_USER);
    }

    /**
     * Create a detached, initialised PgUserRecord
     */
    public PgUserRecord(String usename, Long usesysid, Boolean usecreatedb, Boolean usesuper, Boolean userepl, Boolean usebypassrls, String passwd, OffsetDateTime valuntil, String[] useconfig) {
        super(PgUser.PG_USER);

        setUsename(usename);
        setUsesysid(usesysid);
        setUsecreatedb(usecreatedb);
        setUsesuper(usesuper);
        setUserepl(userepl);
        setUsebypassrls(usebypassrls);
        setPasswd(passwd);
        setValuntil(valuntil);
        setUseconfig(useconfig);
    }
}
