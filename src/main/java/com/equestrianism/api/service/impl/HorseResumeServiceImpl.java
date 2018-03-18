package com.equestrianism.api.service.impl;

import com.equestrianism.api.constants.CodeEnum;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.PageUtils;
import com.equestrianism.api.dao.*;
import com.equestrianism.api.model.bo.*;
import com.equestrianism.api.model.model.HorseResumeListModel;
import com.equestrianism.api.model.model.HostInfoListModel;
import com.equestrianism.api.model.model.horse_resume.*;
import com.equestrianism.api.model.vo.horse_resume.HorseResumeDetailVO;
import com.equestrianism.api.model.vo.horse_resume.HorseResumeListVO;
import com.equestrianism.api.service.HorseResumeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Chenzq on 2018/3/18.
 */
@Service( "horseResumeService" )
public class HorseResumeServiceImpl implements HorseResumeService {

    private static final Logger LOGGER = LoggerFactory.getLogger(HorseResumeServiceImpl.class);

    @Autowired
    private HorseInfoMapper horseInfoMapper;

    @Autowired
    private HostInfoMapper hostInfoMapper;

    @Autowired
    private FeederInfoMapper feederInfoMapper;

    @Autowired
    private TreatmentCaseInfoMapper treatmentCaseInfoMapper;

    @Autowired
    private HorsePrizeInfoMapper horsePrizeInfoMapper;

    @Autowired
    private VaccinationInfoMapper vaccinationInfoMapper;

    @Autowired
    private BrigandineInfoMapper brigandineInfoMapper;

    @Autowired
    private ContusionTeethInfoMapper contusionTeethInfoMapper;

    @Override
    public HorseResumeListBO horseResumeList(HorseResumeListVO horseResumeListVo) throws BaseException {
        horseResumeListVo.calculateBeginIndex();
        try {
            List<HorseResumeListModel> horseResumeList = horseInfoMapper.selectHorseResumeListByPage(horseResumeListVo);
            Integer totalRecorders = horseInfoMapper.countHorseResumeListByPage(horseResumeListVo);
            List<String> horseIdList = horseInfoMapper.selectHorseIdList( horseResumeListVo );
            HorseResumeListBO responseBo = new HorseResumeListBO( horseResumeList );
            responseBo.setHorseIdList( horseIdList );
            responseBo.setTotalRecorders( totalRecorders );
            responseBo.setTotalPages( PageUtils.calculateTotalPages(totalRecorders, horseResumeListVo.getPageRecorders()) );
            return responseBo;
        } catch ( Exception e ) {
            LOGGER.error( "【HorseResumeService】【horseResumeList】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
    }

    @Override
    public HorseResumeDetailBO horseResumeDetail(HorseResumeDetailVO horseResumeDetailVo) throws BaseException {
        HorseInfoDetailBO horseInfoDetailBo = horseInfoMapper.selectHorseInfoByDetail(horseResumeDetailVo.getHorseId());
        horseInfoDetailBo.setForeImage( new byte[0] );
        horseInfoDetailBo.setHindImage( new byte[0] );
        horseInfoDetailBo.setLeftImage( new byte[0] );
        horseInfoDetailBo.setLipImage( new byte[0] );
        horseInfoDetailBo.setRightImage( new byte[0] );
        horseInfoDetailBo.setNeckImage( new byte[0] );
        horseInfoDetailBo.setUpperEyelinerImage( new byte[0] );
        HostInfoDetailBO hostInfoDetailBo = hostInfoMapper.selectByResume( horseResumeDetailVo.getHorseId() );
        FeederInfoDetailBO feederInfoDetailBo = feederInfoMapper.selectByResume( horseResumeDetailVo.getHorseId() );
        List<HorseResumeTreatmentCaseModel> treatmentCaseList = treatmentCaseInfoMapper.selectByResume( horseResumeDetailVo.getHorseId() );
        List<HorseResumePrizeModel> prizeList = horsePrizeInfoMapper.selectByResume( horseResumeDetailVo.getHorseId() );
        List<HorseResumeVaccinationModel> vaccinationList = vaccinationInfoMapper.selectByResume( horseResumeDetailVo.getHorseId() );
        List<HorseResumeBrigandineModel> brigandineList = brigandineInfoMapper.selectByResume( horseResumeDetailVo.getHorseId() );
        List<HorseResumeContusionTeethModel> contusionTeethList = contusionTeethInfoMapper.selectByResume( horseResumeDetailVo.getHorseId() );
        HorseResumeDetailBO responseBo = new HorseResumeDetailBO();
        responseBo.setHorseInfo( horseInfoDetailBo );
        responseBo.setHostInfo( hostInfoDetailBo );
        responseBo.setFeederInfo( feederInfoDetailBo );
        responseBo.setTreatmentCaseList( treatmentCaseList );
        responseBo.setPrizeList( prizeList );
        responseBo.setVaccinationList( vaccinationList );
        responseBo.setBrigandineList( brigandineList );
        responseBo.setContusionTeethList( contusionTeethList );
        return responseBo;
    }
}
