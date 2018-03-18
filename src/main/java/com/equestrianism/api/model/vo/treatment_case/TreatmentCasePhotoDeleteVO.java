package com.equestrianism.api.model.vo.treatment_case;

import com.equestrianism.api.core.model.BaseViewModel;

/**
 * Created by Chenzq on 2018/3/18.
 */
public class TreatmentCasePhotoDeleteVO extends BaseViewModel {

    private String casePhotoId;

    public String getCasePhotoId() {
        return casePhotoId;
    }

    public void setCasePhotoId(String casePhotoId) {
        this.casePhotoId = casePhotoId;
    }
}
