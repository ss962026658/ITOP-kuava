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
public class LogBuyRecord extends Model<LogBuyRecord> {

    private static final long serialVersionUID = 1L;

    private String Id;

    private String ObjectId;

    private String AccountId;

    private Date CreateTime;

    /**
     * 1：简历；2：视频
     */
    private Integer ObjectType;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    public String getObjectId() {
        return ObjectId;
    }

    public void setObjectId(String ObjectId) {
        this.ObjectId = ObjectId;
    }
    public String getAccountId() {
        return AccountId;
    }

    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }
    public Date getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Date CreateTime) {
        this.CreateTime = CreateTime;
    }
    public Integer getObjectType() {
        return ObjectType;
    }

    public void setObjectType(Integer ObjectType) {
        this.ObjectType = ObjectType;
    }

    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

    @Override
    public String toString() {
        return "LogBuyRecord{" +
        "Id=" + Id +
        ", ObjectId=" + ObjectId +
        ", AccountId=" + AccountId +
        ", CreateTime=" + CreateTime +
        ", ObjectType=" + ObjectType +
        "}";
    }
}
