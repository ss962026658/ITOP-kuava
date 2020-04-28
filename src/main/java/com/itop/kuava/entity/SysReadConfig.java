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
public class SysReadConfig extends Model<SysReadConfig> {

    private static final long serialVersionUID = 1L;

    private String Id;

    private String Name;

    private Integer Value;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    public Integer getValue() {
        return Value;
    }

    public void setValue(Integer Value) {
        this.Value = Value;
    }

    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

    @Override
    public String toString() {
        return "SysReadConfig{" +
        "Id=" + Id +
        ", Name=" + Name +
        ", Value=" + Value +
        "}";
    }
}
