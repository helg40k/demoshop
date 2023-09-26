/*
 * This file is generated by jOOQ.
 */
package com.shop.jooq.db.pg_catalog.tables.records;


import com.shop.jooq.db.pg_catalog.tables.PgStatsExtExprs;

import org.jooq.Field;
import org.jooq.Record17;
import org.jooq.Row17;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgStatsExtExprsRecord extends TableRecordImpl<PgStatsExtExprsRecord> implements Record17<String, String, String, String, String, String, Boolean, Float, Integer, Float, Object[], Float[], Object[], Float, Object[], Float[], Float[]> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>pg_catalog.pg_stats_ext_exprs.schemaname</code>.
     */
    public void setSchemaname(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats_ext_exprs.schemaname</code>.
     */
    public String getSchemaname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats_ext_exprs.tablename</code>.
     */
    public void setTablename(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats_ext_exprs.tablename</code>.
     */
    public String getTablename() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stats_ext_exprs.statistics_schemaname</code>.
     */
    public void setStatisticsSchemaname(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stats_ext_exprs.statistics_schemaname</code>.
     */
    public String getStatisticsSchemaname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats_ext_exprs.statistics_name</code>.
     */
    public void setStatisticsName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats_ext_exprs.statistics_name</code>.
     */
    public String getStatisticsName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats_ext_exprs.statistics_owner</code>.
     */
    public void setStatisticsOwner(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats_ext_exprs.statistics_owner</code>.
     */
    public String getStatisticsOwner() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats_ext_exprs.expr</code>.
     */
    public void setExpr(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats_ext_exprs.expr</code>.
     */
    public String getExpr() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats_ext_exprs.inherited</code>.
     */
    public void setInherited(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats_ext_exprs.inherited</code>.
     */
    public Boolean getInherited() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats_ext_exprs.null_frac</code>.
     */
    public void setNullFrac(Float value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats_ext_exprs.null_frac</code>.
     */
    public Float getNullFrac() {
        return (Float) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats_ext_exprs.avg_width</code>.
     */
    public void setAvgWidth(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats_ext_exprs.avg_width</code>.
     */
    public Integer getAvgWidth() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats_ext_exprs.n_distinct</code>.
     */
    public void setNDistinct(Float value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats_ext_exprs.n_distinct</code>.
     */
    public Float getNDistinct() {
        return (Float) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats_ext_exprs.most_common_vals</code>.
     */
    public void setMostCommonVals(Object[] value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats_ext_exprs.most_common_vals</code>.
     */
    public Object[] getMostCommonVals() {
        return (Object[]) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats_ext_exprs.most_common_freqs</code>.
     */
    public void setMostCommonFreqs(Float[] value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats_ext_exprs.most_common_freqs</code>.
     */
    public Float[] getMostCommonFreqs() {
        return (Float[]) get(11);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats_ext_exprs.histogram_bounds</code>.
     */
    public void setHistogramBounds(Object[] value) {
        set(12, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats_ext_exprs.histogram_bounds</code>.
     */
    public Object[] getHistogramBounds() {
        return (Object[]) get(12);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats_ext_exprs.correlation</code>.
     */
    public void setCorrelation(Float value) {
        set(13, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats_ext_exprs.correlation</code>.
     */
    public Float getCorrelation() {
        return (Float) get(13);
    }

    /**
     * Setter for <code>pg_catalog.pg_stats_ext_exprs.most_common_elems</code>.
     */
    public void setMostCommonElems(Object[] value) {
        set(14, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stats_ext_exprs.most_common_elems</code>.
     */
    public Object[] getMostCommonElems() {
        return (Object[]) get(14);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stats_ext_exprs.most_common_elem_freqs</code>.
     */
    public void setMostCommonElemFreqs(Float[] value) {
        set(15, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stats_ext_exprs.most_common_elem_freqs</code>.
     */
    public Float[] getMostCommonElemFreqs() {
        return (Float[]) get(15);
    }

    /**
     * Setter for
     * <code>pg_catalog.pg_stats_ext_exprs.elem_count_histogram</code>.
     */
    public void setElemCountHistogram(Float[] value) {
        set(16, value);
    }

    /**
     * Getter for
     * <code>pg_catalog.pg_stats_ext_exprs.elem_count_histogram</code>.
     */
    public Float[] getElemCountHistogram() {
        return (Float[]) get(16);
    }

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row17<String, String, String, String, String, String, Boolean, Float, Integer, Float, Object[], Float[], Object[], Float, Object[], Float[], Float[]> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    @Override
    public Row17<String, String, String, String, String, String, Boolean, Float, Integer, Float, Object[], Float[], Object[], Float, Object[], Float[], Float[]> valuesRow() {
        return (Row17) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return PgStatsExtExprs.PG_STATS_EXT_EXPRS.SCHEMANAME;
    }

    @Override
    public Field<String> field2() {
        return PgStatsExtExprs.PG_STATS_EXT_EXPRS.TABLENAME;
    }

    @Override
    public Field<String> field3() {
        return PgStatsExtExprs.PG_STATS_EXT_EXPRS.STATISTICS_SCHEMANAME;
    }

    @Override
    public Field<String> field4() {
        return PgStatsExtExprs.PG_STATS_EXT_EXPRS.STATISTICS_NAME;
    }

    @Override
    public Field<String> field5() {
        return PgStatsExtExprs.PG_STATS_EXT_EXPRS.STATISTICS_OWNER;
    }

    @Override
    public Field<String> field6() {
        return PgStatsExtExprs.PG_STATS_EXT_EXPRS.EXPR;
    }

    @Override
    public Field<Boolean> field7() {
        return PgStatsExtExprs.PG_STATS_EXT_EXPRS.INHERITED;
    }

    @Override
    public Field<Float> field8() {
        return PgStatsExtExprs.PG_STATS_EXT_EXPRS.NULL_FRAC;
    }

    @Override
    public Field<Integer> field9() {
        return PgStatsExtExprs.PG_STATS_EXT_EXPRS.AVG_WIDTH;
    }

    @Override
    public Field<Float> field10() {
        return PgStatsExtExprs.PG_STATS_EXT_EXPRS.N_DISTINCT;
    }

    @Override
    public Field<Object[]> field11() {
        return PgStatsExtExprs.PG_STATS_EXT_EXPRS.MOST_COMMON_VALS;
    }

    @Override
    public Field<Float[]> field12() {
        return PgStatsExtExprs.PG_STATS_EXT_EXPRS.MOST_COMMON_FREQS;
    }

    @Override
    public Field<Object[]> field13() {
        return PgStatsExtExprs.PG_STATS_EXT_EXPRS.HISTOGRAM_BOUNDS;
    }

    @Override
    public Field<Float> field14() {
        return PgStatsExtExprs.PG_STATS_EXT_EXPRS.CORRELATION;
    }

    @Override
    public Field<Object[]> field15() {
        return PgStatsExtExprs.PG_STATS_EXT_EXPRS.MOST_COMMON_ELEMS;
    }

    @Override
    public Field<Float[]> field16() {
        return PgStatsExtExprs.PG_STATS_EXT_EXPRS.MOST_COMMON_ELEM_FREQS;
    }

    @Override
    public Field<Float[]> field17() {
        return PgStatsExtExprs.PG_STATS_EXT_EXPRS.ELEM_COUNT_HISTOGRAM;
    }

    @Override
    public String component1() {
        return getSchemaname();
    }

    @Override
    public String component2() {
        return getTablename();
    }

    @Override
    public String component3() {
        return getStatisticsSchemaname();
    }

    @Override
    public String component4() {
        return getStatisticsName();
    }

    @Override
    public String component5() {
        return getStatisticsOwner();
    }

    @Override
    public String component6() {
        return getExpr();
    }

    @Override
    public Boolean component7() {
        return getInherited();
    }

    @Override
    public Float component8() {
        return getNullFrac();
    }

    @Override
    public Integer component9() {
        return getAvgWidth();
    }

    @Override
    public Float component10() {
        return getNDistinct();
    }

    @Override
    public Object[] component11() {
        return getMostCommonVals();
    }

    @Override
    public Float[] component12() {
        return getMostCommonFreqs();
    }

    @Override
    public Object[] component13() {
        return getHistogramBounds();
    }

    @Override
    public Float component14() {
        return getCorrelation();
    }

    @Override
    public Object[] component15() {
        return getMostCommonElems();
    }

    @Override
    public Float[] component16() {
        return getMostCommonElemFreqs();
    }

    @Override
    public Float[] component17() {
        return getElemCountHistogram();
    }

    @Override
    public String value1() {
        return getSchemaname();
    }

    @Override
    public String value2() {
        return getTablename();
    }

    @Override
    public String value3() {
        return getStatisticsSchemaname();
    }

    @Override
    public String value4() {
        return getStatisticsName();
    }

    @Override
    public String value5() {
        return getStatisticsOwner();
    }

    @Override
    public String value6() {
        return getExpr();
    }

    @Override
    public Boolean value7() {
        return getInherited();
    }

    @Override
    public Float value8() {
        return getNullFrac();
    }

    @Override
    public Integer value9() {
        return getAvgWidth();
    }

    @Override
    public Float value10() {
        return getNDistinct();
    }

    @Override
    public Object[] value11() {
        return getMostCommonVals();
    }

    @Override
    public Float[] value12() {
        return getMostCommonFreqs();
    }

    @Override
    public Object[] value13() {
        return getHistogramBounds();
    }

    @Override
    public Float value14() {
        return getCorrelation();
    }

    @Override
    public Object[] value15() {
        return getMostCommonElems();
    }

    @Override
    public Float[] value16() {
        return getMostCommonElemFreqs();
    }

    @Override
    public Float[] value17() {
        return getElemCountHistogram();
    }

    @Override
    public PgStatsExtExprsRecord value1(String value) {
        setSchemaname(value);
        return this;
    }

    @Override
    public PgStatsExtExprsRecord value2(String value) {
        setTablename(value);
        return this;
    }

    @Override
    public PgStatsExtExprsRecord value3(String value) {
        setStatisticsSchemaname(value);
        return this;
    }

    @Override
    public PgStatsExtExprsRecord value4(String value) {
        setStatisticsName(value);
        return this;
    }

    @Override
    public PgStatsExtExprsRecord value5(String value) {
        setStatisticsOwner(value);
        return this;
    }

    @Override
    public PgStatsExtExprsRecord value6(String value) {
        setExpr(value);
        return this;
    }

    @Override
    public PgStatsExtExprsRecord value7(Boolean value) {
        setInherited(value);
        return this;
    }

    @Override
    public PgStatsExtExprsRecord value8(Float value) {
        setNullFrac(value);
        return this;
    }

    @Override
    public PgStatsExtExprsRecord value9(Integer value) {
        setAvgWidth(value);
        return this;
    }

    @Override
    public PgStatsExtExprsRecord value10(Float value) {
        setNDistinct(value);
        return this;
    }

    @Override
    public PgStatsExtExprsRecord value11(Object[] value) {
        setMostCommonVals(value);
        return this;
    }

    @Override
    public PgStatsExtExprsRecord value12(Float[] value) {
        setMostCommonFreqs(value);
        return this;
    }

    @Override
    public PgStatsExtExprsRecord value13(Object[] value) {
        setHistogramBounds(value);
        return this;
    }

    @Override
    public PgStatsExtExprsRecord value14(Float value) {
        setCorrelation(value);
        return this;
    }

    @Override
    public PgStatsExtExprsRecord value15(Object[] value) {
        setMostCommonElems(value);
        return this;
    }

    @Override
    public PgStatsExtExprsRecord value16(Float[] value) {
        setMostCommonElemFreqs(value);
        return this;
    }

    @Override
    public PgStatsExtExprsRecord value17(Float[] value) {
        setElemCountHistogram(value);
        return this;
    }

    @Override
    public PgStatsExtExprsRecord values(String value1, String value2, String value3, String value4, String value5, String value6, Boolean value7, Float value8, Integer value9, Float value10, Object[] value11, Float[] value12, Object[] value13, Float value14, Object[] value15, Float[] value16, Float[] value17) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatsExtExprsRecord
     */
    public PgStatsExtExprsRecord() {
        super(PgStatsExtExprs.PG_STATS_EXT_EXPRS);
    }

    /**
     * Create a detached, initialised PgStatsExtExprsRecord
     */
    public PgStatsExtExprsRecord(String schemaname, String tablename, String statisticsSchemaname, String statisticsName, String statisticsOwner, String expr, Boolean inherited, Float nullFrac, Integer avgWidth, Float nDistinct, Object[] mostCommonVals, Float[] mostCommonFreqs, Object[] histogramBounds, Float correlation, Object[] mostCommonElems, Float[] mostCommonElemFreqs, Float[] elemCountHistogram) {
        super(PgStatsExtExprs.PG_STATS_EXT_EXPRS);

        setSchemaname(schemaname);
        setTablename(tablename);
        setStatisticsSchemaname(statisticsSchemaname);
        setStatisticsName(statisticsName);
        setStatisticsOwner(statisticsOwner);
        setExpr(expr);
        setInherited(inherited);
        setNullFrac(nullFrac);
        setAvgWidth(avgWidth);
        setNDistinct(nDistinct);
        setMostCommonVals(mostCommonVals);
        setMostCommonFreqs(mostCommonFreqs);
        setHistogramBounds(histogramBounds);
        setCorrelation(correlation);
        setMostCommonElems(mostCommonElems);
        setMostCommonElemFreqs(mostCommonElemFreqs);
        setElemCountHistogram(elemCountHistogram);
    }
}
