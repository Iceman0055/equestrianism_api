package com.equestrianism.api.model.vo.vaccination_info;

import com.equestrianism.api.core.model.BaseViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by Chenzq on 2018/3/10.
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class VaccinationInfoAddVO extends BaseViewModel {

    private String horseId;
    private String userId;
    private String operateDate;
    private String operatePlace;
    private String name;
    private String vaccinationName;
    private String vaccinationNumber;

    public String getHorseId() {
        return horseId;
    }

    public void setHorseId(String horseId) {
        this.horseId = horseId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getVaccinationNumber() {
        return vaccinationNumber;
    }

    public void setVaccinationNumber(String vaccinationNumber) {
        this.vaccinationNumber = vaccinationNumber;
    }

}
