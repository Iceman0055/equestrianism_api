package com.equestrianism.api.service.impl;

import com.equestrianism.api.model.po.HorseInfoEntity;
import com.equestrianism.api.model.vo.horse_info.HorseInfoAddVO;
import com.equestrianism.api.service.HorseInfoService;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by Chenzq on 2018/1/28.
 */
@Service( "horseInfoService" )
public class HorseInfoServiceImpl implements HorseInfoService {

    @Override
    public Boolean addHorseInfo( HorseInfoAddVO horseInfoAddVo ) throws IOException {
        HorseInfoEntity horseInfoEntity = new HorseInfoEntity( horseInfoAddVo.getPassportNumber(), horseInfoAddVo.getHorseName(),
                horseInfoAddVo.getUsedName(), horseInfoAddVo.getCountry(), horseInfoAddVo.getChangeDate(), horseInfoAddVo.getBirthday(),
                horseInfoAddVo.getHeight(), horseInfoAddVo.getSex(), horseInfoAddVo.getBarCode(), horseInfoAddVo.getCoatColour(),
                horseInfoAddVo.getHeadDesc(), horseInfoAddVo.getLeftForeDesc(), horseInfoAddVo.getRightForeDesc(), horseInfoAddVo.getLeftHindDesc(),
                horseInfoAddVo.getRightHindDesc(), horseInfoAddVo.getBodyDesc(), horseInfoAddVo.getRightImage(), horseInfoAddVo.getLeftImage(),
                horseInfoAddVo.getUpperEyelinerImage(), horseInfoAddVo.getForeImage(), horseInfoAddVo.getHindImage(), horseInfoAddVo.getNeckImage(),
                horseInfoAddVo.getLipImage() );
        return null;
    }

}
