package com.equestrianism.api.model.vo.treatment_case;

import com.equestrianism.api.core.model.BaseViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Chenzq on 2018/3/18.
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class TreatmentCasePhotoAddVO extends BaseViewModel {

    private Integer photoType;
    private MultipartFile photo;

    public Integer getPhotoType() {
        return photoType;
    }

    public void setPhotoType(Integer photoType) {
        this.photoType = photoType;
    }

    public MultipartFile getPhoto() {
        return photo;
    }

    public void setPhoto(MultipartFile photo) {
        this.photo = photo;
    }

}
