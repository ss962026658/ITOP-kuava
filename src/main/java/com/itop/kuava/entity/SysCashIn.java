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
public class SysCashIn extends Model<SysCashIn> {

    private static final long serialVersionUID = 1L;

    private String Id;

    /**
     * 充值金额
     */
    private Integer Money;

    /**
     * 兑换积分数
     */
    private Integer Score;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    public Integer getMoney() {
        return Money;
    }

    public void setMoney(Integer Money) {
        this.Money = Money;
    }
    public Integer getScore() {
        return Score;
    }

    public void setScore(Integer Score) {
        this.Score = Score;
    }

    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

    @Override
    public String toString() {
        return "SysCashIn{" +
        "Id=" + Id +
        ", Money=" + Money +
        ", Score=" + Score +
        "}";
    }
}
