/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.information_schema.routines;


import com.shop.jooq.db.information_schema.InformationSchema;
import com.shop.jooq.db.pg_catalog.tables.records.PgAttributeRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgTypeRecord;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class _PgTruetypmod extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter
     * <code>information_schema._pg_truetypmod.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>information_schema._pg_truetypmod._1</code>.
     */
    public static final Parameter<PgAttributeRecord> _1 = Internal.createParameter("_1", com.shop.jooq.db.pg_catalog.tables.PgAttribute.PG_ATTRIBUTE.getDataType(), false, true);

    /**
     * The parameter <code>information_schema._pg_truetypmod._2</code>.
     */
    public static final Parameter<PgTypeRecord> _2 = Internal.createParameter("_2", com.shop.jooq.db.pg_catalog.tables.PgType.PG_TYPE.getDataType(), false, true);

    /**
     * Create a new routine call instance
     */
    public _PgTruetypmod() {
        super("_pg_truetypmod", InformationSchema.INFORMATION_SCHEMA, SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(PgAttributeRecord value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__1(Field<PgAttributeRecord> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(PgTypeRecord value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void set__2(Field<PgTypeRecord> field) {
        setField(_2, field);
    }
}
