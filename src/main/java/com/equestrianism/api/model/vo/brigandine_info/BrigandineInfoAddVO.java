package com.equestrianism.api.model.vo.brigandine_info;

import com.equestrianism.api.core.model.BaseViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by Chenzq on 2018/3/9.
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class BrigandineInfoAddVO extends BaseViewModel {

    private String horseId;
    private String userId;
    private String brigandineDate;
    private String remark;

    public String getHorseId() {
        return horseId;
    }

    public void setHorseId(String horseId) {
        this.horseId = horseId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBrigandineDate() {
        return brigandineDate;
    }

    public void setBrigandineDate(String brigandineDate) {
        this.brigandineDate = brigandineDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
