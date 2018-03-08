package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BaseObject;

/**
 * Created by Chenzq on 2018/3/9.
 */
public class BrigandineInfoDetailBO extends BaseObject {

    private String brigandineId;
    private String brigandineDate;
    private String horseId;
    private String userId;

    public BrigandineInfoDetailBO() {
    }

    public BrigandineInfoDetailBO( String brigandineId, String brigandineDate, String horseId, String userId ) {
        this.brigandineId = brigandineId;
        this.brigandineDate = brigandineDate;
        this.horseId = horseId;
        this.userId = userId;
    }

    public String getBrigandineId() {
        return brigandineId;
    }

    public void setBrigandineId(String brigandineId) {
        this.brigandineId = brigandineId;
    }

    public String getBrigandineDate() {
        return brigandineDate;
    }

    public void setBrigandineDate(String brigandineDate) {
        this.brigandineDate = brigandineDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getHorseId() {
        return horseId;
    }

    public void setHorseId(String horseId) {
        this.horseId = horseId;
    }

}
