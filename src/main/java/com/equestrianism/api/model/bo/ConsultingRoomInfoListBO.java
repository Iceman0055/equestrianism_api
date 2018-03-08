package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BasePageResponse;
import com.equestrianism.api.model.model.ConsultingRoomInfoListModel;

import java.util.List;

/**
 * Iceman
 * 2018/3/8
 */
public class ConsultingRoomInfoListBO extends BasePageResponse {

    private List<ConsultingRoomInfoListModel> consultingRoomList;

    public ConsultingRoomInfoListBO() {
    }

    public ConsultingRoomInfoListBO( List<ConsultingRoomInfoListModel> consultingRoomList ) {
        this.consultingRoomList = consultingRoomList;
    }

    public List< ConsultingRoomInfoListModel > getConsultingRoomList() {
        return consultingRoomList;
    }

    public void setConsultingRoomList( List< ConsultingRoomInfoListModel > consultingRoomList ) {
        this.consultingRoomList = consultingRoomList;
    }
}
