package com.shx.law.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LawExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LawExample() {
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

        public Criteria andLawNameIsNull() {
            addCriterion("law_name is null");
            return (Criteria) this;
        }

        public Criteria andLawNameIsNotNull() {
            addCriterion("law_name is not null");
            return (Criteria) this;
        }

        public Criteria andLawNameEqualTo(String value) {
            addCriterion("law_name =", value, "lawName");
            return (Criteria) this;
        }

        public Criteria andLawNameNotEqualTo(String value) {
            addCriterion("law_name <>", value, "lawName");
            return (Criteria) this;
        }

        public Criteria andLawNameGreaterThan(String value) {
            addCriterion("law_name >", value, "lawName");
            return (Criteria) this;
        }

        public Criteria andLawNameGreaterThanOrEqualTo(String value) {
            addCriterion("law_name >=", value, "lawName");
            return (Criteria) this;
        }

        public Criteria andLawNameLessThan(String value) {
            addCriterion("law_name <", value, "lawName");
            return (Criteria) this;
        }

        public Criteria andLawNameLessThanOrEqualTo(String value) {
            addCriterion("law_name <=", value, "lawName");
            return (Criteria) this;
        }

        public Criteria andLawNameLike(String value) {
            addCriterion("law_name like", value, "lawName");
            return (Criteria) this;
        }

        public Criteria andLawNameNotLike(String value) {
            addCriterion("law_name not like", value, "lawName");
            return (Criteria) this;
        }

        public Criteria andLawNameIn(List<String> values) {
            addCriterion("law_name in", values, "lawName");
            return (Criteria) this;
        }

        public Criteria andLawNameNotIn(List<String> values) {
            addCriterion("law_name not in", values, "lawName");
            return (Criteria) this;
        }

        public Criteria andLawNameBetween(String value1, String value2) {
            addCriterion("law_name between", value1, value2, "lawName");
            return (Criteria) this;
        }

        public Criteria andLawNameNotBetween(String value1, String value2) {
            addCriterion("law_name not between", value1, value2, "lawName");
            return (Criteria) this;
        }

        public Criteria andIssueNoIsNull() {
            addCriterion("issue_no is null");
            return (Criteria) this;
        }

        public Criteria andIssueNoIsNotNull() {
            addCriterion("issue_no is not null");
            return (Criteria) this;
        }

        public Criteria andIssueNoEqualTo(String value) {
            addCriterion("issue_no =", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoNotEqualTo(String value) {
            addCriterion("issue_no <>", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoGreaterThan(String value) {
            addCriterion("issue_no >", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoGreaterThanOrEqualTo(String value) {
            addCriterion("issue_no >=", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoLessThan(String value) {
            addCriterion("issue_no <", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoLessThanOrEqualTo(String value) {
            addCriterion("issue_no <=", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoLike(String value) {
            addCriterion("issue_no like", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoNotLike(String value) {
            addCriterion("issue_no not like", value, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoIn(List<String> values) {
            addCriterion("issue_no in", values, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoNotIn(List<String> values) {
            addCriterion("issue_no not in", values, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoBetween(String value1, String value2) {
            addCriterion("issue_no between", value1, value2, "issueNo");
            return (Criteria) this;
        }

        public Criteria andIssueNoNotBetween(String value1, String value2) {
            addCriterion("issue_no not between", value1, value2, "issueNo");
            return (Criteria) this;
        }

        public Criteria andTypeCodeIsNull() {
            addCriterion("type_code is null");
            return (Criteria) this;
        }

        public Criteria andTypeCodeIsNotNull() {
            addCriterion("type_code is not null");
            return (Criteria) this;
        }

        public Criteria andTypeCodeEqualTo(String value) {
            addCriterion("type_code =", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeNotEqualTo(String value) {
            addCriterion("type_code <>", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeGreaterThan(String value) {
            addCriterion("type_code >", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("type_code >=", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeLessThan(String value) {
            addCriterion("type_code <", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("type_code <=", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeLike(String value) {
            addCriterion("type_code like", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeNotLike(String value) {
            addCriterion("type_code not like", value, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeIn(List<String> values) {
            addCriterion("type_code in", values, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeNotIn(List<String> values) {
            addCriterion("type_code not in", values, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeBetween(String value1, String value2) {
            addCriterion("type_code between", value1, value2, "typeCode");
            return (Criteria) this;
        }

        public Criteria andTypeCodeNotBetween(String value1, String value2) {
            addCriterion("type_code not between", value1, value2, "typeCode");
            return (Criteria) this;
        }

        public Criteria andPublishOrgIsNull() {
            addCriterion("publish_org is null");
            return (Criteria) this;
        }

        public Criteria andPublishOrgIsNotNull() {
            addCriterion("publish_org is not null");
            return (Criteria) this;
        }

        public Criteria andPublishOrgEqualTo(String value) {
            addCriterion("publish_org =", value, "publishOrg");
            return (Criteria) this;
        }

        public Criteria andPublishOrgNotEqualTo(String value) {
            addCriterion("publish_org <>", value, "publishOrg");
            return (Criteria) this;
        }

        public Criteria andPublishOrgGreaterThan(String value) {
            addCriterion("publish_org >", value, "publishOrg");
            return (Criteria) this;
        }

        public Criteria andPublishOrgGreaterThanOrEqualTo(String value) {
            addCriterion("publish_org >=", value, "publishOrg");
            return (Criteria) this;
        }

        public Criteria andPublishOrgLessThan(String value) {
            addCriterion("publish_org <", value, "publishOrg");
            return (Criteria) this;
        }

        public Criteria andPublishOrgLessThanOrEqualTo(String value) {
            addCriterion("publish_org <=", value, "publishOrg");
            return (Criteria) this;
        }

        public Criteria andPublishOrgLike(String value) {
            addCriterion("publish_org like", value, "publishOrg");
            return (Criteria) this;
        }

        public Criteria andPublishOrgNotLike(String value) {
            addCriterion("publish_org not like", value, "publishOrg");
            return (Criteria) this;
        }

        public Criteria andPublishOrgIn(List<String> values) {
            addCriterion("publish_org in", values, "publishOrg");
            return (Criteria) this;
        }

        public Criteria andPublishOrgNotIn(List<String> values) {
            addCriterion("publish_org not in", values, "publishOrg");
            return (Criteria) this;
        }

        public Criteria andPublishOrgBetween(String value1, String value2) {
            addCriterion("publish_org between", value1, value2, "publishOrg");
            return (Criteria) this;
        }

        public Criteria andPublishOrgNotBetween(String value1, String value2) {
            addCriterion("publish_org not between", value1, value2, "publishOrg");
            return (Criteria) this;
        }

        public Criteria andLevleCodeIsNull() {
            addCriterion("levle_code is null");
            return (Criteria) this;
        }

        public Criteria andLevleCodeIsNotNull() {
            addCriterion("levle_code is not null");
            return (Criteria) this;
        }

        public Criteria andLevleCodeEqualTo(String value) {
            addCriterion("levle_code =", value, "levleCode");
            return (Criteria) this;
        }

        public Criteria andLevleCodeNotEqualTo(String value) {
            addCriterion("levle_code <>", value, "levleCode");
            return (Criteria) this;
        }

        public Criteria andLevleCodeGreaterThan(String value) {
            addCriterion("levle_code >", value, "levleCode");
            return (Criteria) this;
        }

        public Criteria andLevleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("levle_code >=", value, "levleCode");
            return (Criteria) this;
        }

        public Criteria andLevleCodeLessThan(String value) {
            addCriterion("levle_code <", value, "levleCode");
            return (Criteria) this;
        }

        public Criteria andLevleCodeLessThanOrEqualTo(String value) {
            addCriterion("levle_code <=", value, "levleCode");
            return (Criteria) this;
        }

        public Criteria andLevleCodeLike(String value) {
            addCriterion("levle_code like", value, "levleCode");
            return (Criteria) this;
        }

        public Criteria andLevleCodeNotLike(String value) {
            addCriterion("levle_code not like", value, "levleCode");
            return (Criteria) this;
        }

        public Criteria andLevleCodeIn(List<String> values) {
            addCriterion("levle_code in", values, "levleCode");
            return (Criteria) this;
        }

        public Criteria andLevleCodeNotIn(List<String> values) {
            addCriterion("levle_code not in", values, "levleCode");
            return (Criteria) this;
        }

        public Criteria andLevleCodeBetween(String value1, String value2) {
            addCriterion("levle_code between", value1, value2, "levleCode");
            return (Criteria) this;
        }

        public Criteria andLevleCodeNotBetween(String value1, String value2) {
            addCriterion("levle_code not between", value1, value2, "levleCode");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNull() {
            addCriterion("file_path is null");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNotNull() {
            addCriterion("file_path is not null");
            return (Criteria) this;
        }

        public Criteria andFilePathEqualTo(String value) {
            addCriterion("file_path =", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotEqualTo(String value) {
            addCriterion("file_path <>", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThan(String value) {
            addCriterion("file_path >", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("file_path >=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThan(String value) {
            addCriterion("file_path <", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThanOrEqualTo(String value) {
            addCriterion("file_path <=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLike(String value) {
            addCriterion("file_path like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotLike(String value) {
            addCriterion("file_path not like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathIn(List<String> values) {
            addCriterion("file_path in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotIn(List<String> values) {
            addCriterion("file_path not in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathBetween(String value1, String value2) {
            addCriterion("file_path between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotBetween(String value1, String value2) {
            addCriterion("file_path not between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNull() {
            addCriterion("publish_time is null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNotNull() {
            addCriterion("publish_time is not null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeEqualTo(Date value) {
            addCriterion("publish_time =", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotEqualTo(Date value) {
            addCriterion("publish_time <>", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThan(Date value) {
            addCriterion("publish_time >", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("publish_time >=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThan(Date value) {
            addCriterion("publish_time <", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThanOrEqualTo(Date value) {
            addCriterion("publish_time <=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIn(List<Date> values) {
            addCriterion("publish_time in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotIn(List<Date> values) {
            addCriterion("publish_time not in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeBetween(Date value1, Date value2) {
            addCriterion("publish_time between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotBetween(Date value1, Date value2) {
            addCriterion("publish_time not between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeIsNull() {
            addCriterion("effective_time is null");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeIsNotNull() {
            addCriterion("effective_time is not null");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeEqualTo(Date value) {
            addCriterion("effective_time =", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeNotEqualTo(Date value) {
            addCriterion("effective_time <>", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeGreaterThan(Date value) {
            addCriterion("effective_time >", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("effective_time >=", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeLessThan(Date value) {
            addCriterion("effective_time <", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("effective_time <=", value, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeIn(List<Date> values) {
            addCriterion("effective_time in", values, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeNotIn(List<Date> values) {
            addCriterion("effective_time not in", values, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeBetween(Date value1, Date value2) {
            addCriterion("effective_time between", value1, value2, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("effective_time not between", value1, value2, "effectiveTime");
            return (Criteria) this;
        }

        public Criteria andAbateTimeIsNull() {
            addCriterion("abate_time is null");
            return (Criteria) this;
        }

        public Criteria andAbateTimeIsNotNull() {
            addCriterion("abate_time is not null");
            return (Criteria) this;
        }

        public Criteria andAbateTimeEqualTo(Date value) {
            addCriterion("abate_time =", value, "abateTime");
            return (Criteria) this;
        }

        public Criteria andAbateTimeNotEqualTo(Date value) {
            addCriterion("abate_time <>", value, "abateTime");
            return (Criteria) this;
        }

        public Criteria andAbateTimeGreaterThan(Date value) {
            addCriterion("abate_time >", value, "abateTime");
            return (Criteria) this;
        }

        public Criteria andAbateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("abate_time >=", value, "abateTime");
            return (Criteria) this;
        }

        public Criteria andAbateTimeLessThan(Date value) {
            addCriterion("abate_time <", value, "abateTime");
            return (Criteria) this;
        }

        public Criteria andAbateTimeLessThanOrEqualTo(Date value) {
            addCriterion("abate_time <=", value, "abateTime");
            return (Criteria) this;
        }

        public Criteria andAbateTimeIn(List<Date> values) {
            addCriterion("abate_time in", values, "abateTime");
            return (Criteria) this;
        }

        public Criteria andAbateTimeNotIn(List<Date> values) {
            addCriterion("abate_time not in", values, "abateTime");
            return (Criteria) this;
        }

        public Criteria andAbateTimeBetween(Date value1, Date value2) {
            addCriterion("abate_time between", value1, value2, "abateTime");
            return (Criteria) this;
        }

        public Criteria andAbateTimeNotBetween(Date value1, Date value2) {
            addCriterion("abate_time not between", value1, value2, "abateTime");
            return (Criteria) this;
        }

        public Criteria andFileFromIsNull() {
            addCriterion("file_from is null");
            return (Criteria) this;
        }

        public Criteria andFileFromIsNotNull() {
            addCriterion("file_from is not null");
            return (Criteria) this;
        }

        public Criteria andFileFromEqualTo(String value) {
            addCriterion("file_from =", value, "fileFrom");
            return (Criteria) this;
        }

        public Criteria andFileFromNotEqualTo(String value) {
            addCriterion("file_from <>", value, "fileFrom");
            return (Criteria) this;
        }

        public Criteria andFileFromGreaterThan(String value) {
            addCriterion("file_from >", value, "fileFrom");
            return (Criteria) this;
        }

        public Criteria andFileFromGreaterThanOrEqualTo(String value) {
            addCriterion("file_from >=", value, "fileFrom");
            return (Criteria) this;
        }

        public Criteria andFileFromLessThan(String value) {
            addCriterion("file_from <", value, "fileFrom");
            return (Criteria) this;
        }

        public Criteria andFileFromLessThanOrEqualTo(String value) {
            addCriterion("file_from <=", value, "fileFrom");
            return (Criteria) this;
        }

        public Criteria andFileFromLike(String value) {
            addCriterion("file_from like", value, "fileFrom");
            return (Criteria) this;
        }

        public Criteria andFileFromNotLike(String value) {
            addCriterion("file_from not like", value, "fileFrom");
            return (Criteria) this;
        }

        public Criteria andFileFromIn(List<String> values) {
            addCriterion("file_from in", values, "fileFrom");
            return (Criteria) this;
        }

        public Criteria andFileFromNotIn(List<String> values) {
            addCriterion("file_from not in", values, "fileFrom");
            return (Criteria) this;
        }

        public Criteria andFileFromBetween(String value1, String value2) {
            addCriterion("file_from between", value1, value2, "fileFrom");
            return (Criteria) this;
        }

        public Criteria andFileFromNotBetween(String value1, String value2) {
            addCriterion("file_from not between", value1, value2, "fileFrom");
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