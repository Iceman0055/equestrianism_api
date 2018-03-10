package com.equestrianism.api.service.impl;

import com.equestrianism.api.constants.CodeEnum;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.PageUtils;
import com.equestrianism.api.dao.ContusionTeethInfoMapper;
import com.equestrianism.api.model.bo.BrigandineInfoListBO;
import com.equestrianism.api.model.bo.ConsultingRoomInfoDetailBO;
import com.equestrianism.api.model.bo.ContusionTeethInfoDetailBO;
import com.equestrianism.api.model.bo.ContusionTeethInfoListBO;
import com.equestrianism.api.model.model.BrigandineInfoListModel;
import com.equestrianism.api.model.model.ContusionTeethInfoListModel;
import com.equestrianism.api.model.po.BrigandineInfoEntity;
import com.equestrianism.api.model.po.ConsultingRoomInfoEntity;
import com.equestrianism.api.model.po.ContusionTeethInfoEntity;
import com.equestrianism.api.model.vo.contusion_teeth_info.*;
import com.equestrianism.api.service.ContusionTeethInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/9.
 */
@Service( "contusionTeethInfoService" )
public class ContusionTeethInfoServiceImpl implements ContusionTeethInfoService {

    private static final Logger LOGGER = LoggerFactory.getLogger( ContusionTeethInfoServiceImpl.class );

    @Autowired
    private ContusionTeethInfoMapper contusionTeethInfoMapper;

    @Override
    public Boolean addContusionTeethInfo( ContusionTeethInfoAddVO contusionTeethInfoAddVo ) throws BaseException {
        ContusionTeethInfoEntity contusionTeethInfoEntity = new ContusionTeethInfoEntity( contusionTeethInfoAddVo.getHorseId(),
                contusionTeethInfoAddVo.getUserId(), contusionTeethInfoAddVo.getOperateDate(), contusionTeethInfoAddVo.getRemark() );
        try {
            Integer insertCount = contusionTeethInfoMapper.insert( contusionTeethInfoEntity );
            if ( insertCount > 0 ) {
                return true;
            }
        } catch ( Exception e ) {
            LOGGER.error( "【ContusionTeethInfoService】【addContusionTeethInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        return false;
    }

    @Override
    public Boolean updateContusionTeethInfo(ContusionTeethInfoUpdateVO contusionTeethInfoUpdateVo) throws BaseException {
        ContusionTeethInfoEntity contusionTeethInfoEntity = new ContusionTeethInfoEntity( contusionTeethInfoUpdateVo.getContusionTeethId(),
                contusionTeethInfoUpdateVo.getHorseId(), contusionTeethInfoUpdateVo.getUserId(), contusionTeethInfoUpdateVo.getOperateDate(),
                contusionTeethInfoUpdateVo.getRemark() );
        try {
            Integer updateCount = contusionTeethInfoMapper.updateBySelective( contusionTeethInfoEntity );
            if ( updateCount > 0 ) {
                return true;
            }
        } catch ( Exception e ) {
            LOGGER.error( "【ContusionTeethInfoService】【updateContusionTeethInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        return false;
    }

    @Override
    public Boolean removeContusionTeethInfo(ContusionTeethInfoDeleteVO contusionTeethInfoDeleteVo) throws BaseException {
        ContusionTeethInfoEntity contusionTeethInfoEntity = new ContusionTeethInfoEntity( contusionTeethInfoDeleteVo.getContusionTeethId() );
        contusionTeethInfoEntity.setDeleteFlag( contusionTeethInfoDeleteVo.getDeleteFlag() );
        contusionTeethInfoEntity.setStatus( contusionTeethInfoDeleteVo.getStatus() );
        try {
            Integer updateCount = contusionTeethInfoMapper.updateBySelective( contusionTeethInfoEntity );
            if ( updateCount > 0 ) {
                return true;
            }
        } catch ( Exception e ) {
            LOGGER.error( "【ContusionTeethInfoService】【removeContusionTeethInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        return false;
    }

    @Override
    public ContusionTeethInfoListBO contusionTeethInfoList(ContusionTeethInfoListVO contusionTeethInfoListVo) throws BaseException {
        contusionTeethInfoListVo.calculateBeginIndex();
        try {
            List<ContusionTeethInfoListModel> contusionTeethList = contusionTeethInfoMapper.selectContusionTeethInfoListByPage(contusionTeethInfoListVo);
            Integer totalRecorders = contusionTeethInfoMapper.countContusionTeethInfoListByPage(contusionTeethInfoListVo);
            ContusionTeethInfoListBO responseBo = new ContusionTeethInfoListBO( contusionTeethList );
            responseBo.setTotalRecorders( totalRecorders );
            responseBo.setTotalPages( PageUtils.calculateTotalPages(totalRecorders, contusionTeethInfoListVo.getPageRecorders()) );
            return responseBo;
        } catch ( Exception e ) {
            LOGGER.error( "【ContusionTeethInfoService】【contusionTeethInfoList】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
    }

    @Override
    public ContusionTeethInfoDetailBO contusionTeethInfoDetail(ContusionTeethInfoDetailVO contusionTeethInfoDetailVo) throws BaseException {
        ContusionTeethInfoEntity contusionTeethInfoEntity = contusionTeethInfoMapper.selectByPrimaryKey( contusionTeethInfoDetailVo.getContusionTeethId() );
        ContusionTeethInfoDetailBO response = new ContusionTeethInfoDetailBO( contusionTeethInfoEntity.getContusionTeethId(),
                contusionTeethInfoEntity.getHorseId(), contusionTeethInfoEntity.getUserId(), contusionTeethInfoEntity.getOperateDate(),
                contusionTeethInfoEntity.getRemark() );
        return response;
    }
}
