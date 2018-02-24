package com.equestrianism.api.dao;

import com.equestrianism.api.model.po.DictionaryInfoEntity;
import com.equestrianism.api.model.vo.dictionary_info.DictionaryInfoUpdateVO;

import java.util.List;

/**
 * Iceman
 * 2018/2/23
 */
public interface DictionaryInfoMapper {

    Integer insert( DictionaryInfoEntity dictionaryInfoEntity );

    Integer updateBySelective( DictionaryInfoUpdateVO dictionaryInfoUpdateVo );

//    List<DictionaryInfoEntity> selectDictionaryInfoListByPage();

}
