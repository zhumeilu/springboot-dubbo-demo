package com.zml.demo.producer.dao.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ODelayLogExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public ODelayLogExample() {
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

        public Criteria andDelayIdIsNull() {
            addCriterion("delay_id is null");
            return (Criteria) this;
        }

        public Criteria andDelayIdIsNotNull() {
            addCriterion("delay_id is not null");
            return (Criteria) this;
        }

        public Criteria andDelayIdEqualTo(String value) {
            addCriterion("delay_id =", value, "delayId");
            return (Criteria) this;
        }

        public Criteria andDelayIdNotEqualTo(String value) {
            addCriterion("delay_id <>", value, "delayId");
            return (Criteria) this;
        }

        public Criteria andDelayIdGreaterThan(String value) {
            addCriterion("delay_id >", value, "delayId");
            return (Criteria) this;
        }

        public Criteria andDelayIdGreaterThanOrEqualTo(String value) {
            addCriterion("delay_id >=", value, "delayId");
            return (Criteria) this;
        }

        public Criteria andDelayIdLessThan(String value) {
            addCriterion("delay_id <", value, "delayId");
            return (Criteria) this;
        }

        public Criteria andDelayIdLessThanOrEqualTo(String value) {
            addCriterion("delay_id <=", value, "delayId");
            return (Criteria) this;
        }

        public Criteria andDelayIdLike(String value) {
            addCriterion("delay_id like", value, "delayId");
            return (Criteria) this;
        }

        public Criteria andDelayIdNotLike(String value) {
            addCriterion("delay_id not like", value, "delayId");
            return (Criteria) this;
        }

        public Criteria andDelayIdIn(List<String> values) {
            addCriterion("delay_id in", values, "delayId");
            return (Criteria) this;
        }

        public Criteria andDelayIdNotIn(List<String> values) {
            addCriterion("delay_id not in", values, "delayId");
            return (Criteria) this;
        }

        public Criteria andDelayIdBetween(String value1, String value2) {
            addCriterion("delay_id between", value1, value2, "delayId");
            return (Criteria) this;
        }

        public Criteria andDelayIdNotBetween(String value1, String value2) {
            addCriterion("delay_id not between", value1, value2, "delayId");
            return (Criteria) this;
        }

        public Criteria andBeforeContentIsNull() {
            addCriterion("before_content is null");
            return (Criteria) this;
        }

        public Criteria andBeforeContentIsNotNull() {
            addCriterion("before_content is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeContentEqualTo(String value) {
            addCriterion("before_content =", value, "beforeContent");
            return (Criteria) this;
        }

        public Criteria andBeforeContentNotEqualTo(String value) {
            addCriterion("before_content <>", value, "beforeContent");
            return (Criteria) this;
        }

        public Criteria andBeforeContentGreaterThan(String value) {
            addCriterion("before_content >", value, "beforeContent");
            return (Criteria) this;
        }

        public Criteria andBeforeContentGreaterThanOrEqualTo(String value) {
            addCriterion("before_content >=", value, "beforeContent");
            return (Criteria) this;
        }

        public Criteria andBeforeContentLessThan(String value) {
            addCriterion("before_content <", value, "beforeContent");
            return (Criteria) this;
        }

        public Criteria andBeforeContentLessThanOrEqualTo(String value) {
            addCriterion("before_content <=", value, "beforeContent");
            return (Criteria) this;
        }

        public Criteria andBeforeContentLike(String value) {
            addCriterion("before_content like", value, "beforeContent");
            return (Criteria) this;
        }

        public Criteria andBeforeContentNotLike(String value) {
            addCriterion("before_content not like", value, "beforeContent");
            return (Criteria) this;
        }

        public Criteria andBeforeContentIn(List<String> values) {
            addCriterion("before_content in", values, "beforeContent");
            return (Criteria) this;
        }

        public Criteria andBeforeContentNotIn(List<String> values) {
            addCriterion("before_content not in", values, "beforeContent");
            return (Criteria) this;
        }

        public Criteria andBeforeContentBetween(String value1, String value2) {
            addCriterion("before_content between", value1, value2, "beforeContent");
            return (Criteria) this;
        }

        public Criteria andBeforeContentNotBetween(String value1, String value2) {
            addCriterion("before_content not between", value1, value2, "beforeContent");
            return (Criteria) this;
        }

        public Criteria andAfterContentIsNull() {
            addCriterion("after_content is null");
            return (Criteria) this;
        }

        public Criteria andAfterContentIsNotNull() {
            addCriterion("after_content is not null");
            return (Criteria) this;
        }

        public Criteria andAfterContentEqualTo(String value) {
            addCriterion("after_content =", value, "afterContent");
            return (Criteria) this;
        }

        public Criteria andAfterContentNotEqualTo(String value) {
            addCriterion("after_content <>", value, "afterContent");
            return (Criteria) this;
        }

        public Criteria andAfterContentGreaterThan(String value) {
            addCriterion("after_content >", value, "afterContent");
            return (Criteria) this;
        }

        public Criteria andAfterContentGreaterThanOrEqualTo(String value) {
            addCriterion("after_content >=", value, "afterContent");
            return (Criteria) this;
        }

        public Criteria andAfterContentLessThan(String value) {
            addCriterion("after_content <", value, "afterContent");
            return (Criteria) this;
        }

        public Criteria andAfterContentLessThanOrEqualTo(String value) {
            addCriterion("after_content <=", value, "afterContent");
            return (Criteria) this;
        }

        public Criteria andAfterContentLike(String value) {
            addCriterion("after_content like", value, "afterContent");
            return (Criteria) this;
        }

        public Criteria andAfterContentNotLike(String value) {
            addCriterion("after_content not like", value, "afterContent");
            return (Criteria) this;
        }

        public Criteria andAfterContentIn(List<String> values) {
            addCriterion("after_content in", values, "afterContent");
            return (Criteria) this;
        }

        public Criteria andAfterContentNotIn(List<String> values) {
            addCriterion("after_content not in", values, "afterContent");
            return (Criteria) this;
        }

        public Criteria andAfterContentBetween(String value1, String value2) {
            addCriterion("after_content between", value1, value2, "afterContent");
            return (Criteria) this;
        }

        public Criteria andAfterContentNotBetween(String value1, String value2) {
            addCriterion("after_content not between", value1, value2, "afterContent");
            return (Criteria) this;
        }

        public Criteria andOperateTypeIsNull() {
            addCriterion("operate_type is null");
            return (Criteria) this;
        }

        public Criteria andOperateTypeIsNotNull() {
            addCriterion("operate_type is not null");
            return (Criteria) this;
        }

        public Criteria andOperateTypeEqualTo(String value) {
            addCriterion("operate_type =", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeNotEqualTo(String value) {
            addCriterion("operate_type <>", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeGreaterThan(String value) {
            addCriterion("operate_type >", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("operate_type >=", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeLessThan(String value) {
            addCriterion("operate_type <", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeLessThanOrEqualTo(String value) {
            addCriterion("operate_type <=", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeLike(String value) {
            addCriterion("operate_type like", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeNotLike(String value) {
            addCriterion("operate_type not like", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeIn(List<String> values) {
            addCriterion("operate_type in", values, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeNotIn(List<String> values) {
            addCriterion("operate_type not in", values, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeBetween(String value1, String value2) {
            addCriterion("operate_type between", value1, value2, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeNotBetween(String value1, String value2) {
            addCriterion("operate_type not between", value1, value2, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(String value) {
            addCriterion("operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(String value) {
            addCriterion("operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(String value) {
            addCriterion("operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(String value) {
            addCriterion("operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(String value) {
            addCriterion("operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(String value) {
            addCriterion("operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLike(String value) {
            addCriterion("operator like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotLike(String value) {
            addCriterion("operator not like", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<String> values) {
            addCriterion("operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<String> values) {
            addCriterion("operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(String value1, String value2) {
            addCriterion("operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(String value1, String value2) {
            addCriterion("operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperateResultIsNull() {
            addCriterion("operate_result is null");
            return (Criteria) this;
        }

        public Criteria andOperateResultIsNotNull() {
            addCriterion("operate_result is not null");
            return (Criteria) this;
        }

        public Criteria andOperateResultEqualTo(String value) {
            addCriterion("operate_result =", value, "operateResult");
            return (Criteria) this;
        }

        public Criteria andOperateResultNotEqualTo(String value) {
            addCriterion("operate_result <>", value, "operateResult");
            return (Criteria) this;
        }

        public Criteria andOperateResultGreaterThan(String value) {
            addCriterion("operate_result >", value, "operateResult");
            return (Criteria) this;
        }

        public Criteria andOperateResultGreaterThanOrEqualTo(String value) {
            addCriterion("operate_result >=", value, "operateResult");
            return (Criteria) this;
        }

        public Criteria andOperateResultLessThan(String value) {
            addCriterion("operate_result <", value, "operateResult");
            return (Criteria) this;
        }

        public Criteria andOperateResultLessThanOrEqualTo(String value) {
            addCriterion("operate_result <=", value, "operateResult");
            return (Criteria) this;
        }

        public Criteria andOperateResultLike(String value) {
            addCriterion("operate_result like", value, "operateResult");
            return (Criteria) this;
        }

        public Criteria andOperateResultNotLike(String value) {
            addCriterion("operate_result not like", value, "operateResult");
            return (Criteria) this;
        }

        public Criteria andOperateResultIn(List<String> values) {
            addCriterion("operate_result in", values, "operateResult");
            return (Criteria) this;
        }

        public Criteria andOperateResultNotIn(List<String> values) {
            addCriterion("operate_result not in", values, "operateResult");
            return (Criteria) this;
        }

        public Criteria andOperateResultBetween(String value1, String value2) {
            addCriterion("operate_result between", value1, value2, "operateResult");
            return (Criteria) this;
        }

        public Criteria andOperateResultNotBetween(String value1, String value2) {
            addCriterion("operate_result not between", value1, value2, "operateResult");
            return (Criteria) this;
        }

        public Criteria andOperateFieldIsNull() {
            addCriterion("operate_field is null");
            return (Criteria) this;
        }

        public Criteria andOperateFieldIsNotNull() {
            addCriterion("operate_field is not null");
            return (Criteria) this;
        }

        public Criteria andOperateFieldEqualTo(String value) {
            addCriterion("operate_field =", value, "operateField");
            return (Criteria) this;
        }

        public Criteria andOperateFieldNotEqualTo(String value) {
            addCriterion("operate_field <>", value, "operateField");
            return (Criteria) this;
        }

        public Criteria andOperateFieldGreaterThan(String value) {
            addCriterion("operate_field >", value, "operateField");
            return (Criteria) this;
        }

        public Criteria andOperateFieldGreaterThanOrEqualTo(String value) {
            addCriterion("operate_field >=", value, "operateField");
            return (Criteria) this;
        }

        public Criteria andOperateFieldLessThan(String value) {
            addCriterion("operate_field <", value, "operateField");
            return (Criteria) this;
        }

        public Criteria andOperateFieldLessThanOrEqualTo(String value) {
            addCriterion("operate_field <=", value, "operateField");
            return (Criteria) this;
        }

        public Criteria andOperateFieldLike(String value) {
            addCriterion("operate_field like", value, "operateField");
            return (Criteria) this;
        }

        public Criteria andOperateFieldNotLike(String value) {
            addCriterion("operate_field not like", value, "operateField");
            return (Criteria) this;
        }

        public Criteria andOperateFieldIn(List<String> values) {
            addCriterion("operate_field in", values, "operateField");
            return (Criteria) this;
        }

        public Criteria andOperateFieldNotIn(List<String> values) {
            addCriterion("operate_field not in", values, "operateField");
            return (Criteria) this;
        }

        public Criteria andOperateFieldBetween(String value1, String value2) {
            addCriterion("operate_field between", value1, value2, "operateField");
            return (Criteria) this;
        }

        public Criteria andOperateFieldNotBetween(String value1, String value2) {
            addCriterion("operate_field not between", value1, value2, "operateField");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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