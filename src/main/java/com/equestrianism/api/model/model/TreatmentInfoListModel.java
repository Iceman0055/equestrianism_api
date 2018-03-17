package com.equestrianism.api.model.model;

import com.equestrianism.api.core.model.BaseObject;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/17.
 */
public class TreatmentInfoListModel extends BaseObject {

    private String treatmentId;
    private Integer outpatientType;
    private String appointNumber;
    private Integer horseType;
    private String horseName;
    private String horseId;
    private String beginDate;
    private String beginTime;
    private String treatName;
    private String treatDesc;
    private String consultingRoomName;

    public String getTreatmentId() {
        return treatmentId;
    }

    public void setTreatmentId(String treatmentId) {
        this.treatmentId = treatmentId;
    }

    public Integer getOutpatientType() {
        return outpatientType;
    }

    public void setOutpatientType(Integer outpatientType) {
        this.outpatientType = outpatientType;
    }

    public String getAppointNumber() {
        return appointNumber;
    }

    public void setAppointNumber(String appointNumber) {
        this.appointNumber = appointNumber;
    }

    public Integer getHorseType() {
        return horseType;
    }

    public void setHorseType(Integer horseType) {
        this.horseType = horseType;
    }

    public String getHorseName() {
        return horseName;
    }

    public void setHorseName(String horseName) {
        this.horseName = horseName;
    }

    public String getHorseId() {
        return horseId;
    }

    public void setHorseId(String horseId) {
        this.horseId = horseId;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getTreatName() {
        return treatName;
    }

    public void setTreatName(String treatName) {
        this.treatName = treatName;
    }

    public String getTreatDesc() {
        return treatDesc;
    }

    public void setTreatDesc(String treatDesc) {
        this.treatDesc = treatDesc;
    }

    public String getConsultingRoomName() {
        return consultingRoomName;
    }

    public void setConsultingRoomName(String consultingRoomName) {
        this.consultingRoomName = consultingRoomName;
    }

}
