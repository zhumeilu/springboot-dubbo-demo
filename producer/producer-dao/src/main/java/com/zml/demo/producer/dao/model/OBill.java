package com.zml.demo.producer.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OBill implements Serializable {
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
     * 用户id
     *
     * @mbg.generated
     */
    private String userId;

    /**
     * 账单ID
     *
     * @mbg.generated
     */
    private String billId;

    /**
     * 订单编号
     *
     * @mbg.generated
     */
    private String orderId;

    /**
     * 业务ID
     *
     * @mbg.generated
     */
    private String bizOrderId;

    /**
     * 支付模块对应编号
     *
     * @mbg.generated
     */
    private String paymentId;

    /**
     * 三方流水号（银行流水号）
     *
     * @mbg.generated
     */
    private String thirdOrderId;

    /**
     * 交易金额
     *
     * @mbg.generated
     */
    private BigDecimal tradeAmount;

    /**
     * 交易创建时间
     *
     * @mbg.generated
     */
    private LocalDateTime tradeCreateTime;

    /**
     * 交易结束时间
     *
     * @mbg.generated
     */
    private LocalDateTime tradeOverTime;

    /**
     * 资金流向 1入账 2出账
     *
     * @mbg.generated
     */
    private Byte flowType;

    /**
     * 交易方式 线上online； 线下offline；
     *
     * @mbg.generated
     */
    private String payWay;

    /**
     * 交易类型 1二维码收款,2 银行卡转账,3 平台代扣
     *
     * @mbg.generated
     */
    private Byte payType;

    /**
     * 支付渠道（对应支付模块waycode）
     *
     * @mbg.generated
     */
    private String payChannel;

    /**
     * 第三方支付渠道（对应支付模块具体银行）
     *
     * @mbg.generated
     */
    private String payThirdPartyChannel;

    /**
     * 业务类型 1还款 2 打款 5 信用报告 6 展期
     *
     * @mbg.generated
     */
    private Byte bizType;

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
     * 线下还款银行
     *
     * @mbg.generated
     */
    private Integer bankId;

    /**
     * 线下还款银行卡
     *
     * @mbg.generated
     */
    private String bankBranch;

    /**
     * 线下还款银行卡
     *
     * @mbg.generated
     */
    private String accountNo;

    /**
     * 线下还款银行卡
     *
     * @mbg.generated
     */
    private String bankCardFirstNameTh;

    /**
     * 线下还款银行卡
     *
     * @mbg.generated
     */
    private String bankCardLastNameTh;

    /**
     * 线下还款银行卡
     *
     * @mbg.generated
     */
    private String bankCardFirstNameEn;

    /**
     * 线下还款银行卡
     *
     * @mbg.generated
     */
    private String bankCardLastNameEn;

    /**
     * 备注
     *
     * @mbg.generated
     */
    private String remark;

    /**
     * 数据类型 1 真 0 假
     *
     * @mbg.generated
     */
    private Boolean dataType;

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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getBizOrderId() {
        return bizOrderId;
    }

    public void setBizOrderId(String bizOrderId) {
        this.bizOrderId = bizOrderId;
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

    public BigDecimal getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(BigDecimal tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public LocalDateTime getTradeCreateTime() {
        return tradeCreateTime;
    }

    public void setTradeCreateTime(LocalDateTime tradeCreateTime) {
        this.tradeCreateTime = tradeCreateTime;
    }

    public LocalDateTime getTradeOverTime() {
        return tradeOverTime;
    }

    public void setTradeOverTime(LocalDateTime tradeOverTime) {
        this.tradeOverTime = tradeOverTime;
    }

    public Byte getFlowType() {
        return flowType;
    }

    public void setFlowType(Byte flowType) {
        this.flowType = flowType;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public Byte getPayType() {
        return payType;
    }

    public void setPayType(Byte payType) {
        this.payType = payType;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public String getPayThirdPartyChannel() {
        return payThirdPartyChannel;
    }

    public void setPayThirdPartyChannel(String payThirdPartyChannel) {
        this.payThirdPartyChannel = payThirdPartyChannel;
    }

    public Byte getBizType() {
        return bizType;
    }

    public void setBizType(Byte bizType) {
        this.bizType = bizType;
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

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public String getBankBranch() {
        return bankBranch;
    }

    public void setBankBranch(String bankBranch) {
        this.bankBranch = bankBranch;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getBankCardFirstNameTh() {
        return bankCardFirstNameTh;
    }

    public void setBankCardFirstNameTh(String bankCardFirstNameTh) {
        this.bankCardFirstNameTh = bankCardFirstNameTh;
    }

    public String getBankCardLastNameTh() {
        return bankCardLastNameTh;
    }

    public void setBankCardLastNameTh(String bankCardLastNameTh) {
        this.bankCardLastNameTh = bankCardLastNameTh;
    }

    public String getBankCardFirstNameEn() {
        return bankCardFirstNameEn;
    }

    public void setBankCardFirstNameEn(String bankCardFirstNameEn) {
        this.bankCardFirstNameEn = bankCardFirstNameEn;
    }

    public String getBankCardLastNameEn() {
        return bankCardLastNameEn;
    }

    public void setBankCardLastNameEn(String bankCardLastNameEn) {
        this.bankCardLastNameEn = bankCardLastNameEn;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Boolean getDataType() {
        return dataType;
    }

    public void setDataType(Boolean dataType) {
        this.dataType = dataType;
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
        sb.append(", userId=").append(userId);
        sb.append(", billId=").append(billId);
        sb.append(", orderId=").append(orderId);
        sb.append(", bizOrderId=").append(bizOrderId);
        sb.append(", paymentId=").append(paymentId);
        sb.append(", thirdOrderId=").append(thirdOrderId);
        sb.append(", tradeAmount=").append(tradeAmount);
        sb.append(", tradeCreateTime=").append(tradeCreateTime);
        sb.append(", tradeOverTime=").append(tradeOverTime);
        sb.append(", flowType=").append(flowType);
        sb.append(", payWay=").append(payWay);
        sb.append(", payType=").append(payType);
        sb.append(", payChannel=").append(payChannel);
        sb.append(", payThirdPartyChannel=").append(payThirdPartyChannel);
        sb.append(", bizType=").append(bizType);
        sb.append(", payer=").append(payer);
        sb.append(", payee=").append(payee);
        sb.append(", bankId=").append(bankId);
        sb.append(", bankBranch=").append(bankBranch);
        sb.append(", accountNo=").append(accountNo);
        sb.append(", bankCardFirstNameTh=").append(bankCardFirstNameTh);
        sb.append(", bankCardLastNameTh=").append(bankCardLastNameTh);
        sb.append(", bankCardFirstNameEn=").append(bankCardFirstNameEn);
        sb.append(", bankCardLastNameEn=").append(bankCardLastNameEn);
        sb.append(", remark=").append(remark);
        sb.append(", dataType=").append(dataType);
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
        OBill other = (OBill) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getBillId() == null ? other.getBillId() == null : this.getBillId().equals(other.getBillId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getBizOrderId() == null ? other.getBizOrderId() == null : this.getBizOrderId().equals(other.getBizOrderId()))
            && (this.getPaymentId() == null ? other.getPaymentId() == null : this.getPaymentId().equals(other.getPaymentId()))
            && (this.getThirdOrderId() == null ? other.getThirdOrderId() == null : this.getThirdOrderId().equals(other.getThirdOrderId()))
            && (this.getTradeAmount() == null ? other.getTradeAmount() == null : this.getTradeAmount().equals(other.getTradeAmount()))
            && (this.getTradeCreateTime() == null ? other.getTradeCreateTime() == null : this.getTradeCreateTime().equals(other.getTradeCreateTime()))
            && (this.getTradeOverTime() == null ? other.getTradeOverTime() == null : this.getTradeOverTime().equals(other.getTradeOverTime()))
            && (this.getFlowType() == null ? other.getFlowType() == null : this.getFlowType().equals(other.getFlowType()))
            && (this.getPayWay() == null ? other.getPayWay() == null : this.getPayWay().equals(other.getPayWay()))
            && (this.getPayType() == null ? other.getPayType() == null : this.getPayType().equals(other.getPayType()))
            && (this.getPayChannel() == null ? other.getPayChannel() == null : this.getPayChannel().equals(other.getPayChannel()))
            && (this.getPayThirdPartyChannel() == null ? other.getPayThirdPartyChannel() == null : this.getPayThirdPartyChannel().equals(other.getPayThirdPartyChannel()))
            && (this.getBizType() == null ? other.getBizType() == null : this.getBizType().equals(other.getBizType()))
            && (this.getPayer() == null ? other.getPayer() == null : this.getPayer().equals(other.getPayer()))
            && (this.getPayee() == null ? other.getPayee() == null : this.getPayee().equals(other.getPayee()))
            && (this.getBankId() == null ? other.getBankId() == null : this.getBankId().equals(other.getBankId()))
            && (this.getBankBranch() == null ? other.getBankBranch() == null : this.getBankBranch().equals(other.getBankBranch()))
            && (this.getAccountNo() == null ? other.getAccountNo() == null : this.getAccountNo().equals(other.getAccountNo()))
            && (this.getBankCardFirstNameTh() == null ? other.getBankCardFirstNameTh() == null : this.getBankCardFirstNameTh().equals(other.getBankCardFirstNameTh()))
            && (this.getBankCardLastNameTh() == null ? other.getBankCardLastNameTh() == null : this.getBankCardLastNameTh().equals(other.getBankCardLastNameTh()))
            && (this.getBankCardFirstNameEn() == null ? other.getBankCardFirstNameEn() == null : this.getBankCardFirstNameEn().equals(other.getBankCardFirstNameEn()))
            && (this.getBankCardLastNameEn() == null ? other.getBankCardLastNameEn() == null : this.getBankCardLastNameEn().equals(other.getBankCardLastNameEn()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getDataType() == null ? other.getDataType() == null : this.getDataType().equals(other.getDataType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getBillId() == null) ? 0 : getBillId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getBizOrderId() == null) ? 0 : getBizOrderId().hashCode());
        result = prime * result + ((getPaymentId() == null) ? 0 : getPaymentId().hashCode());
        result = prime * result + ((getThirdOrderId() == null) ? 0 : getThirdOrderId().hashCode());
        result = prime * result + ((getTradeAmount() == null) ? 0 : getTradeAmount().hashCode());
        result = prime * result + ((getTradeCreateTime() == null) ? 0 : getTradeCreateTime().hashCode());
        result = prime * result + ((getTradeOverTime() == null) ? 0 : getTradeOverTime().hashCode());
        result = prime * result + ((getFlowType() == null) ? 0 : getFlowType().hashCode());
        result = prime * result + ((getPayWay() == null) ? 0 : getPayWay().hashCode());
        result = prime * result + ((getPayType() == null) ? 0 : getPayType().hashCode());
        result = prime * result + ((getPayChannel() == null) ? 0 : getPayChannel().hashCode());
        result = prime * result + ((getPayThirdPartyChannel() == null) ? 0 : getPayThirdPartyChannel().hashCode());
        result = prime * result + ((getBizType() == null) ? 0 : getBizType().hashCode());
        result = prime * result + ((getPayer() == null) ? 0 : getPayer().hashCode());
        result = prime * result + ((getPayee() == null) ? 0 : getPayee().hashCode());
        result = prime * result + ((getBankId() == null) ? 0 : getBankId().hashCode());
        result = prime * result + ((getBankBranch() == null) ? 0 : getBankBranch().hashCode());
        result = prime * result + ((getAccountNo() == null) ? 0 : getAccountNo().hashCode());
        result = prime * result + ((getBankCardFirstNameTh() == null) ? 0 : getBankCardFirstNameTh().hashCode());
        result = prime * result + ((getBankCardLastNameTh() == null) ? 0 : getBankCardLastNameTh().hashCode());
        result = prime * result + ((getBankCardFirstNameEn() == null) ? 0 : getBankCardFirstNameEn().hashCode());
        result = prime * result + ((getBankCardLastNameEn() == null) ? 0 : getBankCardLastNameEn().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getDataType() == null) ? 0 : getDataType().hashCode());
        return result;
    }
}