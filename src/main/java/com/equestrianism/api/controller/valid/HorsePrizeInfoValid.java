package com.equestrianism.api.controller.valid;

import com.equestrianism.api.model.vo.horse_prize_info.HorsePrizeInfoAddVO;

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


}
