package com.equestrianism.api.dao;

import com.equestrianism.api.model.bo.FeederInfoDetailBO;
import com.equestrianism.api.model.model.FeederInfoListModel;
import com.equestrianism.api.model.po.FeederInfoEntity;
import com.equestrianism.api.model.vo.feeder_info.FeederInfoListVO;

import java.util.List;

/**
 * Iceman
 * 2018/3/5
 */
public interface FeederInfoMapper {

    Integer insert( FeederInfoEntity feederInfoEntity );

    Integer updateBySelective( FeederInfoEntity feederInfoEntity );

    List<FeederInfoListModel> selectFeederListByPage( FeederInfoListVO feederInfoListVo );

    Integer countFeederListByPage( FeederInfoListVO feederInfoListVo );

    FeederInfoDetailBO selectFeederInfoByDetail( String feederId );

    FeederInfoDetailBO selectByResume( String horseId );

}
