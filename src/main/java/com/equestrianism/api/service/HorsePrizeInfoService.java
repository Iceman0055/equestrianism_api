package com.equestrianism.api.service;

import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.model.vo.horse_prize_info.HorsePrizeInfoAddVO;

/**
 * Created by Chenzq on 2018/3/6.
 */
public interface HorsePrizeInfoService {

    Boolean addHorsePrizeInfo( HorsePrizeInfoAddVO horsePrizeInfoAddVO ) throws BaseException;



}
