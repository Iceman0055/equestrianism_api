package com.equestrianism.api.model.model;

import com.equestrianism.api.core.model.BaseObject;

/**
 * Iceman
 * 2018/3/8
 */
public class ConsultingRoomInfoComboBoxModel extends BaseObject {

    private String consultingRoomId;
    private String consultingRoomName;

    public String getConsultingRoomId() {
        return consultingRoomId;
    }

    public void setConsultingRoomId( String consultingRoomId ) {
        this.consultingRoomId = consultingRoomId;
    }

    public String getConsultingRoomName() {
        return consultingRoomName;
    }

    public void setConsultingRoomName( String consultingRoomName ) {
        this.consultingRoomName = consultingRoomName;
    }

}
