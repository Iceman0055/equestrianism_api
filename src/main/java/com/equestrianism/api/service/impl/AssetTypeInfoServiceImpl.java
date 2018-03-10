package com.equestrianism.api.service.impl;

import com.equestrianism.api.constants.CodeEnum;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.PageUtils;
import com.equestrianism.api.dao.AssetTypeInfoMapper;
import com.equestrianism.api.model.bo.*;
import com.equestrianism.api.model.model.AssetTypeInfoComboBoxModel;
import com.equestrianism.api.model.model.AssetTypeInfoListModel;
import com.equestrianism.api.model.model.DictionaryInfoListModel;
import com.equestrianism.api.model.model.RoleInfoComboBoxModel;
import com.equestrianism.api.model.po.AssetTypeInfoEntity;
import com.equestrianism.api.model.po.DictionaryInfoEntity;
import com.equestrianism.api.model.vo.asset_type_info.AssetTypeInfoAddVO;
import com.equestrianism.api.model.vo.asset_type_info.AssetTypeInfoDeleteVO;
import com.equestrianism.api.model.vo.asset_type_info.AssetTypeInfoListVO;
import com.equestrianism.api.model.vo.asset_type_info.AssetTypeInfoUpdateVO;
import com.equestrianism.api.service.AssetTypeInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/11.
 */
@Service( "assetTypeInfoService" )
public class AssetTypeInfoServiceImpl implements AssetTypeInfoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AssetTypeInfoServiceImpl.class);

    @Autowired
    private AssetTypeInfoMapper assetTypeInfoMapper;

    @Override
    public Boolean addAssetTypeInfo(AssetTypeInfoAddVO assetTypeInfoAddVo) throws BaseException {
        AssetTypeInfoEntity assetTypeInfoEntity = new AssetTypeInfoEntity( assetTypeInfoAddVo.getTypeName(),
                assetTypeInfoAddVo.getRemark() );
        Integer insertCount;
        try {
            insertCount = assetTypeInfoMapper.insert( assetTypeInfoEntity );
        } catch ( Exception e ) {
            LOGGER.error( "【AssetTypeInfoService】【addAssetTypeInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        if ( insertCount > 0 ) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean updateAssetTypeInfo(AssetTypeInfoUpdateVO assetTypeInfoUpdateVo) throws BaseException {
        AssetTypeInfoEntity assetTypeInfoEntity = new AssetTypeInfoEntity( assetTypeInfoUpdateVo.getTypeId(),
                assetTypeInfoUpdateVo.getTypeName(), assetTypeInfoUpdateVo.getRemark() );
        Integer updateCount;
        try {
            updateCount = assetTypeInfoMapper.updateBySelective( assetTypeInfoEntity );
        } catch ( Exception e ) {
            LOGGER.error( "【AssetTypeInfoService】【updateAssetTypeInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        if ( updateCount > 0 ) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean removeAssetTypeInfo(AssetTypeInfoDeleteVO assetTypeInfoDeleteVo) throws BaseException {
        AssetTypeInfoEntity assetTypeInfoEntity = new AssetTypeInfoEntity( assetTypeInfoDeleteVo.getTypeId() );
        assetTypeInfoEntity.setDeleteFlag( assetTypeInfoDeleteVo.getDeleteFlag() );
        assetTypeInfoEntity.setStatus( assetTypeInfoDeleteVo.getStatus() );
        Integer updateCount;
        try {
            updateCount = assetTypeInfoMapper.updateBySelective( assetTypeInfoEntity );
        } catch ( Exception e ) {
            LOGGER.error( "【AssetTypeInfoService】【removeAssetTypeInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        if ( updateCount > 0 ) {
            return true;
        }
        return false;
    }

    @Override
    public AssetTypeInfoListBO assetTypeInfoList(AssetTypeInfoListVO assetTypeInfoListVo) throws BaseException {
        assetTypeInfoListVo.calculateBeginIndex();
        try {
            List<AssetTypeInfoListModel> assetTypeInfoList = assetTypeInfoMapper.selectAssetTypeInfoListByPage(assetTypeInfoListVo);
            Integer totalRecorders = assetTypeInfoMapper.countAssetTypeInfoListByPage(assetTypeInfoListVo);
            AssetTypeInfoListBO responseBo = new AssetTypeInfoListBO( assetTypeInfoList );
            responseBo.setTotalRecorders( totalRecorders );
            responseBo.setTotalPages( PageUtils.calculateTotalPages(totalRecorders, assetTypeInfoListVo.getPageRecorders()) );
            return responseBo;
        } catch ( Exception e ) {
            LOGGER.error( "【AssetTypeInfoService】【assetTypeInfoList】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
    }

    @Override
    public AssetTypeInfoDetailBO assetTypeInfoDetail(Integer assetTypeId) throws BaseException {
        AssetTypeInfoEntity assetTypeInfoEntity = assetTypeInfoMapper.selectByPrimaryKey( assetTypeId );
        if ( assetTypeInfoEntity == null ) {
            return null;
        }
        AssetTypeInfoDetailBO response = new AssetTypeInfoDetailBO( assetTypeInfoEntity.getTypeId(), assetTypeInfoEntity.getTypeName(),
                assetTypeInfoEntity.getRemark() );
        return response;
    }

    @Override
    public AssetTypeInfoComboBoxBO comboBox() throws BaseException {
        try {
            List<AssetTypeInfoComboBoxModel> assetTypeList = assetTypeInfoMapper.selectAssetTypeListByComboBox();
            return new AssetTypeInfoComboBoxBO( assetTypeList );
        } catch ( Exception e ) {
            LOGGER.error( "【AssetTypeInfoService】【comboBox】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
    }


}
