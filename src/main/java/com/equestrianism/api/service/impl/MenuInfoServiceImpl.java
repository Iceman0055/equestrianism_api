package com.equestrianism.api.service.impl;

import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.dao.MenuInfoMapper;
import com.equestrianism.api.model.bo.MenuInfoListBO;
import com.equestrianism.api.model.model.MenuInfoListModel;
import com.equestrianism.api.model.model.MenuInfoListPreModel;
import com.equestrianism.api.model.po.MenuInfoEntity;
import com.equestrianism.api.service.MenuInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chenzq on 2018/3/20.
 */
@Service( "menuInfoService" )
public class MenuInfoServiceImpl implements MenuInfoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MenuInfoServiceImpl.class);

    @Autowired
    private MenuInfoMapper menuInfoMapper;

    @Override
    public MenuInfoListBO menuList() throws BaseException {
        MenuInfoEntity params = new MenuInfoEntity();
        params.setLevel( 1 );
        List<MenuInfoEntity> menuList = menuInfoMapper.selectAll( params );
        if ( menuList == null || menuList.size() == 0 ) {
            return null;
        }
        List<MenuInfoListModel> resMenuList = new ArrayList<>( menuList.size() );
        MenuInfoListModel resMenuModel;
        for ( MenuInfoEntity menuInfoEntity : menuList ) {
            resMenuModel = new MenuInfoListModel();
            params.setLevel( 2 );
            params.setPreMenuId( menuInfoEntity.getMenuId() );
            List<MenuInfoEntity> subMenuList = menuInfoMapper.selectAll( params );
            if ( subMenuList != null && subMenuList.size() > 0 ) {
                List<MenuInfoListPreModel> resSubMenuList = new ArrayList<>( subMenuList.size() );
                MenuInfoListPreModel resSubMenuModel;
                for ( MenuInfoEntity subMenuInfoEntity : subMenuList ) {
                    resSubMenuModel = new MenuInfoListPreModel();
                    resSubMenuModel.setSubMenuId( subMenuInfoEntity.getMenuId() );
                    resSubMenuModel.setSubMenuName( subMenuInfoEntity.getMenuName() );
                    resSubMenuModel.setSubSort( subMenuInfoEntity.getSort() );
                    resSubMenuList.add( resSubMenuModel );
                }
                resMenuModel.setSubMenuList( resSubMenuList );
            }
            resMenuModel.setMenuId( menuInfoEntity.getMenuId() );
            resMenuModel.setMenuName( menuInfoEntity.getMenuName() );
            resMenuModel.setSort( menuInfoEntity.getSort() );
            resMenuList.add( resMenuModel );
        }
        return new MenuInfoListBO( resMenuList );
    }
}
