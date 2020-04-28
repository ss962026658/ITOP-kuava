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
@TableName("NewsTodayHot")
public class NewsTodayHot extends Model<NewsTodayHot> {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.UUID)
    private String Id;

    /**
     * 新闻对象
     */
    @TableField("ObjectId")
    private String ObjectId;

    @TableField("CreateTime")
    private Date CreateTime;

    @TableField("ObjectType")
    private Integer ObjectType;

    /**
     * 购买者
     */
    @TableField("AccountId")
    private String AccountId;

    /**
     * 审核
     */
    private Integer Checked;

    /**
     * 开始时间
     */
    @TableField("StartTime")
    private Date StartTime;

    /**
     * 位置
     */
    private String Place;

    @TableField("FPage")
    private String FPage;

    private String Explain;

    /**
     * 消费总积分
     */
    private Long Score;

    /**
     * 消费的充值积分
     */
    @TableField("RechargeScore")
    private Long RechargeScore;

    /**
     * 消费的奖励积分
     */
    @TableField("RewardScore")
    private Long RewardScore;

    @TableField("CreaterId")
    private String CreaterId;

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
    public String getAccountId() {
        return AccountId;
    }

    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }
    public Integer getChecked() {
        return Checked;
    }

    public void setChecked(Integer Checked) {
        this.Checked = Checked;
    }
    public Date getStartTime() {
        return StartTime;
    }

    public void setStartTime(Date StartTime) {
        this.StartTime = StartTime;
    }
    public String getPlace() {
        return Place;
    }

    public void setPlace(String Place) {
        this.Place = Place;
    }
    public String getFPage() {
        return FPage;
    }

    public void setFPage(String FPage) {
        this.FPage = FPage;
    }
    public String getExplain() {
        return Explain;
    }

    public void setExplain(String Explain) {
        this.Explain = Explain;
    }
    public Long getScore() {
        return Score;
    }

    public void setScore(Long Score) {
        this.Score = Score;
    }
    public Long getRechargeScore() {
        return RechargeScore;
    }

    public void setRechargeScore(Long RechargeScore) {
        this.RechargeScore = RechargeScore;
    }
    public Long getRewardScore() {
        return RewardScore;
    }

    public void setRewardScore(Long RewardScore) {
        this.RewardScore = RewardScore;
    }
    public String getCreaterId() {
        return CreaterId;
    }

    public void setCreaterId(String CreaterId) {
        this.CreaterId = CreaterId;
    }

    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

    @Override
    public String toString() {
        return "NewsTodayHot{" +
        "Id=" + Id +
        ", ObjectId=" + ObjectId +
        ", CreateTime=" + CreateTime +
        ", ObjectType=" + ObjectType +
        ", AccountId=" + AccountId +
        ", Checked=" + Checked +
        ", StartTime=" + StartTime +
        ", Place=" + Place +
        ", FPage=" + FPage +
        ", Explain=" + Explain +
        ", Score=" + Score +
        ", RechargeScore=" + RechargeScore +
        ", RewardScore=" + RewardScore +
        ", CreaterId=" + CreaterId +
        "}";
    }
}
