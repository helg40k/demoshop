/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.information_schema.tables;


import com.shop.jooq.db.information_schema.InformationSchema;
import com.shop.jooq.db.information_schema.tables.records.RoleUdtGrantsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RoleUdtGrants extends TableImpl<RoleUdtGrantsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.role_udt_grants</code>
     */
    public static final RoleUdtGrants ROLE_UDT_GRANTS = new RoleUdtGrants();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoleUdtGrantsRecord> getRecordType() {
        return RoleUdtGrantsRecord.class;
    }

    /**
     * The column <code>information_schema.role_udt_grants.grantor</code>.
     */
    public final TableField<RoleUdtGrantsRecord, String> GRANTOR = createField(DSL.name("grantor"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.role_udt_grants.grantee</code>.
     */
    public final TableField<RoleUdtGrantsRecord, String> GRANTEE = createField(DSL.name("grantee"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.role_udt_grants.udt_catalog</code>.
     */
    public final TableField<RoleUdtGrantsRecord, String> UDT_CATALOG = createField(DSL.name("udt_catalog"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.role_udt_grants.udt_schema</code>.
     */
    public final TableField<RoleUdtGrantsRecord, String> UDT_SCHEMA = createField(DSL.name("udt_schema"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.role_udt_grants.udt_name</code>.
     */
    public final TableField<RoleUdtGrantsRecord, String> UDT_NAME = createField(DSL.name("udt_name"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_udt_grants.privilege_type</code>.
     */
    public final TableField<RoleUdtGrantsRecord, String> PRIVILEGE_TYPE = createField(DSL.name("privilege_type"), com.shop.jooq.db.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.role_udt_grants.is_grantable</code>.
     */
    public final TableField<RoleUdtGrantsRecord, String> IS_GRANTABLE = createField(DSL.name("is_grantable"), com.shop.jooq.db.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    private RoleUdtGrants(Name alias, Table<RoleUdtGrantsRecord> aliased) {
        this(alias, aliased, null);
    }

    private RoleUdtGrants(Name alias, Table<RoleUdtGrantsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"role_udt_grants\" as  SELECT udt_privileges.grantor,\n    udt_privileges.grantee,\n    udt_privileges.udt_catalog,\n    udt_privileges.udt_schema,\n    udt_privileges.udt_name,\n    udt_privileges.privilege_type,\n    udt_privileges.is_grantable\n   FROM information_schema.udt_privileges\n  WHERE (((udt_privileges.grantor)::name IN ( SELECT enabled_roles.role_name\n           FROM information_schema.enabled_roles)) OR ((udt_privileges.grantee)::name IN ( SELECT enabled_roles.role_name\n           FROM information_schema.enabled_roles)));"));
    }

    /**
     * Create an aliased <code>information_schema.role_udt_grants</code> table
     * reference
     */
    public RoleUdtGrants(String alias) {
        this(DSL.name(alias), ROLE_UDT_GRANTS);
    }

    /**
     * Create an aliased <code>information_schema.role_udt_grants</code> table
     * reference
     */
    public RoleUdtGrants(Name alias) {
        this(alias, ROLE_UDT_GRANTS);
    }

    /**
     * Create a <code>information_schema.role_udt_grants</code> table reference
     */
    public RoleUdtGrants() {
        this(DSL.name("role_udt_grants"), null);
    }

    public <O extends Record> RoleUdtGrants(Table<O> child, ForeignKey<O, RoleUdtGrantsRecord> key) {
        super(child, key, ROLE_UDT_GRANTS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public RoleUdtGrants as(String alias) {
        return new RoleUdtGrants(DSL.name(alias), this);
    }

    @Override
    public RoleUdtGrants as(Name alias) {
        return new RoleUdtGrants(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleUdtGrants rename(String name) {
        return new RoleUdtGrants(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleUdtGrants rename(Name name) {
        return new RoleUdtGrants(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}