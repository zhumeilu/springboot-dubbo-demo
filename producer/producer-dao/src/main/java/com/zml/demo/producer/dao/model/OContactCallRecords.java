package com.zml.demo.producer.dao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OContactCallRecords implements Serializable {
    /**
     * 主键ID
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * 用户id
     *
     * @mbg.generated
     */
    private String userId;

    private String orderId;

    /**
     * 通讯录id
     *
     * @mbg.generated
     */
    private Integer phoneBookId;

    /**
     * 联系人姓名
     *
     * @mbg.generated
     */
    private String contactName;

    /**
     * 联系人电话
     *
     * @mbg.generated
     */
    private String contactMobile;

    /**
     * 拨打人
     *
     * @mbg.generated
     */
    private String operator;

    /**
     * 通话状态(10001：连接电话服务器失败， 10002：客服电话为空， 10003：拨打失败，10004：所拨打的号码为空，10005：结束通话)
     *
     * @mbg.generated
     */
    private Integer callStatus;

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
     * 通话开始时间
     *
     * @mbg.generated
     */
    private LocalDateTime startTime;

    /**
     * 通话结束时间
     *
     * @mbg.generated
     */
    private LocalDateTime endTime;

    /**
     * 通话时长(单位秒)
     *
     * @mbg.generated
     */
    private Integer callDuration;

    /**
     * 备注
     *
     * @mbg.generated
     */
    private String remark;

    /**
     * 录音文件名称
     *
     * @mbg.generated
     */
    private String fileName;

    /**
     * 录音唯一标识
     *
     * @mbg.generated
     */
    private String gid;

    /**
     * 呼叫类型：0-呼出，1-呼入
     *
     * @mbg.generated
     */
    private Byte callType;

    /**
     * 渠道ID
     *
     * @mbg.generated
     */
    private String callChannel;

    /**
     * 话费
     *
     * @mbg.generated
     */
    private BigDecimal callCost;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getPhoneBookId() {
        return phoneBookId;
    }

    public void setPhoneBookId(Integer phoneBookId) {
        this.phoneBookId = phoneBookId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Integer getCallStatus() {
        return callStatus;
    }

    public void setCallStatus(Integer callStatus) {
        this.callStatus = callStatus;
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

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public Integer getCallDuration() {
        return callDuration;
    }

    public void setCallDuration(Integer callDuration) {
        this.callDuration = callDuration;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public Byte getCallType() {
        return callType;
    }

    public void setCallType(Byte callType) {
        this.callType = callType;
    }

    public String getCallChannel() {
        return callChannel;
    }

    public void setCallChannel(String callChannel) {
        this.callChannel = callChannel;
    }

    public BigDecimal getCallCost() {
        return callCost;
    }

    public void setCallCost(BigDecimal callCost) {
        this.callCost = callCost;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", orderId=").append(orderId);
        sb.append(", phoneBookId=").append(phoneBookId);
        sb.append(", contactName=").append(contactName);
        sb.append(", contactMobile=").append(contactMobile);
        sb.append(", operator=").append(operator);
        sb.append(", callStatus=").append(callStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", startTime=").append(startTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", callDuration=").append(callDuration);
        sb.append(", remark=").append(remark);
        sb.append(", fileName=").append(fileName);
        sb.append(", gid=").append(gid);
        sb.append(", callType=").append(callType);
        sb.append(", callChannel=").append(callChannel);
        sb.append(", callCost=").append(callCost);
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
        OContactCallRecords other = (OContactCallRecords) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getPhoneBookId() == null ? other.getPhoneBookId() == null : this.getPhoneBookId().equals(other.getPhoneBookId()))
            && (this.getContactName() == null ? other.getContactName() == null : this.getContactName().equals(other.getContactName()))
            && (this.getContactMobile() == null ? other.getContactMobile() == null : this.getContactMobile().equals(other.getContactMobile()))
            && (this.getOperator() == null ? other.getOperator() == null : this.getOperator().equals(other.getOperator()))
            && (this.getCallStatus() == null ? other.getCallStatus() == null : this.getCallStatus().equals(other.getCallStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getStartTime() == null ? other.getStartTime() == null : this.getStartTime().equals(other.getStartTime()))
            && (this.getEndTime() == null ? other.getEndTime() == null : this.getEndTime().equals(other.getEndTime()))
            && (this.getCallDuration() == null ? other.getCallDuration() == null : this.getCallDuration().equals(other.getCallDuration()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getFileName() == null ? other.getFileName() == null : this.getFileName().equals(other.getFileName()))
            && (this.getGid() == null ? other.getGid() == null : this.getGid().equals(other.getGid()))
            && (this.getCallType() == null ? other.getCallType() == null : this.getCallType().equals(other.getCallType()))
            && (this.getCallChannel() == null ? other.getCallChannel() == null : this.getCallChannel().equals(other.getCallChannel()))
            && (this.getCallCost() == null ? other.getCallCost() == null : this.getCallCost().equals(other.getCallCost()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getPhoneBookId() == null) ? 0 : getPhoneBookId().hashCode());
        result = prime * result + ((getContactName() == null) ? 0 : getContactName().hashCode());
        result = prime * result + ((getContactMobile() == null) ? 0 : getContactMobile().hashCode());
        result = prime * result + ((getOperator() == null) ? 0 : getOperator().hashCode());
        result = prime * result + ((getCallStatus() == null) ? 0 : getCallStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        result = prime * result + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        result = prime * result + ((getCallDuration() == null) ? 0 : getCallDuration().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getFileName() == null) ? 0 : getFileName().hashCode());
        result = prime * result + ((getGid() == null) ? 0 : getGid().hashCode());
        result = prime * result + ((getCallType() == null) ? 0 : getCallType().hashCode());
        result = prime * result + ((getCallChannel() == null) ? 0 : getCallChannel().hashCode());
        result = prime * result + ((getCallCost() == null) ? 0 : getCallCost().hashCode());
        return result;
    }
}