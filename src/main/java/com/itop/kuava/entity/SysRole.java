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
public class SysRole extends Model<SysRole> {

    private static final long serialVersionUID = 1L;

    private String Id;

    private String EnCode;

    private String FullName;

    private Integer DataStatus;

    private Date Createtime;

    private String CreateUserId;

    private String Permissions;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    public String getEnCode() {
        return EnCode;
    }

    public void setEnCode(String EnCode) {
        this.EnCode = EnCode;
    }
    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }
    public Integer getDataStatus() {
        return DataStatus;
    }

    public void setDataStatus(Integer DataStatus) {
        this.DataStatus = DataStatus;
    }
    public Date getCreatetime() {
        return Createtime;
    }

    public void setCreatetime(Date Createtime) {
        this.Createtime = Createtime;
    }
    public String getCreateUserId() {
        return CreateUserId;
    }

    public void setCreateUserId(String CreateUserId) {
        this.CreateUserId = CreateUserId;
    }
    public String getPermissions() {
        return Permissions;
    }

    public void setPermissions(String Permissions) {
        this.Permissions = Permissions;
    }

    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

    @Override
    public String toString() {
        return "SysRole{" +
        "Id=" + Id +
        ", EnCode=" + EnCode +
        ", FullName=" + FullName +
        ", DataStatus=" + DataStatus +
        ", Createtime=" + Createtime +
        ", CreateUserId=" + CreateUserId +
        ", Permissions=" + Permissions +
        "}";
    }
}
