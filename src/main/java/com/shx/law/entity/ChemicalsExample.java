package com.shx.law.entity;

import java.util.ArrayList;
import java.util.List;

public class ChemicalsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChemicalsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andNameCnIsNull() {
            addCriterion("name_cn is null");
            return (Criteria) this;
        }

        public Criteria andNameCnIsNotNull() {
            addCriterion("name_cn is not null");
            return (Criteria) this;
        }

        public Criteria andNameCnEqualTo(String value) {
            addCriterion("name_cn =", value, "nameCn");
            return (Criteria) this;
        }

        public Criteria andNameCnNotEqualTo(String value) {
            addCriterion("name_cn <>", value, "nameCn");
            return (Criteria) this;
        }

        public Criteria andNameCnGreaterThan(String value) {
            addCriterion("name_cn >", value, "nameCn");
            return (Criteria) this;
        }

        public Criteria andNameCnGreaterThanOrEqualTo(String value) {
            addCriterion("name_cn >=", value, "nameCn");
            return (Criteria) this;
        }

        public Criteria andNameCnLessThan(String value) {
            addCriterion("name_cn <", value, "nameCn");
            return (Criteria) this;
        }

        public Criteria andNameCnLessThanOrEqualTo(String value) {
            addCriterion("name_cn <=", value, "nameCn");
            return (Criteria) this;
        }

        public Criteria andNameCnLike(String value) {
            addCriterion("name_cn like", value, "nameCn");
            return (Criteria) this;
        }

        public Criteria andNameCnNotLike(String value) {
            addCriterion("name_cn not like", value, "nameCn");
            return (Criteria) this;
        }

        public Criteria andNameCnIn(List<String> values) {
            addCriterion("name_cn in", values, "nameCn");
            return (Criteria) this;
        }

        public Criteria andNameCnNotIn(List<String> values) {
            addCriterion("name_cn not in", values, "nameCn");
            return (Criteria) this;
        }

        public Criteria andNameCnBetween(String value1, String value2) {
            addCriterion("name_cn between", value1, value2, "nameCn");
            return (Criteria) this;
        }

        public Criteria andNameCnNotBetween(String value1, String value2) {
            addCriterion("name_cn not between", value1, value2, "nameCn");
            return (Criteria) this;
        }

        public Criteria andNameEnIsNull() {
            addCriterion("name_en is null");
            return (Criteria) this;
        }

        public Criteria andNameEnIsNotNull() {
            addCriterion("name_en is not null");
            return (Criteria) this;
        }

        public Criteria andNameEnEqualTo(String value) {
            addCriterion("name_en =", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotEqualTo(String value) {
            addCriterion("name_en <>", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnGreaterThan(String value) {
            addCriterion("name_en >", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("name_en >=", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLessThan(String value) {
            addCriterion("name_en <", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLessThanOrEqualTo(String value) {
            addCriterion("name_en <=", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnLike(String value) {
            addCriterion("name_en like", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotLike(String value) {
            addCriterion("name_en not like", value, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnIn(List<String> values) {
            addCriterion("name_en in", values, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotIn(List<String> values) {
            addCriterion("name_en not in", values, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnBetween(String value1, String value2) {
            addCriterion("name_en between", value1, value2, "nameEn");
            return (Criteria) this;
        }

        public Criteria andNameEnNotBetween(String value1, String value2) {
            addCriterion("name_en not between", value1, value2, "nameEn");
            return (Criteria) this;
        }

        public Criteria andAliasCnIsNull() {
            addCriterion("alias_cn is null");
            return (Criteria) this;
        }

        public Criteria andAliasCnIsNotNull() {
            addCriterion("alias_cn is not null");
            return (Criteria) this;
        }

        public Criteria andAliasCnEqualTo(String value) {
            addCriterion("alias_cn =", value, "aliasCn");
            return (Criteria) this;
        }

        public Criteria andAliasCnNotEqualTo(String value) {
            addCriterion("alias_cn <>", value, "aliasCn");
            return (Criteria) this;
        }

        public Criteria andAliasCnGreaterThan(String value) {
            addCriterion("alias_cn >", value, "aliasCn");
            return (Criteria) this;
        }

        public Criteria andAliasCnGreaterThanOrEqualTo(String value) {
            addCriterion("alias_cn >=", value, "aliasCn");
            return (Criteria) this;
        }

        public Criteria andAliasCnLessThan(String value) {
            addCriterion("alias_cn <", value, "aliasCn");
            return (Criteria) this;
        }

        public Criteria andAliasCnLessThanOrEqualTo(String value) {
            addCriterion("alias_cn <=", value, "aliasCn");
            return (Criteria) this;
        }

        public Criteria andAliasCnLike(String value) {
            addCriterion("alias_cn like", value, "aliasCn");
            return (Criteria) this;
        }

        public Criteria andAliasCnNotLike(String value) {
            addCriterion("alias_cn not like", value, "aliasCn");
            return (Criteria) this;
        }

        public Criteria andAliasCnIn(List<String> values) {
            addCriterion("alias_cn in", values, "aliasCn");
            return (Criteria) this;
        }

        public Criteria andAliasCnNotIn(List<String> values) {
            addCriterion("alias_cn not in", values, "aliasCn");
            return (Criteria) this;
        }

        public Criteria andAliasCnBetween(String value1, String value2) {
            addCriterion("alias_cn between", value1, value2, "aliasCn");
            return (Criteria) this;
        }

        public Criteria andAliasCnNotBetween(String value1, String value2) {
            addCriterion("alias_cn not between", value1, value2, "aliasCn");
            return (Criteria) this;
        }

        public Criteria andAliasEnIsNull() {
            addCriterion("alias_en is null");
            return (Criteria) this;
        }

        public Criteria andAliasEnIsNotNull() {
            addCriterion("alias_en is not null");
            return (Criteria) this;
        }

        public Criteria andAliasEnEqualTo(String value) {
            addCriterion("alias_en =", value, "aliasEn");
            return (Criteria) this;
        }

        public Criteria andAliasEnNotEqualTo(String value) {
            addCriterion("alias_en <>", value, "aliasEn");
            return (Criteria) this;
        }

        public Criteria andAliasEnGreaterThan(String value) {
            addCriterion("alias_en >", value, "aliasEn");
            return (Criteria) this;
        }

        public Criteria andAliasEnGreaterThanOrEqualTo(String value) {
            addCriterion("alias_en >=", value, "aliasEn");
            return (Criteria) this;
        }

        public Criteria andAliasEnLessThan(String value) {
            addCriterion("alias_en <", value, "aliasEn");
            return (Criteria) this;
        }

        public Criteria andAliasEnLessThanOrEqualTo(String value) {
            addCriterion("alias_en <=", value, "aliasEn");
            return (Criteria) this;
        }

        public Criteria andAliasEnLike(String value) {
            addCriterion("alias_en like", value, "aliasEn");
            return (Criteria) this;
        }

        public Criteria andAliasEnNotLike(String value) {
            addCriterion("alias_en not like", value, "aliasEn");
            return (Criteria) this;
        }

        public Criteria andAliasEnIn(List<String> values) {
            addCriterion("alias_en in", values, "aliasEn");
            return (Criteria) this;
        }

        public Criteria andAliasEnNotIn(List<String> values) {
            addCriterion("alias_en not in", values, "aliasEn");
            return (Criteria) this;
        }

        public Criteria andAliasEnBetween(String value1, String value2) {
            addCriterion("alias_en between", value1, value2, "aliasEn");
            return (Criteria) this;
        }

        public Criteria andAliasEnNotBetween(String value1, String value2) {
            addCriterion("alias_en not between", value1, value2, "aliasEn");
            return (Criteria) this;
        }

        public Criteria andCasIsNull() {
            addCriterion("cas is null");
            return (Criteria) this;
        }

        public Criteria andCasIsNotNull() {
            addCriterion("cas is not null");
            return (Criteria) this;
        }

        public Criteria andCasEqualTo(String value) {
            addCriterion("cas =", value, "cas");
            return (Criteria) this;
        }

        public Criteria andCasNotEqualTo(String value) {
            addCriterion("cas <>", value, "cas");
            return (Criteria) this;
        }

        public Criteria andCasGreaterThan(String value) {
            addCriterion("cas >", value, "cas");
            return (Criteria) this;
        }

        public Criteria andCasGreaterThanOrEqualTo(String value) {
            addCriterion("cas >=", value, "cas");
            return (Criteria) this;
        }

        public Criteria andCasLessThan(String value) {
            addCriterion("cas <", value, "cas");
            return (Criteria) this;
        }

        public Criteria andCasLessThanOrEqualTo(String value) {
            addCriterion("cas <=", value, "cas");
            return (Criteria) this;
        }

        public Criteria andCasLike(String value) {
            addCriterion("cas like", value, "cas");
            return (Criteria) this;
        }

        public Criteria andCasNotLike(String value) {
            addCriterion("cas not like", value, "cas");
            return (Criteria) this;
        }

        public Criteria andCasIn(List<String> values) {
            addCriterion("cas in", values, "cas");
            return (Criteria) this;
        }

        public Criteria andCasNotIn(List<String> values) {
            addCriterion("cas not in", values, "cas");
            return (Criteria) this;
        }

        public Criteria andCasBetween(String value1, String value2) {
            addCriterion("cas between", value1, value2, "cas");
            return (Criteria) this;
        }

        public Criteria andCasNotBetween(String value1, String value2) {
            addCriterion("cas not between", value1, value2, "cas");
            return (Criteria) this;
        }

        public Criteria andMolecularFormulaIsNull() {
            addCriterion("molecular_formula is null");
            return (Criteria) this;
        }

        public Criteria andMolecularFormulaIsNotNull() {
            addCriterion("molecular_formula is not null");
            return (Criteria) this;
        }

        public Criteria andMolecularFormulaEqualTo(String value) {
            addCriterion("molecular_formula =", value, "molecularFormula");
            return (Criteria) this;
        }

        public Criteria andMolecularFormulaNotEqualTo(String value) {
            addCriterion("molecular_formula <>", value, "molecularFormula");
            return (Criteria) this;
        }

        public Criteria andMolecularFormulaGreaterThan(String value) {
            addCriterion("molecular_formula >", value, "molecularFormula");
            return (Criteria) this;
        }

        public Criteria andMolecularFormulaGreaterThanOrEqualTo(String value) {
            addCriterion("molecular_formula >=", value, "molecularFormula");
            return (Criteria) this;
        }

        public Criteria andMolecularFormulaLessThan(String value) {
            addCriterion("molecular_formula <", value, "molecularFormula");
            return (Criteria) this;
        }

        public Criteria andMolecularFormulaLessThanOrEqualTo(String value) {
            addCriterion("molecular_formula <=", value, "molecularFormula");
            return (Criteria) this;
        }

        public Criteria andMolecularFormulaLike(String value) {
            addCriterion("molecular_formula like", value, "molecularFormula");
            return (Criteria) this;
        }

        public Criteria andMolecularFormulaNotLike(String value) {
            addCriterion("molecular_formula not like", value, "molecularFormula");
            return (Criteria) this;
        }

        public Criteria andMolecularFormulaIn(List<String> values) {
            addCriterion("molecular_formula in", values, "molecularFormula");
            return (Criteria) this;
        }

        public Criteria andMolecularFormulaNotIn(List<String> values) {
            addCriterion("molecular_formula not in", values, "molecularFormula");
            return (Criteria) this;
        }

        public Criteria andMolecularFormulaBetween(String value1, String value2) {
            addCriterion("molecular_formula between", value1, value2, "molecularFormula");
            return (Criteria) this;
        }

        public Criteria andMolecularFormulaNotBetween(String value1, String value2) {
            addCriterion("molecular_formula not between", value1, value2, "molecularFormula");
            return (Criteria) this;
        }

        public Criteria andMolecularWeightIsNull() {
            addCriterion("molecular_weight is null");
            return (Criteria) this;
        }

        public Criteria andMolecularWeightIsNotNull() {
            addCriterion("molecular_weight is not null");
            return (Criteria) this;
        }

        public Criteria andMolecularWeightEqualTo(String value) {
            addCriterion("molecular_weight =", value, "molecularWeight");
            return (Criteria) this;
        }

        public Criteria andMolecularWeightNotEqualTo(String value) {
            addCriterion("molecular_weight <>", value, "molecularWeight");
            return (Criteria) this;
        }

        public Criteria andMolecularWeightGreaterThan(String value) {
            addCriterion("molecular_weight >", value, "molecularWeight");
            return (Criteria) this;
        }

        public Criteria andMolecularWeightGreaterThanOrEqualTo(String value) {
            addCriterion("molecular_weight >=", value, "molecularWeight");
            return (Criteria) this;
        }

        public Criteria andMolecularWeightLessThan(String value) {
            addCriterion("molecular_weight <", value, "molecularWeight");
            return (Criteria) this;
        }

        public Criteria andMolecularWeightLessThanOrEqualTo(String value) {
            addCriterion("molecular_weight <=", value, "molecularWeight");
            return (Criteria) this;
        }

        public Criteria andMolecularWeightLike(String value) {
            addCriterion("molecular_weight like", value, "molecularWeight");
            return (Criteria) this;
        }

        public Criteria andMolecularWeightNotLike(String value) {
            addCriterion("molecular_weight not like", value, "molecularWeight");
            return (Criteria) this;
        }

        public Criteria andMolecularWeightIn(List<String> values) {
            addCriterion("molecular_weight in", values, "molecularWeight");
            return (Criteria) this;
        }

        public Criteria andMolecularWeightNotIn(List<String> values) {
            addCriterion("molecular_weight not in", values, "molecularWeight");
            return (Criteria) this;
        }

        public Criteria andMolecularWeightBetween(String value1, String value2) {
            addCriterion("molecular_weight between", value1, value2, "molecularWeight");
            return (Criteria) this;
        }

        public Criteria andMolecularWeightNotBetween(String value1, String value2) {
            addCriterion("molecular_weight not between", value1, value2, "molecularWeight");
            return (Criteria) this;
        }

        public Criteria andAppearanceIsNull() {
            addCriterion("appearance is null");
            return (Criteria) this;
        }

        public Criteria andAppearanceIsNotNull() {
            addCriterion("appearance is not null");
            return (Criteria) this;
        }

        public Criteria andAppearanceEqualTo(String value) {
            addCriterion("appearance =", value, "appearance");
            return (Criteria) this;
        }

        public Criteria andAppearanceNotEqualTo(String value) {
            addCriterion("appearance <>", value, "appearance");
            return (Criteria) this;
        }

        public Criteria andAppearanceGreaterThan(String value) {
            addCriterion("appearance >", value, "appearance");
            return (Criteria) this;
        }

        public Criteria andAppearanceGreaterThanOrEqualTo(String value) {
            addCriterion("appearance >=", value, "appearance");
            return (Criteria) this;
        }

        public Criteria andAppearanceLessThan(String value) {
            addCriterion("appearance <", value, "appearance");
            return (Criteria) this;
        }

        public Criteria andAppearanceLessThanOrEqualTo(String value) {
            addCriterion("appearance <=", value, "appearance");
            return (Criteria) this;
        }

        public Criteria andAppearanceLike(String value) {
            addCriterion("appearance like", value, "appearance");
            return (Criteria) this;
        }

        public Criteria andAppearanceNotLike(String value) {
            addCriterion("appearance not like", value, "appearance");
            return (Criteria) this;
        }

        public Criteria andAppearanceIn(List<String> values) {
            addCriterion("appearance in", values, "appearance");
            return (Criteria) this;
        }

        public Criteria andAppearanceNotIn(List<String> values) {
            addCriterion("appearance not in", values, "appearance");
            return (Criteria) this;
        }

        public Criteria andAppearanceBetween(String value1, String value2) {
            addCriterion("appearance between", value1, value2, "appearance");
            return (Criteria) this;
        }

        public Criteria andAppearanceNotBetween(String value1, String value2) {
            addCriterion("appearance not between", value1, value2, "appearance");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andTransparencyIsNull() {
            addCriterion("transparency is null");
            return (Criteria) this;
        }

        public Criteria andTransparencyIsNotNull() {
            addCriterion("transparency is not null");
            return (Criteria) this;
        }

        public Criteria andTransparencyEqualTo(String value) {
            addCriterion("transparency =", value, "transparency");
            return (Criteria) this;
        }

        public Criteria andTransparencyNotEqualTo(String value) {
            addCriterion("transparency <>", value, "transparency");
            return (Criteria) this;
        }

        public Criteria andTransparencyGreaterThan(String value) {
            addCriterion("transparency >", value, "transparency");
            return (Criteria) this;
        }

        public Criteria andTransparencyGreaterThanOrEqualTo(String value) {
            addCriterion("transparency >=", value, "transparency");
            return (Criteria) this;
        }

        public Criteria andTransparencyLessThan(String value) {
            addCriterion("transparency <", value, "transparency");
            return (Criteria) this;
        }

        public Criteria andTransparencyLessThanOrEqualTo(String value) {
            addCriterion("transparency <=", value, "transparency");
            return (Criteria) this;
        }

        public Criteria andTransparencyLike(String value) {
            addCriterion("transparency like", value, "transparency");
            return (Criteria) this;
        }

        public Criteria andTransparencyNotLike(String value) {
            addCriterion("transparency not like", value, "transparency");
            return (Criteria) this;
        }

        public Criteria andTransparencyIn(List<String> values) {
            addCriterion("transparency in", values, "transparency");
            return (Criteria) this;
        }

        public Criteria andTransparencyNotIn(List<String> values) {
            addCriterion("transparency not in", values, "transparency");
            return (Criteria) this;
        }

        public Criteria andTransparencyBetween(String value1, String value2) {
            addCriterion("transparency between", value1, value2, "transparency");
            return (Criteria) this;
        }

        public Criteria andTransparencyNotBetween(String value1, String value2) {
            addCriterion("transparency not between", value1, value2, "transparency");
            return (Criteria) this;
        }

        public Criteria andSmellIsNull() {
            addCriterion("smell is null");
            return (Criteria) this;
        }

        public Criteria andSmellIsNotNull() {
            addCriterion("smell is not null");
            return (Criteria) this;
        }

        public Criteria andSmellEqualTo(String value) {
            addCriterion("smell =", value, "smell");
            return (Criteria) this;
        }

        public Criteria andSmellNotEqualTo(String value) {
            addCriterion("smell <>", value, "smell");
            return (Criteria) this;
        }

        public Criteria andSmellGreaterThan(String value) {
            addCriterion("smell >", value, "smell");
            return (Criteria) this;
        }

        public Criteria andSmellGreaterThanOrEqualTo(String value) {
            addCriterion("smell >=", value, "smell");
            return (Criteria) this;
        }

        public Criteria andSmellLessThan(String value) {
            addCriterion("smell <", value, "smell");
            return (Criteria) this;
        }

        public Criteria andSmellLessThanOrEqualTo(String value) {
            addCriterion("smell <=", value, "smell");
            return (Criteria) this;
        }

        public Criteria andSmellLike(String value) {
            addCriterion("smell like", value, "smell");
            return (Criteria) this;
        }

        public Criteria andSmellNotLike(String value) {
            addCriterion("smell not like", value, "smell");
            return (Criteria) this;
        }

        public Criteria andSmellIn(List<String> values) {
            addCriterion("smell in", values, "smell");
            return (Criteria) this;
        }

        public Criteria andSmellNotIn(List<String> values) {
            addCriterion("smell not in", values, "smell");
            return (Criteria) this;
        }

        public Criteria andSmellBetween(String value1, String value2) {
            addCriterion("smell between", value1, value2, "smell");
            return (Criteria) this;
        }

        public Criteria andSmellNotBetween(String value1, String value2) {
            addCriterion("smell not between", value1, value2, "smell");
            return (Criteria) this;
        }

        public Criteria andTasteIsNull() {
            addCriterion("taste is null");
            return (Criteria) this;
        }

        public Criteria andTasteIsNotNull() {
            addCriterion("taste is not null");
            return (Criteria) this;
        }

        public Criteria andTasteEqualTo(String value) {
            addCriterion("taste =", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteNotEqualTo(String value) {
            addCriterion("taste <>", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteGreaterThan(String value) {
            addCriterion("taste >", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteGreaterThanOrEqualTo(String value) {
            addCriterion("taste >=", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteLessThan(String value) {
            addCriterion("taste <", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteLessThanOrEqualTo(String value) {
            addCriterion("taste <=", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteLike(String value) {
            addCriterion("taste like", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteNotLike(String value) {
            addCriterion("taste not like", value, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteIn(List<String> values) {
            addCriterion("taste in", values, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteNotIn(List<String> values) {
            addCriterion("taste not in", values, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteBetween(String value1, String value2) {
            addCriterion("taste between", value1, value2, "taste");
            return (Criteria) this;
        }

        public Criteria andTasteNotBetween(String value1, String value2) {
            addCriterion("taste not between", value1, value2, "taste");
            return (Criteria) this;
        }

        public Criteria andPhIsNull() {
            addCriterion("ph is null");
            return (Criteria) this;
        }

        public Criteria andPhIsNotNull() {
            addCriterion("ph is not null");
            return (Criteria) this;
        }

        public Criteria andPhEqualTo(String value) {
            addCriterion("ph =", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotEqualTo(String value) {
            addCriterion("ph <>", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhGreaterThan(String value) {
            addCriterion("ph >", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhGreaterThanOrEqualTo(String value) {
            addCriterion("ph >=", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhLessThan(String value) {
            addCriterion("ph <", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhLessThanOrEqualTo(String value) {
            addCriterion("ph <=", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhLike(String value) {
            addCriterion("ph like", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotLike(String value) {
            addCriterion("ph not like", value, "ph");
            return (Criteria) this;
        }

        public Criteria andPhIn(List<String> values) {
            addCriterion("ph in", values, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotIn(List<String> values) {
            addCriterion("ph not in", values, "ph");
            return (Criteria) this;
        }

        public Criteria andPhBetween(String value1, String value2) {
            addCriterion("ph between", value1, value2, "ph");
            return (Criteria) this;
        }

        public Criteria andPhNotBetween(String value1, String value2) {
            addCriterion("ph not between", value1, value2, "ph");
            return (Criteria) this;
        }

        public Criteria andProportionWaterIsNull() {
            addCriterion("proportion_water is null");
            return (Criteria) this;
        }

        public Criteria andProportionWaterIsNotNull() {
            addCriterion("proportion_water is not null");
            return (Criteria) this;
        }

        public Criteria andProportionWaterEqualTo(String value) {
            addCriterion("proportion_water =", value, "proportionWater");
            return (Criteria) this;
        }

        public Criteria andProportionWaterNotEqualTo(String value) {
            addCriterion("proportion_water <>", value, "proportionWater");
            return (Criteria) this;
        }

        public Criteria andProportionWaterGreaterThan(String value) {
            addCriterion("proportion_water >", value, "proportionWater");
            return (Criteria) this;
        }

        public Criteria andProportionWaterGreaterThanOrEqualTo(String value) {
            addCriterion("proportion_water >=", value, "proportionWater");
            return (Criteria) this;
        }

        public Criteria andProportionWaterLessThan(String value) {
            addCriterion("proportion_water <", value, "proportionWater");
            return (Criteria) this;
        }

        public Criteria andProportionWaterLessThanOrEqualTo(String value) {
            addCriterion("proportion_water <=", value, "proportionWater");
            return (Criteria) this;
        }

        public Criteria andProportionWaterLike(String value) {
            addCriterion("proportion_water like", value, "proportionWater");
            return (Criteria) this;
        }

        public Criteria andProportionWaterNotLike(String value) {
            addCriterion("proportion_water not like", value, "proportionWater");
            return (Criteria) this;
        }

        public Criteria andProportionWaterIn(List<String> values) {
            addCriterion("proportion_water in", values, "proportionWater");
            return (Criteria) this;
        }

        public Criteria andProportionWaterNotIn(List<String> values) {
            addCriterion("proportion_water not in", values, "proportionWater");
            return (Criteria) this;
        }

        public Criteria andProportionWaterBetween(String value1, String value2) {
            addCriterion("proportion_water between", value1, value2, "proportionWater");
            return (Criteria) this;
        }

        public Criteria andProportionWaterNotBetween(String value1, String value2) {
            addCriterion("proportion_water not between", value1, value2, "proportionWater");
            return (Criteria) this;
        }

        public Criteria andProportionAirIsNull() {
            addCriterion("proportion_air is null");
            return (Criteria) this;
        }

        public Criteria andProportionAirIsNotNull() {
            addCriterion("proportion_air is not null");
            return (Criteria) this;
        }

        public Criteria andProportionAirEqualTo(String value) {
            addCriterion("proportion_air =", value, "proportionAir");
            return (Criteria) this;
        }

        public Criteria andProportionAirNotEqualTo(String value) {
            addCriterion("proportion_air <>", value, "proportionAir");
            return (Criteria) this;
        }

        public Criteria andProportionAirGreaterThan(String value) {
            addCriterion("proportion_air >", value, "proportionAir");
            return (Criteria) this;
        }

        public Criteria andProportionAirGreaterThanOrEqualTo(String value) {
            addCriterion("proportion_air >=", value, "proportionAir");
            return (Criteria) this;
        }

        public Criteria andProportionAirLessThan(String value) {
            addCriterion("proportion_air <", value, "proportionAir");
            return (Criteria) this;
        }

        public Criteria andProportionAirLessThanOrEqualTo(String value) {
            addCriterion("proportion_air <=", value, "proportionAir");
            return (Criteria) this;
        }

        public Criteria andProportionAirLike(String value) {
            addCriterion("proportion_air like", value, "proportionAir");
            return (Criteria) this;
        }

        public Criteria andProportionAirNotLike(String value) {
            addCriterion("proportion_air not like", value, "proportionAir");
            return (Criteria) this;
        }

        public Criteria andProportionAirIn(List<String> values) {
            addCriterion("proportion_air in", values, "proportionAir");
            return (Criteria) this;
        }

        public Criteria andProportionAirNotIn(List<String> values) {
            addCriterion("proportion_air not in", values, "proportionAir");
            return (Criteria) this;
        }

        public Criteria andProportionAirBetween(String value1, String value2) {
            addCriterion("proportion_air between", value1, value2, "proportionAir");
            return (Criteria) this;
        }

        public Criteria andProportionAirNotBetween(String value1, String value2) {
            addCriterion("proportion_air not between", value1, value2, "proportionAir");
            return (Criteria) this;
        }

        public Criteria andMeltingPointIsNull() {
            addCriterion("melting_point is null");
            return (Criteria) this;
        }

        public Criteria andMeltingPointIsNotNull() {
            addCriterion("melting_point is not null");
            return (Criteria) this;
        }

        public Criteria andMeltingPointEqualTo(String value) {
            addCriterion("melting_point =", value, "meltingPoint");
            return (Criteria) this;
        }

        public Criteria andMeltingPointNotEqualTo(String value) {
            addCriterion("melting_point <>", value, "meltingPoint");
            return (Criteria) this;
        }

        public Criteria andMeltingPointGreaterThan(String value) {
            addCriterion("melting_point >", value, "meltingPoint");
            return (Criteria) this;
        }

        public Criteria andMeltingPointGreaterThanOrEqualTo(String value) {
            addCriterion("melting_point >=", value, "meltingPoint");
            return (Criteria) this;
        }

        public Criteria andMeltingPointLessThan(String value) {
            addCriterion("melting_point <", value, "meltingPoint");
            return (Criteria) this;
        }

        public Criteria andMeltingPointLessThanOrEqualTo(String value) {
            addCriterion("melting_point <=", value, "meltingPoint");
            return (Criteria) this;
        }

        public Criteria andMeltingPointLike(String value) {
            addCriterion("melting_point like", value, "meltingPoint");
            return (Criteria) this;
        }

        public Criteria andMeltingPointNotLike(String value) {
            addCriterion("melting_point not like", value, "meltingPoint");
            return (Criteria) this;
        }

        public Criteria andMeltingPointIn(List<String> values) {
            addCriterion("melting_point in", values, "meltingPoint");
            return (Criteria) this;
        }

        public Criteria andMeltingPointNotIn(List<String> values) {
            addCriterion("melting_point not in", values, "meltingPoint");
            return (Criteria) this;
        }

        public Criteria andMeltingPointBetween(String value1, String value2) {
            addCriterion("melting_point between", value1, value2, "meltingPoint");
            return (Criteria) this;
        }

        public Criteria andMeltingPointNotBetween(String value1, String value2) {
            addCriterion("melting_point not between", value1, value2, "meltingPoint");
            return (Criteria) this;
        }

        public Criteria andBoilingPointIsNull() {
            addCriterion("boiling_point is null");
            return (Criteria) this;
        }

        public Criteria andBoilingPointIsNotNull() {
            addCriterion("boiling_point is not null");
            return (Criteria) this;
        }

        public Criteria andBoilingPointEqualTo(String value) {
            addCriterion("boiling_point =", value, "boilingPoint");
            return (Criteria) this;
        }

        public Criteria andBoilingPointNotEqualTo(String value) {
            addCriterion("boiling_point <>", value, "boilingPoint");
            return (Criteria) this;
        }

        public Criteria andBoilingPointGreaterThan(String value) {
            addCriterion("boiling_point >", value, "boilingPoint");
            return (Criteria) this;
        }

        public Criteria andBoilingPointGreaterThanOrEqualTo(String value) {
            addCriterion("boiling_point >=", value, "boilingPoint");
            return (Criteria) this;
        }

        public Criteria andBoilingPointLessThan(String value) {
            addCriterion("boiling_point <", value, "boilingPoint");
            return (Criteria) this;
        }

        public Criteria andBoilingPointLessThanOrEqualTo(String value) {
            addCriterion("boiling_point <=", value, "boilingPoint");
            return (Criteria) this;
        }

        public Criteria andBoilingPointLike(String value) {
            addCriterion("boiling_point like", value, "boilingPoint");
            return (Criteria) this;
        }

        public Criteria andBoilingPointNotLike(String value) {
            addCriterion("boiling_point not like", value, "boilingPoint");
            return (Criteria) this;
        }

        public Criteria andBoilingPointIn(List<String> values) {
            addCriterion("boiling_point in", values, "boilingPoint");
            return (Criteria) this;
        }

        public Criteria andBoilingPointNotIn(List<String> values) {
            addCriterion("boiling_point not in", values, "boilingPoint");
            return (Criteria) this;
        }

        public Criteria andBoilingPointBetween(String value1, String value2) {
            addCriterion("boiling_point between", value1, value2, "boilingPoint");
            return (Criteria) this;
        }

        public Criteria andBoilingPointNotBetween(String value1, String value2) {
            addCriterion("boiling_point not between", value1, value2, "boilingPoint");
            return (Criteria) this;
        }

        public Criteria andRelativeDensityIsNull() {
            addCriterion("relative_density is null");
            return (Criteria) this;
        }

        public Criteria andRelativeDensityIsNotNull() {
            addCriterion("relative_density is not null");
            return (Criteria) this;
        }

        public Criteria andRelativeDensityEqualTo(String value) {
            addCriterion("relative_density =", value, "relativeDensity");
            return (Criteria) this;
        }

        public Criteria andRelativeDensityNotEqualTo(String value) {
            addCriterion("relative_density <>", value, "relativeDensity");
            return (Criteria) this;
        }

        public Criteria andRelativeDensityGreaterThan(String value) {
            addCriterion("relative_density >", value, "relativeDensity");
            return (Criteria) this;
        }

        public Criteria andRelativeDensityGreaterThanOrEqualTo(String value) {
            addCriterion("relative_density >=", value, "relativeDensity");
            return (Criteria) this;
        }

        public Criteria andRelativeDensityLessThan(String value) {
            addCriterion("relative_density <", value, "relativeDensity");
            return (Criteria) this;
        }

        public Criteria andRelativeDensityLessThanOrEqualTo(String value) {
            addCriterion("relative_density <=", value, "relativeDensity");
            return (Criteria) this;
        }

        public Criteria andRelativeDensityLike(String value) {
            addCriterion("relative_density like", value, "relativeDensity");
            return (Criteria) this;
        }

        public Criteria andRelativeDensityNotLike(String value) {
            addCriterion("relative_density not like", value, "relativeDensity");
            return (Criteria) this;
        }

        public Criteria andRelativeDensityIn(List<String> values) {
            addCriterion("relative_density in", values, "relativeDensity");
            return (Criteria) this;
        }

        public Criteria andRelativeDensityNotIn(List<String> values) {
            addCriterion("relative_density not in", values, "relativeDensity");
            return (Criteria) this;
        }

        public Criteria andRelativeDensityBetween(String value1, String value2) {
            addCriterion("relative_density between", value1, value2, "relativeDensity");
            return (Criteria) this;
        }

        public Criteria andRelativeDensityNotBetween(String value1, String value2) {
            addCriterion("relative_density not between", value1, value2, "relativeDensity");
            return (Criteria) this;
        }

        public Criteria andRelativeAirIsNull() {
            addCriterion("relative_air is null");
            return (Criteria) this;
        }

        public Criteria andRelativeAirIsNotNull() {
            addCriterion("relative_air is not null");
            return (Criteria) this;
        }

        public Criteria andRelativeAirEqualTo(String value) {
            addCriterion("relative_air =", value, "relativeAir");
            return (Criteria) this;
        }

        public Criteria andRelativeAirNotEqualTo(String value) {
            addCriterion("relative_air <>", value, "relativeAir");
            return (Criteria) this;
        }

        public Criteria andRelativeAirGreaterThan(String value) {
            addCriterion("relative_air >", value, "relativeAir");
            return (Criteria) this;
        }

        public Criteria andRelativeAirGreaterThanOrEqualTo(String value) {
            addCriterion("relative_air >=", value, "relativeAir");
            return (Criteria) this;
        }

        public Criteria andRelativeAirLessThan(String value) {
            addCriterion("relative_air <", value, "relativeAir");
            return (Criteria) this;
        }

        public Criteria andRelativeAirLessThanOrEqualTo(String value) {
            addCriterion("relative_air <=", value, "relativeAir");
            return (Criteria) this;
        }

        public Criteria andRelativeAirLike(String value) {
            addCriterion("relative_air like", value, "relativeAir");
            return (Criteria) this;
        }

        public Criteria andRelativeAirNotLike(String value) {
            addCriterion("relative_air not like", value, "relativeAir");
            return (Criteria) this;
        }

        public Criteria andRelativeAirIn(List<String> values) {
            addCriterion("relative_air in", values, "relativeAir");
            return (Criteria) this;
        }

        public Criteria andRelativeAirNotIn(List<String> values) {
            addCriterion("relative_air not in", values, "relativeAir");
            return (Criteria) this;
        }

        public Criteria andRelativeAirBetween(String value1, String value2) {
            addCriterion("relative_air between", value1, value2, "relativeAir");
            return (Criteria) this;
        }

        public Criteria andRelativeAirNotBetween(String value1, String value2) {
            addCriterion("relative_air not between", value1, value2, "relativeAir");
            return (Criteria) this;
        }

        public Criteria andSaturatedIsNull() {
            addCriterion("saturated is null");
            return (Criteria) this;
        }

        public Criteria andSaturatedIsNotNull() {
            addCriterion("saturated is not null");
            return (Criteria) this;
        }

        public Criteria andSaturatedEqualTo(String value) {
            addCriterion("saturated =", value, "saturated");
            return (Criteria) this;
        }

        public Criteria andSaturatedNotEqualTo(String value) {
            addCriterion("saturated <>", value, "saturated");
            return (Criteria) this;
        }

        public Criteria andSaturatedGreaterThan(String value) {
            addCriterion("saturated >", value, "saturated");
            return (Criteria) this;
        }

        public Criteria andSaturatedGreaterThanOrEqualTo(String value) {
            addCriterion("saturated >=", value, "saturated");
            return (Criteria) this;
        }

        public Criteria andSaturatedLessThan(String value) {
            addCriterion("saturated <", value, "saturated");
            return (Criteria) this;
        }

        public Criteria andSaturatedLessThanOrEqualTo(String value) {
            addCriterion("saturated <=", value, "saturated");
            return (Criteria) this;
        }

        public Criteria andSaturatedLike(String value) {
            addCriterion("saturated like", value, "saturated");
            return (Criteria) this;
        }

        public Criteria andSaturatedNotLike(String value) {
            addCriterion("saturated not like", value, "saturated");
            return (Criteria) this;
        }

        public Criteria andSaturatedIn(List<String> values) {
            addCriterion("saturated in", values, "saturated");
            return (Criteria) this;
        }

        public Criteria andSaturatedNotIn(List<String> values) {
            addCriterion("saturated not in", values, "saturated");
            return (Criteria) this;
        }

        public Criteria andSaturatedBetween(String value1, String value2) {
            addCriterion("saturated between", value1, value2, "saturated");
            return (Criteria) this;
        }

        public Criteria andSaturatedNotBetween(String value1, String value2) {
            addCriterion("saturated not between", value1, value2, "saturated");
            return (Criteria) this;
        }

        public Criteria andBurningHeatIsNull() {
            addCriterion("burning_heat is null");
            return (Criteria) this;
        }

        public Criteria andBurningHeatIsNotNull() {
            addCriterion("burning_heat is not null");
            return (Criteria) this;
        }

        public Criteria andBurningHeatEqualTo(String value) {
            addCriterion("burning_heat =", value, "burningHeat");
            return (Criteria) this;
        }

        public Criteria andBurningHeatNotEqualTo(String value) {
            addCriterion("burning_heat <>", value, "burningHeat");
            return (Criteria) this;
        }

        public Criteria andBurningHeatGreaterThan(String value) {
            addCriterion("burning_heat >", value, "burningHeat");
            return (Criteria) this;
        }

        public Criteria andBurningHeatGreaterThanOrEqualTo(String value) {
            addCriterion("burning_heat >=", value, "burningHeat");
            return (Criteria) this;
        }

        public Criteria andBurningHeatLessThan(String value) {
            addCriterion("burning_heat <", value, "burningHeat");
            return (Criteria) this;
        }

        public Criteria andBurningHeatLessThanOrEqualTo(String value) {
            addCriterion("burning_heat <=", value, "burningHeat");
            return (Criteria) this;
        }

        public Criteria andBurningHeatLike(String value) {
            addCriterion("burning_heat like", value, "burningHeat");
            return (Criteria) this;
        }

        public Criteria andBurningHeatNotLike(String value) {
            addCriterion("burning_heat not like", value, "burningHeat");
            return (Criteria) this;
        }

        public Criteria andBurningHeatIn(List<String> values) {
            addCriterion("burning_heat in", values, "burningHeat");
            return (Criteria) this;
        }

        public Criteria andBurningHeatNotIn(List<String> values) {
            addCriterion("burning_heat not in", values, "burningHeat");
            return (Criteria) this;
        }

        public Criteria andBurningHeatBetween(String value1, String value2) {
            addCriterion("burning_heat between", value1, value2, "burningHeat");
            return (Criteria) this;
        }

        public Criteria andBurningHeatNotBetween(String value1, String value2) {
            addCriterion("burning_heat not between", value1, value2, "burningHeat");
            return (Criteria) this;
        }

        public Criteria andCriticalTemperatureIsNull() {
            addCriterion("critical_temperature is null");
            return (Criteria) this;
        }

        public Criteria andCriticalTemperatureIsNotNull() {
            addCriterion("critical_temperature is not null");
            return (Criteria) this;
        }

        public Criteria andCriticalTemperatureEqualTo(String value) {
            addCriterion("critical_temperature =", value, "criticalTemperature");
            return (Criteria) this;
        }

        public Criteria andCriticalTemperatureNotEqualTo(String value) {
            addCriterion("critical_temperature <>", value, "criticalTemperature");
            return (Criteria) this;
        }

        public Criteria andCriticalTemperatureGreaterThan(String value) {
            addCriterion("critical_temperature >", value, "criticalTemperature");
            return (Criteria) this;
        }

        public Criteria andCriticalTemperatureGreaterThanOrEqualTo(String value) {
            addCriterion("critical_temperature >=", value, "criticalTemperature");
            return (Criteria) this;
        }

        public Criteria andCriticalTemperatureLessThan(String value) {
            addCriterion("critical_temperature <", value, "criticalTemperature");
            return (Criteria) this;
        }

        public Criteria andCriticalTemperatureLessThanOrEqualTo(String value) {
            addCriterion("critical_temperature <=", value, "criticalTemperature");
            return (Criteria) this;
        }

        public Criteria andCriticalTemperatureLike(String value) {
            addCriterion("critical_temperature like", value, "criticalTemperature");
            return (Criteria) this;
        }

        public Criteria andCriticalTemperatureNotLike(String value) {
            addCriterion("critical_temperature not like", value, "criticalTemperature");
            return (Criteria) this;
        }

        public Criteria andCriticalTemperatureIn(List<String> values) {
            addCriterion("critical_temperature in", values, "criticalTemperature");
            return (Criteria) this;
        }

        public Criteria andCriticalTemperatureNotIn(List<String> values) {
            addCriterion("critical_temperature not in", values, "criticalTemperature");
            return (Criteria) this;
        }

        public Criteria andCriticalTemperatureBetween(String value1, String value2) {
            addCriterion("critical_temperature between", value1, value2, "criticalTemperature");
            return (Criteria) this;
        }

        public Criteria andCriticalTemperatureNotBetween(String value1, String value2) {
            addCriterion("critical_temperature not between", value1, value2, "criticalTemperature");
            return (Criteria) this;
        }

        public Criteria andCriticalPressureIsNull() {
            addCriterion("critical_pressure is null");
            return (Criteria) this;
        }

        public Criteria andCriticalPressureIsNotNull() {
            addCriterion("critical_pressure is not null");
            return (Criteria) this;
        }

        public Criteria andCriticalPressureEqualTo(String value) {
            addCriterion("critical_pressure =", value, "criticalPressure");
            return (Criteria) this;
        }

        public Criteria andCriticalPressureNotEqualTo(String value) {
            addCriterion("critical_pressure <>", value, "criticalPressure");
            return (Criteria) this;
        }

        public Criteria andCriticalPressureGreaterThan(String value) {
            addCriterion("critical_pressure >", value, "criticalPressure");
            return (Criteria) this;
        }

        public Criteria andCriticalPressureGreaterThanOrEqualTo(String value) {
            addCriterion("critical_pressure >=", value, "criticalPressure");
            return (Criteria) this;
        }

        public Criteria andCriticalPressureLessThan(String value) {
            addCriterion("critical_pressure <", value, "criticalPressure");
            return (Criteria) this;
        }

        public Criteria andCriticalPressureLessThanOrEqualTo(String value) {
            addCriterion("critical_pressure <=", value, "criticalPressure");
            return (Criteria) this;
        }

        public Criteria andCriticalPressureLike(String value) {
            addCriterion("critical_pressure like", value, "criticalPressure");
            return (Criteria) this;
        }

        public Criteria andCriticalPressureNotLike(String value) {
            addCriterion("critical_pressure not like", value, "criticalPressure");
            return (Criteria) this;
        }

        public Criteria andCriticalPressureIn(List<String> values) {
            addCriterion("critical_pressure in", values, "criticalPressure");
            return (Criteria) this;
        }

        public Criteria andCriticalPressureNotIn(List<String> values) {
            addCriterion("critical_pressure not in", values, "criticalPressure");
            return (Criteria) this;
        }

        public Criteria andCriticalPressureBetween(String value1, String value2) {
            addCriterion("critical_pressure between", value1, value2, "criticalPressure");
            return (Criteria) this;
        }

        public Criteria andCriticalPressureNotBetween(String value1, String value2) {
            addCriterion("critical_pressure not between", value1, value2, "criticalPressure");
            return (Criteria) this;
        }

        public Criteria andFlashPointIsNull() {
            addCriterion("flash_point is null");
            return (Criteria) this;
        }

        public Criteria andFlashPointIsNotNull() {
            addCriterion("flash_point is not null");
            return (Criteria) this;
        }

        public Criteria andFlashPointEqualTo(String value) {
            addCriterion("flash_point =", value, "flashPoint");
            return (Criteria) this;
        }

        public Criteria andFlashPointNotEqualTo(String value) {
            addCriterion("flash_point <>", value, "flashPoint");
            return (Criteria) this;
        }

        public Criteria andFlashPointGreaterThan(String value) {
            addCriterion("flash_point >", value, "flashPoint");
            return (Criteria) this;
        }

        public Criteria andFlashPointGreaterThanOrEqualTo(String value) {
            addCriterion("flash_point >=", value, "flashPoint");
            return (Criteria) this;
        }

        public Criteria andFlashPointLessThan(String value) {
            addCriterion("flash_point <", value, "flashPoint");
            return (Criteria) this;
        }

        public Criteria andFlashPointLessThanOrEqualTo(String value) {
            addCriterion("flash_point <=", value, "flashPoint");
            return (Criteria) this;
        }

        public Criteria andFlashPointLike(String value) {
            addCriterion("flash_point like", value, "flashPoint");
            return (Criteria) this;
        }

        public Criteria andFlashPointNotLike(String value) {
            addCriterion("flash_point not like", value, "flashPoint");
            return (Criteria) this;
        }

        public Criteria andFlashPointIn(List<String> values) {
            addCriterion("flash_point in", values, "flashPoint");
            return (Criteria) this;
        }

        public Criteria andFlashPointNotIn(List<String> values) {
            addCriterion("flash_point not in", values, "flashPoint");
            return (Criteria) this;
        }

        public Criteria andFlashPointBetween(String value1, String value2) {
            addCriterion("flash_point between", value1, value2, "flashPoint");
            return (Criteria) this;
        }

        public Criteria andFlashPointNotBetween(String value1, String value2) {
            addCriterion("flash_point not between", value1, value2, "flashPoint");
            return (Criteria) this;
        }

        public Criteria andNaturalTemperatureIsNull() {
            addCriterion("natural_temperature is null");
            return (Criteria) this;
        }

        public Criteria andNaturalTemperatureIsNotNull() {
            addCriterion("natural_temperature is not null");
            return (Criteria) this;
        }

        public Criteria andNaturalTemperatureEqualTo(String value) {
            addCriterion("natural_temperature =", value, "naturalTemperature");
            return (Criteria) this;
        }

        public Criteria andNaturalTemperatureNotEqualTo(String value) {
            addCriterion("natural_temperature <>", value, "naturalTemperature");
            return (Criteria) this;
        }

        public Criteria andNaturalTemperatureGreaterThan(String value) {
            addCriterion("natural_temperature >", value, "naturalTemperature");
            return (Criteria) this;
        }

        public Criteria andNaturalTemperatureGreaterThanOrEqualTo(String value) {
            addCriterion("natural_temperature >=", value, "naturalTemperature");
            return (Criteria) this;
        }

        public Criteria andNaturalTemperatureLessThan(String value) {
            addCriterion("natural_temperature <", value, "naturalTemperature");
            return (Criteria) this;
        }

        public Criteria andNaturalTemperatureLessThanOrEqualTo(String value) {
            addCriterion("natural_temperature <=", value, "naturalTemperature");
            return (Criteria) this;
        }

        public Criteria andNaturalTemperatureLike(String value) {
            addCriterion("natural_temperature like", value, "naturalTemperature");
            return (Criteria) this;
        }

        public Criteria andNaturalTemperatureNotLike(String value) {
            addCriterion("natural_temperature not like", value, "naturalTemperature");
            return (Criteria) this;
        }

        public Criteria andNaturalTemperatureIn(List<String> values) {
            addCriterion("natural_temperature in", values, "naturalTemperature");
            return (Criteria) this;
        }

        public Criteria andNaturalTemperatureNotIn(List<String> values) {
            addCriterion("natural_temperature not in", values, "naturalTemperature");
            return (Criteria) this;
        }

        public Criteria andNaturalTemperatureBetween(String value1, String value2) {
            addCriterion("natural_temperature between", value1, value2, "naturalTemperature");
            return (Criteria) this;
        }

        public Criteria andNaturalTemperatureNotBetween(String value1, String value2) {
            addCriterion("natural_temperature not between", value1, value2, "naturalTemperature");
            return (Criteria) this;
        }

        public Criteria andExplosionUIsNull() {
            addCriterion("explosion_u is null");
            return (Criteria) this;
        }

        public Criteria andExplosionUIsNotNull() {
            addCriterion("explosion_u is not null");
            return (Criteria) this;
        }

        public Criteria andExplosionUEqualTo(String value) {
            addCriterion("explosion_u =", value, "explosionU");
            return (Criteria) this;
        }

        public Criteria andExplosionUNotEqualTo(String value) {
            addCriterion("explosion_u <>", value, "explosionU");
            return (Criteria) this;
        }

        public Criteria andExplosionUGreaterThan(String value) {
            addCriterion("explosion_u >", value, "explosionU");
            return (Criteria) this;
        }

        public Criteria andExplosionUGreaterThanOrEqualTo(String value) {
            addCriterion("explosion_u >=", value, "explosionU");
            return (Criteria) this;
        }

        public Criteria andExplosionULessThan(String value) {
            addCriterion("explosion_u <", value, "explosionU");
            return (Criteria) this;
        }

        public Criteria andExplosionULessThanOrEqualTo(String value) {
            addCriterion("explosion_u <=", value, "explosionU");
            return (Criteria) this;
        }

        public Criteria andExplosionULike(String value) {
            addCriterion("explosion_u like", value, "explosionU");
            return (Criteria) this;
        }

        public Criteria andExplosionUNotLike(String value) {
            addCriterion("explosion_u not like", value, "explosionU");
            return (Criteria) this;
        }

        public Criteria andExplosionUIn(List<String> values) {
            addCriterion("explosion_u in", values, "explosionU");
            return (Criteria) this;
        }

        public Criteria andExplosionUNotIn(List<String> values) {
            addCriterion("explosion_u not in", values, "explosionU");
            return (Criteria) this;
        }

        public Criteria andExplosionUBetween(String value1, String value2) {
            addCriterion("explosion_u between", value1, value2, "explosionU");
            return (Criteria) this;
        }

        public Criteria andExplosionUNotBetween(String value1, String value2) {
            addCriterion("explosion_u not between", value1, value2, "explosionU");
            return (Criteria) this;
        }

        public Criteria andExplosionDIsNull() {
            addCriterion("explosion_d is null");
            return (Criteria) this;
        }

        public Criteria andExplosionDIsNotNull() {
            addCriterion("explosion_d is not null");
            return (Criteria) this;
        }

        public Criteria andExplosionDEqualTo(String value) {
            addCriterion("explosion_d =", value, "explosionD");
            return (Criteria) this;
        }

        public Criteria andExplosionDNotEqualTo(String value) {
            addCriterion("explosion_d <>", value, "explosionD");
            return (Criteria) this;
        }

        public Criteria andExplosionDGreaterThan(String value) {
            addCriterion("explosion_d >", value, "explosionD");
            return (Criteria) this;
        }

        public Criteria andExplosionDGreaterThanOrEqualTo(String value) {
            addCriterion("explosion_d >=", value, "explosionD");
            return (Criteria) this;
        }

        public Criteria andExplosionDLessThan(String value) {
            addCriterion("explosion_d <", value, "explosionD");
            return (Criteria) this;
        }

        public Criteria andExplosionDLessThanOrEqualTo(String value) {
            addCriterion("explosion_d <=", value, "explosionD");
            return (Criteria) this;
        }

        public Criteria andExplosionDLike(String value) {
            addCriterion("explosion_d like", value, "explosionD");
            return (Criteria) this;
        }

        public Criteria andExplosionDNotLike(String value) {
            addCriterion("explosion_d not like", value, "explosionD");
            return (Criteria) this;
        }

        public Criteria andExplosionDIn(List<String> values) {
            addCriterion("explosion_d in", values, "explosionD");
            return (Criteria) this;
        }

        public Criteria andExplosionDNotIn(List<String> values) {
            addCriterion("explosion_d not in", values, "explosionD");
            return (Criteria) this;
        }

        public Criteria andExplosionDBetween(String value1, String value2) {
            addCriterion("explosion_d between", value1, value2, "explosionD");
            return (Criteria) this;
        }

        public Criteria andExplosionDNotBetween(String value1, String value2) {
            addCriterion("explosion_d not between", value1, value2, "explosionD");
            return (Criteria) this;
        }

        public Criteria andSolubilityIsNull() {
            addCriterion("solubility is null");
            return (Criteria) this;
        }

        public Criteria andSolubilityIsNotNull() {
            addCriterion("solubility is not null");
            return (Criteria) this;
        }

        public Criteria andSolubilityEqualTo(String value) {
            addCriterion("solubility =", value, "solubility");
            return (Criteria) this;
        }

        public Criteria andSolubilityNotEqualTo(String value) {
            addCriterion("solubility <>", value, "solubility");
            return (Criteria) this;
        }

        public Criteria andSolubilityGreaterThan(String value) {
            addCriterion("solubility >", value, "solubility");
            return (Criteria) this;
        }

        public Criteria andSolubilityGreaterThanOrEqualTo(String value) {
            addCriterion("solubility >=", value, "solubility");
            return (Criteria) this;
        }

        public Criteria andSolubilityLessThan(String value) {
            addCriterion("solubility <", value, "solubility");
            return (Criteria) this;
        }

        public Criteria andSolubilityLessThanOrEqualTo(String value) {
            addCriterion("solubility <=", value, "solubility");
            return (Criteria) this;
        }

        public Criteria andSolubilityLike(String value) {
            addCriterion("solubility like", value, "solubility");
            return (Criteria) this;
        }

        public Criteria andSolubilityNotLike(String value) {
            addCriterion("solubility not like", value, "solubility");
            return (Criteria) this;
        }

        public Criteria andSolubilityIn(List<String> values) {
            addCriterion("solubility in", values, "solubility");
            return (Criteria) this;
        }

        public Criteria andSolubilityNotIn(List<String> values) {
            addCriterion("solubility not in", values, "solubility");
            return (Criteria) this;
        }

        public Criteria andSolubilityBetween(String value1, String value2) {
            addCriterion("solubility between", value1, value2, "solubility");
            return (Criteria) this;
        }

        public Criteria andSolubilityNotBetween(String value1, String value2) {
            addCriterion("solubility not between", value1, value2, "solubility");
            return (Criteria) this;
        }

        public Criteria andOperationalIsNull() {
            addCriterion("operational is null");
            return (Criteria) this;
        }

        public Criteria andOperationalIsNotNull() {
            addCriterion("operational is not null");
            return (Criteria) this;
        }

        public Criteria andOperationalEqualTo(String value) {
            addCriterion("operational =", value, "operational");
            return (Criteria) this;
        }

        public Criteria andOperationalNotEqualTo(String value) {
            addCriterion("operational <>", value, "operational");
            return (Criteria) this;
        }

        public Criteria andOperationalGreaterThan(String value) {
            addCriterion("operational >", value, "operational");
            return (Criteria) this;
        }

        public Criteria andOperationalGreaterThanOrEqualTo(String value) {
            addCriterion("operational >=", value, "operational");
            return (Criteria) this;
        }

        public Criteria andOperationalLessThan(String value) {
            addCriterion("operational <", value, "operational");
            return (Criteria) this;
        }

        public Criteria andOperationalLessThanOrEqualTo(String value) {
            addCriterion("operational <=", value, "operational");
            return (Criteria) this;
        }

        public Criteria andOperationalLike(String value) {
            addCriterion("operational like", value, "operational");
            return (Criteria) this;
        }

        public Criteria andOperationalNotLike(String value) {
            addCriterion("operational not like", value, "operational");
            return (Criteria) this;
        }

        public Criteria andOperationalIn(List<String> values) {
            addCriterion("operational in", values, "operational");
            return (Criteria) this;
        }

        public Criteria andOperationalNotIn(List<String> values) {
            addCriterion("operational not in", values, "operational");
            return (Criteria) this;
        }

        public Criteria andOperationalBetween(String value1, String value2) {
            addCriterion("operational between", value1, value2, "operational");
            return (Criteria) this;
        }

        public Criteria andOperationalNotBetween(String value1, String value2) {
            addCriterion("operational not between", value1, value2, "operational");
            return (Criteria) this;
        }

        public Criteria andDangerousTypeIsNull() {
            addCriterion("dangerous_type is null");
            return (Criteria) this;
        }

        public Criteria andDangerousTypeIsNotNull() {
            addCriterion("dangerous_type is not null");
            return (Criteria) this;
        }

        public Criteria andDangerousTypeEqualTo(String value) {
            addCriterion("dangerous_type =", value, "dangerousType");
            return (Criteria) this;
        }

        public Criteria andDangerousTypeNotEqualTo(String value) {
            addCriterion("dangerous_type <>", value, "dangerousType");
            return (Criteria) this;
        }

        public Criteria andDangerousTypeGreaterThan(String value) {
            addCriterion("dangerous_type >", value, "dangerousType");
            return (Criteria) this;
        }

        public Criteria andDangerousTypeGreaterThanOrEqualTo(String value) {
            addCriterion("dangerous_type >=", value, "dangerousType");
            return (Criteria) this;
        }

        public Criteria andDangerousTypeLessThan(String value) {
            addCriterion("dangerous_type <", value, "dangerousType");
            return (Criteria) this;
        }

        public Criteria andDangerousTypeLessThanOrEqualTo(String value) {
            addCriterion("dangerous_type <=", value, "dangerousType");
            return (Criteria) this;
        }

        public Criteria andDangerousTypeLike(String value) {
            addCriterion("dangerous_type like", value, "dangerousType");
            return (Criteria) this;
        }

        public Criteria andDangerousTypeNotLike(String value) {
            addCriterion("dangerous_type not like", value, "dangerousType");
            return (Criteria) this;
        }

        public Criteria andDangerousTypeIn(List<String> values) {
            addCriterion("dangerous_type in", values, "dangerousType");
            return (Criteria) this;
        }

        public Criteria andDangerousTypeNotIn(List<String> values) {
            addCriterion("dangerous_type not in", values, "dangerousType");
            return (Criteria) this;
        }

        public Criteria andDangerousTypeBetween(String value1, String value2) {
            addCriterion("dangerous_type between", value1, value2, "dangerousType");
            return (Criteria) this;
        }

        public Criteria andDangerousTypeNotBetween(String value1, String value2) {
            addCriterion("dangerous_type not between", value1, value2, "dangerousType");
            return (Criteria) this;
        }

        public Criteria andQrtjIsNull() {
            addCriterion("QRTJ is null");
            return (Criteria) this;
        }

        public Criteria andQrtjIsNotNull() {
            addCriterion("QRTJ is not null");
            return (Criteria) this;
        }

        public Criteria andQrtjEqualTo(String value) {
            addCriterion("QRTJ =", value, "qrtj");
            return (Criteria) this;
        }

        public Criteria andQrtjNotEqualTo(String value) {
            addCriterion("QRTJ <>", value, "qrtj");
            return (Criteria) this;
        }

        public Criteria andQrtjGreaterThan(String value) {
            addCriterion("QRTJ >", value, "qrtj");
            return (Criteria) this;
        }

        public Criteria andQrtjGreaterThanOrEqualTo(String value) {
            addCriterion("QRTJ >=", value, "qrtj");
            return (Criteria) this;
        }

        public Criteria andQrtjLessThan(String value) {
            addCriterion("QRTJ <", value, "qrtj");
            return (Criteria) this;
        }

        public Criteria andQrtjLessThanOrEqualTo(String value) {
            addCriterion("QRTJ <=", value, "qrtj");
            return (Criteria) this;
        }

        public Criteria andQrtjLike(String value) {
            addCriterion("QRTJ like", value, "qrtj");
            return (Criteria) this;
        }

        public Criteria andQrtjNotLike(String value) {
            addCriterion("QRTJ not like", value, "qrtj");
            return (Criteria) this;
        }

        public Criteria andQrtjIn(List<String> values) {
            addCriterion("QRTJ in", values, "qrtj");
            return (Criteria) this;
        }

        public Criteria andQrtjNotIn(List<String> values) {
            addCriterion("QRTJ not in", values, "qrtj");
            return (Criteria) this;
        }

        public Criteria andQrtjBetween(String value1, String value2) {
            addCriterion("QRTJ between", value1, value2, "qrtj");
            return (Criteria) this;
        }

        public Criteria andQrtjNotBetween(String value1, String value2) {
            addCriterion("QRTJ not between", value1, value2, "qrtj");
            return (Criteria) this;
        }

        public Criteria andHealthHazardsIsNull() {
            addCriterion("health_hazards is null");
            return (Criteria) this;
        }

        public Criteria andHealthHazardsIsNotNull() {
            addCriterion("health_hazards is not null");
            return (Criteria) this;
        }

        public Criteria andHealthHazardsEqualTo(String value) {
            addCriterion("health_hazards =", value, "healthHazards");
            return (Criteria) this;
        }

        public Criteria andHealthHazardsNotEqualTo(String value) {
            addCriterion("health_hazards <>", value, "healthHazards");
            return (Criteria) this;
        }

        public Criteria andHealthHazardsGreaterThan(String value) {
            addCriterion("health_hazards >", value, "healthHazards");
            return (Criteria) this;
        }

        public Criteria andHealthHazardsGreaterThanOrEqualTo(String value) {
            addCriterion("health_hazards >=", value, "healthHazards");
            return (Criteria) this;
        }

        public Criteria andHealthHazardsLessThan(String value) {
            addCriterion("health_hazards <", value, "healthHazards");
            return (Criteria) this;
        }

        public Criteria andHealthHazardsLessThanOrEqualTo(String value) {
            addCriterion("health_hazards <=", value, "healthHazards");
            return (Criteria) this;
        }

        public Criteria andHealthHazardsLike(String value) {
            addCriterion("health_hazards like", value, "healthHazards");
            return (Criteria) this;
        }

        public Criteria andHealthHazardsNotLike(String value) {
            addCriterion("health_hazards not like", value, "healthHazards");
            return (Criteria) this;
        }

        public Criteria andHealthHazardsIn(List<String> values) {
            addCriterion("health_hazards in", values, "healthHazards");
            return (Criteria) this;
        }

        public Criteria andHealthHazardsNotIn(List<String> values) {
            addCriterion("health_hazards not in", values, "healthHazards");
            return (Criteria) this;
        }

        public Criteria andHealthHazardsBetween(String value1, String value2) {
            addCriterion("health_hazards between", value1, value2, "healthHazards");
            return (Criteria) this;
        }

        public Criteria andHealthHazardsNotBetween(String value1, String value2) {
            addCriterion("health_hazards not between", value1, value2, "healthHazards");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNull() {
            addCriterion("temperature is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNotNull() {
            addCriterion("temperature is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureEqualTo(String value) {
            addCriterion("temperature =", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotEqualTo(String value) {
            addCriterion("temperature <>", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThan(String value) {
            addCriterion("temperature >", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThanOrEqualTo(String value) {
            addCriterion("temperature >=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThan(String value) {
            addCriterion("temperature <", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThanOrEqualTo(String value) {
            addCriterion("temperature <=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLike(String value) {
            addCriterion("temperature like", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotLike(String value) {
            addCriterion("temperature not like", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureIn(List<String> values) {
            addCriterion("temperature in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotIn(List<String> values) {
            addCriterion("temperature not in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureBetween(String value1, String value2) {
            addCriterion("temperature between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotBetween(String value1, String value2) {
            addCriterion("temperature not between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andNervousSystemIsNull() {
            addCriterion("nervous_system is null");
            return (Criteria) this;
        }

        public Criteria andNervousSystemIsNotNull() {
            addCriterion("nervous_system is not null");
            return (Criteria) this;
        }

        public Criteria andNervousSystemEqualTo(String value) {
            addCriterion("nervous_system =", value, "nervousSystem");
            return (Criteria) this;
        }

        public Criteria andNervousSystemNotEqualTo(String value) {
            addCriterion("nervous_system <>", value, "nervousSystem");
            return (Criteria) this;
        }

        public Criteria andNervousSystemGreaterThan(String value) {
            addCriterion("nervous_system >", value, "nervousSystem");
            return (Criteria) this;
        }

        public Criteria andNervousSystemGreaterThanOrEqualTo(String value) {
            addCriterion("nervous_system >=", value, "nervousSystem");
            return (Criteria) this;
        }

        public Criteria andNervousSystemLessThan(String value) {
            addCriterion("nervous_system <", value, "nervousSystem");
            return (Criteria) this;
        }

        public Criteria andNervousSystemLessThanOrEqualTo(String value) {
            addCriterion("nervous_system <=", value, "nervousSystem");
            return (Criteria) this;
        }

        public Criteria andNervousSystemLike(String value) {
            addCriterion("nervous_system like", value, "nervousSystem");
            return (Criteria) this;
        }

        public Criteria andNervousSystemNotLike(String value) {
            addCriterion("nervous_system not like", value, "nervousSystem");
            return (Criteria) this;
        }

        public Criteria andNervousSystemIn(List<String> values) {
            addCriterion("nervous_system in", values, "nervousSystem");
            return (Criteria) this;
        }

        public Criteria andNervousSystemNotIn(List<String> values) {
            addCriterion("nervous_system not in", values, "nervousSystem");
            return (Criteria) this;
        }

        public Criteria andNervousSystemBetween(String value1, String value2) {
            addCriterion("nervous_system between", value1, value2, "nervousSystem");
            return (Criteria) this;
        }

        public Criteria andNervousSystemNotBetween(String value1, String value2) {
            addCriterion("nervous_system not between", value1, value2, "nervousSystem");
            return (Criteria) this;
        }

        public Criteria andEarsIsNull() {
            addCriterion("ears is null");
            return (Criteria) this;
        }

        public Criteria andEarsIsNotNull() {
            addCriterion("ears is not null");
            return (Criteria) this;
        }

        public Criteria andEarsEqualTo(String value) {
            addCriterion("ears =", value, "ears");
            return (Criteria) this;
        }

        public Criteria andEarsNotEqualTo(String value) {
            addCriterion("ears <>", value, "ears");
            return (Criteria) this;
        }

        public Criteria andEarsGreaterThan(String value) {
            addCriterion("ears >", value, "ears");
            return (Criteria) this;
        }

        public Criteria andEarsGreaterThanOrEqualTo(String value) {
            addCriterion("ears >=", value, "ears");
            return (Criteria) this;
        }

        public Criteria andEarsLessThan(String value) {
            addCriterion("ears <", value, "ears");
            return (Criteria) this;
        }

        public Criteria andEarsLessThanOrEqualTo(String value) {
            addCriterion("ears <=", value, "ears");
            return (Criteria) this;
        }

        public Criteria andEarsLike(String value) {
            addCriterion("ears like", value, "ears");
            return (Criteria) this;
        }

        public Criteria andEarsNotLike(String value) {
            addCriterion("ears not like", value, "ears");
            return (Criteria) this;
        }

        public Criteria andEarsIn(List<String> values) {
            addCriterion("ears in", values, "ears");
            return (Criteria) this;
        }

        public Criteria andEarsNotIn(List<String> values) {
            addCriterion("ears not in", values, "ears");
            return (Criteria) this;
        }

        public Criteria andEarsBetween(String value1, String value2) {
            addCriterion("ears between", value1, value2, "ears");
            return (Criteria) this;
        }

        public Criteria andEarsNotBetween(String value1, String value2) {
            addCriterion("ears not between", value1, value2, "ears");
            return (Criteria) this;
        }

        public Criteria andEyesIsNull() {
            addCriterion("eyes is null");
            return (Criteria) this;
        }

        public Criteria andEyesIsNotNull() {
            addCriterion("eyes is not null");
            return (Criteria) this;
        }

        public Criteria andEyesEqualTo(String value) {
            addCriterion("eyes =", value, "eyes");
            return (Criteria) this;
        }

        public Criteria andEyesNotEqualTo(String value) {
            addCriterion("eyes <>", value, "eyes");
            return (Criteria) this;
        }

        public Criteria andEyesGreaterThan(String value) {
            addCriterion("eyes >", value, "eyes");
            return (Criteria) this;
        }

        public Criteria andEyesGreaterThanOrEqualTo(String value) {
            addCriterion("eyes >=", value, "eyes");
            return (Criteria) this;
        }

        public Criteria andEyesLessThan(String value) {
            addCriterion("eyes <", value, "eyes");
            return (Criteria) this;
        }

        public Criteria andEyesLessThanOrEqualTo(String value) {
            addCriterion("eyes <=", value, "eyes");
            return (Criteria) this;
        }

        public Criteria andEyesLike(String value) {
            addCriterion("eyes like", value, "eyes");
            return (Criteria) this;
        }

        public Criteria andEyesNotLike(String value) {
            addCriterion("eyes not like", value, "eyes");
            return (Criteria) this;
        }

        public Criteria andEyesIn(List<String> values) {
            addCriterion("eyes in", values, "eyes");
            return (Criteria) this;
        }

        public Criteria andEyesNotIn(List<String> values) {
            addCriterion("eyes not in", values, "eyes");
            return (Criteria) this;
        }

        public Criteria andEyesBetween(String value1, String value2) {
            addCriterion("eyes between", value1, value2, "eyes");
            return (Criteria) this;
        }

        public Criteria andEyesNotBetween(String value1, String value2) {
            addCriterion("eyes not between", value1, value2, "eyes");
            return (Criteria) this;
        }

        public Criteria andNoseIsNull() {
            addCriterion("nose is null");
            return (Criteria) this;
        }

        public Criteria andNoseIsNotNull() {
            addCriterion("nose is not null");
            return (Criteria) this;
        }

        public Criteria andNoseEqualTo(String value) {
            addCriterion("nose =", value, "nose");
            return (Criteria) this;
        }

        public Criteria andNoseNotEqualTo(String value) {
            addCriterion("nose <>", value, "nose");
            return (Criteria) this;
        }

        public Criteria andNoseGreaterThan(String value) {
            addCriterion("nose >", value, "nose");
            return (Criteria) this;
        }

        public Criteria andNoseGreaterThanOrEqualTo(String value) {
            addCriterion("nose >=", value, "nose");
            return (Criteria) this;
        }

        public Criteria andNoseLessThan(String value) {
            addCriterion("nose <", value, "nose");
            return (Criteria) this;
        }

        public Criteria andNoseLessThanOrEqualTo(String value) {
            addCriterion("nose <=", value, "nose");
            return (Criteria) this;
        }

        public Criteria andNoseLike(String value) {
            addCriterion("nose like", value, "nose");
            return (Criteria) this;
        }

        public Criteria andNoseNotLike(String value) {
            addCriterion("nose not like", value, "nose");
            return (Criteria) this;
        }

        public Criteria andNoseIn(List<String> values) {
            addCriterion("nose in", values, "nose");
            return (Criteria) this;
        }

        public Criteria andNoseNotIn(List<String> values) {
            addCriterion("nose not in", values, "nose");
            return (Criteria) this;
        }

        public Criteria andNoseBetween(String value1, String value2) {
            addCriterion("nose between", value1, value2, "nose");
            return (Criteria) this;
        }

        public Criteria andNoseNotBetween(String value1, String value2) {
            addCriterion("nose not between", value1, value2, "nose");
            return (Criteria) this;
        }

        public Criteria andMouthIsNull() {
            addCriterion("mouth is null");
            return (Criteria) this;
        }

        public Criteria andMouthIsNotNull() {
            addCriterion("mouth is not null");
            return (Criteria) this;
        }

        public Criteria andMouthEqualTo(String value) {
            addCriterion("mouth =", value, "mouth");
            return (Criteria) this;
        }

        public Criteria andMouthNotEqualTo(String value) {
            addCriterion("mouth <>", value, "mouth");
            return (Criteria) this;
        }

        public Criteria andMouthGreaterThan(String value) {
            addCriterion("mouth >", value, "mouth");
            return (Criteria) this;
        }

        public Criteria andMouthGreaterThanOrEqualTo(String value) {
            addCriterion("mouth >=", value, "mouth");
            return (Criteria) this;
        }

        public Criteria andMouthLessThan(String value) {
            addCriterion("mouth <", value, "mouth");
            return (Criteria) this;
        }

        public Criteria andMouthLessThanOrEqualTo(String value) {
            addCriterion("mouth <=", value, "mouth");
            return (Criteria) this;
        }

        public Criteria andMouthLike(String value) {
            addCriterion("mouth like", value, "mouth");
            return (Criteria) this;
        }

        public Criteria andMouthNotLike(String value) {
            addCriterion("mouth not like", value, "mouth");
            return (Criteria) this;
        }

        public Criteria andMouthIn(List<String> values) {
            addCriterion("mouth in", values, "mouth");
            return (Criteria) this;
        }

        public Criteria andMouthNotIn(List<String> values) {
            addCriterion("mouth not in", values, "mouth");
            return (Criteria) this;
        }

        public Criteria andMouthBetween(String value1, String value2) {
            addCriterion("mouth between", value1, value2, "mouth");
            return (Criteria) this;
        }

        public Criteria andMouthNotBetween(String value1, String value2) {
            addCriterion("mouth not between", value1, value2, "mouth");
            return (Criteria) this;
        }

        public Criteria andCardiovascularIsNull() {
            addCriterion("cardiovascular is null");
            return (Criteria) this;
        }

        public Criteria andCardiovascularIsNotNull() {
            addCriterion("cardiovascular is not null");
            return (Criteria) this;
        }

        public Criteria andCardiovascularEqualTo(String value) {
            addCriterion("cardiovascular =", value, "cardiovascular");
            return (Criteria) this;
        }

        public Criteria andCardiovascularNotEqualTo(String value) {
            addCriterion("cardiovascular <>", value, "cardiovascular");
            return (Criteria) this;
        }

        public Criteria andCardiovascularGreaterThan(String value) {
            addCriterion("cardiovascular >", value, "cardiovascular");
            return (Criteria) this;
        }

        public Criteria andCardiovascularGreaterThanOrEqualTo(String value) {
            addCriterion("cardiovascular >=", value, "cardiovascular");
            return (Criteria) this;
        }

        public Criteria andCardiovascularLessThan(String value) {
            addCriterion("cardiovascular <", value, "cardiovascular");
            return (Criteria) this;
        }

        public Criteria andCardiovascularLessThanOrEqualTo(String value) {
            addCriterion("cardiovascular <=", value, "cardiovascular");
            return (Criteria) this;
        }

        public Criteria andCardiovascularLike(String value) {
            addCriterion("cardiovascular like", value, "cardiovascular");
            return (Criteria) this;
        }

        public Criteria andCardiovascularNotLike(String value) {
            addCriterion("cardiovascular not like", value, "cardiovascular");
            return (Criteria) this;
        }

        public Criteria andCardiovascularIn(List<String> values) {
            addCriterion("cardiovascular in", values, "cardiovascular");
            return (Criteria) this;
        }

        public Criteria andCardiovascularNotIn(List<String> values) {
            addCriterion("cardiovascular not in", values, "cardiovascular");
            return (Criteria) this;
        }

        public Criteria andCardiovascularBetween(String value1, String value2) {
            addCriterion("cardiovascular between", value1, value2, "cardiovascular");
            return (Criteria) this;
        }

        public Criteria andCardiovascularNotBetween(String value1, String value2) {
            addCriterion("cardiovascular not between", value1, value2, "cardiovascular");
            return (Criteria) this;
        }

        public Criteria andRespiratorySystemIsNull() {
            addCriterion("respiratory_system is null");
            return (Criteria) this;
        }

        public Criteria andRespiratorySystemIsNotNull() {
            addCriterion("respiratory_system is not null");
            return (Criteria) this;
        }

        public Criteria andRespiratorySystemEqualTo(String value) {
            addCriterion("respiratory_system =", value, "respiratorySystem");
            return (Criteria) this;
        }

        public Criteria andRespiratorySystemNotEqualTo(String value) {
            addCriterion("respiratory_system <>", value, "respiratorySystem");
            return (Criteria) this;
        }

        public Criteria andRespiratorySystemGreaterThan(String value) {
            addCriterion("respiratory_system >", value, "respiratorySystem");
            return (Criteria) this;
        }

        public Criteria andRespiratorySystemGreaterThanOrEqualTo(String value) {
            addCriterion("respiratory_system >=", value, "respiratorySystem");
            return (Criteria) this;
        }

        public Criteria andRespiratorySystemLessThan(String value) {
            addCriterion("respiratory_system <", value, "respiratorySystem");
            return (Criteria) this;
        }

        public Criteria andRespiratorySystemLessThanOrEqualTo(String value) {
            addCriterion("respiratory_system <=", value, "respiratorySystem");
            return (Criteria) this;
        }

        public Criteria andRespiratorySystemLike(String value) {
            addCriterion("respiratory_system like", value, "respiratorySystem");
            return (Criteria) this;
        }

        public Criteria andRespiratorySystemNotLike(String value) {
            addCriterion("respiratory_system not like", value, "respiratorySystem");
            return (Criteria) this;
        }

        public Criteria andRespiratorySystemIn(List<String> values) {
            addCriterion("respiratory_system in", values, "respiratorySystem");
            return (Criteria) this;
        }

        public Criteria andRespiratorySystemNotIn(List<String> values) {
            addCriterion("respiratory_system not in", values, "respiratorySystem");
            return (Criteria) this;
        }

        public Criteria andRespiratorySystemBetween(String value1, String value2) {
            addCriterion("respiratory_system between", value1, value2, "respiratorySystem");
            return (Criteria) this;
        }

        public Criteria andRespiratorySystemNotBetween(String value1, String value2) {
            addCriterion("respiratory_system not between", value1, value2, "respiratorySystem");
            return (Criteria) this;
        }

        public Criteria andGastricSystemIsNull() {
            addCriterion("gastric_system is null");
            return (Criteria) this;
        }

        public Criteria andGastricSystemIsNotNull() {
            addCriterion("gastric_system is not null");
            return (Criteria) this;
        }

        public Criteria andGastricSystemEqualTo(String value) {
            addCriterion("gastric_system =", value, "gastricSystem");
            return (Criteria) this;
        }

        public Criteria andGastricSystemNotEqualTo(String value) {
            addCriterion("gastric_system <>", value, "gastricSystem");
            return (Criteria) this;
        }

        public Criteria andGastricSystemGreaterThan(String value) {
            addCriterion("gastric_system >", value, "gastricSystem");
            return (Criteria) this;
        }

        public Criteria andGastricSystemGreaterThanOrEqualTo(String value) {
            addCriterion("gastric_system >=", value, "gastricSystem");
            return (Criteria) this;
        }

        public Criteria andGastricSystemLessThan(String value) {
            addCriterion("gastric_system <", value, "gastricSystem");
            return (Criteria) this;
        }

        public Criteria andGastricSystemLessThanOrEqualTo(String value) {
            addCriterion("gastric_system <=", value, "gastricSystem");
            return (Criteria) this;
        }

        public Criteria andGastricSystemLike(String value) {
            addCriterion("gastric_system like", value, "gastricSystem");
            return (Criteria) this;
        }

        public Criteria andGastricSystemNotLike(String value) {
            addCriterion("gastric_system not like", value, "gastricSystem");
            return (Criteria) this;
        }

        public Criteria andGastricSystemIn(List<String> values) {
            addCriterion("gastric_system in", values, "gastricSystem");
            return (Criteria) this;
        }

        public Criteria andGastricSystemNotIn(List<String> values) {
            addCriterion("gastric_system not in", values, "gastricSystem");
            return (Criteria) this;
        }

        public Criteria andGastricSystemBetween(String value1, String value2) {
            addCriterion("gastric_system between", value1, value2, "gastricSystem");
            return (Criteria) this;
        }

        public Criteria andGastricSystemNotBetween(String value1, String value2) {
            addCriterion("gastric_system not between", value1, value2, "gastricSystem");
            return (Criteria) this;
        }

        public Criteria andSkinIsNull() {
            addCriterion("skin is null");
            return (Criteria) this;
        }

        public Criteria andSkinIsNotNull() {
            addCriterion("skin is not null");
            return (Criteria) this;
        }

        public Criteria andSkinEqualTo(String value) {
            addCriterion("skin =", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinNotEqualTo(String value) {
            addCriterion("skin <>", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinGreaterThan(String value) {
            addCriterion("skin >", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinGreaterThanOrEqualTo(String value) {
            addCriterion("skin >=", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinLessThan(String value) {
            addCriterion("skin <", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinLessThanOrEqualTo(String value) {
            addCriterion("skin <=", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinLike(String value) {
            addCriterion("skin like", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinNotLike(String value) {
            addCriterion("skin not like", value, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinIn(List<String> values) {
            addCriterion("skin in", values, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinNotIn(List<String> values) {
            addCriterion("skin not in", values, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinBetween(String value1, String value2) {
            addCriterion("skin between", value1, value2, "skin");
            return (Criteria) this;
        }

        public Criteria andSkinNotBetween(String value1, String value2) {
            addCriterion("skin not between", value1, value2, "skin");
            return (Criteria) this;
        }

        public Criteria andCombustibilityIsNull() {
            addCriterion("combustibility is null");
            return (Criteria) this;
        }

        public Criteria andCombustibilityIsNotNull() {
            addCriterion("combustibility is not null");
            return (Criteria) this;
        }

        public Criteria andCombustibilityEqualTo(String value) {
            addCriterion("combustibility =", value, "combustibility");
            return (Criteria) this;
        }

        public Criteria andCombustibilityNotEqualTo(String value) {
            addCriterion("combustibility <>", value, "combustibility");
            return (Criteria) this;
        }

        public Criteria andCombustibilityGreaterThan(String value) {
            addCriterion("combustibility >", value, "combustibility");
            return (Criteria) this;
        }

        public Criteria andCombustibilityGreaterThanOrEqualTo(String value) {
            addCriterion("combustibility >=", value, "combustibility");
            return (Criteria) this;
        }

        public Criteria andCombustibilityLessThan(String value) {
            addCriterion("combustibility <", value, "combustibility");
            return (Criteria) this;
        }

        public Criteria andCombustibilityLessThanOrEqualTo(String value) {
            addCriterion("combustibility <=", value, "combustibility");
            return (Criteria) this;
        }

        public Criteria andCombustibilityLike(String value) {
            addCriterion("combustibility like", value, "combustibility");
            return (Criteria) this;
        }

        public Criteria andCombustibilityNotLike(String value) {
            addCriterion("combustibility not like", value, "combustibility");
            return (Criteria) this;
        }

        public Criteria andCombustibilityIn(List<String> values) {
            addCriterion("combustibility in", values, "combustibility");
            return (Criteria) this;
        }

        public Criteria andCombustibilityNotIn(List<String> values) {
            addCriterion("combustibility not in", values, "combustibility");
            return (Criteria) this;
        }

        public Criteria andCombustibilityBetween(String value1, String value2) {
            addCriterion("combustibility between", value1, value2, "combustibility");
            return (Criteria) this;
        }

        public Criteria andCombustibilityNotBetween(String value1, String value2) {
            addCriterion("combustibility not between", value1, value2, "combustibility");
            return (Criteria) this;
        }

        public Criteria andProductIsNull() {
            addCriterion("product is null");
            return (Criteria) this;
        }

        public Criteria andProductIsNotNull() {
            addCriterion("product is not null");
            return (Criteria) this;
        }

        public Criteria andProductEqualTo(String value) {
            addCriterion("product =", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotEqualTo(String value) {
            addCriterion("product <>", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductGreaterThan(String value) {
            addCriterion("product >", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductGreaterThanOrEqualTo(String value) {
            addCriterion("product >=", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLessThan(String value) {
            addCriterion("product <", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLessThanOrEqualTo(String value) {
            addCriterion("product <=", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductLike(String value) {
            addCriterion("product like", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotLike(String value) {
            addCriterion("product not like", value, "product");
            return (Criteria) this;
        }

        public Criteria andProductIn(List<String> values) {
            addCriterion("product in", values, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotIn(List<String> values) {
            addCriterion("product not in", values, "product");
            return (Criteria) this;
        }

        public Criteria andProductBetween(String value1, String value2) {
            addCriterion("product between", value1, value2, "product");
            return (Criteria) this;
        }

        public Criteria andProductNotBetween(String value1, String value2) {
            addCriterion("product not between", value1, value2, "product");
            return (Criteria) this;
        }

        public Criteria andSkinContactIsNull() {
            addCriterion("skin_contact is null");
            return (Criteria) this;
        }

        public Criteria andSkinContactIsNotNull() {
            addCriterion("skin_contact is not null");
            return (Criteria) this;
        }

        public Criteria andSkinContactEqualTo(String value) {
            addCriterion("skin_contact =", value, "skinContact");
            return (Criteria) this;
        }

        public Criteria andSkinContactNotEqualTo(String value) {
            addCriterion("skin_contact <>", value, "skinContact");
            return (Criteria) this;
        }

        public Criteria andSkinContactGreaterThan(String value) {
            addCriterion("skin_contact >", value, "skinContact");
            return (Criteria) this;
        }

        public Criteria andSkinContactGreaterThanOrEqualTo(String value) {
            addCriterion("skin_contact >=", value, "skinContact");
            return (Criteria) this;
        }

        public Criteria andSkinContactLessThan(String value) {
            addCriterion("skin_contact <", value, "skinContact");
            return (Criteria) this;
        }

        public Criteria andSkinContactLessThanOrEqualTo(String value) {
            addCriterion("skin_contact <=", value, "skinContact");
            return (Criteria) this;
        }

        public Criteria andSkinContactLike(String value) {
            addCriterion("skin_contact like", value, "skinContact");
            return (Criteria) this;
        }

        public Criteria andSkinContactNotLike(String value) {
            addCriterion("skin_contact not like", value, "skinContact");
            return (Criteria) this;
        }

        public Criteria andSkinContactIn(List<String> values) {
            addCriterion("skin_contact in", values, "skinContact");
            return (Criteria) this;
        }

        public Criteria andSkinContactNotIn(List<String> values) {
            addCriterion("skin_contact not in", values, "skinContact");
            return (Criteria) this;
        }

        public Criteria andSkinContactBetween(String value1, String value2) {
            addCriterion("skin_contact between", value1, value2, "skinContact");
            return (Criteria) this;
        }

        public Criteria andSkinContactNotBetween(String value1, String value2) {
            addCriterion("skin_contact not between", value1, value2, "skinContact");
            return (Criteria) this;
        }

        public Criteria andEyeContactIsNull() {
            addCriterion("eye_contact is null");
            return (Criteria) this;
        }

        public Criteria andEyeContactIsNotNull() {
            addCriterion("eye_contact is not null");
            return (Criteria) this;
        }

        public Criteria andEyeContactEqualTo(String value) {
            addCriterion("eye_contact =", value, "eyeContact");
            return (Criteria) this;
        }

        public Criteria andEyeContactNotEqualTo(String value) {
            addCriterion("eye_contact <>", value, "eyeContact");
            return (Criteria) this;
        }

        public Criteria andEyeContactGreaterThan(String value) {
            addCriterion("eye_contact >", value, "eyeContact");
            return (Criteria) this;
        }

        public Criteria andEyeContactGreaterThanOrEqualTo(String value) {
            addCriterion("eye_contact >=", value, "eyeContact");
            return (Criteria) this;
        }

        public Criteria andEyeContactLessThan(String value) {
            addCriterion("eye_contact <", value, "eyeContact");
            return (Criteria) this;
        }

        public Criteria andEyeContactLessThanOrEqualTo(String value) {
            addCriterion("eye_contact <=", value, "eyeContact");
            return (Criteria) this;
        }

        public Criteria andEyeContactLike(String value) {
            addCriterion("eye_contact like", value, "eyeContact");
            return (Criteria) this;
        }

        public Criteria andEyeContactNotLike(String value) {
            addCriterion("eye_contact not like", value, "eyeContact");
            return (Criteria) this;
        }

        public Criteria andEyeContactIn(List<String> values) {
            addCriterion("eye_contact in", values, "eyeContact");
            return (Criteria) this;
        }

        public Criteria andEyeContactNotIn(List<String> values) {
            addCriterion("eye_contact not in", values, "eyeContact");
            return (Criteria) this;
        }

        public Criteria andEyeContactBetween(String value1, String value2) {
            addCriterion("eye_contact between", value1, value2, "eyeContact");
            return (Criteria) this;
        }

        public Criteria andEyeContactNotBetween(String value1, String value2) {
            addCriterion("eye_contact not between", value1, value2, "eyeContact");
            return (Criteria) this;
        }

        public Criteria andInspiroationIsNull() {
            addCriterion("inspiroation is null");
            return (Criteria) this;
        }

        public Criteria andInspiroationIsNotNull() {
            addCriterion("inspiroation is not null");
            return (Criteria) this;
        }

        public Criteria andInspiroationEqualTo(String value) {
            addCriterion("inspiroation =", value, "inspiroation");
            return (Criteria) this;
        }

        public Criteria andInspiroationNotEqualTo(String value) {
            addCriterion("inspiroation <>", value, "inspiroation");
            return (Criteria) this;
        }

        public Criteria andInspiroationGreaterThan(String value) {
            addCriterion("inspiroation >", value, "inspiroation");
            return (Criteria) this;
        }

        public Criteria andInspiroationGreaterThanOrEqualTo(String value) {
            addCriterion("inspiroation >=", value, "inspiroation");
            return (Criteria) this;
        }

        public Criteria andInspiroationLessThan(String value) {
            addCriterion("inspiroation <", value, "inspiroation");
            return (Criteria) this;
        }

        public Criteria andInspiroationLessThanOrEqualTo(String value) {
            addCriterion("inspiroation <=", value, "inspiroation");
            return (Criteria) this;
        }

        public Criteria andInspiroationLike(String value) {
            addCriterion("inspiroation like", value, "inspiroation");
            return (Criteria) this;
        }

        public Criteria andInspiroationNotLike(String value) {
            addCriterion("inspiroation not like", value, "inspiroation");
            return (Criteria) this;
        }

        public Criteria andInspiroationIn(List<String> values) {
            addCriterion("inspiroation in", values, "inspiroation");
            return (Criteria) this;
        }

        public Criteria andInspiroationNotIn(List<String> values) {
            addCriterion("inspiroation not in", values, "inspiroation");
            return (Criteria) this;
        }

        public Criteria andInspiroationBetween(String value1, String value2) {
            addCriterion("inspiroation between", value1, value2, "inspiroation");
            return (Criteria) this;
        }

        public Criteria andInspiroationNotBetween(String value1, String value2) {
            addCriterion("inspiroation not between", value1, value2, "inspiroation");
            return (Criteria) this;
        }

        public Criteria andSuctionIsNull() {
            addCriterion("suction is null");
            return (Criteria) this;
        }

        public Criteria andSuctionIsNotNull() {
            addCriterion("suction is not null");
            return (Criteria) this;
        }

        public Criteria andSuctionEqualTo(String value) {
            addCriterion("suction =", value, "suction");
            return (Criteria) this;
        }

        public Criteria andSuctionNotEqualTo(String value) {
            addCriterion("suction <>", value, "suction");
            return (Criteria) this;
        }

        public Criteria andSuctionGreaterThan(String value) {
            addCriterion("suction >", value, "suction");
            return (Criteria) this;
        }

        public Criteria andSuctionGreaterThanOrEqualTo(String value) {
            addCriterion("suction >=", value, "suction");
            return (Criteria) this;
        }

        public Criteria andSuctionLessThan(String value) {
            addCriterion("suction <", value, "suction");
            return (Criteria) this;
        }

        public Criteria andSuctionLessThanOrEqualTo(String value) {
            addCriterion("suction <=", value, "suction");
            return (Criteria) this;
        }

        public Criteria andSuctionLike(String value) {
            addCriterion("suction like", value, "suction");
            return (Criteria) this;
        }

        public Criteria andSuctionNotLike(String value) {
            addCriterion("suction not like", value, "suction");
            return (Criteria) this;
        }

        public Criteria andSuctionIn(List<String> values) {
            addCriterion("suction in", values, "suction");
            return (Criteria) this;
        }

        public Criteria andSuctionNotIn(List<String> values) {
            addCriterion("suction not in", values, "suction");
            return (Criteria) this;
        }

        public Criteria andSuctionBetween(String value1, String value2) {
            addCriterion("suction between", value1, value2, "suction");
            return (Criteria) this;
        }

        public Criteria andSuctionNotBetween(String value1, String value2) {
            addCriterion("suction not between", value1, value2, "suction");
            return (Criteria) this;
        }

        public Criteria andDangerousCharacteristicsIsNull() {
            addCriterion("dangerous_characteristics is null");
            return (Criteria) this;
        }

        public Criteria andDangerousCharacteristicsIsNotNull() {
            addCriterion("dangerous_characteristics is not null");
            return (Criteria) this;
        }

        public Criteria andDangerousCharacteristicsEqualTo(String value) {
            addCriterion("dangerous_characteristics =", value, "dangerousCharacteristics");
            return (Criteria) this;
        }

        public Criteria andDangerousCharacteristicsNotEqualTo(String value) {
            addCriterion("dangerous_characteristics <>", value, "dangerousCharacteristics");
            return (Criteria) this;
        }

        public Criteria andDangerousCharacteristicsGreaterThan(String value) {
            addCriterion("dangerous_characteristics >", value, "dangerousCharacteristics");
            return (Criteria) this;
        }

        public Criteria andDangerousCharacteristicsGreaterThanOrEqualTo(String value) {
            addCriterion("dangerous_characteristics >=", value, "dangerousCharacteristics");
            return (Criteria) this;
        }

        public Criteria andDangerousCharacteristicsLessThan(String value) {
            addCriterion("dangerous_characteristics <", value, "dangerousCharacteristics");
            return (Criteria) this;
        }

        public Criteria andDangerousCharacteristicsLessThanOrEqualTo(String value) {
            addCriterion("dangerous_characteristics <=", value, "dangerousCharacteristics");
            return (Criteria) this;
        }

        public Criteria andDangerousCharacteristicsLike(String value) {
            addCriterion("dangerous_characteristics like", value, "dangerousCharacteristics");
            return (Criteria) this;
        }

        public Criteria andDangerousCharacteristicsNotLike(String value) {
            addCriterion("dangerous_characteristics not like", value, "dangerousCharacteristics");
            return (Criteria) this;
        }

        public Criteria andDangerousCharacteristicsIn(List<String> values) {
            addCriterion("dangerous_characteristics in", values, "dangerousCharacteristics");
            return (Criteria) this;
        }

        public Criteria andDangerousCharacteristicsNotIn(List<String> values) {
            addCriterion("dangerous_characteristics not in", values, "dangerousCharacteristics");
            return (Criteria) this;
        }

        public Criteria andDangerousCharacteristicsBetween(String value1, String value2) {
            addCriterion("dangerous_characteristics between", value1, value2, "dangerousCharacteristics");
            return (Criteria) this;
        }

        public Criteria andDangerousCharacteristicsNotBetween(String value1, String value2) {
            addCriterion("dangerous_characteristics not between", value1, value2, "dangerousCharacteristics");
            return (Criteria) this;
        }

        public Criteria andOutfireIsNull() {
            addCriterion("outfire is null");
            return (Criteria) this;
        }

        public Criteria andOutfireIsNotNull() {
            addCriterion("outfire is not null");
            return (Criteria) this;
        }

        public Criteria andOutfireEqualTo(String value) {
            addCriterion("outfire =", value, "outfire");
            return (Criteria) this;
        }

        public Criteria andOutfireNotEqualTo(String value) {
            addCriterion("outfire <>", value, "outfire");
            return (Criteria) this;
        }

        public Criteria andOutfireGreaterThan(String value) {
            addCriterion("outfire >", value, "outfire");
            return (Criteria) this;
        }

        public Criteria andOutfireGreaterThanOrEqualTo(String value) {
            addCriterion("outfire >=", value, "outfire");
            return (Criteria) this;
        }

        public Criteria andOutfireLessThan(String value) {
            addCriterion("outfire <", value, "outfire");
            return (Criteria) this;
        }

        public Criteria andOutfireLessThanOrEqualTo(String value) {
            addCriterion("outfire <=", value, "outfire");
            return (Criteria) this;
        }

        public Criteria andOutfireLike(String value) {
            addCriterion("outfire like", value, "outfire");
            return (Criteria) this;
        }

        public Criteria andOutfireNotLike(String value) {
            addCriterion("outfire not like", value, "outfire");
            return (Criteria) this;
        }

        public Criteria andOutfireIn(List<String> values) {
            addCriterion("outfire in", values, "outfire");
            return (Criteria) this;
        }

        public Criteria andOutfireNotIn(List<String> values) {
            addCriterion("outfire not in", values, "outfire");
            return (Criteria) this;
        }

        public Criteria andOutfireBetween(String value1, String value2) {
            addCriterion("outfire between", value1, value2, "outfire");
            return (Criteria) this;
        }

        public Criteria andOutfireNotBetween(String value1, String value2) {
            addCriterion("outfire not between", value1, value2, "outfire");
            return (Criteria) this;
        }

        public Criteria andLeakageIsNull() {
            addCriterion("leakage is null");
            return (Criteria) this;
        }

        public Criteria andLeakageIsNotNull() {
            addCriterion("leakage is not null");
            return (Criteria) this;
        }

        public Criteria andLeakageEqualTo(String value) {
            addCriterion("leakage =", value, "leakage");
            return (Criteria) this;
        }

        public Criteria andLeakageNotEqualTo(String value) {
            addCriterion("leakage <>", value, "leakage");
            return (Criteria) this;
        }

        public Criteria andLeakageGreaterThan(String value) {
            addCriterion("leakage >", value, "leakage");
            return (Criteria) this;
        }

        public Criteria andLeakageGreaterThanOrEqualTo(String value) {
            addCriterion("leakage >=", value, "leakage");
            return (Criteria) this;
        }

        public Criteria andLeakageLessThan(String value) {
            addCriterion("leakage <", value, "leakage");
            return (Criteria) this;
        }

        public Criteria andLeakageLessThanOrEqualTo(String value) {
            addCriterion("leakage <=", value, "leakage");
            return (Criteria) this;
        }

        public Criteria andLeakageLike(String value) {
            addCriterion("leakage like", value, "leakage");
            return (Criteria) this;
        }

        public Criteria andLeakageNotLike(String value) {
            addCriterion("leakage not like", value, "leakage");
            return (Criteria) this;
        }

        public Criteria andLeakageIn(List<String> values) {
            addCriterion("leakage in", values, "leakage");
            return (Criteria) this;
        }

        public Criteria andLeakageNotIn(List<String> values) {
            addCriterion("leakage not in", values, "leakage");
            return (Criteria) this;
        }

        public Criteria andLeakageBetween(String value1, String value2) {
            addCriterion("leakage between", value1, value2, "leakage");
            return (Criteria) this;
        }

        public Criteria andLeakageNotBetween(String value1, String value2) {
            addCriterion("leakage not between", value1, value2, "leakage");
            return (Criteria) this;
        }

        public Criteria andStorageAttentionIsNull() {
            addCriterion("storage_attention is null");
            return (Criteria) this;
        }

        public Criteria andStorageAttentionIsNotNull() {
            addCriterion("storage_attention is not null");
            return (Criteria) this;
        }

        public Criteria andStorageAttentionEqualTo(String value) {
            addCriterion("storage_attention =", value, "storageAttention");
            return (Criteria) this;
        }

        public Criteria andStorageAttentionNotEqualTo(String value) {
            addCriterion("storage_attention <>", value, "storageAttention");
            return (Criteria) this;
        }

        public Criteria andStorageAttentionGreaterThan(String value) {
            addCriterion("storage_attention >", value, "storageAttention");
            return (Criteria) this;
        }

        public Criteria andStorageAttentionGreaterThanOrEqualTo(String value) {
            addCriterion("storage_attention >=", value, "storageAttention");
            return (Criteria) this;
        }

        public Criteria andStorageAttentionLessThan(String value) {
            addCriterion("storage_attention <", value, "storageAttention");
            return (Criteria) this;
        }

        public Criteria andStorageAttentionLessThanOrEqualTo(String value) {
            addCriterion("storage_attention <=", value, "storageAttention");
            return (Criteria) this;
        }

        public Criteria andStorageAttentionLike(String value) {
            addCriterion("storage_attention like", value, "storageAttention");
            return (Criteria) this;
        }

        public Criteria andStorageAttentionNotLike(String value) {
            addCriterion("storage_attention not like", value, "storageAttention");
            return (Criteria) this;
        }

        public Criteria andStorageAttentionIn(List<String> values) {
            addCriterion("storage_attention in", values, "storageAttention");
            return (Criteria) this;
        }

        public Criteria andStorageAttentionNotIn(List<String> values) {
            addCriterion("storage_attention not in", values, "storageAttention");
            return (Criteria) this;
        }

        public Criteria andStorageAttentionBetween(String value1, String value2) {
            addCriterion("storage_attention between", value1, value2, "storageAttention");
            return (Criteria) this;
        }

        public Criteria andStorageAttentionNotBetween(String value1, String value2) {
            addCriterion("storage_attention not between", value1, value2, "storageAttention");
            return (Criteria) this;
        }

        public Criteria andContactLimitIsNull() {
            addCriterion("contact_limit is null");
            return (Criteria) this;
        }

        public Criteria andContactLimitIsNotNull() {
            addCriterion("contact_limit is not null");
            return (Criteria) this;
        }

        public Criteria andContactLimitEqualTo(String value) {
            addCriterion("contact_limit =", value, "contactLimit");
            return (Criteria) this;
        }

        public Criteria andContactLimitNotEqualTo(String value) {
            addCriterion("contact_limit <>", value, "contactLimit");
            return (Criteria) this;
        }

        public Criteria andContactLimitGreaterThan(String value) {
            addCriterion("contact_limit >", value, "contactLimit");
            return (Criteria) this;
        }

        public Criteria andContactLimitGreaterThanOrEqualTo(String value) {
            addCriterion("contact_limit >=", value, "contactLimit");
            return (Criteria) this;
        }

        public Criteria andContactLimitLessThan(String value) {
            addCriterion("contact_limit <", value, "contactLimit");
            return (Criteria) this;
        }

        public Criteria andContactLimitLessThanOrEqualTo(String value) {
            addCriterion("contact_limit <=", value, "contactLimit");
            return (Criteria) this;
        }

        public Criteria andContactLimitLike(String value) {
            addCriterion("contact_limit like", value, "contactLimit");
            return (Criteria) this;
        }

        public Criteria andContactLimitNotLike(String value) {
            addCriterion("contact_limit not like", value, "contactLimit");
            return (Criteria) this;
        }

        public Criteria andContactLimitIn(List<String> values) {
            addCriterion("contact_limit in", values, "contactLimit");
            return (Criteria) this;
        }

        public Criteria andContactLimitNotIn(List<String> values) {
            addCriterion("contact_limit not in", values, "contactLimit");
            return (Criteria) this;
        }

        public Criteria andContactLimitBetween(String value1, String value2) {
            addCriterion("contact_limit between", value1, value2, "contactLimit");
            return (Criteria) this;
        }

        public Criteria andContactLimitNotBetween(String value1, String value2) {
            addCriterion("contact_limit not between", value1, value2, "contactLimit");
            return (Criteria) this;
        }

        public Criteria andJcxzsIsNull() {
            addCriterion("JCXZS is null");
            return (Criteria) this;
        }

        public Criteria andJcxzsIsNotNull() {
            addCriterion("JCXZS is not null");
            return (Criteria) this;
        }

        public Criteria andJcxzsEqualTo(String value) {
            addCriterion("JCXZS =", value, "jcxzs");
            return (Criteria) this;
        }

        public Criteria andJcxzsNotEqualTo(String value) {
            addCriterion("JCXZS <>", value, "jcxzs");
            return (Criteria) this;
        }

        public Criteria andJcxzsGreaterThan(String value) {
            addCriterion("JCXZS >", value, "jcxzs");
            return (Criteria) this;
        }

        public Criteria andJcxzsGreaterThanOrEqualTo(String value) {
            addCriterion("JCXZS >=", value, "jcxzs");
            return (Criteria) this;
        }

        public Criteria andJcxzsLessThan(String value) {
            addCriterion("JCXZS <", value, "jcxzs");
            return (Criteria) this;
        }

        public Criteria andJcxzsLessThanOrEqualTo(String value) {
            addCriterion("JCXZS <=", value, "jcxzs");
            return (Criteria) this;
        }

        public Criteria andJcxzsLike(String value) {
            addCriterion("JCXZS like", value, "jcxzs");
            return (Criteria) this;
        }

        public Criteria andJcxzsNotLike(String value) {
            addCriterion("JCXZS not like", value, "jcxzs");
            return (Criteria) this;
        }

        public Criteria andJcxzsIn(List<String> values) {
            addCriterion("JCXZS in", values, "jcxzs");
            return (Criteria) this;
        }

        public Criteria andJcxzsNotIn(List<String> values) {
            addCriterion("JCXZS not in", values, "jcxzs");
            return (Criteria) this;
        }

        public Criteria andJcxzsBetween(String value1, String value2) {
            addCriterion("JCXZS between", value1, value2, "jcxzs");
            return (Criteria) this;
        }

        public Criteria andJcxzsNotBetween(String value1, String value2) {
            addCriterion("JCXZS not between", value1, value2, "jcxzs");
            return (Criteria) this;
        }

        public Criteria andJcxztwaIsNull() {
            addCriterion("JCXZTWA is null");
            return (Criteria) this;
        }

        public Criteria andJcxztwaIsNotNull() {
            addCriterion("JCXZTWA is not null");
            return (Criteria) this;
        }

        public Criteria andJcxztwaEqualTo(String value) {
            addCriterion("JCXZTWA =", value, "jcxztwa");
            return (Criteria) this;
        }

        public Criteria andJcxztwaNotEqualTo(String value) {
            addCriterion("JCXZTWA <>", value, "jcxztwa");
            return (Criteria) this;
        }

        public Criteria andJcxztwaGreaterThan(String value) {
            addCriterion("JCXZTWA >", value, "jcxztwa");
            return (Criteria) this;
        }

        public Criteria andJcxztwaGreaterThanOrEqualTo(String value) {
            addCriterion("JCXZTWA >=", value, "jcxztwa");
            return (Criteria) this;
        }

        public Criteria andJcxztwaLessThan(String value) {
            addCriterion("JCXZTWA <", value, "jcxztwa");
            return (Criteria) this;
        }

        public Criteria andJcxztwaLessThanOrEqualTo(String value) {
            addCriterion("JCXZTWA <=", value, "jcxztwa");
            return (Criteria) this;
        }

        public Criteria andJcxztwaLike(String value) {
            addCriterion("JCXZTWA like", value, "jcxztwa");
            return (Criteria) this;
        }

        public Criteria andJcxztwaNotLike(String value) {
            addCriterion("JCXZTWA not like", value, "jcxztwa");
            return (Criteria) this;
        }

        public Criteria andJcxztwaIn(List<String> values) {
            addCriterion("JCXZTWA in", values, "jcxztwa");
            return (Criteria) this;
        }

        public Criteria andJcxztwaNotIn(List<String> values) {
            addCriterion("JCXZTWA not in", values, "jcxztwa");
            return (Criteria) this;
        }

        public Criteria andJcxztwaBetween(String value1, String value2) {
            addCriterion("JCXZTWA between", value1, value2, "jcxztwa");
            return (Criteria) this;
        }

        public Criteria andJcxztwaNotBetween(String value1, String value2) {
            addCriterion("JCXZTWA not between", value1, value2, "jcxztwa");
            return (Criteria) this;
        }

        public Criteria andJcxzstelIsNull() {
            addCriterion("JCXZSTEL is null");
            return (Criteria) this;
        }

        public Criteria andJcxzstelIsNotNull() {
            addCriterion("JCXZSTEL is not null");
            return (Criteria) this;
        }

        public Criteria andJcxzstelEqualTo(String value) {
            addCriterion("JCXZSTEL =", value, "jcxzstel");
            return (Criteria) this;
        }

        public Criteria andJcxzstelNotEqualTo(String value) {
            addCriterion("JCXZSTEL <>", value, "jcxzstel");
            return (Criteria) this;
        }

        public Criteria andJcxzstelGreaterThan(String value) {
            addCriterion("JCXZSTEL >", value, "jcxzstel");
            return (Criteria) this;
        }

        public Criteria andJcxzstelGreaterThanOrEqualTo(String value) {
            addCriterion("JCXZSTEL >=", value, "jcxzstel");
            return (Criteria) this;
        }

        public Criteria andJcxzstelLessThan(String value) {
            addCriterion("JCXZSTEL <", value, "jcxzstel");
            return (Criteria) this;
        }

        public Criteria andJcxzstelLessThanOrEqualTo(String value) {
            addCriterion("JCXZSTEL <=", value, "jcxzstel");
            return (Criteria) this;
        }

        public Criteria andJcxzstelLike(String value) {
            addCriterion("JCXZSTEL like", value, "jcxzstel");
            return (Criteria) this;
        }

        public Criteria andJcxzstelNotLike(String value) {
            addCriterion("JCXZSTEL not like", value, "jcxzstel");
            return (Criteria) this;
        }

        public Criteria andJcxzstelIn(List<String> values) {
            addCriterion("JCXZSTEL in", values, "jcxzstel");
            return (Criteria) this;
        }

        public Criteria andJcxzstelNotIn(List<String> values) {
            addCriterion("JCXZSTEL not in", values, "jcxzstel");
            return (Criteria) this;
        }

        public Criteria andJcxzstelBetween(String value1, String value2) {
            addCriterion("JCXZSTEL between", value1, value2, "jcxzstel");
            return (Criteria) this;
        }

        public Criteria andJcxzstelNotBetween(String value1, String value2) {
            addCriterion("JCXZSTEL not between", value1, value2, "jcxzstel");
            return (Criteria) this;
        }

        public Criteria andIdlhIsNull() {
            addCriterion("IDLH is null");
            return (Criteria) this;
        }

        public Criteria andIdlhIsNotNull() {
            addCriterion("IDLH is not null");
            return (Criteria) this;
        }

        public Criteria andIdlhEqualTo(String value) {
            addCriterion("IDLH =", value, "idlh");
            return (Criteria) this;
        }

        public Criteria andIdlhNotEqualTo(String value) {
            addCriterion("IDLH <>", value, "idlh");
            return (Criteria) this;
        }

        public Criteria andIdlhGreaterThan(String value) {
            addCriterion("IDLH >", value, "idlh");
            return (Criteria) this;
        }

        public Criteria andIdlhGreaterThanOrEqualTo(String value) {
            addCriterion("IDLH >=", value, "idlh");
            return (Criteria) this;
        }

        public Criteria andIdlhLessThan(String value) {
            addCriterion("IDLH <", value, "idlh");
            return (Criteria) this;
        }

        public Criteria andIdlhLessThanOrEqualTo(String value) {
            addCriterion("IDLH <=", value, "idlh");
            return (Criteria) this;
        }

        public Criteria andIdlhLike(String value) {
            addCriterion("IDLH like", value, "idlh");
            return (Criteria) this;
        }

        public Criteria andIdlhNotLike(String value) {
            addCriterion("IDLH not like", value, "idlh");
            return (Criteria) this;
        }

        public Criteria andIdlhIn(List<String> values) {
            addCriterion("IDLH in", values, "idlh");
            return (Criteria) this;
        }

        public Criteria andIdlhNotIn(List<String> values) {
            addCriterion("IDLH not in", values, "idlh");
            return (Criteria) this;
        }

        public Criteria andIdlhBetween(String value1, String value2) {
            addCriterion("IDLH between", value1, value2, "idlh");
            return (Criteria) this;
        }

        public Criteria andIdlhNotBetween(String value1, String value2) {
            addCriterion("IDLH not between", value1, value2, "idlh");
            return (Criteria) this;
        }

        public Criteria andEngineeringControlIsNull() {
            addCriterion("engineering_control is null");
            return (Criteria) this;
        }

        public Criteria andEngineeringControlIsNotNull() {
            addCriterion("engineering_control is not null");
            return (Criteria) this;
        }

        public Criteria andEngineeringControlEqualTo(String value) {
            addCriterion("engineering_control =", value, "engineeringControl");
            return (Criteria) this;
        }

        public Criteria andEngineeringControlNotEqualTo(String value) {
            addCriterion("engineering_control <>", value, "engineeringControl");
            return (Criteria) this;
        }

        public Criteria andEngineeringControlGreaterThan(String value) {
            addCriterion("engineering_control >", value, "engineeringControl");
            return (Criteria) this;
        }

        public Criteria andEngineeringControlGreaterThanOrEqualTo(String value) {
            addCriterion("engineering_control >=", value, "engineeringControl");
            return (Criteria) this;
        }

        public Criteria andEngineeringControlLessThan(String value) {
            addCriterion("engineering_control <", value, "engineeringControl");
            return (Criteria) this;
        }

        public Criteria andEngineeringControlLessThanOrEqualTo(String value) {
            addCriterion("engineering_control <=", value, "engineeringControl");
            return (Criteria) this;
        }

        public Criteria andEngineeringControlLike(String value) {
            addCriterion("engineering_control like", value, "engineeringControl");
            return (Criteria) this;
        }

        public Criteria andEngineeringControlNotLike(String value) {
            addCriterion("engineering_control not like", value, "engineeringControl");
            return (Criteria) this;
        }

        public Criteria andEngineeringControlIn(List<String> values) {
            addCriterion("engineering_control in", values, "engineeringControl");
            return (Criteria) this;
        }

        public Criteria andEngineeringControlNotIn(List<String> values) {
            addCriterion("engineering_control not in", values, "engineeringControl");
            return (Criteria) this;
        }

        public Criteria andEngineeringControlBetween(String value1, String value2) {
            addCriterion("engineering_control between", value1, value2, "engineeringControl");
            return (Criteria) this;
        }

        public Criteria andEngineeringControlNotBetween(String value1, String value2) {
            addCriterion("engineering_control not between", value1, value2, "engineeringControl");
            return (Criteria) this;
        }

        public Criteria andRespiratoryProtectionIsNull() {
            addCriterion("respiratory_protection is null");
            return (Criteria) this;
        }

        public Criteria andRespiratoryProtectionIsNotNull() {
            addCriterion("respiratory_protection is not null");
            return (Criteria) this;
        }

        public Criteria andRespiratoryProtectionEqualTo(String value) {
            addCriterion("respiratory_protection =", value, "respiratoryProtection");
            return (Criteria) this;
        }

        public Criteria andRespiratoryProtectionNotEqualTo(String value) {
            addCriterion("respiratory_protection <>", value, "respiratoryProtection");
            return (Criteria) this;
        }

        public Criteria andRespiratoryProtectionGreaterThan(String value) {
            addCriterion("respiratory_protection >", value, "respiratoryProtection");
            return (Criteria) this;
        }

        public Criteria andRespiratoryProtectionGreaterThanOrEqualTo(String value) {
            addCriterion("respiratory_protection >=", value, "respiratoryProtection");
            return (Criteria) this;
        }

        public Criteria andRespiratoryProtectionLessThan(String value) {
            addCriterion("respiratory_protection <", value, "respiratoryProtection");
            return (Criteria) this;
        }

        public Criteria andRespiratoryProtectionLessThanOrEqualTo(String value) {
            addCriterion("respiratory_protection <=", value, "respiratoryProtection");
            return (Criteria) this;
        }

        public Criteria andRespiratoryProtectionLike(String value) {
            addCriterion("respiratory_protection like", value, "respiratoryProtection");
            return (Criteria) this;
        }

        public Criteria andRespiratoryProtectionNotLike(String value) {
            addCriterion("respiratory_protection not like", value, "respiratoryProtection");
            return (Criteria) this;
        }

        public Criteria andRespiratoryProtectionIn(List<String> values) {
            addCriterion("respiratory_protection in", values, "respiratoryProtection");
            return (Criteria) this;
        }

        public Criteria andRespiratoryProtectionNotIn(List<String> values) {
            addCriterion("respiratory_protection not in", values, "respiratoryProtection");
            return (Criteria) this;
        }

        public Criteria andRespiratoryProtectionBetween(String value1, String value2) {
            addCriterion("respiratory_protection between", value1, value2, "respiratoryProtection");
            return (Criteria) this;
        }

        public Criteria andRespiratoryProtectionNotBetween(String value1, String value2) {
            addCriterion("respiratory_protection not between", value1, value2, "respiratoryProtection");
            return (Criteria) this;
        }

        public Criteria andEyeProtectionIsNull() {
            addCriterion("eye_protection is null");
            return (Criteria) this;
        }

        public Criteria andEyeProtectionIsNotNull() {
            addCriterion("eye_protection is not null");
            return (Criteria) this;
        }

        public Criteria andEyeProtectionEqualTo(String value) {
            addCriterion("eye_protection =", value, "eyeProtection");
            return (Criteria) this;
        }

        public Criteria andEyeProtectionNotEqualTo(String value) {
            addCriterion("eye_protection <>", value, "eyeProtection");
            return (Criteria) this;
        }

        public Criteria andEyeProtectionGreaterThan(String value) {
            addCriterion("eye_protection >", value, "eyeProtection");
            return (Criteria) this;
        }

        public Criteria andEyeProtectionGreaterThanOrEqualTo(String value) {
            addCriterion("eye_protection >=", value, "eyeProtection");
            return (Criteria) this;
        }

        public Criteria andEyeProtectionLessThan(String value) {
            addCriterion("eye_protection <", value, "eyeProtection");
            return (Criteria) this;
        }

        public Criteria andEyeProtectionLessThanOrEqualTo(String value) {
            addCriterion("eye_protection <=", value, "eyeProtection");
            return (Criteria) this;
        }

        public Criteria andEyeProtectionLike(String value) {
            addCriterion("eye_protection like", value, "eyeProtection");
            return (Criteria) this;
        }

        public Criteria andEyeProtectionNotLike(String value) {
            addCriterion("eye_protection not like", value, "eyeProtection");
            return (Criteria) this;
        }

        public Criteria andEyeProtectionIn(List<String> values) {
            addCriterion("eye_protection in", values, "eyeProtection");
            return (Criteria) this;
        }

        public Criteria andEyeProtectionNotIn(List<String> values) {
            addCriterion("eye_protection not in", values, "eyeProtection");
            return (Criteria) this;
        }

        public Criteria andEyeProtectionBetween(String value1, String value2) {
            addCriterion("eye_protection between", value1, value2, "eyeProtection");
            return (Criteria) this;
        }

        public Criteria andEyeProtectionNotBetween(String value1, String value2) {
            addCriterion("eye_protection not between", value1, value2, "eyeProtection");
            return (Criteria) this;
        }

        public Criteria andBodyProtectionIsNull() {
            addCriterion("body_protection is null");
            return (Criteria) this;
        }

        public Criteria andBodyProtectionIsNotNull() {
            addCriterion("body_protection is not null");
            return (Criteria) this;
        }

        public Criteria andBodyProtectionEqualTo(String value) {
            addCriterion("body_protection =", value, "bodyProtection");
            return (Criteria) this;
        }

        public Criteria andBodyProtectionNotEqualTo(String value) {
            addCriterion("body_protection <>", value, "bodyProtection");
            return (Criteria) this;
        }

        public Criteria andBodyProtectionGreaterThan(String value) {
            addCriterion("body_protection >", value, "bodyProtection");
            return (Criteria) this;
        }

        public Criteria andBodyProtectionGreaterThanOrEqualTo(String value) {
            addCriterion("body_protection >=", value, "bodyProtection");
            return (Criteria) this;
        }

        public Criteria andBodyProtectionLessThan(String value) {
            addCriterion("body_protection <", value, "bodyProtection");
            return (Criteria) this;
        }

        public Criteria andBodyProtectionLessThanOrEqualTo(String value) {
            addCriterion("body_protection <=", value, "bodyProtection");
            return (Criteria) this;
        }

        public Criteria andBodyProtectionLike(String value) {
            addCriterion("body_protection like", value, "bodyProtection");
            return (Criteria) this;
        }

        public Criteria andBodyProtectionNotLike(String value) {
            addCriterion("body_protection not like", value, "bodyProtection");
            return (Criteria) this;
        }

        public Criteria andBodyProtectionIn(List<String> values) {
            addCriterion("body_protection in", values, "bodyProtection");
            return (Criteria) this;
        }

        public Criteria andBodyProtectionNotIn(List<String> values) {
            addCriterion("body_protection not in", values, "bodyProtection");
            return (Criteria) this;
        }

        public Criteria andBodyProtectionBetween(String value1, String value2) {
            addCriterion("body_protection between", value1, value2, "bodyProtection");
            return (Criteria) this;
        }

        public Criteria andBodyProtectionNotBetween(String value1, String value2) {
            addCriterion("body_protection not between", value1, value2, "bodyProtection");
            return (Criteria) this;
        }

        public Criteria andHandProtectionIsNull() {
            addCriterion("hand_protection is null");
            return (Criteria) this;
        }

        public Criteria andHandProtectionIsNotNull() {
            addCriterion("hand_protection is not null");
            return (Criteria) this;
        }

        public Criteria andHandProtectionEqualTo(String value) {
            addCriterion("hand_protection =", value, "handProtection");
            return (Criteria) this;
        }

        public Criteria andHandProtectionNotEqualTo(String value) {
            addCriterion("hand_protection <>", value, "handProtection");
            return (Criteria) this;
        }

        public Criteria andHandProtectionGreaterThan(String value) {
            addCriterion("hand_protection >", value, "handProtection");
            return (Criteria) this;
        }

        public Criteria andHandProtectionGreaterThanOrEqualTo(String value) {
            addCriterion("hand_protection >=", value, "handProtection");
            return (Criteria) this;
        }

        public Criteria andHandProtectionLessThan(String value) {
            addCriterion("hand_protection <", value, "handProtection");
            return (Criteria) this;
        }

        public Criteria andHandProtectionLessThanOrEqualTo(String value) {
            addCriterion("hand_protection <=", value, "handProtection");
            return (Criteria) this;
        }

        public Criteria andHandProtectionLike(String value) {
            addCriterion("hand_protection like", value, "handProtection");
            return (Criteria) this;
        }

        public Criteria andHandProtectionNotLike(String value) {
            addCriterion("hand_protection not like", value, "handProtection");
            return (Criteria) this;
        }

        public Criteria andHandProtectionIn(List<String> values) {
            addCriterion("hand_protection in", values, "handProtection");
            return (Criteria) this;
        }

        public Criteria andHandProtectionNotIn(List<String> values) {
            addCriterion("hand_protection not in", values, "handProtection");
            return (Criteria) this;
        }

        public Criteria andHandProtectionBetween(String value1, String value2) {
            addCriterion("hand_protection between", value1, value2, "handProtection");
            return (Criteria) this;
        }

        public Criteria andHandProtectionNotBetween(String value1, String value2) {
            addCriterion("hand_protection not between", value1, value2, "handProtection");
            return (Criteria) this;
        }

        public Criteria andOtherIsNull() {
            addCriterion("other is null");
            return (Criteria) this;
        }

        public Criteria andOtherIsNotNull() {
            addCriterion("other is not null");
            return (Criteria) this;
        }

        public Criteria andOtherEqualTo(String value) {
            addCriterion("other =", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotEqualTo(String value) {
            addCriterion("other <>", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThan(String value) {
            addCriterion("other >", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherGreaterThanOrEqualTo(String value) {
            addCriterion("other >=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThan(String value) {
            addCriterion("other <", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLessThanOrEqualTo(String value) {
            addCriterion("other <=", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherLike(String value) {
            addCriterion("other like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotLike(String value) {
            addCriterion("other not like", value, "other");
            return (Criteria) this;
        }

        public Criteria andOtherIn(List<String> values) {
            addCriterion("other in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotIn(List<String> values) {
            addCriterion("other not in", values, "other");
            return (Criteria) this;
        }

        public Criteria andOtherBetween(String value1, String value2) {
            addCriterion("other between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andOtherNotBetween(String value1, String value2) {
            addCriterion("other not between", value1, value2, "other");
            return (Criteria) this;
        }

        public Criteria andStabilityIsNull() {
            addCriterion("stability is null");
            return (Criteria) this;
        }

        public Criteria andStabilityIsNotNull() {
            addCriterion("stability is not null");
            return (Criteria) this;
        }

        public Criteria andStabilityEqualTo(String value) {
            addCriterion("stability =", value, "stability");
            return (Criteria) this;
        }

        public Criteria andStabilityNotEqualTo(String value) {
            addCriterion("stability <>", value, "stability");
            return (Criteria) this;
        }

        public Criteria andStabilityGreaterThan(String value) {
            addCriterion("stability >", value, "stability");
            return (Criteria) this;
        }

        public Criteria andStabilityGreaterThanOrEqualTo(String value) {
            addCriterion("stability >=", value, "stability");
            return (Criteria) this;
        }

        public Criteria andStabilityLessThan(String value) {
            addCriterion("stability <", value, "stability");
            return (Criteria) this;
        }

        public Criteria andStabilityLessThanOrEqualTo(String value) {
            addCriterion("stability <=", value, "stability");
            return (Criteria) this;
        }

        public Criteria andStabilityLike(String value) {
            addCriterion("stability like", value, "stability");
            return (Criteria) this;
        }

        public Criteria andStabilityNotLike(String value) {
            addCriterion("stability not like", value, "stability");
            return (Criteria) this;
        }

        public Criteria andStabilityIn(List<String> values) {
            addCriterion("stability in", values, "stability");
            return (Criteria) this;
        }

        public Criteria andStabilityNotIn(List<String> values) {
            addCriterion("stability not in", values, "stability");
            return (Criteria) this;
        }

        public Criteria andStabilityBetween(String value1, String value2) {
            addCriterion("stability between", value1, value2, "stability");
            return (Criteria) this;
        }

        public Criteria andStabilityNotBetween(String value1, String value2) {
            addCriterion("stability not between", value1, value2, "stability");
            return (Criteria) this;
        }

        public Criteria andTabooIsNull() {
            addCriterion("taboo is null");
            return (Criteria) this;
        }

        public Criteria andTabooIsNotNull() {
            addCriterion("taboo is not null");
            return (Criteria) this;
        }

        public Criteria andTabooEqualTo(String value) {
            addCriterion("taboo =", value, "taboo");
            return (Criteria) this;
        }

        public Criteria andTabooNotEqualTo(String value) {
            addCriterion("taboo <>", value, "taboo");
            return (Criteria) this;
        }

        public Criteria andTabooGreaterThan(String value) {
            addCriterion("taboo >", value, "taboo");
            return (Criteria) this;
        }

        public Criteria andTabooGreaterThanOrEqualTo(String value) {
            addCriterion("taboo >=", value, "taboo");
            return (Criteria) this;
        }

        public Criteria andTabooLessThan(String value) {
            addCriterion("taboo <", value, "taboo");
            return (Criteria) this;
        }

        public Criteria andTabooLessThanOrEqualTo(String value) {
            addCriterion("taboo <=", value, "taboo");
            return (Criteria) this;
        }

        public Criteria andTabooLike(String value) {
            addCriterion("taboo like", value, "taboo");
            return (Criteria) this;
        }

        public Criteria andTabooNotLike(String value) {
            addCriterion("taboo not like", value, "taboo");
            return (Criteria) this;
        }

        public Criteria andTabooIn(List<String> values) {
            addCriterion("taboo in", values, "taboo");
            return (Criteria) this;
        }

        public Criteria andTabooNotIn(List<String> values) {
            addCriterion("taboo not in", values, "taboo");
            return (Criteria) this;
        }

        public Criteria andTabooBetween(String value1, String value2) {
            addCriterion("taboo between", value1, value2, "taboo");
            return (Criteria) this;
        }

        public Criteria andTabooNotBetween(String value1, String value2) {
            addCriterion("taboo not between", value1, value2, "taboo");
            return (Criteria) this;
        }

        public Criteria andOutTouchIsNull() {
            addCriterion("out_touch is null");
            return (Criteria) this;
        }

        public Criteria andOutTouchIsNotNull() {
            addCriterion("out_touch is not null");
            return (Criteria) this;
        }

        public Criteria andOutTouchEqualTo(String value) {
            addCriterion("out_touch =", value, "outTouch");
            return (Criteria) this;
        }

        public Criteria andOutTouchNotEqualTo(String value) {
            addCriterion("out_touch <>", value, "outTouch");
            return (Criteria) this;
        }

        public Criteria andOutTouchGreaterThan(String value) {
            addCriterion("out_touch >", value, "outTouch");
            return (Criteria) this;
        }

        public Criteria andOutTouchGreaterThanOrEqualTo(String value) {
            addCriterion("out_touch >=", value, "outTouch");
            return (Criteria) this;
        }

        public Criteria andOutTouchLessThan(String value) {
            addCriterion("out_touch <", value, "outTouch");
            return (Criteria) this;
        }

        public Criteria andOutTouchLessThanOrEqualTo(String value) {
            addCriterion("out_touch <=", value, "outTouch");
            return (Criteria) this;
        }

        public Criteria andOutTouchLike(String value) {
            addCriterion("out_touch like", value, "outTouch");
            return (Criteria) this;
        }

        public Criteria andOutTouchNotLike(String value) {
            addCriterion("out_touch not like", value, "outTouch");
            return (Criteria) this;
        }

        public Criteria andOutTouchIn(List<String> values) {
            addCriterion("out_touch in", values, "outTouch");
            return (Criteria) this;
        }

        public Criteria andOutTouchNotIn(List<String> values) {
            addCriterion("out_touch not in", values, "outTouch");
            return (Criteria) this;
        }

        public Criteria andOutTouchBetween(String value1, String value2) {
            addCriterion("out_touch between", value1, value2, "outTouch");
            return (Criteria) this;
        }

        public Criteria andOutTouchNotBetween(String value1, String value2) {
            addCriterion("out_touch not between", value1, value2, "outTouch");
            return (Criteria) this;
        }

        public Criteria andPolymerizationHazardsIsNull() {
            addCriterion("polymerization_hazards is null");
            return (Criteria) this;
        }

        public Criteria andPolymerizationHazardsIsNotNull() {
            addCriterion("polymerization_hazards is not null");
            return (Criteria) this;
        }

        public Criteria andPolymerizationHazardsEqualTo(String value) {
            addCriterion("polymerization_hazards =", value, "polymerizationHazards");
            return (Criteria) this;
        }

        public Criteria andPolymerizationHazardsNotEqualTo(String value) {
            addCriterion("polymerization_hazards <>", value, "polymerizationHazards");
            return (Criteria) this;
        }

        public Criteria andPolymerizationHazardsGreaterThan(String value) {
            addCriterion("polymerization_hazards >", value, "polymerizationHazards");
            return (Criteria) this;
        }

        public Criteria andPolymerizationHazardsGreaterThanOrEqualTo(String value) {
            addCriterion("polymerization_hazards >=", value, "polymerizationHazards");
            return (Criteria) this;
        }

        public Criteria andPolymerizationHazardsLessThan(String value) {
            addCriterion("polymerization_hazards <", value, "polymerizationHazards");
            return (Criteria) this;
        }

        public Criteria andPolymerizationHazardsLessThanOrEqualTo(String value) {
            addCriterion("polymerization_hazards <=", value, "polymerizationHazards");
            return (Criteria) this;
        }

        public Criteria andPolymerizationHazardsLike(String value) {
            addCriterion("polymerization_hazards like", value, "polymerizationHazards");
            return (Criteria) this;
        }

        public Criteria andPolymerizationHazardsNotLike(String value) {
            addCriterion("polymerization_hazards not like", value, "polymerizationHazards");
            return (Criteria) this;
        }

        public Criteria andPolymerizationHazardsIn(List<String> values) {
            addCriterion("polymerization_hazards in", values, "polymerizationHazards");
            return (Criteria) this;
        }

        public Criteria andPolymerizationHazardsNotIn(List<String> values) {
            addCriterion("polymerization_hazards not in", values, "polymerizationHazards");
            return (Criteria) this;
        }

        public Criteria andPolymerizationHazardsBetween(String value1, String value2) {
            addCriterion("polymerization_hazards between", value1, value2, "polymerizationHazards");
            return (Criteria) this;
        }

        public Criteria andPolymerizationHazardsNotBetween(String value1, String value2) {
            addCriterion("polymerization_hazards not between", value1, value2, "polymerizationHazards");
            return (Criteria) this;
        }

        public Criteria andTrecsIsNull() {
            addCriterion("trecs is null");
            return (Criteria) this;
        }

        public Criteria andTrecsIsNotNull() {
            addCriterion("trecs is not null");
            return (Criteria) this;
        }

        public Criteria andTrecsEqualTo(String value) {
            addCriterion("trecs =", value, "trecs");
            return (Criteria) this;
        }

        public Criteria andTrecsNotEqualTo(String value) {
            addCriterion("trecs <>", value, "trecs");
            return (Criteria) this;
        }

        public Criteria andTrecsGreaterThan(String value) {
            addCriterion("trecs >", value, "trecs");
            return (Criteria) this;
        }

        public Criteria andTrecsGreaterThanOrEqualTo(String value) {
            addCriterion("trecs >=", value, "trecs");
            return (Criteria) this;
        }

        public Criteria andTrecsLessThan(String value) {
            addCriterion("trecs <", value, "trecs");
            return (Criteria) this;
        }

        public Criteria andTrecsLessThanOrEqualTo(String value) {
            addCriterion("trecs <=", value, "trecs");
            return (Criteria) this;
        }

        public Criteria andTrecsLike(String value) {
            addCriterion("trecs like", value, "trecs");
            return (Criteria) this;
        }

        public Criteria andTrecsNotLike(String value) {
            addCriterion("trecs not like", value, "trecs");
            return (Criteria) this;
        }

        public Criteria andTrecsIn(List<String> values) {
            addCriterion("trecs in", values, "trecs");
            return (Criteria) this;
        }

        public Criteria andTrecsNotIn(List<String> values) {
            addCriterion("trecs not in", values, "trecs");
            return (Criteria) this;
        }

        public Criteria andTrecsBetween(String value1, String value2) {
            addCriterion("trecs between", value1, value2, "trecs");
            return (Criteria) this;
        }

        public Criteria andTrecsNotBetween(String value1, String value2) {
            addCriterion("trecs not between", value1, value2, "trecs");
            return (Criteria) this;
        }

        public Criteria andToxicityIsNull() {
            addCriterion("toxicity is null");
            return (Criteria) this;
        }

        public Criteria andToxicityIsNotNull() {
            addCriterion("toxicity is not null");
            return (Criteria) this;
        }

        public Criteria andToxicityEqualTo(String value) {
            addCriterion("toxicity =", value, "toxicity");
            return (Criteria) this;
        }

        public Criteria andToxicityNotEqualTo(String value) {
            addCriterion("toxicity <>", value, "toxicity");
            return (Criteria) this;
        }

        public Criteria andToxicityGreaterThan(String value) {
            addCriterion("toxicity >", value, "toxicity");
            return (Criteria) this;
        }

        public Criteria andToxicityGreaterThanOrEqualTo(String value) {
            addCriterion("toxicity >=", value, "toxicity");
            return (Criteria) this;
        }

        public Criteria andToxicityLessThan(String value) {
            addCriterion("toxicity <", value, "toxicity");
            return (Criteria) this;
        }

        public Criteria andToxicityLessThanOrEqualTo(String value) {
            addCriterion("toxicity <=", value, "toxicity");
            return (Criteria) this;
        }

        public Criteria andToxicityLike(String value) {
            addCriterion("toxicity like", value, "toxicity");
            return (Criteria) this;
        }

        public Criteria andToxicityNotLike(String value) {
            addCriterion("toxicity not like", value, "toxicity");
            return (Criteria) this;
        }

        public Criteria andToxicityIn(List<String> values) {
            addCriterion("toxicity in", values, "toxicity");
            return (Criteria) this;
        }

        public Criteria andToxicityNotIn(List<String> values) {
            addCriterion("toxicity not in", values, "toxicity");
            return (Criteria) this;
        }

        public Criteria andToxicityBetween(String value1, String value2) {
            addCriterion("toxicity between", value1, value2, "toxicity");
            return (Criteria) this;
        }

        public Criteria andToxicityNotBetween(String value1, String value2) {
            addCriterion("toxicity not between", value1, value2, "toxicity");
            return (Criteria) this;
        }

        public Criteria andDangerousNumIsNull() {
            addCriterion("dangerous_num is null");
            return (Criteria) this;
        }

        public Criteria andDangerousNumIsNotNull() {
            addCriterion("dangerous_num is not null");
            return (Criteria) this;
        }

        public Criteria andDangerousNumEqualTo(String value) {
            addCriterion("dangerous_num =", value, "dangerousNum");
            return (Criteria) this;
        }

        public Criteria andDangerousNumNotEqualTo(String value) {
            addCriterion("dangerous_num <>", value, "dangerousNum");
            return (Criteria) this;
        }

        public Criteria andDangerousNumGreaterThan(String value) {
            addCriterion("dangerous_num >", value, "dangerousNum");
            return (Criteria) this;
        }

        public Criteria andDangerousNumGreaterThanOrEqualTo(String value) {
            addCriterion("dangerous_num >=", value, "dangerousNum");
            return (Criteria) this;
        }

        public Criteria andDangerousNumLessThan(String value) {
            addCriterion("dangerous_num <", value, "dangerousNum");
            return (Criteria) this;
        }

        public Criteria andDangerousNumLessThanOrEqualTo(String value) {
            addCriterion("dangerous_num <=", value, "dangerousNum");
            return (Criteria) this;
        }

        public Criteria andDangerousNumLike(String value) {
            addCriterion("dangerous_num like", value, "dangerousNum");
            return (Criteria) this;
        }

        public Criteria andDangerousNumNotLike(String value) {
            addCriterion("dangerous_num not like", value, "dangerousNum");
            return (Criteria) this;
        }

        public Criteria andDangerousNumIn(List<String> values) {
            addCriterion("dangerous_num in", values, "dangerousNum");
            return (Criteria) this;
        }

        public Criteria andDangerousNumNotIn(List<String> values) {
            addCriterion("dangerous_num not in", values, "dangerousNum");
            return (Criteria) this;
        }

        public Criteria andDangerousNumBetween(String value1, String value2) {
            addCriterion("dangerous_num between", value1, value2, "dangerousNum");
            return (Criteria) this;
        }

        public Criteria andDangerousNumNotBetween(String value1, String value2) {
            addCriterion("dangerous_num not between", value1, value2, "dangerousNum");
            return (Criteria) this;
        }

        public Criteria andUnNumIsNull() {
            addCriterion("un_num is null");
            return (Criteria) this;
        }

        public Criteria andUnNumIsNotNull() {
            addCriterion("un_num is not null");
            return (Criteria) this;
        }

        public Criteria andUnNumEqualTo(String value) {
            addCriterion("un_num =", value, "unNum");
            return (Criteria) this;
        }

        public Criteria andUnNumNotEqualTo(String value) {
            addCriterion("un_num <>", value, "unNum");
            return (Criteria) this;
        }

        public Criteria andUnNumGreaterThan(String value) {
            addCriterion("un_num >", value, "unNum");
            return (Criteria) this;
        }

        public Criteria andUnNumGreaterThanOrEqualTo(String value) {
            addCriterion("un_num >=", value, "unNum");
            return (Criteria) this;
        }

        public Criteria andUnNumLessThan(String value) {
            addCriterion("un_num <", value, "unNum");
            return (Criteria) this;
        }

        public Criteria andUnNumLessThanOrEqualTo(String value) {
            addCriterion("un_num <=", value, "unNum");
            return (Criteria) this;
        }

        public Criteria andUnNumLike(String value) {
            addCriterion("un_num like", value, "unNum");
            return (Criteria) this;
        }

        public Criteria andUnNumNotLike(String value) {
            addCriterion("un_num not like", value, "unNum");
            return (Criteria) this;
        }

        public Criteria andUnNumIn(List<String> values) {
            addCriterion("un_num in", values, "unNum");
            return (Criteria) this;
        }

        public Criteria andUnNumNotIn(List<String> values) {
            addCriterion("un_num not in", values, "unNum");
            return (Criteria) this;
        }

        public Criteria andUnNumBetween(String value1, String value2) {
            addCriterion("un_num between", value1, value2, "unNum");
            return (Criteria) this;
        }

        public Criteria andUnNumNotBetween(String value1, String value2) {
            addCriterion("un_num not between", value1, value2, "unNum");
            return (Criteria) this;
        }

        public Criteria andDangerousPackageIsNull() {
            addCriterion("dangerous_package is null");
            return (Criteria) this;
        }

        public Criteria andDangerousPackageIsNotNull() {
            addCriterion("dangerous_package is not null");
            return (Criteria) this;
        }

        public Criteria andDangerousPackageEqualTo(String value) {
            addCriterion("dangerous_package =", value, "dangerousPackage");
            return (Criteria) this;
        }

        public Criteria andDangerousPackageNotEqualTo(String value) {
            addCriterion("dangerous_package <>", value, "dangerousPackage");
            return (Criteria) this;
        }

        public Criteria andDangerousPackageGreaterThan(String value) {
            addCriterion("dangerous_package >", value, "dangerousPackage");
            return (Criteria) this;
        }

        public Criteria andDangerousPackageGreaterThanOrEqualTo(String value) {
            addCriterion("dangerous_package >=", value, "dangerousPackage");
            return (Criteria) this;
        }

        public Criteria andDangerousPackageLessThan(String value) {
            addCriterion("dangerous_package <", value, "dangerousPackage");
            return (Criteria) this;
        }

        public Criteria andDangerousPackageLessThanOrEqualTo(String value) {
            addCriterion("dangerous_package <=", value, "dangerousPackage");
            return (Criteria) this;
        }

        public Criteria andDangerousPackageLike(String value) {
            addCriterion("dangerous_package like", value, "dangerousPackage");
            return (Criteria) this;
        }

        public Criteria andDangerousPackageNotLike(String value) {
            addCriterion("dangerous_package not like", value, "dangerousPackage");
            return (Criteria) this;
        }

        public Criteria andDangerousPackageIn(List<String> values) {
            addCriterion("dangerous_package in", values, "dangerousPackage");
            return (Criteria) this;
        }

        public Criteria andDangerousPackageNotIn(List<String> values) {
            addCriterion("dangerous_package not in", values, "dangerousPackage");
            return (Criteria) this;
        }

        public Criteria andDangerousPackageBetween(String value1, String value2) {
            addCriterion("dangerous_package between", value1, value2, "dangerousPackage");
            return (Criteria) this;
        }

        public Criteria andDangerousPackageNotBetween(String value1, String value2) {
            addCriterion("dangerous_package not between", value1, value2, "dangerousPackage");
            return (Criteria) this;
        }

        public Criteria andPackageTypeIsNull() {
            addCriterion("package_type is null");
            return (Criteria) this;
        }

        public Criteria andPackageTypeIsNotNull() {
            addCriterion("package_type is not null");
            return (Criteria) this;
        }

        public Criteria andPackageTypeEqualTo(String value) {
            addCriterion("package_type =", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeNotEqualTo(String value) {
            addCriterion("package_type <>", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeGreaterThan(String value) {
            addCriterion("package_type >", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeGreaterThanOrEqualTo(String value) {
            addCriterion("package_type >=", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeLessThan(String value) {
            addCriterion("package_type <", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeLessThanOrEqualTo(String value) {
            addCriterion("package_type <=", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeLike(String value) {
            addCriterion("package_type like", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeNotLike(String value) {
            addCriterion("package_type not like", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeIn(List<String> values) {
            addCriterion("package_type in", values, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeNotIn(List<String> values) {
            addCriterion("package_type not in", values, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeBetween(String value1, String value2) {
            addCriterion("package_type between", value1, value2, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeNotBetween(String value1, String value2) {
            addCriterion("package_type not between", value1, value2, "packageType");
            return (Criteria) this;
        }

        public Criteria andIsoIsNull() {
            addCriterion("iso is null");
            return (Criteria) this;
        }

        public Criteria andIsoIsNotNull() {
            addCriterion("iso is not null");
            return (Criteria) this;
        }

        public Criteria andIsoEqualTo(String value) {
            addCriterion("iso =", value, "iso");
            return (Criteria) this;
        }

        public Criteria andIsoNotEqualTo(String value) {
            addCriterion("iso <>", value, "iso");
            return (Criteria) this;
        }

        public Criteria andIsoGreaterThan(String value) {
            addCriterion("iso >", value, "iso");
            return (Criteria) this;
        }

        public Criteria andIsoGreaterThanOrEqualTo(String value) {
            addCriterion("iso >=", value, "iso");
            return (Criteria) this;
        }

        public Criteria andIsoLessThan(String value) {
            addCriterion("iso <", value, "iso");
            return (Criteria) this;
        }

        public Criteria andIsoLessThanOrEqualTo(String value) {
            addCriterion("iso <=", value, "iso");
            return (Criteria) this;
        }

        public Criteria andIsoLike(String value) {
            addCriterion("iso like", value, "iso");
            return (Criteria) this;
        }

        public Criteria andIsoNotLike(String value) {
            addCriterion("iso not like", value, "iso");
            return (Criteria) this;
        }

        public Criteria andIsoIn(List<String> values) {
            addCriterion("iso in", values, "iso");
            return (Criteria) this;
        }

        public Criteria andIsoNotIn(List<String> values) {
            addCriterion("iso not in", values, "iso");
            return (Criteria) this;
        }

        public Criteria andIsoBetween(String value1, String value2) {
            addCriterion("iso between", value1, value2, "iso");
            return (Criteria) this;
        }

        public Criteria andIsoNotBetween(String value1, String value2) {
            addCriterion("iso not between", value1, value2, "iso");
            return (Criteria) this;
        }

        public Criteria andDispositionNumIsNull() {
            addCriterion("disposition_num is null");
            return (Criteria) this;
        }

        public Criteria andDispositionNumIsNotNull() {
            addCriterion("disposition_num is not null");
            return (Criteria) this;
        }

        public Criteria andDispositionNumEqualTo(String value) {
            addCriterion("disposition_num =", value, "dispositionNum");
            return (Criteria) this;
        }

        public Criteria andDispositionNumNotEqualTo(String value) {
            addCriterion("disposition_num <>", value, "dispositionNum");
            return (Criteria) this;
        }

        public Criteria andDispositionNumGreaterThan(String value) {
            addCriterion("disposition_num >", value, "dispositionNum");
            return (Criteria) this;
        }

        public Criteria andDispositionNumGreaterThanOrEqualTo(String value) {
            addCriterion("disposition_num >=", value, "dispositionNum");
            return (Criteria) this;
        }

        public Criteria andDispositionNumLessThan(String value) {
            addCriterion("disposition_num <", value, "dispositionNum");
            return (Criteria) this;
        }

        public Criteria andDispositionNumLessThanOrEqualTo(String value) {
            addCriterion("disposition_num <=", value, "dispositionNum");
            return (Criteria) this;
        }

        public Criteria andDispositionNumLike(String value) {
            addCriterion("disposition_num like", value, "dispositionNum");
            return (Criteria) this;
        }

        public Criteria andDispositionNumNotLike(String value) {
            addCriterion("disposition_num not like", value, "dispositionNum");
            return (Criteria) this;
        }

        public Criteria andDispositionNumIn(List<String> values) {
            addCriterion("disposition_num in", values, "dispositionNum");
            return (Criteria) this;
        }

        public Criteria andDispositionNumNotIn(List<String> values) {
            addCriterion("disposition_num not in", values, "dispositionNum");
            return (Criteria) this;
        }

        public Criteria andDispositionNumBetween(String value1, String value2) {
            addCriterion("disposition_num between", value1, value2, "dispositionNum");
            return (Criteria) this;
        }

        public Criteria andDispositionNumNotBetween(String value1, String value2) {
            addCriterion("disposition_num not between", value1, value2, "dispositionNum");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}