package com.equestrianism.api.service;

import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.model.bo.DepartmentInfoComboBoxBO;
import com.equestrianism.api.model.bo.DepartmentInfoDetailBO;
import com.equestrianism.api.model.bo.DepartmentInfoListBO;
import com.equestrianism.api.model.vo.*;

/**
 * Iceman
 * 2018/1/23
 */
public interface DepartmentInfoService {

    Boolean addDepartmentInfo( DepartmentInfoAddVO departmentInfoAddVo ) throws BaseException;

    Boolean updateDepartmentInfo( DepartmentInfoUpdateVO departmentInfoUpdateVo ) throws BaseException;

    Boolean removeDepartmentInfo( DepartmentInfoDeleteVO departmentInfoDeleteVo ) throws BaseException;

    DepartmentInfoListBO departmentInfoList( DepartmentInfoListVO departmentInfoListVo ) throws BaseException;

    DepartmentInfoComboBoxBO comboBox() throws BaseException;

    DepartmentInfoDetailBO departmentDetail( DepartmentInfoDetailVO departmentInfoDetailVo ) throws BaseException;

}
