/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.information_schema.tables;


import com.shop.jooq.db.information_schema.InformationSchema;
import com.shop.jooq.db.information_schema.tables.records.UdtPrivilegesRecord;

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
public class UdtPrivileges extends TableImpl<UdtPrivilegesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.udt_privileges</code>
     */
    public static final UdtPrivileges UDT_PRIVILEGES = new UdtPrivileges();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UdtPrivilegesRecord> getRecordType() {
        return UdtPrivilegesRecord.class;
    }

    /**
     * The column <code>information_schema.udt_privileges.grantor</code>.
     */
    public final TableField<UdtPrivilegesRecord, String> GRANTOR = createField(DSL.name("grantor"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.udt_privileges.grantee</code>.
     */
    public final TableField<UdtPrivilegesRecord, String> GRANTEE = createField(DSL.name("grantee"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.udt_privileges.udt_catalog</code>.
     */
    public final TableField<UdtPrivilegesRecord, String> UDT_CATALOG = createField(DSL.name("udt_catalog"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.udt_privileges.udt_schema</code>.
     */
    public final TableField<UdtPrivilegesRecord, String> UDT_SCHEMA = createField(DSL.name("udt_schema"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.udt_privileges.udt_name</code>.
     */
    public final TableField<UdtPrivilegesRecord, String> UDT_NAME = createField(DSL.name("udt_name"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.udt_privileges.privilege_type</code>.
     */
    public final TableField<UdtPrivilegesRecord, String> PRIVILEGE_TYPE = createField(DSL.name("privilege_type"), com.shop.jooq.db.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.udt_privileges.is_grantable</code>.
     */
    public final TableField<UdtPrivilegesRecord, String> IS_GRANTABLE = createField(DSL.name("is_grantable"), com.shop.jooq.db.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    private UdtPrivileges(Name alias, Table<UdtPrivilegesRecord> aliased) {
        this(alias, aliased, null);
    }

    private UdtPrivileges(Name alias, Table<UdtPrivilegesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"udt_privileges\" as  SELECT (u_grantor.rolname)::information_schema.sql_identifier AS grantor,\n    (grantee.rolname)::information_schema.sql_identifier AS grantee,\n    (current_database())::information_schema.sql_identifier AS udt_catalog,\n    (n.nspname)::information_schema.sql_identifier AS udt_schema,\n    (t.typname)::information_schema.sql_identifier AS udt_name,\n    ('TYPE USAGE'::character varying)::information_schema.character_data AS privilege_type,\n    (\n        CASE\n            WHEN (pg_has_role(grantee.oid, t.typowner, 'USAGE'::text) OR t.grantable) THEN 'YES'::text\n            ELSE 'NO'::text\n        END)::information_schema.yes_or_no AS is_grantable\n   FROM ( SELECT pg_type.oid,\n            pg_type.typname,\n            pg_type.typnamespace,\n            pg_type.typtype,\n            pg_type.typowner,\n            (aclexplode(COALESCE(pg_type.typacl, acldefault('T'::\"char\", pg_type.typowner)))).grantor AS grantor,\n            (aclexplode(COALESCE(pg_type.typacl, acldefault('T'::\"char\", pg_type.typowner)))).grantee AS grantee,\n            (aclexplode(COALESCE(pg_type.typacl, acldefault('T'::\"char\", pg_type.typowner)))).privilege_type AS privilege_type,\n            (aclexplode(COALESCE(pg_type.typacl, acldefault('T'::\"char\", pg_type.typowner)))).is_grantable AS is_grantable\n           FROM pg_type) t(oid, typname, typnamespace, typtype, typowner, grantor, grantee, prtype, grantable),\n    pg_namespace n,\n    pg_authid u_grantor,\n    ( SELECT pg_authid.oid,\n            pg_authid.rolname\n           FROM pg_authid\n        UNION ALL\n         SELECT (0)::oid AS oid,\n            'PUBLIC'::name) grantee(oid, rolname)\n  WHERE ((t.typnamespace = n.oid) AND (t.typtype = 'c'::\"char\") AND (t.grantee = grantee.oid) AND (t.grantor = u_grantor.oid) AND (t.prtype = 'USAGE'::text) AND (pg_has_role(u_grantor.oid, 'USAGE'::text) OR pg_has_role(grantee.oid, 'USAGE'::text) OR (grantee.rolname = 'PUBLIC'::name)));"));
    }

    /**
     * Create an aliased <code>information_schema.udt_privileges</code> table
     * reference
     */
    public UdtPrivileges(String alias) {
        this(DSL.name(alias), UDT_PRIVILEGES);
    }

    /**
     * Create an aliased <code>information_schema.udt_privileges</code> table
     * reference
     */
    public UdtPrivileges(Name alias) {
        this(alias, UDT_PRIVILEGES);
    }

    /**
     * Create a <code>information_schema.udt_privileges</code> table reference
     */
    public UdtPrivileges() {
        this(DSL.name("udt_privileges"), null);
    }

    public <O extends Record> UdtPrivileges(Table<O> child, ForeignKey<O, UdtPrivilegesRecord> key) {
        super(child, key, UDT_PRIVILEGES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public UdtPrivileges as(String alias) {
        return new UdtPrivileges(DSL.name(alias), this);
    }

    @Override
    public UdtPrivileges as(Name alias) {
        return new UdtPrivileges(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UdtPrivileges rename(String name) {
        return new UdtPrivileges(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UdtPrivileges rename(Name name) {
        return new UdtPrivileges(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
