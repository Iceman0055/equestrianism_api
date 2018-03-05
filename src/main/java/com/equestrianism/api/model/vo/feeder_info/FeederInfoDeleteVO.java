package com.equestrianism.api.model.vo.feeder_info;

import com.equestrianism.api.core.model.BaseViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Iceman
 * 2018/3/5
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class FeederInfoDeleteVO extends BaseViewModel {

    private String feederId;
    private Integer deleteFlag;
    private Integer status;

    public String getFeederId() {
        return feederId;
    }

    public void setFeederId( String feederId ) {
        this.feederId = feederId;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag( Integer deleteFlag ) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus( Integer status ) {
        this.status = status;
    }

}
