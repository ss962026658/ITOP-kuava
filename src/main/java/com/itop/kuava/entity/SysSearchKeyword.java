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
public class SysSearchKeyword extends Model<SysSearchKeyword> {

    private static final long serialVersionUID = 1L;

    private String Id;

    private String Keyword;

    private Integer FType;

    private Long SearchNum;

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }
    public String getKeyword() {
        return Keyword;
    }

    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }
    public Integer getFType() {
        return FType;
    }

    public void setFType(Integer FType) {
        this.FType = FType;
    }
    public Long getSearchNum() {
        return SearchNum;
    }

    public void setSearchNum(Long SearchNum) {
        this.SearchNum = SearchNum;
    }

    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

    @Override
    public String toString() {
        return "SysSearchKeyword{" +
        "Id=" + Id +
        ", Keyword=" + Keyword +
        ", FType=" + FType +
        ", SearchNum=" + SearchNum +
        "}";
    }
}
