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
public class SysChargeConfig extends Model<SysChargeConfig> {

    private static final long serialVersionUID = 1L;

    private String Id;

    /**
     * 项目名称
     */
    private String FName;

    /**
     * 积分
     */
    private Integer Score;

    /**
     * 位置
     */
    private String Place;

    /**
     * 页面
     */
    private String FPage;

    /**
     * 类型
     */
    private String FType;

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
    public String getPlace() {
        return Place;
    }

    public void setPlace(String Place) {
        this.Place = Place;
    }
    public String getFPage() {
        return FPage;
    }

    public void setFPage(String FPage) {
        this.FPage = FPage;
    }
    public String getFType() {
        return FType;
    }

    public void setFType(String FType) {
        this.FType = FType;
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
        return "SysChargeConfig{" +
        "Id=" + Id +
        ", FName=" + FName +
        ", Score=" + Score +
        ", Place=" + Place +
        ", FPage=" + FPage +
        ", FType=" + FType +
        ", Describe=" + Describe +
        "}";
    }
}
