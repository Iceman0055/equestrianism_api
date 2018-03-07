package com.equestrianism.api.model.vo.hospital_appoint_info;

import com.equestrianism.api.core.model.BaseViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Iceman
 * 2018/3/7
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class HospitalAppointInfoDeleteVO extends BaseViewModel {

    private String hospitalAppointId;
    private Integer deleteFlag;
    private Integer status;

    public String getHospitalAppointId() {
        return hospitalAppointId;
    }

    public void setHospitalAppointId( String hospitalAppointId ) {
        this.hospitalAppointId = hospitalAppointId;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag( Integer deleteFlag ) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus( Integer status ) {
        this.status = status;
    }

}
