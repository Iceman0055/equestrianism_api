package com.equestrianism.api.dao;

import com.equestrianism.api.model.po.RoleMenuInfoEntity;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/20.
 */
public interface RoleMenuInfoMapper {

    List<Integer> selectByRoleId( String roleId );

    Integer insert( RoleMenuInfoEntity roleMenuInfoEntity );

    Integer updateBySelective( RoleMenuInfoEntity roleMenuInfoEntity );

}
