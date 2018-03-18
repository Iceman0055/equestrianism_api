package com.equestrianism.api.model.vo.treatment_case;

import com.equestrianism.api.core.model.BaseViewModel;

/**
 * Created by Chenzq on 2018/3/18.
 */
public class TreatmentCasePhotoListVO extends BaseViewModel {

    private Integer photoType;
    private String treatmentCaseId;

    public String getTreatmentCaseId() {
        return treatmentCaseId;
    }

    public void setTreatmentCaseId(String treatmentCaseId) {
        this.treatmentCaseId = treatmentCaseId;
    }

    public Integer getPhotoType() {
        return photoType;
    }

    public void setPhotoType(Integer photoType) {
        this.photoType = photoType;
    }
}
