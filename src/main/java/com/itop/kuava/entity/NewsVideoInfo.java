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
@TableName("NewsVideoInfo")
public class NewsVideoInfo extends Model<NewsVideoInfo> {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.UUID)
    private String Id;

    /**
     * 标题
     */
    private String Title;

    /**
     * 简介
     */
    private String Summary;

    /**
     * 标签
     */
    private String Tags;

    /**
     * 分类
     */
    @TableField("ClassType")
    private String ClassType;

    /**
     * 正文-图文
     */
    private String Context;

    /**
     * 来源
     */
    private String Source;

    /**
     * 视频封面
     */
    @TableField("ImgUrl")
    private String ImgUrl;

    /**
     * 链接
     */
    @TableField("LinkUrl")
    private String LinkUrl;

    /**
     * 购买积分
     */
    @TableField("BuyScore")
    private Integer BuyScore;

    @TableField("CreateTime")
    private Date CreateTime;

    /**
     * 发布时间
     */
    @TableField("PushTime")
    private Date PushTime;

    private Integer Checked;

    private String Explain;

    /**
     * 发布人
     */
    @TableField("AccountId")
    private String AccountId;

    /**
     * 阅读量
     */
    @TableField("ReadSum")
    private Integer ReadSum;

    /**
     * 奖励总积分
     */
    @TableField("RewardScoreSum")
    private Integer RewardScoreSum;

    /**
     * 剩余奖励积分
     */
    @TableField("RewardScoreNum")
    private Integer RewardScoreNum;

    /**
     * 原作者
     */
    @TableField("SourceName")
    private String SourceName;

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

    @TableField("ContextText")
    private String ContextText;

    /**
     * 修改者
     */
    @TableField("ModifyUser")
    private String ModifyUser;

    /**
     * 数据状态
     */
    @TableField("DataStatus")
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
    public String getSummary() {
        return Summary;
    }

    public void setSummary(String Summary) {
        this.Summary = Summary;
    }
    public String getTags() {
        return Tags;
    }

    public void setTags(String Tags) {
        this.Tags = Tags;
    }
    public String getClassType() {
        return ClassType;
    }

    public void setClassType(String ClassType) {
        this.ClassType = ClassType;
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
    public String getImgUrl() {
        return ImgUrl;
    }

    public void setImgUrl(String ImgUrl) {
        this.ImgUrl = ImgUrl;
    }
    public String getLinkUrl() {
        return LinkUrl;
    }

    public void setLinkUrl(String LinkUrl) {
        this.LinkUrl = LinkUrl;
    }
    public Integer getBuyScore() {
        return BuyScore;
    }

    public void setBuyScore(Integer BuyScore) {
        this.BuyScore = BuyScore;
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
    public String getSourceName() {
        return SourceName;
    }

    public void setSourceName(String SourceName) {
        this.SourceName = SourceName;
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
        return "NewsVideoInfo{" +
        "Id=" + Id +
        ", Title=" + Title +
        ", Summary=" + Summary +
        ", Tags=" + Tags +
        ", ClassType=" + ClassType +
        ", Context=" + Context +
        ", Source=" + Source +
        ", ImgUrl=" + ImgUrl +
        ", LinkUrl=" + LinkUrl +
        ", BuyScore=" + BuyScore +
        ", CreateTime=" + CreateTime +
        ", PushTime=" + PushTime +
        ", Checked=" + Checked +
        ", Explain=" + Explain +
        ", AccountId=" + AccountId +
        ", ReadSum=" + ReadSum +
        ", RewardScoreSum=" + RewardScoreSum +
        ", RewardScoreNum=" + RewardScoreNum +
        ", SourceName=" + SourceName +
        ", Score=" + Score +
        ", RechargeScore=" + RechargeScore +
        ", RewardScore=" + RewardScore +
        ", CreaterId=" + CreaterId +
        ", ContextText=" + ContextText +
        ", ModifyUser=" + ModifyUser +
        ", DataStatus=" + DataStatus +
        "}";
    }
}
