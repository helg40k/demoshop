/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.pg_catalog.tables.records;


import com.shop.jooq.db.pg_catalog.tables.TsDebug;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TsDebugRecord extends TableRecordImpl<TsDebugRecord> implements Record6<String, String, String, Object[], Object, String[]> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.ts_debug.alias</code>.
     */
    public void setAlias(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.ts_debug.alias</code>.
     */
    public String getAlias() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.ts_debug.description</code>.
     */
    public void setDescription(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.ts_debug.description</code>.
     */
    public String getDescription() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.ts_debug.token</code>.
     */
    public void setToken(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.ts_debug.token</code>.
     */
    public String getToken() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.ts_debug.dictionaries</code>.
     */
    public void setDictionaries(Object[] value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.ts_debug.dictionaries</code>.
     */
    public Object[] getDictionaries() {
        return (Object[]) get(3);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public void setDictionary(Object value) {
        set(4, value);
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public Object getDictionary() {
        return get(4);
    }

    /**
     * Setter for <code>pg_catalog.ts_debug.lexemes</code>.
     */
    public void setLexemes(String[] value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.ts_debug.lexemes</code>.
     */
    public String[] getLexemes() {
        return (String[]) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, String, String, Object[], Object, String[]> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<String, String, String, Object[], Object, String[]> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return TsDebug.TS_DEBUG.ALIAS;
    }

    @Override
    public Field<String> field2() {
        return TsDebug.TS_DEBUG.DESCRIPTION;
    }

    @Override
    public Field<String> field3() {
        return TsDebug.TS_DEBUG.TOKEN;
    }

    @Override
    public Field<Object[]> field4() {
        return TsDebug.TS_DEBUG.DICTIONARIES;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Field<Object> field5() {
        return TsDebug.TS_DEBUG.DICTIONARY;
    }

    @Override
    public Field<String[]> field6() {
        return TsDebug.TS_DEBUG.LEXEMES;
    }

    @Override
    public String component1() {
        return getAlias();
    }

    @Override
    public String component2() {
        return getDescription();
    }

    @Override
    public String component3() {
        return getToken();
    }

    @Override
    public Object[] component4() {
        return getDictionaries();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Object component5() {
        return getDictionary();
    }

    @Override
    public String[] component6() {
        return getLexemes();
    }

    @Override
    public String value1() {
        return getAlias();
    }

    @Override
    public String value2() {
        return getDescription();
    }

    @Override
    public String value3() {
        return getToken();
    }

    @Override
    public Object[] value4() {
        return getDictionaries();
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public Object value5() {
        return getDictionary();
    }

    @Override
    public String[] value6() {
        return getLexemes();
    }

    @Override
    public TsDebugRecord value1(String value) {
        setAlias(value);
        return this;
    }

    @Override
    public TsDebugRecord value2(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public TsDebugRecord value3(String value) {
        setToken(value);
        return this;
    }

    @Override
    public TsDebugRecord value4(Object[] value) {
        setDictionaries(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    @Override
    public TsDebugRecord value5(Object value) {
        setDictionary(value);
        return this;
    }

    @Override
    public TsDebugRecord value6(String[] value) {
        setLexemes(value);
        return this;
    }

    @Override
    public TsDebugRecord values(String value1, String value2, String value3, Object[] value4, Object value5, String[] value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TsDebugRecord
     */
    public TsDebugRecord() {
        super(TsDebug.TS_DEBUG);
    }

    /**
     * Create a detached, initialised TsDebugRecord
     */
    public TsDebugRecord(String alias, String description, String token, Object[] dictionaries, Object dictionary, String[] lexemes) {
        super(TsDebug.TS_DEBUG);

        setAlias(alias);
        setDescription(description);
        setToken(token);
        setDictionaries(dictionaries);
        setDictionary(dictionary);
        setLexemes(lexemes);
    }
}
