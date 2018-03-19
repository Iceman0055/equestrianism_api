package com.equestrianism.api.service;

import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.model.bo.MenuInfoListBO;

/**
 * Created by Chenzq on 2018/3/20.
 */
public interface MenuInfoService {

    MenuInfoListBO menuList() throws BaseException;

}
