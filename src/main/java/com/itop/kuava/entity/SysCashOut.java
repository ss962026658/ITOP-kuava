package com.itop.kuava.entity;

import java.math.BigDecimal;
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
public class SysCashOut extends Model<SysCashOut> {

    private static final long serialVersionUID = 1L;

    private String Id;

    /**
     * 提现手续费比例(千分比)
     */
    private Integer Percent;

    /**
     * 最少提现
     */
    private Integer Min;

    /**
     * 1积分相当于多少人民币
     */
    private BigDecimal Money;

    /**
     * 最大限额
     */
    private Integer Max;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    public Integer getPercent() {
        return Percent;
    }

    public void setPercent(Integer Percent) {
        this.Percent = Percent;
    }
    public Integer getMin() {
        return Min;
    }

    public void setMin(Integer Min) {
        this.Min = Min;
    }
    public BigDecimal getMoney() {
        return Money;
    }

    public void setMoney(BigDecimal Money) {
        this.Money = Money;
    }
    public Integer getMax() {
        return Max;
    }

    public void setMax(Integer Max) {
        this.Max = Max;
    }

    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

    @Override
    public String toString() {
        return "SysCashOut{" +
        "Id=" + Id +
        ", Percent=" + Percent +
        ", Min=" + Min +
        ", Money=" + Money +
        ", Max=" + Max +
        "}";
    }
}
