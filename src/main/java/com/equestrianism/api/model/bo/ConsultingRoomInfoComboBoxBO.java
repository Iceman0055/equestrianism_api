package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BaseObject;
import com.equestrianism.api.model.model.ConsultingRoomInfoComboBoxModel;

import java.util.List;

/**
 * Iceman
 * 2018/3/8
 */
public class ConsultingRoomInfoComboBoxBO extends BaseObject {

    private List<ConsultingRoomInfoComboBoxModel> consultingRoomList;

    public ConsultingRoomInfoComboBoxBO() {
    }

    public ConsultingRoomInfoComboBoxBO( List<ConsultingRoomInfoComboBoxModel> consultingRoomList ) {
        this.consultingRoomList = consultingRoomList;
    }

    public List<ConsultingRoomInfoComboBoxModel> getConsultingRoomList() {
        return consultingRoomList;
    }

    public void setConsultingRoomList( List<ConsultingRoomInfoComboBoxModel> consultingRoomList ) {
        this.consultingRoomList = consultingRoomList;
    }
}
