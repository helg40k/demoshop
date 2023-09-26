/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.pg_catalog.routines;


import com.shop.jooq.db.pg_catalog.PgCatalog;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;



/**
 * @deprecated Unknown data type. If this is a qualified, user-defined type, it
 * may have been excluded from code generation. If this is a built-in type, you
 * can define an explicit {@link org.jooq.Binding} to specify how this type
 * should be handled. Deprecation can be turned off using {@literal
 * <deprecationOnUnknownTypes/>} in your code generator configuration.
 */
@Deprecated
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgBackupStart extends AbstractRoutine<Object> {

    private static final long serialVersionUID = 1L;

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public static final Parameter<Object> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), false, false);

    /**
     * The parameter <code>pg_catalog.pg_backup_start.label</code>.
     */
    public static final Parameter<String> LABEL = Internal.createParameter("label", SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_backup_start.fast</code>.
     */
    public static final Parameter<Boolean> FAST = Internal.createParameter("fast", SQLDataType.BOOLEAN.defaultValue(DSL.field("false", SQLDataType.BOOLEAN)), true, false);

    /**
     * Create a new routine call instance
     */
    public PgBackupStart() {
        super("pg_backup_start", PgCatalog.PG_CATALOG, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""));

        setReturnParameter(RETURN_VALUE);
        addInParameter(LABEL);
        addInParameter(FAST);
    }

    /**
     * Set the <code>label</code> parameter IN value to the routine
     */
    public void setLabel(String value) {
        setValue(LABEL, value);
    }

    /**
     * Set the <code>label</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setLabel(Field<String> field) {
        setField(LABEL, field);
    }

    /**
     * Set the <code>fast</code> parameter IN value to the routine
     */
    public void setFast(Boolean value) {
        setValue(FAST, value);
    }

    /**
     * Set the <code>fast</code> parameter to the function to be used with a
     * {@link org.jooq.Select} statement
     */
    public void setFast(Field<Boolean> field) {
        setField(FAST, field);
    }
}
