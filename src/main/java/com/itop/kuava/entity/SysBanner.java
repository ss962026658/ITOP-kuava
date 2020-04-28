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
public class SysBanner extends Model<SysBanner> {

    private static final long serialVersionUID = 1L;

    private String Id;

    /**
     * 购买者
     */
    private String AccountId;

    /**
     * 图片
     */
    private String ImgUrl;

    /**
     * 跳转链接
     */
    private String LinkUrl;

    /**
     * 创建时间
     */
    private Date CreateTime;

    /**
     * 广告位置:Left1,Left2,Left3,Left4,Right1
     */
    private String Place;

    /**
     * 详情
     */
    private String Context;

    /**
     * 起始时间
     */
    private Date StartTime;

    /**
     * 结束时间
     */
    private Date EndTime;

    /**
     * 出售状态:0可售；1：已售
     */
    private Integer SaleStatus;

    private Integer Checked;

    private String FPage;

    private String Title;

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

    private Integer ReadSum;

    /**
     * 修改者
     */
    private String ModifyUser;

    private String FPageName;

    private String PlaceName;

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
    public Date getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Date CreateTime) {
        this.CreateTime = CreateTime;
    }
    public String getPlace() {
        return Place;
    }

    public void setPlace(String Place) {
        this.Place = Place;
    }
    public String getContext() {
        return Context;
    }

    public void setContext(String Context) {
        this.Context = Context;
    }
    public Date getStartTime() {
        return StartTime;
    }

    public void setStartTime(Date StartTime) {
        this.StartTime = StartTime;
    }
    public Date getEndTime() {
        return EndTime;
    }

    public void setEndTime(Date EndTime) {
        this.EndTime = EndTime;
    }
    public Integer getSaleStatus() {
        return SaleStatus;
    }

    public void setSaleStatus(Integer SaleStatus) {
        this.SaleStatus = SaleStatus;
    }
    public Integer getChecked() {
        return Checked;
    }

    public void setChecked(Integer Checked) {
        this.Checked = Checked;
    }
    public String getFPage() {
        return FPage;
    }

    public void setFPage(String FPage) {
        this.FPage = FPage;
    }
    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
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
    public Integer getReadSum() {
        return ReadSum;
    }

    public void setReadSum(Integer ReadSum) {
        this.ReadSum = ReadSum;
    }
    public String getModifyUser() {
        return ModifyUser;
    }

    public void setModifyUser(String ModifyUser) {
        this.ModifyUser = ModifyUser;
    }
    public String getFPageName() {
        return FPageName;
    }

    public void setFPageName(String FPageName) {
        this.FPageName = FPageName;
    }
    public String getPlaceName() {
        return PlaceName;
    }

    public void setPlaceName(String PlaceName) {
        this.PlaceName = PlaceName;
    }

    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

    @Override
    public String toString() {
        return "SysBanner{" +
        "Id=" + Id +
        ", AccountId=" + AccountId +
        ", ImgUrl=" + ImgUrl +
        ", LinkUrl=" + LinkUrl +
        ", CreateTime=" + CreateTime +
        ", Place=" + Place +
        ", Context=" + Context +
        ", StartTime=" + StartTime +
        ", EndTime=" + EndTime +
        ", SaleStatus=" + SaleStatus +
        ", Checked=" + Checked +
        ", FPage=" + FPage +
        ", Title=" + Title +
        ", Explain=" + Explain +
        ", Score=" + Score +
        ", RechargeScore=" + RechargeScore +
        ", RewardScore=" + RewardScore +
        ", CreaterId=" + CreaterId +
        ", ReadSum=" + ReadSum +
        ", ModifyUser=" + ModifyUser +
        ", FPageName=" + FPageName +
        ", PlaceName=" + PlaceName +
        "}";
    }
}
