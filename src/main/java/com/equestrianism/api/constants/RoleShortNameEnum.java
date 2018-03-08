package com.equestrianism.api.constants;

/**
 * Iceman
 * 2018/3/7
 */
public enum RoleShortNameEnum {

    C_ADMIN( "C_ADMIN", "系统管理员" ),
    H_VETERINARIAN( "H_VETERINARIAN", "兽医" ),
    H_ADMIN( "H_ADMIN", "马医院系统管理员" ),
    H_FEEDER( "H_FEEDER", "饲养员" )
    ;

    public String shortName;
    public String remark;

    RoleShortNameEnum( String shortName, String remark ) {
        this.shortName = shortName;
        this.remark = remark;
    }

}
