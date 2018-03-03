package com.equestrianism.api.dao;

import com.equestrianism.api.model.model.DictionaryInfoListModel;
import com.equestrianism.api.model.po.DictionaryInfoEntity;
import com.equestrianism.api.model.vo.dictionary_info.DictionaryInfoListVO;
import com.equestrianism.api.model.vo.dictionary_info.DictionaryInfoUpdateVO;

import java.util.List;

/**
 * Iceman
 * 2018/2/23
 */
public interface DictionaryInfoMapper {

    Integer insert( DictionaryInfoEntity dictionaryInfoEntity );

    Integer updateBySelective( DictionaryInfoEntity dictionaryInfoEntity );

    List<DictionaryInfoListModel> selectDictionaryInfoListByPage( DictionaryInfoListVO dictionaryInfoListVo );

    Integer countDictionaryInfoListByPage( DictionaryInfoListVO dictionaryInfoListVo );

    DictionaryInfoEntity selectByPrimaryKey( Integer dictionaryId );

    List<DictionaryInfoEntity> selectAll();

}
