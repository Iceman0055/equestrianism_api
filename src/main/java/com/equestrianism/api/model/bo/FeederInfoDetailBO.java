package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BaseObject;

/**
 * Iceman
 * 2018/3/5
 */
public class FeederInfoDetailBO extends BaseObject {

    private String feederId;
    private String feederName;
    private Integer sex;
    private String skillDesc;
    private String horseId;
    private String hireDate;
    private byte[] idCardImage;

    public String getFeederId() {
        return feederId;
    }

    public void setFeederId( String feederId ) {
        this.feederId = feederId;
    }

    public String getFeederName() {
        return feederName;
    }

    public void setFeederName( String feederName ) {
        this.feederName = feederName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex( Integer sex ) {
        this.sex = sex;
    }

    public String getSkillDesc() {
        return skillDesc;
    }

    public void setSkillDesc( String skillDesc ) {
        this.skillDesc = skillDesc;
    }

    public String getHorseId() {
        return horseId;
    }

    public void setHorseId( String horseId ) {
        this.horseId = horseId;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate( String hireDate ) {
        this.hireDate = hireDate;
    }

    public byte[] getIdCardImage() {
        return idCardImage;
    }

    public void setIdCardImage( byte[] idCardImage ) {
        this.idCardImage = idCardImage;
    }

}
