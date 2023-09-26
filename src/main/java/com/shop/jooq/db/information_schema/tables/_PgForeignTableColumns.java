/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.information_schema.tables;


import com.shop.jooq.db.information_schema.InformationSchema;
import com.shop.jooq.db.information_schema.tables.records._PgForeignTableColumnsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
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
public class _PgForeignTableColumns extends TableImpl<_PgForeignTableColumnsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>information_schema._pg_foreign_table_columns</code>
     */
    public static final _PgForeignTableColumns _PG_FOREIGN_TABLE_COLUMNS = new _PgForeignTableColumns();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<_PgForeignTableColumnsRecord> getRecordType() {
        return _PgForeignTableColumnsRecord.class;
    }

    /**
     * The column
     * <code>information_schema._pg_foreign_table_columns.nspname</code>.
     */
    public final TableField<_PgForeignTableColumnsRecord, String> NSPNAME = createField(DSL.name("nspname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_table_columns.relname</code>.
     */
    public final TableField<_PgForeignTableColumnsRecord, String> RELNAME = createField(DSL.name("relname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_table_columns.attname</code>.
     */
    public final TableField<_PgForeignTableColumnsRecord, String> ATTNAME = createField(DSL.name("attname"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>information_schema._pg_foreign_table_columns.attfdwoptions</code>.
     */
    public final TableField<_PgForeignTableColumnsRecord, String[]> ATTFDWOPTIONS = createField(DSL.name("attfdwoptions"), SQLDataType.CLOB.getArrayDataType(), this, "");

    private _PgForeignTableColumns(Name alias, Table<_PgForeignTableColumnsRecord> aliased) {
        this(alias, aliased, null);
    }

    private _PgForeignTableColumns(Name alias, Table<_PgForeignTableColumnsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"_pg_foreign_table_columns\" as  SELECT n.nspname,\n    c.relname,\n    a.attname,\n    a.attfdwoptions\n   FROM pg_foreign_table t,\n    pg_authid u,\n    pg_namespace n,\n    pg_class c,\n    pg_attribute a\n  WHERE ((u.oid = c.relowner) AND (pg_has_role(c.relowner, 'USAGE'::text) OR has_column_privilege(c.oid, a.attnum, 'SELECT, INSERT, UPDATE, REFERENCES'::text)) AND (n.oid = c.relnamespace) AND (c.oid = t.ftrelid) AND (c.relkind = 'f'::\"char\") AND (a.attrelid = c.oid) AND (a.attnum > 0));"));
    }

    /**
     * Create an aliased
     * <code>information_schema._pg_foreign_table_columns</code> table reference
     */
    public _PgForeignTableColumns(String alias) {
        this(DSL.name(alias), _PG_FOREIGN_TABLE_COLUMNS);
    }

    /**
     * Create an aliased
     * <code>information_schema._pg_foreign_table_columns</code> table reference
     */
    public _PgForeignTableColumns(Name alias) {
        this(alias, _PG_FOREIGN_TABLE_COLUMNS);
    }

    /**
     * Create a <code>information_schema._pg_foreign_table_columns</code> table
     * reference
     */
    public _PgForeignTableColumns() {
        this(DSL.name("_pg_foreign_table_columns"), null);
    }

    public <O extends Record> _PgForeignTableColumns(Table<O> child, ForeignKey<O, _PgForeignTableColumnsRecord> key) {
        super(child, key, _PG_FOREIGN_TABLE_COLUMNS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public _PgForeignTableColumns as(String alias) {
        return new _PgForeignTableColumns(DSL.name(alias), this);
    }

    @Override
    public _PgForeignTableColumns as(Name alias) {
        return new _PgForeignTableColumns(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public _PgForeignTableColumns rename(String name) {
        return new _PgForeignTableColumns(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public _PgForeignTableColumns rename(Name name) {
        return new _PgForeignTableColumns(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, String[]> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
