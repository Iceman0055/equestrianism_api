package com.equestrianism.api.model.vo.treatment_info;

import com.equestrianism.api.core.model.BaseViewModel;
import com.equestrianism.api.model.model.TreatmentInfoAddAssetModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/17.
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class TreatmentInfoAddVO extends BaseViewModel {

    private Integer outpatientType;
    private String appointNumber;
    private String beginDate;
    private String beginTime;
    private String endDate;
    private String endTime;
    private Integer horseType;
    private String horseName;
    private String horseId;
    private String treatName;
    private String treatDesc;
    private String consultingRoomId;
    private List<TreatmentInfoAddAssetModel> hospitalAssetList;
    private List<TreatmentInfoAddAssetModel> consumableAssetList;

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

    public List<TreatmentInfoAddAssetModel> getConsumableAssetList() {
        return consumableAssetList;
    }

    public void setConsumableAssetList(List<TreatmentInfoAddAssetModel> consumableAssetList) {
        this.consumableAssetList = consumableAssetList;
    }

    public List<TreatmentInfoAddAssetModel> getHospitalAssetList() {
        return hospitalAssetList;
    }

    public void setHospitalAssetList(List<TreatmentInfoAddAssetModel> hospitalAssetList) {
        this.hospitalAssetList = hospitalAssetList;
    }
}
