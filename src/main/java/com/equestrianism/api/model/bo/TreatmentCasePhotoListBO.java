package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BaseObject;
import com.equestrianism.api.model.model.TreatmentCasePhotoListModel;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/18.
 */
public class TreatmentCasePhotoListBO extends BaseObject {

    private List<TreatmentCasePhotoListModel> casePhotoList;

    public TreatmentCasePhotoListBO() {
    }

    public TreatmentCasePhotoListBO( List<TreatmentCasePhotoListModel> casePhotoList ) {
        this.casePhotoList = casePhotoList;
    }

    public List<TreatmentCasePhotoListModel> getCasePhotoList() {
        return casePhotoList;
    }

    public void setCasePhotoList(List<TreatmentCasePhotoListModel> casePhotoList) {
        this.casePhotoList = casePhotoList;
    }
}
