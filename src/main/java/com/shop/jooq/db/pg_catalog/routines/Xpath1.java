/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.pg_catalog.routines;


import com.shop.jooq.db.pg_catalog.PgCatalog;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.XML;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Xpath1 extends AbstractRoutine<XML[]> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.xpath.RETURN_VALUE</code>.
     */
    public static final Parameter<XML[]> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.XML.getArrayDataType(), false, false);

    /**
     * The parameter <code>pg_catalog.xpath._1</code>.
     */
    public static final Parameter<String> _1 = Internal.createParameter("_1", SQLDataType.CLOB, false, true);

    /**
     * The parameter <code>pg_catalog.xpath._2</code>.
     */
    public static final Parameter<XML> _2 = Internal.createParameter("_2", SQLDataType.XML, false, true);

    /**
     * The parameter <code>pg_catalog.xpath._3</code>.
     */
    public static final Parameter<String[]> _3 = Internal.createParameter("_3", SQLDataType.CLOB.getArrayDataType(), false, true);

    /**
     * Create a new routine call instance
     */
    public Xpath1() {
        super("xpath", PgCatalog.PG_CATALOG, SQLDataType.XML.getArrayDataType());

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
        addInParameter(_3);
        setOverloaded(true);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(String value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__1(Field<String> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(XML value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__2(Field<XML> field) {
        setField(_2, field);
    }

    /**
     * Set the <code>_3</code> parameter IN value to the routine
     */
    public void set__3(String[] value) {
        setValue(_3, value);
    }

    /**
     * Set the <code>_3</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__3(Field<String[]> field) {
        setField(_3, field);
    }
}
