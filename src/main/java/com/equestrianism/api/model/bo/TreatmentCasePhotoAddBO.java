package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BaseObject;

/**
 * Created by Chenzq on 2018/3/18.
 */
public class TreatmentCasePhotoAddBO extends BaseObject {

    private String casePhotoId;

    public TreatmentCasePhotoAddBO() {
    }

    public TreatmentCasePhotoAddBO( String casePhotoId ) {
        this.casePhotoId = casePhotoId;
    }

    public String getCasePhotoId() {
        return casePhotoId;
    }

    public void setCasePhotoId(String casePhotoId) {
        this.casePhotoId = casePhotoId;
    }
}
