package com.equestrianism.api.dao;

import com.equestrianism.api.model.bo.HorseInfoDetailBO;
import com.equestrianism.api.model.model.HorseInfoComboBoxModel;
import com.equestrianism.api.model.model.HorseInfoListModel;
import com.equestrianism.api.model.model.HorseResumeListModel;
import com.equestrianism.api.model.po.HorseInfoEntity;
import com.equestrianism.api.model.vo.horse_info.HorseInfoListVO;
import com.equestrianism.api.model.vo.horse_resume.HorseResumeListVO;

import java.util.List;

/**
 * Iceman
 * 2018/1/26
 */
public interface HorseInfoMapper {

    Integer insert( HorseInfoEntity horseInfoEntity );

    Integer updateBySelective( HorseInfoEntity horseInfoEntity );

    List<HorseInfoListModel> selectHorseListByPage( HorseInfoListVO horseInfoListVo );

    Integer countHorseListByPage( HorseInfoListVO horseInfoListVo );

    HorseInfoDetailBO selectHorseInfoByDetail( String horseId );

    List<HorseInfoComboBoxModel> selectHorseListByComboBox();

    List<HorseResumeListModel> selectHorseResumeListByPage(HorseResumeListVO horseResumeListVo);

    Integer countHorseResumeListByPage(HorseResumeListVO horseResumeListVo);

    List<String> selectHorseIdList(HorseResumeListVO horseResumeListVo);
}
