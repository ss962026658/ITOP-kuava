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
public class SysRewardLevel extends Model<SysRewardLevel> {

    private static final long serialVersionUID = 1L;

    private String Id;

    /**
     * 奖励的积分
     */
    private Integer Score;

    /**
     * 等级
     */
    private Integer Level;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    public Integer getScore() {
        return Score;
    }

    public void setScore(Integer Score) {
        this.Score = Score;
    }
    public Integer getLevel() {
        return Level;
    }

    public void setLevel(Integer Level) {
        this.Level = Level;
    }

    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

    @Override
    public String toString() {
        return "SysRewardLevel{" +
        "Id=" + Id +
        ", Score=" + Score +
        ", Level=" + Level +
        "}";
    }
}
