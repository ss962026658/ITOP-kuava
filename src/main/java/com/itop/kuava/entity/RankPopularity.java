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
public class RankPopularity extends Model<RankPopularity> {

    private static final long serialVersionUID = 1L;

    private String Id;

    /**
     * 姓名
     */
    private String Name;

    /**
     * 搜索关键词，多个以半角逗号隔开
     */
    private String Keywords;

    private Integer BaiduIndex;

    /**
     * 0：降；1：升
     */
    private Integer BaiduSort;

    private Integer GoogleIndex;

    private Integer GoogleSort;

    private Integer ZiXunIndex;

    private Integer ZiXunSort;

    private Integer FacebookIndex;

    private Integer FacebookSort;

    private Integer WeiboIndex;

    private Integer WeiboSort;

    private Integer CompositeIndex;

    private Integer CompositeSort;

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
    public String getKeywords() {
        return Keywords;
    }

    public void setKeywords(String Keywords) {
        this.Keywords = Keywords;
    }
    public Integer getBaiduIndex() {
        return BaiduIndex;
    }

    public void setBaiduIndex(Integer BaiduIndex) {
        this.BaiduIndex = BaiduIndex;
    }
    public Integer getBaiduSort() {
        return BaiduSort;
    }

    public void setBaiduSort(Integer BaiduSort) {
        this.BaiduSort = BaiduSort;
    }
    public Integer getGoogleIndex() {
        return GoogleIndex;
    }

    public void setGoogleIndex(Integer GoogleIndex) {
        this.GoogleIndex = GoogleIndex;
    }
    public Integer getGoogleSort() {
        return GoogleSort;
    }

    public void setGoogleSort(Integer GoogleSort) {
        this.GoogleSort = GoogleSort;
    }
    public Integer getZiXunIndex() {
        return ZiXunIndex;
    }

    public void setZiXunIndex(Integer ZiXunIndex) {
        this.ZiXunIndex = ZiXunIndex;
    }
    public Integer getZiXunSort() {
        return ZiXunSort;
    }

    public void setZiXunSort(Integer ZiXunSort) {
        this.ZiXunSort = ZiXunSort;
    }
    public Integer getFacebookIndex() {
        return FacebookIndex;
    }

    public void setFacebookIndex(Integer FacebookIndex) {
        this.FacebookIndex = FacebookIndex;
    }
    public Integer getFacebookSort() {
        return FacebookSort;
    }

    public void setFacebookSort(Integer FacebookSort) {
        this.FacebookSort = FacebookSort;
    }
    public Integer getWeiboIndex() {
        return WeiboIndex;
    }

    public void setWeiboIndex(Integer WeiboIndex) {
        this.WeiboIndex = WeiboIndex;
    }
    public Integer getWeiboSort() {
        return WeiboSort;
    }

    public void setWeiboSort(Integer WeiboSort) {
        this.WeiboSort = WeiboSort;
    }
    public Integer getCompositeIndex() {
        return CompositeIndex;
    }

    public void setCompositeIndex(Integer CompositeIndex) {
        this.CompositeIndex = CompositeIndex;
    }
    public Integer getCompositeSort() {
        return CompositeSort;
    }

    public void setCompositeSort(Integer CompositeSort) {
        this.CompositeSort = CompositeSort;
    }

    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

    @Override
    public String toString() {
        return "RankPopularity{" +
        "Id=" + Id +
        ", Name=" + Name +
        ", Keywords=" + Keywords +
        ", BaiduIndex=" + BaiduIndex +
        ", BaiduSort=" + BaiduSort +
        ", GoogleIndex=" + GoogleIndex +
        ", GoogleSort=" + GoogleSort +
        ", ZiXunIndex=" + ZiXunIndex +
        ", ZiXunSort=" + ZiXunSort +
        ", FacebookIndex=" + FacebookIndex +
        ", FacebookSort=" + FacebookSort +
        ", WeiboIndex=" + WeiboIndex +
        ", WeiboSort=" + WeiboSort +
        ", CompositeIndex=" + CompositeIndex +
        ", CompositeSort=" + CompositeSort +
        "}";
    }
}
