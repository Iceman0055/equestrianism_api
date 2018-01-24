package com.equestrianism.api.dao;

import com.equestrianism.api.model.bo.DepartmentInfoDetailBO;
import com.equestrianism.api.model.model.DepartmentInfoComboBoxModel;
import com.equestrianism.api.model.model.DepartmentInfoListModel;
import com.equestrianism.api.model.po.DepartmentInfoEntity;
import com.equestrianism.api.model.vo.DepartmentInfoListVO;

import java.util.List;

/**
 * Iceman
 * 2018/1/23
 */
public interface DepartmentInfoMapper {

    Integer insert( DepartmentInfoEntity departmentInfoEntity );

    Integer updateBySelective( DepartmentInfoEntity departmentInfoEntity );

    List<DepartmentInfoListModel> selectDepartmentListByPage( DepartmentInfoListVO departmentInfoListVo );

    Integer countDepartmentListByPage( DepartmentInfoListVO departmentInfoListVo );

    List<DepartmentInfoComboBoxModel> selectDepartmentListByComboBox();

    DepartmentInfoDetailBO selectDepartmentByDepartmentId( String departmentId );

}
