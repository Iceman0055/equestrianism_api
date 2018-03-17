package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BaseObject;

/**
 * Created by Chenzq on 2018/3/17.
 */
public class TreatmentInfoAddBO extends BaseObject {

    private String treatmentId;

    public TreatmentInfoAddBO() {
    }

    public TreatmentInfoAddBO( String treatmentId ) {
        this.treatmentId = treatmentId;
    }

    public String getTreatmentId() {
        return treatmentId;
    }

    public void setTreatmentId(String treatmentId) {
        this.treatmentId = treatmentId;
    }

}
