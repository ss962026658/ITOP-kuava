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
public class CrmCompanyMatrix extends Model<CrmCompanyMatrix> {

    private static final long serialVersionUID = 1L;

    private String Id;

    private String AccountId;

    /**
     * 媒体矩阵名称
     */
    private String MatrixName;

    /**
     * logo
     */
    private String MatrixLogo;

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
    public String getMatrixName() {
        return MatrixName;
    }

    public void setMatrixName(String MatrixName) {
        this.MatrixName = MatrixName;
    }
    public String getMatrixLogo() {
        return MatrixLogo;
    }

    public void setMatrixLogo(String MatrixLogo) {
        this.MatrixLogo = MatrixLogo;
    }

    @Override
    protected Serializable pkVal() {
        return this.Id;
    }

    @Override
    public String toString() {
        return "CrmCompanyMatrix{" +
        "Id=" + Id +
        ", AccountId=" + AccountId +
        ", MatrixName=" + MatrixName +
        ", MatrixLogo=" + MatrixLogo +
        "}";
    }
}
