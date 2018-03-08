package com.equestrianism.api.model.vo.brigandine_info;

import com.equestrianism.api.core.model.BasePageViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by Chenzq on 2018/3/9.
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class BrigandineInfoListVO extends BasePageViewModel {

    private String horseId;

    public String getHorseId() {
        return horseId;
    }

    public void setHorseId(String horseId) {
        this.horseId = horseId;
    }

}
