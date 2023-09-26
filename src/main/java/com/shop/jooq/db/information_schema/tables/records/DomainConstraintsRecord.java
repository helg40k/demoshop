/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.information_schema.tables.records;


import com.shop.jooq.db.information_schema.tables.DomainConstraints;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DomainConstraintsRecord extends TableRecordImpl<DomainConstraintsRecord> implements Record8<String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>information_schema.domain_constraints.constraint_catalog</code>.
     */
    public void setConstraintCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>information_schema.domain_constraints.constraint_catalog</code>.
     */
    public String getConstraintCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>information_schema.domain_constraints.constraint_schema</code>.
     */
    public void setConstraintSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>information_schema.domain_constraints.constraint_schema</code>.
     */
    public String getConstraintSchema() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>information_schema.domain_constraints.constraint_name</code>.
     */
    public void setConstraintName(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>information_schema.domain_constraints.constraint_name</code>.
     */
    public String getConstraintName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>information_schema.domain_constraints.domain_catalog</code>.
     */
    public void setDomainCatalog(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>information_schema.domain_constraints.domain_catalog</code>.
     */
    public String getDomainCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>information_schema.domain_constraints.domain_schema</code>.
     */
    public void setDomainSchema(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>information_schema.domain_constraints.domain_schema</code>.
     */
    public String getDomainSchema() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>information_schema.domain_constraints.domain_name</code>.
     */
    public void setDomainName(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>information_schema.domain_constraints.domain_name</code>.
     */
    public String getDomainName() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>information_schema.domain_constraints.is_deferrable</code>.
     */
    public void setIsDeferrable(String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>information_schema.domain_constraints.is_deferrable</code>.
     */
    public String getIsDeferrable() {
        return (String) get(6);
    }

    /**
     * Setter for
     * <code>information_schema.domain_constraints.initially_deferred</code>.
     */
    public void setInitiallyDeferred(String value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>information_schema.domain_constraints.initially_deferred</code>.
     */
    public String getInitiallyDeferred() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<String, String, String, String, String, String, String, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return DomainConstraints.DOMAIN_CONSTRAINTS.CONSTRAINT_CATALOG;
    }

    @Override
    public Field<String> field2() {
        return DomainConstraints.DOMAIN_CONSTRAINTS.CONSTRAINT_SCHEMA;
    }

    @Override
    public Field<String> field3() {
        return DomainConstraints.DOMAIN_CONSTRAINTS.CONSTRAINT_NAME;
    }

    @Override
    public Field<String> field4() {
        return DomainConstraints.DOMAIN_CONSTRAINTS.DOMAIN_CATALOG;
    }

    @Override
    public Field<String> field5() {
        return DomainConstraints.DOMAIN_CONSTRAINTS.DOMAIN_SCHEMA;
    }

    @Override
    public Field<String> field6() {
        return DomainConstraints.DOMAIN_CONSTRAINTS.DOMAIN_NAME;
    }

    @Override
    public Field<String> field7() {
        return DomainConstraints.DOMAIN_CONSTRAINTS.IS_DEFERRABLE;
    }

    @Override
    public Field<String> field8() {
        return DomainConstraints.DOMAIN_CONSTRAINTS.INITIALLY_DEFERRED;
    }

    @Override
    public String component1() {
        return getConstraintCatalog();
    }

    @Override
    public String component2() {
        return getConstraintSchema();
    }

    @Override
    public String component3() {
        return getConstraintName();
    }

    @Override
    public String component4() {
        return getDomainCatalog();
    }

    @Override
    public String component5() {
        return getDomainSchema();
    }

    @Override
    public String component6() {
        return getDomainName();
    }

    @Override
    public String component7() {
        return getIsDeferrable();
    }

    @Override
    public String component8() {
        return getInitiallyDeferred();
    }

    @Override
    public String value1() {
        return getConstraintCatalog();
    }

    @Override
    public String value2() {
        return getConstraintSchema();
    }

    @Override
    public String value3() {
        return getConstraintName();
    }

    @Override
    public String value4() {
        return getDomainCatalog();
    }

    @Override
    public String value5() {
        return getDomainSchema();
    }

    @Override
    public String value6() {
        return getDomainName();
    }

    @Override
    public String value7() {
        return getIsDeferrable();
    }

    @Override
    public String value8() {
        return getInitiallyDeferred();
    }

    @Override
    public DomainConstraintsRecord value1(String value) {
        setConstraintCatalog(value);
        return this;
    }

    @Override
    public DomainConstraintsRecord value2(String value) {
        setConstraintSchema(value);
        return this;
    }

    @Override
    public DomainConstraintsRecord value3(String value) {
        setConstraintName(value);
        return this;
    }

    @Override
    public DomainConstraintsRecord value4(String value) {
        setDomainCatalog(value);
        return this;
    }

    @Override
    public DomainConstraintsRecord value5(String value) {
        setDomainSchema(value);
        return this;
    }

    @Override
    public DomainConstraintsRecord value6(String value) {
        setDomainName(value);
        return this;
    }

    @Override
    public DomainConstraintsRecord value7(String value) {
        setIsDeferrable(value);
        return this;
    }

    @Override
    public DomainConstraintsRecord value8(String value) {
        setInitiallyDeferred(value);
        return this;
    }

    @Override
    public DomainConstraintsRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DomainConstraintsRecord
     */
    public DomainConstraintsRecord() {
        super(DomainConstraints.DOMAIN_CONSTRAINTS);
    }

    /**
     * Create a detached, initialised DomainConstraintsRecord
     */
    public DomainConstraintsRecord(String constraintCatalog, String constraintSchema, String constraintName, String domainCatalog, String domainSchema, String domainName, String isDeferrable, String initiallyDeferred) {
        super(DomainConstraints.DOMAIN_CONSTRAINTS);

        setConstraintCatalog(constraintCatalog);
        setConstraintSchema(constraintSchema);
        setConstraintName(constraintName);
        setDomainCatalog(domainCatalog);
        setDomainSchema(domainSchema);
        setDomainName(domainName);
        setIsDeferrable(isDeferrable);
        setInitiallyDeferred(initiallyDeferred);
    }
}
