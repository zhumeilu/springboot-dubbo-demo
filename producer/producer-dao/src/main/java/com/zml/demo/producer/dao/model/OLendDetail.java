package com.zml.demo.producer.dao.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class OLendDetail implements Serializable {
    private Integer id;

    private String orderId;

    private LocalDateTime createDate;

    private LocalDateTime updateDate;

    /**
     * 产品名称（冗余字段）
     *
     * @mbg.generated
     */
    private String productName;

    /**
     * 收款银行名称（冗余字段，银行卡审核通过之后设置该值）
     *
     * @mbg.generated
     */
    private String bankName;

    /**
     * 分行名称（冗余字段，银行卡审核通过之后设置该值）
     *
     * @mbg.generated
     */
    private String branchBankName;

    /**
     * 收款银行账号（冗余字段，银行卡审核通过之后设置该值）
     *
     * @mbg.generated
     */
    private String bankAccountNo;

    /**
     * 收款银行账户姓名（冗余字段，银行卡审核通过之后设置该值）
     *
     * @mbg.generated
     */
    private String bankAccountName;

    /**
     * 用户借款位置纬度
     *
     * @mbg.generated
     */
    private String lat;

    /**
     * 用户借款位置经度
     *
     * @mbg.generated
     */
    private String lon;

    /**
     * 借款IP
     *
     * @mbg.generated
     */
    private String ip;

    /**
     * 用户方便接听电话时间段
     *
     * @mbg.generated
     */
    private String answeringTime;

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

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranchBankName() {
        return branchBankName;
    }

    public void setBranchBankName(String branchBankName) {
        this.branchBankName = branchBankName;
    }

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getAnsweringTime() {
        return answeringTime;
    }

    public void setAnsweringTime(String answeringTime) {
        this.answeringTime = answeringTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderId=").append(orderId);
        sb.append(", createDate=").append(createDate);
        sb.append(", updateDate=").append(updateDate);
        sb.append(", productName=").append(productName);
        sb.append(", bankName=").append(bankName);
        sb.append(", branchBankName=").append(branchBankName);
        sb.append(", bankAccountNo=").append(bankAccountNo);
        sb.append(", bankAccountName=").append(bankAccountName);
        sb.append(", lat=").append(lat);
        sb.append(", lon=").append(lon);
        sb.append(", ip=").append(ip);
        sb.append(", answeringTime=").append(answeringTime);
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
        OLendDetail other = (OLendDetail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getCreateDate() == null ? other.getCreateDate() == null : this.getCreateDate().equals(other.getCreateDate()))
            && (this.getUpdateDate() == null ? other.getUpdateDate() == null : this.getUpdateDate().equals(other.getUpdateDate()))
            && (this.getProductName() == null ? other.getProductName() == null : this.getProductName().equals(other.getProductName()))
            && (this.getBankName() == null ? other.getBankName() == null : this.getBankName().equals(other.getBankName()))
            && (this.getBranchBankName() == null ? other.getBranchBankName() == null : this.getBranchBankName().equals(other.getBranchBankName()))
            && (this.getBankAccountNo() == null ? other.getBankAccountNo() == null : this.getBankAccountNo().equals(other.getBankAccountNo()))
            && (this.getBankAccountName() == null ? other.getBankAccountName() == null : this.getBankAccountName().equals(other.getBankAccountName()))
            && (this.getLat() == null ? other.getLat() == null : this.getLat().equals(other.getLat()))
            && (this.getLon() == null ? other.getLon() == null : this.getLon().equals(other.getLon()))
            && (this.getIp() == null ? other.getIp() == null : this.getIp().equals(other.getIp()))
            && (this.getAnsweringTime() == null ? other.getAnsweringTime() == null : this.getAnsweringTime().equals(other.getAnsweringTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getCreateDate() == null) ? 0 : getCreateDate().hashCode());
        result = prime * result + ((getUpdateDate() == null) ? 0 : getUpdateDate().hashCode());
        result = prime * result + ((getProductName() == null) ? 0 : getProductName().hashCode());
        result = prime * result + ((getBankName() == null) ? 0 : getBankName().hashCode());
        result = prime * result + ((getBranchBankName() == null) ? 0 : getBranchBankName().hashCode());
        result = prime * result + ((getBankAccountNo() == null) ? 0 : getBankAccountNo().hashCode());
        result = prime * result + ((getBankAccountName() == null) ? 0 : getBankAccountName().hashCode());
        result = prime * result + ((getLat() == null) ? 0 : getLat().hashCode());
        result = prime * result + ((getLon() == null) ? 0 : getLon().hashCode());
        result = prime * result + ((getIp() == null) ? 0 : getIp().hashCode());
        result = prime * result + ((getAnsweringTime() == null) ? 0 : getAnsweringTime().hashCode());
        return result;
    }
}