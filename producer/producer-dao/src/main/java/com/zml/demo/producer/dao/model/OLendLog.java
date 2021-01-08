package com.zml.demo.producer.dao.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class OLendLog implements Serializable {
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
     * 操作类型 create 创建; report 信用报告; review 审核;withdraw 打款;repay 还款; edit_user 编辑用户信息;edit_bank_card 编辑银行卡;
     *
     * @mbg.generated
     */
    private String operateType;

    /**
     * 操作结果 create 创建订单;
extfee_wait_pay 信用报告待支付
extfee_pay_success 信用报告支付成功
machine_review_pass 机审通过；machine_review_reject 机审拒绝； first_review_wait_allot 初审待分配；
first_reviewing 初审中；
bank_review_pass 银行审核通过;
bank_review_reject 银行审核拒绝;
pause 挂单;
first_review_reject 初审拒绝;
first_review_pass 初审通过; 
last_review_wait_allot 终审待分配；
last_reviewing 终审中；
last_review_reject 终审拒绝；
last_review_pass 终审通过；
last_review_back 终审退单；
withdraw_success;财务打款成功
finance_back 财务退单；
repay_success 还款成功;overdue 逾期;
     *
     * @mbg.generated
     */
    private String operateResult;

    /**
     * 操作字段(修改字段时不为空) operate_type为edit_user,edit_bank_card时存在
     *
     * @mbg.generated
     */
    private String operateField;

    /**
     * 编辑前内容(字段修改时不为空)
     *
     * @mbg.generated
     */
    private String beforeContent;

    /**
     * 编辑后内容(字段修改时不为空)
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

    public String getOperateField() {
        return operateField;
    }

    public void setOperateField(String operateField) {
        this.operateField = operateField;
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
        sb.append(", operateField=").append(operateField);
        sb.append(", beforeContent=").append(beforeContent);
        sb.append(", afterContent=").append(afterContent);
        sb.append(", remark=").append(remark);
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
        OLendLog other = (OLendLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getOperator() == null ? other.getOperator() == null : this.getOperator().equals(other.getOperator()))
            && (this.getOperateType() == null ? other.getOperateType() == null : this.getOperateType().equals(other.getOperateType()))
            && (this.getOperateResult() == null ? other.getOperateResult() == null : this.getOperateResult().equals(other.getOperateResult()))
            && (this.getOperateField() == null ? other.getOperateField() == null : this.getOperateField().equals(other.getOperateField()))
            && (this.getBeforeContent() == null ? other.getBeforeContent() == null : this.getBeforeContent().equals(other.getBeforeContent()))
            && (this.getAfterContent() == null ? other.getAfterContent() == null : this.getAfterContent().equals(other.getAfterContent()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()));
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
        result = prime * result + ((getOperateField() == null) ? 0 : getOperateField().hashCode());
        result = prime * result + ((getBeforeContent() == null) ? 0 : getBeforeContent().hashCode());
        result = prime * result + ((getAfterContent() == null) ? 0 : getAfterContent().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        return result;
    }
}