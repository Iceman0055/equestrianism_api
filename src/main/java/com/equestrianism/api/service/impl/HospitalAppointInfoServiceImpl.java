package com.equestrianism.api.service.impl;

import com.equestrianism.api.constants.CodeEnum;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.PageUtils;
import com.equestrianism.api.dao.HospitalAppointInfoMapper;
import com.equestrianism.api.model.bo.HospitalAppointInfoDetailBO;
import com.equestrianism.api.model.bo.HospitalAppointInfoListBO;
import com.equestrianism.api.model.bo.RoleInfoListBO;
import com.equestrianism.api.model.model.HospitalAppointInfoListModel;
import com.equestrianism.api.model.model.RoleInfoListModel;
import com.equestrianism.api.model.po.HospitalAppointInfoEntity;
import com.equestrianism.api.model.po.RoleInfoEntity;
import com.equestrianism.api.model.vo.hospital_appoint_info.*;
import com.equestrianism.api.service.HospitalAppointInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Iceman
 * 2018/3/7
 */
@Service( "hospitalAppointInfoService" )
public class HospitalAppointInfoServiceImpl implements HospitalAppointInfoService {

    private static final Logger LOGGER = LoggerFactory.getLogger( HospitalAppointInfoServiceImpl.class );

    @Autowired
    private HospitalAppointInfoMapper hospitalAppointInfoMapper;

    @Override
    public Boolean addHospitalAppointInfo( HospitalAppointInfoAddVO hospitalAppointInfoAddVo ) throws BaseException {
        HospitalAppointInfoEntity hospitalAppointInfoEntity = new HospitalAppointInfoEntity( hospitalAppointInfoAddVo.getUserId(),
                hospitalAppointInfoAddVo.getAppointDate(), hospitalAppointInfoAddVo.getContacts(), hospitalAppointInfoAddVo.getContactWay(),
                hospitalAppointInfoAddVo.getAppointNumber(), hospitalAppointInfoAddVo.getAppointDesc(), hospitalAppointInfoAddVo.getRemark(),
                hospitalAppointInfoAddVo.getAppointStatus() );
        try {
            Integer insertCount = hospitalAppointInfoMapper.insert( hospitalAppointInfoEntity );
            if ( insertCount > 0 ) {
                return true;
            }
        } catch ( Exception e ) {
            LOGGER.error( "【HospitalAppointInfoService】【addHospitalAppointInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        return false;
    }

    @Override
    public Boolean updateHospitalAppointInfo( HospitalAppointInfoUpdateVO hospitalAppointInfoUpdateVo ) throws BaseException {
        HospitalAppointInfoEntity hospitalAppointInfoEntity = new HospitalAppointInfoEntity( hospitalAppointInfoUpdateVo.getHospitalAppointId(),
                hospitalAppointInfoUpdateVo.getUserId(), hospitalAppointInfoUpdateVo.getAppointDate(),
                hospitalAppointInfoUpdateVo.getContacts(), hospitalAppointInfoUpdateVo.getContactWay(),
                hospitalAppointInfoUpdateVo.getAppointNumber(), hospitalAppointInfoUpdateVo.getAppointDesc(),
                hospitalAppointInfoUpdateVo.getRemark(), hospitalAppointInfoUpdateVo.getAppointStatus() );
        try {
            Integer updateCount = hospitalAppointInfoMapper.updateBySelective( hospitalAppointInfoEntity );
            if ( updateCount > 0 ) {
                return true;
            }
        } catch ( Exception e ) {
            LOGGER.error( "【HospitalAppointInfoService】【updateHospitalAppointInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        return false;
    }

    @Override
    public Boolean removeHospitalAppointInfo( HospitalAppointInfoDeleteVO hospitalAppointInfoDeleteVo ) throws BaseException {
        HospitalAppointInfoEntity hospitalAppointInfoEntity = new HospitalAppointInfoEntity( hospitalAppointInfoDeleteVo.getHospitalAppointId() );
        hospitalAppointInfoEntity.setDeleteFlag( hospitalAppointInfoDeleteVo.getDeleteFlag() );
        hospitalAppointInfoEntity.setStatus( hospitalAppointInfoDeleteVo.getStatus() );
        try {
            Integer updateCount = hospitalAppointInfoMapper.updateBySelective( hospitalAppointInfoEntity );
            if ( updateCount > 0 ) {
                return true;
            }
        } catch ( Exception e ) {
            LOGGER.error( "【HospitalAppointInfoService】【removeHospitalAppointInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        return false;
    }

    @Override
    public HospitalAppointInfoListBO hospitalAppointInfoList( HospitalAppointInfoListVO hospitalAppointInfoListVo ) throws BaseException {
        hospitalAppointInfoListVo.calculateBeginIndex();
        try {
            List<HospitalAppointInfoListModel> appointList = hospitalAppointInfoMapper.selectAppointListByPage( hospitalAppointInfoListVo );
            Integer totalRecorders = hospitalAppointInfoMapper.countAppointListByPage( hospitalAppointInfoListVo );
            HospitalAppointInfoListBO responseBo = new HospitalAppointInfoListBO( appointList );
            responseBo.setTotalRecorders( totalRecorders );
            responseBo.setTotalPages( PageUtils.calculateTotalPages( totalRecorders, hospitalAppointInfoListVo.getPageRecorders() ) );
            return responseBo;
        } catch ( Exception e ) {
            LOGGER.error( "【HospitalAppointInfoService】【removeHospitalAppointInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
    }

    @Override
    public HospitalAppointInfoDetailBO hospitalAppointInfoDetail( HospitalAppointInfoDetailVO hospitalAppointInfoDetailVo ) throws BaseException {
        return hospitalAppointInfoMapper.selectAppointDetail( hospitalAppointInfoDetailVo.getHospitalAppointId() );
    }

}
