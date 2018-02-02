package com.equestrianism.api.dao;

import com.equestrianism.api.model.model.HorseInfoListModel;
import com.equestrianism.api.model.po.HorseInfoEntity;
import com.equestrianism.api.model.vo.horse_info.HorseInfoListVO;

import java.util.List;

/**
 * Iceman
 * 2018/1/26
 */
public interface HorseInfoMapper {

    Integer insert( HorseInfoEntity horseInfoEntity );

    Integer updateBySelective( HorseInfoEntity horseInfoEntity );

    List<HorseInfoListModel> selectHorseListByPage( HorseInfoListVO horseInfoListVo );

    Integer countHorseListByPage( HorseInfoListVO horseInfoListVo );

}
