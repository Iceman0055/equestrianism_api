package com.equestrianism.api.service.impl;

import com.equestrianism.api.constants.CodeEnum;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.PageUtils;
import com.equestrianism.api.dao.ConsultingRoomInfoMapper;
import com.equestrianism.api.model.bo.ConsultingRoomInfoComboBoxBO;
import com.equestrianism.api.model.bo.ConsultingRoomInfoDetailBO;
import com.equestrianism.api.model.bo.ConsultingRoomInfoListBO;
import com.equestrianism.api.model.bo.DepartmentInfoListBO;
import com.equestrianism.api.model.model.ConsultingRoomInfoComboBoxModel;
import com.equestrianism.api.model.model.ConsultingRoomInfoListModel;
import com.equestrianism.api.model.model.DepartmentInfoListModel;
import com.equestrianism.api.model.po.ConsultingRoomInfoEntity;
import com.equestrianism.api.model.po.DepartmentInfoEntity;
import com.equestrianism.api.model.vo.consulting_room_info.*;
import com.equestrianism.api.service.ConsultingRoomInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Iceman
 * 2018/3/8
 */
@Service( "consultingRoomInfoService" )
public class ConsultingRoomInfoServiceImpl implements ConsultingRoomInfoService {

    private static final Logger LOGGER = LoggerFactory.getLogger( ConsultingRoomInfoServiceImpl.class );

    @Autowired
    private ConsultingRoomInfoMapper consultingRoomInfoMapper;

    @Override
    public Boolean addConsultingRoomInfo( ConsultingRoomInfoAddVO consultingRoomInfoAddVo ) throws BaseException {
        ConsultingRoomInfoEntity consultingRoomInfoEntity = new ConsultingRoomInfoEntity( consultingRoomInfoAddVo.getName(),
                consultingRoomInfoAddVo.getShortName(), consultingRoomInfoAddVo.getRemark() );
        try {
            Integer insertCount = consultingRoomInfoMapper.insert( consultingRoomInfoEntity );
            if ( insertCount > 0 ) {
                return true;
            }
        } catch ( Exception e ) {
            LOGGER.error( "【ConsultingRoomInfoService】【addConsultingRoomInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        return false;
    }

    @Override
    public Boolean updateConsultingRoomInfo( ConsultingRoomInfoUpdateVO consultingRoomInfoUpdateVo ) throws BaseException {
        ConsultingRoomInfoEntity consultingRoomInfoEntity = new ConsultingRoomInfoEntity( consultingRoomInfoUpdateVo.getConsultingRoomId(),
                consultingRoomInfoUpdateVo.getName(), consultingRoomInfoUpdateVo.getShortName(), consultingRoomInfoUpdateVo.getRemark() );
        try {
            Integer updateCount = consultingRoomInfoMapper.updateBySelective( consultingRoomInfoEntity );
            if ( updateCount > 0 ) {
                return true;
            }
        } catch ( Exception e ) {
            LOGGER.error( "【ConsultingRoomInfoService】【updateConsultingRoomInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        return false;
    }

    @Override
    public Boolean removeConsultingRoomInfo( ConsultingRoomInfoDeleteVO consultingRoomInfoDeleteVo ) throws BaseException {
        ConsultingRoomInfoEntity consultingRoomInfoEntity = new ConsultingRoomInfoEntity( consultingRoomInfoDeleteVo.getConsultingRoomId() );
        consultingRoomInfoEntity.setDeleteFlag( consultingRoomInfoDeleteVo.getDeleteFlag() );
        consultingRoomInfoEntity.setStatus( consultingRoomInfoDeleteVo.getStatus() );
        try {
            Integer updateCount = consultingRoomInfoMapper.updateBySelective( consultingRoomInfoEntity );
            if ( updateCount > 0 ) {
                return true;
            }
        } catch ( Exception e ) {
            LOGGER.error( "【ConsultingRoomInfoService】【removeConsultingRoomInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        return false;
    }

    @Override
    public ConsultingRoomInfoListBO consultingRoomInfoList( ConsultingRoomInfoListVO consultingRoomInfoListVo ) throws BaseException {
        consultingRoomInfoListVo.calculateBeginIndex();
        try {
            List<ConsultingRoomInfoListModel> consultingRoomList = consultingRoomInfoMapper.selectConsultingRoomListByPage( consultingRoomInfoListVo );
            Integer totalRecorders = consultingRoomInfoMapper.countConsultingRoomListByPage( consultingRoomInfoListVo );
            ConsultingRoomInfoListBO responseBo = new ConsultingRoomInfoListBO( consultingRoomList );
            responseBo.setTotalRecorders( totalRecorders );
            responseBo.setTotalPages( PageUtils.calculateTotalPages( totalRecorders, consultingRoomInfoListVo.getPageRecorders() ) );
            return responseBo;
        } catch ( Exception e ) {
            LOGGER.error( "【DepartmentInfoService】【departmentInfoList】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
    }

    @Override
    public ConsultingRoomInfoComboBoxBO comboBox() throws BaseException {
        List<ConsultingRoomInfoEntity> consultingRoomInfoEntityList = consultingRoomInfoMapper.selectConsultingRoomListByComboBox();
        if ( consultingRoomInfoEntityList == null || consultingRoomInfoEntityList.size() == 0 ) {
            return null;
        }
        ConsultingRoomInfoComboBoxBO response = new ConsultingRoomInfoComboBoxBO();
        List<ConsultingRoomInfoComboBoxModel> consultingRoomList = new ArrayList<>( consultingRoomInfoEntityList.size() );
        ConsultingRoomInfoComboBoxModel consultingRoomInfoComboBoxModel;
        for ( ConsultingRoomInfoEntity consultingRoomInfoEntity : consultingRoomInfoEntityList ) {
            consultingRoomInfoComboBoxModel = new ConsultingRoomInfoComboBoxModel();
            consultingRoomInfoComboBoxModel.setConsultingRoomId( consultingRoomInfoEntity.getConsultingRoomId() );
            consultingRoomInfoComboBoxModel.setConsultingRoomName( consultingRoomInfoEntity.getName() );
            consultingRoomList.add( consultingRoomInfoComboBoxModel );
        }
        response.setConsultingRoomList( consultingRoomList );
        return response;
    }

    @Override
    public ConsultingRoomInfoDetailBO consultingRoomInfoDetail( ConsultingRoomInfoDetailVO consultingRoomInfoDetailVo ) throws BaseException {
        ConsultingRoomInfoEntity consultingRoomInfoEntity = consultingRoomInfoMapper.selectByPrimaryKey( consultingRoomInfoDetailVo.getConsultingRoomId() );
        ConsultingRoomInfoDetailBO response = new ConsultingRoomInfoDetailBO( consultingRoomInfoEntity.getConsultingRoomId(),
                consultingRoomInfoEntity.getName(), consultingRoomInfoEntity.getShortName(), consultingRoomInfoEntity.getRemark(),
                consultingRoomInfoEntity.getStatus() );

        return response;
    }
}
