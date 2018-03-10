package com.equestrianism.api.model.vo.contusion_teeth_info;

import com.equestrianism.api.core.model.BaseViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by Chenzq on 2018/3/10.
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class ContusionTeethInfoDetailVO extends BaseViewModel {

    private String contusionTeethId;

    public String getContusionTeethId() {
        return contusionTeethId;
    }

    public void setContusionTeethId(String contusionTeethId) {
        this.contusionTeethId = contusionTeethId;
    }

}
