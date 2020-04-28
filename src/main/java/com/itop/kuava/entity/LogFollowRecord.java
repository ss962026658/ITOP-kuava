package com.itop.kuava.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author ss
 * @since 2020-04-09
 */
@TableName("LogFollowRecord")
public class LogFollowRecord extends Model<LogFollowRecord> {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.UUID)
    private String Id;

    /**
     * 关注人
     */
    @TableField("AccountId")
    private String AccountId;

    /**
     * 被关注者
     */
    @TableField("AccountId")
    private String ObjectId;

    @TableField("CreateTime")
    private Date CreateTime;

    /**
     * 1:个人；2：媒体；3：企业
     */
    @TableField("ObjectType")
    private Integer ObjectType;

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
        return "LogFollowRecord{" +
        "Id=" + Id +
        ", AccountId=" + AccountId +
        ", ObjectId=" + ObjectId +
        ", CreateTime=" + CreateTime +
        ", ObjectType=" + ObjectType +
        "}";
    }
}
