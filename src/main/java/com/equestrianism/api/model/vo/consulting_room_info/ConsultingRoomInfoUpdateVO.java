package com.equestrianism.api.model.vo.consulting_room_info;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Iceman
 * 2018/3/8
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class ConsultingRoomInfoUpdateVO extends ConsultingRoomInfoAddVO {

    private String consultingRoomId;

    public String getConsultingRoomId() {
        return consultingRoomId;
    }

    public void setConsultingRoomId( String consultingRoomId ) {
        this.consultingRoomId = consultingRoomId;
    }

}
