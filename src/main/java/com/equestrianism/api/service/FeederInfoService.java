package com.equestrianism.api.service;

import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.model.bo.FeederInfoDetailBO;
import com.equestrianism.api.model.bo.FeederInfoListBO;
import com.equestrianism.api.model.vo.feeder_info.*;

/**
 * Iceman
 * 2018/3/5
 */
public interface FeederInfoService {

    Boolean addFeederInfo( FeederInfoAddVO feederInfoAddVO ) throws BaseException;

    Boolean updateFeederInfo( FeederInfoUpdateVO feederInfoUpdateVO ) throws BaseException;

    Boolean removeFeederInfo( FeederInfoDeleteVO feederInfoDeleteVo ) throws BaseException;

    FeederInfoListBO feederInfoList( FeederInfoListVO feederInfoListVo ) throws BaseException;

    FeederInfoDetailBO feederInfoDetail( FeederInfoDetailVO feederInfoDetailVo ) throws BaseException;

}
