package com.zml.demo.producer.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OWithdraw implements Serializable {
    private Integer id;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private LocalDateTime createTime;

    /**
     * 更新时间
     *
     * @mbg.generated
     */
    private LocalDateTime updateTime;

    /**
     * 订单编号
     *
     * @mbg.generated
     */
    private String orderId;

    /**
     * 用户id
     *
     * @mbg.generated
     */
    private String userId;

    /**
     * 用户手机号
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     * 用户银行卡ID
     *
     * @mbg.generated
     */
    private Integer bankCardId;

    /**
     * 打款编号
     *
     * @mbg.generated
     */
    private String withdrawId;

    /**
     * 支付模块对应编号
     *
     * @mbg.generated
     */
    private String paymentId;

    /**
     * 三方流水号(银行流水号）
     *
     * @mbg.generated
     */
    private String thirdOrderId;

    /**
     * 打款金额
     *
     * @mbg.generated
     */
    private BigDecimal withdrawAmount;

    /**
     * 打款时间（支付模块返回）
     *
     * @mbg.generated
     */
    private LocalDateTime withdrawTime;

    /**
     * 放款状态
10初始状态 20待打款 30打款取消 70打款成功 80打款失败
     *
     * @mbg.generated
     */
    private Byte withdrawStatus;

    /**
     * 打款方式 线上online； 线下offline
     *
     * @mbg.generated
     */
    private String withdrawWay;

    /**
     * 打款渠道
     *
     * @mbg.generated
     */
    private String withdrawChannel;

    /**
     * 第三方支付渠道
     *
     * @mbg.generated
     */
    private String withdrawThirdPartyChannel;

    /**
     * 第三方返回支付结果 P处理中 S成功 F失败
     *
     * @mbg.generated
     */
    private String withdrawResult;

    /**
     * 备注
     *
     * @mbg.generated
     */
    private String remark;

    /**
     * 收款银行（冗余字段，来自bank_card）
     *
     * @mbg.generated
     */
    private Integer bankId;

    /**
     * 收款卡号（冗余字段，来自bank_card）
     *
     * @mbg.generated
     */
    private String accountNo;

    /**
     * 收款账户名（冗余字段，来自bank_card）
     *
     * @mbg.generated
     */
    private String accouneName;

    /**
     * 付款方
     *
     * @mbg.generated
     */
    private String payer;

    /**
     * 收款方
     *
     * @mbg.generated
     */
    private String payee;

    /**
     * 操作者
     *
     * @mbg.generated
     */
    private String operator;

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

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getBankCardId() {
        return bankCardId;
    }

    public void setBankCardId(Integer bankCardId) {
        this.bankCardId = bankCardId;
    }

    public String getWithdrawId() {
        return withdrawId;
    }

    public void setWithdrawId(String withdrawId) {
        this.withdrawId = withdrawId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getThirdOrderId() {
        return thirdOrderId;
    }

    public void setThirdOrderId(String thirdOrderId) {
        this.thirdOrderId = thirdOrderId;
    }

    public BigDecimal getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(BigDecimal withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public LocalDateTime getWithdrawTime() {
        return withdrawTime;
    }

    public void setWithdrawTime(LocalDateTime withdrawTime) {
        this.withdrawTime = withdrawTime;
    }

    public Byte getWithdrawStatus() {
        return withdrawStatus;
    }

    public void setWithdrawStatus(Byte withdrawStatus) {
        this.withdrawStatus = withdrawStatus;
    }

    public String getWithdrawWay() {
        return withdrawWay;
    }

    public void setWithdrawWay(String withdrawWay) {
        this.withdrawWay = withdrawWay;
    }

    public String getWithdrawChannel() {
        return withdrawChannel;
    }

    public void setWithdrawChannel(String withdrawChannel) {
        this.withdrawChannel = withdrawChannel;
    }

    public String getWithdrawThirdPartyChannel() {
        return withdrawThirdPartyChannel;
    }

    public void setWithdrawThirdPartyChannel(String withdrawThirdPartyChannel) {
        this.withdrawThirdPartyChannel = withdrawThirdPartyChannel;
    }

    public String getWithdrawResult() {
        return withdrawResult;
    }

    public void setWithdrawResult(String withdrawResult) {
        this.withdrawResult = withdrawResult;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccouneName() {
        return accouneName;
    }

    public void setAccouneName(String accouneName) {
        this.accouneName = accouneName;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", orderId=").append(orderId);
        sb.append(", userId=").append(userId);
        sb.append(", mobile=").append(mobile);
        sb.append(", bankCardId=").append(bankCardId);
        sb.append(", withdrawId=").append(withdrawId);
        sb.append(", paymentId=").append(paymentId);
        sb.append(", thirdOrderId=").append(thirdOrderId);
        sb.append(", withdrawAmount=").append(withdrawAmount);
        sb.append(", withdrawTime=").append(withdrawTime);
        sb.append(", withdrawStatus=").append(withdrawStatus);
        sb.append(", withdrawWay=").append(withdrawWay);
        sb.append(", withdrawChannel=").append(withdrawChannel);
        sb.append(", withdrawThirdPartyChannel=").append(withdrawThirdPartyChannel);
        sb.append(", withdrawResult=").append(withdrawResult);
        sb.append(", remark=").append(remark);
        sb.append(", bankId=").append(bankId);
        sb.append(", accountNo=").append(accountNo);
        sb.append(", accouneName=").append(accouneName);
        sb.append(", payer=").append(payer);
        sb.append(", payee=").append(payee);
        sb.append(", operator=").append(operator);
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
        OWithdraw other = (OWithdraw) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getBankCardId() == null ? other.getBankCardId() == null : this.getBankCardId().equals(other.getBankCardId()))
            && (this.getWithdrawId() == null ? other.getWithdrawId() == null : this.getWithdrawId().equals(other.getWithdrawId()))
            && (this.getPaymentId() == null ? other.getPaymentId() == null : this.getPaymentId().equals(other.getPaymentId()))
            && (this.getThirdOrderId() == null ? other.getThirdOrderId() == null : this.getThirdOrderId().equals(other.getThirdOrderId()))
            && (this.getWithdrawAmount() == null ? other.getWithdrawAmount() == null : this.getWithdrawAmount().equals(other.getWithdrawAmount()))
            && (this.getWithdrawTime() == null ? other.getWithdrawTime() == null : this.getWithdrawTime().equals(other.getWithdrawTime()))
            && (this.getWithdrawStatus() == null ? other.getWithdrawStatus() == null : this.getWithdrawStatus().equals(other.getWithdrawStatus()))
            && (this.getWithdrawWay() == null ? other.getWithdrawWay() == null : this.getWithdrawWay().equals(other.getWithdrawWay()))
            && (this.getWithdrawChannel() == null ? other.getWithdrawChannel() == null : this.getWithdrawChannel().equals(other.getWithdrawChannel()))
            && (this.getWithdrawThirdPartyChannel() == null ? other.getWithdrawThirdPartyChannel() == null : this.getWithdrawThirdPartyChannel().equals(other.getWithdrawThirdPartyChannel()))
            && (this.getWithdrawResult() == null ? other.getWithdrawResult() == null : this.getWithdrawResult().equals(other.getWithdrawResult()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getBankId() == null ? other.getBankId() == null : this.getBankId().equals(other.getBankId()))
            && (this.getAccountNo() == null ? other.getAccountNo() == null : this.getAccountNo().equals(other.getAccountNo()))
            && (this.getAccouneName() == null ? other.getAccouneName() == null : this.getAccouneName().equals(other.getAccouneName()))
            && (this.getPayer() == null ? other.getPayer() == null : this.getPayer().equals(other.getPayer()))
            && (this.getPayee() == null ? other.getPayee() == null : this.getPayee().equals(other.getPayee()))
            && (this.getOperator() == null ? other.getOperator() == null : this.getOperator().equals(other.getOperator()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getBankCardId() == null) ? 0 : getBankCardId().hashCode());
        result = prime * result + ((getWithdrawId() == null) ? 0 : getWithdrawId().hashCode());
        result = prime * result + ((getPaymentId() == null) ? 0 : getPaymentId().hashCode());
        result = prime * result + ((getThirdOrderId() == null) ? 0 : getThirdOrderId().hashCode());
        result = prime * result + ((getWithdrawAmount() == null) ? 0 : getWithdrawAmount().hashCode());
        result = prime * result + ((getWithdrawTime() == null) ? 0 : getWithdrawTime().hashCode());
        result = prime * result + ((getWithdrawStatus() == null) ? 0 : getWithdrawStatus().hashCode());
        result = prime * result + ((getWithdrawWay() == null) ? 0 : getWithdrawWay().hashCode());
        result = prime * result + ((getWithdrawChannel() == null) ? 0 : getWithdrawChannel().hashCode());
        result = prime * result + ((getWithdrawThirdPartyChannel() == null) ? 0 : getWithdrawThirdPartyChannel().hashCode());
        result = prime * result + ((getWithdrawResult() == null) ? 0 : getWithdrawResult().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getBankId() == null) ? 0 : getBankId().hashCode());
        result = prime * result + ((getAccountNo() == null) ? 0 : getAccountNo().hashCode());
        result = prime * result + ((getAccouneName() == null) ? 0 : getAccouneName().hashCode());
        result = prime * result + ((getPayer() == null) ? 0 : getPayer().hashCode());
        result = prime * result + ((getPayee() == null) ? 0 : getPayee().hashCode());
        result = prime * result + ((getOperator() == null) ? 0 : getOperator().hashCode());
        return result;
    }
}