/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.pg_catalog.tables.records;


import com.shop.jooq.db.pg_catalog.tables.PgParameterAcl;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgParameterAclRecord extends UpdatableRecordImpl<PgParameterAclRecord> implements Record3<Long, String, String[]> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_parameter_acl.oid</code>.
     */
    public void setOid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_parameter_acl.oid</code>.
     */
    public Long getOid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_parameter_acl.parname</code>.
     */
    public void setParname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_parameter_acl.parname</code>.
     */
    public String getParname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_parameter_acl.paracl</code>.
     */
    public void setParacl(String[] value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_parameter_acl.paracl</code>.
     */
    public String[] getParacl() {
        return (String[]) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, String, String[]> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Long, String, String[]> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return PgParameterAcl.PG_PARAMETER_ACL.OID;
    }

    @Override
    public Field<String> field2() {
        return PgParameterAcl.PG_PARAMETER_ACL.PARNAME;
    }

    @Override
    public Field<String[]> field3() {
        return PgParameterAcl.PG_PARAMETER_ACL.PARACL;
    }

    @Override
    public Long component1() {
        return getOid();
    }

    @Override
    public String component2() {
        return getParname();
    }

    @Override
    public String[] component3() {
        return getParacl();
    }

    @Override
    public Long value1() {
        return getOid();
    }

    @Override
    public String value2() {
        return getParname();
    }

    @Override
    public String[] value3() {
        return getParacl();
    }

    @Override
    public PgParameterAclRecord value1(Long value) {
        setOid(value);
        return this;
    }

    @Override
    public PgParameterAclRecord value2(String value) {
        setParname(value);
        return this;
    }

    @Override
    public PgParameterAclRecord value3(String[] value) {
        setParacl(value);
        return this;
    }

    @Override
    public PgParameterAclRecord values(Long value1, String value2, String[] value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgParameterAclRecord
     */
    public PgParameterAclRecord() {
        super(PgParameterAcl.PG_PARAMETER_ACL);
    }

    /**
     * Create a detached, initialised PgParameterAclRecord
     */
    public PgParameterAclRecord(Long oid, String parname, String[] paracl) {
        super(PgParameterAcl.PG_PARAMETER_ACL);

        setOid(oid);
        setParname(parname);
        setParacl(paracl);
    }
}
