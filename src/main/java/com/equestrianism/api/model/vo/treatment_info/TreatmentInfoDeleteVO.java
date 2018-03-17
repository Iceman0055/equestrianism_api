package com.equestrianism.api.model.vo.treatment_info;

import com.equestrianism.api.core.model.BaseViewModel;

/**
 * Created by Chenzq on 2018/3/17.
 */
public class TreatmentInfoDeleteVO extends BaseViewModel {

    private String treatmentId;
    private Integer deleteFlag;
    private Integer status;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getTreatmentId() {
        return treatmentId;
    }

    public void setTreatmentId(String treatmentId) {
        this.treatmentId = treatmentId;
    }
}
