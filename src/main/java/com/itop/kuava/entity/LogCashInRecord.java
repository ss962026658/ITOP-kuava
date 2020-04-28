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
public class LogCashInRecord extends Model<LogCashInRecord> {

    private static final long serialVersionUID = 1L;

    private String Id;

    private String AccountId;

    /**
     * 单位分
     */
    private Integer Money;

    private Date CreateTime;

    private String Describe;

    /**
     * 订单号
     */
    private String OutTradeNo;

    /**
     * 订单状态
     */
    private Integer Status;

    /**
     * 支付类型：1：支付宝；2：微信
     */
    private Integer PayType;

    private Integer Score;

    /**
     * 支付平台内部交易号
     */
    private String TradeNo;

    /**
     * 微信：OpenId
     */
    private String OpenId;

    /**
     * 买家支付宝用户号
     */
    private String BuyerId;

    /**
     * 买家支付宝账号
     */
    private String BuyerLogonId;

    private String NotifyTime;

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
    public Integer getMoney() {
        return Money;
    }

    public void setMoney(Integer Money) {
        this.Money = Money;
    }
    public Date getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Date CreateTime) {
        this.CreateTime = CreateTime;
    }
    public String getDescribe() {
        return Describe;
    }

    public void setDescribe(String Describe) {
        this.Describe = Describe;
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
    public Integer getPayType() {
        return PayType;
    }

    public void setPayType(Integer PayType) {
        this.PayType = PayType;
    }
    public Integer getScore() {
        return Score;
    }

    public void setScore(Integer Score) {
        this.Score = Score;
    }
    public String getTradeNo() {
        return TradeNo;
    }

    public void setTradeNo(String TradeNo) {
        this.TradeNo = TradeNo;
    }
    public String getOpenId() {
        return OpenId;
    }

    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }
    public String getBuyerId() {
        return BuyerId;
    }

    public void setBuyerId(String BuyerId) {
        this.BuyerId = BuyerId;
    }
    public String getBuyerLogonId() {
        return BuyerLogonId;
    }

    public void setBuyerLogonId(String BuyerLogonId) {
        this.BuyerLogonId = BuyerLogonId;
    }
    public String getNotifyTime() {
        return NotifyTime;
    }

    public void setNotifyTime(String NotifyTime) {
        this.NotifyTime = NotifyTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

    @Override
    public String toString() {
        return "LogCashInRecord{" +
        "Id=" + Id +
        ", AccountId=" + AccountId +
        ", Money=" + Money +
        ", CreateTime=" + CreateTime +
        ", Describe=" + Describe +
        ", OutTradeNo=" + OutTradeNo +
        ", Status=" + Status +
        ", PayType=" + PayType +
        ", Score=" + Score +
        ", TradeNo=" + TradeNo +
        ", OpenId=" + OpenId +
        ", BuyerId=" + BuyerId +
        ", BuyerLogonId=" + BuyerLogonId +
        ", NotifyTime=" + NotifyTime +
        "}";
    }
}
