package com.equestrianism.api.model.model;

import com.equestrianism.api.core.model.BaseObject;

/**
 * Iceman
 * 2018/3/7
 */
public class HospitalAppointInfoListModel extends BaseObject {

    private String hospitalAppointId;
    private String appointDate;
    private String realname;
    private String appointNumber;
    private String appointDesc;
    private String contacts;
    private String contactWay;
    private Integer appointStatus;
    private String treatId;
    private String remark;

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

    public String getRealname() {
        return realname;
    }

    public void setRealname( String realname ) {
        this.realname = realname;
    }

    public String getAppointNumber() {
        return appointNumber;
    }

    public void setAppointNumber( String appointNumber ) {
        this.appointNumber = appointNumber;
    }

    public String getAppointDesc() {
        return appointDesc;
    }

    public void setAppointDesc( String appointDesc ) {
        this.appointDesc = appointDesc;
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

    public Integer getAppointStatus() {
        return appointStatus;
    }

    public void setAppointStatus( Integer appointStatus ) {
        this.appointStatus = appointStatus;
    }

    public String getTreatId() {
        return treatId;
    }

    public void setTreatId( String treatId ) {
        this.treatId = treatId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark( String remark ) {
        this.remark = remark;
    }

}
