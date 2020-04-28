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
@TableName("CrmAccountInfo")
public class CrmAccountInfo extends Model<CrmAccountInfo> {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.UUID)
    private String Id;

    private String Mobile;

    private String Email;

    /**
     * 8位加密密码的秘钥,随机
     */
    @TableField("UserSecret")
    private String UserSecret;

    private String Password;

    /**
     * 登录时间
     */
    @TableField("LoginTime")
    private Date LoginTime;

    /**
     * 创建时间
     */
    @TableField("CreateTime")
    private Date CreateTime;

    /**
     * 邀请码
     */
    @TableField("InviteCode")
    private String InviteCode;

    /**
     * 数据状态
     */
    @TableField("DataStatus")
    private Integer DataStatus;

    /**
     * 审核
     */
    private Integer Checked;

    /**
     * 账号类型：1：个人；2：个人媒体；3：企业媒体；4：企业
     */
    @TableField("AccountType")
    private Integer AccountType;

    /**
     * 充值积分
     */
    @TableField("RechargeScore")
    private Long RechargeScore;

    /**
     * 关注
     */
    @TableField("ConcernNum")
    private Integer ConcernNum;

    /**
     * 排名
     */
    @TableField("PositionNum")
    private Integer PositionNum;

    /**
     * 综合指数
     */
    @TableField("Composite")
    private Integer Composite;

    /**
     * 审核不通过时的缘由
     */
    private String Explain;

    @TableField("NickName")
    private String NickName;

    /**
     * 管理员姓名
     */
    @TableField("AdminName")
    private String AdminName;

    /**
     * 管理员手机
     */
    @TableField("AdminMobile")
    private String AdminMobile;

    /**
     * 奖励积分
     */
    @TableField("RewardScore")
    private Long RewardScore;

    /**
     * 注册时填写的邀请码
     */
    @TableField("RegisterInviteCode")
    private String RegisterInviteCode;

    @TableField("CreaterId")
    private String CreaterId;

    /**
     * 邀请注册的二维码
     */
    @TableField("InviteImg")
    private String InviteImg;

    /**
     * 个人二维码
     */
    @TableField("QrCode")
    private String QrCode;

    /**
     * 快讯文章数
     */
    @TableField("ExpressCount")
    private Long ExpressCount;

    /**
     * 资讯文章数
     */
    @TableField("InformationCount")
    private Long InformationCount;

    /**
     * 培训文章数
     */
    @TableField("TrainCount")
    private Long TrainCount;

    /**
     * 招聘文章数
     */
    @TableField("RecruitCount")
    private Long RecruitCount;

    /**
     * 视频文章数
     */
    @TableField("VideoCount")
    private Long VideoCount;

    /**
     * 浏览量总数
     */
    @TableField("ReadSum")
    private Long ReadSum;

    /**
     * 广告总数
     */
    @TableField("AdCount")
    private Long AdCount;

    /**
     * 是否是节点账号：0：否；1：是
     */
    @TableField("IsPointAccount")
    private Integer IsPointAccount;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
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
    public String getUserSecret() {
        return UserSecret;
    }

    public void setUserSecret(String UserSecret) {
        this.UserSecret = UserSecret;
    }
    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    public Date getLoginTime() {
        return LoginTime;
    }

    public void setLoginTime(Date LoginTime) {
        this.LoginTime = LoginTime;
    }
    public Date getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Date CreateTime) {
        this.CreateTime = CreateTime;
    }
    public String getInviteCode() {
        return InviteCode;
    }

    public void setInviteCode(String InviteCode) {
        this.InviteCode = InviteCode;
    }
    public Integer getDataStatus() {
        return DataStatus;
    }

    public void setDataStatus(Integer DataStatus) {
        this.DataStatus = DataStatus;
    }
    public Integer getChecked() {
        return Checked;
    }

    public void setChecked(Integer Checked) {
        this.Checked = Checked;
    }
    public Integer getAccountType() {
        return AccountType;
    }

    public void setAccountType(Integer AccountType) {
        this.AccountType = AccountType;
    }
    public Long getRechargeScore() {
        return RechargeScore;
    }

    public void setRechargeScore(Long RechargeScore) {
        this.RechargeScore = RechargeScore;
    }
    public Integer getConcernNum() {
        return ConcernNum;
    }

    public void setConcernNum(Integer ConcernNum) {
        this.ConcernNum = ConcernNum;
    }
    public Integer getPositionNum() {
        return PositionNum;
    }

    public void setPositionNum(Integer PositionNum) {
        this.PositionNum = PositionNum;
    }
    public Integer getComposite() {
        return Composite;
    }

    public void setComposite(Integer Composite) {
        this.Composite = Composite;
    }
    public String getExplain() {
        return Explain;
    }

    public void setExplain(String Explain) {
        this.Explain = Explain;
    }
    public String getNickName() {
        return NickName;
    }

    public void setNickName(String NickName) {
        this.NickName = NickName;
    }
    public String getAdminName() {
        return AdminName;
    }

    public void setAdminName(String AdminName) {
        this.AdminName = AdminName;
    }
    public String getAdminMobile() {
        return AdminMobile;
    }

    public void setAdminMobile(String AdminMobile) {
        this.AdminMobile = AdminMobile;
    }
    public Long getRewardScore() {
        return RewardScore;
    }

    public void setRewardScore(Long RewardScore) {
        this.RewardScore = RewardScore;
    }
    public String getRegisterInviteCode() {
        return RegisterInviteCode;
    }

    public void setRegisterInviteCode(String RegisterInviteCode) {
        this.RegisterInviteCode = RegisterInviteCode;
    }
    public String getCreaterId() {
        return CreaterId;
    }

    public void setCreaterId(String CreaterId) {
        this.CreaterId = CreaterId;
    }
    public String getInviteImg() {
        return InviteImg;
    }

    public void setInviteImg(String InviteImg) {
        this.InviteImg = InviteImg;
    }
    public String getQrCode() {
        return QrCode;
    }

    public void setQrCode(String QrCode) {
        this.QrCode = QrCode;
    }
    public Long getExpressCount() {
        return ExpressCount;
    }

    public void setExpressCount(Long ExpressCount) {
        this.ExpressCount = ExpressCount;
    }
    public Long getInformationCount() {
        return InformationCount;
    }

    public void setInformationCount(Long InformationCount) {
        this.InformationCount = InformationCount;
    }
    public Long getTrainCount() {
        return TrainCount;
    }

    public void setTrainCount(Long TrainCount) {
        this.TrainCount = TrainCount;
    }
    public Long getRecruitCount() {
        return RecruitCount;
    }

    public void setRecruitCount(Long RecruitCount) {
        this.RecruitCount = RecruitCount;
    }
    public Long getVideoCount() {
        return VideoCount;
    }

    public void setVideoCount(Long VideoCount) {
        this.VideoCount = VideoCount;
    }
    public Long getReadSum() {
        return ReadSum;
    }

    public void setReadSum(Long ReadSum) {
        this.ReadSum = ReadSum;
    }
    public Long getAdCount() {
        return AdCount;
    }

    public void setAdCount(Long AdCount) {
        this.AdCount = AdCount;
    }
    public Integer getIsPointAccount() {
        return IsPointAccount;
    }

    public void setIsPointAccount(Integer IsPointAccount) {
        this.IsPointAccount = IsPointAccount;
    }

    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

    @Override
    public String toString() {
        return "CrmAccountInfo{" +
        "Id=" + Id +
        ", Mobile=" + Mobile +
        ", Email=" + Email +
        ", UserSecret=" + UserSecret +
        ", Password=" + Password +
        ", LoginTime=" + LoginTime +
        ", CreateTime=" + CreateTime +
        ", InviteCode=" + InviteCode +
        ", DataStatus=" + DataStatus +
        ", Checked=" + Checked +
        ", AccountType=" + AccountType +
        ", RechargeScore=" + RechargeScore +
        ", ConcernNum=" + ConcernNum +
        ", PositionNum=" + PositionNum +
        ", Composite=" + Composite +
        ", Explain=" + Explain +
        ", NickName=" + NickName +
        ", AdminName=" + AdminName +
        ", AdminMobile=" + AdminMobile +
        ", RewardScore=" + RewardScore +
        ", RegisterInviteCode=" + RegisterInviteCode +
        ", CreaterId=" + CreaterId +
        ", InviteImg=" + InviteImg +
        ", QrCode=" + QrCode +
        ", ExpressCount=" + ExpressCount +
        ", InformationCount=" + InformationCount +
        ", TrainCount=" + TrainCount +
        ", RecruitCount=" + RecruitCount +
        ", VideoCount=" + VideoCount +
        ", ReadSum=" + ReadSum +
        ", AdCount=" + AdCount +
        ", IsPointAccount=" + IsPointAccount +
        "}";
    }
}
