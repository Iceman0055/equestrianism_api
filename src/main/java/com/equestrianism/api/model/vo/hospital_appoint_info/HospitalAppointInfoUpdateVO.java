package com.equestrianism.api.model.vo.hospital_appoint_info;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Iceman
 * 2018/3/7
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class HospitalAppointInfoUpdateVO extends HospitalAppointInfoAddVO {

    private String hospitalAppointId;

    public String getHospitalAppointId() {
        return hospitalAppointId;
    }

    public void setHospitalAppointId( String hospitalAppointId ) {
        this.hospitalAppointId = hospitalAppointId;
    }

}
