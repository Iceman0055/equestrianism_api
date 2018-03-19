package com.equestrianism.api.dao;

import com.equestrianism.api.model.po.MenuInfoEntity;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/20.
 */
public interface MenuInfoMapper {

    List<MenuInfoEntity> selectAll( MenuInfoEntity menuInfoEntity );

}
