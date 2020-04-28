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
public class CrmCustomerInfo extends Model<CrmCustomerInfo> {

    private static final long serialVersionUID = 1L;

    private String Id;

    private String AccountId;

    /**
     * 头像
     */
    private String HeadImg;

    /**
     * 中文名
     */
    private String CnName;

    /**
     * 英文名
     */
    private String EnName;

    /**
     * 别名
     */
    private String AliasName;

    /**
     * 国籍
     */
    private String Nationality;

    /**
     * 星座
     */
    private String Constellation;

    /**
     * 出生地
     */
    private String BirthPlace;

    /**
     * 出生日期
     */
    private Date BirthDate;

    /**
     * 职业
     */
    private String Occupation;

    /**
     * 毕业院校
     */
    private String University;

    /**
     * 个人简介
     */
    private String Introduction;

    /**
     * 人物教育经历(可用富编辑器)
     */
    private String EducationalExperience;

    /**
     * 获奖记录(可用富编辑器)
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
     * 性别
     */
    private String Gender;

    private String Mobile;

    private String Email;

    /**
     * 工作时间
     */
    private String WorkDate;

    /**
     * 求职状态
     */
    private String WorkStatus;

    /**
     * 现在居住地
     */
    private String LiveAddress;

    /**
     * 工作经历
     */
    private String WorkExperience;

    /**
     * 项目经历
     */
    private String ProjectExperience;

    /**
     * 其他说明
     */
    private String Context;

    /**
     * 年收入
     */
    private String YearMoney;

    /**
     * 政治面貌
     */
    private String Political;

    /**
     * 简历的头像
     */
    private String ResumeImg;

    /**
     * 关注数
     */
    private Integer ConcernNum;

    private String Weibo;

    private String Facebook;

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
    public String getHeadImg() {
        return HeadImg;
    }

    public void setHeadImg(String HeadImg) {
        this.HeadImg = HeadImg;
    }
    public String getCnName() {
        return CnName;
    }

    public void setCnName(String CnName) {
        this.CnName = CnName;
    }
    public String getEnName() {
        return EnName;
    }

    public void setEnName(String EnName) {
        this.EnName = EnName;
    }
    public String getAliasName() {
        return AliasName;
    }

    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }
    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }
    public String getConstellation() {
        return Constellation;
    }

    public void setConstellation(String Constellation) {
        this.Constellation = Constellation;
    }
    public String getBirthPlace() {
        return BirthPlace;
    }

    public void setBirthPlace(String BirthPlace) {
        this.BirthPlace = BirthPlace;
    }
    public Date getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(Date BirthDate) {
        this.BirthDate = BirthDate;
    }
    public String getOccupation() {
        return Occupation;
    }

    public void setOccupation(String Occupation) {
        this.Occupation = Occupation;
    }
    public String getUniversity() {
        return University;
    }

    public void setUniversity(String University) {
        this.University = University;
    }
    public String getIntroduction() {
        return Introduction;
    }

    public void setIntroduction(String Introduction) {
        this.Introduction = Introduction;
    }
    public String getEducationalExperience() {
        return EducationalExperience;
    }

    public void setEducationalExperience(String EducationalExperience) {
        this.EducationalExperience = EducationalExperience;
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
    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }
    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    public String getWorkDate() {
        return WorkDate;
    }

    public void setWorkDate(String WorkDate) {
        this.WorkDate = WorkDate;
    }
    public String getWorkStatus() {
        return WorkStatus;
    }

    public void setWorkStatus(String WorkStatus) {
        this.WorkStatus = WorkStatus;
    }
    public String getLiveAddress() {
        return LiveAddress;
    }

    public void setLiveAddress(String LiveAddress) {
        this.LiveAddress = LiveAddress;
    }
    public String getWorkExperience() {
        return WorkExperience;
    }

    public void setWorkExperience(String WorkExperience) {
        this.WorkExperience = WorkExperience;
    }
    public String getProjectExperience() {
        return ProjectExperience;
    }

    public void setProjectExperience(String ProjectExperience) {
        this.ProjectExperience = ProjectExperience;
    }
    public String getContext() {
        return Context;
    }

    public void setContext(String Context) {
        this.Context = Context;
    }
    public String getYearMoney() {
        return YearMoney;
    }

    public void setYearMoney(String YearMoney) {
        this.YearMoney = YearMoney;
    }
    public String getPolitical() {
        return Political;
    }

    public void setPolitical(String Political) {
        this.Political = Political;
    }
    public String getResumeImg() {
        return ResumeImg;
    }

    public void setResumeImg(String ResumeImg) {
        this.ResumeImg = ResumeImg;
    }
    public Integer getConcernNum() {
        return ConcernNum;
    }

    public void setConcernNum(Integer ConcernNum) {
        this.ConcernNum = ConcernNum;
    }
    public String getWeibo() {
        return Weibo;
    }

    public void setWeibo(String Weibo) {
        this.Weibo = Weibo;
    }
    public String getFacebook() {
        return Facebook;
    }

    public void setFacebook(String Facebook) {
        this.Facebook = Facebook;
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

    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

    @Override
    public String toString() {
        return "CrmCustomerInfo{" +
        "Id=" + Id +
        ", AccountId=" + AccountId +
        ", HeadImg=" + HeadImg +
        ", CnName=" + CnName +
        ", EnName=" + EnName +
        ", AliasName=" + AliasName +
        ", Nationality=" + Nationality +
        ", Constellation=" + Constellation +
        ", BirthPlace=" + BirthPlace +
        ", BirthDate=" + BirthDate +
        ", Occupation=" + Occupation +
        ", University=" + University +
        ", Introduction=" + Introduction +
        ", EducationalExperience=" + EducationalExperience +
        ", PrizeRecord=" + PrizeRecord +
        ", DataStatus=" + DataStatus +
        ", CreateTime=" + CreateTime +
        ", Gender=" + Gender +
        ", Mobile=" + Mobile +
        ", Email=" + Email +
        ", WorkDate=" + WorkDate +
        ", WorkStatus=" + WorkStatus +
        ", LiveAddress=" + LiveAddress +
        ", WorkExperience=" + WorkExperience +
        ", ProjectExperience=" + ProjectExperience +
        ", Context=" + Context +
        ", YearMoney=" + YearMoney +
        ", Political=" + Political +
        ", ResumeImg=" + ResumeImg +
        ", ConcernNum=" + ConcernNum +
        ", Weibo=" + Weibo +
        ", Facebook=" + Facebook +
        ", ProvinceId=" + ProvinceId +
        ", ProvinceName=" + ProvinceName +
        ", CityId=" + CityId +
        ", CityName=" + CityName +
        ", AreaId=" + AreaId +
        ", AreaName=" + AreaName +
        "}";
    }
}
