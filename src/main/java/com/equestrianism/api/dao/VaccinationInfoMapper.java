package com.equestrianism.api.dao;

import com.equestrianism.api.model.model.VaccinationInfoListModel;
import com.equestrianism.api.model.model.horse_resume.HorseResumeVaccinationModel;
import com.equestrianism.api.model.po.VaccinationInfoEntity;
import com.equestrianism.api.model.vo.vaccination_info.VaccinationInfoListVO;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/10.
 */
public interface VaccinationInfoMapper {

    Integer insert( VaccinationInfoEntity vaccinationInfoEntity );

    Integer updateBySelective( VaccinationInfoEntity vaccinationInfoEntity );

    Integer countVaccinationInfoListByPage(VaccinationInfoListVO vaccinationInfoListVo);

    List<VaccinationInfoListModel> selectVaccinationInfoListByPage(VaccinationInfoListVO vaccinationInfoListVo);

    VaccinationInfoEntity selectByPrimaryKey(String vaccinationId);

    List<HorseResumeVaccinationModel> selectByResume(String horseId);
}
