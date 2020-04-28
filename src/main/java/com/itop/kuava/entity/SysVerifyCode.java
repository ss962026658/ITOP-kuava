package com.itop.kuava.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ss
 * @since 2020-04-09
 */
@TableName("SysVerifyCode")
public class SysVerifyCode extends Model<SysVerifyCode> {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.UUID)
    private String Id;

    /**
     * 发送对象，如：手机或邮箱
     */
    @TableField("ToObject")
    private String ToObject;

    @TableField("CreateTime")
    private String CreateTime;

    /**
     * 验证码
     */
    @TableField("EnCode")
    private String EnCode;

    /**
     * 1:注册；2：登录：3：找回密码
     */
    @TableField("CodeType")
    private Integer CodeType;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    public String getToObject() {
        return ToObject;
    }

    public void setToObject(String ToObject) {
        this.ToObject = ToObject;
    }
    public String getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }
    public String getEnCode() {
        return EnCode;
    }

    public void setEnCode(String EnCode) {
        this.EnCode = EnCode;
    }
    public Integer getCodeType() {
        return CodeType;
    }

    public void setCodeType(Integer CodeType) {
        this.CodeType = CodeType;
    }

    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

    @Override
    public String toString() {
        return "SysVerifyCode{" +
        "Id=" + Id +
        ", ToObject=" + ToObject +
        ", CreateTime=" + CreateTime +
        ", EnCode=" + EnCode +
        ", CodeType=" + CodeType +
        "}";
    }
}
