package com.equestrianism.api.dao;

import com.equestrianism.api.model.model.RoleInfoListModel;
import com.equestrianism.api.model.po.RoleInfoEntity;
import com.equestrianism.api.model.vo.RoleInfoListVO;

import java.util.List;

/**
 * Iceman
 * 2018/1/22
 */
public interface RoleInfoMapper {

    Integer insert( RoleInfoEntity roleInfoEntity );

    Integer updateBySelective( RoleInfoEntity roleInfoEntity );

    List<RoleInfoListModel> selectRoleListByPage( RoleInfoListVO roleInfoListVo );

    Integer countRoleListByPage( RoleInfoListVO roleInfoListVo );

}
