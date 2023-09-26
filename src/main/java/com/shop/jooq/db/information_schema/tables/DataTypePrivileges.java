/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.information_schema.tables;


import com.shop.jooq.db.information_schema.InformationSchema;
import com.shop.jooq.db.information_schema.tables.records.DataTypePrivilegesRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row5;
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
public class DataTypePrivileges extends TableImpl<DataTypePrivilegesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema.data_type_privileges</code>
     */
    public static final DataTypePrivileges DATA_TYPE_PRIVILEGES = new DataTypePrivileges();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DataTypePrivilegesRecord> getRecordType() {
        return DataTypePrivilegesRecord.class;
    }

    /**
     * The column
     * <code>information_schema.data_type_privileges.object_catalog</code>.
     */
    public final TableField<DataTypePrivilegesRecord, String> OBJECT_CATALOG = createField(DSL.name("object_catalog"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.data_type_privileges.object_schema</code>.
     */
    public final TableField<DataTypePrivilegesRecord, String> OBJECT_SCHEMA = createField(DSL.name("object_schema"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.data_type_privileges.object_name</code>.
     */
    public final TableField<DataTypePrivilegesRecord, String> OBJECT_NAME = createField(DSL.name("object_name"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.data_type_privileges.object_type</code>.
     */
    public final TableField<DataTypePrivilegesRecord, String> OBJECT_TYPE = createField(DSL.name("object_type"), com.shop.jooq.db.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.data_type_privileges.dtd_identifier</code>.
     */
    public final TableField<DataTypePrivilegesRecord, String> DTD_IDENTIFIER = createField(DSL.name("dtd_identifier"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private DataTypePrivileges(Name alias, Table<DataTypePrivilegesRecord> aliased) {
        this(alias, aliased, null);
    }

    private DataTypePrivileges(Name alias, Table<DataTypePrivilegesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"data_type_privileges\" as  SELECT (current_database())::information_schema.sql_identifier AS object_catalog,\n    x.objschema AS object_schema,\n    x.objname AS object_name,\n    (x.objtype)::information_schema.character_data AS object_type,\n    x.objdtdid AS dtd_identifier\n   FROM ( SELECT attributes.udt_schema,\n            attributes.udt_name,\n            'USER-DEFINED TYPE'::text AS text,\n            attributes.dtd_identifier\n           FROM information_schema.attributes\n        UNION ALL\n         SELECT columns.table_schema,\n            columns.table_name,\n            'TABLE'::text AS text,\n            columns.dtd_identifier\n           FROM information_schema.columns\n        UNION ALL\n         SELECT domains.domain_schema,\n            domains.domain_name,\n            'DOMAIN'::text AS text,\n            domains.dtd_identifier\n           FROM information_schema.domains\n        UNION ALL\n         SELECT parameters.specific_schema,\n            parameters.specific_name,\n            'ROUTINE'::text AS text,\n            parameters.dtd_identifier\n           FROM information_schema.parameters\n        UNION ALL\n         SELECT routines.specific_schema,\n            routines.specific_name,\n            'ROUTINE'::text AS text,\n            routines.dtd_identifier\n           FROM information_schema.routines) x(objschema, objname, objtype, objdtdid);"));
    }

    /**
     * Create an aliased <code>information_schema.data_type_privileges</code>
     * table reference
     */
    public DataTypePrivileges(String alias) {
        this(DSL.name(alias), DATA_TYPE_PRIVILEGES);
    }

    /**
     * Create an aliased <code>information_schema.data_type_privileges</code>
     * table reference
     */
    public DataTypePrivileges(Name alias) {
        this(alias, DATA_TYPE_PRIVILEGES);
    }

    /**
     * Create a <code>information_schema.data_type_privileges</code> table
     * reference
     */
    public DataTypePrivileges() {
        this(DSL.name("data_type_privileges"), null);
    }

    public <O extends Record> DataTypePrivileges(Table<O> child, ForeignKey<O, DataTypePrivilegesRecord> key) {
        super(child, key, DATA_TYPE_PRIVILEGES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public DataTypePrivileges as(String alias) {
        return new DataTypePrivileges(DSL.name(alias), this);
    }

    @Override
    public DataTypePrivileges as(Name alias) {
        return new DataTypePrivileges(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DataTypePrivileges rename(String name) {
        return new DataTypePrivileges(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DataTypePrivileges rename(Name name) {
        return new DataTypePrivileges(name, null);
    }

    // -------------------------------------------------------------------------
    // Row5 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }
}