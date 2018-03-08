package com.equestrianism.api.model.model;

import com.equestrianism.api.core.model.BaseObject;

/**
 * Iceman
 * 2018/3/8
 */
public class ConsultingRoomInfoListModel extends BaseObject {

    private String consultingRoomId;
    private String name;
    private String shortName;
    private String remark;
    private Integer status;

    public String getConsultingRoomId() {
        return consultingRoomId;
    }

    public void setConsultingRoomId( String consultingRoomId ) {
        this.consultingRoomId = consultingRoomId;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName( String shortName ) {
        this.shortName = shortName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark( String remark ) {
        this.remark = remark;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus( Integer status ) {
        this.status = status;
    }

}
