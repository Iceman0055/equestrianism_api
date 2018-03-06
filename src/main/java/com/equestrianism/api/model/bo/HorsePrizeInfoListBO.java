package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BasePageResponse;
import com.equestrianism.api.model.model.HorsePrizeInfoListModel;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/7.
 */
public class HorsePrizeInfoListBO extends BasePageResponse {

    private List<HorsePrizeInfoListModel> horsePrizeList;

    public HorsePrizeInfoListBO() {
    }

    public HorsePrizeInfoListBO( List<HorsePrizeInfoListModel> horsePrizeList ) {
        this.horsePrizeList = horsePrizeList;
    }

    public List<HorsePrizeInfoListModel> getHorsePrizeList() {
        return horsePrizeList;
    }

    public void setHorsePrizeList(List<HorsePrizeInfoListModel> horsePrizeList) {
        this.horsePrizeList = horsePrizeList;
    }
}
