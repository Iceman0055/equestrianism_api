package com.equestrianism.api.service.impl;

import com.equestrianism.api.constants.CodeEnum;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.PageUtils;
import com.equestrianism.api.dao.BrigandineInfoMapper;
import com.equestrianism.api.model.bo.BrigandineInfoDetailBO;
import com.equestrianism.api.model.bo.BrigandineInfoListBO;
import com.equestrianism.api.model.bo.ConsultingRoomInfoListBO;
import com.equestrianism.api.model.model.BrigandineInfoListModel;
import com.equestrianism.api.model.model.ConsultingRoomInfoListModel;
import com.equestrianism.api.model.po.BrigandineInfoEntity;
import com.equestrianism.api.model.po.ConsultingRoomInfoEntity;
import com.equestrianism.api.model.vo.brigandine_info.*;
import com.equestrianism.api.service.BrigandineInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/9.
 */
@Service( "brigandineInfoService" )
public class BrigandineInfoServiceImpl implements BrigandineInfoService {

    private static final Logger LOGGER = LoggerFactory.getLogger( BrigandineInfoServiceImpl.class );

    @Autowired
    private BrigandineInfoMapper brigandineInfoMapper;

    @Override
    public Boolean addBrigandineInfo( BrigandineInfoAddVO brigandineInfoAddVo ) throws BaseException {
        BrigandineInfoEntity brigandineInfoEntity = new BrigandineInfoEntity( brigandineInfoAddVo.getHorseId(),
                brigandineInfoAddVo.getUserId(), brigandineInfoAddVo.getBrigandineDate(), brigandineInfoAddVo.getRemark() );
        try {
            Integer insertCount = brigandineInfoMapper.insert( brigandineInfoEntity );
            if ( insertCount > 0 ) {
                return true;
            }
        } catch ( Exception e ) {
            LOGGER.error( "【BrigandineInfoService】【addBrigandineInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        return false;
    }

    @Override
    public Boolean updateBrigandineInfo(BrigandineInfoUpdateVO brigandineInfoUpdateVo) throws BaseException {
        BrigandineInfoEntity brigandineInfoEntity = new BrigandineInfoEntity( brigandineInfoUpdateVo.getBrigandineId(),
                brigandineInfoUpdateVo.getHorseId(), brigandineInfoUpdateVo.getUserId(), brigandineInfoUpdateVo.getBrigandineDate(),
                brigandineInfoUpdateVo.getRemark() );
        try {
            Integer updateCount = brigandineInfoMapper.updateBySelective( brigandineInfoEntity );
            if ( updateCount > 0 ) {
                return true;
            }
        } catch ( Exception e ) {
            LOGGER.error( "【BrigandineInfoService】【updateBrigandineInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        return false;
    }

    @Override
    public Boolean removeBrigandineInfo(BrigandineInfoDeleteVO brigandineInfoDeleteVo) throws BaseException {
        BrigandineInfoEntity brigandineInfoEntity = new BrigandineInfoEntity( brigandineInfoDeleteVo.getBrigandineId() );
        brigandineInfoEntity.setStatus( brigandineInfoDeleteVo.getStatus() );
        brigandineInfoEntity.setDeleteFlag( brigandineInfoDeleteVo.getDeleteFlag() );
        try {
            Integer updateCount = brigandineInfoMapper.updateBySelective( brigandineInfoEntity );
            if ( updateCount > 0 ) {
                return true;
            }
        } catch ( Exception e ) {
            LOGGER.error( "【BrigandineInfoService】【removeBrigandineInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        return false;
    }

    @Override
    public BrigandineInfoListBO brigandineInfoList(BrigandineInfoListVO brigandineInfoListVo) throws BaseException {
        brigandineInfoListVo.calculateBeginIndex();
        try {
            List<BrigandineInfoListModel> brigandineList = brigandineInfoMapper.selectBrigandineInfoListByPage(brigandineInfoListVo);
            Integer totalRecorders = brigandineInfoMapper.countBrigandineInfoListByPage( brigandineInfoListVo);
            BrigandineInfoListBO responseBo = new BrigandineInfoListBO( brigandineList );
            responseBo.setTotalRecorders( totalRecorders );
            responseBo.setTotalPages( PageUtils.calculateTotalPages(totalRecorders, brigandineInfoListVo.getPageRecorders()) );
            return responseBo;
        } catch ( Exception e ) {
            LOGGER.error( "【BrigandineInfoService】【brigandineInfoList】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
    }

    @Override
    public BrigandineInfoDetailBO brigandineInfoDetail(BrigandineInfoDetailVO brigandineInfoDetailVo) throws BaseException {
        BrigandineInfoEntity brigandineInfoEntity = brigandineInfoMapper.selectByPrimaryKey( brigandineInfoDetailVo.getBrigandineId() );
        BrigandineInfoDetailBO response = new BrigandineInfoDetailBO( brigandineInfoEntity.getBrigandineId(), brigandineInfoEntity.getBrigandineDate(),
                brigandineInfoEntity.getHorseId(), brigandineInfoEntity.getUserId() );
        return response;
    }
}
