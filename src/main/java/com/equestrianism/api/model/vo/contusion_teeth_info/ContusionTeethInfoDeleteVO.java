package com.equestrianism.api.model.vo.contusion_teeth_info;

import com.equestrianism.api.core.model.BaseViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by Chenzq on 2018/3/9.
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class ContusionTeethInfoDeleteVO extends BaseViewModel {

    private String contusionTeethId;
    private Integer deleteFlag;
    private Integer status;

    public String getContusionTeethId() {
        return contusionTeethId;
    }

    public void setContusionTeethId(String contusionTeethId) {
        this.contusionTeethId = contusionTeethId;
    }

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

}
