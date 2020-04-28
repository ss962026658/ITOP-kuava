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
public class CrmCustomerAuth extends Model<CrmCustomerAuth> {

    private static final long serialVersionUID = 1L;

    private String Id;

    private String AccountId;

    /**
     * 身份证号码
     */
    private String IdCardCode;

    /**
     * 真实姓名
     */
    private String RealName;

    private String IdCardImg1;

    private String IdCardImg2;

    private String IdCardImg3;

    private Date CreateTime;

    /**
     * 认证审核
     */
    private Integer Checked;

    /**
     * 认证审核信息
     */
    private String AuthMsg;

    /**
     * 审核人
     */
    private String CheckUser;

    private Date CheckTime;

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
    public String getIdCardCode() {
        return IdCardCode;
    }

    public void setIdCardCode(String IdCardCode) {
        this.IdCardCode = IdCardCode;
    }
    public String getRealName() {
        return RealName;
    }

    public void setRealName(String RealName) {
        this.RealName = RealName;
    }
    public String getIdCardImg1() {
        return IdCardImg1;
    }

    public void setIdCardImg1(String IdCardImg1) {
        this.IdCardImg1 = IdCardImg1;
    }
    public String getIdCardImg2() {
        return IdCardImg2;
    }

    public void setIdCardImg2(String IdCardImg2) {
        this.IdCardImg2 = IdCardImg2;
    }
    public String getIdCardImg3() {
        return IdCardImg3;
    }

    public void setIdCardImg3(String IdCardImg3) {
        this.IdCardImg3 = IdCardImg3;
    }
    public Date getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Date CreateTime) {
        this.CreateTime = CreateTime;
    }
    public Integer getChecked() {
        return Checked;
    }

    public void setChecked(Integer Checked) {
        this.Checked = Checked;
    }
    public String getAuthMsg() {
        return AuthMsg;
    }

    public void setAuthMsg(String AuthMsg) {
        this.AuthMsg = AuthMsg;
    }
    public String getCheckUser() {
        return CheckUser;
    }

    public void setCheckUser(String CheckUser) {
        this.CheckUser = CheckUser;
    }
    public Date getCheckTime() {
        return CheckTime;
    }

    public void setCheckTime(Date CheckTime) {
        this.CheckTime = CheckTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

    @Override
    public String toString() {
        return "CrmCustomerAuth{" +
        "Id=" + Id +
        ", AccountId=" + AccountId +
        ", IdCardCode=" + IdCardCode +
        ", RealName=" + RealName +
        ", IdCardImg1=" + IdCardImg1 +
        ", IdCardImg2=" + IdCardImg2 +
        ", IdCardImg3=" + IdCardImg3 +
        ", CreateTime=" + CreateTime +
        ", Checked=" + Checked +
        ", AuthMsg=" + AuthMsg +
        ", CheckUser=" + CheckUser +
        ", CheckTime=" + CheckTime +
        "}";
    }
}
