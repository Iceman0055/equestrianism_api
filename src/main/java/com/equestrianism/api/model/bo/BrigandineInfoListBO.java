package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BasePageResponse;
import com.equestrianism.api.model.model.BrigandineInfoListModel;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/9.
 */
public class BrigandineInfoListBO extends BasePageResponse {

    private List<BrigandineInfoListModel> brigandineList;

    public BrigandineInfoListBO() {
    }

    public BrigandineInfoListBO( List<BrigandineInfoListModel> brigandineList ) {
        this.brigandineList = brigandineList;
    }

    public List<BrigandineInfoListModel> getBrigandineList() {
        return brigandineList;
    }

    public void setBrigandineList(List<BrigandineInfoListModel> brigandineList) {
        this.brigandineList = brigandineList;
    }

}
