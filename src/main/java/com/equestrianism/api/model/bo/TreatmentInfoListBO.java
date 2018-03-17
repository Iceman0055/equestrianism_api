package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BasePageResponse;
import com.equestrianism.api.model.model.TreatmentInfoListModel;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/17.
 */
public class TreatmentInfoListBO extends BasePageResponse {

    private List<TreatmentInfoListModel> treatmentList;

    public TreatmentInfoListBO() {
    }

    public TreatmentInfoListBO(List<TreatmentInfoListModel> treatmentList) {
        this.treatmentList = treatmentList;
    }

    public List<TreatmentInfoListModel> getTreatmentList() {
        return treatmentList;
    }

    public void setTreatmentList(List<TreatmentInfoListModel> treatmentList) {
        this.treatmentList = treatmentList;
    }
}
