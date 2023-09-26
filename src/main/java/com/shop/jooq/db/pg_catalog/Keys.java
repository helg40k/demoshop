/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.pg_catalog;


import com.shop.jooq.db.pg_catalog.tables.PgAggregate;
import com.shop.jooq.db.pg_catalog.tables.PgAm;
import com.shop.jooq.db.pg_catalog.tables.PgAmop;
import com.shop.jooq.db.pg_catalog.tables.PgAmproc;
import com.shop.jooq.db.pg_catalog.tables.PgAttrdef;
import com.shop.jooq.db.pg_catalog.tables.PgAttribute;
import com.shop.jooq.db.pg_catalog.tables.PgAuthMembers;
import com.shop.jooq.db.pg_catalog.tables.PgAuthid;
import com.shop.jooq.db.pg_catalog.tables.PgCast;
import com.shop.jooq.db.pg_catalog.tables.PgClass;
import com.shop.jooq.db.pg_catalog.tables.PgCollation;
import com.shop.jooq.db.pg_catalog.tables.PgConstraint;
import com.shop.jooq.db.pg_catalog.tables.PgConversion;
import com.shop.jooq.db.pg_catalog.tables.PgDatabase;
import com.shop.jooq.db.pg_catalog.tables.PgDbRoleSetting;
import com.shop.jooq.db.pg_catalog.tables.PgDefaultAcl;
import com.shop.jooq.db.pg_catalog.tables.PgDescription;
import com.shop.jooq.db.pg_catalog.tables.PgEnum;
import com.shop.jooq.db.pg_catalog.tables.PgEventTrigger;
import com.shop.jooq.db.pg_catalog.tables.PgExtension;
import com.shop.jooq.db.pg_catalog.tables.PgForeignDataWrapper;
import com.shop.jooq.db.pg_catalog.tables.PgForeignServer;
import com.shop.jooq.db.pg_catalog.tables.PgForeignTable;
import com.shop.jooq.db.pg_catalog.tables.PgIndex;
import com.shop.jooq.db.pg_catalog.tables.PgInherits;
import com.shop.jooq.db.pg_catalog.tables.PgInitPrivs;
import com.shop.jooq.db.pg_catalog.tables.PgLanguage;
import com.shop.jooq.db.pg_catalog.tables.PgLargeobject;
import com.shop.jooq.db.pg_catalog.tables.PgLargeobjectMetadata;
import com.shop.jooq.db.pg_catalog.tables.PgNamespace;
import com.shop.jooq.db.pg_catalog.tables.PgOpclass;
import com.shop.jooq.db.pg_catalog.tables.PgOperator;
import com.shop.jooq.db.pg_catalog.tables.PgOpfamily;
import com.shop.jooq.db.pg_catalog.tables.PgParameterAcl;
import com.shop.jooq.db.pg_catalog.tables.PgPartitionedTable;
import com.shop.jooq.db.pg_catalog.tables.PgPolicy;
import com.shop.jooq.db.pg_catalog.tables.PgProc;
import com.shop.jooq.db.pg_catalog.tables.PgPublication;
import com.shop.jooq.db.pg_catalog.tables.PgPublicationNamespace;
import com.shop.jooq.db.pg_catalog.tables.PgPublicationRel;
import com.shop.jooq.db.pg_catalog.tables.PgRange;
import com.shop.jooq.db.pg_catalog.tables.PgReplicationOrigin;
import com.shop.jooq.db.pg_catalog.tables.PgRewrite;
import com.shop.jooq.db.pg_catalog.tables.PgSeclabel;
import com.shop.jooq.db.pg_catalog.tables.PgSequence;
import com.shop.jooq.db.pg_catalog.tables.PgShdescription;
import com.shop.jooq.db.pg_catalog.tables.PgShseclabel;
import com.shop.jooq.db.pg_catalog.tables.PgStatistic;
import com.shop.jooq.db.pg_catalog.tables.PgStatisticExt;
import com.shop.jooq.db.pg_catalog.tables.PgStatisticExtData;
import com.shop.jooq.db.pg_catalog.tables.PgSubscription;
import com.shop.jooq.db.pg_catalog.tables.PgSubscriptionRel;
import com.shop.jooq.db.pg_catalog.tables.PgTablespace;
import com.shop.jooq.db.pg_catalog.tables.PgTransform;
import com.shop.jooq.db.pg_catalog.tables.PgTrigger;
import com.shop.jooq.db.pg_catalog.tables.PgTsConfig;
import com.shop.jooq.db.pg_catalog.tables.PgTsConfigMap;
import com.shop.jooq.db.pg_catalog.tables.PgTsDict;
import com.shop.jooq.db.pg_catalog.tables.PgTsParser;
import com.shop.jooq.db.pg_catalog.tables.PgTsTemplate;
import com.shop.jooq.db.pg_catalog.tables.PgType;
import com.shop.jooq.db.pg_catalog.tables.PgUserMapping;
import com.shop.jooq.db.pg_catalog.tables.records.PgAggregateRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgAmRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgAmopRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgAmprocRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgAttrdefRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgAttributeRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgAuthMembersRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgAuthidRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgCastRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgClassRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgCollationRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgConstraintRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgConversionRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgDatabaseRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgDbRoleSettingRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgDefaultAclRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgDescriptionRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgEnumRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgEventTriggerRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgExtensionRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgForeignDataWrapperRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgForeignServerRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgForeignTableRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgIndexRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgInheritsRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgInitPrivsRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgLanguageRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgLargeobjectMetadataRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgLargeobjectRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgNamespaceRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgOpclassRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgOperatorRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgOpfamilyRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgParameterAclRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgPartitionedTableRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgPolicyRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgProcRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgPublicationNamespaceRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgPublicationRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgPublicationRelRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgRangeRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgReplicationOriginRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgRewriteRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgSeclabelRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgSequenceRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgShdescriptionRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgShseclabelRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgStatisticExtDataRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgStatisticExtRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgStatisticRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgSubscriptionRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgSubscriptionRelRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgTablespaceRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgTransformRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgTriggerRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgTsConfigMapRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgTsConfigRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgTsDictRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgTsParserRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgTsTemplateRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgTypeRecord;
import com.shop.jooq.db.pg_catalog.tables.records.PgUserMappingRecord;

import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * pg_catalog.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<PgAggregateRecord> PG_AGGREGATE_FNOID_INDEX = Internal.createUniqueKey(PgAggregate.PG_AGGREGATE, DSL.name("pg_aggregate_fnoid_index"), new TableField[] { PgAggregate.PG_AGGREGATE.AGGFNOID }, true);
    public static final UniqueKey<PgAmRecord> PG_AM_NAME_INDEX = Internal.createUniqueKey(PgAm.PG_AM, DSL.name("pg_am_name_index"), new TableField[] { PgAm.PG_AM.AMNAME }, true);
    public static final UniqueKey<PgAmRecord> PG_AM_OID_INDEX = Internal.createUniqueKey(PgAm.PG_AM, DSL.name("pg_am_oid_index"), new TableField[] { PgAm.PG_AM.OID }, true);
    public static final UniqueKey<PgAmopRecord> PG_AMOP_FAM_STRAT_INDEX = Internal.createUniqueKey(PgAmop.PG_AMOP, DSL.name("pg_amop_fam_strat_index"), new TableField[] { PgAmop.PG_AMOP.AMOPFAMILY, PgAmop.PG_AMOP.AMOPLEFTTYPE, PgAmop.PG_AMOP.AMOPRIGHTTYPE, PgAmop.PG_AMOP.AMOPSTRATEGY }, true);
    public static final UniqueKey<PgAmopRecord> PG_AMOP_OID_INDEX = Internal.createUniqueKey(PgAmop.PG_AMOP, DSL.name("pg_amop_oid_index"), new TableField[] { PgAmop.PG_AMOP.OID }, true);
    public static final UniqueKey<PgAmopRecord> PG_AMOP_OPR_FAM_INDEX = Internal.createUniqueKey(PgAmop.PG_AMOP, DSL.name("pg_amop_opr_fam_index"), new TableField[] { PgAmop.PG_AMOP.AMOPOPR, PgAmop.PG_AMOP.AMOPPURPOSE, PgAmop.PG_AMOP.AMOPFAMILY }, true);
    public static final UniqueKey<PgAmprocRecord> PG_AMPROC_FAM_PROC_INDEX = Internal.createUniqueKey(PgAmproc.PG_AMPROC, DSL.name("pg_amproc_fam_proc_index"), new TableField[] { PgAmproc.PG_AMPROC.AMPROCFAMILY, PgAmproc.PG_AMPROC.AMPROCLEFTTYPE, PgAmproc.PG_AMPROC.AMPROCRIGHTTYPE, PgAmproc.PG_AMPROC.AMPROCNUM }, true);
    public static final UniqueKey<PgAmprocRecord> PG_AMPROC_OID_INDEX = Internal.createUniqueKey(PgAmproc.PG_AMPROC, DSL.name("pg_amproc_oid_index"), new TableField[] { PgAmproc.PG_AMPROC.OID }, true);
    public static final UniqueKey<PgAttrdefRecord> PG_ATTRDEF_ADRELID_ADNUM_INDEX = Internal.createUniqueKey(PgAttrdef.PG_ATTRDEF, DSL.name("pg_attrdef_adrelid_adnum_index"), new TableField[] { PgAttrdef.PG_ATTRDEF.ADRELID, PgAttrdef.PG_ATTRDEF.ADNUM }, true);
    public static final UniqueKey<PgAttrdefRecord> PG_ATTRDEF_OID_INDEX = Internal.createUniqueKey(PgAttrdef.PG_ATTRDEF, DSL.name("pg_attrdef_oid_index"), new TableField[] { PgAttrdef.PG_ATTRDEF.OID }, true);
    public static final UniqueKey<PgAttributeRecord> PG_ATTRIBUTE_RELID_ATTNAM_INDEX = Internal.createUniqueKey(PgAttribute.PG_ATTRIBUTE, DSL.name("pg_attribute_relid_attnam_index"), new TableField[] { PgAttribute.PG_ATTRIBUTE.ATTRELID, PgAttribute.PG_ATTRIBUTE.ATTNAME }, true);
    public static final UniqueKey<PgAttributeRecord> PG_ATTRIBUTE_RELID_ATTNUM_INDEX = Internal.createUniqueKey(PgAttribute.PG_ATTRIBUTE, DSL.name("pg_attribute_relid_attnum_index"), new TableField[] { PgAttribute.PG_ATTRIBUTE.ATTRELID, PgAttribute.PG_ATTRIBUTE.ATTNUM }, true);
    public static final UniqueKey<PgAuthMembersRecord> PG_AUTH_MEMBERS_MEMBER_ROLE_INDEX = Internal.createUniqueKey(PgAuthMembers.PG_AUTH_MEMBERS, DSL.name("pg_auth_members_member_role_index"), new TableField[] { PgAuthMembers.PG_AUTH_MEMBERS.MEMBER, PgAuthMembers.PG_AUTH_MEMBERS.ROLEID }, true);
    public static final UniqueKey<PgAuthMembersRecord> PG_AUTH_MEMBERS_ROLE_MEMBER_INDEX = Internal.createUniqueKey(PgAuthMembers.PG_AUTH_MEMBERS, DSL.name("pg_auth_members_role_member_index"), new TableField[] { PgAuthMembers.PG_AUTH_MEMBERS.ROLEID, PgAuthMembers.PG_AUTH_MEMBERS.MEMBER }, true);
    public static final UniqueKey<PgAuthidRecord> PG_AUTHID_OID_INDEX = Internal.createUniqueKey(PgAuthid.PG_AUTHID, DSL.name("pg_authid_oid_index"), new TableField[] { PgAuthid.PG_AUTHID.OID }, true);
    public static final UniqueKey<PgAuthidRecord> PG_AUTHID_ROLNAME_INDEX = Internal.createUniqueKey(PgAuthid.PG_AUTHID, DSL.name("pg_authid_rolname_index"), new TableField[] { PgAuthid.PG_AUTHID.ROLNAME }, true);
    public static final UniqueKey<PgCastRecord> PG_CAST_OID_INDEX = Internal.createUniqueKey(PgCast.PG_CAST, DSL.name("pg_cast_oid_index"), new TableField[] { PgCast.PG_CAST.OID }, true);
    public static final UniqueKey<PgCastRecord> PG_CAST_SOURCE_TARGET_INDEX = Internal.createUniqueKey(PgCast.PG_CAST, DSL.name("pg_cast_source_target_index"), new TableField[] { PgCast.PG_CAST.CASTSOURCE, PgCast.PG_CAST.CASTTARGET }, true);
    public static final UniqueKey<PgClassRecord> PG_CLASS_OID_INDEX = Internal.createUniqueKey(PgClass.PG_CLASS, DSL.name("pg_class_oid_index"), new TableField[] { PgClass.PG_CLASS.OID }, true);
    public static final UniqueKey<PgClassRecord> PG_CLASS_RELNAME_NSP_INDEX = Internal.createUniqueKey(PgClass.PG_CLASS, DSL.name("pg_class_relname_nsp_index"), new TableField[] { PgClass.PG_CLASS.RELNAME, PgClass.PG_CLASS.RELNAMESPACE }, true);
    public static final UniqueKey<PgCollationRecord> PG_COLLATION_NAME_ENC_NSP_INDEX = Internal.createUniqueKey(PgCollation.PG_COLLATION, DSL.name("pg_collation_name_enc_nsp_index"), new TableField[] { PgCollation.PG_COLLATION.COLLNAME, PgCollation.PG_COLLATION.COLLENCODING, PgCollation.PG_COLLATION.COLLNAMESPACE }, true);
    public static final UniqueKey<PgCollationRecord> PG_COLLATION_OID_INDEX = Internal.createUniqueKey(PgCollation.PG_COLLATION, DSL.name("pg_collation_oid_index"), new TableField[] { PgCollation.PG_COLLATION.OID }, true);
    public static final UniqueKey<PgConstraintRecord> PG_CONSTRAINT_CONRELID_CONTYPID_CONNAME_INDEX = Internal.createUniqueKey(PgConstraint.PG_CONSTRAINT, DSL.name("pg_constraint_conrelid_contypid_conname_index"), new TableField[] { PgConstraint.PG_CONSTRAINT.CONRELID, PgConstraint.PG_CONSTRAINT.CONTYPID, PgConstraint.PG_CONSTRAINT.CONNAME }, true);
    public static final UniqueKey<PgConstraintRecord> PG_CONSTRAINT_OID_INDEX = Internal.createUniqueKey(PgConstraint.PG_CONSTRAINT, DSL.name("pg_constraint_oid_index"), new TableField[] { PgConstraint.PG_CONSTRAINT.OID }, true);
    public static final UniqueKey<PgConversionRecord> PG_CONVERSION_DEFAULT_INDEX = Internal.createUniqueKey(PgConversion.PG_CONVERSION, DSL.name("pg_conversion_default_index"), new TableField[] { PgConversion.PG_CONVERSION.CONNAMESPACE, PgConversion.PG_CONVERSION.CONFORENCODING, PgConversion.PG_CONVERSION.CONTOENCODING, PgConversion.PG_CONVERSION.OID }, true);
    public static final UniqueKey<PgConversionRecord> PG_CONVERSION_NAME_NSP_INDEX = Internal.createUniqueKey(PgConversion.PG_CONVERSION, DSL.name("pg_conversion_name_nsp_index"), new TableField[] { PgConversion.PG_CONVERSION.CONNAME, PgConversion.PG_CONVERSION.CONNAMESPACE }, true);
    public static final UniqueKey<PgConversionRecord> PG_CONVERSION_OID_INDEX = Internal.createUniqueKey(PgConversion.PG_CONVERSION, DSL.name("pg_conversion_oid_index"), new TableField[] { PgConversion.PG_CONVERSION.OID }, true);
    public static final UniqueKey<PgDatabaseRecord> PG_DATABASE_DATNAME_INDEX = Internal.createUniqueKey(PgDatabase.PG_DATABASE, DSL.name("pg_database_datname_index"), new TableField[] { PgDatabase.PG_DATABASE.DATNAME }, true);
    public static final UniqueKey<PgDatabaseRecord> PG_DATABASE_OID_INDEX = Internal.createUniqueKey(PgDatabase.PG_DATABASE, DSL.name("pg_database_oid_index"), new TableField[] { PgDatabase.PG_DATABASE.OID }, true);
    public static final UniqueKey<PgDbRoleSettingRecord> PG_DB_ROLE_SETTING_DATABASEID_ROL_INDEX = Internal.createUniqueKey(PgDbRoleSetting.PG_DB_ROLE_SETTING, DSL.name("pg_db_role_setting_databaseid_rol_index"), new TableField[] { PgDbRoleSetting.PG_DB_ROLE_SETTING.SETDATABASE, PgDbRoleSetting.PG_DB_ROLE_SETTING.SETROLE }, true);
    public static final UniqueKey<PgDefaultAclRecord> PG_DEFAULT_ACL_OID_INDEX = Internal.createUniqueKey(PgDefaultAcl.PG_DEFAULT_ACL, DSL.name("pg_default_acl_oid_index"), new TableField[] { PgDefaultAcl.PG_DEFAULT_ACL.OID }, true);
    public static final UniqueKey<PgDefaultAclRecord> PG_DEFAULT_ACL_ROLE_NSP_OBJ_INDEX = Internal.createUniqueKey(PgDefaultAcl.PG_DEFAULT_ACL, DSL.name("pg_default_acl_role_nsp_obj_index"), new TableField[] { PgDefaultAcl.PG_DEFAULT_ACL.DEFACLROLE, PgDefaultAcl.PG_DEFAULT_ACL.DEFACLNAMESPACE, PgDefaultAcl.PG_DEFAULT_ACL.DEFACLOBJTYPE }, true);
    public static final UniqueKey<PgDescriptionRecord> PG_DESCRIPTION_O_C_O_INDEX = Internal.createUniqueKey(PgDescription.PG_DESCRIPTION, DSL.name("pg_description_o_c_o_index"), new TableField[] { PgDescription.PG_DESCRIPTION.OBJOID, PgDescription.PG_DESCRIPTION.CLASSOID, PgDescription.PG_DESCRIPTION.OBJSUBID }, true);
    public static final UniqueKey<PgEnumRecord> PG_ENUM_OID_INDEX = Internal.createUniqueKey(PgEnum.PG_ENUM, DSL.name("pg_enum_oid_index"), new TableField[] { PgEnum.PG_ENUM.OID }, true);
    public static final UniqueKey<PgEnumRecord> PG_ENUM_TYPID_LABEL_INDEX = Internal.createUniqueKey(PgEnum.PG_ENUM, DSL.name("pg_enum_typid_label_index"), new TableField[] { PgEnum.PG_ENUM.ENUMTYPID, PgEnum.PG_ENUM.ENUMLABEL }, true);
    public static final UniqueKey<PgEnumRecord> PG_ENUM_TYPID_SORTORDER_INDEX = Internal.createUniqueKey(PgEnum.PG_ENUM, DSL.name("pg_enum_typid_sortorder_index"), new TableField[] { PgEnum.PG_ENUM.ENUMTYPID, PgEnum.PG_ENUM.ENUMSORTORDER }, true);
    public static final UniqueKey<PgEventTriggerRecord> PG_EVENT_TRIGGER_EVTNAME_INDEX = Internal.createUniqueKey(PgEventTrigger.PG_EVENT_TRIGGER, DSL.name("pg_event_trigger_evtname_index"), new TableField[] { PgEventTrigger.PG_EVENT_TRIGGER.EVTNAME }, true);
    public static final UniqueKey<PgEventTriggerRecord> PG_EVENT_TRIGGER_OID_INDEX = Internal.createUniqueKey(PgEventTrigger.PG_EVENT_TRIGGER, DSL.name("pg_event_trigger_oid_index"), new TableField[] { PgEventTrigger.PG_EVENT_TRIGGER.OID }, true);
    public static final UniqueKey<PgExtensionRecord> PG_EXTENSION_NAME_INDEX = Internal.createUniqueKey(PgExtension.PG_EXTENSION, DSL.name("pg_extension_name_index"), new TableField[] { PgExtension.PG_EXTENSION.EXTNAME }, true);
    public static final UniqueKey<PgExtensionRecord> PG_EXTENSION_OID_INDEX = Internal.createUniqueKey(PgExtension.PG_EXTENSION, DSL.name("pg_extension_oid_index"), new TableField[] { PgExtension.PG_EXTENSION.OID }, true);
    public static final UniqueKey<PgForeignDataWrapperRecord> PG_FOREIGN_DATA_WRAPPER_NAME_INDEX = Internal.createUniqueKey(PgForeignDataWrapper.PG_FOREIGN_DATA_WRAPPER, DSL.name("pg_foreign_data_wrapper_name_index"), new TableField[] { PgForeignDataWrapper.PG_FOREIGN_DATA_WRAPPER.FDWNAME }, true);
    public static final UniqueKey<PgForeignDataWrapperRecord> PG_FOREIGN_DATA_WRAPPER_OID_INDEX = Internal.createUniqueKey(PgForeignDataWrapper.PG_FOREIGN_DATA_WRAPPER, DSL.name("pg_foreign_data_wrapper_oid_index"), new TableField[] { PgForeignDataWrapper.PG_FOREIGN_DATA_WRAPPER.OID }, true);
    public static final UniqueKey<PgForeignServerRecord> PG_FOREIGN_SERVER_NAME_INDEX = Internal.createUniqueKey(PgForeignServer.PG_FOREIGN_SERVER, DSL.name("pg_foreign_server_name_index"), new TableField[] { PgForeignServer.PG_FOREIGN_SERVER.SRVNAME }, true);
    public static final UniqueKey<PgForeignServerRecord> PG_FOREIGN_SERVER_OID_INDEX = Internal.createUniqueKey(PgForeignServer.PG_FOREIGN_SERVER, DSL.name("pg_foreign_server_oid_index"), new TableField[] { PgForeignServer.PG_FOREIGN_SERVER.OID }, true);
    public static final UniqueKey<PgForeignTableRecord> PG_FOREIGN_TABLE_RELID_INDEX = Internal.createUniqueKey(PgForeignTable.PG_FOREIGN_TABLE, DSL.name("pg_foreign_table_relid_index"), new TableField[] { PgForeignTable.PG_FOREIGN_TABLE.FTRELID }, true);
    public static final UniqueKey<PgIndexRecord> PG_INDEX_INDEXRELID_INDEX = Internal.createUniqueKey(PgIndex.PG_INDEX, DSL.name("pg_index_indexrelid_index"), new TableField[] { PgIndex.PG_INDEX.INDEXRELID }, true);
    public static final UniqueKey<PgInheritsRecord> PG_INHERITS_RELID_SEQNO_INDEX = Internal.createUniqueKey(PgInherits.PG_INHERITS, DSL.name("pg_inherits_relid_seqno_index"), new TableField[] { PgInherits.PG_INHERITS.INHRELID, PgInherits.PG_INHERITS.INHSEQNO }, true);
    public static final UniqueKey<PgInitPrivsRecord> PG_INIT_PRIVS_O_C_O_INDEX = Internal.createUniqueKey(PgInitPrivs.PG_INIT_PRIVS, DSL.name("pg_init_privs_o_c_o_index"), new TableField[] { PgInitPrivs.PG_INIT_PRIVS.OBJOID, PgInitPrivs.PG_INIT_PRIVS.CLASSOID, PgInitPrivs.PG_INIT_PRIVS.OBJSUBID }, true);
    public static final UniqueKey<PgLanguageRecord> PG_LANGUAGE_NAME_INDEX = Internal.createUniqueKey(PgLanguage.PG_LANGUAGE, DSL.name("pg_language_name_index"), new TableField[] { PgLanguage.PG_LANGUAGE.LANNAME }, true);
    public static final UniqueKey<PgLanguageRecord> PG_LANGUAGE_OID_INDEX = Internal.createUniqueKey(PgLanguage.PG_LANGUAGE, DSL.name("pg_language_oid_index"), new TableField[] { PgLanguage.PG_LANGUAGE.OID }, true);
    public static final UniqueKey<PgLargeobjectRecord> PG_LARGEOBJECT_LOID_PN_INDEX = Internal.createUniqueKey(PgLargeobject.PG_LARGEOBJECT, DSL.name("pg_largeobject_loid_pn_index"), new TableField[] { PgLargeobject.PG_LARGEOBJECT.LOID, PgLargeobject.PG_LARGEOBJECT.PAGENO }, true);
    public static final UniqueKey<PgLargeobjectMetadataRecord> PG_LARGEOBJECT_METADATA_OID_INDEX = Internal.createUniqueKey(PgLargeobjectMetadata.PG_LARGEOBJECT_METADATA, DSL.name("pg_largeobject_metadata_oid_index"), new TableField[] { PgLargeobjectMetadata.PG_LARGEOBJECT_METADATA.OID }, true);
    public static final UniqueKey<PgNamespaceRecord> PG_NAMESPACE_NSPNAME_INDEX = Internal.createUniqueKey(PgNamespace.PG_NAMESPACE, DSL.name("pg_namespace_nspname_index"), new TableField[] { PgNamespace.PG_NAMESPACE.NSPNAME }, true);
    public static final UniqueKey<PgNamespaceRecord> PG_NAMESPACE_OID_INDEX = Internal.createUniqueKey(PgNamespace.PG_NAMESPACE, DSL.name("pg_namespace_oid_index"), new TableField[] { PgNamespace.PG_NAMESPACE.OID }, true);
    public static final UniqueKey<PgOpclassRecord> PG_OPCLASS_AM_NAME_NSP_INDEX = Internal.createUniqueKey(PgOpclass.PG_OPCLASS, DSL.name("pg_opclass_am_name_nsp_index"), new TableField[] { PgOpclass.PG_OPCLASS.OPCMETHOD, PgOpclass.PG_OPCLASS.OPCNAME, PgOpclass.PG_OPCLASS.OPCNAMESPACE }, true);
    public static final UniqueKey<PgOpclassRecord> PG_OPCLASS_OID_INDEX = Internal.createUniqueKey(PgOpclass.PG_OPCLASS, DSL.name("pg_opclass_oid_index"), new TableField[] { PgOpclass.PG_OPCLASS.OID }, true);
    public static final UniqueKey<PgOperatorRecord> PG_OPERATOR_OID_INDEX = Internal.createUniqueKey(PgOperator.PG_OPERATOR, DSL.name("pg_operator_oid_index"), new TableField[] { PgOperator.PG_OPERATOR.OID }, true);
    public static final UniqueKey<PgOperatorRecord> PG_OPERATOR_OPRNAME_L_R_N_INDEX = Internal.createUniqueKey(PgOperator.PG_OPERATOR, DSL.name("pg_operator_oprname_l_r_n_index"), new TableField[] { PgOperator.PG_OPERATOR.OPRNAME, PgOperator.PG_OPERATOR.OPRLEFT, PgOperator.PG_OPERATOR.OPRRIGHT, PgOperator.PG_OPERATOR.OPRNAMESPACE }, true);
    public static final UniqueKey<PgOpfamilyRecord> PG_OPFAMILY_AM_NAME_NSP_INDEX = Internal.createUniqueKey(PgOpfamily.PG_OPFAMILY, DSL.name("pg_opfamily_am_name_nsp_index"), new TableField[] { PgOpfamily.PG_OPFAMILY.OPFMETHOD, PgOpfamily.PG_OPFAMILY.OPFNAME, PgOpfamily.PG_OPFAMILY.OPFNAMESPACE }, true);
    public static final UniqueKey<PgOpfamilyRecord> PG_OPFAMILY_OID_INDEX = Internal.createUniqueKey(PgOpfamily.PG_OPFAMILY, DSL.name("pg_opfamily_oid_index"), new TableField[] { PgOpfamily.PG_OPFAMILY.OID }, true);
    public static final UniqueKey<PgParameterAclRecord> PG_PARAMETER_ACL_OID_INDEX = Internal.createUniqueKey(PgParameterAcl.PG_PARAMETER_ACL, DSL.name("pg_parameter_acl_oid_index"), new TableField[] { PgParameterAcl.PG_PARAMETER_ACL.OID }, true);
    public static final UniqueKey<PgParameterAclRecord> PG_PARAMETER_ACL_PARNAME_INDEX = Internal.createUniqueKey(PgParameterAcl.PG_PARAMETER_ACL, DSL.name("pg_parameter_acl_parname_index"), new TableField[] { PgParameterAcl.PG_PARAMETER_ACL.PARNAME }, true);
    public static final UniqueKey<PgPartitionedTableRecord> PG_PARTITIONED_TABLE_PARTRELID_INDEX = Internal.createUniqueKey(PgPartitionedTable.PG_PARTITIONED_TABLE, DSL.name("pg_partitioned_table_partrelid_index"), new TableField[] { PgPartitionedTable.PG_PARTITIONED_TABLE.PARTRELID }, true);
    public static final UniqueKey<PgPolicyRecord> PG_POLICY_OID_INDEX = Internal.createUniqueKey(PgPolicy.PG_POLICY, DSL.name("pg_policy_oid_index"), new TableField[] { PgPolicy.PG_POLICY.OID }, true);
    public static final UniqueKey<PgPolicyRecord> PG_POLICY_POLRELID_POLNAME_INDEX = Internal.createUniqueKey(PgPolicy.PG_POLICY, DSL.name("pg_policy_polrelid_polname_index"), new TableField[] { PgPolicy.PG_POLICY.POLRELID, PgPolicy.PG_POLICY.POLNAME }, true);
    public static final UniqueKey<PgProcRecord> PG_PROC_OID_INDEX = Internal.createUniqueKey(PgProc.PG_PROC, DSL.name("pg_proc_oid_index"), new TableField[] { PgProc.PG_PROC.OID }, true);
    public static final UniqueKey<PgProcRecord> PG_PROC_PRONAME_ARGS_NSP_INDEX = Internal.createUniqueKey(PgProc.PG_PROC, DSL.name("pg_proc_proname_args_nsp_index"), new TableField[] { PgProc.PG_PROC.PRONAME, PgProc.PG_PROC.PROARGTYPES, PgProc.PG_PROC.PRONAMESPACE }, true);
    public static final UniqueKey<PgPublicationRecord> PG_PUBLICATION_OID_INDEX = Internal.createUniqueKey(PgPublication.PG_PUBLICATION, DSL.name("pg_publication_oid_index"), new TableField[] { PgPublication.PG_PUBLICATION.OID }, true);
    public static final UniqueKey<PgPublicationRecord> PG_PUBLICATION_PUBNAME_INDEX = Internal.createUniqueKey(PgPublication.PG_PUBLICATION, DSL.name("pg_publication_pubname_index"), new TableField[] { PgPublication.PG_PUBLICATION.PUBNAME }, true);
    public static final UniqueKey<PgPublicationNamespaceRecord> PG_PUBLICATION_NAMESPACE_OID_INDEX = Internal.createUniqueKey(PgPublicationNamespace.PG_PUBLICATION_NAMESPACE, DSL.name("pg_publication_namespace_oid_index"), new TableField[] { PgPublicationNamespace.PG_PUBLICATION_NAMESPACE.OID }, true);
    public static final UniqueKey<PgPublicationNamespaceRecord> PG_PUBLICATION_NAMESPACE_PNNSPID_PNPUBID_INDEX = Internal.createUniqueKey(PgPublicationNamespace.PG_PUBLICATION_NAMESPACE, DSL.name("pg_publication_namespace_pnnspid_pnpubid_index"), new TableField[] { PgPublicationNamespace.PG_PUBLICATION_NAMESPACE.PNNSPID, PgPublicationNamespace.PG_PUBLICATION_NAMESPACE.PNPUBID }, true);
    public static final UniqueKey<PgPublicationRelRecord> PG_PUBLICATION_REL_OID_INDEX = Internal.createUniqueKey(PgPublicationRel.PG_PUBLICATION_REL, DSL.name("pg_publication_rel_oid_index"), new TableField[] { PgPublicationRel.PG_PUBLICATION_REL.OID }, true);
    public static final UniqueKey<PgPublicationRelRecord> PG_PUBLICATION_REL_PRRELID_PRPUBID_INDEX = Internal.createUniqueKey(PgPublicationRel.PG_PUBLICATION_REL, DSL.name("pg_publication_rel_prrelid_prpubid_index"), new TableField[] { PgPublicationRel.PG_PUBLICATION_REL.PRRELID, PgPublicationRel.PG_PUBLICATION_REL.PRPUBID }, true);
    public static final UniqueKey<PgRangeRecord> PG_RANGE_RNGMULTITYPID_INDEX = Internal.createUniqueKey(PgRange.PG_RANGE, DSL.name("pg_range_rngmultitypid_index"), new TableField[] { PgRange.PG_RANGE.RNGMULTITYPID }, true);
    public static final UniqueKey<PgRangeRecord> PG_RANGE_RNGTYPID_INDEX = Internal.createUniqueKey(PgRange.PG_RANGE, DSL.name("pg_range_rngtypid_index"), new TableField[] { PgRange.PG_RANGE.RNGTYPID }, true);
    public static final UniqueKey<PgReplicationOriginRecord> PG_REPLICATION_ORIGIN_ROIIDENT_INDEX = Internal.createUniqueKey(PgReplicationOrigin.PG_REPLICATION_ORIGIN, DSL.name("pg_replication_origin_roiident_index"), new TableField[] { PgReplicationOrigin.PG_REPLICATION_ORIGIN.ROIDENT }, true);
    public static final UniqueKey<PgReplicationOriginRecord> PG_REPLICATION_ORIGIN_RONAME_INDEX = Internal.createUniqueKey(PgReplicationOrigin.PG_REPLICATION_ORIGIN, DSL.name("pg_replication_origin_roname_index"), new TableField[] { PgReplicationOrigin.PG_REPLICATION_ORIGIN.RONAME }, true);
    public static final UniqueKey<PgRewriteRecord> PG_REWRITE_OID_INDEX = Internal.createUniqueKey(PgRewrite.PG_REWRITE, DSL.name("pg_rewrite_oid_index"), new TableField[] { PgRewrite.PG_REWRITE.OID }, true);
    public static final UniqueKey<PgRewriteRecord> PG_REWRITE_REL_RULENAME_INDEX = Internal.createUniqueKey(PgRewrite.PG_REWRITE, DSL.name("pg_rewrite_rel_rulename_index"), new TableField[] { PgRewrite.PG_REWRITE.EV_CLASS, PgRewrite.PG_REWRITE.RULENAME }, true);
    public static final UniqueKey<PgSeclabelRecord> PG_SECLABEL_OBJECT_INDEX = Internal.createUniqueKey(PgSeclabel.PG_SECLABEL, DSL.name("pg_seclabel_object_index"), new TableField[] { PgSeclabel.PG_SECLABEL.OBJOID, PgSeclabel.PG_SECLABEL.CLASSOID, PgSeclabel.PG_SECLABEL.OBJSUBID, PgSeclabel.PG_SECLABEL.PROVIDER }, true);
    public static final UniqueKey<PgSequenceRecord> PG_SEQUENCE_SEQRELID_INDEX = Internal.createUniqueKey(PgSequence.PG_SEQUENCE, DSL.name("pg_sequence_seqrelid_index"), new TableField[] { PgSequence.PG_SEQUENCE.SEQRELID }, true);
    public static final UniqueKey<PgShdescriptionRecord> PG_SHDESCRIPTION_O_C_INDEX = Internal.createUniqueKey(PgShdescription.PG_SHDESCRIPTION, DSL.name("pg_shdescription_o_c_index"), new TableField[] { PgShdescription.PG_SHDESCRIPTION.OBJOID, PgShdescription.PG_SHDESCRIPTION.CLASSOID }, true);
    public static final UniqueKey<PgShseclabelRecord> PG_SHSECLABEL_OBJECT_INDEX = Internal.createUniqueKey(PgShseclabel.PG_SHSECLABEL, DSL.name("pg_shseclabel_object_index"), new TableField[] { PgShseclabel.PG_SHSECLABEL.OBJOID, PgShseclabel.PG_SHSECLABEL.CLASSOID, PgShseclabel.PG_SHSECLABEL.PROVIDER }, true);
    public static final UniqueKey<PgStatisticRecord> PG_STATISTIC_RELID_ATT_INH_INDEX = Internal.createUniqueKey(PgStatistic.PG_STATISTIC, DSL.name("pg_statistic_relid_att_inh_index"), new TableField[] { PgStatistic.PG_STATISTIC.STARELID, PgStatistic.PG_STATISTIC.STAATTNUM, PgStatistic.PG_STATISTIC.STAINHERIT }, true);
    public static final UniqueKey<PgStatisticExtRecord> PG_STATISTIC_EXT_NAME_INDEX = Internal.createUniqueKey(PgStatisticExt.PG_STATISTIC_EXT, DSL.name("pg_statistic_ext_name_index"), new TableField[] { PgStatisticExt.PG_STATISTIC_EXT.STXNAME, PgStatisticExt.PG_STATISTIC_EXT.STXNAMESPACE }, true);
    public static final UniqueKey<PgStatisticExtRecord> PG_STATISTIC_EXT_OID_INDEX = Internal.createUniqueKey(PgStatisticExt.PG_STATISTIC_EXT, DSL.name("pg_statistic_ext_oid_index"), new TableField[] { PgStatisticExt.PG_STATISTIC_EXT.OID }, true);
    public static final UniqueKey<PgStatisticExtDataRecord> PG_STATISTIC_EXT_DATA_STXOID_INH_INDEX = Internal.createUniqueKey(PgStatisticExtData.PG_STATISTIC_EXT_DATA, DSL.name("pg_statistic_ext_data_stxoid_inh_index"), new TableField[] { PgStatisticExtData.PG_STATISTIC_EXT_DATA.STXOID, PgStatisticExtData.PG_STATISTIC_EXT_DATA.STXDINHERIT }, true);
    public static final UniqueKey<PgSubscriptionRecord> PG_SUBSCRIPTION_OID_INDEX = Internal.createUniqueKey(PgSubscription.PG_SUBSCRIPTION, DSL.name("pg_subscription_oid_index"), new TableField[] { PgSubscription.PG_SUBSCRIPTION.OID }, true);
    public static final UniqueKey<PgSubscriptionRecord> PG_SUBSCRIPTION_SUBNAME_INDEX = Internal.createUniqueKey(PgSubscription.PG_SUBSCRIPTION, DSL.name("pg_subscription_subname_index"), new TableField[] { PgSubscription.PG_SUBSCRIPTION.SUBDBID, PgSubscription.PG_SUBSCRIPTION.SUBNAME }, true);
    public static final UniqueKey<PgSubscriptionRelRecord> PG_SUBSCRIPTION_REL_SRRELID_SRSUBID_INDEX = Internal.createUniqueKey(PgSubscriptionRel.PG_SUBSCRIPTION_REL, DSL.name("pg_subscription_rel_srrelid_srsubid_index"), new TableField[] { PgSubscriptionRel.PG_SUBSCRIPTION_REL.SRRELID, PgSubscriptionRel.PG_SUBSCRIPTION_REL.SRSUBID }, true);
    public static final UniqueKey<PgTablespaceRecord> PG_TABLESPACE_OID_INDEX = Internal.createUniqueKey(PgTablespace.PG_TABLESPACE, DSL.name("pg_tablespace_oid_index"), new TableField[] { PgTablespace.PG_TABLESPACE.OID }, true);
    public static final UniqueKey<PgTablespaceRecord> PG_TABLESPACE_SPCNAME_INDEX = Internal.createUniqueKey(PgTablespace.PG_TABLESPACE, DSL.name("pg_tablespace_spcname_index"), new TableField[] { PgTablespace.PG_TABLESPACE.SPCNAME }, true);
    public static final UniqueKey<PgTransformRecord> PG_TRANSFORM_OID_INDEX = Internal.createUniqueKey(PgTransform.PG_TRANSFORM, DSL.name("pg_transform_oid_index"), new TableField[] { PgTransform.PG_TRANSFORM.OID }, true);
    public static final UniqueKey<PgTransformRecord> PG_TRANSFORM_TYPE_LANG_INDEX = Internal.createUniqueKey(PgTransform.PG_TRANSFORM, DSL.name("pg_transform_type_lang_index"), new TableField[] { PgTransform.PG_TRANSFORM.TRFTYPE, PgTransform.PG_TRANSFORM.TRFLANG }, true);
    public static final UniqueKey<PgTriggerRecord> PG_TRIGGER_OID_INDEX = Internal.createUniqueKey(PgTrigger.PG_TRIGGER, DSL.name("pg_trigger_oid_index"), new TableField[] { PgTrigger.PG_TRIGGER.OID }, true);
    public static final UniqueKey<PgTriggerRecord> PG_TRIGGER_TGRELID_TGNAME_INDEX = Internal.createUniqueKey(PgTrigger.PG_TRIGGER, DSL.name("pg_trigger_tgrelid_tgname_index"), new TableField[] { PgTrigger.PG_TRIGGER.TGRELID, PgTrigger.PG_TRIGGER.TGNAME }, true);
    public static final UniqueKey<PgTsConfigRecord> PG_TS_CONFIG_CFGNAME_INDEX = Internal.createUniqueKey(PgTsConfig.PG_TS_CONFIG, DSL.name("pg_ts_config_cfgname_index"), new TableField[] { PgTsConfig.PG_TS_CONFIG.CFGNAME, PgTsConfig.PG_TS_CONFIG.CFGNAMESPACE }, true);
    public static final UniqueKey<PgTsConfigRecord> PG_TS_CONFIG_OID_INDEX = Internal.createUniqueKey(PgTsConfig.PG_TS_CONFIG, DSL.name("pg_ts_config_oid_index"), new TableField[] { PgTsConfig.PG_TS_CONFIG.OID }, true);
    public static final UniqueKey<PgTsConfigMapRecord> PG_TS_CONFIG_MAP_INDEX = Internal.createUniqueKey(PgTsConfigMap.PG_TS_CONFIG_MAP, DSL.name("pg_ts_config_map_index"), new TableField[] { PgTsConfigMap.PG_TS_CONFIG_MAP.MAPCFG, PgTsConfigMap.PG_TS_CONFIG_MAP.MAPTOKENTYPE, PgTsConfigMap.PG_TS_CONFIG_MAP.MAPSEQNO }, true);
    public static final UniqueKey<PgTsDictRecord> PG_TS_DICT_DICTNAME_INDEX = Internal.createUniqueKey(PgTsDict.PG_TS_DICT, DSL.name("pg_ts_dict_dictname_index"), new TableField[] { PgTsDict.PG_TS_DICT.DICTNAME, PgTsDict.PG_TS_DICT.DICTNAMESPACE }, true);
    public static final UniqueKey<PgTsDictRecord> PG_TS_DICT_OID_INDEX = Internal.createUniqueKey(PgTsDict.PG_TS_DICT, DSL.name("pg_ts_dict_oid_index"), new TableField[] { PgTsDict.PG_TS_DICT.OID }, true);
    public static final UniqueKey<PgTsParserRecord> PG_TS_PARSER_OID_INDEX = Internal.createUniqueKey(PgTsParser.PG_TS_PARSER, DSL.name("pg_ts_parser_oid_index"), new TableField[] { PgTsParser.PG_TS_PARSER.OID }, true);
    public static final UniqueKey<PgTsParserRecord> PG_TS_PARSER_PRSNAME_INDEX = Internal.createUniqueKey(PgTsParser.PG_TS_PARSER, DSL.name("pg_ts_parser_prsname_index"), new TableField[] { PgTsParser.PG_TS_PARSER.PRSNAME, PgTsParser.PG_TS_PARSER.PRSNAMESPACE }, true);
    public static final UniqueKey<PgTsTemplateRecord> PG_TS_TEMPLATE_OID_INDEX = Internal.createUniqueKey(PgTsTemplate.PG_TS_TEMPLATE, DSL.name("pg_ts_template_oid_index"), new TableField[] { PgTsTemplate.PG_TS_TEMPLATE.OID }, true);
    public static final UniqueKey<PgTsTemplateRecord> PG_TS_TEMPLATE_TMPLNAME_INDEX = Internal.createUniqueKey(PgTsTemplate.PG_TS_TEMPLATE, DSL.name("pg_ts_template_tmplname_index"), new TableField[] { PgTsTemplate.PG_TS_TEMPLATE.TMPLNAME, PgTsTemplate.PG_TS_TEMPLATE.TMPLNAMESPACE }, true);
    public static final UniqueKey<PgTypeRecord> PG_TYPE_OID_INDEX = Internal.createUniqueKey(PgType.PG_TYPE, DSL.name("pg_type_oid_index"), new TableField[] { PgType.PG_TYPE.OID }, true);
    public static final UniqueKey<PgTypeRecord> PG_TYPE_TYPNAME_NSP_INDEX = Internal.createUniqueKey(PgType.PG_TYPE, DSL.name("pg_type_typname_nsp_index"), new TableField[] { PgType.PG_TYPE.TYPNAME, PgType.PG_TYPE.TYPNAMESPACE }, true);
    public static final UniqueKey<PgUserMappingRecord> PG_USER_MAPPING_OID_INDEX = Internal.createUniqueKey(PgUserMapping.PG_USER_MAPPING, DSL.name("pg_user_mapping_oid_index"), new TableField[] { PgUserMapping.PG_USER_MAPPING.OID }, true);
    public static final UniqueKey<PgUserMappingRecord> PG_USER_MAPPING_USER_SERVER_INDEX = Internal.createUniqueKey(PgUserMapping.PG_USER_MAPPING, DSL.name("pg_user_mapping_user_server_index"), new TableField[] { PgUserMapping.PG_USER_MAPPING.UMUSER, PgUserMapping.PG_USER_MAPPING.UMSERVER }, true);
}
