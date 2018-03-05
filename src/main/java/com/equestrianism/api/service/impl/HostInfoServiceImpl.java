package com.equestrianism.api.service.impl;

import com.equestrianism.api.constants.CodeEnum;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.PageUtils;
import com.equestrianism.api.dao.HostInfoMapper;
import com.equestrianism.api.model.bo.HostInfoDetailBO;
import com.equestrianism.api.model.bo.HostInfoListBO;
import com.equestrianism.api.model.bo.RoleInfoListBO;
import com.equestrianism.api.model.model.HostInfoListModel;
import com.equestrianism.api.model.model.RoleInfoListModel;
import com.equestrianism.api.model.po.HostInfoEntity;
import com.equestrianism.api.model.po.RoleInfoEntity;
import com.equestrianism.api.model.vo.host_info.*;
import com.equestrianism.api.service.HostInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/4.
 */
@Service( "hostInfoService" )
public class HostInfoServiceImpl implements HostInfoService {

    private static final Logger LOGGER = LoggerFactory.getLogger( HostInfoServiceImpl.class );

    @Autowired
    private HostInfoMapper hostInfoMapper;

    @Override
    public Boolean addHostInfo( HostInfoAddVO hostInfoAddVo ) throws BaseException {
        HostInfoEntity hostInfoEntity = new HostInfoEntity( hostInfoAddVo.getHostName(), hostInfoAddVo.getSex(), hostInfoAddVo.getOccupation(),
                hostInfoAddVo.getContactWay(), hostInfoAddVo.getAddress(), hostInfoAddVo.getHorseId() );
        Integer insertCount;
        try {
            insertCount = hostInfoMapper.insert( hostInfoEntity );
            if ( insertCount > 0 ) {
                return true;
            }
        } catch ( Exception e ) {
            LOGGER.error( "【HostInfoService】【addHostInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        return false;
    }

    @Override
    public Boolean updateHostInfo( HostInfoUpdateVO hostInfoUpdateVo ) throws BaseException {
        HostInfoEntity hostInfoEntity = new HostInfoEntity( hostInfoUpdateVo.getHostId(), hostInfoUpdateVo.getHostName(),
                hostInfoUpdateVo.getSex(), hostInfoUpdateVo.getOccupation(), hostInfoUpdateVo.getContactWay(),
                hostInfoUpdateVo.getAddress(), hostInfoUpdateVo.getHorseId() );
        try {
            Integer updateCount = hostInfoMapper.updateBySelective( hostInfoEntity );
            if ( updateCount > 0 ) {
                return true;
            }
        } catch ( Exception e ) {
            LOGGER.error( "【HostInfoService】【updateHostInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        return false;
    }

    @Override
    public Boolean removeHostInfo( HostInfoDeleteVO hostInfoDeleteVo ) throws BaseException {
        HostInfoEntity hostInfoEntity = new HostInfoEntity( hostInfoDeleteVo.getHostId() );
        hostInfoEntity.setDeleteFlag( hostInfoDeleteVo.getDeleteFlag() );
        hostInfoEntity.setStatus( hostInfoDeleteVo.getStatus() );
        try {
            System.out.println( hostInfoEntity.toJsonString() );
            Integer updateCount = hostInfoMapper.updateBySelective( hostInfoEntity );
            System.out.println( updateCount );
            if ( updateCount > 0 ) {
                return true;
            }
        } catch ( Exception e ) {
            LOGGER.error( "【HostInfoService】【removeHostInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        return false;
    }

    @Override
    public HostInfoListBO hostInfoList( HostInfoListVO hostInfoListVo ) throws BaseException {
        hostInfoListVo.calculateBeginIndex();
        try {
            List<HostInfoListModel> hostInfoList = hostInfoMapper.selectHostListByPage( hostInfoListVo );
            Integer totalRecorders = hostInfoMapper.countHostListByPage( hostInfoListVo );
            HostInfoListBO responseBo = new HostInfoListBO( hostInfoList );
            responseBo.setTotalRecorders( totalRecorders );
            responseBo.setTotalPages( PageUtils.calculateTotalPages(totalRecorders, hostInfoListVo.getPageRecorders()) );
            return responseBo;
        } catch ( Exception e ) {
            LOGGER.error( "【HostInfoService】【hostInfoList】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
    }

    @Override
    public HostInfoDetailBO hostDetail( HostInfoDetailVO hostInfoDetailVo ) throws BaseException {
        HostInfoEntity hostInfoEntity = hostInfoMapper.selectByPrimaryKey( hostInfoDetailVo.getHostId() );
        HostInfoDetailBO response = new HostInfoDetailBO( hostInfoEntity.getHostId(), hostInfoEntity.getHostName(),
                hostInfoEntity.getSex(), hostInfoEntity.getOccupation(), hostInfoEntity.getContactWay(), hostInfoEntity.getAddress(),
                hostInfoEntity.getHorseId() );
        return response;
    }

}