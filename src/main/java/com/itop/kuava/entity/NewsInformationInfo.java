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
public class NewsInformationInfo extends Model<NewsInformationInfo> {

    private static final long serialVersionUID = 1L;

    private String Id;

    /**
     * 标题
     */
    private String Title;

    /**
     * 标签
     */
    private String Tags;

    /**
     * 正文-图文
     */
    private String Context;

    /**
     * 来源
     */
    private String Source;

    /**
     * 原作者
     */
    private String SourceName;

    /**
     * 链接
     */
    private String LinkUrl;

    /**
     * 分类
     */
    private String ClassType;

    /**
     * 简图
     */
    private String Logo;

    /**
     * 摘要
     */
    private String Summary;

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

    /**
     * 是否高品质
     */
    private Integer IsHighQuality;

    /**
     * 一审
     */
    private String CreaterId;

    /**
     * 优质资讯，初审
     */
    private Integer CheckFirst;

    /**
     * 二审
     */
    private String CreaterSecondId;

    private String ContextText;

    /**
     * 修改者
     */
    private String ModifyUser;

    /**
     * 数据状态
     */
    private Integer DataStatus;

    /**
     * 金色财经的Id
     */
    private String LastId;

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
    public String getContext() {
        return Context;
    }

    public void setContext(String Context) {
        this.Context = Context;
    }
    public String getSource() {
        return Source;
    }

    public void setSource(String Source) {
        this.Source = Source;
    }
    public String getSourceName() {
        return SourceName;
    }

    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
    }
    public String getLinkUrl() {
        return LinkUrl;
    }

    public void setLinkUrl(String LinkUrl) {
        this.LinkUrl = LinkUrl;
    }
    public String getClassType() {
        return ClassType;
    }

    public void setClassType(String ClassType) {
        this.ClassType = ClassType;
    }
    public String getLogo() {
        return Logo;
    }

    public void setLogo(String Logo) {
        this.Logo = Logo;
    }
    public String getSummary() {
        return Summary;
    }

    public void setSummary(String Summary) {
        this.Summary = Summary;
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
    public Integer getIsHighQuality() {
        return IsHighQuality;
    }

    public void setIsHighQuality(Integer IsHighQuality) {
        this.IsHighQuality = IsHighQuality;
    }
    public String getCreaterId() {
        return CreaterId;
    }

    public void setCreaterId(String CreaterId) {
        this.CreaterId = CreaterId;
    }
    public Integer getCheckFirst() {
        return CheckFirst;
    }

    public void setCheckFirst(Integer CheckFirst) {
        this.CheckFirst = CheckFirst;
    }
    public String getCreaterSecondId() {
        return CreaterSecondId;
    }

    public void setCreaterSecondId(String CreaterSecondId) {
        this.CreaterSecondId = CreaterSecondId;
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
    public String getLastId() {
        return LastId;
    }

    public void setLastId(String LastId) {
        this.LastId = LastId;
    }

    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

    @Override
    public String toString() {
        return "NewsInformationInfo{" +
        "Id=" + Id +
        ", Title=" + Title +
        ", Tags=" + Tags +
        ", Context=" + Context +
        ", Source=" + Source +
        ", SourceName=" + SourceName +
        ", LinkUrl=" + LinkUrl +
        ", ClassType=" + ClassType +
        ", Logo=" + Logo +
        ", Summary=" + Summary +
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
        ", IsHighQuality=" + IsHighQuality +
        ", CreaterId=" + CreaterId +
        ", CheckFirst=" + CheckFirst +
        ", CreaterSecondId=" + CreaterSecondId +
        ", ContextText=" + ContextText +
        ", ModifyUser=" + ModifyUser +
        ", DataStatus=" + DataStatus +
        ", LastId=" + LastId +
        "}";
    }
}
