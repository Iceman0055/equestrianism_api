package com.equestrianism.api.model.vo.hospital_appoint_info;

import com.equestrianism.api.core.model.BaseViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Iceman
 * 2018/3/7
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class HospitalAppointInfoAddVO extends BaseViewModel {

    private String userId;
    private String appointDate;
    private String contacts;
    private String contactWay;
    private String appointNumber;
    private String appointDesc;
    private String remark;
    private Integer appointStatus;

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
