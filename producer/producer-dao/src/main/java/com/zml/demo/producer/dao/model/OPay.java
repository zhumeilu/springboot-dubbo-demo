package com.zml.demo.producer.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class OPay implements Serializable {
    private Integer id;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    /**
     * 收款ID
     *
     * @mbg.generated
     */
    private String payId;

    private String userId;

    /**
     * 借款订单ID
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
     * 三方流水号
     *
     * @mbg.generated
     */
    private String thirdOrderId;

    /**
     * 客户账号
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     * 应还日期
     *
     * @mbg.generated
     */
    private LocalDate shouldReturnDate;

    private String payProofUrl;

    /**
     * 业务类型 1 信用报告；2 还款；3 展期；
     *
     * @mbg.generated
     */
    private Byte bizType;

    private String payer;

    private String payee;

    /**
     * 线下还款银行
     *
     * @mbg.generated
     */
    private Integer bankId;

    private String bankName;

    private String bankBranch;

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
     * 状态 20待处理 70 收款成功  80收款失败
     *
     * @mbg.generated
     */
    private Byte status;

    /**
     * 实际付款时间
     *
     * @mbg.generated
     */
    private LocalDateTime payTime;

    /**
     * 用户付款时间
     *
     * @mbg.generated
     */
    private LocalDateTime userPayTime;

    /**
     * 支付金额
     *
     * @mbg.generated
     */
    private BigDecimal payAmount;

    /**
     * 用户申请支付时间
     *
     * @mbg.generated
     */
    private LocalDateTime applyTime;

    /**
     * 操作者
     *
     * @mbg.generated
     */
    private String operator;

    /**
     * 打款时间
     *
     * @mbg.generated
     */
    private LocalDateTime withdrawTime;

    /**
     * 平台收款银行信息
     *
     * @mbg.generated
     */
    private String companyBankName;

    /**
     * 平台收款银行信息
     *
     * @mbg.generated
     */
    private String companyAccountNo;

    /**
     * 平台收款银行信息
     *
     * @mbg.generated
     */
    private String companyName;

    /**
     * 平台收款银行信息
     *
     * @mbg.generated
     */
    private String companyBankBranch;

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

    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getThirdOrderId() {
        return thirdOrderId;
    }

    public void setThirdOrderId(String thirdOrderId) {
        this.thirdOrderId = thirdOrderId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public LocalDate getShouldReturnDate() {
        return shouldReturnDate;
    }

    public void setShouldReturnDate(LocalDate shouldReturnDate) {
        this.shouldReturnDate = shouldReturnDate;
    }

    public String getPayProofUrl() {
        return payProofUrl;
    }

    public void setPayProofUrl(String payProofUrl) {
        this.payProofUrl = payProofUrl;
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

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
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

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public LocalDateTime getPayTime() {
        return payTime;
    }

    public void setPayTime(LocalDateTime payTime) {
        this.payTime = payTime;
    }

    public LocalDateTime getUserPayTime() {
        return userPayTime;
    }

    public void setUserPayTime(LocalDateTime userPayTime) {
        this.userPayTime = userPayTime;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public LocalDateTime getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(LocalDateTime applyTime) {
        this.applyTime = applyTime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public LocalDateTime getWithdrawTime() {
        return withdrawTime;
    }

    public void setWithdrawTime(LocalDateTime withdrawTime) {
        this.withdrawTime = withdrawTime;
    }

    public String getCompanyBankName() {
        return companyBankName;
    }

    public void setCompanyBankName(String companyBankName) {
        this.companyBankName = companyBankName;
    }

    public String getCompanyAccountNo() {
        return companyAccountNo;
    }

    public void setCompanyAccountNo(String companyAccountNo) {
        this.companyAccountNo = companyAccountNo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyBankBranch() {
        return companyBankBranch;
    }

    public void setCompanyBankBranch(String companyBankBranch) {
        this.companyBankBranch = companyBankBranch;
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
        sb.append(", payId=").append(payId);
        sb.append(", userId=").append(userId);
        sb.append(", orderId=").append(orderId);
        sb.append(", bizOrderId=").append(bizOrderId);
        sb.append(", thirdOrderId=").append(thirdOrderId);
        sb.append(", mobile=").append(mobile);
        sb.append(", shouldReturnDate=").append(shouldReturnDate);
        sb.append(", payProofUrl=").append(payProofUrl);
        sb.append(", bizType=").append(bizType);
        sb.append(", payer=").append(payer);
        sb.append(", payee=").append(payee);
        sb.append(", bankId=").append(bankId);
        sb.append(", bankName=").append(bankName);
        sb.append(", bankBranch=").append(bankBranch);
        sb.append(", accountNo=").append(accountNo);
        sb.append(", bankCardFirstNameTh=").append(bankCardFirstNameTh);
        sb.append(", bankCardLastNameTh=").append(bankCardLastNameTh);
        sb.append(", bankCardFirstNameEn=").append(bankCardFirstNameEn);
        sb.append(", bankCardLastNameEn=").append(bankCardLastNameEn);
        sb.append(", status=").append(status);
        sb.append(", payTime=").append(payTime);
        sb.append(", userPayTime=").append(userPayTime);
        sb.append(", payAmount=").append(payAmount);
        sb.append(", applyTime=").append(applyTime);
        sb.append(", operator=").append(operator);
        sb.append(", withdrawTime=").append(withdrawTime);
        sb.append(", companyBankName=").append(companyBankName);
        sb.append(", companyAccountNo=").append(companyAccountNo);
        sb.append(", companyName=").append(companyName);
        sb.append(", companyBankBranch=").append(companyBankBranch);
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
        OPay other = (OPay) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getPayId() == null ? other.getPayId() == null : this.getPayId().equals(other.getPayId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getBizOrderId() == null ? other.getBizOrderId() == null : this.getBizOrderId().equals(other.getBizOrderId()))
            && (this.getThirdOrderId() == null ? other.getThirdOrderId() == null : this.getThirdOrderId().equals(other.getThirdOrderId()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getShouldReturnDate() == null ? other.getShouldReturnDate() == null : this.getShouldReturnDate().equals(other.getShouldReturnDate()))
            && (this.getPayProofUrl() == null ? other.getPayProofUrl() == null : this.getPayProofUrl().equals(other.getPayProofUrl()))
            && (this.getBizType() == null ? other.getBizType() == null : this.getBizType().equals(other.getBizType()))
            && (this.getPayer() == null ? other.getPayer() == null : this.getPayer().equals(other.getPayer()))
            && (this.getPayee() == null ? other.getPayee() == null : this.getPayee().equals(other.getPayee()))
            && (this.getBankId() == null ? other.getBankId() == null : this.getBankId().equals(other.getBankId()))
            && (this.getBankName() == null ? other.getBankName() == null : this.getBankName().equals(other.getBankName()))
            && (this.getBankBranch() == null ? other.getBankBranch() == null : this.getBankBranch().equals(other.getBankBranch()))
            && (this.getAccountNo() == null ? other.getAccountNo() == null : this.getAccountNo().equals(other.getAccountNo()))
            && (this.getBankCardFirstNameTh() == null ? other.getBankCardFirstNameTh() == null : this.getBankCardFirstNameTh().equals(other.getBankCardFirstNameTh()))
            && (this.getBankCardLastNameTh() == null ? other.getBankCardLastNameTh() == null : this.getBankCardLastNameTh().equals(other.getBankCardLastNameTh()))
            && (this.getBankCardFirstNameEn() == null ? other.getBankCardFirstNameEn() == null : this.getBankCardFirstNameEn().equals(other.getBankCardFirstNameEn()))
            && (this.getBankCardLastNameEn() == null ? other.getBankCardLastNameEn() == null : this.getBankCardLastNameEn().equals(other.getBankCardLastNameEn()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getPayTime() == null ? other.getPayTime() == null : this.getPayTime().equals(other.getPayTime()))
            && (this.getUserPayTime() == null ? other.getUserPayTime() == null : this.getUserPayTime().equals(other.getUserPayTime()))
            && (this.getPayAmount() == null ? other.getPayAmount() == null : this.getPayAmount().equals(other.getPayAmount()))
            && (this.getApplyTime() == null ? other.getApplyTime() == null : this.getApplyTime().equals(other.getApplyTime()))
            && (this.getOperator() == null ? other.getOperator() == null : this.getOperator().equals(other.getOperator()))
            && (this.getWithdrawTime() == null ? other.getWithdrawTime() == null : this.getWithdrawTime().equals(other.getWithdrawTime()))
            && (this.getCompanyBankName() == null ? other.getCompanyBankName() == null : this.getCompanyBankName().equals(other.getCompanyBankName()))
            && (this.getCompanyAccountNo() == null ? other.getCompanyAccountNo() == null : this.getCompanyAccountNo().equals(other.getCompanyAccountNo()))
            && (this.getCompanyName() == null ? other.getCompanyName() == null : this.getCompanyName().equals(other.getCompanyName()))
            && (this.getCompanyBankBranch() == null ? other.getCompanyBankBranch() == null : this.getCompanyBankBranch().equals(other.getCompanyBankBranch()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getPayId() == null) ? 0 : getPayId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getBizOrderId() == null) ? 0 : getBizOrderId().hashCode());
        result = prime * result + ((getThirdOrderId() == null) ? 0 : getThirdOrderId().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getShouldReturnDate() == null) ? 0 : getShouldReturnDate().hashCode());
        result = prime * result + ((getPayProofUrl() == null) ? 0 : getPayProofUrl().hashCode());
        result = prime * result + ((getBizType() == null) ? 0 : getBizType().hashCode());
        result = prime * result + ((getPayer() == null) ? 0 : getPayer().hashCode());
        result = prime * result + ((getPayee() == null) ? 0 : getPayee().hashCode());
        result = prime * result + ((getBankId() == null) ? 0 : getBankId().hashCode());
        result = prime * result + ((getBankName() == null) ? 0 : getBankName().hashCode());
        result = prime * result + ((getBankBranch() == null) ? 0 : getBankBranch().hashCode());
        result = prime * result + ((getAccountNo() == null) ? 0 : getAccountNo().hashCode());
        result = prime * result + ((getBankCardFirstNameTh() == null) ? 0 : getBankCardFirstNameTh().hashCode());
        result = prime * result + ((getBankCardLastNameTh() == null) ? 0 : getBankCardLastNameTh().hashCode());
        result = prime * result + ((getBankCardFirstNameEn() == null) ? 0 : getBankCardFirstNameEn().hashCode());
        result = prime * result + ((getBankCardLastNameEn() == null) ? 0 : getBankCardLastNameEn().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getPayTime() == null) ? 0 : getPayTime().hashCode());
        result = prime * result + ((getUserPayTime() == null) ? 0 : getUserPayTime().hashCode());
        result = prime * result + ((getPayAmount() == null) ? 0 : getPayAmount().hashCode());
        result = prime * result + ((getApplyTime() == null) ? 0 : getApplyTime().hashCode());
        result = prime * result + ((getOperator() == null) ? 0 : getOperator().hashCode());
        result = prime * result + ((getWithdrawTime() == null) ? 0 : getWithdrawTime().hashCode());
        result = prime * result + ((getCompanyBankName() == null) ? 0 : getCompanyBankName().hashCode());
        result = prime * result + ((getCompanyAccountNo() == null) ? 0 : getCompanyAccountNo().hashCode());
        result = prime * result + ((getCompanyName() == null) ? 0 : getCompanyName().hashCode());
        result = prime * result + ((getCompanyBankBranch() == null) ? 0 : getCompanyBankBranch().hashCode());
        return result;
    }
}