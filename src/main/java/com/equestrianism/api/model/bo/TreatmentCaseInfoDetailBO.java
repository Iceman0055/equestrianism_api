package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BaseObject;

/**
 * Created by Chenzq on 2018/3/18.
 */
public class TreatmentCaseInfoDetailBO extends BaseObject {

    private String treatmentCaseId;
    private Integer horseType;
    private String horseId;
    private String horseName;
    private String operatorDate;
    private String place;
    private String clinical;
    private String firstVisit;
    private String advice;
    private String titleTag;
    private String remark;

    public String getTreatmentCaseId() {
        return treatmentCaseId;
    }

    public void setTreatmentCaseId(String treatmentCaseId) {
        this.treatmentCaseId = treatmentCaseId;
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

    public String getOperatorDate() {
        return operatorDate;
    }

    public void setOperatorDate(String operatorDate) {
        this.operatorDate = operatorDate;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getClinical() {
        return clinical;
    }

    public void setClinical(String clinical) {
        this.clinical = clinical;
    }

    public String getFirstVisit() {
        return firstVisit;
    }

    public void setFirstVisit(String firstVisit) {
        this.firstVisit = firstVisit;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    public String getTitleTag() {
        return titleTag;
    }

    public void setTitleTag(String titleTag) {
        this.titleTag = titleTag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getHorseType() {
        return horseType;
    }

    public void setHorseType(Integer horseType) {
        this.horseType = horseType;
    }
}
