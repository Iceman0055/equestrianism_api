package com.equestrianism.api.service.impl;

import com.equestrianism.api.constants.CodeEnum;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.PageUtils;
import com.equestrianism.api.dao.HorsePrizeInfoMapper;
import com.equestrianism.api.model.bo.FeederInfoListBO;
import com.equestrianism.api.model.bo.HorsePrizeInfoDetailBO;
import com.equestrianism.api.model.bo.HorsePrizeInfoListBO;
import com.equestrianism.api.model.model.FeederInfoListModel;
import com.equestrianism.api.model.model.HorsePrizeInfoListModel;
import com.equestrianism.api.model.po.FeederInfoEntity;
import com.equestrianism.api.model.po.HorsePrizeInfoEntity;
import com.equestrianism.api.model.vo.horse_prize_info.*;
import com.equestrianism.api.service.HorsePrizeInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Iceman
 * 2018/3/6
 */
@Service( "horsePrizeInfoService" )
public class HorsePrizeInfoServiceImpl implements HorsePrizeInfoService {

    private static final Logger LOGGER = LoggerFactory.getLogger( HorsePrizeInfoServiceImpl.class );

    @Autowired
    private HorsePrizeInfoMapper horsePrizeInfoMapper;

    @Override
    public Boolean addHorsePrizeInfo( HorsePrizeInfoAddVO horsePrizeInfoAddVo ) throws BaseException {
        try {
            HorsePrizeInfoEntity horsePrizeInfoEntity = new HorsePrizeInfoEntity( horsePrizeInfoAddVo.getHorseId(),
                    horsePrizeInfoAddVo.getEventName(), horsePrizeInfoAddVo.getEventDate(), horsePrizeInfoAddVo.getEventPlace(),
                    horsePrizeInfoAddVo.getPrizeName(), horsePrizeInfoAddVo.getPenaltyTerm(), horsePrizeInfoAddVo.getAwarder(),
                    horsePrizeInfoAddVo.getDescImage() );
            if ( horsePrizeInfoAddVo.getDescImage() == null ) {
                horsePrizeInfoEntity.setDescImage( new byte[0] );
            }
            Integer insertCount = horsePrizeInfoMapper.insert( horsePrizeInfoEntity );
            if ( insertCount > 0 ) {
                return true;
            }
        } catch ( Exception e ) {
            LOGGER.error( "【HorsePrizeInfoService】【addHorsePrizeInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        return false;
    }

    @Override
    public Boolean updateHorsePrizeInfo( HorsePrizeInfoUpdateVO horsePrizeInfoUpdateVo ) throws BaseException {
        try {
            HorsePrizeInfoEntity horsePrizeInfoEntity = new HorsePrizeInfoEntity( horsePrizeInfoUpdateVo.getHorsePrizeId(),
                    horsePrizeInfoUpdateVo.getHorseId(), horsePrizeInfoUpdateVo.getEventName(), horsePrizeInfoUpdateVo.getEventDate(),
                    horsePrizeInfoUpdateVo.getEventPlace(), horsePrizeInfoUpdateVo.getPrizeName(), horsePrizeInfoUpdateVo.getPenaltyTerm(),
                    horsePrizeInfoUpdateVo.getAwarder(), horsePrizeInfoUpdateVo.getDescImage() );
            Integer updateCount = horsePrizeInfoMapper.updateBySelective( horsePrizeInfoEntity );
            if ( updateCount > 0 ) {
                return true;
            }
        } catch ( Exception e ) {
            LOGGER.error( "【HorsePrizeInfoService】【updateHorsePrizeInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        return false;
    }

    @Override
    public Boolean removeHorsePrizeInfo( HorsePrizeInfoDeleteVO horsePrizeInfoDeleteVo ) throws BaseException {
        HorsePrizeInfoEntity horsePrizeInfoEntity = new HorsePrizeInfoEntity( horsePrizeInfoDeleteVo.getHorsePrizeId() );
        horsePrizeInfoEntity.setDeleteFlag( horsePrizeInfoDeleteVo.getDeleteFlag() );
        horsePrizeInfoEntity.setStatus( horsePrizeInfoDeleteVo.getStatus() );
        try {
            Integer updateCount = horsePrizeInfoMapper.updateBySelective( horsePrizeInfoEntity );
            if ( updateCount > 0 ) {
                return true;
            }
        } catch ( Exception e ) {
            LOGGER.error( "【HorsePrizeInfoService】【removeHorsePrizeInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        return false;
    }

    @Override
    public HorsePrizeInfoListBO horsePrizeInfoList( HorsePrizeInfoListVO horsePrizeInfoListVo ) throws BaseException {
        horsePrizeInfoListVo.calculateBeginIndex();
        try {
            List<HorsePrizeInfoListModel> horsePrizeInfoModel = horsePrizeInfoMapper.selectHorsePrizeInfoListByPage(horsePrizeInfoListVo);
            Integer totalRecorders = horsePrizeInfoMapper.countHorsePrizeInfoListByPage( horsePrizeInfoListVo );
            HorsePrizeInfoListBO responseBo = new HorsePrizeInfoListBO( horsePrizeInfoModel );
            responseBo.setTotalRecorders( totalRecorders );
            responseBo.setTotalPages( PageUtils.calculateTotalPages(totalRecorders, horsePrizeInfoListVo.getPageRecorders()) );
            return responseBo;
        } catch ( Exception e ) {
            LOGGER.error( "【HorsePrizeInfoService】【horsePrizeInfoList】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
    }

    @Override
    public HorsePrizeInfoDetailBO horsePrizeInfoDetail(HorsePrizeInfoDetailVO horsePrizeInfoDetailVo) throws BaseException {
        try {
            return horsePrizeInfoMapper.selectHorsePrizeInfoByDetail(horsePrizeInfoDetailVo.getHorsePrizeId());
        } catch ( Exception e ) {
            LOGGER.error( "【HorsePrizeInfoService】【horsePrizeInfoDetail】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
    }
}
