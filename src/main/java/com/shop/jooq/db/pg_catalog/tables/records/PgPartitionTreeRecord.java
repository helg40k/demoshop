/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.pg_catalog.tables.records;


import com.shop.jooq.db.pg_catalog.tables.PgPartitionTree;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgPartitionTreeRecord extends TableRecordImpl<PgPartitionTreeRecord> implements Record4<Object, Object, Boolean, Integer> {

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
    public void setRelid(Object value) {
        set(0, value);
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
    public Object getRelid() {
        return get(0);
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
    public void setParentrelid(Object value) {
        set(1, value);
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
    public Object getParentrelid() {
        return get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_partition_tree.isleaf</code>.
     */
    public void setIsleaf(Boolean value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_partition_tree.isleaf</code>.
     */
    public Boolean getIsleaf() {
        return (Boolean) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_partition_tree.level</code>.
     */
    public void setLevel(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_partition_tree.level</code>.
     */
    public Integer getLevel() {
        return (Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Object, Object, Boolean, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Object, Object, Boolean, Integer> valuesRow() {
        return (Row4) super.valuesRow();
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
    @Override
    public Field<Object> field1() {
        return PgPartitionTree.PG_PARTITION_TREE.RELID;
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
    @Override
    public Field<Object> field2() {
        return PgPartitionTree.PG_PARTITION_TREE.PARENTRELID;
    }

    @Override
    public Field<Boolean> field3() {
        return PgPartitionTree.PG_PARTITION_TREE.ISLEAF;
    }

    @Override
    public Field<Integer> field4() {
        return PgPartitionTree.PG_PARTITION_TREE.LEVEL;
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
    @Override
    public Object component1() {
        return getRelid();
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
    @Override
    public Object component2() {
        return getParentrelid();
    }

    @Override
    public Boolean component3() {
        return getIsleaf();
    }

    @Override
    public Integer component4() {
        return getLevel();
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
    @Override
    public Object value1() {
        return getRelid();
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
    @Override
    public Object value2() {
        return getParentrelid();
    }

    @Override
    public Boolean value3() {
        return getIsleaf();
    }

    @Override
    public Integer value4() {
        return getLevel();
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
    @Override
    public PgPartitionTreeRecord value1(Object value) {
        setRelid(value);
        return this;
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
    @Override
    public PgPartitionTreeRecord value2(Object value) {
        setParentrelid(value);
        return this;
    }

    @Override
    public PgPartitionTreeRecord value3(Boolean value) {
        setIsleaf(value);
        return this;
    }

    @Override
    public PgPartitionTreeRecord value4(Integer value) {
        setLevel(value);
        return this;
    }

    @Override
    public PgPartitionTreeRecord values(Object value1, Object value2, Boolean value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgPartitionTreeRecord
     */
    public PgPartitionTreeRecord() {
        super(PgPartitionTree.PG_PARTITION_TREE);
    }

    /**
     * Create a detached, initialised PgPartitionTreeRecord
     */
    public PgPartitionTreeRecord(Object relid, Object parentrelid, Boolean isleaf, Integer level) {
        super(PgPartitionTree.PG_PARTITION_TREE);

        setRelid(relid);
        setParentrelid(parentrelid);
        setIsleaf(isleaf);
        setLevel(level);
    }
}
