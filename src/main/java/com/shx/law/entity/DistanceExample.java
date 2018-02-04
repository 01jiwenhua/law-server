package com.shx.law.entity;

import java.util.ArrayList;
import java.util.List;

public class DistanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DistanceExample() {
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

        public Criteria andDeviceInIdIsNull() {
            addCriterion("device_in_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceInIdIsNotNull() {
            addCriterion("device_in_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceInIdEqualTo(Integer value) {
            addCriterion("device_in_id =", value, "deviceInId");
            return (Criteria) this;
        }

        public Criteria andDeviceInIdNotEqualTo(Integer value) {
            addCriterion("device_in_id <>", value, "deviceInId");
            return (Criteria) this;
        }

        public Criteria andDeviceInIdGreaterThan(Integer value) {
            addCriterion("device_in_id >", value, "deviceInId");
            return (Criteria) this;
        }

        public Criteria andDeviceInIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("device_in_id >=", value, "deviceInId");
            return (Criteria) this;
        }

        public Criteria andDeviceInIdLessThan(Integer value) {
            addCriterion("device_in_id <", value, "deviceInId");
            return (Criteria) this;
        }

        public Criteria andDeviceInIdLessThanOrEqualTo(Integer value) {
            addCriterion("device_in_id <=", value, "deviceInId");
            return (Criteria) this;
        }

        public Criteria andDeviceInIdIn(List<Integer> values) {
            addCriterion("device_in_id in", values, "deviceInId");
            return (Criteria) this;
        }

        public Criteria andDeviceInIdNotIn(List<Integer> values) {
            addCriterion("device_in_id not in", values, "deviceInId");
            return (Criteria) this;
        }

        public Criteria andDeviceInIdBetween(Integer value1, Integer value2) {
            addCriterion("device_in_id between", value1, value2, "deviceInId");
            return (Criteria) this;
        }

        public Criteria andDeviceInIdNotBetween(Integer value1, Integer value2) {
            addCriterion("device_in_id not between", value1, value2, "deviceInId");
            return (Criteria) this;
        }

        public Criteria andStructureOutIdIsNull() {
            addCriterion("structure_out_id is null");
            return (Criteria) this;
        }

        public Criteria andStructureOutIdIsNotNull() {
            addCriterion("structure_out_id is not null");
            return (Criteria) this;
        }

        public Criteria andStructureOutIdEqualTo(Integer value) {
            addCriterion("structure_out_id =", value, "structureOutId");
            return (Criteria) this;
        }

        public Criteria andStructureOutIdNotEqualTo(Integer value) {
            addCriterion("structure_out_id <>", value, "structureOutId");
            return (Criteria) this;
        }

        public Criteria andStructureOutIdGreaterThan(Integer value) {
            addCriterion("structure_out_id >", value, "structureOutId");
            return (Criteria) this;
        }

        public Criteria andStructureOutIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("structure_out_id >=", value, "structureOutId");
            return (Criteria) this;
        }

        public Criteria andStructureOutIdLessThan(Integer value) {
            addCriterion("structure_out_id <", value, "structureOutId");
            return (Criteria) this;
        }

        public Criteria andStructureOutIdLessThanOrEqualTo(Integer value) {
            addCriterion("structure_out_id <=", value, "structureOutId");
            return (Criteria) this;
        }

        public Criteria andStructureOutIdIn(List<Integer> values) {
            addCriterion("structure_out_id in", values, "structureOutId");
            return (Criteria) this;
        }

        public Criteria andStructureOutIdNotIn(List<Integer> values) {
            addCriterion("structure_out_id not in", values, "structureOutId");
            return (Criteria) this;
        }

        public Criteria andStructureOutIdBetween(Integer value1, Integer value2) {
            addCriterion("structure_out_id between", value1, value2, "structureOutId");
            return (Criteria) this;
        }

        public Criteria andStructureOutIdNotBetween(Integer value1, Integer value2) {
            addCriterion("structure_out_id not between", value1, value2, "structureOutId");
            return (Criteria) this;
        }

        public Criteria andDistanceIsNull() {
            addCriterion("distance is null");
            return (Criteria) this;
        }

        public Criteria andDistanceIsNotNull() {
            addCriterion("distance is not null");
            return (Criteria) this;
        }

        public Criteria andDistanceEqualTo(String value) {
            addCriterion("distance =", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotEqualTo(String value) {
            addCriterion("distance <>", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceGreaterThan(String value) {
            addCriterion("distance >", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceGreaterThanOrEqualTo(String value) {
            addCriterion("distance >=", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceLessThan(String value) {
            addCriterion("distance <", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceLessThanOrEqualTo(String value) {
            addCriterion("distance <=", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceLike(String value) {
            addCriterion("distance like", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotLike(String value) {
            addCriterion("distance not like", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceIn(List<String> values) {
            addCriterion("distance in", values, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotIn(List<String> values) {
            addCriterion("distance not in", values, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceBetween(String value1, String value2) {
            addCriterion("distance between", value1, value2, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotBetween(String value1, String value2) {
            addCriterion("distance not between", value1, value2, "distance");
            return (Criteria) this;
        }

        public Criteria andInstructionIsNull() {
            addCriterion("instruction is null");
            return (Criteria) this;
        }

        public Criteria andInstructionIsNotNull() {
            addCriterion("instruction is not null");
            return (Criteria) this;
        }

        public Criteria andInstructionEqualTo(String value) {
            addCriterion("instruction =", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionNotEqualTo(String value) {
            addCriterion("instruction <>", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionGreaterThan(String value) {
            addCriterion("instruction >", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionGreaterThanOrEqualTo(String value) {
            addCriterion("instruction >=", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionLessThan(String value) {
            addCriterion("instruction <", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionLessThanOrEqualTo(String value) {
            addCriterion("instruction <=", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionLike(String value) {
            addCriterion("instruction like", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionNotLike(String value) {
            addCriterion("instruction not like", value, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionIn(List<String> values) {
            addCriterion("instruction in", values, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionNotIn(List<String> values) {
            addCriterion("instruction not in", values, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionBetween(String value1, String value2) {
            addCriterion("instruction between", value1, value2, "instruction");
            return (Criteria) this;
        }

        public Criteria andInstructionNotBetween(String value1, String value2) {
            addCriterion("instruction not between", value1, value2, "instruction");
            return (Criteria) this;
        }

        public Criteria andStandardIsNull() {
            addCriterion("standard is null");
            return (Criteria) this;
        }

        public Criteria andStandardIsNotNull() {
            addCriterion("standard is not null");
            return (Criteria) this;
        }

        public Criteria andStandardEqualTo(String value) {
            addCriterion("standard =", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotEqualTo(String value) {
            addCriterion("standard <>", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThan(String value) {
            addCriterion("standard >", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardGreaterThanOrEqualTo(String value) {
            addCriterion("standard >=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThan(String value) {
            addCriterion("standard <", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLessThanOrEqualTo(String value) {
            addCriterion("standard <=", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardLike(String value) {
            addCriterion("standard like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotLike(String value) {
            addCriterion("standard not like", value, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardIn(List<String> values) {
            addCriterion("standard in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotIn(List<String> values) {
            addCriterion("standard not in", values, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardBetween(String value1, String value2) {
            addCriterion("standard between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andStandardNotBetween(String value1, String value2) {
            addCriterion("standard not between", value1, value2, "standard");
            return (Criteria) this;
        }

        public Criteria andTableNoIsNull() {
            addCriterion("table_no is null");
            return (Criteria) this;
        }

        public Criteria andTableNoIsNotNull() {
            addCriterion("table_no is not null");
            return (Criteria) this;
        }

        public Criteria andTableNoEqualTo(String value) {
            addCriterion("table_no =", value, "tableNo");
            return (Criteria) this;
        }

        public Criteria andTableNoNotEqualTo(String value) {
            addCriterion("table_no <>", value, "tableNo");
            return (Criteria) this;
        }

        public Criteria andTableNoGreaterThan(String value) {
            addCriterion("table_no >", value, "tableNo");
            return (Criteria) this;
        }

        public Criteria andTableNoGreaterThanOrEqualTo(String value) {
            addCriterion("table_no >=", value, "tableNo");
            return (Criteria) this;
        }

        public Criteria andTableNoLessThan(String value) {
            addCriterion("table_no <", value, "tableNo");
            return (Criteria) this;
        }

        public Criteria andTableNoLessThanOrEqualTo(String value) {
            addCriterion("table_no <=", value, "tableNo");
            return (Criteria) this;
        }

        public Criteria andTableNoLike(String value) {
            addCriterion("table_no like", value, "tableNo");
            return (Criteria) this;
        }

        public Criteria andTableNoNotLike(String value) {
            addCriterion("table_no not like", value, "tableNo");
            return (Criteria) this;
        }

        public Criteria andTableNoIn(List<String> values) {
            addCriterion("table_no in", values, "tableNo");
            return (Criteria) this;
        }

        public Criteria andTableNoNotIn(List<String> values) {
            addCriterion("table_no not in", values, "tableNo");
            return (Criteria) this;
        }

        public Criteria andTableNoBetween(String value1, String value2) {
            addCriterion("table_no between", value1, value2, "tableNo");
            return (Criteria) this;
        }

        public Criteria andTableNoNotBetween(String value1, String value2) {
            addCriterion("table_no not between", value1, value2, "tableNo");
            return (Criteria) this;
        }

        public Criteria andNoteIdIsNull() {
            addCriterion("note_id is null");
            return (Criteria) this;
        }

        public Criteria andNoteIdIsNotNull() {
            addCriterion("note_id is not null");
            return (Criteria) this;
        }

        public Criteria andNoteIdEqualTo(Integer value) {
            addCriterion("note_id =", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotEqualTo(Integer value) {
            addCriterion("note_id <>", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdGreaterThan(Integer value) {
            addCriterion("note_id >", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("note_id >=", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdLessThan(Integer value) {
            addCriterion("note_id <", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdLessThanOrEqualTo(Integer value) {
            addCriterion("note_id <=", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdIn(List<Integer> values) {
            addCriterion("note_id in", values, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotIn(List<Integer> values) {
            addCriterion("note_id not in", values, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdBetween(Integer value1, Integer value2) {
            addCriterion("note_id between", value1, value2, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("note_id not between", value1, value2, "noteId");
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