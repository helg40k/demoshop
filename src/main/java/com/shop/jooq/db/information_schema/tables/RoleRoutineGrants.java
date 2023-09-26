/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.information_schema.tables;


import com.shop.jooq.db.information_schema.InformationSchema;
import com.shop.jooq.db.information_schema.tables.records.RoleRoutineGrantsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
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
public class RoleRoutineGrants extends TableImpl<RoleRoutineGrantsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.role_routine_grants</code>
     */
    public static final RoleRoutineGrants ROLE_ROUTINE_GRANTS = new RoleRoutineGrants();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoleRoutineGrantsRecord> getRecordType() {
        return RoleRoutineGrantsRecord.class;
    }

    /**
     * The column <code>information_schema.role_routine_grants.grantor</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> GRANTOR = createField(DSL.name("grantor"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.role_routine_grants.grantee</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> GRANTEE = createField(DSL.name("grantee"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_routine_grants.specific_catalog</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> SPECIFIC_CATALOG = createField(DSL.name("specific_catalog"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_routine_grants.specific_schema</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> SPECIFIC_SCHEMA = createField(DSL.name("specific_schema"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_routine_grants.specific_name</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> SPECIFIC_NAME = createField(DSL.name("specific_name"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_routine_grants.routine_catalog</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> ROUTINE_CATALOG = createField(DSL.name("routine_catalog"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_routine_grants.routine_schema</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> ROUTINE_SCHEMA = createField(DSL.name("routine_schema"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_routine_grants.routine_name</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> ROUTINE_NAME = createField(DSL.name("routine_name"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_routine_grants.privilege_type</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> PRIVILEGE_TYPE = createField(DSL.name("privilege_type"), com.shop.jooq.db.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.role_routine_grants.is_grantable</code>.
     */
    public final TableField<RoleRoutineGrantsRecord, String> IS_GRANTABLE = createField(DSL.name("is_grantable"), com.shop.jooq.db.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    private RoleRoutineGrants(Name alias, Table<RoleRoutineGrantsRecord> aliased) {
        this(alias, aliased, null);
    }

    private RoleRoutineGrants(Name alias, Table<RoleRoutineGrantsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"role_routine_grants\" as  SELECT routine_privileges.grantor,\n    routine_privileges.grantee,\n    routine_privileges.specific_catalog,\n    routine_privileges.specific_schema,\n    routine_privileges.specific_name,\n    routine_privileges.routine_catalog,\n    routine_privileges.routine_schema,\n    routine_privileges.routine_name,\n    routine_privileges.privilege_type,\n    routine_privileges.is_grantable\n   FROM information_schema.routine_privileges\n  WHERE (((routine_privileges.grantor)::name IN ( SELECT enabled_roles.role_name\n           FROM information_schema.enabled_roles)) OR ((routine_privileges.grantee)::name IN ( SELECT enabled_roles.role_name\n           FROM information_schema.enabled_roles)));"));
    }

    /**
     * Create an aliased <code>information_schema.role_routine_grants</code>
     * table reference
     */
    public RoleRoutineGrants(String alias) {
        this(DSL.name(alias), ROLE_ROUTINE_GRANTS);
    }

    /**
     * Create an aliased <code>information_schema.role_routine_grants</code>
     * table reference
     */
    public RoleRoutineGrants(Name alias) {
        this(alias, ROLE_ROUTINE_GRANTS);
    }

    /**
     * Create a <code>information_schema.role_routine_grants</code> table
     * reference
     */
    public RoleRoutineGrants() {
        this(DSL.name("role_routine_grants"), null);
    }

    public <O extends Record> RoleRoutineGrants(Table<O> child, ForeignKey<O, RoleRoutineGrantsRecord> key) {
        super(child, key, ROLE_ROUTINE_GRANTS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public RoleRoutineGrants as(String alias) {
        return new RoleRoutineGrants(DSL.name(alias), this);
    }

    @Override
    public RoleRoutineGrants as(Name alias) {
        return new RoleRoutineGrants(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleRoutineGrants rename(String name) {
        return new RoleRoutineGrants(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RoleRoutineGrants rename(Name name) {
        return new RoleRoutineGrants(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<String, String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}