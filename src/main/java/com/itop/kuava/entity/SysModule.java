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
public class SysModule extends Model<SysModule> {

    private static final long serialVersionUID = 1L;

    private String Id;

    private String FParentId;

    private Integer FLayers;

    private String FEnCode;

    private String FFullName;

    private Integer FDataStatus;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    public String getFParentId() {
        return FParentId;
    }

    public void setFParentId(String FParentId) {
        this.FParentId = FParentId;
    }
    public Integer getFLayers() {
        return FLayers;
    }

    public void setFLayers(Integer FLayers) {
        this.FLayers = FLayers;
    }
    public String getFEnCode() {
        return FEnCode;
    }

    public void setFEnCode(String FEnCode) {
        this.FEnCode = FEnCode;
    }
    public String getFFullName() {
        return FFullName;
    }

    public void setFFullName(String FFullName) {
        this.FFullName = FFullName;
    }
    public Integer getFDataStatus() {
        return FDataStatus;
    }

    public void setFDataStatus(Integer FDataStatus) {
        this.FDataStatus = FDataStatus;
    }

    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

    @Override
    public String toString() {
        return "SysModule{" +
        "Id=" + Id +
        ", FParentId=" + FParentId +
        ", FLayers=" + FLayers +
        ", FEnCode=" + FEnCode +
        ", FFullName=" + FFullName +
        ", FDataStatus=" + FDataStatus +
        "}";
    }
}
