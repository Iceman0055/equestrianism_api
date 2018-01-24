package com.equestrianism.api.service;

import com.equestrianism.api.model.bo.DepartmentInfoComboBoxBO;
import com.equestrianism.api.model.bo.DepartmentInfoDetailBO;
import com.equestrianism.api.model.bo.DepartmentInfoListBO;
import com.equestrianism.api.model.vo.*;

/**
 * Iceman
 * 2018/1/23
 */
public interface DepartmentInfoService {

    Boolean addDepartmentInfo( DepartmentInfoAddVO departmentInfoAddVo );

    Boolean updateDepartmentInfo( DepartmentInfoUpdateVO departmentInfoUpdateVo );

    Boolean removeDepartmentInfo( DepartmentInfoDeleteVO departmentInfoDeleteVo );

    DepartmentInfoListBO departmentInfoList( DepartmentInfoListVO departmentInfoListVo );

    DepartmentInfoComboBoxBO comboBox();

    DepartmentInfoDetailBO departmentDetail( DepartmentInfoDetailVO departmentInfoDetailVo );

}
