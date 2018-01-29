package com.equestrianism.api.controller.valid;

import com.equestrianism.api.model.vo.horse_info.HorseInfoAddVO;
import com.equestrianism.api.model.vo.horse_info.HorseInfoUpdateVO;

/**
 * Created by Chenzq on 2018/1/28.
 */
public class HorseInfoValid {

    public static HorseInfoAddVO horseInfoAddValid( HorseInfoAddVO horseInfoAddVo ) {
        if ( horseInfoAddVo.getPassportNumber() == null || "".equals( horseInfoAddVo.getPassportNumber() ) ) {
            horseInfoAddVo.setPassportNumber( "" );
        }
        if ( horseInfoAddVo.getHorseName() == null || "".equals( horseInfoAddVo.getHorseName() ) ) {
            horseInfoAddVo.setHorseName( "" );
        }
        if ( horseInfoAddVo.getUsedName() == null || "".equals( horseInfoAddVo.getUsedName() ) ) {
            horseInfoAddVo.setUsedName( "" );
        }
        if ( horseInfoAddVo.getCountry() == null || "".equals( horseInfoAddVo.getCountry() ) ) {
            horseInfoAddVo.setCountry( "" );
        }
        if ( horseInfoAddVo.getHeight() == null || "".equals( horseInfoAddVo.getHeight() ) ) {
            horseInfoAddVo.setHeight( "" );
        }
        if ( horseInfoAddVo.getSex() == null || "".equals( horseInfoAddVo.getSex() ) ) {
            horseInfoAddVo.setSex( "" );
        }
        if ( horseInfoAddVo.getBarCode() == null || "".equals( horseInfoAddVo.getBarCode() ) ) {
            horseInfoAddVo.setBarCode( "" );
        }
        if ( horseInfoAddVo.getCoatColour() == null || "".equals( horseInfoAddVo.getCoatColour() ) ) {
            horseInfoAddVo.setCoatColour( "" );
        }
        if ( horseInfoAddVo.getHeadDesc() == null || "".equals( horseInfoAddVo.getHeadDesc() ) ) {
            horseInfoAddVo.setHeadDesc( "" );
        }
        if ( horseInfoAddVo.getLeftForeDesc() == null || "".equals( horseInfoAddVo.getLeftForeDesc() ) ) {
            horseInfoAddVo.setLeftForeDesc( "" );
        }
        if ( horseInfoAddVo.getRightForeDesc() == null || "".equals( horseInfoAddVo.getRightForeDesc() ) ) {
            horseInfoAddVo.setRightForeDesc( "" );
        }
        if ( horseInfoAddVo.getLeftHindDesc() == null || "".equals( horseInfoAddVo.getLeftHindDesc() ) ) {
            horseInfoAddVo.setLeftHindDesc( "" );
        }
        if ( horseInfoAddVo.getRightHindDesc() == null || "".equals( horseInfoAddVo.getRightHindDesc() ) ) {
            horseInfoAddVo.setRightHindDesc( "" );
        }
        if ( horseInfoAddVo.getBodyDesc() == null || "".equals( horseInfoAddVo.getBodyDesc() ) ) {
            horseInfoAddVo.setBodyDesc( "" );
        }
        return horseInfoAddVo;
    }

    public static HorseInfoUpdateVO horseInfoUpdateValid( HorseInfoUpdateVO horseInfoUpdateVo ) {
        if ( horseInfoUpdateVo.getPassportNumber() == null || "".equals( horseInfoUpdateVo.getPassportNumber() ) ) {
            horseInfoUpdateVo.setPassportNumber( "" );
        }
        if ( horseInfoUpdateVo.getHorseName() == null || "".equals( horseInfoUpdateVo.getHorseName() ) ) {
            horseInfoUpdateVo.setHorseName( "" );
        }
        if ( horseInfoUpdateVo.getUsedName() == null || "".equals( horseInfoUpdateVo.getUsedName() ) ) {
            horseInfoUpdateVo.setUsedName( "" );
        }
        if ( horseInfoUpdateVo.getCountry() == null || "".equals( horseInfoUpdateVo.getCountry() ) ) {
            horseInfoUpdateVo.setCountry( "" );
        }
        if ( horseInfoUpdateVo.getHeight() == null || "".equals( horseInfoUpdateVo.getHeight() ) ) {
            horseInfoUpdateVo.setHeight( "" );
        }
        if ( horseInfoUpdateVo.getSex() == null || "".equals( horseInfoUpdateVo.getSex() ) ) {
            horseInfoUpdateVo.setSex( "" );
        }
        if ( horseInfoUpdateVo.getBarCode() == null || "".equals( horseInfoUpdateVo.getBarCode() ) ) {
            horseInfoUpdateVo.setBarCode( "" );
        }
        if ( horseInfoUpdateVo.getCoatColour() == null || "".equals( horseInfoUpdateVo.getCoatColour() ) ) {
            horseInfoUpdateVo.setCoatColour( "" );
        }
        if ( horseInfoUpdateVo.getHeadDesc() == null || "".equals( horseInfoUpdateVo.getHeadDesc() ) ) {
            horseInfoUpdateVo.setHeadDesc( "" );
        }
        if ( horseInfoUpdateVo.getLeftForeDesc() == null || "".equals( horseInfoUpdateVo.getLeftForeDesc() ) ) {
            horseInfoUpdateVo.setLeftForeDesc( "" );
        }
        if ( horseInfoUpdateVo.getRightForeDesc() == null || "".equals( horseInfoUpdateVo.getRightForeDesc() ) ) {
            horseInfoUpdateVo.setRightForeDesc( "" );
        }
        if ( horseInfoUpdateVo.getLeftHindDesc() == null || "".equals( horseInfoUpdateVo.getLeftHindDesc() ) ) {
            horseInfoUpdateVo.setLeftHindDesc( "" );
        }
        if ( horseInfoUpdateVo.getRightHindDesc() == null || "".equals( horseInfoUpdateVo.getRightHindDesc() ) ) {
            horseInfoUpdateVo.setRightHindDesc( "" );
        }
        if ( horseInfoUpdateVo.getBodyDesc() == null || "".equals( horseInfoUpdateVo.getBodyDesc() ) ) {
            horseInfoUpdateVo.setBodyDesc( "" );
        }
        return horseInfoUpdateVo;
    }
}