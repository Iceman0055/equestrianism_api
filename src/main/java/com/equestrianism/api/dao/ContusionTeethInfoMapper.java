package com.equestrianism.api.dao;

import com.equestrianism.api.model.model.ContusionTeethInfoListModel;
import com.equestrianism.api.model.po.ContusionTeethInfoEntity;
import com.equestrianism.api.model.vo.contusion_teeth_info.ContusionTeethInfoListVO;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/9.
 */
public interface ContusionTeethInfoMapper {

    Integer insert( ContusionTeethInfoEntity contusionTeethInfoEntity );

    Integer updateBySelective( ContusionTeethInfoEntity contusionTeethInfoEntity );

    List<ContusionTeethInfoListModel> selectContusionTeethInfoListByPage(ContusionTeethInfoListVO contusionTeethInfoListVo);

    Integer countContusionTeethInfoListByPage(ContusionTeethInfoListVO contusionTeethInfoListVo);

    ContusionTeethInfoEntity selectByPrimaryKey(String contusionTeethId);

}
