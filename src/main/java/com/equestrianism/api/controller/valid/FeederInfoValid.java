package com.equestrianism.api.controller.valid;

import com.equestrianism.api.model.vo.feeder_info.FeederInfoAddVO;
import com.equestrianism.api.model.vo.feeder_info.FeederInfoUpdateVO;

/**
 * Iceman
 * 2018/3/5
 */
public class FeederInfoValid {

    public static FeederInfoAddVO feederInfoAddValid( FeederInfoAddVO feederInfoAddVo ) {
        if ( feederInfoAddVo.getHorseId() == null || "".equals( feederInfoAddVo.getHorseId() ) ) {
            feederInfoAddVo.setHorseId( "" );
        }
        return feederInfoAddVo;
    }

    public static FeederInfoUpdateVO feederInfoUpdateValid( FeederInfoUpdateVO feederInfoUpdateVo ) {
        if ( feederInfoUpdateVo.getHorseId() == null || "".equals( feederInfoUpdateVo.getHorseId() ) ) {
            feederInfoUpdateVo.setHorseId( "" );
        }
        return feederInfoUpdateVo;
    }
}
