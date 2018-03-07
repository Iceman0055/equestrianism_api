package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BasePageResponse;
import com.equestrianism.api.model.model.HospitalAppointInfoListModel;

import java.util.List;

/**
 * Iceman
 * 2018/3/7
 */
public class HospitalAppointInfoListBO extends BasePageResponse {

    private List<HospitalAppointInfoListModel> appointInfoList;

    public HospitalAppointInfoListBO() {
    }

    public HospitalAppointInfoListBO( List<HospitalAppointInfoListModel> appointInfoList ) {
        this.appointInfoList = appointInfoList;
    }

    public List< HospitalAppointInfoListModel > getAppointInfoList() {
        return appointInfoList;
    }

    public void setAppointInfoList( List< HospitalAppointInfoListModel > appointInfoList ) {
        this.appointInfoList = appointInfoList;
    }
}
