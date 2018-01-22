package com.equestrianism.api.dao;

import com.equestrianism.api.model.model.UserInfoListModel;
import com.equestrianism.api.model.po.UserInfoEntity;
import com.equestrianism.api.model.vo.UserInfoListVO;

import java.util.List;

/**
 * Iceman
 * 2018/1/10
 */
public interface UserInfoMapper {

    Integer insert( UserInfoEntity userInfoEntity );

    Integer updateBySelective( UserInfoEntity userInfoEntity );

    List<UserInfoListModel> selectUserListByPage( UserInfoListVO userInfoListVo );

    Integer countUserListByPage(UserInfoListVO userInfoListVo);

}
