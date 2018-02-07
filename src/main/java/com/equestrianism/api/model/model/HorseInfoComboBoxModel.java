package com.equestrianism.api.model.model;

import com.equestrianism.api.core.model.BaseObject;

/**
 * Iceman
 * 2018/2/7
 */
public class HorseInfoComboBoxModel extends BaseObject {

    private String horseId;
    private String horseName;

    public String getHorseId() {
        return horseId;
    }

    public void setHorseId( String horseId ) {
        this.horseId = horseId;
    }

    public String getHorseName() {
        return horseName;
    }

    public void setHorseName( String horseName ) {
        this.horseName = horseName;
    }

}
