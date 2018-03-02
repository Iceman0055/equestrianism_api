package com.equestrianism.api.service;

import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.model.bo.DictionaryInfoDetailBO;
import com.equestrianism.api.model.bo.DictionaryInfoListBO;
import com.equestrianism.api.model.vo.dictionary_info.DictionaryInfoAddVO;
import com.equestrianism.api.model.vo.dictionary_info.DictionaryInfoDeleteVO;
import com.equestrianism.api.model.vo.dictionary_info.DictionaryInfoListVO;
import com.equestrianism.api.model.vo.dictionary_info.DictionaryInfoUpdateVO;

/**
 * Iceman
 * 2018/2/24
 */
public interface DictionaryInfoService {

    Boolean addDictionaryInfo( DictionaryInfoAddVO dictionaryInfoAddVo ) throws BaseException;

    Boolean updateDictionaryInfo( DictionaryInfoUpdateVO dictionaryInfoUpdateVo ) throws BaseException;

    Boolean removeDictionaryInfo( DictionaryInfoDeleteVO dictionaryInfoDeleteVo ) throws BaseException;

    DictionaryInfoListBO dictionaryInfoList( DictionaryInfoListVO dictionaryInfoListVo ) throws BaseException;

    DictionaryInfoDetailBO dictionaryInfoDetail( Integer dictionaryId ) throws BaseException;

}
