/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.pg_catalog.routines;


import com.shop.jooq.db.pg_catalog.PgCatalog;

import java.time.LocalDate;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DateLarger extends AbstractRoutine<LocalDate> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.date_larger.RETURN_VALUE</code>.
     */
    public static final Parameter<LocalDate> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.LOCALDATE, false, false);

    /**
     * The parameter <code>pg_catalog.date_larger._1</code>.
     */
    public static final Parameter<LocalDate> _1 = Internal.createParameter("_1", SQLDataType.LOCALDATE, false, true);

    /**
     * The parameter <code>pg_catalog.date_larger._2</code>.
     */
    public static final Parameter<LocalDate> _2 = Internal.createParameter("_2", SQLDataType.LOCALDATE, false, true);

    /**
     * Create a new routine call instance
     */
    public DateLarger() {
        super("date_larger", PgCatalog.PG_CATALOG, SQLDataType.LOCALDATE);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(LocalDate value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__1(Field<LocalDate> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(LocalDate value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__2(Field<LocalDate> field) {
        setField(_2, field);
    }
}
