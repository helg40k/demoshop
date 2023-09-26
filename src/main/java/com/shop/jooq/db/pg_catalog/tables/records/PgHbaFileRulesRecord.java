/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.pg_catalog.tables.records;


import com.shop.jooq.db.pg_catalog.tables.PgHbaFileRules;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgHbaFileRulesRecord extends TableRecordImpl<PgHbaFileRulesRecord> implements Record9<Integer, String, String[], String[], String, String, String, String[], String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_hba_file_rules.line_number</code>.
     */
    public void setLineNumber(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_hba_file_rules.line_number</code>.
     */
    public Integer getLineNumber() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_hba_file_rules.type</code>.
     */
    public void setType(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_hba_file_rules.type</code>.
     */
    public String getType() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_hba_file_rules.database</code>.
     */
    public void setDatabase(String[] value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_hba_file_rules.database</code>.
     */
    public String[] getDatabase() {
        return (String[]) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_hba_file_rules.user_name</code>.
     */
    public void setUserName(String[] value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_hba_file_rules.user_name</code>.
     */
    public String[] getUserName() {
        return (String[]) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_hba_file_rules.address</code>.
     */
    public void setAddress(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_hba_file_rules.address</code>.
     */
    public String getAddress() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_hba_file_rules.netmask</code>.
     */
    public void setNetmask(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_hba_file_rules.netmask</code>.
     */
    public String getNetmask() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_hba_file_rules.auth_method</code>.
     */
    public void setAuthMethod(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_hba_file_rules.auth_method</code>.
     */
    public String getAuthMethod() {
        return (String) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_hba_file_rules.options</code>.
     */
    public void setOptions(String[] value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_hba_file_rules.options</code>.
     */
    public String[] getOptions() {
        return (String[]) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_hba_file_rules.error</code>.
     */
    public void setError(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_hba_file_rules.error</code>.
     */
    public String getError() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Integer, String, String[], String[], String, String, String, String[], String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Integer, String, String[], String[], String, String, String, String[], String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return PgHbaFileRules.PG_HBA_FILE_RULES.LINE_NUMBER;
    }

    @Override
    public Field<String> field2() {
        return PgHbaFileRules.PG_HBA_FILE_RULES.TYPE;
    }

    @Override
    public Field<String[]> field3() {
        return PgHbaFileRules.PG_HBA_FILE_RULES.DATABASE;
    }

    @Override
    public Field<String[]> field4() {
        return PgHbaFileRules.PG_HBA_FILE_RULES.USER_NAME;
    }

    @Override
    public Field<String> field5() {
        return PgHbaFileRules.PG_HBA_FILE_RULES.ADDRESS;
    }

    @Override
    public Field<String> field6() {
        return PgHbaFileRules.PG_HBA_FILE_RULES.NETMASK;
    }

    @Override
    public Field<String> field7() {
        return PgHbaFileRules.PG_HBA_FILE_RULES.AUTH_METHOD;
    }

    @Override
    public Field<String[]> field8() {
        return PgHbaFileRules.PG_HBA_FILE_RULES.OPTIONS;
    }

    @Override
    public Field<String> field9() {
        return PgHbaFileRules.PG_HBA_FILE_RULES.ERROR;
    }

    @Override
    public Integer component1() {
        return getLineNumber();
    }

    @Override
    public String component2() {
        return getType();
    }

    @Override
    public String[] component3() {
        return getDatabase();
    }

    @Override
    public String[] component4() {
        return getUserName();
    }

    @Override
    public String component5() {
        return getAddress();
    }

    @Override
    public String component6() {
        return getNetmask();
    }

    @Override
    public String component7() {
        return getAuthMethod();
    }

    @Override
    public String[] component8() {
        return getOptions();
    }

    @Override
    public String component9() {
        return getError();
    }

    @Override
    public Integer value1() {
        return getLineNumber();
    }

    @Override
    public String value2() {
        return getType();
    }

    @Override
    public String[] value3() {
        return getDatabase();
    }

    @Override
    public String[] value4() {
        return getUserName();
    }

    @Override
    public String value5() {
        return getAddress();
    }

    @Override
    public String value6() {
        return getNetmask();
    }

    @Override
    public String value7() {
        return getAuthMethod();
    }

    @Override
    public String[] value8() {
        return getOptions();
    }

    @Override
    public String value9() {
        return getError();
    }

    @Override
    public PgHbaFileRulesRecord value1(Integer value) {
        setLineNumber(value);
        return this;
    }

    @Override
    public PgHbaFileRulesRecord value2(String value) {
        setType(value);
        return this;
    }

    @Override
    public PgHbaFileRulesRecord value3(String[] value) {
        setDatabase(value);
        return this;
    }

    @Override
    public PgHbaFileRulesRecord value4(String[] value) {
        setUserName(value);
        return this;
    }

    @Override
    public PgHbaFileRulesRecord value5(String value) {
        setAddress(value);
        return this;
    }

    @Override
    public PgHbaFileRulesRecord value6(String value) {
        setNetmask(value);
        return this;
    }

    @Override
    public PgHbaFileRulesRecord value7(String value) {
        setAuthMethod(value);
        return this;
    }

    @Override
    public PgHbaFileRulesRecord value8(String[] value) {
        setOptions(value);
        return this;
    }

    @Override
    public PgHbaFileRulesRecord value9(String value) {
        setError(value);
        return this;
    }

    @Override
    public PgHbaFileRulesRecord values(Integer value1, String value2, String[] value3, String[] value4, String value5, String value6, String value7, String[] value8, String value9) {
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
     * Create a detached PgHbaFileRulesRecord
     */
    public PgHbaFileRulesRecord() {
        super(PgHbaFileRules.PG_HBA_FILE_RULES);
    }

    /**
     * Create a detached, initialised PgHbaFileRulesRecord
     */
    public PgHbaFileRulesRecord(Integer lineNumber, String type, String[] database, String[] userName, String address, String netmask, String authMethod, String[] options, String error) {
        super(PgHbaFileRules.PG_HBA_FILE_RULES);

        setLineNumber(lineNumber);
        setType(type);
        setDatabase(database);
        setUserName(userName);
        setAddress(address);
        setNetmask(netmask);
        setAuthMethod(authMethod);
        setOptions(options);
        setError(error);
    }
}
