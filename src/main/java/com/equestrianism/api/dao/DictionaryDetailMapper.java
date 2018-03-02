package com.equestrianism.api.dao;

import com.equestrianism.api.model.model.DictionaryDetailListModel;
import com.equestrianism.api.model.po.DictionaryDetailEntity;
import com.equestrianism.api.model.vo.dictionary_detail.DictionaryDetailListVO;

import java.util.List;

/**
 * Iceman
 * 2018/2/23
 */
public interface DictionaryDetailMapper {

    Integer insert( DictionaryDetailEntity dictionaryDetailEntity );

    Integer updateBySelective( DictionaryDetailEntity dictionaryDetailEntity );

    List<DictionaryDetailListModel> selectDictionaryDetailListByPage( DictionaryDetailListVO dictionaryDetailListVo );

    Integer countDictionaryDetailListByPage( DictionaryDetailListVO dictionaryDetailListVo );

    DictionaryDetailEntity selectByPrimaryKey( Integer dictionaryDetailId );

}
