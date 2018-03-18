package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BasePageResponse;
import com.equestrianism.api.model.model.HorseResumeListModel;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/18.
 */
public class HorseResumeListBO extends BasePageResponse {

    private List<HorseResumeListModel> horseResumeList;
    private List<String> horseIdList;

    public HorseResumeListBO() {
    }

    public HorseResumeListBO( List<HorseResumeListModel> horseResumeList ) {
        this.horseResumeList = horseResumeList;
    }

    public List<HorseResumeListModel> getHorseResumeList() {
        return horseResumeList;
    }

    public void setHorseResumeList(List<HorseResumeListModel> horseResumeList) {
        this.horseResumeList = horseResumeList;
    }

    public List<String> getHorseIdList() {
        return horseIdList;
    }

    public void setHorseIdList(List<String> horseIdList) {
        this.horseIdList = horseIdList;
    }
}
