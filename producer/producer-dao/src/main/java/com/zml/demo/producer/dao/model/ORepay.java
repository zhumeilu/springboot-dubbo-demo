package com.zml.demo.producer.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ORepay implements Serializable {
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
     * 订单编号
     *
     * @mbg.generated
     */
    private String orderId;

    /**
     * 还款编号
     *
     * @mbg.generated
     */
    private String repayOrderId;

    /**
     * 用户账号(手机号)
     *
     * @mbg.generated
     */
    private String mobile;

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
     * 还款金额
     *
     * @mbg.generated
     */
    private BigDecimal repayAmount;

    /**
     * 还款时间
     *
     * @mbg.generated
     */
    private LocalDateTime repayTime;

    /**
     * 确认时间(财务确认/三方确认)
     *
     * @mbg.generated
     */
    private LocalDateTime confirmTime;

    /**
     * 10 初始化 20等待用户上传 30用户上传成功,待审核   40催收退回  50 提交财务，待财务审核  70财务审核通过  80 财务退回
     *
     * @mbg.generated
     */
    private Byte reviewStatus;

    /**
     * 还款状态
10初始状态
20待还款
30还款取消
70还款成功
80还款失败
     *
     * @mbg.generated
     */
    private Byte repayStatus;

    /**
     * 还款方式 线上online； 线下offline（线下同一个借款订单只能有一个还款订单）；
     *
     * @mbg.generated
     */
    private String repayWay;

    /**
     * 还款渠道（对应支付模块waycode）
     *
     * @mbg.generated
     */
    private String repayChannel;

    /**
     * 第三方支付渠道（对应支付模块具体银行）
     *
     * @mbg.generated
     */
    private String repayThirdPartyChannel;

    /**
     * 支付模块返回支付结果FPS
     *
     * @mbg.generated
     */
    private String repayResult;

    /**
     * 用户上传支付凭证
     *
     * @mbg.generated
     */
    private String payProofUrl;

    /**
     * 用户上传凭证状态 0待上传  1上传成功
     *
     * @mbg.generated
     */
    private Byte payProofStatus;

    /**
     * 上传凭证时间
     *
     * @mbg.generated
     */
    private LocalDateTime uploadTime;

    /**
     * 备注
     *
     * @mbg.generated
     */
    private String remark;

    private BigDecimal userRepayAmount;

    /**
     * 用户输入还款时间
     *
     * @mbg.generated
     */
    private LocalDateTime userRepayTime;

    /**
     * 还款类型：1-还款，2-平账
     *
     * @mbg.generated
     */
    private Byte repayType;

    /**
     * 二维码
     *
     * @mbg.generated
     */
    private String qrCode;

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
     * 还款来源 1 用户发起  2 平台发起
     *
     * @mbg.generated
     */
    private Byte repaySource;

    /**
     * 线下还款银行
     *
     * @mbg.generated
     */
    private Integer bankId;

    private String bankName;

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
     * 后台发起还款备注
     *
     * @mbg.generated
     */
    private String systemRemark;

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

    /**
     * 二维码（图片源）
     *
     * @mbg.generated
     */
    private String qrCodeData;

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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getRepayOrderId() {
        return repayOrderId;
    }

    public void setRepayOrderId(String repayOrderId) {
        this.repayOrderId = repayOrderId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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

    public BigDecimal getRepayAmount() {
        return repayAmount;
    }

    public void setRepayAmount(BigDecimal repayAmount) {
        this.repayAmount = repayAmount;
    }

    public LocalDateTime getRepayTime() {
        return repayTime;
    }

    public void setRepayTime(LocalDateTime repayTime) {
        this.repayTime = repayTime;
    }

    public LocalDateTime getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(LocalDateTime confirmTime) {
        this.confirmTime = confirmTime;
    }

    public Byte getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(Byte reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public Byte getRepayStatus() {
        return repayStatus;
    }

    public void setRepayStatus(Byte repayStatus) {
        this.repayStatus = repayStatus;
    }

    public String getRepayWay() {
        return repayWay;
    }

    public void setRepayWay(String repayWay) {
        this.repayWay = repayWay;
    }

    public String getRepayChannel() {
        return repayChannel;
    }

    public void setRepayChannel(String repayChannel) {
        this.repayChannel = repayChannel;
    }

    public String getRepayThirdPartyChannel() {
        return repayThirdPartyChannel;
    }

    public void setRepayThirdPartyChannel(String repayThirdPartyChannel) {
        this.repayThirdPartyChannel = repayThirdPartyChannel;
    }

    public String getRepayResult() {
        return repayResult;
    }

    public void setRepayResult(String repayResult) {
        this.repayResult = repayResult;
    }

    public String getPayProofUrl() {
        return payProofUrl;
    }

    public void setPayProofUrl(String payProofUrl) {
        this.payProofUrl = payProofUrl;
    }

    public Byte getPayProofStatus() {
        return payProofStatus;
    }

    public void setPayProofStatus(Byte payProofStatus) {
        this.payProofStatus = payProofStatus;
    }

    public LocalDateTime getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(LocalDateTime uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BigDecimal getUserRepayAmount() {
        return userRepayAmount;
    }

    public void setUserRepayAmount(BigDecimal userRepayAmount) {
        this.userRepayAmount = userRepayAmount;
    }

    public LocalDateTime getUserRepayTime() {
        return userRepayTime;
    }

    public void setUserRepayTime(LocalDateTime userRepayTime) {
        this.userRepayTime = userRepayTime;
    }

    public Byte getRepayType() {
        return repayType;
    }

    public void setRepayType(Byte repayType) {
        this.repayType = repayType;
    }

    public String getQrCode() {
        return qrCode;
    }

    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
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

    public Byte getRepaySource() {
        return repaySource;
    }

    public void setRepaySource(Byte repaySource) {
        this.repaySource = repaySource;
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

    public String getSystemRemark() {
        return systemRemark;
    }

    public void setSystemRemark(String systemRemark) {
        this.systemRemark = systemRemark;
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

    public String getQrCodeData() {
        return qrCodeData;
    }

    public void setQrCodeData(String qrCodeData) {
        this.qrCodeData = qrCodeData;
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
        sb.append(", orderId=").append(orderId);
        sb.append(", repayOrderId=").append(repayOrderId);
        sb.append(", mobile=").append(mobile);
        sb.append(", paymentId=").append(paymentId);
        sb.append(", thirdOrderId=").append(thirdOrderId);
        sb.append(", repayAmount=").append(repayAmount);
        sb.append(", repayTime=").append(repayTime);
        sb.append(", confirmTime=").append(confirmTime);
        sb.append(", reviewStatus=").append(reviewStatus);
        sb.append(", repayStatus=").append(repayStatus);
        sb.append(", repayWay=").append(repayWay);
        sb.append(", repayChannel=").append(repayChannel);
        sb.append(", repayThirdPartyChannel=").append(repayThirdPartyChannel);
        sb.append(", repayResult=").append(repayResult);
        sb.append(", payProofUrl=").append(payProofUrl);
        sb.append(", payProofStatus=").append(payProofStatus);
        sb.append(", uploadTime=").append(uploadTime);
        sb.append(", remark=").append(remark);
        sb.append(", userRepayAmount=").append(userRepayAmount);
        sb.append(", userRepayTime=").append(userRepayTime);
        sb.append(", repayType=").append(repayType);
        sb.append(", qrCode=").append(qrCode);
        sb.append(", payer=").append(payer);
        sb.append(", payee=").append(payee);
        sb.append(", repaySource=").append(repaySource);
        sb.append(", bankId=").append(bankId);
        sb.append(", bankName=").append(bankName);
        sb.append(", bankBranch=").append(bankBranch);
        sb.append(", accountNo=").append(accountNo);
        sb.append(", bankCardFirstNameTh=").append(bankCardFirstNameTh);
        sb.append(", bankCardLastNameTh=").append(bankCardLastNameTh);
        sb.append(", bankCardFirstNameEn=").append(bankCardFirstNameEn);
        sb.append(", bankCardLastNameEn=").append(bankCardLastNameEn);
        sb.append(", systemRemark=").append(systemRemark);
        sb.append(", companyBankName=").append(companyBankName);
        sb.append(", companyAccountNo=").append(companyAccountNo);
        sb.append(", companyName=").append(companyName);
        sb.append(", companyBankBranch=").append(companyBankBranch);
        sb.append(", qrCodeData=").append(qrCodeData);
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
        ORepay other = (ORepay) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getRepayOrderId() == null ? other.getRepayOrderId() == null : this.getRepayOrderId().equals(other.getRepayOrderId()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getPaymentId() == null ? other.getPaymentId() == null : this.getPaymentId().equals(other.getPaymentId()))
            && (this.getThirdOrderId() == null ? other.getThirdOrderId() == null : this.getThirdOrderId().equals(other.getThirdOrderId()))
            && (this.getRepayAmount() == null ? other.getRepayAmount() == null : this.getRepayAmount().equals(other.getRepayAmount()))
            && (this.getRepayTime() == null ? other.getRepayTime() == null : this.getRepayTime().equals(other.getRepayTime()))
            && (this.getConfirmTime() == null ? other.getConfirmTime() == null : this.getConfirmTime().equals(other.getConfirmTime()))
            && (this.getReviewStatus() == null ? other.getReviewStatus() == null : this.getReviewStatus().equals(other.getReviewStatus()))
            && (this.getRepayStatus() == null ? other.getRepayStatus() == null : this.getRepayStatus().equals(other.getRepayStatus()))
            && (this.getRepayWay() == null ? other.getRepayWay() == null : this.getRepayWay().equals(other.getRepayWay()))
            && (this.getRepayChannel() == null ? other.getRepayChannel() == null : this.getRepayChannel().equals(other.getRepayChannel()))
            && (this.getRepayThirdPartyChannel() == null ? other.getRepayThirdPartyChannel() == null : this.getRepayThirdPartyChannel().equals(other.getRepayThirdPartyChannel()))
            && (this.getRepayResult() == null ? other.getRepayResult() == null : this.getRepayResult().equals(other.getRepayResult()))
            && (this.getPayProofUrl() == null ? other.getPayProofUrl() == null : this.getPayProofUrl().equals(other.getPayProofUrl()))
            && (this.getPayProofStatus() == null ? other.getPayProofStatus() == null : this.getPayProofStatus().equals(other.getPayProofStatus()))
            && (this.getUploadTime() == null ? other.getUploadTime() == null : this.getUploadTime().equals(other.getUploadTime()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getUserRepayAmount() == null ? other.getUserRepayAmount() == null : this.getUserRepayAmount().equals(other.getUserRepayAmount()))
            && (this.getUserRepayTime() == null ? other.getUserRepayTime() == null : this.getUserRepayTime().equals(other.getUserRepayTime()))
            && (this.getRepayType() == null ? other.getRepayType() == null : this.getRepayType().equals(other.getRepayType()))
            && (this.getQrCode() == null ? other.getQrCode() == null : this.getQrCode().equals(other.getQrCode()))
            && (this.getPayer() == null ? other.getPayer() == null : this.getPayer().equals(other.getPayer()))
            && (this.getPayee() == null ? other.getPayee() == null : this.getPayee().equals(other.getPayee()))
            && (this.getRepaySource() == null ? other.getRepaySource() == null : this.getRepaySource().equals(other.getRepaySource()))
            && (this.getBankId() == null ? other.getBankId() == null : this.getBankId().equals(other.getBankId()))
            && (this.getBankName() == null ? other.getBankName() == null : this.getBankName().equals(other.getBankName()))
            && (this.getBankBranch() == null ? other.getBankBranch() == null : this.getBankBranch().equals(other.getBankBranch()))
            && (this.getAccountNo() == null ? other.getAccountNo() == null : this.getAccountNo().equals(other.getAccountNo()))
            && (this.getBankCardFirstNameTh() == null ? other.getBankCardFirstNameTh() == null : this.getBankCardFirstNameTh().equals(other.getBankCardFirstNameTh()))
            && (this.getBankCardLastNameTh() == null ? other.getBankCardLastNameTh() == null : this.getBankCardLastNameTh().equals(other.getBankCardLastNameTh()))
            && (this.getBankCardFirstNameEn() == null ? other.getBankCardFirstNameEn() == null : this.getBankCardFirstNameEn().equals(other.getBankCardFirstNameEn()))
            && (this.getBankCardLastNameEn() == null ? other.getBankCardLastNameEn() == null : this.getBankCardLastNameEn().equals(other.getBankCardLastNameEn()))
            && (this.getSystemRemark() == null ? other.getSystemRemark() == null : this.getSystemRemark().equals(other.getSystemRemark()))
            && (this.getCompanyBankName() == null ? other.getCompanyBankName() == null : this.getCompanyBankName().equals(other.getCompanyBankName()))
            && (this.getCompanyAccountNo() == null ? other.getCompanyAccountNo() == null : this.getCompanyAccountNo().equals(other.getCompanyAccountNo()))
            && (this.getCompanyName() == null ? other.getCompanyName() == null : this.getCompanyName().equals(other.getCompanyName()))
            && (this.getCompanyBankBranch() == null ? other.getCompanyBankBranch() == null : this.getCompanyBankBranch().equals(other.getCompanyBankBranch()))
            && (this.getQrCodeData() == null ? other.getQrCodeData() == null : this.getQrCodeData().equals(other.getQrCodeData()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getRepayOrderId() == null) ? 0 : getRepayOrderId().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getPaymentId() == null) ? 0 : getPaymentId().hashCode());
        result = prime * result + ((getThirdOrderId() == null) ? 0 : getThirdOrderId().hashCode());
        result = prime * result + ((getRepayAmount() == null) ? 0 : getRepayAmount().hashCode());
        result = prime * result + ((getRepayTime() == null) ? 0 : getRepayTime().hashCode());
        result = prime * result + ((getConfirmTime() == null) ? 0 : getConfirmTime().hashCode());
        result = prime * result + ((getReviewStatus() == null) ? 0 : getReviewStatus().hashCode());
        result = prime * result + ((getRepayStatus() == null) ? 0 : getRepayStatus().hashCode());
        result = prime * result + ((getRepayWay() == null) ? 0 : getRepayWay().hashCode());
        result = prime * result + ((getRepayChannel() == null) ? 0 : getRepayChannel().hashCode());
        result = prime * result + ((getRepayThirdPartyChannel() == null) ? 0 : getRepayThirdPartyChannel().hashCode());
        result = prime * result + ((getRepayResult() == null) ? 0 : getRepayResult().hashCode());
        result = prime * result + ((getPayProofUrl() == null) ? 0 : getPayProofUrl().hashCode());
        result = prime * result + ((getPayProofStatus() == null) ? 0 : getPayProofStatus().hashCode());
        result = prime * result + ((getUploadTime() == null) ? 0 : getUploadTime().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getUserRepayAmount() == null) ? 0 : getUserRepayAmount().hashCode());
        result = prime * result + ((getUserRepayTime() == null) ? 0 : getUserRepayTime().hashCode());
        result = prime * result + ((getRepayType() == null) ? 0 : getRepayType().hashCode());
        result = prime * result + ((getQrCode() == null) ? 0 : getQrCode().hashCode());
        result = prime * result + ((getPayer() == null) ? 0 : getPayer().hashCode());
        result = prime * result + ((getPayee() == null) ? 0 : getPayee().hashCode());
        result = prime * result + ((getRepaySource() == null) ? 0 : getRepaySource().hashCode());
        result = prime * result + ((getBankId() == null) ? 0 : getBankId().hashCode());
        result = prime * result + ((getBankName() == null) ? 0 : getBankName().hashCode());
        result = prime * result + ((getBankBranch() == null) ? 0 : getBankBranch().hashCode());
        result = prime * result + ((getAccountNo() == null) ? 0 : getAccountNo().hashCode());
        result = prime * result + ((getBankCardFirstNameTh() == null) ? 0 : getBankCardFirstNameTh().hashCode());
        result = prime * result + ((getBankCardLastNameTh() == null) ? 0 : getBankCardLastNameTh().hashCode());
        result = prime * result + ((getBankCardFirstNameEn() == null) ? 0 : getBankCardFirstNameEn().hashCode());
        result = prime * result + ((getBankCardLastNameEn() == null) ? 0 : getBankCardLastNameEn().hashCode());
        result = prime * result + ((getSystemRemark() == null) ? 0 : getSystemRemark().hashCode());
        result = prime * result + ((getCompanyBankName() == null) ? 0 : getCompanyBankName().hashCode());
        result = prime * result + ((getCompanyAccountNo() == null) ? 0 : getCompanyAccountNo().hashCode());
        result = prime * result + ((getCompanyName() == null) ? 0 : getCompanyName().hashCode());
        result = prime * result + ((getCompanyBankBranch() == null) ? 0 : getCompanyBankBranch().hashCode());
        result = prime * result + ((getQrCodeData() == null) ? 0 : getQrCodeData().hashCode());
        return result;
    }
}