package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BasePageResponse;
import com.equestrianism.api.model.model.HorseInfoListModel;

import java.util.List;

/**
 * Iceman
 * 2018/1/30
 */
public class HorseInfoListBO extends BasePageResponse {

    private List<HorseInfoListModel> horseList;

    public HorseInfoListBO() {
    }

    public HorseInfoListBO( List<HorseInfoListModel> horseList ) {
        this.horseList = horseList;
    }

    public List<HorseInfoListModel> getHorseList() {
        return horseList;
    }

    public void setHorseList( List< HorseInfoListModel > horseList ) {
        this.horseList = horseList;
    }
}
