package com.equestrianism.api.model.vo.contusion_teeth_info;

import com.equestrianism.api.core.model.BasePageViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by Chenzq on 2018/3/9.
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class ContusionTeethInfoAddVO extends BasePageViewModel {

    private String horseId;
    private String userId;
    private String operateDate;
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

    public String getOperateDate() {
        return operateDate;
    }

    public void setOperateDate(String operateDate) {
        this.operateDate = operateDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}
