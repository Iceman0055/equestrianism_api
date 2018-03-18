package com.equestrianism.api.model.po;

import com.equestrianism.api.core.model.BasePO;

import java.util.UUID;

/**
 * Created by Chenzq on 2018/3/17.
 */
public class TreatmentCaseInfoEntity extends BasePO {

    private String treatmentCaseId = UUID.randomUUID().toString().replace( "-", "" );
    private String treatmentId;
    private String operatorDate;
    private String place;
    private String clinical;
    private String firstVisit;
    private String advice;
    private String titleTag;
    private String remark;

    public TreatmentCaseInfoEntity() {
    }

    public TreatmentCaseInfoEntity( String treatmentCaseId ) {
        this.treatmentCaseId = treatmentCaseId;
    }

    public TreatmentCaseInfoEntity( String treatmentId, String operatorDate, String place, String clinical,
                                    String firstVisit, String advice, String titleTag, String remark ) {
        this( UUID.randomUUID().toString().replace( "-", "" ), treatmentId, operatorDate, place, clinical, firstVisit,
                advice, titleTag, remark );
    }

    public TreatmentCaseInfoEntity( String treatmentCaseId, String treatmentId, String operatorDate, String place,
                                    String clinical, String firstVisit, String advice, String titleTag, String remark ) {
        this.treatmentCaseId = treatmentCaseId;
        this.treatmentId = treatmentId;
        this.operatorDate = operatorDate;
        this.place = place;
        this.clinical = clinical;
        this.firstVisit = firstVisit;
        this.advice = advice;
        this.titleTag = titleTag;
        this.remark = remark;
    }

    public String getTreatmentCaseId() {
        return treatmentCaseId;
    }

    public void setTreatmentCaseId(String treatmentCaseId) {
        this.treatmentCaseId = treatmentCaseId;
    }

    public String getTreatmentId() {
        return treatmentId;
    }

    public void setTreatmentId(String treatmentId) {
        this.treatmentId = treatmentId;
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
}
