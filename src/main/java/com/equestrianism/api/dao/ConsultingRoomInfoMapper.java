package com.equestrianism.api.dao;

import com.equestrianism.api.model.model.ConsultingRoomInfoListModel;
import com.equestrianism.api.model.po.ConsultingRoomInfoEntity;
import com.equestrianism.api.model.vo.consulting_room_info.ConsultingRoomInfoListVO;

import java.util.List;

/**
 * Iceman
 * 2018/3/8
 */
public interface ConsultingRoomInfoMapper {

    Integer insert( ConsultingRoomInfoEntity consultingRoomInfoEntity );

    Integer updateBySelective( ConsultingRoomInfoEntity consultingRoomInfoEntity );

    List<ConsultingRoomInfoListModel> selectConsultingRoomListByPage( ConsultingRoomInfoListVO consultingRoomInfoListVo );

    Integer countConsultingRoomListByPage( ConsultingRoomInfoListVO consultingRoomInfoListVo );

    List<ConsultingRoomInfoEntity> selectConsultingRoomListByComboBox();

    ConsultingRoomInfoEntity selectByPrimaryKey( String consultingRoomId );

}
