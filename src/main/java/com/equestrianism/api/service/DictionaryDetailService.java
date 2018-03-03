package com.equestrianism.api.service;

import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.model.bo.DictionaryDetailInfoBO;
import com.equestrianism.api.model.bo.DictionaryDetailListBO;
import com.equestrianism.api.model.po.DictionaryDetailEntity;
import com.equestrianism.api.model.vo.dictionary_detail.DictionaryDetailAddVO;
import com.equestrianism.api.model.vo.dictionary_detail.DictionaryDetailDeleteVO;
import com.equestrianism.api.model.vo.dictionary_detail.DictionaryDetailListVO;
import com.equestrianism.api.model.vo.dictionary_detail.DictionaryDetailUpdateVO;

import java.util.List;

/**
 * Iceman
 * 2018/2/28
 */
public interface DictionaryDetailService {

    Boolean addDictionaryDetail( DictionaryDetailAddVO dictionaryDetailAddVo ) throws BaseException;

    Boolean updateDictionaryDetail( DictionaryDetailUpdateVO dictionaryDetailUpdateVo ) throws BaseException;

    Boolean removeDictionaryDetail( DictionaryDetailDeleteVO dictionaryDetailDeleteVo ) throws BaseException;

    DictionaryDetailListBO dictionaryDetailList( DictionaryDetailListVO dictionaryDetailListVo ) throws BaseException;

    DictionaryDetailInfoBO dictionaryDetailInfo( Integer dictionaryDetailId ) throws BaseException;

    List<DictionaryDetailEntity> getDictionaryDetailByDictionaryId( Integer dictionaryId ) throws BaseException;

}
