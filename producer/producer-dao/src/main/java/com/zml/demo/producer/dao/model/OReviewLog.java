package com.zml.demo.producer.dao.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class OReviewLog implements Serializable {
    /**
     * 主键ID
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private LocalDateTime createTime;

    /**
     * 订单唯一编号
     *
     * @mbg.generated
     */
    private String orderId;

    /**
     * 用户Id
     *
     * @mbg.generated
     */
    private String userId;

    /**
     * 操作人员
     *
     * @mbg.generated
     */
    private String operator;

    /**
     * 操作类型 machine_review 机审； first_review 初审；first_allot 初审分配; last_review终审；pause 挂单;last_allot 终审分配 ；check稽查；bank_review银行卡审核；
     *
     * @mbg.generated
     */
    private String operateType;

    /**
     * 操作结果 （
machine_review_pass 机审通过； first_review_wait_allot 初审待分配；
first_reviewing 初审中；
first_review_reject 初审拒绝;
first_pass 初审通过; 
last_review_wait_allot 终审待分配；
last_reviewing 终审中；
last_review_reject 终审拒绝；
last_review_pass 终审通过；
last_review_back 终审退单；
finance_back 财务退单；
first_pause 初审挂单；
first_pause_recover 挂单恢复；
     *
     * @mbg.generated
     */
    private String operateResult;

    /**
     * 修改前内容(编辑字段时不为空)
     *
     * @mbg.generated
     */
    private String beforeContent;

    /**
     * 修改后内容(编辑字段时不为空)
     *
     * @mbg.generated
     */
    private String afterContent;

    /**
     * 备注
     *
     * @mbg.generated
     */
    private String remark;

    /**
     * 拒绝类型/挂单类型
     *
     * @mbg.generated
     */
    private String rejectType;

    /**
     * 拒绝原因
     *
     * @mbg.generated
     */
    private String rejectReason;

    /**
     * 拒绝码
     *
     * @mbg.generated
     */
    private String rejectCode;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public String getOperateResult() {
        return operateResult;
    }

    public void setOperateResult(String operateResult) {
        this.operateResult = operateResult;
    }

    public String getBeforeContent() {
        return beforeContent;
    }

    public void setBeforeContent(String beforeContent) {
        this.beforeContent = beforeContent;
    }

    public String getAfterContent() {
        return afterContent;
    }

    public void setAfterContent(String afterContent) {
        this.afterContent = afterContent;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRejectType() {
        return rejectType;
    }

    public void setRejectType(String rejectType) {
        this.rejectType = rejectType;
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    public String getRejectCode() {
        return rejectCode;
    }

    public void setRejectCode(String rejectCode) {
        this.rejectCode = rejectCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createTime=").append(createTime);
        sb.append(", orderId=").append(orderId);
        sb.append(", userId=").append(userId);
        sb.append(", operator=").append(operator);
        sb.append(", operateType=").append(operateType);
        sb.append(", operateResult=").append(operateResult);
        sb.append(", beforeContent=").append(beforeContent);
        sb.append(", afterContent=").append(afterContent);
        sb.append(", remark=").append(remark);
        sb.append(", rejectType=").append(rejectType);
        sb.append(", rejectReason=").append(rejectReason);
        sb.append(", rejectCode=").append(rejectCode);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        OReviewLog other = (OReviewLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getOperator() == null ? other.getOperator() == null : this.getOperator().equals(other.getOperator()))
            && (this.getOperateType() == null ? other.getOperateType() == null : this.getOperateType().equals(other.getOperateType()))
            && (this.getOperateResult() == null ? other.getOperateResult() == null : this.getOperateResult().equals(other.getOperateResult()))
            && (this.getBeforeContent() == null ? other.getBeforeContent() == null : this.getBeforeContent().equals(other.getBeforeContent()))
            && (this.getAfterContent() == null ? other.getAfterContent() == null : this.getAfterContent().equals(other.getAfterContent()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getRejectType() == null ? other.getRejectType() == null : this.getRejectType().equals(other.getRejectType()))
            && (this.getRejectReason() == null ? other.getRejectReason() == null : this.getRejectReason().equals(other.getRejectReason()))
            && (this.getRejectCode() == null ? other.getRejectCode() == null : this.getRejectCode().equals(other.getRejectCode()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getOperator() == null) ? 0 : getOperator().hashCode());
        result = prime * result + ((getOperateType() == null) ? 0 : getOperateType().hashCode());
        result = prime * result + ((getOperateResult() == null) ? 0 : getOperateResult().hashCode());
        result = prime * result + ((getBeforeContent() == null) ? 0 : getBeforeContent().hashCode());
        result = prime * result + ((getAfterContent() == null) ? 0 : getAfterContent().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getRejectType() == null) ? 0 : getRejectType().hashCode());
        result = prime * result + ((getRejectReason() == null) ? 0 : getRejectReason().hashCode());
        result = prime * result + ((getRejectCode() == null) ? 0 : getRejectCode().hashCode());
        return result;
    }
}