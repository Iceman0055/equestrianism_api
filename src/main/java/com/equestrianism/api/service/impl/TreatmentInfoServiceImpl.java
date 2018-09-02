package com.equestrianism.api.service.impl;

import com.equestrianism.api.constants.AssetTypeEnum;
import com.equestrianism.api.constants.CodeEnum;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.PageUtils;
import com.equestrianism.api.dao.*;
import com.equestrianism.api.model.bo.*;
import com.equestrianism.api.model.model.AssetTypeDetailListModel;
import com.equestrianism.api.model.model.TreatmentAssetModel;
import com.equestrianism.api.model.model.TreatmentInfoAddAssetModel;
import com.equestrianism.api.model.model.TreatmentInfoListModel;
import com.equestrianism.api.model.po.*;
import com.equestrianism.api.model.vo.treatment_info.TreatmentInfoAddVO;
import com.equestrianism.api.model.vo.treatment_info.TreatmentInfoDeleteVO;
import com.equestrianism.api.model.vo.treatment_info.TreatmentInfoListVO;
import com.equestrianism.api.model.vo.treatment_info.TreatmentInfoUpdateVO;
import com.equestrianism.api.service.TreatmentInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Chenzq on 2018/3/17.
 */
@Service( "treatmentInfoService" )
public class TreatmentInfoServiceImpl implements TreatmentInfoService {

    private static final Logger LOGGER = LoggerFactory.getLogger( TreatmentInfoServiceImpl.class );

    @Autowired
    private TreatmentInfoMapper treatmentInfoMapper;

    @Autowired
    private HospitalAppointInfoMapper hospitalAppointInfoMapper;

    @Autowired
    private TreatmentAssetInfoMapper treatmentAssetInfoMapper;

    @Autowired
    private AssetInfoMapper assetInfoMapper;

    @Autowired
    private AssetInventoryDetailMapper assetInventoryDetailMapper;

    @Override
    public TreatmentInfoAddBO addTreatmentInfo(TreatmentInfoAddVO treatmentInfoAddVo) throws BaseException {
        String hospitalAppointId = "";
        if ( treatmentInfoAddVo.getOutpatientType() == 2 ) {
            HospitalAppointInfoEntity hospitalAppointInfoEntity = hospitalAppointInfoMapper.selectByAppointNumber( treatmentInfoAddVo.getAppointNumber() );
            if ( hospitalAppointInfoEntity != null ) {
                hospitalAppointId = hospitalAppointInfoEntity.getHospitalAppointId();
            }
        }
        if ( treatmentInfoAddVo.getHorseType() != 1 ) {
            treatmentInfoAddVo.setHorseId( "" );
        } else {
            treatmentInfoAddVo.setHorseName( "" );
        }
        TreatmentInfoEntity treatmentInfoEntity = new TreatmentInfoEntity( treatmentInfoAddVo.getOutpatientType(), hospitalAppointId,
                treatmentInfoAddVo.getHorseType(), treatmentInfoAddVo.getHorseId(), treatmentInfoAddVo.getHorseName(),
                treatmentInfoAddVo.getBeginDate(), treatmentInfoAddVo.getBeginTime(), treatmentInfoAddVo.getEndDate(),
                treatmentInfoAddVo.getEndTime(), treatmentInfoAddVo.getTreatName(), treatmentInfoAddVo.getTreatDesc(),
                treatmentInfoAddVo.getConsultingRoomId() );
        treatmentInfoEntity.setUserId( treatmentInfoAddVo.getAccessId() );
        Integer insertCount;
        try {
            insertCount = treatmentInfoMapper.insert( treatmentInfoEntity );
        } catch ( Exception e ) {
            LOGGER.error( "【TreatmentInfoService】【addTreatmentInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        if ( insertCount == 0 ) {
            return null;
        }
        List<TreatmentInfoAddAssetModel> hospitalAssetList = treatmentInfoAddVo.getHospitalAssetList();
        List<TreatmentInfoAddAssetModel> consumableAssetList = treatmentInfoAddVo.getConsumableAssetList();
        TreatmentAssetInfoEntity treatmentAssetInfoEntity;
        if ( hospitalAssetList != null && hospitalAssetList.size() > 0 ) {
            for ( TreatmentInfoAddAssetModel treatmentInfoAddAssetModel : hospitalAssetList ) {
                treatmentAssetInfoEntity = new TreatmentAssetInfoEntity( treatmentInfoEntity.getTreatmentId(), AssetTypeEnum.HOSPITAL_ASSET_TYPE.type,
                        treatmentInfoAddAssetModel.getAssetId(), treatmentInfoAddAssetModel.getCount() );
                treatmentAssetInfoMapper.insert( treatmentAssetInfoEntity );
            }
        }
        if ( consumableAssetList != null && consumableAssetList.size() > 0 ) {
            for ( TreatmentInfoAddAssetModel treatmentInfoAddAssetModel : consumableAssetList ) {
                treatmentAssetInfoEntity = new TreatmentAssetInfoEntity( treatmentInfoEntity.getTreatmentId(), AssetTypeEnum.CONSUMABLE_ASSET_TYPE.type,
                        treatmentInfoAddAssetModel.getAssetId(), treatmentInfoAddAssetModel.getCount() );
                treatmentAssetInfoMapper.insert( treatmentAssetInfoEntity );
                Map<String, Object> params = new HashMap<>();
                params.put( "assetType", AssetTypeEnum.CONSUMABLE_ASSET_TYPE.type );
                params.put( "assetId", treatmentInfoAddAssetModel.getAssetId() );
                params.put( "inventory", treatmentInfoAddAssetModel.getCount() * -1 );
                assetInfoMapper.inventory( params );
                AssetInventoryDetailEntity assetInventoryDetailEntity = new AssetInventoryDetailEntity( treatmentInfoAddAssetModel.getAssetId(),
                        AssetTypeEnum.CONSUMABLE_ASSET_TYPE.type, treatmentInfoAddAssetModel.getCount(), 2 );
                assetInventoryDetailMapper.insert( assetInventoryDetailEntity );
            }
        }
        return new TreatmentInfoAddBO( treatmentInfoEntity.getTreatmentId() );
    }

    @Override
    public Boolean updateTreatmentInfo(TreatmentInfoUpdateVO treatmentInfoUpdateVo) throws BaseException {
        String hospitalAppointId = "";
        if ( treatmentInfoUpdateVo.getOutpatientType() == 2 ) {
            HospitalAppointInfoEntity hospitalAppointInfoEntity = hospitalAppointInfoMapper.selectByAppointNumber( treatmentInfoUpdateVo.getAppointNumber() );
            if ( hospitalAppointInfoEntity != null ) {
                hospitalAppointId = hospitalAppointInfoEntity.getHospitalAppointId();
            }
        }
        if ( treatmentInfoUpdateVo.getHorseType() != 1 ) {
            treatmentInfoUpdateVo.setHorseId( "" );
        } else {
            treatmentInfoUpdateVo.setHorseName( "" );
        }
        TreatmentInfoEntity treatmentInfoEntity = new TreatmentInfoEntity( treatmentInfoUpdateVo.getTreatmentId(),
                treatmentInfoUpdateVo.getOutpatientType(), hospitalAppointId,
                treatmentInfoUpdateVo.getHorseType(), treatmentInfoUpdateVo.getHorseId(), treatmentInfoUpdateVo.getHorseName(),
                treatmentInfoUpdateVo.getBeginDate(), treatmentInfoUpdateVo.getBeginTime(), treatmentInfoUpdateVo.getEndDate(),
                treatmentInfoUpdateVo.getEndTime(), treatmentInfoUpdateVo.getTreatName(), treatmentInfoUpdateVo.getTreatDesc(),
                treatmentInfoUpdateVo.getConsultingRoomId() );
        Integer updateCount;
        try {
            updateCount = treatmentInfoMapper.updateBySelective( treatmentInfoEntity );
        } catch ( Exception e ) {
            LOGGER.error( "【TreatmentInfoService】【updateTreatmentInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        if ( updateCount > 0 ) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean removeTreatmentInfo(TreatmentInfoDeleteVO treatmentInfoDeleteVo) throws BaseException {
        TreatmentInfoEntity treatmentInfoEntity = new TreatmentInfoEntity( treatmentInfoDeleteVo.getTreatmentId() );
        treatmentInfoEntity.setDeleteFlag( treatmentInfoDeleteVo.getDeleteFlag() );
        treatmentInfoEntity.setStatus( treatmentInfoDeleteVo.getStatus() );
        Integer updateCount;
        try {
            updateCount = treatmentInfoMapper.updateBySelective( treatmentInfoEntity );
        } catch ( Exception e ) {
            LOGGER.error( "【TreatmentInfoService】【removeTreatmentInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        if ( updateCount > 0 ) {
            return true;
        }
        return false;
    }

    @Override
    public TreatmentInfoListBO treatmentInfoList(TreatmentInfoListVO treatmentInfoListVo) throws BaseException {
        treatmentInfoListVo.calculateBeginIndex();
        try {
            List<TreatmentInfoListModel> treatmentInfoList = treatmentInfoMapper.selectTreatmentListByPage( treatmentInfoListVo );
            Integer totalRecorders = treatmentInfoMapper.countTreatmentListByPage(treatmentInfoListVo);
            TreatmentInfoListBO responseBo = new TreatmentInfoListBO( treatmentInfoList );
            responseBo.setTotalRecorders( totalRecorders );
            responseBo.setTotalPages( PageUtils.calculateTotalPages(totalRecorders, treatmentInfoListVo.getPageRecorders()) );
            return responseBo;
        } catch ( Exception e ) {
            LOGGER.error( "【AssetTypeDetailService】【assetTypeDetailList】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
    }

    @Override
    public TreatmentInfoDetailBO treatmentInfoDetail(String treatmentId) throws BaseException {
        TreatmentInfoEntity treatmentInfoEntity = treatmentInfoMapper.selectByPrimaryKey( treatmentId );
        return new TreatmentInfoDetailBO( treatmentInfoEntity.getTreatmentId(), treatmentInfoEntity.getOutpatientType(),
                treatmentInfoEntity.getHospitalAppointId(), treatmentInfoEntity.getHorseType(), treatmentInfoEntity.getHorseName(),
                treatmentInfoEntity.getHorseId(), treatmentInfoEntity.getBeginDate(), treatmentInfoEntity.getBeginTime(),
                treatmentInfoEntity.getEndDate(), treatmentInfoEntity.getEndTime(), treatmentInfoEntity.getTreatName(),
                treatmentInfoEntity.getTreatDesc(), treatmentInfoEntity.getConsultingRoomId() );
    }

    @Override
    public TreatmentAssetListBO assetList(String treatmentId, Integer assetType ) throws BaseException {
        Map<String, Object> params = new HashMap<>();
        params.put( "treatmentId", treatmentId );
        params.put( "assetType", assetType );
        List<TreatmentInfoAddAssetModel> assetList = treatmentAssetInfoMapper.selectByTreatmentId( params );
        return new TreatmentAssetListBO( assetList );
    }
}