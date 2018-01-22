package com.equestrianism.api.constants;

import com.equestrianism.api.core.model.BaseEnum;

/**
 * Iceman
 * 2018/1/22
 */
public enum CodeEnum implements BaseEnum {

    PROCESS_SUCCESS( 10200, "操作成功" ),
    PROCESS_FAIL( 10100, "操作失败" ),
    PROCESS_TIME_OUT( 10101, "处理超时" )
    ;

    public Integer code;
    public String note;

    public void setCode( Integer code ) {
        this.code = code;
    }

    public void setNote( String note ) {

        this.note = note;
    }

    CodeEnum( Integer code, String note ) {
        this.note = note;
        this.code = code;
    }

    @Override
    public String getName() {
        return this.note;
    }

    @Override
    public Integer getType() {
        return this.code;
    }

}
