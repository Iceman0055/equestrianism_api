package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BaseObject;
import com.equestrianism.api.model.model.HorseInfoComboBoxModel;

import java.util.List;

/**
 * Iceman
 * 2018/2/7
 */
public class HorseInfoComboBoxBO extends BaseObject {

    private List<HorseInfoComboBoxModel> horseList;

    public HorseInfoComboBoxBO() {
    }

    public HorseInfoComboBoxBO( List<HorseInfoComboBoxModel> horseList ) {
        this.horseList = horseList;
    }

    public List<HorseInfoComboBoxModel> getHorseList() {
        return horseList;
    }

    public void setHorseList( List< HorseInfoComboBoxModel > horseList ) {
        this.horseList = horseList;
    }

}
