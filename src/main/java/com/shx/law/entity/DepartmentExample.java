package com.shx.law.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DepartmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepartmentExample() {
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

        public Criteria and名称IsNull() {
            addCriterion("名称 is null");
            return (Criteria) this;
        }

        public Criteria and名称IsNotNull() {
            addCriterion("名称 is not null");
            return (Criteria) this;
        }

        public Criteria and名称EqualTo(String value) {
            addCriterion("名称 =", value, "名称");
            return (Criteria) this;
        }

        public Criteria and名称NotEqualTo(String value) {
            addCriterion("名称 <>", value, "名称");
            return (Criteria) this;
        }

        public Criteria and名称GreaterThan(String value) {
            addCriterion("名称 >", value, "名称");
            return (Criteria) this;
        }

        public Criteria and名称GreaterThanOrEqualTo(String value) {
            addCriterion("名称 >=", value, "名称");
            return (Criteria) this;
        }

        public Criteria and名称LessThan(String value) {
            addCriterion("名称 <", value, "名称");
            return (Criteria) this;
        }

        public Criteria and名称LessThanOrEqualTo(String value) {
            addCriterion("名称 <=", value, "名称");
            return (Criteria) this;
        }

        public Criteria and名称Like(String value) {
            addCriterion("名称 like", value, "名称");
            return (Criteria) this;
        }

        public Criteria and名称NotLike(String value) {
            addCriterion("名称 not like", value, "名称");
            return (Criteria) this;
        }

        public Criteria and名称In(List<String> values) {
            addCriterion("名称 in", values, "名称");
            return (Criteria) this;
        }

        public Criteria and名称NotIn(List<String> values) {
            addCriterion("名称 not in", values, "名称");
            return (Criteria) this;
        }

        public Criteria and名称Between(String value1, String value2) {
            addCriterion("名称 between", value1, value2, "名称");
            return (Criteria) this;
        }

        public Criteria and名称NotBetween(String value1, String value2) {
            addCriterion("名称 not between", value1, value2, "名称");
            return (Criteria) this;
        }

        public Criteria and编号IsNull() {
            addCriterion("编号 is null");
            return (Criteria) this;
        }

        public Criteria and编号IsNotNull() {
            addCriterion("编号 is not null");
            return (Criteria) this;
        }

        public Criteria and编号EqualTo(String value) {
            addCriterion("编号 =", value, "编号");
            return (Criteria) this;
        }

        public Criteria and编号NotEqualTo(String value) {
            addCriterion("编号 <>", value, "编号");
            return (Criteria) this;
        }

        public Criteria and编号GreaterThan(String value) {
            addCriterion("编号 >", value, "编号");
            return (Criteria) this;
        }

        public Criteria and编号GreaterThanOrEqualTo(String value) {
            addCriterion("编号 >=", value, "编号");
            return (Criteria) this;
        }

        public Criteria and编号LessThan(String value) {
            addCriterion("编号 <", value, "编号");
            return (Criteria) this;
        }

        public Criteria and编号LessThanOrEqualTo(String value) {
            addCriterion("编号 <=", value, "编号");
            return (Criteria) this;
        }

        public Criteria and编号Like(String value) {
            addCriterion("编号 like", value, "编号");
            return (Criteria) this;
        }

        public Criteria and编号NotLike(String value) {
            addCriterion("编号 not like", value, "编号");
            return (Criteria) this;
        }

        public Criteria and编号In(List<String> values) {
            addCriterion("编号 in", values, "编号");
            return (Criteria) this;
        }

        public Criteria and编号NotIn(List<String> values) {
            addCriterion("编号 not in", values, "编号");
            return (Criteria) this;
        }

        public Criteria and编号Between(String value1, String value2) {
            addCriterion("编号 between", value1, value2, "编号");
            return (Criteria) this;
        }

        public Criteria and编号NotBetween(String value1, String value2) {
            addCriterion("编号 not between", value1, value2, "编号");
            return (Criteria) this;
        }

        public Criteria and父级部门idIsNull() {
            addCriterion("父级部门id is null");
            return (Criteria) this;
        }

        public Criteria and父级部门idIsNotNull() {
            addCriterion("父级部门id is not null");
            return (Criteria) this;
        }

        public Criteria and父级部门idEqualTo(Integer value) {
            addCriterion("父级部门id =", value, "父级部门id");
            return (Criteria) this;
        }

        public Criteria and父级部门idNotEqualTo(Integer value) {
            addCriterion("父级部门id <>", value, "父级部门id");
            return (Criteria) this;
        }

        public Criteria and父级部门idGreaterThan(Integer value) {
            addCriterion("父级部门id >", value, "父级部门id");
            return (Criteria) this;
        }

        public Criteria and父级部门idGreaterThanOrEqualTo(Integer value) {
            addCriterion("父级部门id >=", value, "父级部门id");
            return (Criteria) this;
        }

        public Criteria and父级部门idLessThan(Integer value) {
            addCriterion("父级部门id <", value, "父级部门id");
            return (Criteria) this;
        }

        public Criteria and父级部门idLessThanOrEqualTo(Integer value) {
            addCriterion("父级部门id <=", value, "父级部门id");
            return (Criteria) this;
        }

        public Criteria and父级部门idIn(List<Integer> values) {
            addCriterion("父级部门id in", values, "父级部门id");
            return (Criteria) this;
        }

        public Criteria and父级部门idNotIn(List<Integer> values) {
            addCriterion("父级部门id not in", values, "父级部门id");
            return (Criteria) this;
        }

        public Criteria and父级部门idBetween(Integer value1, Integer value2) {
            addCriterion("父级部门id between", value1, value2, "父级部门id");
            return (Criteria) this;
        }

        public Criteria and父级部门idNotBetween(Integer value1, Integer value2) {
            addCriterion("父级部门id not between", value1, value2, "父级部门id");
            return (Criteria) this;
        }

        public Criteria and所属公司IsNull() {
            addCriterion("所属公司 is null");
            return (Criteria) this;
        }

        public Criteria and所属公司IsNotNull() {
            addCriterion("所属公司 is not null");
            return (Criteria) this;
        }

        public Criteria and所属公司EqualTo(Integer value) {
            addCriterion("所属公司 =", value, "所属公司");
            return (Criteria) this;
        }

        public Criteria and所属公司NotEqualTo(Integer value) {
            addCriterion("所属公司 <>", value, "所属公司");
            return (Criteria) this;
        }

        public Criteria and所属公司GreaterThan(Integer value) {
            addCriterion("所属公司 >", value, "所属公司");
            return (Criteria) this;
        }

        public Criteria and所属公司GreaterThanOrEqualTo(Integer value) {
            addCriterion("所属公司 >=", value, "所属公司");
            return (Criteria) this;
        }

        public Criteria and所属公司LessThan(Integer value) {
            addCriterion("所属公司 <", value, "所属公司");
            return (Criteria) this;
        }

        public Criteria and所属公司LessThanOrEqualTo(Integer value) {
            addCriterion("所属公司 <=", value, "所属公司");
            return (Criteria) this;
        }

        public Criteria and所属公司In(List<Integer> values) {
            addCriterion("所属公司 in", values, "所属公司");
            return (Criteria) this;
        }

        public Criteria and所属公司NotIn(List<Integer> values) {
            addCriterion("所属公司 not in", values, "所属公司");
            return (Criteria) this;
        }

        public Criteria and所属公司Between(Integer value1, Integer value2) {
            addCriterion("所属公司 between", value1, value2, "所属公司");
            return (Criteria) this;
        }

        public Criteria and所属公司NotBetween(Integer value1, Integer value2) {
            addCriterion("所属公司 not between", value1, value2, "所属公司");
            return (Criteria) this;
        }

        public Criteria and创建时间IsNull() {
            addCriterion("创建时间 is null");
            return (Criteria) this;
        }

        public Criteria and创建时间IsNotNull() {
            addCriterion("创建时间 is not null");
            return (Criteria) this;
        }

        public Criteria and创建时间EqualTo(Date value) {
            addCriterion("创建时间 =", value, "创建时间");
            return (Criteria) this;
        }

        public Criteria and创建时间NotEqualTo(Date value) {
            addCriterion("创建时间 <>", value, "创建时间");
            return (Criteria) this;
        }

        public Criteria and创建时间GreaterThan(Date value) {
            addCriterion("创建时间 >", value, "创建时间");
            return (Criteria) this;
        }

        public Criteria and创建时间GreaterThanOrEqualTo(Date value) {
            addCriterion("创建时间 >=", value, "创建时间");
            return (Criteria) this;
        }

        public Criteria and创建时间LessThan(Date value) {
            addCriterion("创建时间 <", value, "创建时间");
            return (Criteria) this;
        }

        public Criteria and创建时间LessThanOrEqualTo(Date value) {
            addCriterion("创建时间 <=", value, "创建时间");
            return (Criteria) this;
        }

        public Criteria and创建时间In(List<Date> values) {
            addCriterion("创建时间 in", values, "创建时间");
            return (Criteria) this;
        }

        public Criteria and创建时间NotIn(List<Date> values) {
            addCriterion("创建时间 not in", values, "创建时间");
            return (Criteria) this;
        }

        public Criteria and创建时间Between(Date value1, Date value2) {
            addCriterion("创建时间 between", value1, value2, "创建时间");
            return (Criteria) this;
        }

        public Criteria and创建时间NotBetween(Date value1, Date value2) {
            addCriterion("创建时间 not between", value1, value2, "创建时间");
            return (Criteria) this;
        }

        public Criteria and更新时间IsNull() {
            addCriterion("更新时间 is null");
            return (Criteria) this;
        }

        public Criteria and更新时间IsNotNull() {
            addCriterion("更新时间 is not null");
            return (Criteria) this;
        }

        public Criteria and更新时间EqualTo(Date value) {
            addCriterion("更新时间 =", value, "更新时间");
            return (Criteria) this;
        }

        public Criteria and更新时间NotEqualTo(Date value) {
            addCriterion("更新时间 <>", value, "更新时间");
            return (Criteria) this;
        }

        public Criteria and更新时间GreaterThan(Date value) {
            addCriterion("更新时间 >", value, "更新时间");
            return (Criteria) this;
        }

        public Criteria and更新时间GreaterThanOrEqualTo(Date value) {
            addCriterion("更新时间 >=", value, "更新时间");
            return (Criteria) this;
        }

        public Criteria and更新时间LessThan(Date value) {
            addCriterion("更新时间 <", value, "更新时间");
            return (Criteria) this;
        }

        public Criteria and更新时间LessThanOrEqualTo(Date value) {
            addCriterion("更新时间 <=", value, "更新时间");
            return (Criteria) this;
        }

        public Criteria and更新时间In(List<Date> values) {
            addCriterion("更新时间 in", values, "更新时间");
            return (Criteria) this;
        }

        public Criteria and更新时间NotIn(List<Date> values) {
            addCriterion("更新时间 not in", values, "更新时间");
            return (Criteria) this;
        }

        public Criteria and更新时间Between(Date value1, Date value2) {
            addCriterion("更新时间 between", value1, value2, "更新时间");
            return (Criteria) this;
        }

        public Criteria and更新时间NotBetween(Date value1, Date value2) {
            addCriterion("更新时间 not between", value1, value2, "更新时间");
            return (Criteria) this;
        }

        public Criteria and创建人IsNull() {
            addCriterion("创建人 is null");
            return (Criteria) this;
        }

        public Criteria and创建人IsNotNull() {
            addCriterion("创建人 is not null");
            return (Criteria) this;
        }

        public Criteria and创建人EqualTo(Integer value) {
            addCriterion("创建人 =", value, "创建人");
            return (Criteria) this;
        }

        public Criteria and创建人NotEqualTo(Integer value) {
            addCriterion("创建人 <>", value, "创建人");
            return (Criteria) this;
        }

        public Criteria and创建人GreaterThan(Integer value) {
            addCriterion("创建人 >", value, "创建人");
            return (Criteria) this;
        }

        public Criteria and创建人GreaterThanOrEqualTo(Integer value) {
            addCriterion("创建人 >=", value, "创建人");
            return (Criteria) this;
        }

        public Criteria and创建人LessThan(Integer value) {
            addCriterion("创建人 <", value, "创建人");
            return (Criteria) this;
        }

        public Criteria and创建人LessThanOrEqualTo(Integer value) {
            addCriterion("创建人 <=", value, "创建人");
            return (Criteria) this;
        }

        public Criteria and创建人In(List<Integer> values) {
            addCriterion("创建人 in", values, "创建人");
            return (Criteria) this;
        }

        public Criteria and创建人NotIn(List<Integer> values) {
            addCriterion("创建人 not in", values, "创建人");
            return (Criteria) this;
        }

        public Criteria and创建人Between(Integer value1, Integer value2) {
            addCriterion("创建人 between", value1, value2, "创建人");
            return (Criteria) this;
        }

        public Criteria and创建人NotBetween(Integer value1, Integer value2) {
            addCriterion("创建人 not between", value1, value2, "创建人");
            return (Criteria) this;
        }

        public Criteria and更新人IsNull() {
            addCriterion("更新人 is null");
            return (Criteria) this;
        }

        public Criteria and更新人IsNotNull() {
            addCriterion("更新人 is not null");
            return (Criteria) this;
        }

        public Criteria and更新人EqualTo(Integer value) {
            addCriterion("更新人 =", value, "更新人");
            return (Criteria) this;
        }

        public Criteria and更新人NotEqualTo(Integer value) {
            addCriterion("更新人 <>", value, "更新人");
            return (Criteria) this;
        }

        public Criteria and更新人GreaterThan(Integer value) {
            addCriterion("更新人 >", value, "更新人");
            return (Criteria) this;
        }

        public Criteria and更新人GreaterThanOrEqualTo(Integer value) {
            addCriterion("更新人 >=", value, "更新人");
            return (Criteria) this;
        }

        public Criteria and更新人LessThan(Integer value) {
            addCriterion("更新人 <", value, "更新人");
            return (Criteria) this;
        }

        public Criteria and更新人LessThanOrEqualTo(Integer value) {
            addCriterion("更新人 <=", value, "更新人");
            return (Criteria) this;
        }

        public Criteria and更新人In(List<Integer> values) {
            addCriterion("更新人 in", values, "更新人");
            return (Criteria) this;
        }

        public Criteria and更新人NotIn(List<Integer> values) {
            addCriterion("更新人 not in", values, "更新人");
            return (Criteria) this;
        }

        public Criteria and更新人Between(Integer value1, Integer value2) {
            addCriterion("更新人 between", value1, value2, "更新人");
            return (Criteria) this;
        }

        public Criteria and更新人NotBetween(Integer value1, Integer value2) {
            addCriterion("更新人 not between", value1, value2, "更新人");
            return (Criteria) this;
        }

        public Criteria and状态IsNull() {
            addCriterion("状态 is null");
            return (Criteria) this;
        }

        public Criteria and状态IsNotNull() {
            addCriterion("状态 is not null");
            return (Criteria) this;
        }

        public Criteria and状态EqualTo(Integer value) {
            addCriterion("状态 =", value, "状态");
            return (Criteria) this;
        }

        public Criteria and状态NotEqualTo(Integer value) {
            addCriterion("状态 <>", value, "状态");
            return (Criteria) this;
        }

        public Criteria and状态GreaterThan(Integer value) {
            addCriterion("状态 >", value, "状态");
            return (Criteria) this;
        }

        public Criteria and状态GreaterThanOrEqualTo(Integer value) {
            addCriterion("状态 >=", value, "状态");
            return (Criteria) this;
        }

        public Criteria and状态LessThan(Integer value) {
            addCriterion("状态 <", value, "状态");
            return (Criteria) this;
        }

        public Criteria and状态LessThanOrEqualTo(Integer value) {
            addCriterion("状态 <=", value, "状态");
            return (Criteria) this;
        }

        public Criteria and状态In(List<Integer> values) {
            addCriterion("状态 in", values, "状态");
            return (Criteria) this;
        }

        public Criteria and状态NotIn(List<Integer> values) {
            addCriterion("状态 not in", values, "状态");
            return (Criteria) this;
        }

        public Criteria and状态Between(Integer value1, Integer value2) {
            addCriterion("状态 between", value1, value2, "状态");
            return (Criteria) this;
        }

        public Criteria and状态NotBetween(Integer value1, Integer value2) {
            addCriterion("状态 not between", value1, value2, "状态");
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