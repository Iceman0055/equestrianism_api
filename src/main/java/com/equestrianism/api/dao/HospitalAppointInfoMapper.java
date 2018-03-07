package com.equestrianism.api.dao;

import com.equestrianism.api.model.bo.HospitalAppointInfoDetailBO;
import com.equestrianism.api.model.model.HospitalAppointInfoListModel;
import com.equestrianism.api.model.po.HospitalAppointInfoEntity;
import com.equestrianism.api.model.vo.hospital_appoint_info.HospitalAppointInfoListVO;

import java.util.List;

/**
 * Iceman
 * 2018/3/7
 */
public interface HospitalAppointInfoMapper {

    Integer insert( HospitalAppointInfoEntity hospitalAppointInfoEntity );

    Integer updateBySelective( HospitalAppointInfoEntity hospitalAppointInfoEntity );

    List<HospitalAppointInfoListModel> selectAppointListByPage( HospitalAppointInfoListVO hospitalAppointInfoListVo );

    Integer countAppointListByPage( HospitalAppointInfoListVO hospitalAppointInfoListVo );

    HospitalAppointInfoDetailBO selectAppointDetail( String hospitalAppointId );

}
