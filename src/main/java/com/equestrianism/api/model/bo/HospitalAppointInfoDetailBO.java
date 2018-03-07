package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BaseObject;

/**
 * Iceman
 * 2018/3/7
 */
public class HospitalAppointInfoDetailBO extends BaseObject {

    private String hospitalAppointId;
    private String appointDate;
    private String userId;
    private String appointDesc;
    private String appointNumber;
    private String contacts;
    private String contactWay;
    private String remark;
    private String appointStatus;

    public String getHospitalAppointId() {
        return hospitalAppointId;
    }

    public void setHospitalAppointId( String hospitalAppointId ) {
        this.hospitalAppointId = hospitalAppointId;
    }

    public String getAppointDate() {
        return appointDate;
    }

    public void setAppointDate( String appointDate ) {
        this.appointDate = appointDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId( String userId ) {
        this.userId = userId;
    }

    public String getAppointDesc() {
        return appointDesc;
    }

    public void setAppointDesc( String appointDesc ) {
        this.appointDesc = appointDesc;
    }

    public String getAppointNumber() {
        return appointNumber;
    }

    public void setAppointNumber( String appointNumber ) {
        this.appointNumber = appointNumber;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts( String contacts ) {
        this.contacts = contacts;
    }

    public String getContactWay() {
        return contactWay;
    }

    public void setContactWay( String contactWay ) {
        this.contactWay = contactWay;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark( String remark ) {
        this.remark = remark;
    }

    public String getAppointStatus() {
        return appointStatus;
    }

    public void setAppointStatus( String appointStatus ) {
        this.appointStatus = appointStatus;
    }
}
