package com.equestrianism.api.model.vo.horse_info;

import com.equestrianism.api.core.model.BaseViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

/**
 * Created by Chenzq on 2018/1/28.
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class HorseInfoAddVO extends BaseViewModel {

    private String passportNumber;
    private String horseName;
    private String usedName;
    private String country;
    private Date changeDate;
    private Date birthday;
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

    private MultipartFile rightImage;
    private MultipartFile leftImage;
    private MultipartFile upperEyelinerImage;
    private MultipartFile foreImage;
    private MultipartFile hindImage;
    private MultipartFile neckImage;
    private MultipartFile lipImage;

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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
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

    public String getRightForeDesc() {
        return rightForeDesc;
    }

    public void setRightForeDesc(String rightForeDesc) {
        this.rightForeDesc = rightForeDesc;
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

    public MultipartFile getRightImage() {
        return rightImage;
    }

    public void setRightImage(MultipartFile rightImage) {
        this.rightImage = rightImage;
    }

    public MultipartFile getLeftImage() {
        return leftImage;
    }

    public void setLeftImage(MultipartFile leftImage) {
        this.leftImage = leftImage;
    }

    public MultipartFile getUpperEyelinerImage() {
        return upperEyelinerImage;
    }

    public void setUpperEyelinerImage(MultipartFile upperEyelinerImage) {
        this.upperEyelinerImage = upperEyelinerImage;
    }

    public MultipartFile getForeImage() {
        return foreImage;
    }

    public void setForeImage(MultipartFile foreImage) {
        this.foreImage = foreImage;
    }

    public MultipartFile getHindImage() {
        return hindImage;
    }

    public void setHindImage(MultipartFile hindImage) {
        this.hindImage = hindImage;
    }

    public MultipartFile getNeckImage() {
        return neckImage;
    }

    public void setNeckImage(MultipartFile neckImage) {
        this.neckImage = neckImage;
    }

    public MultipartFile getLipImage() {
        return lipImage;
    }

    public void setLipImage(MultipartFile lipImage) {
        this.lipImage = lipImage;
    }
}
