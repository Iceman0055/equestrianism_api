package com.equestrianism.api.model.po;

import com.equestrianism.api.core.model.BasePO;

import java.util.UUID;

/**
 * Created by Chenzq on 2018/3/17.
 */
public class TreatmentInfoEntity extends BasePO {

    private String treatmentId = UUID.randomUUID().toString().replace( "-", "" );
    private Integer outpatientType;
    private String hospitalAppointId;
    private Integer horseType;
    private String horseId;
    private String horseName;
    private String userId;
    private String beginDate;
    private String beginTime;
    private String endDate;
    private String endTime;
    private String treatName;
    private String treatDesc;
    private String consultingRoomId;

    public TreatmentInfoEntity() {
    }

    public TreatmentInfoEntity( String treatmentId ) {
        this.treatmentId = treatmentId;
    }

    public TreatmentInfoEntity( Integer outpatientType, String hospitalAppointId, Integer horseType,
                                String horseId, String horseName, String beginDate, String beginTime, String endDate,
                                String endTime, String treatName, String treatDesc, String consultingRoomId ) {
        this( UUID.randomUUID().toString().replace( "-", "" ), outpatientType, hospitalAppointId, horseType, horseId,
                horseName, beginDate, beginTime, endDate, endTime, treatName, treatDesc, consultingRoomId );
    }

    public TreatmentInfoEntity( String treatmentId, Integer outpatientType, String hospitalAppointId, Integer horseType,
                                String horseId, String horseName, String beginDate, String beginTime, String endDate,
                                String endTime, String treatName, String treatDesc, String consultingRoomId ) {
        this.treatmentId = treatmentId;
        this.outpatientType = outpatientType;
        this.hospitalAppointId = hospitalAppointId;
        this.horseType = horseType;
        this.horseId = horseId;
        this.horseName = horseName;
        this.beginDate = beginDate;
        this.beginTime = beginTime;
        this.endDate = endDate;
        this.endTime = endTime;
        this.treatName = treatName;
        this.treatDesc = treatDesc;
        this.consultingRoomId = consultingRoomId;
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

    public String getHospitalAppointId() {
        return hospitalAppointId;
    }

    public void setHospitalAppointId(String hospitalAppointId) {
        this.hospitalAppointId = hospitalAppointId;
    }

    public Integer getHorseType() {
        return horseType;
    }

    public void setHorseType(Integer horseType) {
        this.horseType = horseType;
    }

    public String getHorseId() {
        return horseId;
    }

    public void setHorseId(String horseId) {
        this.horseId = horseId;
    }

    public String getHorseName() {
        return horseName;
    }

    public void setHorseName(String horseName) {
        this.horseName = horseName;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
