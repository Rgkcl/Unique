package com.unique.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProfessionalInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProfessionalInfoExample() {
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

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Integer value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Integer value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Integer value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Integer value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Integer value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Integer value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Integer> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Integer> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Integer value1, Integer value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Integer value1, Integer value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMnameIsNull() {
            addCriterion("mname is null");
            return (Criteria) this;
        }

        public Criteria andMnameIsNotNull() {
            addCriterion("mname is not null");
            return (Criteria) this;
        }

        public Criteria andMnameEqualTo(String value) {
            addCriterion("mname =", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotEqualTo(String value) {
            addCriterion("mname <>", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThan(String value) {
            addCriterion("mname >", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameGreaterThanOrEqualTo(String value) {
            addCriterion("mname >=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThan(String value) {
            addCriterion("mname <", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLessThanOrEqualTo(String value) {
            addCriterion("mname <=", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameLike(String value) {
            addCriterion("mname like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotLike(String value) {
            addCriterion("mname not like", value, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameIn(List<String> values) {
            addCriterion("mname in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotIn(List<String> values) {
            addCriterion("mname not in", values, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameBetween(String value1, String value2) {
            addCriterion("mname between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andMnameNotBetween(String value1, String value2) {
            addCriterion("mname not between", value1, value2, "mname");
            return (Criteria) this;
        }

        public Criteria andJobOrientationIsNull() {
            addCriterion("job_orientation is null");
            return (Criteria) this;
        }

        public Criteria andJobOrientationIsNotNull() {
            addCriterion("job_orientation is not null");
            return (Criteria) this;
        }

        public Criteria andJobOrientationEqualTo(String value) {
            addCriterion("job_orientation =", value, "jobOrientation");
            return (Criteria) this;
        }

        public Criteria andJobOrientationNotEqualTo(String value) {
            addCriterion("job_orientation <>", value, "jobOrientation");
            return (Criteria) this;
        }

        public Criteria andJobOrientationGreaterThan(String value) {
            addCriterion("job_orientation >", value, "jobOrientation");
            return (Criteria) this;
        }

        public Criteria andJobOrientationGreaterThanOrEqualTo(String value) {
            addCriterion("job_orientation >=", value, "jobOrientation");
            return (Criteria) this;
        }

        public Criteria andJobOrientationLessThan(String value) {
            addCriterion("job_orientation <", value, "jobOrientation");
            return (Criteria) this;
        }

        public Criteria andJobOrientationLessThanOrEqualTo(String value) {
            addCriterion("job_orientation <=", value, "jobOrientation");
            return (Criteria) this;
        }

        public Criteria andJobOrientationLike(String value) {
            addCriterion("job_orientation like", value, "jobOrientation");
            return (Criteria) this;
        }

        public Criteria andJobOrientationNotLike(String value) {
            addCriterion("job_orientation not like", value, "jobOrientation");
            return (Criteria) this;
        }

        public Criteria andJobOrientationIn(List<String> values) {
            addCriterion("job_orientation in", values, "jobOrientation");
            return (Criteria) this;
        }

        public Criteria andJobOrientationNotIn(List<String> values) {
            addCriterion("job_orientation not in", values, "jobOrientation");
            return (Criteria) this;
        }

        public Criteria andJobOrientationBetween(String value1, String value2) {
            addCriterion("job_orientation between", value1, value2, "jobOrientation");
            return (Criteria) this;
        }

        public Criteria andJobOrientationNotBetween(String value1, String value2) {
            addCriterion("job_orientation not between", value1, value2, "jobOrientation");
            return (Criteria) this;
        }

        public Criteria andProfessionalKnowledageIsNull() {
            addCriterion("professional_knowledage is null");
            return (Criteria) this;
        }

        public Criteria andProfessionalKnowledageIsNotNull() {
            addCriterion("professional_knowledage is not null");
            return (Criteria) this;
        }

        public Criteria andProfessionalKnowledageEqualTo(String value) {
            addCriterion("professional_knowledage =", value, "professionalKnowledage");
            return (Criteria) this;
        }

        public Criteria andProfessionalKnowledageNotEqualTo(String value) {
            addCriterion("professional_knowledage <>", value, "professionalKnowledage");
            return (Criteria) this;
        }

        public Criteria andProfessionalKnowledageGreaterThan(String value) {
            addCriterion("professional_knowledage >", value, "professionalKnowledage");
            return (Criteria) this;
        }

        public Criteria andProfessionalKnowledageGreaterThanOrEqualTo(String value) {
            addCriterion("professional_knowledage >=", value, "professionalKnowledage");
            return (Criteria) this;
        }

        public Criteria andProfessionalKnowledageLessThan(String value) {
            addCriterion("professional_knowledage <", value, "professionalKnowledage");
            return (Criteria) this;
        }

        public Criteria andProfessionalKnowledageLessThanOrEqualTo(String value) {
            addCriterion("professional_knowledage <=", value, "professionalKnowledage");
            return (Criteria) this;
        }

        public Criteria andProfessionalKnowledageLike(String value) {
            addCriterion("professional_knowledage like", value, "professionalKnowledage");
            return (Criteria) this;
        }

        public Criteria andProfessionalKnowledageNotLike(String value) {
            addCriterion("professional_knowledage not like", value, "professionalKnowledage");
            return (Criteria) this;
        }

        public Criteria andProfessionalKnowledageIn(List<String> values) {
            addCriterion("professional_knowledage in", values, "professionalKnowledage");
            return (Criteria) this;
        }

        public Criteria andProfessionalKnowledageNotIn(List<String> values) {
            addCriterion("professional_knowledage not in", values, "professionalKnowledage");
            return (Criteria) this;
        }

        public Criteria andProfessionalKnowledageBetween(String value1, String value2) {
            addCriterion("professional_knowledage between", value1, value2, "professionalKnowledage");
            return (Criteria) this;
        }

        public Criteria andProfessionalKnowledageNotBetween(String value1, String value2) {
            addCriterion("professional_knowledage not between", value1, value2, "professionalKnowledage");
            return (Criteria) this;
        }

        public Criteria andSkillIsNull() {
            addCriterion("skill is null");
            return (Criteria) this;
        }

        public Criteria andSkillIsNotNull() {
            addCriterion("skill is not null");
            return (Criteria) this;
        }

        public Criteria andSkillEqualTo(String value) {
            addCriterion("skill =", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillNotEqualTo(String value) {
            addCriterion("skill <>", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillGreaterThan(String value) {
            addCriterion("skill >", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillGreaterThanOrEqualTo(String value) {
            addCriterion("skill >=", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillLessThan(String value) {
            addCriterion("skill <", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillLessThanOrEqualTo(String value) {
            addCriterion("skill <=", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillLike(String value) {
            addCriterion("skill like", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillNotLike(String value) {
            addCriterion("skill not like", value, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillIn(List<String> values) {
            addCriterion("skill in", values, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillNotIn(List<String> values) {
            addCriterion("skill not in", values, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillBetween(String value1, String value2) {
            addCriterion("skill between", value1, value2, "skill");
            return (Criteria) this;
        }

        public Criteria andSkillNotBetween(String value1, String value2) {
            addCriterion("skill not between", value1, value2, "skill");
            return (Criteria) this;
        }

        public Criteria andSubjecIsNull() {
            addCriterion("subjec is null");
            return (Criteria) this;
        }

        public Criteria andSubjecIsNotNull() {
            addCriterion("subjec is not null");
            return (Criteria) this;
        }

        public Criteria andSubjecEqualTo(String value) {
            addCriterion("subjec =", value, "subjec");
            return (Criteria) this;
        }

        public Criteria andSubjecNotEqualTo(String value) {
            addCriterion("subjec <>", value, "subjec");
            return (Criteria) this;
        }

        public Criteria andSubjecGreaterThan(String value) {
            addCriterion("subjec >", value, "subjec");
            return (Criteria) this;
        }

        public Criteria andSubjecGreaterThanOrEqualTo(String value) {
            addCriterion("subjec >=", value, "subjec");
            return (Criteria) this;
        }

        public Criteria andSubjecLessThan(String value) {
            addCriterion("subjec <", value, "subjec");
            return (Criteria) this;
        }

        public Criteria andSubjecLessThanOrEqualTo(String value) {
            addCriterion("subjec <=", value, "subjec");
            return (Criteria) this;
        }

        public Criteria andSubjecLike(String value) {
            addCriterion("subjec like", value, "subjec");
            return (Criteria) this;
        }

        public Criteria andSubjecNotLike(String value) {
            addCriterion("subjec not like", value, "subjec");
            return (Criteria) this;
        }

        public Criteria andSubjecIn(List<String> values) {
            addCriterion("subjec in", values, "subjec");
            return (Criteria) this;
        }

        public Criteria andSubjecNotIn(List<String> values) {
            addCriterion("subjec not in", values, "subjec");
            return (Criteria) this;
        }

        public Criteria andSubjecBetween(String value1, String value2) {
            addCriterion("subjec between", value1, value2, "subjec");
            return (Criteria) this;
        }

        public Criteria andSubjecNotBetween(String value1, String value2) {
            addCriterion("subjec not between", value1, value2, "subjec");
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