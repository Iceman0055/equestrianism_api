package com.equestrianism.api.model.model.horse_resume;

import com.equestrianism.api.core.model.BaseObject;

/**
 * Created by Chenzq on 2018/3/18.
 */
public class HorseResumeBrigandineModel extends BaseObject {

    private String brigandineDate;
    private String realname;
    private String remark;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getBrigandineDate() {
        return brigandineDate;
    }

    public void setBrigandineDate(String brigandineDate) {
        this.brigandineDate = brigandineDate;
    }
}
