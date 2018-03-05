package com.equestrianism.api.service.impl;

import com.equestrianism.api.constants.CodeEnum;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.PageUtils;
import com.equestrianism.api.dao.FeederInfoMapper;
import com.equestrianism.api.model.bo.FeederInfoDetailBO;
import com.equestrianism.api.model.bo.FeederInfoListBO;
import com.equestrianism.api.model.bo.HorseInfoListBO;
import com.equestrianism.api.model.model.FeederInfoListModel;
import com.equestrianism.api.model.model.HorseInfoListModel;
import com.equestrianism.api.model.po.FeederInfoEntity;
import com.equestrianism.api.model.po.HorseInfoEntity;
import com.equestrianism.api.model.vo.feeder_info.*;
import com.equestrianism.api.service.FeederInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Iceman
 * 2018/3/5
 */
@Service( "feederInfoService" )
public class FeederInfoServiceImpl implements FeederInfoService {

    private static final Logger LOGGER = LoggerFactory.getLogger( FeederInfoServiceImpl.class );

    @Autowired
    private FeederInfoMapper feederInfoMapper;

    @Override
    public Boolean addFeederInfo( FeederInfoAddVO feederInfoAddVO ) throws BaseException {
        try {
            FeederInfoEntity feederInfoEntity = new FeederInfoEntity( feederInfoAddVO.getFeederName(), feederInfoAddVO.getSex(),
                    feederInfoAddVO.getSkillDesc(), feederInfoAddVO.getHorseId(), feederInfoAddVO.getHireDate(),
                    feederInfoAddVO.getIdCardImage() );
            if ( feederInfoAddVO.getIdCardImage() == null ) {
                feederInfoEntity.setIdCardImage( new byte[0] );
            }
            Integer insertCount = feederInfoMapper.insert( feederInfoEntity );
            if ( insertCount > 0 ) {
                return true;
            }
        } catch ( Exception e ) {
            LOGGER.error( "【FeederInfoService】【addFeederInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        return false;
    }

    @Override
    public Boolean updateFeederInfo( FeederInfoUpdateVO feederInfoUpdateVo ) throws BaseException {
        try {
            FeederInfoEntity feederInfoEntity = new FeederInfoEntity( feederInfoUpdateVo.getFeederId(), feederInfoUpdateVo.getFeederName(),
                    feederInfoUpdateVo.getSex(), feederInfoUpdateVo.getSkillDesc(), feederInfoUpdateVo.getHorseId(),
                    feederInfoUpdateVo.getHireDate(), feederInfoUpdateVo.getIdCardImage() );
            Integer updateCount = feederInfoMapper.updateBySelective( feederInfoEntity );
            if ( updateCount > 0 ) {
                return true;
            }
        } catch ( Exception e ) {
            LOGGER.error( "【FeederInfoService】【updateFeederInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        return false;
    }

    @Override
    public Boolean removeFeederInfo( FeederInfoDeleteVO feederInfoDeleteVo ) throws BaseException {
        FeederInfoEntity feederInfoEntity = new FeederInfoEntity( feederInfoDeleteVo.getFeederId() );
        feederInfoEntity.setDeleteFlag( feederInfoDeleteVo.getDeleteFlag() );
        feederInfoEntity.setStatus( feederInfoDeleteVo.getStatus() );
        try {
            Integer updateCount = feederInfoMapper.updateBySelective( feederInfoEntity );
            if ( updateCount > 0 ) {
                return true;
            }
        } catch ( Exception e ) {
            LOGGER.error( "【FeederInfoService】【removeFeederInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        return false;
    }

    @Override
    public FeederInfoListBO feederInfoList( FeederInfoListVO feederInfoListVo ) throws BaseException {
        feederInfoListVo.calculateBeginIndex();
        try {
            List<FeederInfoListModel> feederInfoList = feederInfoMapper.selectFeederListByPage( feederInfoListVo );
            Integer totalRecorders = feederInfoMapper.countFeederListByPage( feederInfoListVo );
            FeederInfoListBO responseBo = new FeederInfoListBO( feederInfoList );
            responseBo.setTotalRecorders( totalRecorders );
            responseBo.setTotalPages( PageUtils.calculateTotalPages( totalRecorders, feederInfoListVo.getPageRecorders() ) );
            return responseBo;
        } catch ( Exception e ) {
            LOGGER.error( "【FeederInfoService】【feederInfoList】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
    }

    @Override
    public FeederInfoDetailBO feederInfoDetail( FeederInfoDetailVO feederInfoDetailVo ) throws BaseException {
        try {
            return feederInfoMapper.selectFeederInfoByDetail( feederInfoDetailVo.getFeederId() );
        } catch ( Exception e ) {
            LOGGER.error( "【FeederInfoService】【feederInfoDetail】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
    }


}