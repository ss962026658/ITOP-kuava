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
public class SysFooterInfo extends Model<SysFooterInfo> {

    private static final long serialVersionUID = 1L;

    private String Id;

    /**
     * 类型
     */
    private String FClass;

    private String FValue;

    private String FLogo;

    private String CompanyUrl;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    public String getFClass() {
        return FClass;
    }

    public void setFClass(String FClass) {
        this.FClass = FClass;
    }
    public String getFValue() {
        return FValue;
    }

    public void setFValue(String FValue) {
        this.FValue = FValue;
    }
    public String getFLogo() {
        return FLogo;
    }

    public void setFLogo(String FLogo) {
        this.FLogo = FLogo;
    }
    public String getCompanyUrl() {
        return CompanyUrl;
    }

    public void setCompanyUrl(String CompanyUrl) {
        this.CompanyUrl = CompanyUrl;
    }

    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

    @Override
    public String toString() {
        return "SysFooterInfo{" +
        "Id=" + Id +
        ", FClass=" + FClass +
        ", FValue=" + FValue +
        ", FLogo=" + FLogo +
        ", CompanyUrl=" + CompanyUrl +
        "}";
    }
}
