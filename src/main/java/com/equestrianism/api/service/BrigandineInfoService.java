package com.equestrianism.api.service;

import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.model.bo.BrigandineInfoDetailBO;
import com.equestrianism.api.model.bo.BrigandineInfoListBO;
import com.equestrianism.api.model.vo.brigandine_info.*;

/**
 * Created by Chenzq on 2018/3/9.
 */
public interface BrigandineInfoService {

    Boolean addBrigandineInfo( BrigandineInfoAddVO brigandineInfoAddVo ) throws BaseException;

    Boolean updateBrigandineInfo( BrigandineInfoUpdateVO brigandineInfoUpdateVo ) throws BaseException;

    Boolean removeBrigandineInfo(BrigandineInfoDeleteVO brigandineInfoDeleteVo) throws BaseException;

    BrigandineInfoListBO brigandineInfoList(BrigandineInfoListVO brigandineInfoListVo) throws BaseException;

    BrigandineInfoDetailBO brigandineInfoDetail(BrigandineInfoDetailVO brigandineInfoDetailVo) throws BaseException;

}
