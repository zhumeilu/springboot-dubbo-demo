package com.zml.demo.producer.dao.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OReviewExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private static final long serialVersionUID = 1L;

    public OReviewExample() {
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(LocalDateTime value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(LocalDateTime value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(LocalDateTime value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(LocalDateTime value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<LocalDateTime> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<LocalDateTime> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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

        public Criteria andFirstReviewerIsNull() {
            addCriterion("first_reviewer is null");
            return (Criteria) this;
        }

        public Criteria andFirstReviewerIsNotNull() {
            addCriterion("first_reviewer is not null");
            return (Criteria) this;
        }

        public Criteria andFirstReviewerEqualTo(String value) {
            addCriterion("first_reviewer =", value, "firstReviewer");
            return (Criteria) this;
        }

        public Criteria andFirstReviewerNotEqualTo(String value) {
            addCriterion("first_reviewer <>", value, "firstReviewer");
            return (Criteria) this;
        }

        public Criteria andFirstReviewerGreaterThan(String value) {
            addCriterion("first_reviewer >", value, "firstReviewer");
            return (Criteria) this;
        }

        public Criteria andFirstReviewerGreaterThanOrEqualTo(String value) {
            addCriterion("first_reviewer >=", value, "firstReviewer");
            return (Criteria) this;
        }

        public Criteria andFirstReviewerLessThan(String value) {
            addCriterion("first_reviewer <", value, "firstReviewer");
            return (Criteria) this;
        }

        public Criteria andFirstReviewerLessThanOrEqualTo(String value) {
            addCriterion("first_reviewer <=", value, "firstReviewer");
            return (Criteria) this;
        }

        public Criteria andFirstReviewerLike(String value) {
            addCriterion("first_reviewer like", value, "firstReviewer");
            return (Criteria) this;
        }

        public Criteria andFirstReviewerNotLike(String value) {
            addCriterion("first_reviewer not like", value, "firstReviewer");
            return (Criteria) this;
        }

        public Criteria andFirstReviewerIn(List<String> values) {
            addCriterion("first_reviewer in", values, "firstReviewer");
            return (Criteria) this;
        }

        public Criteria andFirstReviewerNotIn(List<String> values) {
            addCriterion("first_reviewer not in", values, "firstReviewer");
            return (Criteria) this;
        }

        public Criteria andFirstReviewerBetween(String value1, String value2) {
            addCriterion("first_reviewer between", value1, value2, "firstReviewer");
            return (Criteria) this;
        }

        public Criteria andFirstReviewerNotBetween(String value1, String value2) {
            addCriterion("first_reviewer not between", value1, value2, "firstReviewer");
            return (Criteria) this;
        }

        public Criteria andLastReviewerIsNull() {
            addCriterion("last_reviewer is null");
            return (Criteria) this;
        }

        public Criteria andLastReviewerIsNotNull() {
            addCriterion("last_reviewer is not null");
            return (Criteria) this;
        }

        public Criteria andLastReviewerEqualTo(String value) {
            addCriterion("last_reviewer =", value, "lastReviewer");
            return (Criteria) this;
        }

        public Criteria andLastReviewerNotEqualTo(String value) {
            addCriterion("last_reviewer <>", value, "lastReviewer");
            return (Criteria) this;
        }

        public Criteria andLastReviewerGreaterThan(String value) {
            addCriterion("last_reviewer >", value, "lastReviewer");
            return (Criteria) this;
        }

        public Criteria andLastReviewerGreaterThanOrEqualTo(String value) {
            addCriterion("last_reviewer >=", value, "lastReviewer");
            return (Criteria) this;
        }

        public Criteria andLastReviewerLessThan(String value) {
            addCriterion("last_reviewer <", value, "lastReviewer");
            return (Criteria) this;
        }

        public Criteria andLastReviewerLessThanOrEqualTo(String value) {
            addCriterion("last_reviewer <=", value, "lastReviewer");
            return (Criteria) this;
        }

        public Criteria andLastReviewerLike(String value) {
            addCriterion("last_reviewer like", value, "lastReviewer");
            return (Criteria) this;
        }

        public Criteria andLastReviewerNotLike(String value) {
            addCriterion("last_reviewer not like", value, "lastReviewer");
            return (Criteria) this;
        }

        public Criteria andLastReviewerIn(List<String> values) {
            addCriterion("last_reviewer in", values, "lastReviewer");
            return (Criteria) this;
        }

        public Criteria andLastReviewerNotIn(List<String> values) {
            addCriterion("last_reviewer not in", values, "lastReviewer");
            return (Criteria) this;
        }

        public Criteria andLastReviewerBetween(String value1, String value2) {
            addCriterion("last_reviewer between", value1, value2, "lastReviewer");
            return (Criteria) this;
        }

        public Criteria andLastReviewerNotBetween(String value1, String value2) {
            addCriterion("last_reviewer not between", value1, value2, "lastReviewer");
            return (Criteria) this;
        }

        public Criteria andCheckerIsNull() {
            addCriterion("checker is null");
            return (Criteria) this;
        }

        public Criteria andCheckerIsNotNull() {
            addCriterion("checker is not null");
            return (Criteria) this;
        }

        public Criteria andCheckerEqualTo(String value) {
            addCriterion("checker =", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotEqualTo(String value) {
            addCriterion("checker <>", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerGreaterThan(String value) {
            addCriterion("checker >", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerGreaterThanOrEqualTo(String value) {
            addCriterion("checker >=", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLessThan(String value) {
            addCriterion("checker <", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLessThanOrEqualTo(String value) {
            addCriterion("checker <=", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerLike(String value) {
            addCriterion("checker like", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotLike(String value) {
            addCriterion("checker not like", value, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerIn(List<String> values) {
            addCriterion("checker in", values, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotIn(List<String> values) {
            addCriterion("checker not in", values, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerBetween(String value1, String value2) {
            addCriterion("checker between", value1, value2, "checker");
            return (Criteria) this;
        }

        public Criteria andCheckerNotBetween(String value1, String value2) {
            addCriterion("checker not between", value1, value2, "checker");
            return (Criteria) this;
        }

        public Criteria andFirstReviewTimeIsNull() {
            addCriterion("first_review_time is null");
            return (Criteria) this;
        }

        public Criteria andFirstReviewTimeIsNotNull() {
            addCriterion("first_review_time is not null");
            return (Criteria) this;
        }

        public Criteria andFirstReviewTimeEqualTo(LocalDateTime value) {
            addCriterion("first_review_time =", value, "firstReviewTime");
            return (Criteria) this;
        }

        public Criteria andFirstReviewTimeNotEqualTo(LocalDateTime value) {
            addCriterion("first_review_time <>", value, "firstReviewTime");
            return (Criteria) this;
        }

        public Criteria andFirstReviewTimeGreaterThan(LocalDateTime value) {
            addCriterion("first_review_time >", value, "firstReviewTime");
            return (Criteria) this;
        }

        public Criteria andFirstReviewTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("first_review_time >=", value, "firstReviewTime");
            return (Criteria) this;
        }

        public Criteria andFirstReviewTimeLessThan(LocalDateTime value) {
            addCriterion("first_review_time <", value, "firstReviewTime");
            return (Criteria) this;
        }

        public Criteria andFirstReviewTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("first_review_time <=", value, "firstReviewTime");
            return (Criteria) this;
        }

        public Criteria andFirstReviewTimeIn(List<LocalDateTime> values) {
            addCriterion("first_review_time in", values, "firstReviewTime");
            return (Criteria) this;
        }

        public Criteria andFirstReviewTimeNotIn(List<LocalDateTime> values) {
            addCriterion("first_review_time not in", values, "firstReviewTime");
            return (Criteria) this;
        }

        public Criteria andFirstReviewTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("first_review_time between", value1, value2, "firstReviewTime");
            return (Criteria) this;
        }

        public Criteria andFirstReviewTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("first_review_time not between", value1, value2, "firstReviewTime");
            return (Criteria) this;
        }

        public Criteria andLastReviewTimeIsNull() {
            addCriterion("last_review_time is null");
            return (Criteria) this;
        }

        public Criteria andLastReviewTimeIsNotNull() {
            addCriterion("last_review_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastReviewTimeEqualTo(LocalDateTime value) {
            addCriterion("last_review_time =", value, "lastReviewTime");
            return (Criteria) this;
        }

        public Criteria andLastReviewTimeNotEqualTo(LocalDateTime value) {
            addCriterion("last_review_time <>", value, "lastReviewTime");
            return (Criteria) this;
        }

        public Criteria andLastReviewTimeGreaterThan(LocalDateTime value) {
            addCriterion("last_review_time >", value, "lastReviewTime");
            return (Criteria) this;
        }

        public Criteria andLastReviewTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("last_review_time >=", value, "lastReviewTime");
            return (Criteria) this;
        }

        public Criteria andLastReviewTimeLessThan(LocalDateTime value) {
            addCriterion("last_review_time <", value, "lastReviewTime");
            return (Criteria) this;
        }

        public Criteria andLastReviewTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("last_review_time <=", value, "lastReviewTime");
            return (Criteria) this;
        }

        public Criteria andLastReviewTimeIn(List<LocalDateTime> values) {
            addCriterion("last_review_time in", values, "lastReviewTime");
            return (Criteria) this;
        }

        public Criteria andLastReviewTimeNotIn(List<LocalDateTime> values) {
            addCriterion("last_review_time not in", values, "lastReviewTime");
            return (Criteria) this;
        }

        public Criteria andLastReviewTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("last_review_time between", value1, value2, "lastReviewTime");
            return (Criteria) this;
        }

        public Criteria andLastReviewTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("last_review_time not between", value1, value2, "lastReviewTime");
            return (Criteria) this;
        }

        public Criteria andMachineReviewTimeIsNull() {
            addCriterion("machine_review_time is null");
            return (Criteria) this;
        }

        public Criteria andMachineReviewTimeIsNotNull() {
            addCriterion("machine_review_time is not null");
            return (Criteria) this;
        }

        public Criteria andMachineReviewTimeEqualTo(LocalDateTime value) {
            addCriterion("machine_review_time =", value, "machineReviewTime");
            return (Criteria) this;
        }

        public Criteria andMachineReviewTimeNotEqualTo(LocalDateTime value) {
            addCriterion("machine_review_time <>", value, "machineReviewTime");
            return (Criteria) this;
        }

        public Criteria andMachineReviewTimeGreaterThan(LocalDateTime value) {
            addCriterion("machine_review_time >", value, "machineReviewTime");
            return (Criteria) this;
        }

        public Criteria andMachineReviewTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("machine_review_time >=", value, "machineReviewTime");
            return (Criteria) this;
        }

        public Criteria andMachineReviewTimeLessThan(LocalDateTime value) {
            addCriterion("machine_review_time <", value, "machineReviewTime");
            return (Criteria) this;
        }

        public Criteria andMachineReviewTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("machine_review_time <=", value, "machineReviewTime");
            return (Criteria) this;
        }

        public Criteria andMachineReviewTimeIn(List<LocalDateTime> values) {
            addCriterion("machine_review_time in", values, "machineReviewTime");
            return (Criteria) this;
        }

        public Criteria andMachineReviewTimeNotIn(List<LocalDateTime> values) {
            addCriterion("machine_review_time not in", values, "machineReviewTime");
            return (Criteria) this;
        }

        public Criteria andMachineReviewTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("machine_review_time between", value1, value2, "machineReviewTime");
            return (Criteria) this;
        }

        public Criteria andMachineReviewTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("machine_review_time not between", value1, value2, "machineReviewTime");
            return (Criteria) this;
        }

        public Criteria andRearBlacklistReviewTimeIsNull() {
            addCriterion("rear_blacklist_review_time is null");
            return (Criteria) this;
        }

        public Criteria andRearBlacklistReviewTimeIsNotNull() {
            addCriterion("rear_blacklist_review_time is not null");
            return (Criteria) this;
        }

        public Criteria andRearBlacklistReviewTimeEqualTo(LocalDateTime value) {
            addCriterion("rear_blacklist_review_time =", value, "rearBlacklistReviewTime");
            return (Criteria) this;
        }

        public Criteria andRearBlacklistReviewTimeNotEqualTo(LocalDateTime value) {
            addCriterion("rear_blacklist_review_time <>", value, "rearBlacklistReviewTime");
            return (Criteria) this;
        }

        public Criteria andRearBlacklistReviewTimeGreaterThan(LocalDateTime value) {
            addCriterion("rear_blacklist_review_time >", value, "rearBlacklistReviewTime");
            return (Criteria) this;
        }

        public Criteria andRearBlacklistReviewTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("rear_blacklist_review_time >=", value, "rearBlacklistReviewTime");
            return (Criteria) this;
        }

        public Criteria andRearBlacklistReviewTimeLessThan(LocalDateTime value) {
            addCriterion("rear_blacklist_review_time <", value, "rearBlacklistReviewTime");
            return (Criteria) this;
        }

        public Criteria andRearBlacklistReviewTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("rear_blacklist_review_time <=", value, "rearBlacklistReviewTime");
            return (Criteria) this;
        }

        public Criteria andRearBlacklistReviewTimeIn(List<LocalDateTime> values) {
            addCriterion("rear_blacklist_review_time in", values, "rearBlacklistReviewTime");
            return (Criteria) this;
        }

        public Criteria andRearBlacklistReviewTimeNotIn(List<LocalDateTime> values) {
            addCriterion("rear_blacklist_review_time not in", values, "rearBlacklistReviewTime");
            return (Criteria) this;
        }

        public Criteria andRearBlacklistReviewTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("rear_blacklist_review_time between", value1, value2, "rearBlacklistReviewTime");
            return (Criteria) this;
        }

        public Criteria andRearBlacklistReviewTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("rear_blacklist_review_time not between", value1, value2, "rearBlacklistReviewTime");
            return (Criteria) this;
        }

        public Criteria andFrontBlacklistReviewTimeIsNull() {
            addCriterion("front_blacklist_review_time is null");
            return (Criteria) this;
        }

        public Criteria andFrontBlacklistReviewTimeIsNotNull() {
            addCriterion("front_blacklist_review_time is not null");
            return (Criteria) this;
        }

        public Criteria andFrontBlacklistReviewTimeEqualTo(LocalDateTime value) {
            addCriterion("front_blacklist_review_time =", value, "frontBlacklistReviewTime");
            return (Criteria) this;
        }

        public Criteria andFrontBlacklistReviewTimeNotEqualTo(LocalDateTime value) {
            addCriterion("front_blacklist_review_time <>", value, "frontBlacklistReviewTime");
            return (Criteria) this;
        }

        public Criteria andFrontBlacklistReviewTimeGreaterThan(LocalDateTime value) {
            addCriterion("front_blacklist_review_time >", value, "frontBlacklistReviewTime");
            return (Criteria) this;
        }

        public Criteria andFrontBlacklistReviewTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("front_blacklist_review_time >=", value, "frontBlacklistReviewTime");
            return (Criteria) this;
        }

        public Criteria andFrontBlacklistReviewTimeLessThan(LocalDateTime value) {
            addCriterion("front_blacklist_review_time <", value, "frontBlacklistReviewTime");
            return (Criteria) this;
        }

        public Criteria andFrontBlacklistReviewTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("front_blacklist_review_time <=", value, "frontBlacklistReviewTime");
            return (Criteria) this;
        }

        public Criteria andFrontBlacklistReviewTimeIn(List<LocalDateTime> values) {
            addCriterion("front_blacklist_review_time in", values, "frontBlacklistReviewTime");
            return (Criteria) this;
        }

        public Criteria andFrontBlacklistReviewTimeNotIn(List<LocalDateTime> values) {
            addCriterion("front_blacklist_review_time not in", values, "frontBlacklistReviewTime");
            return (Criteria) this;
        }

        public Criteria andFrontBlacklistReviewTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("front_blacklist_review_time between", value1, value2, "frontBlacklistReviewTime");
            return (Criteria) this;
        }

        public Criteria andFrontBlacklistReviewTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("front_blacklist_review_time not between", value1, value2, "frontBlacklistReviewTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNull() {
            addCriterion("check_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNotNull() {
            addCriterion("check_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEqualTo(LocalDateTime value) {
            addCriterion("check_time =", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotEqualTo(LocalDateTime value) {
            addCriterion("check_time <>", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThan(LocalDateTime value) {
            addCriterion("check_time >", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("check_time >=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThan(LocalDateTime value) {
            addCriterion("check_time <", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("check_time <=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIn(List<LocalDateTime> values) {
            addCriterion("check_time in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotIn(List<LocalDateTime> values) {
            addCriterion("check_time not in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("check_time between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("check_time not between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andMachineReviewStatusIsNull() {
            addCriterion("machine_review_status is null");
            return (Criteria) this;
        }

        public Criteria andMachineReviewStatusIsNotNull() {
            addCriterion("machine_review_status is not null");
            return (Criteria) this;
        }

        public Criteria andMachineReviewStatusEqualTo(Byte value) {
            addCriterion("machine_review_status =", value, "machineReviewStatus");
            return (Criteria) this;
        }

        public Criteria andMachineReviewStatusNotEqualTo(Byte value) {
            addCriterion("machine_review_status <>", value, "machineReviewStatus");
            return (Criteria) this;
        }

        public Criteria andMachineReviewStatusGreaterThan(Byte value) {
            addCriterion("machine_review_status >", value, "machineReviewStatus");
            return (Criteria) this;
        }

        public Criteria andMachineReviewStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("machine_review_status >=", value, "machineReviewStatus");
            return (Criteria) this;
        }

        public Criteria andMachineReviewStatusLessThan(Byte value) {
            addCriterion("machine_review_status <", value, "machineReviewStatus");
            return (Criteria) this;
        }

        public Criteria andMachineReviewStatusLessThanOrEqualTo(Byte value) {
            addCriterion("machine_review_status <=", value, "machineReviewStatus");
            return (Criteria) this;
        }

        public Criteria andMachineReviewStatusIn(List<Byte> values) {
            addCriterion("machine_review_status in", values, "machineReviewStatus");
            return (Criteria) this;
        }

        public Criteria andMachineReviewStatusNotIn(List<Byte> values) {
            addCriterion("machine_review_status not in", values, "machineReviewStatus");
            return (Criteria) this;
        }

        public Criteria andMachineReviewStatusBetween(Byte value1, Byte value2) {
            addCriterion("machine_review_status between", value1, value2, "machineReviewStatus");
            return (Criteria) this;
        }

        public Criteria andMachineReviewStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("machine_review_status not between", value1, value2, "machineReviewStatus");
            return (Criteria) this;
        }

        public Criteria andFirstReviewStatusIsNull() {
            addCriterion("first_review_status is null");
            return (Criteria) this;
        }

        public Criteria andFirstReviewStatusIsNotNull() {
            addCriterion("first_review_status is not null");
            return (Criteria) this;
        }

        public Criteria andFirstReviewStatusEqualTo(Byte value) {
            addCriterion("first_review_status =", value, "firstReviewStatus");
            return (Criteria) this;
        }

        public Criteria andFirstReviewStatusNotEqualTo(Byte value) {
            addCriterion("first_review_status <>", value, "firstReviewStatus");
            return (Criteria) this;
        }

        public Criteria andFirstReviewStatusGreaterThan(Byte value) {
            addCriterion("first_review_status >", value, "firstReviewStatus");
            return (Criteria) this;
        }

        public Criteria andFirstReviewStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("first_review_status >=", value, "firstReviewStatus");
            return (Criteria) this;
        }

        public Criteria andFirstReviewStatusLessThan(Byte value) {
            addCriterion("first_review_status <", value, "firstReviewStatus");
            return (Criteria) this;
        }

        public Criteria andFirstReviewStatusLessThanOrEqualTo(Byte value) {
            addCriterion("first_review_status <=", value, "firstReviewStatus");
            return (Criteria) this;
        }

        public Criteria andFirstReviewStatusIn(List<Byte> values) {
            addCriterion("first_review_status in", values, "firstReviewStatus");
            return (Criteria) this;
        }

        public Criteria andFirstReviewStatusNotIn(List<Byte> values) {
            addCriterion("first_review_status not in", values, "firstReviewStatus");
            return (Criteria) this;
        }

        public Criteria andFirstReviewStatusBetween(Byte value1, Byte value2) {
            addCriterion("first_review_status between", value1, value2, "firstReviewStatus");
            return (Criteria) this;
        }

        public Criteria andFirstReviewStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("first_review_status not between", value1, value2, "firstReviewStatus");
            return (Criteria) this;
        }

        public Criteria andLastReviewStatusIsNull() {
            addCriterion("last_review_status is null");
            return (Criteria) this;
        }

        public Criteria andLastReviewStatusIsNotNull() {
            addCriterion("last_review_status is not null");
            return (Criteria) this;
        }

        public Criteria andLastReviewStatusEqualTo(Byte value) {
            addCriterion("last_review_status =", value, "lastReviewStatus");
            return (Criteria) this;
        }

        public Criteria andLastReviewStatusNotEqualTo(Byte value) {
            addCriterion("last_review_status <>", value, "lastReviewStatus");
            return (Criteria) this;
        }

        public Criteria andLastReviewStatusGreaterThan(Byte value) {
            addCriterion("last_review_status >", value, "lastReviewStatus");
            return (Criteria) this;
        }

        public Criteria andLastReviewStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("last_review_status >=", value, "lastReviewStatus");
            return (Criteria) this;
        }

        public Criteria andLastReviewStatusLessThan(Byte value) {
            addCriterion("last_review_status <", value, "lastReviewStatus");
            return (Criteria) this;
        }

        public Criteria andLastReviewStatusLessThanOrEqualTo(Byte value) {
            addCriterion("last_review_status <=", value, "lastReviewStatus");
            return (Criteria) this;
        }

        public Criteria andLastReviewStatusIn(List<Byte> values) {
            addCriterion("last_review_status in", values, "lastReviewStatus");
            return (Criteria) this;
        }

        public Criteria andLastReviewStatusNotIn(List<Byte> values) {
            addCriterion("last_review_status not in", values, "lastReviewStatus");
            return (Criteria) this;
        }

        public Criteria andLastReviewStatusBetween(Byte value1, Byte value2) {
            addCriterion("last_review_status between", value1, value2, "lastReviewStatus");
            return (Criteria) this;
        }

        public Criteria andLastReviewStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("last_review_status not between", value1, value2, "lastReviewStatus");
            return (Criteria) this;
        }

        public Criteria andFrontBlacklistStatusIsNull() {
            addCriterion("front_blacklist_status is null");
            return (Criteria) this;
        }

        public Criteria andFrontBlacklistStatusIsNotNull() {
            addCriterion("front_blacklist_status is not null");
            return (Criteria) this;
        }

        public Criteria andFrontBlacklistStatusEqualTo(Byte value) {
            addCriterion("front_blacklist_status =", value, "frontBlacklistStatus");
            return (Criteria) this;
        }

        public Criteria andFrontBlacklistStatusNotEqualTo(Byte value) {
            addCriterion("front_blacklist_status <>", value, "frontBlacklistStatus");
            return (Criteria) this;
        }

        public Criteria andFrontBlacklistStatusGreaterThan(Byte value) {
            addCriterion("front_blacklist_status >", value, "frontBlacklistStatus");
            return (Criteria) this;
        }

        public Criteria andFrontBlacklistStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("front_blacklist_status >=", value, "frontBlacklistStatus");
            return (Criteria) this;
        }

        public Criteria andFrontBlacklistStatusLessThan(Byte value) {
            addCriterion("front_blacklist_status <", value, "frontBlacklistStatus");
            return (Criteria) this;
        }

        public Criteria andFrontBlacklistStatusLessThanOrEqualTo(Byte value) {
            addCriterion("front_blacklist_status <=", value, "frontBlacklistStatus");
            return (Criteria) this;
        }

        public Criteria andFrontBlacklistStatusIn(List<Byte> values) {
            addCriterion("front_blacklist_status in", values, "frontBlacklistStatus");
            return (Criteria) this;
        }

        public Criteria andFrontBlacklistStatusNotIn(List<Byte> values) {
            addCriterion("front_blacklist_status not in", values, "frontBlacklistStatus");
            return (Criteria) this;
        }

        public Criteria andFrontBlacklistStatusBetween(Byte value1, Byte value2) {
            addCriterion("front_blacklist_status between", value1, value2, "frontBlacklistStatus");
            return (Criteria) this;
        }

        public Criteria andFrontBlacklistStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("front_blacklist_status not between", value1, value2, "frontBlacklistStatus");
            return (Criteria) this;
        }

        public Criteria andRearBlacklistStatusIsNull() {
            addCriterion("rear_blacklist_status is null");
            return (Criteria) this;
        }

        public Criteria andRearBlacklistStatusIsNotNull() {
            addCriterion("rear_blacklist_status is not null");
            return (Criteria) this;
        }

        public Criteria andRearBlacklistStatusEqualTo(Byte value) {
            addCriterion("rear_blacklist_status =", value, "rearBlacklistStatus");
            return (Criteria) this;
        }

        public Criteria andRearBlacklistStatusNotEqualTo(Byte value) {
            addCriterion("rear_blacklist_status <>", value, "rearBlacklistStatus");
            return (Criteria) this;
        }

        public Criteria andRearBlacklistStatusGreaterThan(Byte value) {
            addCriterion("rear_blacklist_status >", value, "rearBlacklistStatus");
            return (Criteria) this;
        }

        public Criteria andRearBlacklistStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("rear_blacklist_status >=", value, "rearBlacklistStatus");
            return (Criteria) this;
        }

        public Criteria andRearBlacklistStatusLessThan(Byte value) {
            addCriterion("rear_blacklist_status <", value, "rearBlacklistStatus");
            return (Criteria) this;
        }

        public Criteria andRearBlacklistStatusLessThanOrEqualTo(Byte value) {
            addCriterion("rear_blacklist_status <=", value, "rearBlacklistStatus");
            return (Criteria) this;
        }

        public Criteria andRearBlacklistStatusIn(List<Byte> values) {
            addCriterion("rear_blacklist_status in", values, "rearBlacklistStatus");
            return (Criteria) this;
        }

        public Criteria andRearBlacklistStatusNotIn(List<Byte> values) {
            addCriterion("rear_blacklist_status not in", values, "rearBlacklistStatus");
            return (Criteria) this;
        }

        public Criteria andRearBlacklistStatusBetween(Byte value1, Byte value2) {
            addCriterion("rear_blacklist_status between", value1, value2, "rearBlacklistStatus");
            return (Criteria) this;
        }

        public Criteria andRearBlacklistStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("rear_blacklist_status not between", value1, value2, "rearBlacklistStatus");
            return (Criteria) this;
        }

        public Criteria andFirstAllotStatusIsNull() {
            addCriterion("first_allot_status is null");
            return (Criteria) this;
        }

        public Criteria andFirstAllotStatusIsNotNull() {
            addCriterion("first_allot_status is not null");
            return (Criteria) this;
        }

        public Criteria andFirstAllotStatusEqualTo(Boolean value) {
            addCriterion("first_allot_status =", value, "firstAllotStatus");
            return (Criteria) this;
        }

        public Criteria andFirstAllotStatusNotEqualTo(Boolean value) {
            addCriterion("first_allot_status <>", value, "firstAllotStatus");
            return (Criteria) this;
        }

        public Criteria andFirstAllotStatusGreaterThan(Boolean value) {
            addCriterion("first_allot_status >", value, "firstAllotStatus");
            return (Criteria) this;
        }

        public Criteria andFirstAllotStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("first_allot_status >=", value, "firstAllotStatus");
            return (Criteria) this;
        }

        public Criteria andFirstAllotStatusLessThan(Boolean value) {
            addCriterion("first_allot_status <", value, "firstAllotStatus");
            return (Criteria) this;
        }

        public Criteria andFirstAllotStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("first_allot_status <=", value, "firstAllotStatus");
            return (Criteria) this;
        }

        public Criteria andFirstAllotStatusIn(List<Boolean> values) {
            addCriterion("first_allot_status in", values, "firstAllotStatus");
            return (Criteria) this;
        }

        public Criteria andFirstAllotStatusNotIn(List<Boolean> values) {
            addCriterion("first_allot_status not in", values, "firstAllotStatus");
            return (Criteria) this;
        }

        public Criteria andFirstAllotStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("first_allot_status between", value1, value2, "firstAllotStatus");
            return (Criteria) this;
        }

        public Criteria andFirstAllotStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("first_allot_status not between", value1, value2, "firstAllotStatus");
            return (Criteria) this;
        }

        public Criteria andLastAllotStatusIsNull() {
            addCriterion("last_allot_status is null");
            return (Criteria) this;
        }

        public Criteria andLastAllotStatusIsNotNull() {
            addCriterion("last_allot_status is not null");
            return (Criteria) this;
        }

        public Criteria andLastAllotStatusEqualTo(Boolean value) {
            addCriterion("last_allot_status =", value, "lastAllotStatus");
            return (Criteria) this;
        }

        public Criteria andLastAllotStatusNotEqualTo(Boolean value) {
            addCriterion("last_allot_status <>", value, "lastAllotStatus");
            return (Criteria) this;
        }

        public Criteria andLastAllotStatusGreaterThan(Boolean value) {
            addCriterion("last_allot_status >", value, "lastAllotStatus");
            return (Criteria) this;
        }

        public Criteria andLastAllotStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("last_allot_status >=", value, "lastAllotStatus");
            return (Criteria) this;
        }

        public Criteria andLastAllotStatusLessThan(Boolean value) {
            addCriterion("last_allot_status <", value, "lastAllotStatus");
            return (Criteria) this;
        }

        public Criteria andLastAllotStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("last_allot_status <=", value, "lastAllotStatus");
            return (Criteria) this;
        }

        public Criteria andLastAllotStatusIn(List<Boolean> values) {
            addCriterion("last_allot_status in", values, "lastAllotStatus");
            return (Criteria) this;
        }

        public Criteria andLastAllotStatusNotIn(List<Boolean> values) {
            addCriterion("last_allot_status not in", values, "lastAllotStatus");
            return (Criteria) this;
        }

        public Criteria andLastAllotStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("last_allot_status between", value1, value2, "lastAllotStatus");
            return (Criteria) this;
        }

        public Criteria andLastAllotStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("last_allot_status not between", value1, value2, "lastAllotStatus");
            return (Criteria) this;
        }

        public Criteria andCheckAllotStatusIsNull() {
            addCriterion("check_allot_status is null");
            return (Criteria) this;
        }

        public Criteria andCheckAllotStatusIsNotNull() {
            addCriterion("check_allot_status is not null");
            return (Criteria) this;
        }

        public Criteria andCheckAllotStatusEqualTo(Boolean value) {
            addCriterion("check_allot_status =", value, "checkAllotStatus");
            return (Criteria) this;
        }

        public Criteria andCheckAllotStatusNotEqualTo(Boolean value) {
            addCriterion("check_allot_status <>", value, "checkAllotStatus");
            return (Criteria) this;
        }

        public Criteria andCheckAllotStatusGreaterThan(Boolean value) {
            addCriterion("check_allot_status >", value, "checkAllotStatus");
            return (Criteria) this;
        }

        public Criteria andCheckAllotStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("check_allot_status >=", value, "checkAllotStatus");
            return (Criteria) this;
        }

        public Criteria andCheckAllotStatusLessThan(Boolean value) {
            addCriterion("check_allot_status <", value, "checkAllotStatus");
            return (Criteria) this;
        }

        public Criteria andCheckAllotStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("check_allot_status <=", value, "checkAllotStatus");
            return (Criteria) this;
        }

        public Criteria andCheckAllotStatusIn(List<Boolean> values) {
            addCriterion("check_allot_status in", values, "checkAllotStatus");
            return (Criteria) this;
        }

        public Criteria andCheckAllotStatusNotIn(List<Boolean> values) {
            addCriterion("check_allot_status not in", values, "checkAllotStatus");
            return (Criteria) this;
        }

        public Criteria andCheckAllotStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("check_allot_status between", value1, value2, "checkAllotStatus");
            return (Criteria) this;
        }

        public Criteria andCheckAllotStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("check_allot_status not between", value1, value2, "checkAllotStatus");
            return (Criteria) this;
        }

        public Criteria andRejectCodeIsNull() {
            addCriterion("reject_code is null");
            return (Criteria) this;
        }

        public Criteria andRejectCodeIsNotNull() {
            addCriterion("reject_code is not null");
            return (Criteria) this;
        }

        public Criteria andRejectCodeEqualTo(String value) {
            addCriterion("reject_code =", value, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeNotEqualTo(String value) {
            addCriterion("reject_code <>", value, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeGreaterThan(String value) {
            addCriterion("reject_code >", value, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeGreaterThanOrEqualTo(String value) {
            addCriterion("reject_code >=", value, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeLessThan(String value) {
            addCriterion("reject_code <", value, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeLessThanOrEqualTo(String value) {
            addCriterion("reject_code <=", value, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeLike(String value) {
            addCriterion("reject_code like", value, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeNotLike(String value) {
            addCriterion("reject_code not like", value, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeIn(List<String> values) {
            addCriterion("reject_code in", values, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeNotIn(List<String> values) {
            addCriterion("reject_code not in", values, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeBetween(String value1, String value2) {
            addCriterion("reject_code between", value1, value2, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andRejectCodeNotBetween(String value1, String value2) {
            addCriterion("reject_code not between", value1, value2, "rejectCode");
            return (Criteria) this;
        }

        public Criteria andPauseCodeIsNull() {
            addCriterion("pause_code is null");
            return (Criteria) this;
        }

        public Criteria andPauseCodeIsNotNull() {
            addCriterion("pause_code is not null");
            return (Criteria) this;
        }

        public Criteria andPauseCodeEqualTo(String value) {
            addCriterion("pause_code =", value, "pauseCode");
            return (Criteria) this;
        }

        public Criteria andPauseCodeNotEqualTo(String value) {
            addCriterion("pause_code <>", value, "pauseCode");
            return (Criteria) this;
        }

        public Criteria andPauseCodeGreaterThan(String value) {
            addCriterion("pause_code >", value, "pauseCode");
            return (Criteria) this;
        }

        public Criteria andPauseCodeGreaterThanOrEqualTo(String value) {
            addCriterion("pause_code >=", value, "pauseCode");
            return (Criteria) this;
        }

        public Criteria andPauseCodeLessThan(String value) {
            addCriterion("pause_code <", value, "pauseCode");
            return (Criteria) this;
        }

        public Criteria andPauseCodeLessThanOrEqualTo(String value) {
            addCriterion("pause_code <=", value, "pauseCode");
            return (Criteria) this;
        }

        public Criteria andPauseCodeLike(String value) {
            addCriterion("pause_code like", value, "pauseCode");
            return (Criteria) this;
        }

        public Criteria andPauseCodeNotLike(String value) {
            addCriterion("pause_code not like", value, "pauseCode");
            return (Criteria) this;
        }

        public Criteria andPauseCodeIn(List<String> values) {
            addCriterion("pause_code in", values, "pauseCode");
            return (Criteria) this;
        }

        public Criteria andPauseCodeNotIn(List<String> values) {
            addCriterion("pause_code not in", values, "pauseCode");
            return (Criteria) this;
        }

        public Criteria andPauseCodeBetween(String value1, String value2) {
            addCriterion("pause_code between", value1, value2, "pauseCode");
            return (Criteria) this;
        }

        public Criteria andPauseCodeNotBetween(String value1, String value2) {
            addCriterion("pause_code not between", value1, value2, "pauseCode");
            return (Criteria) this;
        }

        public Criteria andBlackLevelIsNull() {
            addCriterion("black_level is null");
            return (Criteria) this;
        }

        public Criteria andBlackLevelIsNotNull() {
            addCriterion("black_level is not null");
            return (Criteria) this;
        }

        public Criteria andBlackLevelEqualTo(String value) {
            addCriterion("black_level =", value, "blackLevel");
            return (Criteria) this;
        }

        public Criteria andBlackLevelNotEqualTo(String value) {
            addCriterion("black_level <>", value, "blackLevel");
            return (Criteria) this;
        }

        public Criteria andBlackLevelGreaterThan(String value) {
            addCriterion("black_level >", value, "blackLevel");
            return (Criteria) this;
        }

        public Criteria andBlackLevelGreaterThanOrEqualTo(String value) {
            addCriterion("black_level >=", value, "blackLevel");
            return (Criteria) this;
        }

        public Criteria andBlackLevelLessThan(String value) {
            addCriterion("black_level <", value, "blackLevel");
            return (Criteria) this;
        }

        public Criteria andBlackLevelLessThanOrEqualTo(String value) {
            addCriterion("black_level <=", value, "blackLevel");
            return (Criteria) this;
        }

        public Criteria andBlackLevelLike(String value) {
            addCriterion("black_level like", value, "blackLevel");
            return (Criteria) this;
        }

        public Criteria andBlackLevelNotLike(String value) {
            addCriterion("black_level not like", value, "blackLevel");
            return (Criteria) this;
        }

        public Criteria andBlackLevelIn(List<String> values) {
            addCriterion("black_level in", values, "blackLevel");
            return (Criteria) this;
        }

        public Criteria andBlackLevelNotIn(List<String> values) {
            addCriterion("black_level not in", values, "blackLevel");
            return (Criteria) this;
        }

        public Criteria andBlackLevelBetween(String value1, String value2) {
            addCriterion("black_level between", value1, value2, "blackLevel");
            return (Criteria) this;
        }

        public Criteria andBlackLevelNotBetween(String value1, String value2) {
            addCriterion("black_level not between", value1, value2, "blackLevel");
            return (Criteria) this;
        }

        public Criteria andBlackTypeIsNull() {
            addCriterion("black_type is null");
            return (Criteria) this;
        }

        public Criteria andBlackTypeIsNotNull() {
            addCriterion("black_type is not null");
            return (Criteria) this;
        }

        public Criteria andBlackTypeEqualTo(String value) {
            addCriterion("black_type =", value, "blackType");
            return (Criteria) this;
        }

        public Criteria andBlackTypeNotEqualTo(String value) {
            addCriterion("black_type <>", value, "blackType");
            return (Criteria) this;
        }

        public Criteria andBlackTypeGreaterThan(String value) {
            addCriterion("black_type >", value, "blackType");
            return (Criteria) this;
        }

        public Criteria andBlackTypeGreaterThanOrEqualTo(String value) {
            addCriterion("black_type >=", value, "blackType");
            return (Criteria) this;
        }

        public Criteria andBlackTypeLessThan(String value) {
            addCriterion("black_type <", value, "blackType");
            return (Criteria) this;
        }

        public Criteria andBlackTypeLessThanOrEqualTo(String value) {
            addCriterion("black_type <=", value, "blackType");
            return (Criteria) this;
        }

        public Criteria andBlackTypeLike(String value) {
            addCriterion("black_type like", value, "blackType");
            return (Criteria) this;
        }

        public Criteria andBlackTypeNotLike(String value) {
            addCriterion("black_type not like", value, "blackType");
            return (Criteria) this;
        }

        public Criteria andBlackTypeIn(List<String> values) {
            addCriterion("black_type in", values, "blackType");
            return (Criteria) this;
        }

        public Criteria andBlackTypeNotIn(List<String> values) {
            addCriterion("black_type not in", values, "blackType");
            return (Criteria) this;
        }

        public Criteria andBlackTypeBetween(String value1, String value2) {
            addCriterion("black_type between", value1, value2, "blackType");
            return (Criteria) this;
        }

        public Criteria andBlackTypeNotBetween(String value1, String value2) {
            addCriterion("black_type not between", value1, value2, "blackType");
            return (Criteria) this;
        }

        public Criteria andBlackHitStatusIsNull() {
            addCriterion("black_hit_status is null");
            return (Criteria) this;
        }

        public Criteria andBlackHitStatusIsNotNull() {
            addCriterion("black_hit_status is not null");
            return (Criteria) this;
        }

        public Criteria andBlackHitStatusEqualTo(Boolean value) {
            addCriterion("black_hit_status =", value, "blackHitStatus");
            return (Criteria) this;
        }

        public Criteria andBlackHitStatusNotEqualTo(Boolean value) {
            addCriterion("black_hit_status <>", value, "blackHitStatus");
            return (Criteria) this;
        }

        public Criteria andBlackHitStatusGreaterThan(Boolean value) {
            addCriterion("black_hit_status >", value, "blackHitStatus");
            return (Criteria) this;
        }

        public Criteria andBlackHitStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("black_hit_status >=", value, "blackHitStatus");
            return (Criteria) this;
        }

        public Criteria andBlackHitStatusLessThan(Boolean value) {
            addCriterion("black_hit_status <", value, "blackHitStatus");
            return (Criteria) this;
        }

        public Criteria andBlackHitStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("black_hit_status <=", value, "blackHitStatus");
            return (Criteria) this;
        }

        public Criteria andBlackHitStatusIn(List<Boolean> values) {
            addCriterion("black_hit_status in", values, "blackHitStatus");
            return (Criteria) this;
        }

        public Criteria andBlackHitStatusNotIn(List<Boolean> values) {
            addCriterion("black_hit_status not in", values, "blackHitStatus");
            return (Criteria) this;
        }

        public Criteria andBlackHitStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("black_hit_status between", value1, value2, "blackHitStatus");
            return (Criteria) this;
        }

        public Criteria andBlackHitStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("black_hit_status not between", value1, value2, "blackHitStatus");
            return (Criteria) this;
        }

        public Criteria andReviewRemarkIsNull() {
            addCriterion("review_remark is null");
            return (Criteria) this;
        }

        public Criteria andReviewRemarkIsNotNull() {
            addCriterion("review_remark is not null");
            return (Criteria) this;
        }

        public Criteria andReviewRemarkEqualTo(String value) {
            addCriterion("review_remark =", value, "reviewRemark");
            return (Criteria) this;
        }

        public Criteria andReviewRemarkNotEqualTo(String value) {
            addCriterion("review_remark <>", value, "reviewRemark");
            return (Criteria) this;
        }

        public Criteria andReviewRemarkGreaterThan(String value) {
            addCriterion("review_remark >", value, "reviewRemark");
            return (Criteria) this;
        }

        public Criteria andReviewRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("review_remark >=", value, "reviewRemark");
            return (Criteria) this;
        }

        public Criteria andReviewRemarkLessThan(String value) {
            addCriterion("review_remark <", value, "reviewRemark");
            return (Criteria) this;
        }

        public Criteria andReviewRemarkLessThanOrEqualTo(String value) {
            addCriterion("review_remark <=", value, "reviewRemark");
            return (Criteria) this;
        }

        public Criteria andReviewRemarkLike(String value) {
            addCriterion("review_remark like", value, "reviewRemark");
            return (Criteria) this;
        }

        public Criteria andReviewRemarkNotLike(String value) {
            addCriterion("review_remark not like", value, "reviewRemark");
            return (Criteria) this;
        }

        public Criteria andReviewRemarkIn(List<String> values) {
            addCriterion("review_remark in", values, "reviewRemark");
            return (Criteria) this;
        }

        public Criteria andReviewRemarkNotIn(List<String> values) {
            addCriterion("review_remark not in", values, "reviewRemark");
            return (Criteria) this;
        }

        public Criteria andReviewRemarkBetween(String value1, String value2) {
            addCriterion("review_remark between", value1, value2, "reviewRemark");
            return (Criteria) this;
        }

        public Criteria andReviewRemarkNotBetween(String value1, String value2) {
            addCriterion("review_remark not between", value1, value2, "reviewRemark");
            return (Criteria) this;
        }

        public Criteria andPauseRemarkIsNull() {
            addCriterion("pause_remark is null");
            return (Criteria) this;
        }

        public Criteria andPauseRemarkIsNotNull() {
            addCriterion("pause_remark is not null");
            return (Criteria) this;
        }

        public Criteria andPauseRemarkEqualTo(String value) {
            addCriterion("pause_remark =", value, "pauseRemark");
            return (Criteria) this;
        }

        public Criteria andPauseRemarkNotEqualTo(String value) {
            addCriterion("pause_remark <>", value, "pauseRemark");
            return (Criteria) this;
        }

        public Criteria andPauseRemarkGreaterThan(String value) {
            addCriterion("pause_remark >", value, "pauseRemark");
            return (Criteria) this;
        }

        public Criteria andPauseRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("pause_remark >=", value, "pauseRemark");
            return (Criteria) this;
        }

        public Criteria andPauseRemarkLessThan(String value) {
            addCriterion("pause_remark <", value, "pauseRemark");
            return (Criteria) this;
        }

        public Criteria andPauseRemarkLessThanOrEqualTo(String value) {
            addCriterion("pause_remark <=", value, "pauseRemark");
            return (Criteria) this;
        }

        public Criteria andPauseRemarkLike(String value) {
            addCriterion("pause_remark like", value, "pauseRemark");
            return (Criteria) this;
        }

        public Criteria andPauseRemarkNotLike(String value) {
            addCriterion("pause_remark not like", value, "pauseRemark");
            return (Criteria) this;
        }

        public Criteria andPauseRemarkIn(List<String> values) {
            addCriterion("pause_remark in", values, "pauseRemark");
            return (Criteria) this;
        }

        public Criteria andPauseRemarkNotIn(List<String> values) {
            addCriterion("pause_remark not in", values, "pauseRemark");
            return (Criteria) this;
        }

        public Criteria andPauseRemarkBetween(String value1, String value2) {
            addCriterion("pause_remark between", value1, value2, "pauseRemark");
            return (Criteria) this;
        }

        public Criteria andPauseRemarkNotBetween(String value1, String value2) {
            addCriterion("pause_remark not between", value1, value2, "pauseRemark");
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