package com.equestrianism.api.model.vo.vaccination_info;

import com.equestrianism.api.core.model.BaseViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by Chenzq on 2018/3/11.
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class VaccinationInfoDetailVO extends BaseViewModel {

    private String vaccinationId;

    public String getVaccinationId() {
        return vaccinationId;
    }

    public void setVaccinationId(String vaccinationId) {
        this.vaccinationId = vaccinationId;
    }

}
