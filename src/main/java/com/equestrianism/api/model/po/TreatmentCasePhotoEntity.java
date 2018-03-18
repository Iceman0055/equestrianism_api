package com.equestrianism.api.model.po;

import com.equestrianism.api.core.model.BasePO;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.UUID;

/**
 * Created by Chenzq on 2018/3/17.
 */
public class TreatmentCasePhotoEntity extends BasePO {

    private String casePhotoId = UUID.randomUUID().toString().replace( "-", "" );
    private String treatmentCaseId;
    private Integer photoType;
    private byte[] photo;

    public TreatmentCasePhotoEntity() {
    }

    public TreatmentCasePhotoEntity( String casePhotoId ) {
        this.casePhotoId = casePhotoId;
    }

    public TreatmentCasePhotoEntity( String treatmentCaseId, Integer photoType, MultipartFile photo ) throws IOException {
        this( UUID.randomUUID().toString().replace( "-", "" ), treatmentCaseId, photoType, photo );
    }

    public TreatmentCasePhotoEntity( String casePhotoId, String treatmentCaseId, Integer photoType, MultipartFile photo ) throws IOException {
        this.casePhotoId = casePhotoId;
        this.treatmentCaseId = treatmentCaseId;
        this.photoType = photoType;
        this.photo = photo.getBytes();
    }

    public String getCasePhotoId() {
        return casePhotoId;
    }

    public void setCasePhotoId(String casePhotoId) {
        this.casePhotoId = casePhotoId;
    }

    public String getTreatmentCaseId() {
        return treatmentCaseId;
    }

    public void setTreatmentCaseId(String treatmentCaseId) {
        this.treatmentCaseId = treatmentCaseId;
    }

    public Integer getPhotoType() {
        return photoType;
    }

    public void setPhotoType(Integer photoType) {
        this.photoType = photoType;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }
}
