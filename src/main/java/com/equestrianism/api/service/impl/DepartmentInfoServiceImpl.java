package com.equestrianism.api.service.impl;

import com.equestrianism.api.constants.CodeEnum;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.PageUtils;
import com.equestrianism.api.dao.DepartmentInfoMapper;
import com.equestrianism.api.model.bo.*;
import com.equestrianism.api.model.model.DepartmentInfoComboBoxModel;
import com.equestrianism.api.model.model.DepartmentInfoListModel;
import com.equestrianism.api.model.model.RoleInfoComboBoxModel;
import com.equestrianism.api.model.model.RoleInfoListModel;
import com.equestrianism.api.model.po.DepartmentInfoEntity;
import com.equestrianism.api.model.vo.*;
import com.equestrianism.api.service.DepartmentInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Iceman
 * 2018/1/23
 */
@Service( "departmentInfoService" )
public class DepartmentInfoServiceImpl implements DepartmentInfoService {

    private static final Logger LOGGER = LoggerFactory.getLogger( DepartmentInfoServiceImpl.class );

    @Autowired
    private DepartmentInfoMapper departmentInfoMapper;

    @Override
    public Boolean addDepartmentInfo( DepartmentInfoAddVO departmentInfoAddVo ) throws BaseException {
        DepartmentInfoEntity departmentInfoEntity = new DepartmentInfoEntity( departmentInfoAddVo.getDepartmentName(),
                departmentInfoAddVo.getShortName(), departmentInfoAddVo.getRemark() );
        try {
            Integer insertCount = departmentInfoMapper.insert( departmentInfoEntity );
            if ( insertCount > 0 ) {
                return true;
            }
        } catch ( Exception e ) {
            LOGGER.error( "【DepartmentInfoService】【addDepartmentInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        return false;
    }

    @Override
    public Boolean updateDepartmentInfo( DepartmentInfoUpdateVO departmentInfoUpdateVo ) throws BaseException {
        DepartmentInfoEntity departmentInfoEntity = new DepartmentInfoEntity( departmentInfoUpdateVo.getDepartmentId(),
                departmentInfoUpdateVo.getDepartmentName(), departmentInfoUpdateVo.getShortName(), departmentInfoUpdateVo.getRemark() );
        try {
            Integer updateCount = departmentInfoMapper.updateBySelective( departmentInfoEntity );
            if ( updateCount > 0 ) {
                return true;
            }
        } catch ( Exception e ) {
            LOGGER.error( "【DepartmentInfoService】【updateDepartmentInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        return false;
    }

    @Override
    public Boolean removeDepartmentInfo( DepartmentInfoDeleteVO departmentInfoDeleteVo ) throws BaseException {
        DepartmentInfoEntity departmentInfoEntity = new DepartmentInfoEntity( departmentInfoDeleteVo.getDepartmentId() );
        departmentInfoEntity.setDeleteFlag( departmentInfoDeleteVo.getDeleteFlag() );
        departmentInfoEntity.setStatus( departmentInfoDeleteVo.getStatus() );
        try {
            Integer updateCount = departmentInfoMapper.updateBySelective( departmentInfoEntity );
            if ( updateCount > 0 ) {
                return true;
            }
        } catch ( Exception e ) {
            LOGGER.error( "【DepartmentInfoService】【removeDepartmentInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        return false;
    }

    @Override
    public DepartmentInfoListBO departmentInfoList( DepartmentInfoListVO departmentInfoListVo ) throws BaseException {
        departmentInfoListVo.calculateBeginIndex();
        try {
            List<DepartmentInfoListModel> departmentInfoList = departmentInfoMapper.selectDepartmentListByPage( departmentInfoListVo );
            Integer totalRecorders = departmentInfoMapper.countDepartmentListByPage( departmentInfoListVo );
            DepartmentInfoListBO responseBo = new DepartmentInfoListBO( departmentInfoList );
            responseBo.setTotalRecorders( totalRecorders );
            responseBo.setTotalPages( PageUtils.calculateTotalPages( totalRecorders, departmentInfoListVo.getPageRecorders() ) );
            return responseBo;
        } catch ( Exception e ) {
            LOGGER.error( "【DepartmentInfoService】【departmentInfoList】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
    }

    @Override
    public DepartmentInfoComboBoxBO comboBox() throws BaseException {
        try {
            List<DepartmentInfoComboBoxModel> departmentList = departmentInfoMapper.selectDepartmentListByComboBox();
            return new DepartmentInfoComboBoxBO( departmentList );
        } catch ( Exception e ) {
            LOGGER.error( "【DepartmentInfoService】【comboBox】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
    }

    @Override
    public DepartmentInfoDetailBO departmentDetail( DepartmentInfoDetailVO departmentInfoDetailVo ) throws BaseException {
        try {
            return departmentInfoMapper.selectDepartmentByDepartmentId( departmentInfoDetailVo.getDepartmentId() );
        } catch ( Exception e ) {
            LOGGER.error( "【DepartmentInfoService】【departmentDetail】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
    }

}
