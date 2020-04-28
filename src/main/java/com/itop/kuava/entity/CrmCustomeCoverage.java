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
public class CrmCustomeCoverage extends Model<CrmCustomeCoverage> {

    private static final long serialVersionUID = 1L;

    private String Id;

    private String AccountId;

    /**
     * logo
     */
    private String ImgUrl;

    /**
     * 链接网址
     */
    private String LinkUrl;

    /**
     * 出处
     */
    private String Source;

    /**
     * 标题
     */
    private String Title;

    /**
     * 创建时间
     */
    private Date CreateTime;

    /**
     * 阅读量
     */
    private Integer ReadSum;

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
    public String getImgUrl() {
        return ImgUrl;
    }

    public void setImgUrl(String ImgUrl) {
        this.ImgUrl = ImgUrl;
    }
    public String getLinkUrl() {
        return LinkUrl;
    }

    public void setLinkUrl(String LinkUrl) {
        this.LinkUrl = LinkUrl;
    }
    public String getSource() {
        return Source;
    }

    public void setSource(String Source) {
        this.Source = Source;
    }
    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }
    public Date getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Date CreateTime) {
        this.CreateTime = CreateTime;
    }
    public Integer getReadSum() {
        return ReadSum;
    }

    public void setReadSum(Integer ReadSum) {
        this.ReadSum = ReadSum;
    }

    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

    @Override
    public String toString() {
        return "CrmCustomeCoverage{" +
        "Id=" + Id +
        ", AccountId=" + AccountId +
        ", ImgUrl=" + ImgUrl +
        ", LinkUrl=" + LinkUrl +
        ", Source=" + Source +
        ", Title=" + Title +
        ", CreateTime=" + CreateTime +
        ", ReadSum=" + ReadSum +
        "}";
    }
}
