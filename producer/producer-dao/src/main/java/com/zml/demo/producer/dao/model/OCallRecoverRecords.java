package com.zml.demo.producer.dao.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class OCallRecoverRecords implements Serializable {
    private Integer id;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     *
     * @mbg.generated
     */
    private LocalDateTime updateTime;

    /**
     * 通话记录ID
     *
     * @mbg.generated
     */
    private Integer callRecordId;

    /**
     * 客户编号
     *
     * @mbg.generated
     */
    private String userId;

    /**
     * 电话号码
     *
     * @mbg.generated
     */
    private String mobile;

    /**
     * 通话时间
     *
     * @mbg.generated
     */
    private LocalDateTime callTime;

    /**
     * 录音文件名称
     *
     * @mbg.generated
     */
    private String fileName;

    /**
     * 通话时长（单位秒）
     *
     * @mbg.generated
     */
    private Integer callDuration;

    /**
     * 录音唯一标识
     *
     * @mbg.generated
     */
    private String gid;

    /**
     * 状态（0：待恢复；1：已恢复；2：恢复失败）
     *
     * @mbg.generated
     */
    private Byte status;

    /**
     * 录音恢复时间
     *
     * @mbg.generated
     */
    private LocalDateTime recoveryTime;

    /**
     * 所属员工
     *
     * @mbg.generated
     */
    private String employee;

    /**
     * 操作员
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

    public Integer getCallRecordId() {
        return callRecordId;
    }

    public void setCallRecordId(Integer callRecordId) {
        this.callRecordId = callRecordId;
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

    public LocalDateTime getCallTime() {
        return callTime;
    }

    public void setCallTime(LocalDateTime callTime) {
        this.callTime = callTime;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Integer getCallDuration() {
        return callDuration;
    }

    public void setCallDuration(Integer callDuration) {
        this.callDuration = callDuration;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public LocalDateTime getRecoveryTime() {
        return recoveryTime;
    }

    public void setRecoveryTime(LocalDateTime recoveryTime) {
        this.recoveryTime = recoveryTime;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
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
        sb.append(", callRecordId=").append(callRecordId);
        sb.append(", userId=").append(userId);
        sb.append(", mobile=").append(mobile);
        sb.append(", callTime=").append(callTime);
        sb.append(", fileName=").append(fileName);
        sb.append(", callDuration=").append(callDuration);
        sb.append(", gid=").append(gid);
        sb.append(", status=").append(status);
        sb.append(", recoveryTime=").append(recoveryTime);
        sb.append(", employee=").append(employee);
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
        OCallRecoverRecords other = (OCallRecoverRecords) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getCallRecordId() == null ? other.getCallRecordId() == null : this.getCallRecordId().equals(other.getCallRecordId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getCallTime() == null ? other.getCallTime() == null : this.getCallTime().equals(other.getCallTime()))
            && (this.getFileName() == null ? other.getFileName() == null : this.getFileName().equals(other.getFileName()))
            && (this.getCallDuration() == null ? other.getCallDuration() == null : this.getCallDuration().equals(other.getCallDuration()))
            && (this.getGid() == null ? other.getGid() == null : this.getGid().equals(other.getGid()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getRecoveryTime() == null ? other.getRecoveryTime() == null : this.getRecoveryTime().equals(other.getRecoveryTime()))
            && (this.getEmployee() == null ? other.getEmployee() == null : this.getEmployee().equals(other.getEmployee()))
            && (this.getOperator() == null ? other.getOperator() == null : this.getOperator().equals(other.getOperator()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getCallRecordId() == null) ? 0 : getCallRecordId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getCallTime() == null) ? 0 : getCallTime().hashCode());
        result = prime * result + ((getFileName() == null) ? 0 : getFileName().hashCode());
        result = prime * result + ((getCallDuration() == null) ? 0 : getCallDuration().hashCode());
        result = prime * result + ((getGid() == null) ? 0 : getGid().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getRecoveryTime() == null) ? 0 : getRecoveryTime().hashCode());
        result = prime * result + ((getEmployee() == null) ? 0 : getEmployee().hashCode());
        result = prime * result + ((getOperator() == null) ? 0 : getOperator().hashCode());
        return result;
    }
}