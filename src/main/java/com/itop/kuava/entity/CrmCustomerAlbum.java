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
public class CrmCustomerAlbum extends Model<CrmCustomerAlbum> {

    private static final long serialVersionUID = 1L;

    private String Id;

    private String AccountId;

    /**
     * 相册图片
     */
    private String CustomerImg;

    /**
     * 图片类型:1:封面;2：展示
     */
    private Integer ImgType;

    /**
     * 数据状态
     */
    private Integer DataStatus;

    /**
     * 创建时间
     */
    private Date CreateTime;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    public String getAccountId() {
        return AccountId;
    }

    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }
    public String getCustomerImg() {
        return CustomerImg;
    }

    public void setCustomerImg(String CustomerImg) {
        this.CustomerImg = CustomerImg;
    }
    public Integer getImgType() {
        return ImgType;
    }

    public void setImgType(Integer ImgType) {
        this.ImgType = ImgType;
    }
    public Integer getDataStatus() {
        return DataStatus;
    }

    public void setDataStatus(Integer DataStatus) {
        this.DataStatus = DataStatus;
    }
    public Date getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Date CreateTime) {
        this.CreateTime = CreateTime;
    }

    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

    @Override
    public String toString() {
        return "CrmCustomerAlbum{" +
        "Id=" + Id +
        ", AccountId=" + AccountId +
        ", CustomerImg=" + CustomerImg +
        ", ImgType=" + ImgType +
        ", DataStatus=" + DataStatus +
        ", CreateTime=" + CreateTime +
        "}";
    }
}
