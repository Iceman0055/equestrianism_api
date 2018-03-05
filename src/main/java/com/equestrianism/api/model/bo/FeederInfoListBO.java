package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BasePageResponse;
import com.equestrianism.api.model.model.FeederInfoListModel;

import java.util.List;

/**
 * Iceman
 * 2018/3/5
 */
public class FeederInfoListBO extends BasePageResponse {

    private List<FeederInfoListModel> feederInfoList;

    public FeederInfoListBO() {
    }

    public FeederInfoListBO( List<FeederInfoListModel> feederInfoList ) {
        this.feederInfoList = feederInfoList;
    }

    public List<FeederInfoListModel> getFeederInfoList() {
        return feederInfoList;
    }

    public void setFeederInfoList( List<FeederInfoListModel> feederInfoList ) {
        this.feederInfoList = feederInfoList;
    }

}
