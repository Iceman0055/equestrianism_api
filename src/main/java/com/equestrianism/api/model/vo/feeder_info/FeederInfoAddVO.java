package com.equestrianism.api.model.vo.feeder_info;

import com.equestrianism.api.core.model.BaseViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.springframework.web.multipart.MultipartFile;

/**
 * Iceman
 * 2018/3/5
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class FeederInfoAddVO extends BaseViewModel {

    private String feederName;
    private Integer sex;
    private String skillDesc;
    private String horseId;
    private String hireDate;
    private MultipartFile idCardImage;

    public String getFeederName() {
        return feederName;
    }

    public void setFeederName( String feederName ) {
        this.feederName = feederName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex( Integer sex ) {
        this.sex = sex;
    }

    public String getSkillDesc() {
        return skillDesc;
    }

    public void setSkillDesc( String skillDesc ) {
        this.skillDesc = skillDesc;
    }

    public String getHorseId() {
        return horseId;
    }

    public void setHorseId( String horseId ) {
        this.horseId = horseId;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate( String hireDate ) {
        this.hireDate = hireDate;
    }

    public MultipartFile getIdCardImage() {
        return idCardImage;
    }

    public void setIdCardImage( MultipartFile idCardImage ) {
        this.idCardImage = idCardImage;
    }

}
