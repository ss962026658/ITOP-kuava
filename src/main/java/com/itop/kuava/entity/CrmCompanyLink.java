package com.itop.kuava.entity;

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
public class CrmCompanyLink extends Model<CrmCompanyLink> {

    private static final long serialVersionUID = 1L;

    private String Id;

    private String AccountId;

    private String WeiXin;

    private String Mobile;

    private String Phone;

    private String LinkName;

    private String EMail;

    private String WhatsApp;

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
    public String getWeiXin() {
        return WeiXin;
    }

    public void setWeiXin(String WeiXin) {
        this.WeiXin = WeiXin;
    }
    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }
    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }
    public String getLinkName() {
        return LinkName;
    }

    public void setLinkName(String LinkName) {
        this.LinkName = LinkName;
    }
    public String getEMail() {
        return EMail;
    }

    public void setEMail(String EMail) {
        this.EMail = EMail;
    }
    public String getWhatsApp() {
        return WhatsApp;
    }

    public void setWhatsApp(String WhatsApp) {
        this.WhatsApp = WhatsApp;
    }

    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

    @Override
    public String toString() {
        return "CrmCompanyLink{" +
        "Id=" + Id +
        ", AccountId=" + AccountId +
        ", WeiXin=" + WeiXin +
        ", Mobile=" + Mobile +
        ", Phone=" + Phone +
        ", LinkName=" + LinkName +
        ", EMail=" + EMail +
        ", WhatsApp=" + WhatsApp +
        "}";
    }
}
