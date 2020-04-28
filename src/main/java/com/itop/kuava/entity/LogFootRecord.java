package com.itop.kuava.entity;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ss
 * @since 2020-04-09
 */
public class LogFootRecord extends Model<LogFootRecord> {

    private static final long serialVersionUID = 1L;

    private String Id;

    private String AccountId;

    private String ObjectId;

    /**
     * 1：详情；2：分享
     */
    private Integer FType;

    private Date CreateTime;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    public String getAccountId() {
        return AccountId;
    }

    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }
    public String getObjectId() {
        return ObjectId;
    }

    public void setObjectId(String ObjectId) {
        this.ObjectId = ObjectId;
    }
    public Integer getFType() {
        return FType;
    }

    public void setFType(Integer FType) {
        this.FType = FType;
    }
    public Date getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Date CreateTime) {
        this.CreateTime = CreateTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

    @Override
    public String toString() {
        return "LogFootRecord{" +
        "Id=" + Id +
        ", AccountId=" + AccountId +
        ", ObjectId=" + ObjectId +
        ", FType=" + FType +
        ", CreateTime=" + CreateTime +
        "}";
    }
}
