package com.equestrianism.api.constants;

/**
 * Created by Chenzq on 2018/1/21.
 */
public enum DeleteFlagEnum {

    DELETE_FLAG( 1, "已删除" ),
    UNDELETE_FLAG( 0, "未删除" );

    private Integer flag;
    private String note;

    DeleteFlagEnum( Integer flag, String note ) {
        this.flag = flag;
        this.note = note;
    }

}
