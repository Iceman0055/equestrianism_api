package com.equestrianism.api.controller.valid;

import com.equestrianism.api.model.vo.horse_prize_info.HorsePrizeInfoAddVO;
import com.equestrianism.api.model.vo.horse_prize_info.HorsePrizeInfoUpdateVO;

/**
 * Iceman
 * 2018/3/6
 */
public class HorsePrizeInfoValid {

    public static HorsePrizeInfoAddVO horsePrizeInfoAddValid( HorsePrizeInfoAddVO horsePrizeInfoAddVo ) {
        if ( horsePrizeInfoAddVo.getPenaltyTerm() == null || "".equals( horsePrizeInfoAddVo.getPenaltyTerm() ) ) {
            horsePrizeInfoAddVo.setPenaltyTerm( "" );
        }
        if ( horsePrizeInfoAddVo.getAwarder() == null || "".equals( horsePrizeInfoAddVo.getAwarder() ) ) {
            horsePrizeInfoAddVo.setAwarder( "" );
        }
        return horsePrizeInfoAddVo;
    }

    public static HorsePrizeInfoUpdateVO horsePrizeInfoUpdateValid( HorsePrizeInfoUpdateVO horsePrizeInfoUpdateVo ) {
        if ( horsePrizeInfoUpdateVo.getPenaltyTerm() == null || "".equals( horsePrizeInfoUpdateVo.getPenaltyTerm() ) ) {
            horsePrizeInfoUpdateVo.setPenaltyTerm( "" );
        }
        if ( horsePrizeInfoUpdateVo.getAwarder() == null || "".equals( horsePrizeInfoUpdateVo.getAwarder() ) ) {
            horsePrizeInfoUpdateVo.setAwarder( "" );
        }
        return horsePrizeInfoUpdateVo;
    }

}
