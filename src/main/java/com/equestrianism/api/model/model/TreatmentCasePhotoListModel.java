package com.equestrianism.api.model.model;

import com.equestrianism.api.core.model.BaseObject;

/**
 * Created by Chenzq on 2018/3/18.
 */
public class TreatmentCasePhotoListModel extends BaseObject {

    private String casePhotoId;
    private byte[] photo;

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getCasePhotoId() {
        return casePhotoId;
    }

    public void setCasePhotoId(String casePhotoId) {
        this.casePhotoId = casePhotoId;
    }
}
