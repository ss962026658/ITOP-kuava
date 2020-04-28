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
public class SysAccount extends Model<SysAccount> {

    private static final long serialVersionUID = 1L;

    private String Id;

    private String Account;

    private String Password;

    private Integer DataStatus;

    private String UserSecret;

    private String RealName;

    private Date LoginTime;

    private Date CreateTime;

    private Integer IsAdmin;

    private String CreateId;

    private String RoleId;

    private String RoleName;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    public String getAccount() {
        return Account;
    }

    public void setAccount(String Account) {
        this.Account = Account;
    }
    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    public Integer getDataStatus() {
        return DataStatus;
    }

    public void setDataStatus(Integer DataStatus) {
        this.DataStatus = DataStatus;
    }
    public String getUserSecret() {
        return UserSecret;
    }

    public void setUserSecret(String UserSecret) {
        this.UserSecret = UserSecret;
    }
    public String getRealName() {
        return RealName;
    }

    public void setRealName(String RealName) {
        this.RealName = RealName;
    }
    public Date getLoginTime() {
        return LoginTime;
    }

    public void setLoginTime(Date LoginTime) {
        this.LoginTime = LoginTime;
    }
    public Date getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Date CreateTime) {
        this.CreateTime = CreateTime;
    }
    public Integer getIsAdmin() {
        return IsAdmin;
    }

    public void setIsAdmin(Integer IsAdmin) {
        this.IsAdmin = IsAdmin;
    }
    public String getCreateId() {
        return CreateId;
    }

    public void setCreateId(String CreateId) {
        this.CreateId = CreateId;
    }
    public String getRoleId() {
        return RoleId;
    }

    public void setRoleId(String RoleId) {
        this.RoleId = RoleId;
    }
    public String getRoleName() {
        return RoleName;
    }

    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

    @Override
    public String toString() {
        return "SysAccount{" +
        "Id=" + Id +
        ", Account=" + Account +
        ", Password=" + Password +
        ", DataStatus=" + DataStatus +
        ", UserSecret=" + UserSecret +
        ", RealName=" + RealName +
        ", LoginTime=" + LoginTime +
        ", CreateTime=" + CreateTime +
        ", IsAdmin=" + IsAdmin +
        ", CreateId=" + CreateId +
        ", RoleId=" + RoleId +
        ", RoleName=" + RoleName +
        "}";
    }
}
