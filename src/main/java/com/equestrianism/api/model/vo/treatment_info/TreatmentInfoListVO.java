package com.equestrianism.api.model.vo.treatment_info;

import com.equestrianism.api.core.model.BasePageViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by Chenzq on 2018/3/17.
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class TreatmentInfoListVO extends BasePageViewModel {

    private String treatName;
    private String horseId;

    public String getHorseId() {
        return horseId;
    }

    public void setHorseId(String horseId) {
        this.horseId = horseId;
    }

    public String getTreatName() {
        return treatName;
    }

    public void setTreatName(String treatName) {
        this.treatName = treatName;
    }
}
