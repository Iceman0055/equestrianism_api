package com.equestrianism.api.model.vo.hospital_appoint_info;

import com.equestrianism.api.core.model.BaseViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Iceman
 * 2018/3/7
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class HospitalAppointInfoDetailVO extends BaseViewModel {

    private String hospitalAppointId;

    public String getHospitalAppointId() {
        return hospitalAppointId;
    }

    public void setHospitalAppointId( String hospitalAppointId ) {
        this.hospitalAppointId = hospitalAppointId;
    }

}
