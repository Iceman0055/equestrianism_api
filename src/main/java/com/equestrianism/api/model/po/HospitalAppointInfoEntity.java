package com.equestrianism.api.model.po;

import com.equestrianism.api.core.model.BasePO;

import java.util.UUID;

/**
 * Iceman
 * 2018/3/7
 */
public class HospitalAppointInfoEntity extends BasePO {

    private String hospitalAppointId = UUID.randomUUID().toString().replace( "-", "" );
    private String userId;
    private String appointDate;
    private String contacts;
    private String contactWay;
    private String appointNumber;
    private String appointDesc;
    private String remark;
    private Integer appointStatus;

    public HospitalAppointInfoEntity() {
    }

    public HospitalAppointInfoEntity( String hospitalAppointId ) {
        this.hospitalAppointId = hospitalAppointId;
    }

    public HospitalAppointInfoEntity( String userId, String appointDate, String contacts, String contactWay,
                                      String appointNumber, String appointDesc, String remark, Integer appointStatus ) {
        this( UUID.randomUUID().toString().replace( "-", "" ), userId, appointDate, contacts, contactWay,
                appointNumber, appointDesc, remark, appointStatus );
    }

    public HospitalAppointInfoEntity( String hospitalAppointId, String userId, String appointDate, String contacts, String contactWay,
                                      String appointNumber, String appointDesc, String remark, Integer appointStatus ) {
        this.hospitalAppointId = hospitalAppointId;
        this.userId = userId;
        this.appointDate = appointDate;
        this.contacts = contacts;
        this.contactWay = contactWay;
        this.appointNumber = appointNumber;
        this.appointDesc = appointDesc;
        this.remark = remark;
        this.appointStatus = appointStatus;
    }

    public String getHospitalAppointId() {
        return hospitalAppointId;
    }

    public void setHospitalAppointId( String hospitalAppointId ) {
        this.hospitalAppointId = hospitalAppointId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId( String userId ) {
        this.userId = userId;
    }

    public String getAppointDate() {
        return appointDate;
    }

    public void setAppointDate( String appointDate ) {
        this.appointDate = appointDate;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark( String remark ) {
        this.remark = remark;
    }

    public Integer getAppointStatus() {
        return appointStatus;
    }

    public void setAppointStatus( Integer appointStatus ) {
        this.appointStatus = appointStatus;
    }

}
