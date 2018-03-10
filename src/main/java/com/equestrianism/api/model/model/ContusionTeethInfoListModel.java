package com.equestrianism.api.model.model;

import com.equestrianism.api.core.model.BaseObject;

/**
 * Created by Chenzq on 2018/3/9.
 */
public class ContusionTeethInfoListModel extends BaseObject {

    private String contusionTeethId;
    private String horseName;
    private String realname;
    private String operateDate;
    private String remark;

    public String getContusionTeethId() {
        return contusionTeethId;
    }

    public void setContusionTeethId(String contusionTeethId) {
        this.contusionTeethId = contusionTeethId;
    }

    public String getHorseName() {
        return horseName;
    }

    public void setHorseName(String horseName) {
        this.horseName = horseName;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
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
