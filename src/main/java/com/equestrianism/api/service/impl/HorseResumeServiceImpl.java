package com.equestrianism.api.service.impl;

import com.equestrianism.api.constants.CodeEnum;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.PageUtils;
import com.equestrianism.api.dao.HorseInfoMapper;
import com.equestrianism.api.model.bo.HorseResumeListBO;
import com.equestrianism.api.model.bo.HostInfoListBO;
import com.equestrianism.api.model.model.HorseResumeListModel;
import com.equestrianism.api.model.model.HostInfoListModel;
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
}
