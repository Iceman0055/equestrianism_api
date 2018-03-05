package com.equestrianism.api.model.model;

import com.equestrianism.api.core.model.BaseObject;

/**
 * Iceman
 * 2018/3/5
 */
public class FeederInfoListModel extends BaseObject {

    private String feederId;
    private String feederName;
    private Integer sex;
    private byte[] idCardImage;
    private String skillDesc;
    private String horseName;
    private String hireDate;

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

    public byte[] getIdCardImage() {
        return idCardImage;
    }

    public void setIdCardImage( byte[] idCardImage ) {
        this.idCardImage = idCardImage;
    }

    public String getSkillDesc() {
        return skillDesc;
    }

    public void setSkillDesc( String skillDesc ) {
        this.skillDesc = skillDesc;
    }

    public String getHorseName() {
        return horseName;
    }

    public void setHorseName( String horseName ) {
        this.horseName = horseName;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate( String hireDate ) {
        this.hireDate = hireDate;
    }

}
