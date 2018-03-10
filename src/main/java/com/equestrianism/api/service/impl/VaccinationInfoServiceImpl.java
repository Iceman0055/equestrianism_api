package com.equestrianism.api.service.impl;

import com.equestrianism.api.constants.CodeEnum;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.PageUtils;
import com.equestrianism.api.dao.VaccinationInfoMapper;
import com.equestrianism.api.model.bo.ContusionTeethInfoDetailBO;
import com.equestrianism.api.model.bo.ContusionTeethInfoListBO;
import com.equestrianism.api.model.bo.VaccinationInfoDetailBO;
import com.equestrianism.api.model.bo.VaccinationInfoListBO;
import com.equestrianism.api.model.model.ContusionTeethInfoListModel;
import com.equestrianism.api.model.model.VaccinationInfoListModel;
import com.equestrianism.api.model.po.ContusionTeethInfoEntity;
import com.equestrianism.api.model.po.VaccinationInfoEntity;
import com.equestrianism.api.model.vo.vaccination_info.*;
import com.equestrianism.api.service.VaccinationInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/10.
 */
@Service( "vaccinationInfoService" )
public class VaccinationInfoServiceImpl implements VaccinationInfoService {

    private static final Logger LOGGER = LoggerFactory.getLogger( VaccinationInfoServiceImpl.class );

    @Autowired
    private VaccinationInfoMapper vaccinationInfoMapper;

    @Override
    public Boolean addVaccinationInfo(VaccinationInfoAddVO vaccinationInfoAddVo) throws BaseException {
        VaccinationInfoEntity vaccinationInfoEntity = new VaccinationInfoEntity( vaccinationInfoAddVo.getHorseId(),
                vaccinationInfoAddVo.getUserId(), vaccinationInfoAddVo.getOperateDate(), vaccinationInfoAddVo.getOperatePlace(),
                vaccinationInfoAddVo.getName(), vaccinationInfoAddVo.getVaccinationName(), vaccinationInfoAddVo.getVaccinationNumber() );
        try {
            Integer insertCount = vaccinationInfoMapper.insert( vaccinationInfoEntity );
            if ( insertCount > 0 ) {
                return true;
            }
        } catch ( Exception e ) {
            LOGGER.error( "【VaccinationInfoService】【addVaccinationInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        return false;
    }

    @Override
    public Boolean updateVaccinationInfo(VaccinationInfoUpdateVO vaccinationInfoUpdateVo) throws BaseException {
        VaccinationInfoEntity vaccinationInfoEntity = new VaccinationInfoEntity( vaccinationInfoUpdateVo.getVaccinationId(),
                vaccinationInfoUpdateVo.getHorseId(), vaccinationInfoUpdateVo.getUserId(), vaccinationInfoUpdateVo.getOperateDate(),
                vaccinationInfoUpdateVo.getOperatePlace(), vaccinationInfoUpdateVo.getName(), vaccinationInfoUpdateVo.getVaccinationName(),
                vaccinationInfoUpdateVo.getVaccinationNumber() );
        try {
            Integer updateCount = vaccinationInfoMapper.updateBySelective( vaccinationInfoEntity );
            if ( updateCount > 0 ) {
                return true;
            }
        } catch ( Exception e ) {
            LOGGER.error( "【VaccinationInfoService】【updateVaccinationInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        return false;
    }

    @Override
    public Boolean removeVaccinationInfo(VaccinationInfoDeleteVO vaccinationInfoDeleteVo) throws BaseException {
        VaccinationInfoEntity vaccinationInfoEntity = new VaccinationInfoEntity( vaccinationInfoDeleteVo.getVaccinationId() );
        vaccinationInfoEntity.setDeleteFlag( vaccinationInfoDeleteVo.getDeleteFlag() );
        vaccinationInfoEntity.setStatus( vaccinationInfoDeleteVo.getStatus() );
        try {
            Integer updateCount = vaccinationInfoMapper.updateBySelective( vaccinationInfoEntity );
            if ( updateCount > 0 ) {
                return true;
            }
        } catch ( Exception e ) {
            LOGGER.error( "【VaccinationInfoService】【removeVaccinationInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        return false;
    }

    @Override
    public VaccinationInfoListBO vaccinationInfoList(VaccinationInfoListVO vaccinationInfoListVo) throws BaseException {
        vaccinationInfoListVo.calculateBeginIndex();
        try {
            List<VaccinationInfoListModel> vaccinationInfoList = vaccinationInfoMapper.selectVaccinationInfoListByPage(vaccinationInfoListVo);
            Integer totalRecorders = vaccinationInfoMapper.countVaccinationInfoListByPage(vaccinationInfoListVo);
            VaccinationInfoListBO responseBo = new VaccinationInfoListBO( vaccinationInfoList );
            responseBo.setTotalRecorders( totalRecorders );
            responseBo.setTotalPages( PageUtils.calculateTotalPages(totalRecorders, vaccinationInfoListVo.getPageRecorders()) );
            return responseBo;
        } catch ( Exception e ) {
            LOGGER.error( "【VaccinationInfoService】【vaccinationInfoList】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
    }

    @Override
    public VaccinationInfoDetailBO vaccinationInfoDetail(VaccinationInfoDetailVO vaccinationInfoDetailVo) throws BaseException {
        VaccinationInfoEntity vaccinationInfoEntity = vaccinationInfoMapper.selectByPrimaryKey( vaccinationInfoDetailVo.getVaccinationId() );
        VaccinationInfoDetailBO response = new VaccinationInfoDetailBO( vaccinationInfoEntity.getVaccinationId(),
                vaccinationInfoEntity.getHorseId(), vaccinationInfoEntity.getOperateDate(), vaccinationInfoEntity.getOperatePlace(),
                vaccinationInfoEntity.getName(), vaccinationInfoEntity.getVaccinationName(), vaccinationInfoEntity.getUserId(),
                vaccinationInfoEntity.getVaccinationNumber() );
        return response;
    }


}
