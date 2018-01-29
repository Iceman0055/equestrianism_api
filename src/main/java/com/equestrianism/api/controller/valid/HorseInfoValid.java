package com.equestrianism.api.controller.valid;

import com.equestrianism.api.model.vo.horse_info.HorseInfoAddVO;

/**
 * Created by Chenzq on 2018/1/28.
 */
public class HorseInfoValid {

    public static HorseInfoAddVO horseInfoAddValid( HorseInfoAddVO horseInfoAddVo ) {
        if ( horseInfoAddVo.getPassportNumber() == null || "".equals( horseInfoAddVo.getPassportNumber() ) ) {
            horseInfoAddVo.setPassportNumber( "" );
        }
        if ( horseInfoAddVo.getHorseName() == null || "".equals( horseInfoAddVo.getHorseName() ) ) {
            horseInfoAddVo.setHorseName( "" );
        }
        if ( horseInfoAddVo.getUsedName() == null || "".equals( horseInfoAddVo.getUsedName() ) ) {
            horseInfoAddVo.setUsedName( "" );
        }
        if ( horseInfoAddVo.getCountry() == null || "".equals( horseInfoAddVo.getCountry() ) ) {
            horseInfoAddVo.setCountry( "" );
        }
        if ( horseInfoAddVo.getHeight() == null || "".equals( horseInfoAddVo.getHeight() ) ) {
            horseInfoAddVo.setHeight( "" );
        }
        if ( horseInfoAddVo.getSex() == null || "".equals( horseInfoAddVo.getSex() ) ) {
            horseInfoAddVo.setSex( "" );
        }
        if ( horseInfoAddVo.getBarCode() == null || "".equals( horseInfoAddVo.getBarCode() ) ) {
            horseInfoAddVo.setBarCode( "" );
        }
        if ( horseInfoAddVo.getCoatColour() == null || "".equals( horseInfoAddVo.getCoatColour() ) ) {
            horseInfoAddVo.setCoatColour( "" );
        }
        if ( horseInfoAddVo.getHeadDesc() == null || "".equals( horseInfoAddVo.getHeadDesc() ) ) {
            horseInfoAddVo.setHeadDesc( "" );
        }
    }
    public HorseInfoEntity( String passportNumber, String horseName, String usedName, String country,
                            Date changeDate, Date birthday, String height, String sex, String barCode,
                            String coatColour,
                            String headDesc, String leftForeDesc, String rightForeDesc, String leftHindDesc,
                            String rightHindDesc,
                            String bodyDesc, MultipartFile rightImage, MultipartFile leftImage,
                            MultipartFile upperEyelinerImage,
                            MultipartFile foreImage, MultipartFile hindImage, MultipartFile neckImage,
                            MultipartFile lipImage ) throws IOException {

    }
