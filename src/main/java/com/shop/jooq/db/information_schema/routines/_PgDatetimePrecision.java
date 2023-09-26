/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.information_schema.routines;


import com.shop.jooq.db.information_schema.InformationSchema;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class _PgDatetimePrecision extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter
     * <code>information_schema._pg_datetime_precision.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.INTEGER, false, false);

    /**
     * The parameter
     * <code>information_schema._pg_datetime_precision.typid</code>.
     */
    public static final Parameter<Long> TYPID = Internal.createParameter("typid", SQLDataType.BIGINT, false, false);

    /**
     * The parameter
     * <code>information_schema._pg_datetime_precision.typmod</code>.
     */
    public static final Parameter<Integer> TYPMOD = Internal.createParameter("typmod", SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public _PgDatetimePrecision() {
        super("_pg_datetime_precision", InformationSchema.INFORMATION_SCHEMA, SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(TYPID);
        addInParameter(TYPMOD);
    }

    /**
     * Set the <code>typid</code> parameter IN value to the routine
     */
    public void setTypid(Long value) {
        setValue(TYPID, value);
    }

    /**
     * Set the <code>typid</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setTypid(Field<Long> field) {
        setField(TYPID, field);
    }

    /**
     * Set the <code>typmod</code> parameter IN value to the routine
     */
    public void setTypmod(Integer value) {
        setValue(TYPMOD, value);
    }

    /**
     * Set the <code>typmod</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setTypmod(Field<Integer> field) {
        setField(TYPMOD, field);
    }
}
