package com.equestrianism.api.service.impl;

import com.equestrianism.api.constants.CodeEnum;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.PageUtils;
import com.equestrianism.api.dao.DictionaryDetailMapper;
import com.equestrianism.api.model.bo.DictionaryDetailInfoBO;
import com.equestrianism.api.model.bo.DictionaryDetailListBO;
import com.equestrianism.api.model.bo.DictionaryInfoListBO;
import com.equestrianism.api.model.model.DictionaryDetailListModel;
import com.equestrianism.api.model.model.DictionaryInfoListModel;
import com.equestrianism.api.model.po.DictionaryDetailEntity;
import com.equestrianism.api.model.vo.dictionary_detail.DictionaryDetailAddVO;
import com.equestrianism.api.model.vo.dictionary_detail.DictionaryDetailDeleteVO;
import com.equestrianism.api.model.vo.dictionary_detail.DictionaryDetailListVO;
import com.equestrianism.api.model.vo.dictionary_detail.DictionaryDetailUpdateVO;
import com.equestrianism.api.service.DictionaryDetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Iceman
 * 2018/2/28
 */
@Service( "dictionaryDetail" )
public class DictionaryDetailServiceImpl implements DictionaryDetailService {

    private static final Logger LOGGER = LoggerFactory.getLogger( DictionaryDetailServiceImpl.class );

    @Autowired
    private DictionaryDetailMapper dictionaryDetailMapper;

    @Override
    public Boolean addDictionaryDetail( DictionaryDetailAddVO dictionaryDetailAddVo ) throws BaseException {
        DictionaryDetailEntity dictionaryDetailEntity = new DictionaryDetailEntity(
                dictionaryDetailAddVo.getItemCode(), dictionaryDetailAddVo.getItemValue(), dictionaryDetailAddVo.getDictionaryId() );
        Integer insertCount;
        try {
            insertCount = dictionaryDetailMapper.insert( dictionaryDetailEntity );
        } catch ( Exception e ) {
            LOGGER.error( "【DictionaryDetailService】【addDictionaryDetail】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        if ( insertCount > 0 ) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean updateDictionaryDetail( DictionaryDetailUpdateVO dictionaryDetailUpdateVo ) throws BaseException {
        DictionaryDetailEntity dictionaryDetailEntity = new DictionaryDetailEntity(
                dictionaryDetailUpdateVo.getItemCode(), dictionaryDetailUpdateVo.getItemValue(), dictionaryDetailUpdateVo.getDictionaryId() );
        dictionaryDetailEntity.setDictionaryDetailId( dictionaryDetailUpdateVo.getDictionaryDetailId() );
        Integer updateCount;
        try {
            updateCount = dictionaryDetailMapper.updateBySelective( dictionaryDetailEntity );
        } catch ( Exception e ) {
            LOGGER.error( "【DictionaryDetailService】【updateDictionaryDetail】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        if ( updateCount > 0 ) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean removeDictionaryDetail( DictionaryDetailDeleteVO dictionaryDetailDeleteVo ) throws BaseException {
        DictionaryDetailEntity dictionaryDetailEntity = new DictionaryDetailEntity( dictionaryDetailDeleteVo.getDictionaryDetailId() );
        dictionaryDetailEntity.setDeleteFlag( dictionaryDetailDeleteVo.getDeleteFlag() );
        dictionaryDetailEntity.setStatus( dictionaryDetailDeleteVo.getStatus() );
        Integer updateCount;
        try {
            updateCount = dictionaryDetailMapper.updateBySelective( dictionaryDetailEntity );
        } catch ( Exception e ) {
            LOGGER.error( "【DictionaryDetailService】【removeDictionaryDetail】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        if ( updateCount > 0 ) {
            return true;
        }
        return false;
    }

    @Override
    public DictionaryDetailListBO dictionaryDetailList( DictionaryDetailListVO dictionaryDetailListVo ) throws BaseException {
        dictionaryDetailListVo.calculateBeginIndex();
        try {
            List<DictionaryDetailListModel> dictionaryDetailList = dictionaryDetailMapper.selectDictionaryDetailListByPage( dictionaryDetailListVo );
            Integer totalRecorders = dictionaryDetailMapper.countDictionaryDetailListByPage( dictionaryDetailListVo );
            DictionaryDetailListBO responseBo = new DictionaryDetailListBO( dictionaryDetailList );
            responseBo.setTotalRecorders( totalRecorders );
            responseBo.setTotalPages( PageUtils.calculateTotalPages( totalRecorders, dictionaryDetailListVo.getPageRecorders() ) );
            return responseBo;
        } catch ( Exception e ) {
            LOGGER.error( "【DictionaryDetailService】【dictionaryDetailList】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
    }

    @Override
    public DictionaryDetailInfoBO dictionaryDetailInfo( Integer dictionaryDetailId ) throws BaseException {
        DictionaryDetailEntity dictionaryDetailEntity = dictionaryDetailMapper.selectByPrimaryKey( dictionaryDetailId );
        if ( dictionaryDetailEntity == null ) {
            return null;
        }
        DictionaryDetailInfoBO dictionaryDetailInfoBo = new DictionaryDetailInfoBO( dictionaryDetailEntity.getDictionaryDetailId(),
                dictionaryDetailEntity.getItemCode(), dictionaryDetailEntity.getItemValue(), dictionaryDetailEntity.getDictionaryId() );
        return dictionaryDetailInfoBo;
    }


}
