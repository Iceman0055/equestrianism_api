package com.equestrianism.api.model.model;

import com.equestrianism.api.core.model.BaseObject;

import java.util.Date;

/**
 * Iceman
 * 2018/1/30
 */
public class HorseInfoListModel extends BaseObject {

    private String horseId;
    private String passportNumber;
    private String horseName;
    private String sex;
    private String usedName;
    private Date changeDate;
    private String birthday;
    private String country;
    private String height;
    private String coatColour;
    private String barCode;
    private Integer status;

    public String getHorseId() {
        return horseId;
    }

    public void setHorseId( String horseId ) {
        this.horseId = horseId;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber( String passportNumber ) {
        this.passportNumber = passportNumber;
    }

    public String getHorseName() {
        return horseName;
    }

    public void setHorseName( String horseName ) {
        this.horseName = horseName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex( String sex ) {
        this.sex = sex;
    }

    public String getUsedName() {
        return usedName;
    }

    public void setUsedName( String usedName ) {
        this.usedName = usedName;
    }

    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate( Date changeDate ) {
        this.changeDate = changeDate;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday( String birthday ) {
        this.birthday = birthday;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry( String country ) {
        this.country = country;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight( String height ) {
        this.height = height;
    }

    public String getCoatColour() {
        return coatColour;
    }

    public void setCoatColour( String coatColour ) {
        this.coatColour = coatColour;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode( String barCode ) {
        this.barCode = barCode;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus( Integer status ) {
        this.status = status;
    }

}
