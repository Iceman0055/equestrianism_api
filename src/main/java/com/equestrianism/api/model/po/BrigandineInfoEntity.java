package com.equestrianism.api.model.po;

import com.equestrianism.api.core.model.BasePO;

/**
 * Iceman
 * 2018/3/8
 */
public class BrigandineInfoEntity extends BasePO {

    private String brigandineId;
    private String horseId;
    private String userId;
    private String brigandineDate;
    private String remark;

    public String getBrigandineId() {
        return brigandineId;
    }

    public void setBrigandineId( String brigandineId ) {
        this.brigandineId = brigandineId;
    }

    public String getHorseId() {
        return horseId;
    }

    public void setHorseId( String horseId ) {
        this.horseId = horseId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId( String userId ) {
        this.userId = userId;
    }

    public String getBrigandineDate() {
        return brigandineDate;
    }

    public void setBrigandineDate( String brigandineDate ) {
        this.brigandineDate = brigandineDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark( String remark ) {
        this.remark = remark;
    }

}
