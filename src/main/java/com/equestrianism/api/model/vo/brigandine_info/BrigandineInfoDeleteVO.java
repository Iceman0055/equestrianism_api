package com.equestrianism.api.model.vo.brigandine_info;

import com.equestrianism.api.core.model.BaseViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by Chenzq on 2018/3/9.
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class BrigandineInfoDeleteVO extends BaseViewModel {

    private String brigandineId;
    private Integer status;
    private Integer deleteFlag;

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getBrigandineId() {
        return brigandineId;
    }

    public void setBrigandineId(String brigandineId) {
        this.brigandineId = brigandineId;
    }

}
