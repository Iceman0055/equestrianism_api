package com.equestrianism.api.service;

import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.model.bo.AuthLoginBO;
import com.equestrianism.api.model.vo.AuthLoginVO;

/**
 * Created by Chenzq on 2018/3/21.
 */
public interface RegisterService {

    AuthLoginBO login(AuthLoginVO authLoginVo) throws BaseException;

}
