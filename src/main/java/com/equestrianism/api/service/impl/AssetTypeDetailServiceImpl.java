package com.equestrianism.api.service.impl;

import com.equestrianism.api.constants.CodeEnum;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.PageUtils;
import com.equestrianism.api.dao.AssetTypeDetailMapper;
import com.equestrianism.api.model.bo.AssetTypeDetailComboBoxBO;
import com.equestrianism.api.model.bo.AssetTypeDetailInfoBO;
import com.equestrianism.api.model.bo.AssetTypeDetailListBO;
import com.equestrianism.api.model.bo.AssetTypeInfoListBO;
import com.equestrianism.api.model.model.AssetTypeDetailComboBoxModel;
import com.equestrianism.api.model.model.AssetTypeDetailListModel;
import com.equestrianism.api.model.model.AssetTypeInfoListModel;
import com.equestrianism.api.model.po.AssetTypeDetailEntity;
import com.equestrianism.api.model.po.AssetTypeInfoEntity;
import com.equestrianism.api.model.vo.asset_type_detail.AssetTypeDetailAddVO;
import com.equestrianism.api.model.vo.asset_type_detail.AssetTypeDetailDeleteVO;
import com.equestrianism.api.model.vo.asset_type_detail.AssetTypeDetailListVO;
import com.equestrianism.api.model.vo.asset_type_detail.AssetTypeDetailUpdateVO;
import com.equestrianism.api.service.AssetTypeDetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/12.
 */
@Service( "assetTypeDetailService" )
public class AssetTypeDetailServiceImpl implements AssetTypeDetailService {

    private static final Logger LOGGER = LoggerFactory.getLogger( AssetTypeDetailServiceImpl.class );

    @Autowired
    private AssetTypeDetailMapper assetTypeDetailMapper;

    @Override
    public Boolean addAssetTypeDetail(AssetTypeDetailAddVO assetTypeDetailAddVo) throws BaseException {
        AssetTypeDetailEntity assetTypeDetailEntity = new AssetTypeDetailEntity( assetTypeDetailAddVo.getTypeDetailName(),
                assetTypeDetailAddVo.getTypeId(), assetTypeDetailAddVo.getRemark() );
        Integer insertCount;
        try {
            insertCount = assetTypeDetailMapper.insert( assetTypeDetailEntity );
        } catch ( Exception e ) {
            LOGGER.error( "【AssetTypeDetailService】【addAssetTypeDetail】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        if ( insertCount > 0 ) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean updateAssetTypeDetail(AssetTypeDetailUpdateVO assetTypeDetailUpdateVo) throws BaseException {
        AssetTypeDetailEntity assetTypeDetailEntity = new AssetTypeDetailEntity( assetTypeDetailUpdateVo.getTypeDetailId(),
                assetTypeDetailUpdateVo.getTypeDetailName(), assetTypeDetailUpdateVo.getRemark() );
        Integer updateCount;
        try {
            updateCount = assetTypeDetailMapper.updateBySelective( assetTypeDetailEntity );
        } catch ( Exception e ) {
            LOGGER.error( "【AssetTypeDetailService】【updateAssetTypeDetail】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        if ( updateCount > 0 ) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean removeAssetTypeDetail(AssetTypeDetailDeleteVO assetTypeDetailDeleteVo) throws BaseException {
        AssetTypeDetailEntity assetTypeDetailEntity = new AssetTypeDetailEntity( assetTypeDetailDeleteVo.getTypeDetailId() );
        assetTypeDetailEntity.setDeleteFlag( assetTypeDetailDeleteVo.getDeleteFlag() );
        assetTypeDetailEntity.setStatus( assetTypeDetailDeleteVo.getStatus() );
        Integer updateCount;
        try {
            updateCount = assetTypeDetailMapper.updateBySelective( assetTypeDetailEntity );
        } catch ( Exception e ) {
            LOGGER.error( "【AssetTypeDetailService】【removeAssetTypeDetail】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        if ( updateCount > 0 ) {
            return true;
        }
        return false;
    }

    @Override
    public AssetTypeDetailListBO assetTypeDetailList(AssetTypeDetailListVO assetTypeDetailListVo) throws BaseException {
        assetTypeDetailListVo.calculateBeginIndex();
        try {
            List<AssetTypeDetailListModel> assetTypeDetailList = assetTypeDetailMapper.selectAssetTypeDetailListByPage(assetTypeDetailListVo);
            Integer totalRecorders = assetTypeDetailMapper.countAssetTypeDetailListByPage(assetTypeDetailListVo);
            AssetTypeDetailListBO responseBo = new AssetTypeDetailListBO( assetTypeDetailList );
            responseBo.setTotalRecorders( totalRecorders );
            responseBo.setTotalPages( PageUtils.calculateTotalPages(totalRecorders, assetTypeDetailListVo.getPageRecorders()) );
            return responseBo;
        } catch ( Exception e ) {
            LOGGER.error( "【AssetTypeDetailService】【assetTypeDetailList】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
    }

    @Override
    public AssetTypeDetailInfoBO assetTypeDetailInfo(Integer typeDetailId) throws BaseException {
        AssetTypeDetailEntity assetTypeDetailEntity = assetTypeDetailMapper.selectByPrimaryKey( typeDetailId );
        return new AssetTypeDetailInfoBO( assetTypeDetailEntity.getTypeDetailId(), assetTypeDetailEntity.getTypeDetailName(),
                assetTypeDetailEntity.getTypeId(), assetTypeDetailEntity.getRemark() );
    }

    @Override
    public AssetTypeDetailComboBoxBO comboBox(Integer typeId) throws BaseException {
        List<AssetTypeDetailComboBoxModel> typeDetailList = assetTypeDetailMapper.selectByComboBox( typeId );
        return new AssetTypeDetailComboBoxBO( typeDetailList );
    }
}
