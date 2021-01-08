package com.zml.demo.producer.dao.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OUrgeTransformLogExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public OUrgeTransformLogExample() {
        oredCriteria = new ArrayList<>();
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

    protected abstract static class GeneratedCriteria implements Serializable {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andUrgeIdIsNull() {
            addCriterion("urge_id is null");
            return (Criteria) this;
        }

        public Criteria andUrgeIdIsNotNull() {
            addCriterion("urge_id is not null");
            return (Criteria) this;
        }

        public Criteria andUrgeIdEqualTo(String value) {
            addCriterion("urge_id =", value, "urgeId");
            return (Criteria) this;
        }

        public Criteria andUrgeIdNotEqualTo(String value) {
            addCriterion("urge_id <>", value, "urgeId");
            return (Criteria) this;
        }

        public Criteria andUrgeIdGreaterThan(String value) {
            addCriterion("urge_id >", value, "urgeId");
            return (Criteria) this;
        }

        public Criteria andUrgeIdGreaterThanOrEqualTo(String value) {
            addCriterion("urge_id >=", value, "urgeId");
            return (Criteria) this;
        }

        public Criteria andUrgeIdLessThan(String value) {
            addCriterion("urge_id <", value, "urgeId");
            return (Criteria) this;
        }

        public Criteria andUrgeIdLessThanOrEqualTo(String value) {
            addCriterion("urge_id <=", value, "urgeId");
            return (Criteria) this;
        }

        public Criteria andUrgeIdLike(String value) {
            addCriterion("urge_id like", value, "urgeId");
            return (Criteria) this;
        }

        public Criteria andUrgeIdNotLike(String value) {
            addCriterion("urge_id not like", value, "urgeId");
            return (Criteria) this;
        }

        public Criteria andUrgeIdIn(List<String> values) {
            addCriterion("urge_id in", values, "urgeId");
            return (Criteria) this;
        }

        public Criteria andUrgeIdNotIn(List<String> values) {
            addCriterion("urge_id not in", values, "urgeId");
            return (Criteria) this;
        }

        public Criteria andUrgeIdBetween(String value1, String value2) {
            addCriterion("urge_id between", value1, value2, "urgeId");
            return (Criteria) this;
        }

        public Criteria andUrgeIdNotBetween(String value1, String value2) {
            addCriterion("urge_id not between", value1, value2, "urgeId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andStagePreIsNull() {
            addCriterion("stage_pre is null");
            return (Criteria) this;
        }

        public Criteria andStagePreIsNotNull() {
            addCriterion("stage_pre is not null");
            return (Criteria) this;
        }

        public Criteria andStagePreEqualTo(String value) {
            addCriterion("stage_pre =", value, "stagePre");
            return (Criteria) this;
        }

        public Criteria andStagePreNotEqualTo(String value) {
            addCriterion("stage_pre <>", value, "stagePre");
            return (Criteria) this;
        }

        public Criteria andStagePreGreaterThan(String value) {
            addCriterion("stage_pre >", value, "stagePre");
            return (Criteria) this;
        }

        public Criteria andStagePreGreaterThanOrEqualTo(String value) {
            addCriterion("stage_pre >=", value, "stagePre");
            return (Criteria) this;
        }

        public Criteria andStagePreLessThan(String value) {
            addCriterion("stage_pre <", value, "stagePre");
            return (Criteria) this;
        }

        public Criteria andStagePreLessThanOrEqualTo(String value) {
            addCriterion("stage_pre <=", value, "stagePre");
            return (Criteria) this;
        }

        public Criteria andStagePreLike(String value) {
            addCriterion("stage_pre like", value, "stagePre");
            return (Criteria) this;
        }

        public Criteria andStagePreNotLike(String value) {
            addCriterion("stage_pre not like", value, "stagePre");
            return (Criteria) this;
        }

        public Criteria andStagePreIn(List<String> values) {
            addCriterion("stage_pre in", values, "stagePre");
            return (Criteria) this;
        }

        public Criteria andStagePreNotIn(List<String> values) {
            addCriterion("stage_pre not in", values, "stagePre");
            return (Criteria) this;
        }

        public Criteria andStagePreBetween(String value1, String value2) {
            addCriterion("stage_pre between", value1, value2, "stagePre");
            return (Criteria) this;
        }

        public Criteria andStagePreNotBetween(String value1, String value2) {
            addCriterion("stage_pre not between", value1, value2, "stagePre");
            return (Criteria) this;
        }

        public Criteria andStagePostIsNull() {
            addCriterion("stage_post is null");
            return (Criteria) this;
        }

        public Criteria andStagePostIsNotNull() {
            addCriterion("stage_post is not null");
            return (Criteria) this;
        }

        public Criteria andStagePostEqualTo(String value) {
            addCriterion("stage_post =", value, "stagePost");
            return (Criteria) this;
        }

        public Criteria andStagePostNotEqualTo(String value) {
            addCriterion("stage_post <>", value, "stagePost");
            return (Criteria) this;
        }

        public Criteria andStagePostGreaterThan(String value) {
            addCriterion("stage_post >", value, "stagePost");
            return (Criteria) this;
        }

        public Criteria andStagePostGreaterThanOrEqualTo(String value) {
            addCriterion("stage_post >=", value, "stagePost");
            return (Criteria) this;
        }

        public Criteria andStagePostLessThan(String value) {
            addCriterion("stage_post <", value, "stagePost");
            return (Criteria) this;
        }

        public Criteria andStagePostLessThanOrEqualTo(String value) {
            addCriterion("stage_post <=", value, "stagePost");
            return (Criteria) this;
        }

        public Criteria andStagePostLike(String value) {
            addCriterion("stage_post like", value, "stagePost");
            return (Criteria) this;
        }

        public Criteria andStagePostNotLike(String value) {
            addCriterion("stage_post not like", value, "stagePost");
            return (Criteria) this;
        }

        public Criteria andStagePostIn(List<String> values) {
            addCriterion("stage_post in", values, "stagePost");
            return (Criteria) this;
        }

        public Criteria andStagePostNotIn(List<String> values) {
            addCriterion("stage_post not in", values, "stagePost");
            return (Criteria) this;
        }

        public Criteria andStagePostBetween(String value1, String value2) {
            addCriterion("stage_post between", value1, value2, "stagePost");
            return (Criteria) this;
        }

        public Criteria andStagePostNotBetween(String value1, String value2) {
            addCriterion("stage_post not between", value1, value2, "stagePost");
            return (Criteria) this;
        }

        public Criteria andOperatorPreIsNull() {
            addCriterion("operator_pre is null");
            return (Criteria) this;
        }

        public Criteria andOperatorPreIsNotNull() {
            addCriterion("operator_pre is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorPreEqualTo(String value) {
            addCriterion("operator_pre =", value, "operatorPre");
            return (Criteria) this;
        }

        public Criteria andOperatorPreNotEqualTo(String value) {
            addCriterion("operator_pre <>", value, "operatorPre");
            return (Criteria) this;
        }

        public Criteria andOperatorPreGreaterThan(String value) {
            addCriterion("operator_pre >", value, "operatorPre");
            return (Criteria) this;
        }

        public Criteria andOperatorPreGreaterThanOrEqualTo(String value) {
            addCriterion("operator_pre >=", value, "operatorPre");
            return (Criteria) this;
        }

        public Criteria andOperatorPreLessThan(String value) {
            addCriterion("operator_pre <", value, "operatorPre");
            return (Criteria) this;
        }

        public Criteria andOperatorPreLessThanOrEqualTo(String value) {
            addCriterion("operator_pre <=", value, "operatorPre");
            return (Criteria) this;
        }

        public Criteria andOperatorPreLike(String value) {
            addCriterion("operator_pre like", value, "operatorPre");
            return (Criteria) this;
        }

        public Criteria andOperatorPreNotLike(String value) {
            addCriterion("operator_pre not like", value, "operatorPre");
            return (Criteria) this;
        }

        public Criteria andOperatorPreIn(List<String> values) {
            addCriterion("operator_pre in", values, "operatorPre");
            return (Criteria) this;
        }

        public Criteria andOperatorPreNotIn(List<String> values) {
            addCriterion("operator_pre not in", values, "operatorPre");
            return (Criteria) this;
        }

        public Criteria andOperatorPreBetween(String value1, String value2) {
            addCriterion("operator_pre between", value1, value2, "operatorPre");
            return (Criteria) this;
        }

        public Criteria andOperatorPreNotBetween(String value1, String value2) {
            addCriterion("operator_pre not between", value1, value2, "operatorPre");
            return (Criteria) this;
        }

        public Criteria andOperatorPostIsNull() {
            addCriterion("operator_post is null");
            return (Criteria) this;
        }

        public Criteria andOperatorPostIsNotNull() {
            addCriterion("operator_post is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorPostEqualTo(String value) {
            addCriterion("operator_post =", value, "operatorPost");
            return (Criteria) this;
        }

        public Criteria andOperatorPostNotEqualTo(String value) {
            addCriterion("operator_post <>", value, "operatorPost");
            return (Criteria) this;
        }

        public Criteria andOperatorPostGreaterThan(String value) {
            addCriterion("operator_post >", value, "operatorPost");
            return (Criteria) this;
        }

        public Criteria andOperatorPostGreaterThanOrEqualTo(String value) {
            addCriterion("operator_post >=", value, "operatorPost");
            return (Criteria) this;
        }

        public Criteria andOperatorPostLessThan(String value) {
            addCriterion("operator_post <", value, "operatorPost");
            return (Criteria) this;
        }

        public Criteria andOperatorPostLessThanOrEqualTo(String value) {
            addCriterion("operator_post <=", value, "operatorPost");
            return (Criteria) this;
        }

        public Criteria andOperatorPostLike(String value) {
            addCriterion("operator_post like", value, "operatorPost");
            return (Criteria) this;
        }

        public Criteria andOperatorPostNotLike(String value) {
            addCriterion("operator_post not like", value, "operatorPost");
            return (Criteria) this;
        }

        public Criteria andOperatorPostIn(List<String> values) {
            addCriterion("operator_post in", values, "operatorPost");
            return (Criteria) this;
        }

        public Criteria andOperatorPostNotIn(List<String> values) {
            addCriterion("operator_post not in", values, "operatorPost");
            return (Criteria) this;
        }

        public Criteria andOperatorPostBetween(String value1, String value2) {
            addCriterion("operator_post between", value1, value2, "operatorPost");
            return (Criteria) this;
        }

        public Criteria andOperatorPostNotBetween(String value1, String value2) {
            addCriterion("operator_post not between", value1, value2, "operatorPost");
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

        public Criteria andCreateTimeEqualTo(LocalDateTime value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(LocalDateTime value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(LocalDateTime value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(LocalDateTime value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<LocalDateTime> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<LocalDateTime> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
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