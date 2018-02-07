package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BaseObject;

/**
 * Iceman
 * 2018/2/7
 */
public class HorseInfoDetailBO extends BaseObject {

    private String horseId;
    private String passportNumber;
    private String horseName;
    private String usedName;
    private String country;
    private String changeDate;
    private String birthday;
    private String height;
    private String sex;
    private String barCode;
    private String coatColour;

    private String headDesc;
    private String leftForeDesc;
    private String rightForeDesc;
    private String leftHindDesc;
    private String rightHindDesc;
    private String bodyDesc;

    private byte[] rightImage;
    private byte[] leftImage;
    private byte[] upperEyelinerImage;
    private byte[] foreImage;
    private byte[] hindImage;
    private byte[] neckImage;
    private byte[] lipImage;

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

    public String getUsedName() {
        return usedName;
    }

    public void setUsedName( String usedName ) {
        this.usedName = usedName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry( String country ) {
        this.country = country;
    }

    public String getChangeDate() {
        return changeDate;
    }

    public void setChangeDate( String changeDate ) {
        this.changeDate = changeDate;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday( String birthday ) {
        this.birthday = birthday;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight( String height ) {
        this.height = height;
    }

    public String getSex() {
        return sex;
    }

    public void setSex( String sex ) {
        this.sex = sex;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode( String barCode ) {
        this.barCode = barCode;
    }

    public String getCoatColour() {
        return coatColour;
    }

    public void setCoatColour( String coatColour ) {
        this.coatColour = coatColour;
    }

    public String getHeadDesc() {
        return headDesc;
    }

    public void setHeadDesc( String headDesc ) {
        this.headDesc = headDesc;
    }

    public String getLeftForeDesc() {
        return leftForeDesc;
    }

    public void setLeftForeDesc( String leftForeDesc ) {
        this.leftForeDesc = leftForeDesc;
    }

    public String getRightForeDesc() {
        return rightForeDesc;
    }

    public void setRightForeDesc( String rightForeDesc ) {
        this.rightForeDesc = rightForeDesc;
    }

    public String getLeftHindDesc() {
        return leftHindDesc;
    }

    public void setLeftHindDesc( String leftHindDesc ) {
        this.leftHindDesc = leftHindDesc;
    }

    public String getRightHindDesc() {
        return rightHindDesc;
    }

    public void setRightHindDesc( String rightHindDesc ) {
        this.rightHindDesc = rightHindDesc;
    }

    public String getBodyDesc() {
        return bodyDesc;
    }

    public void setBodyDesc( String bodyDesc ) {
        this.bodyDesc = bodyDesc;
    }

    public byte[] getRightImage() {
        return rightImage;
    }

    public void setRightImage( byte[] rightImage ) {
        this.rightImage = rightImage;
    }

    public byte[] getLeftImage() {
        return leftImage;
    }

    public void setLeftImage( byte[] leftImage ) {
        this.leftImage = leftImage;
    }

    public byte[] getUpperEyelinerImage() {
        return upperEyelinerImage;
    }

    public void setUpperEyelinerImage( byte[] upperEyelinerImage ) {
        this.upperEyelinerImage = upperEyelinerImage;
    }

    public byte[] getForeImage() {
        return foreImage;
    }

    public void setForeImage( byte[] foreImage ) {
        this.foreImage = foreImage;
    }

    public byte[] getHindImage() {
        return hindImage;
    }

    public void setHindImage( byte[] hindImage ) {
        this.hindImage = hindImage;
    }

    public byte[] getNeckImage() {
        return neckImage;
    }

    public void setNeckImage( byte[] neckImage ) {
        this.neckImage = neckImage;
    }

    public byte[] getLipImage() {
        return lipImage;
    }

    public void setLipImage( byte[] lipImage ) {
        this.lipImage = lipImage;
    }

}
