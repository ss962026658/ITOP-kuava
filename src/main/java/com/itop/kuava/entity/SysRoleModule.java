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
public class SysRoleModule extends Model<SysRoleModule> {

    private static final long serialVersionUID = 1L;

    private String Id;

    private String FModuleId;

    private String FRoleId;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    public String getFModuleId() {
        return FModuleId;
    }

    public void setFModuleId(String FModuleId) {
        this.FModuleId = FModuleId;
    }
    public String getFRoleId() {
        return FRoleId;
    }

    public void setFRoleId(String FRoleId) {
        this.FRoleId = FRoleId;
    }

    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

    @Override
    public String toString() {
        return "SysRoleModule{" +
        "Id=" + Id +
        ", FModuleId=" + FModuleId +
        ", FRoleId=" + FRoleId +
        "}";
    }
}
