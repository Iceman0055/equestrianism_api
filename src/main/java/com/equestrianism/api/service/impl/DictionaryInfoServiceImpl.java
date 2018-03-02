package com.equestrianism.api.service.impl;

import com.equestrianism.api.constants.CodeEnum;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.PageUtils;
import com.equestrianism.api.dao.DictionaryInfoMapper;
import com.equestrianism.api.model.bo.DictionaryInfoDetailBO;
import com.equestrianism.api.model.bo.DictionaryInfoListBO;
import com.equestrianism.api.model.model.DictionaryInfoListModel;
import com.equestrianism.api.model.po.DictionaryInfoEntity;
import com.equestrianism.api.model.vo.dictionary_info.DictionaryInfoAddVO;
import com.equestrianism.api.model.vo.dictionary_info.DictionaryInfoDeleteVO;
import com.equestrianism.api.model.vo.dictionary_info.DictionaryInfoListVO;
import com.equestrianism.api.model.vo.dictionary_info.DictionaryInfoUpdateVO;
import com.equestrianism.api.service.DictionaryInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Iceman
 * 2018/2/24
 */
@Service( "dictionaryInfoService" )
public class DictionaryInfoServiceImpl implements DictionaryInfoService {

    private static final Logger LOGGER = LoggerFactory.getLogger( DictionaryInfoServiceImpl.class );

    @Autowired
    private DictionaryInfoMapper dictionaryInfoMapper;

    @Override
    public Boolean addDictionaryInfo( DictionaryInfoAddVO dictionaryInfoAddVo ) throws BaseException {
        DictionaryInfoEntity dictionaryInfoEntity = new DictionaryInfoEntity( dictionaryInfoAddVo.getTypeCode(),
                dictionaryInfoAddVo.getTypeName(), dictionaryInfoAddVo.getSort(), dictionaryInfoAddVo.getRemark() );
        Integer insertCount;
        try {
            insertCount = dictionaryInfoMapper.insert( dictionaryInfoEntity );
        } catch ( Exception e ) {
            LOGGER.error( "【DictionaryInfoService】【addDictionaryInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        if ( insertCount > 0 ) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean updateDictionaryInfo( DictionaryInfoUpdateVO dictionaryInfoUpdateVo ) throws BaseException {
        DictionaryInfoEntity dictionaryInfoEntity = new DictionaryInfoEntity( dictionaryInfoUpdateVo.getTypeCode(), dictionaryInfoUpdateVo.getTypeName(), dictionaryInfoUpdateVo.getSort(), dictionaryInfoUpdateVo.getRemark() );
        dictionaryInfoEntity.setDictionaryId( dictionaryInfoUpdateVo.getDictionaryId() );
        Integer updateCount;
        try {
            updateCount = dictionaryInfoMapper.updateBySelective( dictionaryInfoEntity );
        } catch ( Exception e ) {
            LOGGER.error( "【DictionaryInfoService】【updateDictionaryInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        if ( updateCount > 0 ) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean removeDictionaryInfo( DictionaryInfoDeleteVO dictionaryInfoDeleteVo ) throws BaseException {
        DictionaryInfoEntity dictionaryInfoEntity = new DictionaryInfoEntity( dictionaryInfoDeleteVo.getDictionaryId() );
        dictionaryInfoEntity.setStatus( dictionaryInfoDeleteVo.getStatus() );
        dictionaryInfoEntity.setDeleteFlag( dictionaryInfoDeleteVo.getDeleteFlag() );
        Integer updateCount;
        try {
            updateCount = dictionaryInfoMapper.updateBySelective( dictionaryInfoEntity );
        } catch ( Exception e ) {
            LOGGER.error( "【DictionaryInfoService】【removeDictionaryInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        if ( updateCount > 0 ) {
            return true;
        }
        return false;
    }

    @Override
    public DictionaryInfoListBO dictionaryInfoList( DictionaryInfoListVO dictionaryInfoListVo ) throws BaseException {
        dictionaryInfoListVo.calculateBeginIndex();
        try {
            List<DictionaryInfoListModel> dictionaryInfoList = dictionaryInfoMapper.selectDictionaryInfoListByPage( dictionaryInfoListVo );
            Integer totalRecorders = dictionaryInfoMapper.countDictionaryInfoListByPage( dictionaryInfoListVo );
            DictionaryInfoListBO responseBo = new DictionaryInfoListBO( dictionaryInfoList );
            responseBo.setTotalRecorders( totalRecorders );
            responseBo.setTotalPages( PageUtils.calculateTotalPages( totalRecorders, dictionaryInfoListVo.getPageRecorders() ) );
            return responseBo;
        } catch ( Exception e ) {
            LOGGER.error( "【DictionaryInfoService】【dictionaryInfoList】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
    }

    @Override
    public DictionaryInfoDetailBO dictionaryInfoDetail( Integer dictionaryId ) throws BaseException {
        DictionaryInfoEntity dictionaryInfoEntity = dictionaryInfoMapper.selectByPrimaryKey( dictionaryId );
        if ( dictionaryInfoEntity == null ) {
            return null;
        }
        DictionaryInfoDetailBO dictionaryInfoDetailBo = new DictionaryInfoDetailBO( dictionaryInfoEntity.getDictionaryId(),
                dictionaryInfoEntity.getTypeCode(), dictionaryInfoEntity.getTypeName(), dictionaryInfoEntity.getSort(),
                dictionaryInfoEntity.getRemark() );
        return dictionaryInfoDetailBo;
    }

}
