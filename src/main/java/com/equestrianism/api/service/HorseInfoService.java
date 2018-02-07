package com.equestrianism.api.service;

import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.model.bo.HorseInfoDetailBO;
import com.equestrianism.api.model.bo.HorseInfoListBO;
import com.equestrianism.api.model.vo.horse_info.*;

import java.io.IOException;

/**
 * Created by Chenzq on 2018/1/28.
 */
public interface HorseInfoService {

    Boolean addHorseInfo( HorseInfoAddVO horseInfoAddVo ) throws BaseException;

    Boolean updateHorseInfo( HorseInfoUpdateVO horseInfoUpdateVo ) throws BaseException;

    Boolean removeHorseInfo( HorseInfoDeleteVO horseInfoDeleteVo ) throws BaseException;

    HorseInfoListBO horseInfoList( HorseInfoListVO horseInfoListVo ) throws BaseException;

    HorseInfoDetailBO horseInfoDetail( HorseInfoDetailVO horseInfoDetailVo ) throws BaseException;

}
