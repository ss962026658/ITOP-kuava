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
public class SysCommentInfo extends Model<SysCommentInfo> {

    private static final long serialVersionUID = 1L;

    /**
     * 评论Id
     */
    private String Id;

    /**
     * 评论人
     */
    private String AccountId;

    /**
     * 评论对象
     */
    private String ObjectId;

    /**
     * 回复评论的Id
     */
    private String ParentId;

    /**
     * 内容
     */
    private String Context;

    private Date CreateTime;

    /**
     * 审核
     */
    private Integer Checked;

    /**
     * 审核人
     */
    private String CheckUser;

    /**
     * 点赞总数
     */
    private Integer UpSum;

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
    public String getParentId() {
        return ParentId;
    }

    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }
    public String getContext() {
        return Context;
    }

    public void setContext(String Context) {
        this.Context = Context;
    }
    public Date getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Date CreateTime) {
        this.CreateTime = CreateTime;
    }
    public Integer getChecked() {
        return Checked;
    }

    public void setChecked(Integer Checked) {
        this.Checked = Checked;
    }
    public String getCheckUser() {
        return CheckUser;
    }

    public void setCheckUser(String CheckUser) {
        this.CheckUser = CheckUser;
    }
    public Integer getUpSum() {
        return UpSum;
    }

    public void setUpSum(Integer UpSum) {
        this.UpSum = UpSum;
    }

    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

    @Override
    public String toString() {
        return "SysCommentInfo{" +
        "Id=" + Id +
        ", AccountId=" + AccountId +
        ", ObjectId=" + ObjectId +
        ", ParentId=" + ParentId +
        ", Context=" + Context +
        ", CreateTime=" + CreateTime +
        ", Checked=" + Checked +
        ", CheckUser=" + CheckUser +
        ", UpSum=" + UpSum +
        "}";
    }
}
