package com.equestrianism.api.service;

import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.model.bo.HorsePrizeInfoDetailBO;
import com.equestrianism.api.model.bo.HorsePrizeInfoListBO;
import com.equestrianism.api.model.vo.horse_prize_info.*;

/**
 * Created by Chenzq on 2018/3/6.
 */
public interface HorsePrizeInfoService {

    Boolean addHorsePrizeInfo( HorsePrizeInfoAddVO horsePrizeInfoAddVO ) throws BaseException;

    Boolean updateHorsePrizeInfo( HorsePrizeInfoUpdateVO horsePrizeInfoUpdateVO ) throws BaseException;

    Boolean removeHorsePrizeInfo( HorsePrizeInfoDeleteVO horsePrizeInfoDeleteVo ) throws BaseException;

    HorsePrizeInfoListBO horsePrizeInfoList( HorsePrizeInfoListVO horsePrizeInfoListVo ) throws BaseException;

    HorsePrizeInfoDetailBO horsePrizeInfoDetail(HorsePrizeInfoDetailVO horsePrizeInfoDetailVo ) throws BaseException;

}
