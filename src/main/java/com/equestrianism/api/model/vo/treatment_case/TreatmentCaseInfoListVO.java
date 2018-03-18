package com.equestrianism.api.model.vo.treatment_case;

import com.equestrianism.api.core.model.BasePageViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by Chenzq on 2018/3/18.
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class TreatmentCaseInfoListVO extends BasePageViewModel {

    private String titleTag;
    private String horseId;

    public String getTitleTag() {
        return titleTag;
    }

    public void setTitleTag(String titleTag) {
        this.titleTag = titleTag;
    }

    public String getHorseId() {
        return horseId;
    }

    public void setHorseId(String horseId) {
        this.horseId = horseId;
    }
}
