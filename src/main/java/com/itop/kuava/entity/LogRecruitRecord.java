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
public class LogRecruitRecord extends Model<LogRecruitRecord> {

    private static final long serialVersionUID = 1L;

    private String Id;

    /**
     * 招聘Id
     */
    private String RecruitId;

    /**
     * 投递人
     */
    private String AccountId;

    /**
     * 被投递企业
     */
    private String ObjectId;

    private Date CreateTime;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    public String getRecruitId() {
        return RecruitId;
    }

    public void setRecruitId(String RecruitId) {
        this.RecruitId = RecruitId;
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

    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

    @Override
    public String toString() {
        return "LogRecruitRecord{" +
        "Id=" + Id +
        ", RecruitId=" + RecruitId +
        ", AccountId=" + AccountId +
        ", ObjectId=" + ObjectId +
        ", CreateTime=" + CreateTime +
        "}";
    }
}
