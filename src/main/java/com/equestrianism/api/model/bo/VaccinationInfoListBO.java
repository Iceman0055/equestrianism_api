package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BasePageResponse;
import com.equestrianism.api.model.model.VaccinationInfoListModel;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/11.
 */
public class VaccinationInfoListBO extends BasePageResponse {

    private List<VaccinationInfoListModel> vaccinationInfoList;

    public VaccinationInfoListBO() {
    }

    public VaccinationInfoListBO( List<VaccinationInfoListModel> vaccinationInfoList ) {
        this.vaccinationInfoList = vaccinationInfoList;
    }

    public List<VaccinationInfoListModel> getVaccinationInfoList() {
        return vaccinationInfoList;
    }

    public void setVaccinationInfoList(List<VaccinationInfoListModel> vaccinationInfoList) {
        this.vaccinationInfoList = vaccinationInfoList;
    }

}
