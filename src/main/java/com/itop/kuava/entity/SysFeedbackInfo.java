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
public class SysFeedbackInfo extends Model<SysFeedbackInfo> {

    private static final long serialVersionUID = 1L;

    private String Id;

    private String AccountId;

    private Date CreateTime;

    /**
     * 反馈内容
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
    public Date getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Date CreateTime) {
        this.CreateTime = CreateTime;
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
        return "SysFeedbackInfo{" +
        "Id=" + Id +
        ", AccountId=" + AccountId +
        ", CreateTime=" + CreateTime +
        ", Context=" + Context +
        "}";
    }
}
