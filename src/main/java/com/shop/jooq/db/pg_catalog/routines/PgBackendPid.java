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
public class PgBackendPid extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>pg_catalog.pg_backend_pid.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public PgBackendPid() {
        super("pg_backend_pid", PgCatalog.PG_CATALOG, SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
    }
}
