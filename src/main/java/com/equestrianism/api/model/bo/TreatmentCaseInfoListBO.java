package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BasePageResponse;
import com.equestrianism.api.model.model.TreatmentCaseInfoListModel;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/18.
 */
public class TreatmentCaseInfoListBO extends BasePageResponse {

    private List<TreatmentCaseInfoListModel> treatmentCaseList;

    public TreatmentCaseInfoListBO() {
    }

    public TreatmentCaseInfoListBO( List<TreatmentCaseInfoListModel> treatmentCaseList ) {
        this.treatmentCaseList = treatmentCaseList;
    }

    public List<TreatmentCaseInfoListModel> getTreatmentCaseList() {
        return treatmentCaseList;
    }

    public void setTreatmentCaseList(List<TreatmentCaseInfoListModel> treatmentCaseList) {
        this.treatmentCaseList = treatmentCaseList;
    }
}
