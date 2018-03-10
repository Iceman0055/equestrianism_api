package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BaseObject;

/**
 * Created by Chenzq on 2018/3/10.
 */
public class ContusionTeethInfoDetailBO extends BaseObject {

    private String contusionTeethId;
    private String horseId;
    private String userId;
    private String operateDate;
    private String remark;

    public ContusionTeethInfoDetailBO() {
    }

    public ContusionTeethInfoDetailBO( String contusionTeethId, String horseId, String userId, String operateDate, String realname ) {
        this.contusionTeethId = contusionTeethId;
        this.horseId = horseId;
        this.userId = userId;
        this.operateDate = operateDate;
        this.remark = realname;
    }

    public String getContusionTeethId() {
        return contusionTeethId;
    }

    public void setContusionTeethId(String contusionTeethId) {
        this.contusionTeethId = contusionTeethId;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getHorseId() {
        return horseId;
    }

    public void setHorseId(String horseId) {
        this.horseId = horseId;
    }
}
