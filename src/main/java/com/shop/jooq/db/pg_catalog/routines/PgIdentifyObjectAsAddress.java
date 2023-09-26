/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.pg_catalog.routines;


import com.shop.jooq.db.pg_catalog.PgCatalog;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgIdentifyObjectAsAddress extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter
     * <code>pg_catalog.pg_identify_object_as_address.classid</code>.
     */
    public static final Parameter<Long> CLASSID = Internal.createParameter("classid", SQLDataType.BIGINT, false, false);

    /**
     * The parameter
     * <code>pg_catalog.pg_identify_object_as_address.objid</code>.
     */
    public static final Parameter<Long> OBJID = Internal.createParameter("objid", SQLDataType.BIGINT, false, false);

    /**
     * The parameter
     * <code>pg_catalog.pg_identify_object_as_address.objsubid</code>.
     */
    public static final Parameter<Integer> OBJSUBID = Internal.createParameter("objsubid", SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.pg_identify_object_as_address.type</code>.
     */
    public static final Parameter<String> TYPE = Internal.createParameter("type", SQLDataType.CLOB, false, false);

    /**
     * The parameter
     * <code>pg_catalog.pg_identify_object_as_address.object_names</code>.
     */
    public static final Parameter<String[]> OBJECT_NAMES = Internal.createParameter("object_names", SQLDataType.CLOB.getArrayDataType(), false, false);

    /**
     * The parameter
     * <code>pg_catalog.pg_identify_object_as_address.object_args</code>.
     */
    public static final Parameter<String[]> OBJECT_ARGS = Internal.createParameter("object_args", SQLDataType.CLOB.getArrayDataType(), false, false);

    /**
     * Create a new routine call instance
     */
    public PgIdentifyObjectAsAddress() {
        super("pg_identify_object_as_address", PgCatalog.PG_CATALOG);

        addInParameter(CLASSID);
        addInParameter(OBJID);
        addInParameter(OBJSUBID);
        addOutParameter(TYPE);
        addOutParameter(OBJECT_NAMES);
        addOutParameter(OBJECT_ARGS);
    }

    /**
     * Set the <code>classid</code> parameter IN value to the routine
     */
    public void setClassid(Long value) {
        setValue(CLASSID, value);
    }

    /**
     * Set the <code>objid</code> parameter IN value to the routine
     */
    public void setObjid(Long value) {
        setValue(OBJID, value);
    }

    /**
     * Set the <code>objsubid</code> parameter IN value to the routine
     */
    public void setObjsubid(Integer value) {
        setValue(OBJSUBID, value);
    }

    /**
     * Get the <code>type</code> parameter OUT value from the routine
     */
    public String getType() {
        return get(TYPE);
    }

    /**
     * Get the <code>object_names</code> parameter OUT value from the routine
     */
    public String[] getObjectNames() {
        return get(OBJECT_NAMES);
    }

    /**
     * Get the <code>object_args</code> parameter OUT value from the routine
     */
    public String[] getObjectArgs() {
        return get(OBJECT_ARGS);
    }
}
