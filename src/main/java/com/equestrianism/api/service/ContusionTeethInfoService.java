package com.equestrianism.api.service;

import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.model.bo.ContusionTeethInfoDetailBO;
import com.equestrianism.api.model.bo.ContusionTeethInfoListBO;
import com.equestrianism.api.model.vo.contusion_teeth_info.*;

/**
 * Created by Chenzq on 2018/3/9.
 */
public interface ContusionTeethInfoService {

    Boolean addContusionTeethInfo( ContusionTeethInfoAddVO contusionTeethInfoAddVo ) throws BaseException;

    Boolean updateContusionTeethInfo( ContusionTeethInfoUpdateVO contusionTeethInfoUpdateVo ) throws BaseException;

    Boolean removeContusionTeethInfo( ContusionTeethInfoDeleteVO contusionTeethInfoDeleteVo ) throws BaseException;

    ContusionTeethInfoListBO contusionTeethInfoList(ContusionTeethInfoListVO contusionTeethInfoListVo) throws BaseException;

    ContusionTeethInfoDetailBO contusionTeethInfoDetail(ContusionTeethInfoDetailVO contusionTeethInfoDetailVo) throws BaseException;

}
