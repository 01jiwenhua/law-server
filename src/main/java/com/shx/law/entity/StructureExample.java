package com.shx.law.entity;

import java.util.ArrayList;
import java.util.List;

public class StructureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StructureExample() {
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

        public Criteria andStructureNameIsNull() {
            addCriterion("structure_name is null");
            return (Criteria) this;
        }

        public Criteria andStructureNameIsNotNull() {
            addCriterion("structure_name is not null");
            return (Criteria) this;
        }

        public Criteria andStructureNameEqualTo(String value) {
            addCriterion("structure_name =", value, "structureName");
            return (Criteria) this;
        }

        public Criteria andStructureNameNotEqualTo(String value) {
            addCriterion("structure_name <>", value, "structureName");
            return (Criteria) this;
        }

        public Criteria andStructureNameGreaterThan(String value) {
            addCriterion("structure_name >", value, "structureName");
            return (Criteria) this;
        }

        public Criteria andStructureNameGreaterThanOrEqualTo(String value) {
            addCriterion("structure_name >=", value, "structureName");
            return (Criteria) this;
        }

        public Criteria andStructureNameLessThan(String value) {
            addCriterion("structure_name <", value, "structureName");
            return (Criteria) this;
        }

        public Criteria andStructureNameLessThanOrEqualTo(String value) {
            addCriterion("structure_name <=", value, "structureName");
            return (Criteria) this;
        }

        public Criteria andStructureNameLike(String value) {
            addCriterion("structure_name like", value, "structureName");
            return (Criteria) this;
        }

        public Criteria andStructureNameNotLike(String value) {
            addCriterion("structure_name not like", value, "structureName");
            return (Criteria) this;
        }

        public Criteria andStructureNameIn(List<String> values) {
            addCriterion("structure_name in", values, "structureName");
            return (Criteria) this;
        }

        public Criteria andStructureNameNotIn(List<String> values) {
            addCriterion("structure_name not in", values, "structureName");
            return (Criteria) this;
        }

        public Criteria andStructureNameBetween(String value1, String value2) {
            addCriterion("structure_name between", value1, value2, "structureName");
            return (Criteria) this;
        }

        public Criteria andStructureNameNotBetween(String value1, String value2) {
            addCriterion("structure_name not between", value1, value2, "structureName");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelOneIsNull() {
            addCriterion("pre_name_level_one is null");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelOneIsNotNull() {
            addCriterion("pre_name_level_one is not null");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelOneEqualTo(String value) {
            addCriterion("pre_name_level_one =", value, "preNameLevelOne");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelOneNotEqualTo(String value) {
            addCriterion("pre_name_level_one <>", value, "preNameLevelOne");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelOneGreaterThan(String value) {
            addCriterion("pre_name_level_one >", value, "preNameLevelOne");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelOneGreaterThanOrEqualTo(String value) {
            addCriterion("pre_name_level_one >=", value, "preNameLevelOne");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelOneLessThan(String value) {
            addCriterion("pre_name_level_one <", value, "preNameLevelOne");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelOneLessThanOrEqualTo(String value) {
            addCriterion("pre_name_level_one <=", value, "preNameLevelOne");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelOneLike(String value) {
            addCriterion("pre_name_level_one like", value, "preNameLevelOne");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelOneNotLike(String value) {
            addCriterion("pre_name_level_one not like", value, "preNameLevelOne");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelOneIn(List<String> values) {
            addCriterion("pre_name_level_one in", values, "preNameLevelOne");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelOneNotIn(List<String> values) {
            addCriterion("pre_name_level_one not in", values, "preNameLevelOne");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelOneBetween(String value1, String value2) {
            addCriterion("pre_name_level_one between", value1, value2, "preNameLevelOne");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelOneNotBetween(String value1, String value2) {
            addCriterion("pre_name_level_one not between", value1, value2, "preNameLevelOne");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelTwoIsNull() {
            addCriterion("pre_name_level_two is null");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelTwoIsNotNull() {
            addCriterion("pre_name_level_two is not null");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelTwoEqualTo(String value) {
            addCriterion("pre_name_level_two =", value, "preNameLevelTwo");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelTwoNotEqualTo(String value) {
            addCriterion("pre_name_level_two <>", value, "preNameLevelTwo");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelTwoGreaterThan(String value) {
            addCriterion("pre_name_level_two >", value, "preNameLevelTwo");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelTwoGreaterThanOrEqualTo(String value) {
            addCriterion("pre_name_level_two >=", value, "preNameLevelTwo");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelTwoLessThan(String value) {
            addCriterion("pre_name_level_two <", value, "preNameLevelTwo");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelTwoLessThanOrEqualTo(String value) {
            addCriterion("pre_name_level_two <=", value, "preNameLevelTwo");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelTwoLike(String value) {
            addCriterion("pre_name_level_two like", value, "preNameLevelTwo");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelTwoNotLike(String value) {
            addCriterion("pre_name_level_two not like", value, "preNameLevelTwo");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelTwoIn(List<String> values) {
            addCriterion("pre_name_level_two in", values, "preNameLevelTwo");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelTwoNotIn(List<String> values) {
            addCriterion("pre_name_level_two not in", values, "preNameLevelTwo");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelTwoBetween(String value1, String value2) {
            addCriterion("pre_name_level_two between", value1, value2, "preNameLevelTwo");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelTwoNotBetween(String value1, String value2) {
            addCriterion("pre_name_level_two not between", value1, value2, "preNameLevelTwo");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelThreeIsNull() {
            addCriterion("pre_name_level_three is null");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelThreeIsNotNull() {
            addCriterion("pre_name_level_three is not null");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelThreeEqualTo(String value) {
            addCriterion("pre_name_level_three =", value, "preNameLevelThree");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelThreeNotEqualTo(String value) {
            addCriterion("pre_name_level_three <>", value, "preNameLevelThree");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelThreeGreaterThan(String value) {
            addCriterion("pre_name_level_three >", value, "preNameLevelThree");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelThreeGreaterThanOrEqualTo(String value) {
            addCriterion("pre_name_level_three >=", value, "preNameLevelThree");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelThreeLessThan(String value) {
            addCriterion("pre_name_level_three <", value, "preNameLevelThree");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelThreeLessThanOrEqualTo(String value) {
            addCriterion("pre_name_level_three <=", value, "preNameLevelThree");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelThreeLike(String value) {
            addCriterion("pre_name_level_three like", value, "preNameLevelThree");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelThreeNotLike(String value) {
            addCriterion("pre_name_level_three not like", value, "preNameLevelThree");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelThreeIn(List<String> values) {
            addCriterion("pre_name_level_three in", values, "preNameLevelThree");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelThreeNotIn(List<String> values) {
            addCriterion("pre_name_level_three not in", values, "preNameLevelThree");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelThreeBetween(String value1, String value2) {
            addCriterion("pre_name_level_three between", value1, value2, "preNameLevelThree");
            return (Criteria) this;
        }

        public Criteria andPreNameLevelThreeNotBetween(String value1, String value2) {
            addCriterion("pre_name_level_three not between", value1, value2, "preNameLevelThree");
            return (Criteria) this;
        }

        public Criteria andPropertyNumberIsNull() {
            addCriterion("property_number is null");
            return (Criteria) this;
        }

        public Criteria andPropertyNumberIsNotNull() {
            addCriterion("property_number is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyNumberEqualTo(String value) {
            addCriterion("property_number =", value, "propertyNumber");
            return (Criteria) this;
        }

        public Criteria andPropertyNumberNotEqualTo(String value) {
            addCriterion("property_number <>", value, "propertyNumber");
            return (Criteria) this;
        }

        public Criteria andPropertyNumberGreaterThan(String value) {
            addCriterion("property_number >", value, "propertyNumber");
            return (Criteria) this;
        }

        public Criteria andPropertyNumberGreaterThanOrEqualTo(String value) {
            addCriterion("property_number >=", value, "propertyNumber");
            return (Criteria) this;
        }

        public Criteria andPropertyNumberLessThan(String value) {
            addCriterion("property_number <", value, "propertyNumber");
            return (Criteria) this;
        }

        public Criteria andPropertyNumberLessThanOrEqualTo(String value) {
            addCriterion("property_number <=", value, "propertyNumber");
            return (Criteria) this;
        }

        public Criteria andPropertyNumberLike(String value) {
            addCriterion("property_number like", value, "propertyNumber");
            return (Criteria) this;
        }

        public Criteria andPropertyNumberNotLike(String value) {
            addCriterion("property_number not like", value, "propertyNumber");
            return (Criteria) this;
        }

        public Criteria andPropertyNumberIn(List<String> values) {
            addCriterion("property_number in", values, "propertyNumber");
            return (Criteria) this;
        }

        public Criteria andPropertyNumberNotIn(List<String> values) {
            addCriterion("property_number not in", values, "propertyNumber");
            return (Criteria) this;
        }

        public Criteria andPropertyNumberBetween(String value1, String value2) {
            addCriterion("property_number between", value1, value2, "propertyNumber");
            return (Criteria) this;
        }

        public Criteria andPropertyNumberNotBetween(String value1, String value2) {
            addCriterion("property_number not between", value1, value2, "propertyNumber");
            return (Criteria) this;
        }

        public Criteria andChoiceLevelIsNull() {
            addCriterion("choice_level is null");
            return (Criteria) this;
        }

        public Criteria andChoiceLevelIsNotNull() {
            addCriterion("choice_level is not null");
            return (Criteria) this;
        }

        public Criteria andChoiceLevelEqualTo(String value) {
            addCriterion("choice_level =", value, "choiceLevel");
            return (Criteria) this;
        }

        public Criteria andChoiceLevelNotEqualTo(String value) {
            addCriterion("choice_level <>", value, "choiceLevel");
            return (Criteria) this;
        }

        public Criteria andChoiceLevelGreaterThan(String value) {
            addCriterion("choice_level >", value, "choiceLevel");
            return (Criteria) this;
        }

        public Criteria andChoiceLevelGreaterThanOrEqualTo(String value) {
            addCriterion("choice_level >=", value, "choiceLevel");
            return (Criteria) this;
        }

        public Criteria andChoiceLevelLessThan(String value) {
            addCriterion("choice_level <", value, "choiceLevel");
            return (Criteria) this;
        }

        public Criteria andChoiceLevelLessThanOrEqualTo(String value) {
            addCriterion("choice_level <=", value, "choiceLevel");
            return (Criteria) this;
        }

        public Criteria andChoiceLevelLike(String value) {
            addCriterion("choice_level like", value, "choiceLevel");
            return (Criteria) this;
        }

        public Criteria andChoiceLevelNotLike(String value) {
            addCriterion("choice_level not like", value, "choiceLevel");
            return (Criteria) this;
        }

        public Criteria andChoiceLevelIn(List<String> values) {
            addCriterion("choice_level in", values, "choiceLevel");
            return (Criteria) this;
        }

        public Criteria andChoiceLevelNotIn(List<String> values) {
            addCriterion("choice_level not in", values, "choiceLevel");
            return (Criteria) this;
        }

        public Criteria andChoiceLevelBetween(String value1, String value2) {
            addCriterion("choice_level between", value1, value2, "choiceLevel");
            return (Criteria) this;
        }

        public Criteria andChoiceLevelNotBetween(String value1, String value2) {
            addCriterion("choice_level not between", value1, value2, "choiceLevel");
            return (Criteria) this;
        }

        public Criteria andClassLevelTwoIsNull() {
            addCriterion("class_level_two is null");
            return (Criteria) this;
        }

        public Criteria andClassLevelTwoIsNotNull() {
            addCriterion("class_level_two is not null");
            return (Criteria) this;
        }

        public Criteria andClassLevelTwoEqualTo(String value) {
            addCriterion("class_level_two =", value, "classLevelTwo");
            return (Criteria) this;
        }

        public Criteria andClassLevelTwoNotEqualTo(String value) {
            addCriterion("class_level_two <>", value, "classLevelTwo");
            return (Criteria) this;
        }

        public Criteria andClassLevelTwoGreaterThan(String value) {
            addCriterion("class_level_two >", value, "classLevelTwo");
            return (Criteria) this;
        }

        public Criteria andClassLevelTwoGreaterThanOrEqualTo(String value) {
            addCriterion("class_level_two >=", value, "classLevelTwo");
            return (Criteria) this;
        }

        public Criteria andClassLevelTwoLessThan(String value) {
            addCriterion("class_level_two <", value, "classLevelTwo");
            return (Criteria) this;
        }

        public Criteria andClassLevelTwoLessThanOrEqualTo(String value) {
            addCriterion("class_level_two <=", value, "classLevelTwo");
            return (Criteria) this;
        }

        public Criteria andClassLevelTwoLike(String value) {
            addCriterion("class_level_two like", value, "classLevelTwo");
            return (Criteria) this;
        }

        public Criteria andClassLevelTwoNotLike(String value) {
            addCriterion("class_level_two not like", value, "classLevelTwo");
            return (Criteria) this;
        }

        public Criteria andClassLevelTwoIn(List<String> values) {
            addCriterion("class_level_two in", values, "classLevelTwo");
            return (Criteria) this;
        }

        public Criteria andClassLevelTwoNotIn(List<String> values) {
            addCriterion("class_level_two not in", values, "classLevelTwo");
            return (Criteria) this;
        }

        public Criteria andClassLevelTwoBetween(String value1, String value2) {
            addCriterion("class_level_two between", value1, value2, "classLevelTwo");
            return (Criteria) this;
        }

        public Criteria andClassLevelTwoNotBetween(String value1, String value2) {
            addCriterion("class_level_two not between", value1, value2, "classLevelTwo");
            return (Criteria) this;
        }

        public Criteria andClassLevelOneIsNull() {
            addCriterion("class_level_one is null");
            return (Criteria) this;
        }

        public Criteria andClassLevelOneIsNotNull() {
            addCriterion("class_level_one is not null");
            return (Criteria) this;
        }

        public Criteria andClassLevelOneEqualTo(String value) {
            addCriterion("class_level_one =", value, "classLevelOne");
            return (Criteria) this;
        }

        public Criteria andClassLevelOneNotEqualTo(String value) {
            addCriterion("class_level_one <>", value, "classLevelOne");
            return (Criteria) this;
        }

        public Criteria andClassLevelOneGreaterThan(String value) {
            addCriterion("class_level_one >", value, "classLevelOne");
            return (Criteria) this;
        }

        public Criteria andClassLevelOneGreaterThanOrEqualTo(String value) {
            addCriterion("class_level_one >=", value, "classLevelOne");
            return (Criteria) this;
        }

        public Criteria andClassLevelOneLessThan(String value) {
            addCriterion("class_level_one <", value, "classLevelOne");
            return (Criteria) this;
        }

        public Criteria andClassLevelOneLessThanOrEqualTo(String value) {
            addCriterion("class_level_one <=", value, "classLevelOne");
            return (Criteria) this;
        }

        public Criteria andClassLevelOneLike(String value) {
            addCriterion("class_level_one like", value, "classLevelOne");
            return (Criteria) this;
        }

        public Criteria andClassLevelOneNotLike(String value) {
            addCriterion("class_level_one not like", value, "classLevelOne");
            return (Criteria) this;
        }

        public Criteria andClassLevelOneIn(List<String> values) {
            addCriterion("class_level_one in", values, "classLevelOne");
            return (Criteria) this;
        }

        public Criteria andClassLevelOneNotIn(List<String> values) {
            addCriterion("class_level_one not in", values, "classLevelOne");
            return (Criteria) this;
        }

        public Criteria andClassLevelOneBetween(String value1, String value2) {
            addCriterion("class_level_one between", value1, value2, "classLevelOne");
            return (Criteria) this;
        }

        public Criteria andClassLevelOneNotBetween(String value1, String value2) {
            addCriterion("class_level_one not between", value1, value2, "classLevelOne");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
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