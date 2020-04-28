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
public class LogScoreRecord extends Model<LogScoreRecord> {

    private static final long serialVersionUID = 1L;

    private String Id;

    private String AccountId;

    private String Score;

    private Date CreateTime;

    private String Describe;

    /**
     * 类型
     */
    private Integer FType;

    /**
     * 手续费
     */
    private Integer Commission;

    /**
     * 后台操作者
     */
    private String CreateId;

    /**
     * 操作说明
     */
    private String Context;

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
    public String getScore() {
        return Score;
    }

    public void setScore(String Score) {
        this.Score = Score;
    }
    public Date getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Date CreateTime) {
        this.CreateTime = CreateTime;
    }
    public String getDescribe() {
        return Describe;
    }

    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }
    public Integer getFType() {
        return FType;
    }

    public void setFType(Integer FType) {
        this.FType = FType;
    }
    public Integer getCommission() {
        return Commission;
    }

    public void setCommission(Integer Commission) {
        this.Commission = Commission;
    }
    public String getCreateId() {
        return CreateId;
    }

    public void setCreateId(String CreateId) {
        this.CreateId = CreateId;
    }
    public String getContext() {
        return Context;
    }

    public void setContext(String Context) {
        this.Context = Context;
    }

    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

    @Override
    public String toString() {
        return "LogScoreRecord{" +
        "Id=" + Id +
        ", AccountId=" + AccountId +
        ", Score=" + Score +
        ", CreateTime=" + CreateTime +
        ", Describe=" + Describe +
        ", FType=" + FType +
        ", Commission=" + Commission +
        ", CreateId=" + CreateId +
        ", Context=" + Context +
        "}";
    }
}
