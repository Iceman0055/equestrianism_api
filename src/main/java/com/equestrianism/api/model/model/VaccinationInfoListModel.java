package com.equestrianism.api.model.model;

import com.equestrianism.api.core.model.BaseObject;


/**
 * Created by Chenzq on 2018/3/11.
 */
public class VaccinationInfoListModel extends BaseObject {

    private String vaccinationId;
    private String horseName;
    private String operateDate;
    private String operatePlace;
    private String name;
    private String vaccinationName;
    private String realname;
    private String vaccinationNumber;

    public String getVaccinationId() {
        return vaccinationId;
    }

    public void setVaccinationId(String vaccinationId) {
        this.vaccinationId = vaccinationId;
    }

    public String getHorseName() {
        return horseName;
    }

    public void setHorseName(String horseName) {
        this.horseName = horseName;
    }

    public String getOperateDate() {
        return operateDate;
    }

    public void setOperateDate(String operateDate) {
        this.operateDate = operateDate;
    }

    public String getOperatePlace() {
        return operatePlace;
    }

    public void setOperatePlace(String operatePlace) {
        this.operatePlace = operatePlace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVaccinationName() {
        return vaccinationName;
    }

    public void setVaccinationName(String vaccinationName) {
        this.vaccinationName = vaccinationName;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getVaccinationNumber() {
        return vaccinationNumber;
    }

    public void setVaccinationNumber(String vaccinationNumber) {
        this.vaccinationNumber = vaccinationNumber;
    }

}
