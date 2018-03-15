package com.equestrianism.api.service.impl;

import com.equestrianism.api.constants.CodeEnum;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.PageUtils;
import com.equestrianism.api.dao.AssetInfoMapper;
import com.equestrianism.api.dao.AssetInventoryDetailMapper;
import com.equestrianism.api.model.bo.*;
import com.equestrianism.api.model.model.AssetInfoInventoryModel;
import com.equestrianism.api.model.model.AssetInfoListModel;
import com.equestrianism.api.model.model.AssetTypeDetailListModel;
import com.equestrianism.api.model.po.AssetInfoEntity;
import com.equestrianism.api.model.po.AssetInventoryDetailEntity;
import com.equestrianism.api.model.po.AssetTypeDetailEntity;
import com.equestrianism.api.model.vo.asset_info.*;
import com.equestrianism.api.service.AssetInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Chenzq on 2018/3/14.
 */
@Service( "assetInfoService" )
public class AssetInfoServiceImpl implements AssetInfoService {

    private static final Logger LOGGER = LoggerFactory.getLogger( AssetInfoServiceImpl.class );

    @Autowired
    private AssetInfoMapper assetInfoMapper;

    @Autowired
    private AssetInventoryDetailMapper assetInventoryDetailMapper;

    @Override
    public Boolean addAssetInfo( AssetInfoAddVO assetInfoAddVo ) throws BaseException {
        if ( assetInfoAddVo.getBarCode() == null ) {
            assetInfoAddVo.setBarCode( "" );
        }
        if ( assetInfoAddVo.getInventory() == null ) {
            assetInfoAddVo.setInventory( 0 );
        }
        AssetInfoEntity assetInfoEntity = new AssetInfoEntity( assetInfoAddVo.getTypeId(), assetInfoAddVo.getTypeDetailId(),
                assetInfoAddVo.getAssetType(), assetInfoAddVo.getAssetNumber(), assetInfoAddVo.getAssetName(),
                assetInfoAddVo.getPrice(), assetInfoAddVo.getAcreage(), assetInfoAddVo.getPriceType(), assetInfoAddVo.getAcquireWay(),
                assetInfoAddVo.getFinanceAccountsDate(), assetInfoAddVo.getTabDate(), assetInfoAddVo.getGuaranteeDate(),
                assetInfoAddVo.getManageDepartment(), assetInfoAddVo.getManageUser(), assetInfoAddVo.getRemark(),
                assetInfoAddVo.getPurpose(), assetInfoAddVo.getSpecificationModel(), assetInfoAddVo.getBrand(),
                assetInfoAddVo.getVoucherNumber(), assetInfoAddVo.getPurchaseOrganize(), assetInfoAddVo.getBarCode(), assetInfoAddVo.getInventory() );
        Integer insertCount;
        try {
            insertCount = assetInfoMapper.insert( assetInfoEntity );
        } catch ( Exception e ) {
            LOGGER.error( "【AssetInfoService】【addAssetInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        if ( insertCount > 0 ) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean updateAssetInfo(AssetInfoUpdateVO assetInfoUpdateVo) throws BaseException {
        if ( assetInfoUpdateVo.getBarCode() == null ) {
            assetInfoUpdateVo.setBarCode( "" );
        }
        AssetInfoEntity assetInfoEntity = new AssetInfoEntity( assetInfoUpdateVo.getAssetId(), assetInfoUpdateVo.getTypeId(),
                assetInfoUpdateVo.getTypeDetailId(), assetInfoUpdateVo.getAssetType(), assetInfoUpdateVo.getAssetNumber(),
                assetInfoUpdateVo.getAssetName(), assetInfoUpdateVo.getPrice(), assetInfoUpdateVo.getAcreage(), assetInfoUpdateVo.getPriceType(),
                assetInfoUpdateVo.getAcquireWay(), assetInfoUpdateVo.getFinanceAccountsDate(), assetInfoUpdateVo.getTabDate(),
                assetInfoUpdateVo.getGuaranteeDate(), assetInfoUpdateVo.getManageDepartment(), assetInfoUpdateVo.getManageUser(),
                assetInfoUpdateVo.getRemark(), assetInfoUpdateVo.getPurpose(), assetInfoUpdateVo.getSpecificationModel(),
                assetInfoUpdateVo.getBrand(), assetInfoUpdateVo.getVoucherNumber(), assetInfoUpdateVo.getPurchaseOrganize(),
                assetInfoUpdateVo.getBarCode(), null );
        Integer updateCount;
        try {
            updateCount = assetInfoMapper.updateBySelective( assetInfoEntity );
        } catch ( Exception e ) {
            LOGGER.error( "【AssetInfoService】【updateAssetInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        if ( updateCount > 0 ) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean removeAssetInfo(AssetInfoDeleteVO assetInfoDeleteVo) throws BaseException {
        AssetInfoEntity assetInfoEntity = new AssetInfoEntity( assetInfoDeleteVo.getAssetId() );
        assetInfoEntity.setDeleteFlag( assetInfoDeleteVo.getDeleteFlag() );
        assetInfoEntity.setStatus( assetInfoDeleteVo.getStatus() );
        Integer updateCount;
        try {
            updateCount = assetInfoMapper.updateBySelective( assetInfoEntity );
        } catch ( Exception e ) {
            LOGGER.error( "【AssetInfoService】【removeAssetInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        if ( updateCount > 0 ) {
            return true;
        }
        return false;
    }

    @Override
    public AssetInfoListBO assetInfoList(AssetInfoListVO assetInfoListVo) throws BaseException {
        assetInfoListVo.calculateBeginIndex();
        try {
            List<AssetInfoListModel> assetInfoList = assetInfoMapper.selectAssetInfoListByPage(assetInfoListVo);
            Integer totalRecorders = assetInfoMapper.countAssetInfoListByPage(assetInfoListVo);
            AssetInfoListBO responseBo = new AssetInfoListBO( assetInfoList );
            responseBo.setTotalRecorders( totalRecorders );
            responseBo.setTotalPages( PageUtils.calculateTotalPages(totalRecorders, assetInfoListVo.getPageRecorders()) );
            return responseBo;
        } catch ( Exception e ) {
            LOGGER.error( "【AssetInfoService】【assetInfoList】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
    }

    @Override
    public AssetInfoDetailBO assetInfoDetail(String assetId) throws BaseException {
        AssetInfoEntity assetInfoEntity = assetInfoMapper.selectByPrimaryKey( assetId );
        return new AssetInfoDetailBO( assetInfoEntity.getAssetId(), assetInfoEntity.getTypeId(), assetInfoEntity.getTypeDetailId(),
                assetInfoEntity.getAssetType(), assetInfoEntity.getAssetNumber(), assetInfoEntity.getAssetName(), assetInfoEntity.getPrice(),
                assetInfoEntity.getAcreage(), assetInfoEntity.getPriceType(), assetInfoEntity.getAcquireWay(), assetInfoEntity.getFinanceAccountsDate(),
                assetInfoEntity.getTabDate(), assetInfoEntity.getGuaranteeDate(), assetInfoEntity.getManageDepartment(), assetInfoEntity.getManageUser(),
                assetInfoEntity.getRemark(), assetInfoEntity.getPurpose(), assetInfoEntity.getSpecificationModel(),
                assetInfoEntity.getBrand(), assetInfoEntity.getVoucherNumber(), assetInfoEntity.getPurchaseOrganize(),
                assetInfoEntity.getBarCode() );
    }

    @Override
    public AssetInfoNameBO assetName(String barCode, Integer type) throws BaseException {
        Map<String, Object> params = new HashMap<>();
        params.put( "barCode", barCode );
        params.put( "assetType", type );
        AssetInfoEntity assetInfoEntity = assetInfoMapper.selectBySelective(params);
        if ( assetInfoEntity == null ) {
            return null;
        }
        return new AssetInfoNameBO( assetInfoEntity.getAssetId(), assetInfoEntity.getAssetName() );
    }

    @Override
    public Boolean inventory(AssetInfoInventoryVO assetInfoInventoryVo) throws BaseException {
        List<AssetInfoInventoryModel> inventoryList = assetInfoInventoryVo.getInventoryList();
        if ( inventoryList == null || inventoryList.size() == 0 ) {
            return true;
        }
        Map<String, Object> params;
        for ( AssetInfoInventoryModel assetInfoInventoryModel : inventoryList ) {
            if ( assetInfoInventoryModel.getInventory() <= 0 ) {
                continue;
            }
            params = new HashMap<>();
            params.put( "assetType", assetInfoInventoryVo.getAssetType() );
            params.put( "assetId", assetInfoInventoryModel.getAssetId() );
            params.put( "inventory", assetInfoInventoryModel.getInventory() );
            AssetInventoryDetailEntity assetInventoryDetailEntity = new AssetInventoryDetailEntity( assetInfoInventoryModel.getAssetId(),
                    assetInfoInventoryVo.getAssetType(), assetInfoInventoryModel.getInventory(), 1 );
            try {
                assetInfoMapper.inventory( params );
                assetInventoryDetailMapper.insert( assetInventoryDetailEntity );
            } catch ( Exception e ) {
                LOGGER.error("【AssetInfoService】【inventory】", e);
            }
        }
        return true;
    }
}