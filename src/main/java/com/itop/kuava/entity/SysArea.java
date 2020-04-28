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
public class SysArea extends Model<SysArea> {

    private static final long serialVersionUID = 1L;

    private String Name;

    private String FullName;

    private String ShortName;

    private String PinYin;

    private String Id;

    private String ParentId;

    private Integer FLevel;

    private String Code;

    private String ZipCode;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }
    public String getShortName() {
        return ShortName;
    }

    public void setShortName(String ShortName) {
        this.ShortName = ShortName;
    }
    public String getPinYin() {
        return PinYin;
    }

    public void setPinYin(String PinYin) {
        this.PinYin = PinYin;
    }
    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    public String getParentId() {
        return ParentId;
    }

    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }
    public Integer getFLevel() {
        return FLevel;
    }

    public void setFLevel(Integer FLevel) {
        this.FLevel = FLevel;
    }
    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }
    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String ZipCode) {
        this.ZipCode = ZipCode;
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    @Override
    public String toString() {
        return "SysArea{" +
        "Name=" + Name +
        ", FullName=" + FullName +
        ", ShortName=" + ShortName +
        ", PinYin=" + PinYin +
        ", Id=" + Id +
        ", ParentId=" + ParentId +
        ", FLevel=" + FLevel +
        ", Code=" + Code +
        ", ZipCode=" + ZipCode +
        "}";
    }
}
