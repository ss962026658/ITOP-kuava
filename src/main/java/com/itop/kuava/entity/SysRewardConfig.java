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
public class SysRewardConfig extends Model<SysRewardConfig> {

    private static final long serialVersionUID = 1L;

    private String Id;

    /**
     * 奖励项目名称
     */
    private String FName;

    /**
     * 积分
     */
    private Integer Score;

    /**
     * 类型
     */
    private String FType;

    /**
     * 百分比
     */
    private Integer Percent;

    /**
     * 描述
     */
    private String Describe;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }
    public Integer getScore() {
        return Score;
    }

    public void setScore(Integer Score) {
        this.Score = Score;
    }
    public String getFType() {
        return FType;
    }

    public void setFType(String FType) {
        this.FType = FType;
    }
    public Integer getPercent() {
        return Percent;
    }

    public void setPercent(Integer Percent) {
        this.Percent = Percent;
    }
    public String getDescribe() {
        return Describe;
    }

    public void setDescribe(String Describe) {
        this.Describe = Describe;
    }

    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

    @Override
    public String toString() {
        return "SysRewardConfig{" +
        "Id=" + Id +
        ", FName=" + FName +
        ", Score=" + Score +
        ", FType=" + FType +
        ", Percent=" + Percent +
        ", Describe=" + Describe +
        "}";
    }
}
