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
public class NewsRecruitInfo extends Model<NewsRecruitInfo> {

    private static final long serialVersionUID = 1L;

    private String Id;

    /**
     * 职位名称
     */
    private String Title;

    /**
     * 正文：职位描述，任职要求
     */
    private String Context;

    /**
     * 创建时间
     */
    private Date CreateTime;

    /**
     * 发布时间
     */
    private Date PushTime;

    private Integer Checked;

    private String Explain;

    /**
     * 发布人
     */
    private String AccountId;

    /**
     * 阅读量
     */
    private Integer ReadSum;

    private String Tags;

    /**
     * 招聘简介
     */
    private String Summary;

    /**
     * 薪资
     */
    private String Money;

    /**
     * 奖励总积分
     */
    private Integer RewardScoreSum;

    /**
     * 剩余奖励积分
     */
    private Integer RewardScoreNum;

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

    /**
     * 省
     */
    private String ProvinceId;

    private String ProvinceName;

    /**
     * 市
     */
    private String CityId;

    private String CityName;

    /**
     * 区
     */
    private String AreaId;

    private String AreaName;

    /**
     * 公司地址
     */
    private String Address;

    private String ContextText;

    /**
     * 修改者
     */
    private String ModifyUser;

    /**
     * 数据状态
     */
    private Integer DataStatus;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
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
    public Date getPushTime() {
        return PushTime;
    }

    public void setPushTime(Date PushTime) {
        this.PushTime = PushTime;
    }
    public Integer getChecked() {
        return Checked;
    }

    public void setChecked(Integer Checked) {
        this.Checked = Checked;
    }
    public String getExplain() {
        return Explain;
    }

    public void setExplain(String Explain) {
        this.Explain = Explain;
    }
    public String getAccountId() {
        return AccountId;
    }

    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }
    public Integer getReadSum() {
        return ReadSum;
    }

    public void setReadSum(Integer ReadSum) {
        this.ReadSum = ReadSum;
    }
    public String getTags() {
        return Tags;
    }

    public void setTags(String Tags) {
        this.Tags = Tags;
    }
    public String getSummary() {
        return Summary;
    }

    public void setSummary(String Summary) {
        this.Summary = Summary;
    }
    public String getMoney() {
        return Money;
    }

    public void setMoney(String Money) {
        this.Money = Money;
    }
    public Integer getRewardScoreSum() {
        return RewardScoreSum;
    }

    public void setRewardScoreSum(Integer RewardScoreSum) {
        this.RewardScoreSum = RewardScoreSum;
    }
    public Integer getRewardScoreNum() {
        return RewardScoreNum;
    }

    public void setRewardScoreNum(Integer RewardScoreNum) {
        this.RewardScoreNum = RewardScoreNum;
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
    public String getProvinceId() {
        return ProvinceId;
    }

    public void setProvinceId(String ProvinceId) {
        this.ProvinceId = ProvinceId;
    }
    public String getProvinceName() {
        return ProvinceName;
    }

    public void setProvinceName(String ProvinceName) {
        this.ProvinceName = ProvinceName;
    }
    public String getCityId() {
        return CityId;
    }

    public void setCityId(String CityId) {
        this.CityId = CityId;
    }
    public String getCityName() {
        return CityName;
    }

    public void setCityName(String CityName) {
        this.CityName = CityName;
    }
    public String getAreaId() {
        return AreaId;
    }

    public void setAreaId(String AreaId) {
        this.AreaId = AreaId;
    }
    public String getAreaName() {
        return AreaName;
    }

    public void setAreaName(String AreaName) {
        this.AreaName = AreaName;
    }
    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    public String getContextText() {
        return ContextText;
    }

    public void setContextText(String ContextText) {
        this.ContextText = ContextText;
    }
    public String getModifyUser() {
        return ModifyUser;
    }

    public void setModifyUser(String ModifyUser) {
        this.ModifyUser = ModifyUser;
    }
    public Integer getDataStatus() {
        return DataStatus;
    }

    public void setDataStatus(Integer DataStatus) {
        this.DataStatus = DataStatus;
    }

    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

    @Override
    public String toString() {
        return "NewsRecruitInfo{" +
        "Id=" + Id +
        ", Title=" + Title +
        ", Context=" + Context +
        ", CreateTime=" + CreateTime +
        ", PushTime=" + PushTime +
        ", Checked=" + Checked +
        ", Explain=" + Explain +
        ", AccountId=" + AccountId +
        ", ReadSum=" + ReadSum +
        ", Tags=" + Tags +
        ", Summary=" + Summary +
        ", Money=" + Money +
        ", RewardScoreSum=" + RewardScoreSum +
        ", RewardScoreNum=" + RewardScoreNum +
        ", Score=" + Score +
        ", RechargeScore=" + RechargeScore +
        ", RewardScore=" + RewardScore +
        ", CreaterId=" + CreaterId +
        ", ProvinceId=" + ProvinceId +
        ", ProvinceName=" + ProvinceName +
        ", CityId=" + CityId +
        ", CityName=" + CityName +
        ", AreaId=" + AreaId +
        ", AreaName=" + AreaName +
        ", Address=" + Address +
        ", ContextText=" + ContextText +
        ", ModifyUser=" + ModifyUser +
        ", DataStatus=" + DataStatus +
        "}";
    }
}
