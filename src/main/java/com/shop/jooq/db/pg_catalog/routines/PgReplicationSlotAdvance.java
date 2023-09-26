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
public class PgReplicationSlotAdvance extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter
     * <code>pg_catalog.pg_replication_slot_advance.slot_name</code>.
     */
    public static final Parameter<String> SLOT_NAME1 = Internal.createParameter("slot_name", SQLDataType.VARCHAR, false, false);

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public static final Parameter<Object> UPTO_LSN = Internal.createParameter("upto_lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), false, false);

    /**
     * The parameter
     * <code>pg_catalog.pg_replication_slot_advance.slot_name</code>.
     */
    public static final Parameter<String> SLOT_NAME3 = Internal.createParameter("slot_name", SQLDataType.VARCHAR, false, false);

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public static final Parameter<Object> END_LSN = Internal.createParameter("end_lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), false, false);

    /**
     * Create a new routine call instance
     */
    public PgReplicationSlotAdvance() {
        super("pg_replication_slot_advance", PgCatalog.PG_CATALOG);

        addInOutParameter(SLOT_NAME1);
        addInParameter(UPTO_LSN);
        addInOutParameter(SLOT_NAME3);
        addOutParameter(END_LSN);
    }

    /**
     * Set the <code>slot_name</code> parameter IN value to the routine
     */
    public void setSlotName1(String value) {
        setValue(SLOT_NAME1, value);
    }

    /**
     * Set the <code>upto_lsn</code> parameter IN value to the routine
     */
    public void setUptoLsn(Object value) {
        setValue(UPTO_LSN, value);
    }

    /**
     * Get the <code>slot_name</code> parameter OUT value from the routine
     */
    public String getSlotName1() {
        return get(SLOT_NAME1);
    }

    /**
     * Get the <code>slot_name</code> parameter OUT value from the routine
     */
    public String getSlotName3() {
        return get(SLOT_NAME3);
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
    public Object getEndLsn() {
        return get(END_LSN);
    }
}