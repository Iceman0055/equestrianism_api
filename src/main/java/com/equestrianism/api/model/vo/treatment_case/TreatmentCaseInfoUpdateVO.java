package com.equestrianism.api.model.vo.treatment_case;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by Chenzq on 2018/3/18.
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class TreatmentCaseInfoUpdateVO extends TreatmentCaseInfoAddVO {

    private String treatmentCaseId;

    public String getTreatmentCaseId() {
        return treatmentCaseId;
    }

    public void setTreatmentCaseId(String treatmentCaseId) {
        this.treatmentCaseId = treatmentCaseId;
    }

}
