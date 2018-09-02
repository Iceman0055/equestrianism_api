package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BaseObject;
import com.equestrianism.api.model.model.TreatmentAssetModel;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/17.
 */
public class TreatmentInfoDetailBO extends BaseObject {

    private String treatmentId;
    private Integer outpatientType;
    private String appointNumber;
    private Integer horseType;
    private String horseName;
    private String horseId;
    private String beginDate;
    private String beginTime;
    private String endDate;
    private String endTime;
    private String treatName;
    private String treatDesc;
    private String consultingRoomId;

    public TreatmentInfoDetailBO() {
    }

    public TreatmentInfoDetailBO( String treatmentId, Integer outpatientType, String appointNumber, Integer horseType,
                                  String horseName, String horseId, String beginDate, String beginTime, String endDate,
                                  String endTime, String treatName, String treatDesc,
                                  String consultingRoomId ) {
        this.treatmentId = treatmentId;
        this.outpatientType = outpatientType;
        this.appointNumber = appointNumber;
        this.horseType = horseType;
        this.horseName = horseName;
        this.horseId = horseId;
        this.beginDate = beginDate;
        this.beginTime = beginTime;
        this.treatName = treatName;
        this.consultingRoomId = consultingRoomId;
        this.endDate = endDate;
        this.endTime = endTime;
        this.treatDesc = treatDesc;
    }

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

    public String getConsultingRoomId() {
        return consultingRoomId;
    }

    public void setConsultingRoomId(String consultingRoomId) {
        this.consultingRoomId = consultingRoomId;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

}
