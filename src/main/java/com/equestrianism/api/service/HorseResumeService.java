package com.equestrianism.api.service;

import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.model.bo.HorseResumeListBO;
import com.equestrianism.api.model.vo.horse_resume.HorseResumeListVO;

/**
 * Created by Chenzq on 2018/3/18.
 */
public interface HorseResumeService {

    HorseResumeListBO horseResumeList(HorseResumeListVO horseResumeListVo) throws BaseException;

}
