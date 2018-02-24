package com.equestrianism.api.service;

import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.model.vo.dictionary_info.DictionaryInfoAddVO;
import com.equestrianism.api.model.vo.dictionary_info.DictionaryInfoUpdateVO;

/**
 * Iceman
 * 2018/2/24
 */
public interface DictionaryInfoService {

    Boolean addDictionaryInfo( DictionaryInfoAddVO dictionaryInfoAddVo ) throws BaseException;

    Boolean updateDictionaryInfo( DictionaryInfoUpdateVO dictionaryInfoUpdateVo ) throws BaseException;

}
