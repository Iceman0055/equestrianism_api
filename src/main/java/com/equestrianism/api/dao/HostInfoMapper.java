package com.equestrianism.api.dao;

import com.equestrianism.api.model.model.HostInfoListModel;
import com.equestrianism.api.model.po.HostInfoEntity;
import com.equestrianism.api.model.vo.host_info.HostInfoListVO;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/4.
 */
public interface HostInfoMapper {

    Integer insert( HostInfoEntity hostInfoEntity );

    Integer updateBySelective( HostInfoEntity hostInfoEntity );

    List<HostInfoListModel> selectHostListByPage( HostInfoListVO hostInfoListVo );

    Integer countHostListByPage( HostInfoListVO hostInfoListVo );

    HostInfoEntity selectByPrimaryKey( String hostId );

}
