package com.equestrianism.api.service.impl;

import com.equestrianism.api.constants.CodeEnum;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.dao.DictionaryInfoMapper;
import com.equestrianism.api.model.po.DictionaryInfoEntity;
import com.equestrianism.api.model.vo.dictionary_info.DictionaryInfoAddVO;
import com.equestrianism.api.model.vo.dictionary_info.DictionaryInfoUpdateVO;
import com.equestrianism.api.service.DictionaryInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Iceman
 * 2018/2/24
 */
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
        Integer updateCount;
        try {
            updateCount = dictionaryInfoMapper.updateBySelective( dictionaryInfoUpdateVo );
        } catch ( Exception e ) {
            LOGGER.error( "【DictionaryInfoService】【updateDictionaryInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        if ( updateCount > 0 ) {
            return true;
        }
        return false;
    }


}
