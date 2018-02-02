package com.equestrianism.api.model.po;

import com.equestrianism.api.core.model.BasePO;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Date;
import java.util.UUID;

/**
 * Created by Chenzq on 2018/1/26.
 */
public class HorseInfoEntity extends BasePO {

    private String horseId = UUID.randomUUID().toString().replace( "-", "" );
    private String passportNumber;
    private String horseName;
    private String usedName;
    private String country;
    private Date changeDate;
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

    public HorseInfoEntity() {
    }

    public HorseInfoEntity( String horseId ) {
        this.horseId = horseId;
    }

    public HorseInfoEntity( String passportNumber, String horseName, String usedName, String country,
                            Date changeDate, String birthday, String height, String sex, String barCode, String coatColour,
                            String headDesc, String leftForeDesc, String rightForeDesc, String leftHindDesc, String rightHindDesc,
                            String bodyDesc, MultipartFile rightImage, MultipartFile leftImage, MultipartFile upperEyelinerImage,
                            MultipartFile foreImage, MultipartFile hindImage, MultipartFile neckImage, MultipartFile lipImage ) throws IOException {
        this ( UUID.randomUUID().toString().replace( "-", "" ), passportNumber, horseName, usedName, country, changeDate,
                birthday, height, sex, barCode, coatColour, headDesc, leftForeDesc, rightForeDesc, leftHindDesc, rightHindDesc,
                bodyDesc, rightImage, leftImage, upperEyelinerImage, foreImage, hindImage, neckImage, lipImage );
    }

    public HorseInfoEntity( String horseId, String passportNumber, String horseName, String usedName, String country,
                            Date changeDate, String birthday, String height, String sex, String barCode, String coatColour,
                            String headDesc, String leftForeDesc, String rightForeDesc, String leftHindDesc, String rightHindDesc,
                            String bodyDesc, MultipartFile rightImage, MultipartFile leftImage, MultipartFile upperEyelinerImage,
                            MultipartFile foreImage, MultipartFile hindImage, MultipartFile neckImage, MultipartFile lipImage ) throws IOException {
        this.horseId = horseId;
        this.passportNumber = passportNumber;
        this.horseName = horseName;
        this.usedName = usedName;
        this.country = country;
        this.changeDate = changeDate;
        this.birthday = birthday;
        this.height = height;
        this.sex = sex;
        this.barCode = barCode;
        this.coatColour = coatColour;
        this.headDesc = headDesc;
        this.leftForeDesc = leftForeDesc;
        this.rightForeDesc = rightForeDesc;
        this.leftHindDesc = leftHindDesc;
        this.rightHindDesc = rightHindDesc;
        this.bodyDesc = bodyDesc;
        if ( rightImage != null ) {
            this.rightImage = rightImage.getBytes();
        } else {
            this.rightImage = new byte[0];
        }
        if ( leftImage != null ) {
            this.leftImage = leftImage.getBytes();
        } else {
            this.leftImage = new byte[0];
        }
        if ( upperEyelinerImage != null ) {
            this.upperEyelinerImage = upperEyelinerImage.getBytes();
        } else {
            this.upperEyelinerImage = new byte[0];
        }
        if ( foreImage != null ) {
            this.foreImage = foreImage.getBytes();
        } else {
            this.foreImage = new byte[0];
        }
        if ( hindImage != null ) {
            this.hindImage = hindImage.getBytes();
        } else {
            this.hindImage = new byte[0];
        }
        if ( neckImage != null ) {
            this.neckImage = neckImage.getBytes();
        } else {
            this.neckImage = new byte[0];
        }
        if ( lipImage != null ) {
            this.lipImage = lipImage.getBytes();
        } else {
            this.lipImage = new byte[0];
        }
    }

    /** base **/
    public String getHorseId() {
        return horseId;
    }

    public void setHorseId(String horseId) {
        this.horseId = horseId;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getHorseName() {
        return horseName;
    }

    public void setHorseName(String horseName) {
        this.horseName = horseName;
    }

    public String getUsedName() {
        return usedName;
    }

    public void setUsedName(String usedName) {
        this.usedName = usedName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getCoatColour() {
        return coatColour;
    }

    public void setCoatColour(String coatColour) {
        this.coatColour = coatColour;
    }

    /** desc **/
    public String getHeadDesc() {
        return headDesc;
    }

    public void setHeadDesc(String headDesc) {
        this.headDesc = headDesc;
    }

    public String getLeftForeDesc() {
        return leftForeDesc;
    }

    public void setLeftForeDesc(String leftForeDesc) {
        this.leftForeDesc = leftForeDesc;
    }

    public String getLeftHindDesc() {
        return leftHindDesc;
    }

    public void setLeftHindDesc(String leftHindDesc) {
        this.leftHindDesc = leftHindDesc;
    }

    public String getRightHindDesc() {
        return rightHindDesc;
    }

    public void setRightHindDesc(String rightHindDesc) {
        this.rightHindDesc = rightHindDesc;
    }

    public String getBodyDesc() {
        return bodyDesc;
    }

    public void setBodyDesc(String bodyDesc) {
        this.bodyDesc = bodyDesc;
    }

    /** image **/
    public byte[] getRightImage() {
        return rightImage;
    }

    public void setRightImage(byte[] rightImage) {
        this.rightImage = rightImage;
    }

    public byte[] getLeftImage() {
        return leftImage;
    }

    public void setLeftImage(byte[] leftImage) {
        this.leftImage = leftImage;
    }

    public byte[] getUpperEyelinerImage() {
        return upperEyelinerImage;
    }

    public void setUpperEyelinerImage(byte[] upperEyelinerImage) {
        this.upperEyelinerImage = upperEyelinerImage;
    }

    public byte[] getForeImage() {
        return foreImage;
    }

    public void setForeImage(byte[] foreImage) {
        this.foreImage = foreImage;
    }

    public byte[] getHindImage() {
        return hindImage;
    }

    public void setHindImage(byte[] hindImage) {
        this.hindImage = hindImage;
    }

    public byte[] getNeckImage() {
        return neckImage;
    }

    public void setNeckImage(byte[] neckImage) {
        this.neckImage = neckImage;
    }

    public String getRightForeDesc() {
        return rightForeDesc;
    }

    public void setRightForeDesc( String rightForeDesc ) {
        this.rightForeDesc = rightForeDesc;
    }

    public byte[] getLipImage() {
        return lipImage;
    }

    public void setLipImage( byte[] lipImage ) {
        this.lipImage = lipImage;
    }
}
