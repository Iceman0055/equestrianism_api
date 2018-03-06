package com.equestrianism.api.service.impl;

import com.equestrianism.api.constants.CodeEnum;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.model.po.FeederInfoEntity;
import com.equestrianism.api.model.po.HorsePrizeInfoEntity;
import com.equestrianism.api.model.vo.horse_prize_info.HorsePrizeInfoAddVO;
import com.equestrianism.api.service.HorsePrizeInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Iceman
 * 2018/3/6
 */
@Service( "horsePrizeInfoService" )
public class HorsePrizeInfoServiceImpl implements HorsePrizeInfoService {

    private static final Logger LOGGER = LoggerFactory.getLogger( HorsePrizeInfoServiceImpl.class );

    @Override
    public Boolean addHorsePrizeInfo( HorsePrizeInfoAddVO horsePrizeInfoAddVo ) throws BaseException {
        try {
            HorsePrizeInfoEntity horsePrizeInfoEntity = new HorsePrizeInfoEntity();
            FeederInfoEntity feederInfoEntity = new FeederInfoEntity( feederInfoAddVO.getFeederName(), feederInfoAddVO.getSex(),
                    feederInfoAddVO.getSkillDesc(), feederInfoAddVO.getHorseId(), feederInfoAddVO.getHireDate(),
                    feederInfoAddVO.getIdCardImage() );
            if ( feederInfoAddVO.getIdCardImage() == null ) {
                feederInfoEntity.setIdCardImage( new byte[0] );
            }
            Integer insertCount = feederInfoMapper.insert( feederInfoEntity );
            if ( insertCount > 0 ) {
                return true;
            }
        } catch ( Exception e ) {
            LOGGER.error( "【HorsePrizeInfoService】【addHorsePrizeInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        return false;
    }
}
