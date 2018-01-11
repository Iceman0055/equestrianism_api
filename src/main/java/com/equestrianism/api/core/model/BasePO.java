package com.equestrianism.api.core.model;

import java.util.Date;

/**
 * Iceman
 * 2018/1/10
 */
public class BasePO extends BaseObject {

    private Integer status;
    private Integer deleteFlag;
    private Integer dataVersion;
    private Date createDate;
    private Date updateDate;

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate( Date updateDate ) {
        this.updateDate = updateDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate( Date createDate ) {
        this.createDate = createDate;
    }

    public Integer getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion( Integer dataVersion ) {
        this.dataVersion = dataVersion;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag( Integer deleteFlag ) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus( Integer status ) {
        this.status = status;
    }

}
