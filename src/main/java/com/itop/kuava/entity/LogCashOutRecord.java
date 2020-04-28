package com.itop.kuava.entity;

import java.math.BigDecimal;
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
public class LogCashOutRecord extends Model<LogCashOutRecord> {

    private static final long serialVersionUID = 1L;

    private String Id;

    private String AccountId;

    private BigDecimal Money;

    private Date CreateTime;

    /**
     * 手续费
     */
    private BigDecimal Fee;

    private String Describe;

    /**
     * 交易流水号
     */
    private String TradeNo;

    /**
     * 订单号
     */
    private String OutTradeNo;

    /**
     * 订单状态
     */
    private Integer Status;

    private Date PayDate;

    /**
     * 微信支付时客户的标识
     */
    private String OpenId;

    /**
     * 支付宝账号
     */
    private String AliPay;

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
    public BigDecimal getMoney() {
        return Money;
    }

    public void setMoney(BigDecimal Money) {
        this.Money = Money;
    }
    public Date getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Date CreateTime) {
        this.CreateTime = CreateTime;
    }
    public BigDecimal getFee() {
        return Fee;
    }

    public void setFee(BigDecimal Fee) {
        this.Fee = Fee;
    }
    public String getDescribe() {
        return Describe;
    }

    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }
    public String getTradeNo() {
        return TradeNo;
    }

    public void setTradeNo(String TradeNo) {
        this.TradeNo = TradeNo;
    }
    public String getOutTradeNo() {
        return OutTradeNo;
    }

    public void setOutTradeNo(String OutTradeNo) {
        this.OutTradeNo = OutTradeNo;
    }
    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer Status) {
        this.Status = Status;
    }
    public Date getPayDate() {
        return PayDate;
    }

    public void setPayDate(Date PayDate) {
        this.PayDate = PayDate;
    }
    public String getOpenId() {
        return OpenId;
    }

    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }
    public String getAliPay() {
        return AliPay;
    }

    public void setAliPay(String AliPay) {
        this.AliPay = AliPay;
    }

    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

    @Override
    public String toString() {
        return "LogCashOutRecord{" +
        "Id=" + Id +
        ", AccountId=" + AccountId +
        ", Money=" + Money +
        ", CreateTime=" + CreateTime +
        ", Fee=" + Fee +
        ", Describe=" + Describe +
        ", TradeNo=" + TradeNo +
        ", OutTradeNo=" + OutTradeNo +
        ", Status=" + Status +
        ", PayDate=" + PayDate +
        ", OpenId=" + OpenId +
        ", AliPay=" + AliPay +
        "}";
    }
}
