package com.equestrianism.api.model.vo.feeder_info;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Iceman
 * 2018/3/5
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class FeederInfoUpdateVO extends FeederInfoAddVO {

    private String feederId;

    public String getFeederId() {
        return feederId;
    }

    public void setFeederId( String feederId ) {
        this.feederId = feederId;
    }

}
