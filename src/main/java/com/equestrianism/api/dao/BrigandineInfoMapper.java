package com.equestrianism.api.dao;

import com.equestrianism.api.model.model.BrigandineInfoListModel;
import com.equestrianism.api.model.po.BrigandineInfoEntity;
import com.equestrianism.api.model.vo.brigandine_info.BrigandineInfoListVO;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/9.
 */
public interface BrigandineInfoMapper {

    Integer insert( BrigandineInfoEntity brigandineInfoEntity );

    Integer updateBySelective( BrigandineInfoEntity brigandineInfoEntity );

    List<BrigandineInfoListModel> selectBrigandineInfoListByPage(BrigandineInfoListVO brigandineInfoListVo);

    Integer countBrigandineInfoListByPage(BrigandineInfoListVO brigandineInfoListVo);

    BrigandineInfoEntity selectByPrimaryKey(String brigandineId);

}
