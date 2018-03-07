package com.equestrianism.api.model.vo.hospital_appoint_info;

import com.equestrianism.api.core.model.BasePageViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Iceman
 * 2018/3/7
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class HospitalAppointInfoListVO extends BasePageViewModel {

    private String appointDate;
    private String userId;
    private String appointNumber;

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

    public String getAppointNumber() {
        return appointNumber;
    }

    public void setAppointNumber( String appointNumber ) {
        this.appointNumber = appointNumber;
    }

}
