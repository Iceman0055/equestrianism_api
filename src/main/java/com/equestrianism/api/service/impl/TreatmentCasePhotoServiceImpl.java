package com.equestrianism.api.service.impl;

import com.equestrianism.api.constants.CodeEnum;
import com.equestrianism.api.controller.AssetTypeInfoController;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.dao.TreatmentCasePhotoMapper;
import com.equestrianism.api.model.bo.TreatmentCasePhotoAddBO;
import com.equestrianism.api.model.bo.TreatmentCasePhotoListBO;
import com.equestrianism.api.model.model.TreatmentCasePhotoListModel;
import com.equestrianism.api.model.po.TreatmentCasePhotoEntity;
import com.equestrianism.api.model.vo.treatment_case.TreatmentCasePhotoAddVO;
import com.equestrianism.api.model.vo.treatment_case.TreatmentCasePhotoListVO;
import com.equestrianism.api.service.TreatmentCasePhotoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * Created by Chenzq on 2018/3/18.
 */
@Service("treatmentCasePhotoService")
public class TreatmentCasePhotoServiceImpl implements TreatmentCasePhotoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AssetTypeInfoController.class);

    @Autowired
    private TreatmentCasePhotoMapper treatmentCasePhotoMapper;

    @Override
    public TreatmentCasePhotoAddBO addTreatmentCasePhoto(TreatmentCasePhotoAddVO treatmentCasePhotoAddVo) throws BaseException, IOException {
        TreatmentCasePhotoEntity treatmentCasePhotoEntity = new TreatmentCasePhotoEntity("-1", treatmentCasePhotoAddVo.getPhotoType(),
                treatmentCasePhotoAddVo.getPhoto());
        try {
            Integer insertCount = treatmentCasePhotoMapper.insert(treatmentCasePhotoEntity);
            if ( insertCount > 0 ) {
                return new TreatmentCasePhotoAddBO( treatmentCasePhotoEntity.getCasePhotoId() );
            }
        } catch (Exception e) {
            LOGGER.error("【TreatmentCasePhotoService】【addTreatmentCasePhoto】", e);
            throw new BaseException(CodeEnum.PROCESS_FAIL.note);
        }
        return null;
    }

    @Override
    public Boolean updateTreatmentCasePhoto(String casePhotoId, String treatmentCaseId) {
        TreatmentCasePhotoEntity treatmentCasePhotoEntity = new TreatmentCasePhotoEntity();
        treatmentCasePhotoEntity.setCasePhotoId( casePhotoId );
        treatmentCasePhotoEntity.setTreatmentCaseId( treatmentCaseId );
        try {
            Integer insertCount = treatmentCasePhotoMapper.updateBySelective(treatmentCasePhotoEntity);
            if ( insertCount > 0 ) {
                return true;
            }
        } catch (Exception e) {
            LOGGER.error("【TreatmentCasePhotoService】【updateTreatmentCasePhoto】", e);
            throw new BaseException(CodeEnum.PROCESS_FAIL.note);
        }
        return false;
    }

    @Override
    public TreatmentCasePhotoListBO treatmentCasePhotoList(TreatmentCasePhotoListVO treatmentCasePhotoListVo) throws BaseException {
        List<TreatmentCasePhotoListModel> casePhotoList = treatmentCasePhotoMapper.selectByTreatmentCaseId( treatmentCasePhotoListVo );
        return new TreatmentCasePhotoListBO( casePhotoList );
    }

    @Override
    public Boolean removeTreatmentCasePhoto(String casePhotoId) throws BaseException {
        TreatmentCasePhotoEntity treatmentCasePhotoEntity = new TreatmentCasePhotoEntity( casePhotoId );
        treatmentCasePhotoEntity.setDeleteFlag( 1 );
        treatmentCasePhotoEntity.setStatus( 0 );
        System.out.println( treatmentCasePhotoEntity.getCasePhotoId() );
        try {
            Integer insertCount = treatmentCasePhotoMapper.updateBySelective(treatmentCasePhotoEntity);
            if ( insertCount > 0 ) {
                return true;
            }
        } catch (Exception e) {
            LOGGER.error("【TreatmentCasePhotoService】【removeTreatmentCasePhoto】", e);
            throw new BaseException(CodeEnum.PROCESS_FAIL.note);
        }
        return false;
    }
}
