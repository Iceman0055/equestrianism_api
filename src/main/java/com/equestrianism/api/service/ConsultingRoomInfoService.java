package com.equestrianism.api.service;

import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.model.bo.ConsultingRoomInfoComboBoxBO;
import com.equestrianism.api.model.bo.ConsultingRoomInfoDetailBO;
import com.equestrianism.api.model.bo.ConsultingRoomInfoListBO;
import com.equestrianism.api.model.vo.brigandine_info.BrigandineInfoAddVO;
import com.equestrianism.api.model.vo.consulting_room_info.*;

/**
 * Iceman
 * 2018/3/8
 */
public interface ConsultingRoomInfoService {

    Boolean addConsultingRoomInfo( ConsultingRoomInfoAddVO consultingRoomInfoAddVo ) throws BaseException;

    Boolean updateConsultingRoomInfo( ConsultingRoomInfoUpdateVO consultingRoomInfoUpdateVo ) throws BaseException;

    Boolean removeConsultingRoomInfo( ConsultingRoomInfoDeleteVO consultingRoomInfoDeleteVo ) throws BaseException;

    ConsultingRoomInfoListBO consultingRoomInfoList( ConsultingRoomInfoListVO consultingRoomInfoListVo ) throws BaseException;

    ConsultingRoomInfoComboBoxBO comboBox() throws BaseException;

    ConsultingRoomInfoDetailBO consultingRoomInfoDetail( ConsultingRoomInfoDetailVO consultingRoomInfoDetailVo ) throws BaseException;

}
