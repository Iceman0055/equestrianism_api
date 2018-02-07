package com.equestrianism.api.service.impl;

import com.equestrianism.api.constants.CodeEnum;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.PageUtils;
import com.equestrianism.api.dao.HorseInfoMapper;
import com.equestrianism.api.model.bo.HorseInfoDetailBO;
import com.equestrianism.api.model.bo.HorseInfoListBO;
import com.equestrianism.api.model.bo.RoleInfoListBO;
import com.equestrianism.api.model.model.HorseInfoListModel;
import com.equestrianism.api.model.model.RoleInfoListModel;
import com.equestrianism.api.model.po.HorseInfoEntity;
import com.equestrianism.api.model.vo.horse_info.*;
import com.equestrianism.api.service.HorseInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * Created by Chenzq on 2018/1/28.
 */
@Service( "horseInfoService" )
public class HorseInfoServiceImpl implements HorseInfoService {

    private static final Logger LOGGER = LoggerFactory.getLogger( HorseInfoServiceImpl.class );

    @Autowired
    private HorseInfoMapper horseInfoMapper;

    @Override
    public Boolean addHorseInfo( HorseInfoAddVO horseInfoAddVo ) throws BaseException {
        HorseInfoEntity horseInfoEntity = null;
        try {
            horseInfoEntity = new HorseInfoEntity( horseInfoAddVo.getPassportNumber(), horseInfoAddVo.getHorseName(),
                    horseInfoAddVo.getUsedName(), horseInfoAddVo.getCountry(), horseInfoAddVo.getChangeDate(), horseInfoAddVo.getBirthday(),
                    horseInfoAddVo.getHeight(), horseInfoAddVo.getSex(), horseInfoAddVo.getBarCode(), horseInfoAddVo.getCoatColour(),
                    horseInfoAddVo.getHeadDesc(), horseInfoAddVo.getLeftForeDesc(), horseInfoAddVo.getRightForeDesc(), horseInfoAddVo.getLeftHindDesc(),
                    horseInfoAddVo.getRightHindDesc(), horseInfoAddVo.getBodyDesc(), horseInfoAddVo.getRightImage(), horseInfoAddVo.getLeftImage(),
                    horseInfoAddVo.getUpperEyelinerImage(), horseInfoAddVo.getForeImage(), horseInfoAddVo.getHindImage(), horseInfoAddVo.getNeckImage(),
                    horseInfoAddVo.getLipImage() );
            Integer insertCount = horseInfoMapper.insert( horseInfoEntity );
            if ( insertCount > 0 ) {
                return true;
            }
        } catch ( IOException e ) {
            LOGGER.error( "【HorseInfoService】【addHorseInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        return false;
    }

    @Override
    public Boolean updateHorseInfo( HorseInfoUpdateVO horseInfoUpdateVo ) throws BaseException {
        HorseInfoEntity horseInfoEntity = null;
        try {
            horseInfoEntity = new HorseInfoEntity( horseInfoUpdateVo.getHorseId(), horseInfoUpdateVo.getPassportNumber(),
                    horseInfoUpdateVo.getHorseName(), horseInfoUpdateVo.getUsedName(), horseInfoUpdateVo.getCountry(),
                    horseInfoUpdateVo.getChangeDate(), horseInfoUpdateVo.getBirthday(), horseInfoUpdateVo.getHeight(),
                    horseInfoUpdateVo.getSex(), horseInfoUpdateVo.getBarCode(), horseInfoUpdateVo.getCoatColour(),
                    horseInfoUpdateVo.getHeadDesc(), horseInfoUpdateVo.getLeftForeDesc(), horseInfoUpdateVo.getRightForeDesc(),
                    horseInfoUpdateVo.getLeftHindDesc(), horseInfoUpdateVo.getRightHindDesc(), horseInfoUpdateVo.getBodyDesc(),
                    horseInfoUpdateVo.getRightImage(), horseInfoUpdateVo.getLeftImage(), horseInfoUpdateVo.getUpperEyelinerImage(),
                    horseInfoUpdateVo.getForeImage(), horseInfoUpdateVo.getHindImage(), horseInfoUpdateVo.getNeckImage(),
                    horseInfoUpdateVo.getLipImage() );
            Integer updateCount = horseInfoMapper.updateBySelective( horseInfoEntity );
            if ( updateCount > 0 ) {
                return true;
            }
        } catch ( IOException e ) {
            LOGGER.error( "【HorseInfoService】【updateHorseInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        return false;
    }

    @Override
    public Boolean removeHorseInfo( HorseInfoDeleteVO horseInfoDeleteVo ) throws BaseException {
        HorseInfoEntity horseInfoEntity = new HorseInfoEntity( horseInfoDeleteVo.getHorseId() );
        horseInfoEntity.setDeleteFlag( horseInfoDeleteVo.getDeleteFlag() );
        horseInfoEntity.setStatus( horseInfoDeleteVo.getStatus() );
        try {
            Integer updateCount = horseInfoMapper.updateBySelective( horseInfoEntity );
            if ( updateCount > 0 ) {
                return true;
            }
        } catch ( Exception e ) {
            LOGGER.error( "【HorseInfoService】【removeHorseInfo】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
        return false;
    }

    @Override
    public HorseInfoListBO horseInfoList( HorseInfoListVO horseInfoListVo ) {
        horseInfoListVo.calculateBeginIndex();
        System.out.println( "pageIndex = " + horseInfoListVo.getPageIndex() + ", pageRecorders = " + horseInfoListVo.getPageRecorders() );
        try {
            List<HorseInfoListModel> horseInfoList = horseInfoMapper.selectHorseListByPage( horseInfoListVo );
            Integer totalRecorders = horseInfoMapper.countHorseListByPage( horseInfoListVo );
            HorseInfoListBO responseBo = new HorseInfoListBO( horseInfoList );
            responseBo.setTotalRecorders( totalRecorders );
            responseBo.setTotalPages( PageUtils.calculateTotalPages( totalRecorders, horseInfoListVo.getPageRecorders() ) );
            return responseBo;
        } catch ( Exception e ) {
            LOGGER.error( "【HorseInfoService】【horseInfoList】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
    }

    @Override
    public HorseInfoDetailBO horseInfoDetail( HorseInfoDetailVO horseInfoDetailVo ) throws BaseException {
        return horseInfoMapper.selectHorseInfoByDetail( horseInfoDetailVo.getHorseId() );
    }

}
