/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.pg_catalog.tables;


import com.shop.jooq.db.pg_catalog.PgCatalog;
import com.shop.jooq.db.pg_catalog.tables.records.PgLogicalSlotGetChangesRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgLogicalSlotGetChanges extends TableImpl<PgLogicalSlotGetChangesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>pg_catalog.pg_logical_slot_get_changes</code>
     */
    public static final PgLogicalSlotGetChanges PG_LOGICAL_SLOT_GET_CHANGES = new PgLogicalSlotGetChanges();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgLogicalSlotGetChangesRecord> getRecordType() {
        return PgLogicalSlotGetChangesRecord.class;
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
    public final TableField<PgLogicalSlotGetChangesRecord, Object> LSN = createField(DSL.name("lsn"), org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\""), this, "");

    /**
     * The column <code>pg_catalog.pg_logical_slot_get_changes.xid</code>.
     */
    public final TableField<PgLogicalSlotGetChangesRecord, Long> XID = createField(DSL.name("xid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_logical_slot_get_changes.data</code>.
     */
    public final TableField<PgLogicalSlotGetChangesRecord, String> DATA = createField(DSL.name("data"), SQLDataType.CLOB, this, "");

    private PgLogicalSlotGetChanges(Name alias, Table<PgLogicalSlotGetChangesRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.VARCHAR),
            DSL.val(null, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\"")),
            DSL.val(null, SQLDataType.INTEGER),
            DSL.val(null, SQLDataType.CLOB.getArrayDataType())
        });
    }

    private PgLogicalSlotGetChanges(Name alias, Table<PgLogicalSlotGetChangesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.pg_logical_slot_get_changes</code>
     * table reference
     */
    public PgLogicalSlotGetChanges(String alias) {
        this(DSL.name(alias), PG_LOGICAL_SLOT_GET_CHANGES);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_logical_slot_get_changes</code>
     * table reference
     */
    public PgLogicalSlotGetChanges(Name alias) {
        this(alias, PG_LOGICAL_SLOT_GET_CHANGES);
    }

    /**
     * Create a <code>pg_catalog.pg_logical_slot_get_changes</code> table
     * reference
     */
    public PgLogicalSlotGetChanges() {
        this(DSL.name("pg_logical_slot_get_changes"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public PgLogicalSlotGetChanges as(String alias) {
        return new PgLogicalSlotGetChanges(DSL.name(alias), this, parameters);
    }

    @Override
    public PgLogicalSlotGetChanges as(Name alias) {
        return new PgLogicalSlotGetChanges(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgLogicalSlotGetChanges rename(String name) {
        return new PgLogicalSlotGetChanges(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgLogicalSlotGetChanges rename(Name name) {
        return new PgLogicalSlotGetChanges(name, null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Object, Long, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public PgLogicalSlotGetChanges call(
          String slotName
        , Object uptoLsn
        , Integer uptoNchanges
        , String[] options
    ) {
        PgLogicalSlotGetChanges result = new PgLogicalSlotGetChanges(DSL.name("pg_logical_slot_get_changes"), null, new Field[] {
            DSL.val(slotName, SQLDataType.VARCHAR),
            DSL.val(uptoLsn, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_lsn\"")),
            DSL.val(uptoNchanges, SQLDataType.INTEGER),
            DSL.val(options, SQLDataType.CLOB.getArrayDataType())
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public PgLogicalSlotGetChanges call(
          Field<String> slotName
        , Field<Object> uptoLsn
        , Field<Integer> uptoNchanges
        , Field<String[]> options
    ) {
        PgLogicalSlotGetChanges result = new PgLogicalSlotGetChanges(DSL.name("pg_logical_slot_get_changes"), null, new Field[] {
            slotName,
            uptoLsn,
            uptoNchanges,
            options
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
