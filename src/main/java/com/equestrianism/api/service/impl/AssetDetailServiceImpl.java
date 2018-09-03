package com.equestrianism.api.service.impl;

import com.equestrianism.api.constants.CodeEnum;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.PageUtils;
import com.equestrianism.api.dao.AssetDetailMapper;
import com.equestrianism.api.model.bo.AssetDetailListBO;
import com.equestrianism.api.model.bo.AssetInfoListBO;
import com.equestrianism.api.model.model.AssetDetailListModel;
import com.equestrianism.api.model.model.AssetInfoListModel;
import com.equestrianism.api.model.vo.asset_detail.AssetDetailListVO;
import com.equestrianism.api.service.AssetDetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Iceman
 * 2018/9/3
 */
@Service( "assetDetailService" )
public class AssetDetailServiceImpl implements AssetDetailService {

    private static final Logger LOGGER = LoggerFactory.getLogger( AssetDetailServiceImpl.class );

    @Autowired
    private AssetDetailMapper assetDetailMapper;

    @Override
    public AssetDetailListBO assetDetailList( AssetDetailListVO assetDetailListVo ) {
        assetDetailListVo.calculateBeginIndex();
        try {
            List<AssetDetailListModel> assetDetailList = assetDetailMapper.selectAssetDetailListByPage( assetDetailListVo );
            Integer totalRecorders = assetDetailMapper.countAssetDetailListByPage( assetDetailListVo );
            AssetDetailListBO responseBo = new AssetDetailListBO( assetDetailList );
            responseBo.setTotalRecorders( totalRecorders );
            responseBo.setTotalPages( PageUtils.calculateTotalPages( totalRecorders, assetDetailListVo.getPageRecorders() ) );
            return responseBo;
        } catch ( Exception e ) {
            LOGGER.error( "【AssetDetailService】【assetDetailList】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
    }

    @Override
    public Boolean scrap( String assetDetailId ) {
        // update asset_detail.scrap_type

        // update asset_info.inventory
        return null;
    }
}
