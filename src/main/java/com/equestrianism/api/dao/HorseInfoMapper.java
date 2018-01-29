package com.equestrianism.api.dao;

import com.equestrianism.api.model.po.HorseInfoEntity;

/**
 * Iceman
 * 2018/1/26
 */
public interface HorseInfoMapper {

    Integer insert( HorseInfoEntity horseInfoEntity );

    Integer updateBySelective( HorseInfoEntity horseInfoEntity );

}
