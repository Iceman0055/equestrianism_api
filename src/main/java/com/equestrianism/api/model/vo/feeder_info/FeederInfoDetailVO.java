package com.equestrianism.api.model.vo.feeder_info;

import com.equestrianism.api.core.model.BaseObject;

/**
 * Iceman
 * 2018/3/5
 */
public class FeederInfoDetailVO extends BaseObject {

    private String feederId;

    public String getFeederId() {
        return feederId;
    }

    public void setFeederId( String feederId ) {
        this.feederId = feederId;
    }

}
