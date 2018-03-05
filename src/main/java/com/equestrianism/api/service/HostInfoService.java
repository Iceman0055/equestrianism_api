package com.equestrianism.api.service;

import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.model.bo.HostInfoDetailBO;
import com.equestrianism.api.model.bo.HostInfoListBO;
import com.equestrianism.api.model.bo.RoleInfoListBO;
import com.equestrianism.api.model.vo.host_info.*;

/**
 * Created by Chenzq on 2018/3/4.
 */
public interface HostInfoService {

    Boolean addHostInfo( HostInfoAddVO hostInfoAddVo ) throws BaseException;

    Boolean updateHostInfo( HostInfoUpdateVO hostInfoUpdateVo ) throws BaseException;

    Boolean removeHostInfo( HostInfoDeleteVO hostInfoDeleteVo ) throws BaseException;

    HostInfoListBO hostInfoList( HostInfoListVO hostInfoListVo ) throws BaseException;

    HostInfoDetailBO hostDetail( HostInfoDetailVO hostInfoDetailVo ) throws BaseException;
}
