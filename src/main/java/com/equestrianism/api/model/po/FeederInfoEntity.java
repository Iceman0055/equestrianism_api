package com.equestrianism.api.model.po;

import com.equestrianism.api.core.model.BasePO;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;

/**
 * Iceman
 * 2018/3/5
 */
public class FeederInfoEntity extends BasePO {

    private String feederId = UUID.randomUUID().toString().replace( "-", "" );
    private String feederName;
    private Integer sex;
    private String skillDesc;
    private String horseId;
    private String hireDate;
    private byte[] idCardImage;

    public FeederInfoEntity() {
    }

    public FeederInfoEntity( String feederId ) {
        this.feederId = feederId;
    }

    public FeederInfoEntity( String feederName, Integer sex, String skillDesc, String horseId, String hireDate,
                             MultipartFile idCardImage ) throws IOException {
        this ( UUID.randomUUID().toString().replace( "-", "" ), feederName, sex, skillDesc, horseId, hireDate,
                idCardImage );
    }

    public FeederInfoEntity( String feederId, String feederName, Integer sex, String skillDesc, String horseId, String hireDate,
                             MultipartFile idCardImage ) throws IOException {
        this.feederId = feederId;
        this.feederName = feederName;
        this.sex = sex;
        this.skillDesc = skillDesc;
        this.horseId = horseId;
        this.hireDate = hireDate;
        if ( idCardImage != null ) {
            this.idCardImage = idCardImage.getBytes();
        }
    }

    public String getFeederId() {
        return feederId;
    }

    public void setFeederId( String feederId ) {
        this.feederId = feederId;
    }

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

    public byte[] getIdCardImage() {
        return idCardImage;
    }

    public void setIdCardImage( byte[] idCardImage ) {
        this.idCardImage = idCardImage;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate( String hireDate ) {
        this.hireDate = hireDate;
    }

}
