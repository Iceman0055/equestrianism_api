package com.equestrianism.api.model.vo.feeder_info;

import com.equestrianism.api.core.model.BasePageViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Iceman
 * 2018/3/5
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class FeederInfoListVO extends BasePageViewModel {

    private String feederName;

    public String getFeederName() {
        return feederName;
    }

    public void setFeederName( String feederName ) {
        this.feederName = feederName;
    }

}
