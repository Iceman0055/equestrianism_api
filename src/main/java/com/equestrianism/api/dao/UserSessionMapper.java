package com.equestrianism.api.dao;

import com.equestrianism.api.model.po.UserSessionEntity;

/**
 * Created by Chenzq on 2018/3/21.
 */
public interface UserSessionMapper {

    Integer insert( UserSessionEntity userSessionEntity );

    Integer updateBySelective( UserSessionEntity userSessionEntity );

}
