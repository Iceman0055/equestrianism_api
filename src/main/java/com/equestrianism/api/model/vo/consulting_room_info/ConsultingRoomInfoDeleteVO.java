package com.equestrianism.api.model.vo.consulting_room_info;

import com.equestrianism.api.core.model.BaseViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Iceman
 * 2018/3/8
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class ConsultingRoomInfoDeleteVO extends BaseViewModel {

    private String consultingRoomId;
    private Integer deleteFlag;
    private Integer status;

    public String getConsultingRoomId() {
        return consultingRoomId;
    }

    public void setConsultingRoomId( String consultingRoomId ) {
        this.consultingRoomId = consultingRoomId;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag( Integer deleteFlag ) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus( Integer status ) {
        this.status = status;
    }

}
