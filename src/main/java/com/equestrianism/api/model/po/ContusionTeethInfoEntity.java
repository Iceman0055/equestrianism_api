package com.equestrianism.api.model.po;

import com.equestrianism.api.core.model.BasePO;

import java.util.UUID;

/**
 * Iceman
 * 2018/3/9
 */
public class ContusionTeethInfoEntity extends BasePO {

    private String contusionTeethId = UUID.randomUUID().toString().replace( "-", "" );
    private String horseId;
    private String userId;
    private String operateDate;
    private String remark;

    public ContusionTeethInfoEntity() {
    }

    public ContusionTeethInfoEntity( String contusionTeethId ) {
        this.contusionTeethId = contusionTeethId;
    }

    public ContusionTeethInfoEntity( String horseId, String userId, String operateDate, String remark) {
        this( UUID.randomUUID().toString().replace( "-", "" ), horseId, userId, operateDate, remark );
    }

    public ContusionTeethInfoEntity(String contusionTeethId, String horseId, String userId, String operateDate, String remark) {
        this.contusionTeethId = contusionTeethId;
        this.horseId = horseId;
        this.userId = userId;
        this.operateDate = operateDate;
        this.remark = remark;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getContusionTeethId() {
        return contusionTeethId;
    }

    public void setContusionTeethId(String contusionTeethId) {
        this.contusionTeethId = contusionTeethId;
    }

    public String getHorseId() {
        return horseId;
    }

    public void setHorseId(String horseId) {
        this.horseId = horseId;
    }

    public String getOperateDate() {
        return operateDate;
    }

    public void setOperateDate(String operateDate) {
        this.operateDate = operateDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
