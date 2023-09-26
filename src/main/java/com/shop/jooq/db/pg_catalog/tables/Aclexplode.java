/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.pg_catalog.tables;


import com.shop.jooq.db.pg_catalog.PgCatalog;
import com.shop.jooq.db.pg_catalog.tables.records.AclexplodeRecord;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Row4;
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
public class Aclexplode extends TableImpl<AclexplodeRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.aclexplode</code>
     */
    public static final Aclexplode ACLEXPLODE = new Aclexplode();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AclexplodeRecord> getRecordType() {
        return AclexplodeRecord.class;
    }

    /**
     * The column <code>pg_catalog.aclexplode.grantor</code>.
     */
    public final TableField<AclexplodeRecord, Long> GRANTOR = createField(DSL.name("grantor"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.aclexplode.grantee</code>.
     */
    public final TableField<AclexplodeRecord, Long> GRANTEE = createField(DSL.name("grantee"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.aclexplode.privilege_type</code>.
     */
    public final TableField<AclexplodeRecord, String> PRIVILEGE_TYPE = createField(DSL.name("privilege_type"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.aclexplode.is_grantable</code>.
     */
    public final TableField<AclexplodeRecord, Boolean> IS_GRANTABLE = createField(DSL.name("is_grantable"), SQLDataType.BOOLEAN, this, "");

    private Aclexplode(Name alias, Table<AclexplodeRecord> aliased) {
        this(alias, aliased, new Field[] {
            DSL.val(null, SQLDataType.VARCHAR.getArrayDataType())
        });
    }

    private Aclexplode(Name alias, Table<AclexplodeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.function());
    }

    /**
     * Create an aliased <code>pg_catalog.aclexplode</code> table reference
     */
    public Aclexplode(String alias) {
        this(DSL.name(alias), ACLEXPLODE);
    }

    /**
     * Create an aliased <code>pg_catalog.aclexplode</code> table reference
     */
    public Aclexplode(Name alias) {
        this(alias, ACLEXPLODE);
    }

    /**
     * Create a <code>pg_catalog.aclexplode</code> table reference
     */
    public Aclexplode() {
        this(DSL.name("aclexplode"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public Aclexplode as(String alias) {
        return new Aclexplode(DSL.name(alias), this, parameters);
    }

    @Override
    public Aclexplode as(Name alias) {
        return new Aclexplode(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public Aclexplode rename(String name) {
        return new Aclexplode(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public Aclexplode rename(Name name) {
        return new Aclexplode(name, null, parameters);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, Long, String, Boolean> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * Call this table-valued function
     */
    public Aclexplode call(
          String[] acl
    ) {
        Aclexplode result = new Aclexplode(DSL.name("aclexplode"), null, new Field[] {
            DSL.val(acl, SQLDataType.VARCHAR.getArrayDataType())
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }

    /**
     * Call this table-valued function
     */
    public Aclexplode call(
          Field<String[]> acl
    ) {
        Aclexplode result = new Aclexplode(DSL.name("aclexplode"), null, new Field[] {
            acl
        });

        return aliased() ? result.as(getUnqualifiedName()) : result;
    }
}
