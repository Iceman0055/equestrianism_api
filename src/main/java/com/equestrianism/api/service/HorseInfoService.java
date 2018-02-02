package com.equestrianism.api.service;

import com.equestrianism.api.model.bo.HorseInfoListBO;
import com.equestrianism.api.model.vo.horse_info.HorseInfoAddVO;
import com.equestrianism.api.model.vo.horse_info.HorseInfoDeleteVO;
import com.equestrianism.api.model.vo.horse_info.HorseInfoListVO;
import com.equestrianism.api.model.vo.horse_info.HorseInfoUpdateVO;

import java.io.IOException;

/**
 * Created by Chenzq on 2018/1/28.
 */
public interface HorseInfoService {

    Boolean addHorseInfo( HorseInfoAddVO horseInfoAddVo ) throws IOException;

    Boolean updateHorseInfo( HorseInfoUpdateVO horseInfoUpdateVo ) throws IOException;

    Boolean removeHorseInfo( HorseInfoDeleteVO horseInfoDeleteVo );

    HorseInfoListBO horseInfoList( HorseInfoListVO horseInfoListVo );

}
