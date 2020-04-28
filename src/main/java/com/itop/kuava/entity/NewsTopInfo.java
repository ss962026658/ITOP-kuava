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
public class NewsTopInfo extends Model<NewsTopInfo> {

    private static final long serialVersionUID = 1L;

    private String Id;

    /**
     * 新闻对象
     */
    private String ObjectId;

    private Date CreateTime;

    /**
     * 新闻类型
     */
    private Integer ObjectType;

    /**
     * 购买者
     */
    private String AccountId;

    /**
     * 审核
     */
    private Integer Checked;

    /**
     * 开始时间
     */
    private Date StartTime;

    /**
     * 位置
     */
    private String Place;

    private String Explain;

    /**
     * 消费总积分
     */
    private Long Score;

    /**
     * 消费的充值积分
     */
    private Long RechargeScore;

    /**
     * 消费的奖励积分
     */
    private Long RewardScore;

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
        return "NewsTopInfo{" +
        "Id=" + Id +
        ", ObjectId=" + ObjectId +
        ", CreateTime=" + CreateTime +
        ", ObjectType=" + ObjectType +
        ", AccountId=" + AccountId +
        ", Checked=" + Checked +
        ", StartTime=" + StartTime +
        ", Place=" + Place +
        ", Explain=" + Explain +
        ", Score=" + Score +
        ", RechargeScore=" + RechargeScore +
        ", RewardScore=" + RewardScore +
        ", CreaterId=" + CreaterId +
        "}";
    }
}
