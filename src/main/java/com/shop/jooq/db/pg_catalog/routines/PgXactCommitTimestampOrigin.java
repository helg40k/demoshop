/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.pg_catalog.routines;


import com.shop.jooq.db.pg_catalog.PgCatalog;

import java.time.OffsetDateTime;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgXactCommitTimestampOrigin extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter
     * <code>pg_catalog.pg_xact_commit_timestamp_origin.xid</code>.
     */
    public static final Parameter<Long> XID = Internal.createParameter("xid", SQLDataType.BIGINT, false, false);

    /**
     * The parameter
     * <code>pg_catalog.pg_xact_commit_timestamp_origin.timestamp</code>.
     */
    public static final Parameter<OffsetDateTime> TIMESTAMP = Internal.createParameter("timestamp", SQLDataType.TIMESTAMPWITHTIMEZONE(6), false, false);

    /**
     * The parameter
     * <code>pg_catalog.pg_xact_commit_timestamp_origin.roident</code>.
     */
    public static final Parameter<Long> ROIDENT = Internal.createParameter("roident", SQLDataType.BIGINT, false, false);

    /**
     * Create a new routine call instance
     */
    public PgXactCommitTimestampOrigin() {
        super("pg_xact_commit_timestamp_origin", PgCatalog.PG_CATALOG);

        addInParameter(XID);
        addOutParameter(TIMESTAMP);
        addOutParameter(ROIDENT);
    }

    /**
     * Set the <code>xid</code> parameter IN value to the routine
     */
    public void setXid(Long value) {
        setValue(XID, value);
    }

    /**
     * Get the <code>timestamp</code> parameter OUT value from the routine
     */
    public OffsetDateTime getTimestamp() {
        return get(TIMESTAMP);
    }

    /**
     * Get the <code>roident</code> parameter OUT value from the routine
     */
    public Long getRoident() {
        return get(ROIDENT);
    }
}
