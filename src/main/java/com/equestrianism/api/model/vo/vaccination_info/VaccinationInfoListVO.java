package com.equestrianism.api.model.vo.vaccination_info;

import com.equestrianism.api.core.model.BasePageViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by Chenzq on 2018/3/10.
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class VaccinationInfoListVO extends BasePageViewModel {

    private String horseId;

    public String getHorseId() {
        return horseId;
    }

    public void setHorseId(String horseId) {
        this.horseId = horseId;
    }

}
