/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.information_schema.tables;


import com.shop.jooq.db.information_schema.InformationSchema;
import com.shop.jooq.db.information_schema.tables.records.RoutinesRecord;

import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
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
public class Routines extends TableImpl<RoutinesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.routines</code>
     */
    public static final Routines ROUTINES = new Routines();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RoutinesRecord> getRecordType() {
        return RoutinesRecord.class;
    }

    /**
     * The column <code>information_schema.routines.specific_catalog</code>.
     */
    public final TableField<RoutinesRecord, String> SPECIFIC_CATALOG = createField(DSL.name("specific_catalog"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.specific_schema</code>.
     */
    public final TableField<RoutinesRecord, String> SPECIFIC_SCHEMA = createField(DSL.name("specific_schema"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.specific_name</code>.
     */
    public final TableField<RoutinesRecord, String> SPECIFIC_NAME = createField(DSL.name("specific_name"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.routine_catalog</code>.
     */
    public final TableField<RoutinesRecord, String> ROUTINE_CATALOG = createField(DSL.name("routine_catalog"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.routine_schema</code>.
     */
    public final TableField<RoutinesRecord, String> ROUTINE_SCHEMA = createField(DSL.name("routine_schema"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.routine_name</code>.
     */
    public final TableField<RoutinesRecord, String> ROUTINE_NAME = createField(DSL.name("routine_name"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.routine_type</code>.
     */
    public final TableField<RoutinesRecord, String> ROUTINE_TYPE = createField(DSL.name("routine_type"), com.shop.jooq.db.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.module_catalog</code>.
     */
    public final TableField<RoutinesRecord, String> MODULE_CATALOG = createField(DSL.name("module_catalog"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.module_schema</code>.
     */
    public final TableField<RoutinesRecord, String> MODULE_SCHEMA = createField(DSL.name("module_schema"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.module_name</code>.
     */
    public final TableField<RoutinesRecord, String> MODULE_NAME = createField(DSL.name("module_name"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.udt_catalog</code>.
     */
    public final TableField<RoutinesRecord, String> UDT_CATALOG = createField(DSL.name("udt_catalog"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.udt_schema</code>.
     */
    public final TableField<RoutinesRecord, String> UDT_SCHEMA = createField(DSL.name("udt_schema"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.udt_name</code>.
     */
    public final TableField<RoutinesRecord, String> UDT_NAME = createField(DSL.name("udt_name"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.data_type</code>.
     */
    public final TableField<RoutinesRecord, String> DATA_TYPE = createField(DSL.name("data_type"), com.shop.jooq.db.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.character_maximum_length</code>.
     */
    public final TableField<RoutinesRecord, Integer> CHARACTER_MAXIMUM_LENGTH = createField(DSL.name("character_maximum_length"), com.shop.jooq.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.character_octet_length</code>.
     */
    public final TableField<RoutinesRecord, Integer> CHARACTER_OCTET_LENGTH = createField(DSL.name("character_octet_length"), com.shop.jooq.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.character_set_catalog</code>.
     */
    public final TableField<RoutinesRecord, String> CHARACTER_SET_CATALOG = createField(DSL.name("character_set_catalog"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.character_set_schema</code>.
     */
    public final TableField<RoutinesRecord, String> CHARACTER_SET_SCHEMA = createField(DSL.name("character_set_schema"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.character_set_name</code>.
     */
    public final TableField<RoutinesRecord, String> CHARACTER_SET_NAME = createField(DSL.name("character_set_name"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.collation_catalog</code>.
     */
    public final TableField<RoutinesRecord, String> COLLATION_CATALOG = createField(DSL.name("collation_catalog"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.collation_schema</code>.
     */
    public final TableField<RoutinesRecord, String> COLLATION_SCHEMA = createField(DSL.name("collation_schema"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.collation_name</code>.
     */
    public final TableField<RoutinesRecord, String> COLLATION_NAME = createField(DSL.name("collation_name"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.numeric_precision</code>.
     */
    public final TableField<RoutinesRecord, Integer> NUMERIC_PRECISION = createField(DSL.name("numeric_precision"), com.shop.jooq.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.numeric_precision_radix</code>.
     */
    public final TableField<RoutinesRecord, Integer> NUMERIC_PRECISION_RADIX = createField(DSL.name("numeric_precision_radix"), com.shop.jooq.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.numeric_scale</code>.
     */
    public final TableField<RoutinesRecord, Integer> NUMERIC_SCALE = createField(DSL.name("numeric_scale"), com.shop.jooq.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.datetime_precision</code>.
     */
    public final TableField<RoutinesRecord, Integer> DATETIME_PRECISION = createField(DSL.name("datetime_precision"), com.shop.jooq.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.interval_type</code>.
     */
    public final TableField<RoutinesRecord, String> INTERVAL_TYPE = createField(DSL.name("interval_type"), com.shop.jooq.db.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.interval_precision</code>.
     */
    public final TableField<RoutinesRecord, Integer> INTERVAL_PRECISION = createField(DSL.name("interval_precision"), com.shop.jooq.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.type_udt_catalog</code>.
     */
    public final TableField<RoutinesRecord, String> TYPE_UDT_CATALOG = createField(DSL.name("type_udt_catalog"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.type_udt_schema</code>.
     */
    public final TableField<RoutinesRecord, String> TYPE_UDT_SCHEMA = createField(DSL.name("type_udt_schema"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.type_udt_name</code>.
     */
    public final TableField<RoutinesRecord, String> TYPE_UDT_NAME = createField(DSL.name("type_udt_name"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.scope_catalog</code>.
     */
    public final TableField<RoutinesRecord, String> SCOPE_CATALOG = createField(DSL.name("scope_catalog"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.scope_schema</code>.
     */
    public final TableField<RoutinesRecord, String> SCOPE_SCHEMA = createField(DSL.name("scope_schema"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.scope_name</code>.
     */
    public final TableField<RoutinesRecord, String> SCOPE_NAME = createField(DSL.name("scope_name"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.maximum_cardinality</code>.
     */
    public final TableField<RoutinesRecord, Integer> MAXIMUM_CARDINALITY = createField(DSL.name("maximum_cardinality"), com.shop.jooq.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.dtd_identifier</code>.
     */
    public final TableField<RoutinesRecord, String> DTD_IDENTIFIER = createField(DSL.name("dtd_identifier"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.routine_body</code>.
     */
    public final TableField<RoutinesRecord, String> ROUTINE_BODY = createField(DSL.name("routine_body"), com.shop.jooq.db.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.routine_definition</code>.
     */
    public final TableField<RoutinesRecord, String> ROUTINE_DEFINITION = createField(DSL.name("routine_definition"), com.shop.jooq.db.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.external_name</code>.
     */
    public final TableField<RoutinesRecord, String> EXTERNAL_NAME = createField(DSL.name("external_name"), com.shop.jooq.db.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.external_language</code>.
     */
    public final TableField<RoutinesRecord, String> EXTERNAL_LANGUAGE = createField(DSL.name("external_language"), com.shop.jooq.db.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.parameter_style</code>.
     */
    public final TableField<RoutinesRecord, String> PARAMETER_STYLE = createField(DSL.name("parameter_style"), com.shop.jooq.db.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.is_deterministic</code>.
     */
    public final TableField<RoutinesRecord, String> IS_DETERMINISTIC = createField(DSL.name("is_deterministic"), com.shop.jooq.db.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.sql_data_access</code>.
     */
    public final TableField<RoutinesRecord, String> SQL_DATA_ACCESS = createField(DSL.name("sql_data_access"), com.shop.jooq.db.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.is_null_call</code>.
     */
    public final TableField<RoutinesRecord, String> IS_NULL_CALL = createField(DSL.name("is_null_call"), com.shop.jooq.db.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.sql_path</code>.
     */
    public final TableField<RoutinesRecord, String> SQL_PATH = createField(DSL.name("sql_path"), com.shop.jooq.db.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.schema_level_routine</code>.
     */
    public final TableField<RoutinesRecord, String> SCHEMA_LEVEL_ROUTINE = createField(DSL.name("schema_level_routine"), com.shop.jooq.db.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.max_dynamic_result_sets</code>.
     */
    public final TableField<RoutinesRecord, Integer> MAX_DYNAMIC_RESULT_SETS = createField(DSL.name("max_dynamic_result_sets"), com.shop.jooq.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.is_user_defined_cast</code>.
     */
    public final TableField<RoutinesRecord, String> IS_USER_DEFINED_CAST = createField(DSL.name("is_user_defined_cast"), com.shop.jooq.db.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.is_implicitly_invocable</code>.
     */
    public final TableField<RoutinesRecord, String> IS_IMPLICITLY_INVOCABLE = createField(DSL.name("is_implicitly_invocable"), com.shop.jooq.db.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.security_type</code>.
     */
    public final TableField<RoutinesRecord, String> SECURITY_TYPE = createField(DSL.name("security_type"), com.shop.jooq.db.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.to_sql_specific_catalog</code>.
     */
    public final TableField<RoutinesRecord, String> TO_SQL_SPECIFIC_CATALOG = createField(DSL.name("to_sql_specific_catalog"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.to_sql_specific_schema</code>.
     */
    public final TableField<RoutinesRecord, String> TO_SQL_SPECIFIC_SCHEMA = createField(DSL.name("to_sql_specific_schema"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.to_sql_specific_name</code>.
     */
    public final TableField<RoutinesRecord, String> TO_SQL_SPECIFIC_NAME = createField(DSL.name("to_sql_specific_name"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.as_locator</code>.
     */
    public final TableField<RoutinesRecord, String> AS_LOCATOR = createField(DSL.name("as_locator"), com.shop.jooq.db.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.created</code>.
     */
    public final TableField<RoutinesRecord, OffsetDateTime> CREATED = createField(DSL.name("created"), com.shop.jooq.db.information_schema.Domains.TIME_STAMP.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.last_altered</code>.
     */
    public final TableField<RoutinesRecord, OffsetDateTime> LAST_ALTERED = createField(DSL.name("last_altered"), com.shop.jooq.db.information_schema.Domains.TIME_STAMP.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.new_savepoint_level</code>.
     */
    public final TableField<RoutinesRecord, String> NEW_SAVEPOINT_LEVEL = createField(DSL.name("new_savepoint_level"), com.shop.jooq.db.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    /**
     * The column <code>information_schema.routines.is_udt_dependent</code>.
     */
    public final TableField<RoutinesRecord, String> IS_UDT_DEPENDENT = createField(DSL.name("is_udt_dependent"), com.shop.jooq.db.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_from_data_type</code>.
     */
    public final TableField<RoutinesRecord, String> RESULT_CAST_FROM_DATA_TYPE = createField(DSL.name("result_cast_from_data_type"), com.shop.jooq.db.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_as_locator</code>.
     */
    public final TableField<RoutinesRecord, String> RESULT_CAST_AS_LOCATOR = createField(DSL.name("result_cast_as_locator"), com.shop.jooq.db.information_schema.Domains.YES_OR_NO.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_char_max_length</code>.
     */
    public final TableField<RoutinesRecord, Integer> RESULT_CAST_CHAR_MAX_LENGTH = createField(DSL.name("result_cast_char_max_length"), com.shop.jooq.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_char_octet_length</code>.
     */
    public final TableField<RoutinesRecord, Integer> RESULT_CAST_CHAR_OCTET_LENGTH = createField(DSL.name("result_cast_char_octet_length"), com.shop.jooq.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_char_set_catalog</code>.
     */
    public final TableField<RoutinesRecord, String> RESULT_CAST_CHAR_SET_CATALOG = createField(DSL.name("result_cast_char_set_catalog"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_char_set_schema</code>.
     */
    public final TableField<RoutinesRecord, String> RESULT_CAST_CHAR_SET_SCHEMA = createField(DSL.name("result_cast_char_set_schema"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_char_set_name</code>.
     */
    public final TableField<RoutinesRecord, String> RESULT_CAST_CHAR_SET_NAME = createField(DSL.name("result_cast_char_set_name"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_collation_catalog</code>.
     */
    public final TableField<RoutinesRecord, String> RESULT_CAST_COLLATION_CATALOG = createField(DSL.name("result_cast_collation_catalog"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_collation_schema</code>.
     */
    public final TableField<RoutinesRecord, String> RESULT_CAST_COLLATION_SCHEMA = createField(DSL.name("result_cast_collation_schema"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_collation_name</code>.
     */
    public final TableField<RoutinesRecord, String> RESULT_CAST_COLLATION_NAME = createField(DSL.name("result_cast_collation_name"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_numeric_precision</code>.
     */
    public final TableField<RoutinesRecord, Integer> RESULT_CAST_NUMERIC_PRECISION = createField(DSL.name("result_cast_numeric_precision"), com.shop.jooq.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_numeric_precision_radix</code>.
     */
    public final TableField<RoutinesRecord, Integer> RESULT_CAST_NUMERIC_PRECISION_RADIX = createField(DSL.name("result_cast_numeric_precision_radix"), com.shop.jooq.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_numeric_scale</code>.
     */
    public final TableField<RoutinesRecord, Integer> RESULT_CAST_NUMERIC_SCALE = createField(DSL.name("result_cast_numeric_scale"), com.shop.jooq.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_datetime_precision</code>.
     */
    public final TableField<RoutinesRecord, Integer> RESULT_CAST_DATETIME_PRECISION = createField(DSL.name("result_cast_datetime_precision"), com.shop.jooq.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_interval_type</code>.
     */
    public final TableField<RoutinesRecord, String> RESULT_CAST_INTERVAL_TYPE = createField(DSL.name("result_cast_interval_type"), com.shop.jooq.db.information_schema.Domains.CHARACTER_DATA.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_interval_precision</code>.
     */
    public final TableField<RoutinesRecord, Integer> RESULT_CAST_INTERVAL_PRECISION = createField(DSL.name("result_cast_interval_precision"), com.shop.jooq.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_type_udt_catalog</code>.
     */
    public final TableField<RoutinesRecord, String> RESULT_CAST_TYPE_UDT_CATALOG = createField(DSL.name("result_cast_type_udt_catalog"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_type_udt_schema</code>.
     */
    public final TableField<RoutinesRecord, String> RESULT_CAST_TYPE_UDT_SCHEMA = createField(DSL.name("result_cast_type_udt_schema"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_type_udt_name</code>.
     */
    public final TableField<RoutinesRecord, String> RESULT_CAST_TYPE_UDT_NAME = createField(DSL.name("result_cast_type_udt_name"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_scope_catalog</code>.
     */
    public final TableField<RoutinesRecord, String> RESULT_CAST_SCOPE_CATALOG = createField(DSL.name("result_cast_scope_catalog"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_scope_schema</code>.
     */
    public final TableField<RoutinesRecord, String> RESULT_CAST_SCOPE_SCHEMA = createField(DSL.name("result_cast_scope_schema"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_scope_name</code>.
     */
    public final TableField<RoutinesRecord, String> RESULT_CAST_SCOPE_NAME = createField(DSL.name("result_cast_scope_name"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_maximum_cardinality</code>.
     */
    public final TableField<RoutinesRecord, Integer> RESULT_CAST_MAXIMUM_CARDINALITY = createField(DSL.name("result_cast_maximum_cardinality"), com.shop.jooq.db.information_schema.Domains.CARDINAL_NUMBER.getDataType(), this, "");

    /**
     * The column
     * <code>information_schema.routines.result_cast_dtd_identifier</code>.
     */
    public final TableField<RoutinesRecord, String> RESULT_CAST_DTD_IDENTIFIER = createField(DSL.name("result_cast_dtd_identifier"), com.shop.jooq.db.information_schema.Domains.SQL_IDENTIFIER.getDataType(), this, "");

    private Routines(Name alias, Table<RoutinesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Routines(Name alias, Table<RoutinesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"routines\" as  SELECT (current_database())::information_schema.sql_identifier AS specific_catalog,\n    (n.nspname)::information_schema.sql_identifier AS specific_schema,\n    (nameconcatoid(p.proname, p.oid))::information_schema.sql_identifier AS specific_name,\n    (current_database())::information_schema.sql_identifier AS routine_catalog,\n    (n.nspname)::information_schema.sql_identifier AS routine_schema,\n    (p.proname)::information_schema.sql_identifier AS routine_name,\n    (\n        CASE p.prokind\n            WHEN 'f'::\"char\" THEN 'FUNCTION'::text\n            WHEN 'p'::\"char\" THEN 'PROCEDURE'::text\n            ELSE NULL::text\n        END)::information_schema.character_data AS routine_type,\n    (NULL::name)::information_schema.sql_identifier AS module_catalog,\n    (NULL::name)::information_schema.sql_identifier AS module_schema,\n    (NULL::name)::information_schema.sql_identifier AS module_name,\n    (NULL::name)::information_schema.sql_identifier AS udt_catalog,\n    (NULL::name)::information_schema.sql_identifier AS udt_schema,\n    (NULL::name)::information_schema.sql_identifier AS udt_name,\n    (\n        CASE\n            WHEN (p.prokind = 'p'::\"char\") THEN NULL::text\n            WHEN ((t.typelem <> (0)::oid) AND (t.typlen = '-1'::integer)) THEN 'ARRAY'::text\n            WHEN (nt.nspname = 'pg_catalog'::name) THEN format_type(t.oid, NULL::integer)\n            ELSE 'USER-DEFINED'::text\n        END)::information_schema.character_data AS data_type,\n    (NULL::integer)::information_schema.cardinal_number AS character_maximum_length,\n    (NULL::integer)::information_schema.cardinal_number AS character_octet_length,\n    (NULL::name)::information_schema.sql_identifier AS character_set_catalog,\n    (NULL::name)::information_schema.sql_identifier AS character_set_schema,\n    (NULL::name)::information_schema.sql_identifier AS character_set_name,\n    (NULL::name)::information_schema.sql_identifier AS collation_catalog,\n    (NULL::name)::information_schema.sql_identifier AS collation_schema,\n    (NULL::name)::information_schema.sql_identifier AS collation_name,\n    (NULL::integer)::information_schema.cardinal_number AS numeric_precision,\n    (NULL::integer)::information_schema.cardinal_number AS numeric_precision_radix,\n    (NULL::integer)::information_schema.cardinal_number AS numeric_scale,\n    (NULL::integer)::information_schema.cardinal_number AS datetime_precision,\n    (NULL::character varying)::information_schema.character_data AS interval_type,\n    (NULL::integer)::information_schema.cardinal_number AS interval_precision,\n    (\n        CASE\n            WHEN (nt.nspname IS NOT NULL) THEN current_database()\n            ELSE NULL::name\n        END)::information_schema.sql_identifier AS type_udt_catalog,\n    (nt.nspname)::information_schema.sql_identifier AS type_udt_schema,\n    (t.typname)::information_schema.sql_identifier AS type_udt_name,\n    (NULL::name)::information_schema.sql_identifier AS scope_catalog,\n    (NULL::name)::information_schema.sql_identifier AS scope_schema,\n    (NULL::name)::information_schema.sql_identifier AS scope_name,\n    (NULL::integer)::information_schema.cardinal_number AS maximum_cardinality,\n    (\n        CASE\n            WHEN (p.prokind <> 'p'::\"char\") THEN 0\n            ELSE NULL::integer\n        END)::information_schema.sql_identifier AS dtd_identifier,\n    (\n        CASE\n            WHEN (l.lanname = 'sql'::name) THEN 'SQL'::text\n            ELSE 'EXTERNAL'::text\n        END)::information_schema.character_data AS routine_body,\n    (\n        CASE\n            WHEN pg_has_role(p.proowner, 'USAGE'::text) THEN p.prosrc\n            ELSE NULL::text\n        END)::information_schema.character_data AS routine_definition,\n    (\n        CASE\n            WHEN (l.lanname = 'c'::name) THEN p.prosrc\n            ELSE NULL::text\n        END)::information_schema.character_data AS external_name,\n    (upper((l.lanname)::text))::information_schema.character_data AS external_language,\n    ('GENERAL'::character varying)::information_schema.character_data AS parameter_style,\n    (\n        CASE\n            WHEN (p.provolatile = 'i'::\"char\") THEN 'YES'::text\n            ELSE 'NO'::text\n        END)::information_schema.yes_or_no AS is_deterministic,\n    ('MODIFIES'::character varying)::information_schema.character_data AS sql_data_access,\n    (\n        CASE\n            WHEN (p.prokind <> 'p'::\"char\") THEN\n            CASE\n                WHEN p.proisstrict THEN 'YES'::text\n                ELSE 'NO'::text\n            END\n            ELSE NULL::text\n        END)::information_schema.yes_or_no AS is_null_call,\n    (NULL::character varying)::information_schema.character_data AS sql_path,\n    ('YES'::character varying)::information_schema.yes_or_no AS schema_level_routine,\n    (0)::information_schema.cardinal_number AS max_dynamic_result_sets,\n    (NULL::character varying)::information_schema.yes_or_no AS is_user_defined_cast,\n    (NULL::character varying)::information_schema.yes_or_no AS is_implicitly_invocable,\n    (\n        CASE\n            WHEN p.prosecdef THEN 'DEFINER'::text\n            ELSE 'INVOKER'::text\n        END)::information_schema.character_data AS security_type,\n    (NULL::name)::information_schema.sql_identifier AS to_sql_specific_catalog,\n    (NULL::name)::information_schema.sql_identifier AS to_sql_specific_schema,\n    (NULL::name)::information_schema.sql_identifier AS to_sql_specific_name,\n    ('NO'::character varying)::information_schema.yes_or_no AS as_locator,\n    (NULL::timestamp with time zone)::information_schema.time_stamp AS created,\n    (NULL::timestamp with time zone)::information_schema.time_stamp AS last_altered,\n    (NULL::character varying)::information_schema.yes_or_no AS new_savepoint_level,\n    ('NO'::character varying)::information_schema.yes_or_no AS is_udt_dependent,\n    (NULL::character varying)::information_schema.character_data AS result_cast_from_data_type,\n    (NULL::character varying)::information_schema.yes_or_no AS result_cast_as_locator,\n    (NULL::integer)::information_schema.cardinal_number AS result_cast_char_max_length,\n    (NULL::integer)::information_schema.cardinal_number AS result_cast_char_octet_length,\n    (NULL::name)::information_schema.sql_identifier AS result_cast_char_set_catalog,\n    (NULL::name)::information_schema.sql_identifier AS result_cast_char_set_schema,\n    (NULL::name)::information_schema.sql_identifier AS result_cast_char_set_name,\n    (NULL::name)::information_schema.sql_identifier AS result_cast_collation_catalog,\n    (NULL::name)::information_schema.sql_identifier AS result_cast_collation_schema,\n    (NULL::name)::information_schema.sql_identifier AS result_cast_collation_name,\n    (NULL::integer)::information_schema.cardinal_number AS result_cast_numeric_precision,\n    (NULL::integer)::information_schema.cardinal_number AS result_cast_numeric_precision_radix,\n    (NULL::integer)::information_schema.cardinal_number AS result_cast_numeric_scale,\n    (NULL::integer)::information_schema.cardinal_number AS result_cast_datetime_precision,\n    (NULL::character varying)::information_schema.character_data AS result_cast_interval_type,\n    (NULL::integer)::information_schema.cardinal_number AS result_cast_interval_precision,\n    (NULL::name)::information_schema.sql_identifier AS result_cast_type_udt_catalog,\n    (NULL::name)::information_schema.sql_identifier AS result_cast_type_udt_schema,\n    (NULL::name)::information_schema.sql_identifier AS result_cast_type_udt_name,\n    (NULL::name)::information_schema.sql_identifier AS result_cast_scope_catalog,\n    (NULL::name)::information_schema.sql_identifier AS result_cast_scope_schema,\n    (NULL::name)::information_schema.sql_identifier AS result_cast_scope_name,\n    (NULL::integer)::information_schema.cardinal_number AS result_cast_maximum_cardinality,\n    (NULL::name)::information_schema.sql_identifier AS result_cast_dtd_identifier\n   FROM (((pg_namespace n\n     JOIN pg_proc p ON ((n.oid = p.pronamespace)))\n     JOIN pg_language l ON ((p.prolang = l.oid)))\n     LEFT JOIN (pg_type t\n     JOIN pg_namespace nt ON ((t.typnamespace = nt.oid))) ON (((p.prorettype = t.oid) AND (p.prokind <> 'p'::\"char\"))))\n  WHERE (pg_has_role(p.proowner, 'USAGE'::text) OR has_function_privilege(p.oid, 'EXECUTE'::text));"));
    }

    /**
     * Create an aliased <code>information_schema.routines</code> table
     * reference
     */
    public Routines(String alias) {
        this(DSL.name(alias), ROUTINES);
    }

    /**
     * Create an aliased <code>information_schema.routines</code> table
     * reference
     */
    public Routines(Name alias) {
        this(alias, ROUTINES);
    }

    /**
     * Create a <code>information_schema.routines</code> table reference
     */
    public Routines() {
        this(DSL.name("routines"), null);
    }

    public <O extends Record> Routines(Table<O> child, ForeignKey<O, RoutinesRecord> key) {
        super(child, key, ROUTINES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Routines as(String alias) {
        return new Routines(DSL.name(alias), this);
    }

    @Override
    public Routines as(Name alias) {
        return new Routines(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Routines rename(String name) {
        return new Routines(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Routines rename(Name name) {
        return new Routines(name, null);
    }
}
