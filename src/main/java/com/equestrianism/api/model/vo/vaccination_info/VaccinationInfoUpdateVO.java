package com.equestrianism.api.model.vo.vaccination_info;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by Chenzq on 2018/3/10.
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class VaccinationInfoUpdateVO extends VaccinationInfoAddVO {

    private String vaccinationId;

    public String getVaccinationId() {
        return vaccinationId;
    }

    public void setVaccinationId(String vaccinationId) {
        this.vaccinationId = vaccinationId;
    }

}
