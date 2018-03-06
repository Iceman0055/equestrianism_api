package com.equestrianism.api.dao;

import com.equestrianism.api.model.bo.HorsePrizeInfoDetailBO;
import com.equestrianism.api.model.model.HorsePrizeInfoListModel;
import com.equestrianism.api.model.po.HorsePrizeInfoEntity;
import com.equestrianism.api.model.vo.horse_prize_info.HorsePrizeInfoListVO;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/6.
 */
public interface HorsePrizeInfoMapper {

    Integer insert( HorsePrizeInfoEntity horsePrizeInfoEntity );

    Integer updateBySelective( HorsePrizeInfoEntity horsePrizeInfoEntity );

    List<HorsePrizeInfoListModel> selectHorsePrizeInfoListByPage( HorsePrizeInfoListVO horsePrizeInfoListVo );

    Integer countHorsePrizeInfoListByPage( HorsePrizeInfoListVO horsePrizeInfoListVo );

    HorsePrizeInfoDetailBO selectHorsePrizeInfoByDetail( String horsePrizeId );

}
