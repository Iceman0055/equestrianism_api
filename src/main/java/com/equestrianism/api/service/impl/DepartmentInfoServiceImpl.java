package com.equestrianism.api.service.impl;

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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Iceman
 * 2018/1/23
 */
@Service( "departmentInfoService" )
public class DepartmentInfoServiceImpl implements DepartmentInfoService {

    @Autowired
    private DepartmentInfoMapper departmentInfoMapper;

    @Override
    public Boolean addDepartmentInfo( DepartmentInfoAddVO departmentInfoAddVo ) {
        DepartmentInfoEntity departmentInfoEntity = new DepartmentInfoEntity( departmentInfoAddVo.getDepartmentName(),
                departmentInfoAddVo.getShortName(), departmentInfoAddVo.getRemark() );
        Integer insertCount = departmentInfoMapper.insert( departmentInfoEntity );
        if ( insertCount > 0 ) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean updateDepartmentInfo( DepartmentInfoUpdateVO departmentInfoUpdateVo ) {
        DepartmentInfoEntity departmentInfoEntity = new DepartmentInfoEntity( departmentInfoUpdateVo.getDepartmentId(),
                departmentInfoUpdateVo.getDepartmentName(), departmentInfoUpdateVo.getShortName(), departmentInfoUpdateVo.getRemark() );
        Integer updateCount = departmentInfoMapper.updateBySelective( departmentInfoEntity );
        if ( updateCount > 0 ) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean removeDepartmentInfo( DepartmentInfoDeleteVO departmentInfoDeleteVo ) {
        DepartmentInfoEntity departmentInfoEntity = new DepartmentInfoEntity( departmentInfoDeleteVo.getDepartmentId() );
        departmentInfoEntity.setDeleteFlag( departmentInfoDeleteVo.getDeleteFlag() );
        departmentInfoEntity.setStatus( departmentInfoDeleteVo.getStatus() );
        Integer updateCount = departmentInfoMapper.updateBySelective( departmentInfoEntity );
        if ( updateCount > 0 ) {
            return true;
        }
        return false;
    }

    @Override
    public DepartmentInfoListBO departmentInfoList( DepartmentInfoListVO departmentInfoListVo ) {
        departmentInfoListVo.calculateBeginIndex();
        List<DepartmentInfoListModel> departmentInfoList = departmentInfoMapper.selectDepartmentListByPage( departmentInfoListVo );
        Integer totalRecorders = departmentInfoMapper.countDepartmentListByPage( departmentInfoListVo );
        DepartmentInfoListBO responseBo = new DepartmentInfoListBO( departmentInfoList );
        responseBo.setTotalRecorders( totalRecorders );
        responseBo.setTotalPages( PageUtils.calculateTotalPages( totalRecorders, departmentInfoListVo.getPageRecorders() ) );
        return responseBo;
    }

    @Override
    public DepartmentInfoComboBoxBO comboBox() {
        List<DepartmentInfoComboBoxModel> departmentList = departmentInfoMapper.selectDepartmentListByComboBox();
        return new DepartmentInfoComboBoxBO( departmentList );
    }

    @Override
    public DepartmentInfoDetailBO departmentDetail( DepartmentInfoDetailVO departmentInfoDetailVo ) {
        return departmentInfoMapper.selectDepartmentByDepartmentId( departmentInfoDetailVo.getDepartmentId() );
    }

}
