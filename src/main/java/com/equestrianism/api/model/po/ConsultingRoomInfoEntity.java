package com.equestrianism.api.model.po;

import com.equestrianism.api.core.model.BasePO;

import java.util.UUID;

/**
 * Iceman
 * 2018/3/8
 */
public class ConsultingRoomInfoEntity extends BasePO {

    private String consultingRoomId = UUID.randomUUID().toString().replace( "-", "" );
    private String name;
    private String shortName;
    private String remark;

    public ConsultingRoomInfoEntity() {
    }

    public ConsultingRoomInfoEntity( String consultingRoomId ) {
        this.consultingRoomId = consultingRoomId;
    }

    public ConsultingRoomInfoEntity( String name, String shortName, String remark ) {
        this( UUID.randomUUID().toString().replace( "-", "" ), name, shortName, remark );
    }

    public ConsultingRoomInfoEntity( String consultingRoomId, String name, String shortName, String remark ) {
        this.consultingRoomId = consultingRoomId;
        this.name = name;
        this.shortName = shortName;
        this.remark = remark;
    }

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
}
