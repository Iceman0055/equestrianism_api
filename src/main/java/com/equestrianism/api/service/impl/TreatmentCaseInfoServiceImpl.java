package com.equestrianism.api.service.impl;

import com.equestrianism.api.constants.CodeEnum;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.PageUtils;
import com.equestrianism.api.dao.TreatmentCaseInfoMapper;
import com.equestrianism.api.model.bo.HostInfoListBO;
import com.equestrianism.api.model.bo.TreatmentCaseInfoDetailBO;
import com.equestrianism.api.model.bo.TreatmentCaseInfoListBO;
import com.equestrianism.api.model.model.HostInfoListModel;
import com.equestrianism.api.model.model.TreatmentCaseInfoListModel;
import com.equestrianism.api.model.po.RoleInfoEntity;
import com.equestrianism.api.model.po.TreatmentCaseInfoEntity;
import com.equestrianism.api.model.vo.treatment_case.TreatmentCaseInfoAddVO;
import com.equestrianism.api.model.vo.treatment_case.TreatmentCaseInfoDeleteVO;
import com.equestrianism.api.model.vo.treatment_case.TreatmentCaseInfoListVO;
import com.equestrianism.api.model.vo.treatment_case.TreatmentCaseInfoUpdateVO;
import com.equestrianism.api.service.TreatmentCaseInfoService;
import com.equestrianism.api.service.TreatmentCasePhotoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/18.
 */
@Service( "treatmentCaseInfoService" )
public class TreatmentCaseInfoServiceImpl implements TreatmentCaseInfoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(TreatmentCaseInfoServiceImpl.class);

    @Autowired
    private TreatmentCaseInfoMapper treatmentCaseInfoMapper;

    @Autowired
    private TreatmentCasePhotoService treatmentCasePhotoService;

    @Override
    public Boolean addTreatmentCaseInfo(TreatmentCaseInfoAddVO treatmentCaseInfoAddVo) throws BaseException {
        TreatmentCaseInfoEntity treatmentCaseInfoEntity = new TreatmentCaseInfoEntity( treatmentCaseInfoAddVo.getTreatmentId(),
                treatmentCaseInfoAddVo.getOperatorDate(), treatmentCaseInfoAddVo.getPlace(), treatmentCaseInfoAddVo.getClinical(),
                treatmentCaseInfoAddVo.getFirstVisit(), treatmentCaseInfoAddVo.getAdvice(), treatmentCaseInfoAddVo.getTitleTag(),
                treatmentCaseInfoAddVo.getRemark() );
        try {
            Integer insertCount = treatmentCaseInfoMapper.insert( treatmentCaseInfoEntity );
            if ( insertCount > 0 ) {
                if ( treatmentCaseInfoAddVo.getPhotoList() != null && treatmentCaseInfoAddVo.getPhotoList().size() > 0 ) {
                    for ( String casePhotoId : treatmentCaseInfoAddVo.getPhotoList() ) {
                        treatmentCasePhotoService.updateTreatmentCasePhoto( casePhotoId, treatmentCaseInfoEntity.getTreatmentCaseId() );
                    }
                }
                return true;
            }
        } catch ( Exception e ) {
            LOGGER.error( "【TreatmentCaseInfoService】【addTreatmentCaseInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        return false;
    }

    @Override
    public Boolean updateTreatmentCaseInfo(TreatmentCaseInfoUpdateVO treatmentCaseInfoUpdateVo) throws BaseException {
        TreatmentCaseInfoEntity treatmentCaseInfoEntity = new TreatmentCaseInfoEntity( treatmentCaseInfoUpdateVo.getTreatmentCaseId(),
                treatmentCaseInfoUpdateVo.getTreatmentId(), treatmentCaseInfoUpdateVo.getOperatorDate(),
                treatmentCaseInfoUpdateVo.getPlace(), treatmentCaseInfoUpdateVo.getClinical(), treatmentCaseInfoUpdateVo.getFirstVisit(),
                treatmentCaseInfoUpdateVo.getAdvice(), treatmentCaseInfoUpdateVo.getTitleTag(), treatmentCaseInfoUpdateVo.getRemark() );
        try {
            Integer updateCount = treatmentCaseInfoMapper.updateBySelective(treatmentCaseInfoEntity);
            if ( updateCount > 0 ) {
                if ( treatmentCaseInfoUpdateVo.getPhotoList() != null && treatmentCaseInfoUpdateVo.getPhotoList().size() > 0 ) {
                    for ( String casePhotoId : treatmentCaseInfoUpdateVo.getPhotoList() ) {
                        treatmentCasePhotoService.updateTreatmentCasePhoto( casePhotoId, treatmentCaseInfoEntity.getTreatmentCaseId() );
                    }
                }
                return true;
            }
        } catch ( Exception e ) {
            LOGGER.error( "【TreatmentCaseInfoService】【updateTreatmentCaseInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        return false;
    }

    @Override
    public Boolean removeTreatmentCaseInfo(TreatmentCaseInfoDeleteVO treatmentCaseInfoDeleteVo) throws BaseException {
        TreatmentCaseInfoEntity treatmentCaseInfoEntity = new TreatmentCaseInfoEntity( treatmentCaseInfoDeleteVo.getTreatmentCaseId() );
        treatmentCaseInfoEntity.setDeleteFlag( treatmentCaseInfoDeleteVo.getDeleteFlag() );
        treatmentCaseInfoEntity.setStatus( treatmentCaseInfoDeleteVo.getStatus() );
        try {
            Integer updateCount = treatmentCaseInfoMapper.updateBySelective(treatmentCaseInfoEntity);
            if ( updateCount > 0 ) {
                return true;
            }
        } catch ( Exception e ) {
            LOGGER.error( "【TreatmentCaseInfoService】【removeTreatmentCaseInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        return false;
    }

    @Override
    public TreatmentCaseInfoListBO treatmentCaseInfoList(TreatmentCaseInfoListVO treatmentCaseInfoListVo) throws BaseException {
        treatmentCaseInfoListVo.calculateBeginIndex();
        try {
            List<TreatmentCaseInfoListModel> treatmentCaseList = treatmentCaseInfoMapper.selectTreatmentCaseListByPage(treatmentCaseInfoListVo);
            Integer totalRecorders = treatmentCaseInfoMapper.countTreatmentCaseListByPage(treatmentCaseInfoListVo);
            TreatmentCaseInfoListBO responseBo = new TreatmentCaseInfoListBO( treatmentCaseList );
            responseBo.setTotalRecorders( totalRecorders );
            responseBo.setTotalPages( PageUtils.calculateTotalPages(totalRecorders, treatmentCaseInfoListVo.getPageRecorders()) );
            return responseBo;
        } catch ( Exception e ) {
            LOGGER.error( "【TreatmentCaseInfoService】【treatmentCaseInfoList】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
    }

    @Override
    public TreatmentCaseInfoDetailBO treatmentCaseInfoDetail(String treatmentCaseId) throws BaseException {
        return treatmentCaseInfoMapper.selectByPrimaryKey( treatmentCaseId );
    }
}
