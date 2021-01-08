package com.zml.demo.producer.dao.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class OSupplementItem implements Serializable {
    /**
     * 主键ID
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     * 所属补充信息ID
     *
     * @mbg.generated
     */
    private String supplementId;

    /**
     * 订单ID
     *
     * @mbg.generated
     */
    private String orderId;

    /**
     * 用户ID
     *
     * @mbg.generated
     */
    private String userId;

    /**
     * 补充信息类型(1.文字，2.照片）
     *
     * @mbg.generated
     */
    private Byte type;

    /**
     * 图片类型（idcard_front：身份证正面，idcard_back ：身份证反面，payroll：工资单，
labor_contrac劳务合同，offer 入职offer，company_proof 单位工作证明，work_card : 工牌，bank_statement: 银行流水，utility : 现住址水电单，mobile_network : 现住址电话/网络缴费单，property : 现住址房产证，other其他）
     *
     * @mbg.generated
     */
    private String imgType;

    /**
     * 0待上传1已上传
     *
     * @mbg.generated
     */
    private Byte status;

    /**
     * 操作人
     *
     * @mbg.generated
     */
    private String operator;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    /**
     * 上传内容以json字符串保存
     *
     * @mbg.generated
     */
    private String content;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSupplementId() {
        return supplementId;
    }

    public void setSupplementId(String supplementId) {
        this.supplementId = supplementId;
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

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public String getImgType() {
        return imgType;
    }

    public void setImgType(String imgType) {
        this.imgType = imgType;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", supplementId=").append(supplementId);
        sb.append(", orderId=").append(orderId);
        sb.append(", userId=").append(userId);
        sb.append(", type=").append(type);
        sb.append(", imgType=").append(imgType);
        sb.append(", status=").append(status);
        sb.append(", operator=").append(operator);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", content=").append(content);
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
        OSupplementItem other = (OSupplementItem) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSupplementId() == null ? other.getSupplementId() == null : this.getSupplementId().equals(other.getSupplementId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getImgType() == null ? other.getImgType() == null : this.getImgType().equals(other.getImgType()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getOperator() == null ? other.getOperator() == null : this.getOperator().equals(other.getOperator()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSupplementId() == null) ? 0 : getSupplementId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getImgType() == null) ? 0 : getImgType().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getOperator() == null) ? 0 : getOperator().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        return result;
    }
}