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
public class CrmAccountPay extends Model<CrmAccountPay> {

    private static final long serialVersionUID = 1L;

    private String Id;

    private String AccountId;

    /**
     * 支付宝账号
     */
    private String AliPay;

    /**
     * 微信账号
     */
    private String TenPay;

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
    public String getAliPay() {
        return AliPay;
    }

    public void setAliPay(String AliPay) {
        this.AliPay = AliPay;
    }
    public String getTenPay() {
        return TenPay;
    }

    public void setTenPay(String TenPay) {
        this.TenPay = TenPay;
    }

    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

    @Override
    public String toString() {
        return "CrmAccountPay{" +
        "Id=" + Id +
        ", AccountId=" + AccountId +
        ", AliPay=" + AliPay +
        ", TenPay=" + TenPay +
        "}";
    }
}
