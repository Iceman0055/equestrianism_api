package com.equestrianism.api.model.po;

import com.equestrianism.api.core.model.BasePO;

import java.util.UUID;

/**
 * Created by Chenzq on 2018/3/10.
 */
public class VaccinationInfoEntity extends BasePO {

    private String vaccinationId = UUID.randomUUID().toString().replace( "-", "" );
    private String horseId;
    private String operateDate;
    private String operatePlace;
    private String name;
    private String vaccinationName;
    private String userId;
    private String vaccinationNumber;

    public VaccinationInfoEntity() {
    }

    public VaccinationInfoEntity( String vaccinationId ) {
        this.vaccinationId = vaccinationId;
    }

    public VaccinationInfoEntity( String horseId, String userId, String operateDate, String operatePlace,
                                  String name, String vaccinationName, String vaccinationNumber ) {
        this( UUID.randomUUID().toString().replace( "-", "" ), horseId, userId, operateDate, operatePlace, name, vaccinationName,
                vaccinationNumber );
    }

    public VaccinationInfoEntity( String vaccinationId, String horseId, String userId, String operateDate, String operatePlace,
                                  String name, String vaccinationName, String vaccinationNumber ) {
        this.vaccinationId = vaccinationId;
        this.horseId = horseId;
        this.userId = userId;
        this.operateDate = operateDate;
        this.operatePlace = operatePlace;
        this.name = name;
        this.vaccinationName = vaccinationName;
        this.vaccinationNumber = vaccinationNumber;
    }

    public String getVaccinationId() {
        return vaccinationId;
    }

    public void setVaccinationId(String vaccinationId) {
        this.vaccinationId = vaccinationId;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getVaccinationNumber() {
        return vaccinationNumber;
    }

    public void setVaccinationNumber(String vaccinationNumber) {
        this.vaccinationNumber = vaccinationNumber;
    }

}
