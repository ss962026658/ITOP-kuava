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
public class CrmCompanyInfo extends Model<CrmCompanyInfo> {

    private static final long serialVersionUID = 1L;

    private String Id;

    private String AccountId;

    /**
     * 媒体名称
     */
    private String MediaName;

    /**
     * 企业名称
     */
    private String CompanyName;

    /**
     * 成立时间
     */
    private Date EstablishDate;

    /**
     * 应用下载地址
     */
    private String DownLoadUrl;

    /**
     * 官网
     */
    private String CompanyUrl;

    /**
     * 简介
     */
    private String Introduction;

    /**
     * 获得奖项(可用富编辑器)
     */
    private String PrizeRecord;

    /**
     * 数据状态
     */
    private Integer DataStatus;

    /**
     * 创建时间
     */
    private Date CreateTime;

    /**
     * 企业logo
     */
    private String ImgUrl;

    /**
     * 标语口号
     */
    private String SLogan;

    /**
     * 营业执照
     */
    private String BusinessImgUrl;

    /**
     * 企业邮箱
     */
    private String Email;

    /**
     * 真实姓名
     */
    private String RealName;

    /**
     * 个人媒体的个人身份证
     */
    private String IdentityCard;

    /**
     * 身份证正面
     */
    private String IdentityImg1;

    /**
     * 身份证反面
     */
    private String IdentityImg2;

    /**
     * 企业组织代码
     */
    private String OrganizationCode;

    private String Mobile;

    private Integer ConcernNum;

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
    public String getMediaName() {
        return MediaName;
    }

    public void setMediaName(String MediaName) {
        this.MediaName = MediaName;
    }
    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }
    public Date getEstablishDate() {
        return EstablishDate;
    }

    public void setEstablishDate(Date EstablishDate) {
        this.EstablishDate = EstablishDate;
    }
    public String getDownLoadUrl() {
        return DownLoadUrl;
    }

    public void setDownLoadUrl(String DownLoadUrl) {
        this.DownLoadUrl = DownLoadUrl;
    }
    public String getCompanyUrl() {
        return CompanyUrl;
    }

    public void setCompanyUrl(String CompanyUrl) {
        this.CompanyUrl = CompanyUrl;
    }
    public String getIntroduction() {
        return Introduction;
    }

    public void setIntroduction(String Introduction) {
        this.Introduction = Introduction;
    }
    public String getPrizeRecord() {
        return PrizeRecord;
    }

    public void setPrizeRecord(String PrizeRecord) {
        this.PrizeRecord = PrizeRecord;
    }
    public Integer getDataStatus() {
        return DataStatus;
    }

    public void setDataStatus(Integer DataStatus) {
        this.DataStatus = DataStatus;
    }
    public Date getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Date CreateTime) {
        this.CreateTime = CreateTime;
    }
    public String getImgUrl() {
        return ImgUrl;
    }

    public void setImgUrl(String ImgUrl) {
        this.ImgUrl = ImgUrl;
    }
    public String getSLogan() {
        return SLogan;
    }

    public void setSLogan(String SLogan) {
        this.SLogan = SLogan;
    }
    public String getBusinessImgUrl() {
        return BusinessImgUrl;
    }

    public void setBusinessImgUrl(String BusinessImgUrl) {
        this.BusinessImgUrl = BusinessImgUrl;
    }
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    public String getRealName() {
        return RealName;
    }

    public void setRealName(String RealName) {
        this.RealName = RealName;
    }
    public String getIdentityCard() {
        return IdentityCard;
    }

    public void setIdentityCard(String IdentityCard) {
        this.IdentityCard = IdentityCard;
    }
    public String getIdentityImg1() {
        return IdentityImg1;
    }

    public void setIdentityImg1(String IdentityImg1) {
        this.IdentityImg1 = IdentityImg1;
    }
    public String getIdentityImg2() {
        return IdentityImg2;
    }

    public void setIdentityImg2(String IdentityImg2) {
        this.IdentityImg2 = IdentityImg2;
    }
    public String getOrganizationCode() {
        return OrganizationCode;
    }

    public void setOrganizationCode(String OrganizationCode) {
        this.OrganizationCode = OrganizationCode;
    }
    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }
    public Integer getConcernNum() {
        return ConcernNum;
    }

    public void setConcernNum(Integer ConcernNum) {
        this.ConcernNum = ConcernNum;
    }

    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

    @Override
    public String toString() {
        return "CrmCompanyInfo{" +
        "Id=" + Id +
        ", AccountId=" + AccountId +
        ", MediaName=" + MediaName +
        ", CompanyName=" + CompanyName +
        ", EstablishDate=" + EstablishDate +
        ", DownLoadUrl=" + DownLoadUrl +
        ", CompanyUrl=" + CompanyUrl +
        ", Introduction=" + Introduction +
        ", PrizeRecord=" + PrizeRecord +
        ", DataStatus=" + DataStatus +
        ", CreateTime=" + CreateTime +
        ", ImgUrl=" + ImgUrl +
        ", SLogan=" + SLogan +
        ", BusinessImgUrl=" + BusinessImgUrl +
        ", Email=" + Email +
        ", RealName=" + RealName +
        ", IdentityCard=" + IdentityCard +
        ", IdentityImg1=" + IdentityImg1 +
        ", IdentityImg2=" + IdentityImg2 +
        ", OrganizationCode=" + OrganizationCode +
        ", Mobile=" + Mobile +
        ", ConcernNum=" + ConcernNum +
        "}";
    }
}
