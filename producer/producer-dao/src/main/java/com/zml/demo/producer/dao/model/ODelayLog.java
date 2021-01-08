package com.zml.demo.producer.dao.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ODelayLog implements Serializable {
    private Integer id;

    private String orderId;

    private String delayId;

    private String beforeContent;

    private String afterContent;

    /**
     * 审核 review 编辑付款信息 edit_pay  编辑图片 edit_image
     *
     * @mbg.generated
     */
    private String operateType;

    /**
     * 操作者
     *
     * @mbg.generated
     */
    private String operator;

    /**
     * 操作结果 审核通过review_pass 审核退回review_back 财务退回 finance_back
     *
     * @mbg.generated
     */
    private String operateResult;

    /**
     * 操作字段
     *
     * @mbg.generated
     */
    private String operateField;

    private String remark;

    private LocalDateTime createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getDelayId() {
        return delayId;
    }

    public void setDelayId(String delayId) {
        this.delayId = delayId;
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

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperateResult() {
        return operateResult;
    }

    public void setOperateResult(String operateResult) {
        this.operateResult = operateResult;
    }

    public String getOperateField() {
        return operateField;
    }

    public void setOperateField(String operateField) {
        this.operateField = operateField;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", delayId=").append(delayId);
        sb.append(", beforeContent=").append(beforeContent);
        sb.append(", afterContent=").append(afterContent);
        sb.append(", operateType=").append(operateType);
        sb.append(", operator=").append(operator);
        sb.append(", operateResult=").append(operateResult);
        sb.append(", operateField=").append(operateField);
        sb.append(", remark=").append(remark);
        sb.append(", createTime=").append(createTime);
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
        ODelayLog other = (ODelayLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getDelayId() == null ? other.getDelayId() == null : this.getDelayId().equals(other.getDelayId()))
            && (this.getBeforeContent() == null ? other.getBeforeContent() == null : this.getBeforeContent().equals(other.getBeforeContent()))
            && (this.getAfterContent() == null ? other.getAfterContent() == null : this.getAfterContent().equals(other.getAfterContent()))
            && (this.getOperateType() == null ? other.getOperateType() == null : this.getOperateType().equals(other.getOperateType()))
            && (this.getOperator() == null ? other.getOperator() == null : this.getOperator().equals(other.getOperator()))
            && (this.getOperateResult() == null ? other.getOperateResult() == null : this.getOperateResult().equals(other.getOperateResult()))
            && (this.getOperateField() == null ? other.getOperateField() == null : this.getOperateField().equals(other.getOperateField()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getDelayId() == null) ? 0 : getDelayId().hashCode());
        result = prime * result + ((getBeforeContent() == null) ? 0 : getBeforeContent().hashCode());
        result = prime * result + ((getAfterContent() == null) ? 0 : getAfterContent().hashCode());
        result = prime * result + ((getOperateType() == null) ? 0 : getOperateType().hashCode());
        result = prime * result + ((getOperator() == null) ? 0 : getOperator().hashCode());
        result = prime * result + ((getOperateResult() == null) ? 0 : getOperateResult().hashCode());
        result = prime * result + ((getOperateField() == null) ? 0 : getOperateField().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }
}