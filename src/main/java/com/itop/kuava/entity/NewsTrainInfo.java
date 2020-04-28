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
public class NewsTrainInfo extends Model<NewsTrainInfo> {

    private static final long serialVersionUID = 1L;

    private String Id;

    /**
     * 课程名称
     */
    private String Title;

    /**
     * 标签
     */
    private String Tags;

    /**
     * 简图
     */
    private String Logo;

    /**
     * 课程时间
     */
    private Date StartTime;

    /**
     * 简介
     */
    private String Summary;

    /**
     * 正文
     */
    private String Context;

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

    private String CityId;

    private String CityName;

    /**
     * 地点
     */
    private String Address;

    /**
     * 区
     */
    private String AreaId;

    private String AreaName;

    /**
     * 省
     */
    private String ProvinceId;

    private String ProvinceName;

    private String ContextText;

    /**
     * 修改者
     */
    private String ModifyUser;

    /**
     * 培训人数
     */
    private String TrainNumber;

    private String LinkUrl;

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
    public String getTags() {
        return Tags;
    }

    public void setTags(String Tags) {
        this.Tags = Tags;
    }
    public String getLogo() {
        return Logo;
    }

    public void setLogo(String Logo) {
        this.Logo = Logo;
    }
    public Date getStartTime() {
        return StartTime;
    }

    public void setStartTime(Date StartTime) {
        this.StartTime = StartTime;
    }
    public String getSummary() {
        return Summary;
    }

    public void setSummary(String Summary) {
        this.Summary = Summary;
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
    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
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
    public String getTrainNumber() {
        return TrainNumber;
    }

    public void setTrainNumber(String TrainNumber) {
        this.TrainNumber = TrainNumber;
    }
    public String getLinkUrl() {
        return LinkUrl;
    }

    public void setLinkUrl(String LinkUrl) {
        this.LinkUrl = LinkUrl;
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
        return "NewsTrainInfo{" +
        "Id=" + Id +
        ", Title=" + Title +
        ", Tags=" + Tags +
        ", Logo=" + Logo +
        ", StartTime=" + StartTime +
        ", Summary=" + Summary +
        ", Context=" + Context +
        ", CreateTime=" + CreateTime +
        ", PushTime=" + PushTime +
        ", Checked=" + Checked +
        ", Explain=" + Explain +
        ", AccountId=" + AccountId +
        ", ReadSum=" + ReadSum +
        ", RewardScoreSum=" + RewardScoreSum +
        ", RewardScoreNum=" + RewardScoreNum +
        ", Score=" + Score +
        ", RechargeScore=" + RechargeScore +
        ", RewardScore=" + RewardScore +
        ", CreaterId=" + CreaterId +
        ", CityId=" + CityId +
        ", CityName=" + CityName +
        ", Address=" + Address +
        ", AreaId=" + AreaId +
        ", AreaName=" + AreaName +
        ", ProvinceId=" + ProvinceId +
        ", ProvinceName=" + ProvinceName +
        ", ContextText=" + ContextText +
        ", ModifyUser=" + ModifyUser +
        ", TrainNumber=" + TrainNumber +
        ", LinkUrl=" + LinkUrl +
        ", DataStatus=" + DataStatus +
        "}";
    }
}
