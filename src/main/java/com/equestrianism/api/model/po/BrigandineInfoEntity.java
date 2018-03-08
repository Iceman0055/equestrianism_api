package com.equestrianism.api.model.po;

import com.equestrianism.api.core.model.BasePO;

import java.util.UUID;

/**
 * Iceman
 * 2018/3/8
 */
public class BrigandineInfoEntity extends BasePO {

    private String brigandineId = UUID.randomUUID().toString().replace( "-", "" );
    private String horseId;
    private String userId;
    private String brigandineDate;
    private String remark;

    public BrigandineInfoEntity() {
    }

    public BrigandineInfoEntity( String brigandineId ) {
        this.brigandineId = brigandineId;
    }

    public BrigandineInfoEntity( String horseId, String userId, String brigandineDate, String remark ) {
        this( UUID.randomUUID().toString().replace( "-", "" ), horseId, userId, brigandineDate, remark );
    }

    public BrigandineInfoEntity( String brigandineId, String horseId, String userId, String brigandineDate, String remark ) {
        this.brigandineId = brigandineId;
        this.horseId = horseId;
        this.userId = userId;
        this.brigandineDate = brigandineDate;
        this.remark = remark;
    }

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
