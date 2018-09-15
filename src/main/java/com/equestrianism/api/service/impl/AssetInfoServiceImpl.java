package com.equestrianism.api.service.impl;

import com.equestrianism.api.constants.AssetTypeEnum;
import com.equestrianism.api.constants.CodeEnum;
import com.equestrianism.api.constants.DictionaryConstants;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.ExcelUtils;
import com.equestrianism.api.core.utils.PageUtils;
import com.equestrianism.api.core.utils.PropertiesUtils;
import com.equestrianism.api.dao.*;
import com.equestrianism.api.model.bo.*;
import com.equestrianism.api.model.model.AssetInfoImportModel;
import com.equestrianism.api.model.model.AssetInfoInventoryModel;
import com.equestrianism.api.model.model.AssetInfoListModel;
import com.equestrianism.api.model.model.AssetTypeDetailListModel;
import com.equestrianism.api.model.po.*;
import com.equestrianism.api.model.vo.asset_info.*;
import com.equestrianism.api.service.AssetInfoService;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.ServletOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Chenzq on 2018/3/14.
 */
@Service("assetInfoService")
public class AssetInfoServiceImpl implements AssetInfoService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AssetInfoServiceImpl.class);

    @Autowired
    private AssetInfoMapper assetInfoMapper;

    @Autowired
    private AssetInventoryDetailMapper assetInventoryDetailMapper;

    @Autowired
    private AssetTypeInfoMapper assetTypeInfoMapper;

    @Autowired
    private AssetTypeDetailMapper assetTypeDetailMapper;

    @Autowired
    private DictionaryDetailMapper dictionaryDetailMapper;

    @Autowired
    private DepartmentInfoMapper departmentInfoMapper;

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private AssetDetailMapper assetDetailMapper;

    @Override
    public Boolean addAssetInfo(AssetInfoAddVO assetInfoAddVo) throws BaseException {
        if (assetInfoAddVo.getBarCode() == null) {
            assetInfoAddVo.setBarCode("");
        }
        if (assetInfoAddVo.getInventory() == null) {
            assetInfoAddVo.setInventory(0);
        }
        AssetInfoEntity assetInfoEntity = new AssetInfoEntity(assetInfoAddVo.getTypeId(), assetInfoAddVo.getTypeDetailId(),
                assetInfoAddVo.getAssetType(), assetInfoAddVo.getAssetNumber(), assetInfoAddVo.getAssetName(),
                assetInfoAddVo.getPrice(), assetInfoAddVo.getAcreage(), assetInfoAddVo.getPriceType(), assetInfoAddVo.getAcquireWay(),
                assetInfoAddVo.getFinanceAccountsDate(), assetInfoAddVo.getTabDate(), assetInfoAddVo.getGuaranteeDate(),
                assetInfoAddVo.getManageDepartment(), assetInfoAddVo.getManageUser(), assetInfoAddVo.getRemark(),
                assetInfoAddVo.getPurpose(), assetInfoAddVo.getSpecificationModel(), assetInfoAddVo.getBrand(),
                assetInfoAddVo.getVoucherNumber(), assetInfoAddVo.getPurchaseOrganize(), assetInfoAddVo.getBarCode(),
                assetInfoAddVo.getInventory(), assetInfoAddVo.getScrapDate(), assetInfoAddVo.getUseStatus(), assetInfoAddVo.getFinanceSource() );
        Integer insertCount;
        try {
            insertCount = assetInfoMapper.insert(assetInfoEntity);
        } catch (Exception e) {
            LOGGER.error("【AssetInfoService】【addAssetInfo】", e);
            throw new BaseException(CodeEnum.PROCESS_FAIL.note);
        }
        if (insertCount > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean updateAssetInfo(AssetInfoUpdateVO assetInfoUpdateVo) throws BaseException {
        if (assetInfoUpdateVo.getBarCode() == null) {
            assetInfoUpdateVo.setBarCode("");
        }
        AssetInfoEntity assetInfoEntity = new AssetInfoEntity(assetInfoUpdateVo.getAssetId(), assetInfoUpdateVo.getTypeId(),
                assetInfoUpdateVo.getTypeDetailId(), assetInfoUpdateVo.getAssetType(), assetInfoUpdateVo.getAssetNumber(),
                assetInfoUpdateVo.getAssetName(), assetInfoUpdateVo.getPrice(), assetInfoUpdateVo.getAcreage(), assetInfoUpdateVo.getPriceType(),
                assetInfoUpdateVo.getAcquireWay(), assetInfoUpdateVo.getFinanceAccountsDate(), assetInfoUpdateVo.getTabDate(),
                assetInfoUpdateVo.getGuaranteeDate(), assetInfoUpdateVo.getManageDepartment(), assetInfoUpdateVo.getManageUser(),
                assetInfoUpdateVo.getRemark(), assetInfoUpdateVo.getPurpose(), assetInfoUpdateVo.getSpecificationModel(),
                assetInfoUpdateVo.getBrand(), assetInfoUpdateVo.getVoucherNumber(), assetInfoUpdateVo.getPurchaseOrganize(),
                assetInfoUpdateVo.getBarCode(), null, assetInfoUpdateVo.getScrapDate(), assetInfoUpdateVo.getUseStatus(), assetInfoUpdateVo.getFinanceSource() );
        Integer updateCount;
        try {
            updateCount = assetInfoMapper.updateBySelective(assetInfoEntity);
        } catch (Exception e) {
            LOGGER.error("【AssetInfoService】【updateAssetInfo】", e);
            throw new BaseException(CodeEnum.PROCESS_FAIL.note);
        }
        if (updateCount > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean removeAssetInfo(AssetInfoDeleteVO assetInfoDeleteVo) throws BaseException {
        AssetInfoEntity assetInfoEntity = new AssetInfoEntity(assetInfoDeleteVo.getAssetId());
        assetInfoEntity.setDeleteFlag(assetInfoDeleteVo.getDeleteFlag());
        assetInfoEntity.setStatus(assetInfoDeleteVo.getStatus());
        Integer updateCount;
        try {
            updateCount = assetInfoMapper.updateBySelective(assetInfoEntity);
        } catch (Exception e) {
            LOGGER.error("【AssetInfoService】【removeAssetInfo】", e);
            throw new BaseException(CodeEnum.PROCESS_FAIL.note);
        }
        if (updateCount > 0) {
            return true;
        }
        return false;
    }

    @Override
    public AssetInfoListBO assetInfoList(AssetInfoListVO assetInfoListVo) throws BaseException {
        assetInfoListVo.calculateBeginIndex();
        try {
            List<AssetInfoListModel> assetInfoList = assetInfoMapper.selectAssetInfoListByPage(assetInfoListVo);
            Integer totalRecorders = assetInfoMapper.countAssetInfoListByPage(assetInfoListVo);
            AssetInfoListBO responseBo = new AssetInfoListBO(assetInfoList);
            responseBo.setTotalRecorders(totalRecorders);
            responseBo.setTotalPages(PageUtils.calculateTotalPages(totalRecorders, assetInfoListVo.getPageRecorders()));
            return responseBo;
        } catch (Exception e) {
            LOGGER.error("【AssetInfoService】【assetInfoList】", e);
            throw new BaseException(CodeEnum.PROCESS_FAIL.note);
        }
    }

    @Override
    public AssetInfoDetailBO assetInfoDetail(String assetId) throws BaseException {
        AssetInfoEntity assetInfoEntity = assetInfoMapper.selectByPrimaryKey(assetId);
        return new AssetInfoDetailBO(assetInfoEntity.getAssetId(), assetInfoEntity.getTypeId(), assetInfoEntity.getTypeDetailId(),
                assetInfoEntity.getAssetType(), assetInfoEntity.getAssetNumber(), assetInfoEntity.getAssetName(), assetInfoEntity.getPrice(),
                assetInfoEntity.getAcreage(), assetInfoEntity.getPriceType(), assetInfoEntity.getAcquireWay(), assetInfoEntity.getFinanceAccountsDate(),
                assetInfoEntity.getTabDate(), assetInfoEntity.getGuaranteeDate(), assetInfoEntity.getManageDepartment(), assetInfoEntity.getManageUser(),
                assetInfoEntity.getRemark(), assetInfoEntity.getPurpose(), assetInfoEntity.getSpecificationModel(),
                assetInfoEntity.getBrand(), assetInfoEntity.getVoucherNumber(), assetInfoEntity.getPurchaseOrganize(),
                assetInfoEntity.getBarCode(), assetInfoEntity.getScrapDate(), assetInfoEntity.getInventory(), assetInfoEntity.getUseStatus(),
                assetInfoEntity.getFinanceSource() );
    }

    @Override
    public AssetInfoNameBO assetName(String barCode, Integer type) throws BaseException {
        Map<String, Object> params = new HashMap<>();
        params.put("barCode", barCode);
        params.put("assetType", type);
        AssetInfoEntity assetInfoEntity = assetInfoMapper.selectBySelective(params);
        if (assetInfoEntity == null) {
            return null;
        }
        return new AssetInfoNameBO(assetInfoEntity.getAssetId(), assetInfoEntity.getAssetName());
    }

    @Override
    public Boolean inventory(AssetInfoInventoryVO assetInfoInventoryVo) throws BaseException {
        List<AssetInfoInventoryModel> inventoryList = assetInfoInventoryVo.getInventoryList();
        if (inventoryList == null || inventoryList.size() == 0) {
            return true;
        }
        Map<String, Object> params;
        for (AssetInfoInventoryModel assetInfoInventoryModel : inventoryList) {
            if (assetInfoInventoryModel.getInventory() <= 0) {
                continue;
            }
            params = new HashMap<>();
            params.put("assetType", assetInfoInventoryVo.getAssetType());
            params.put("assetId", assetInfoInventoryModel.getAssetId());
            params.put("inventory", assetInfoInventoryModel.getInventory());
            AssetInventoryDetailEntity assetInventoryDetailEntity = new AssetInventoryDetailEntity(assetInfoInventoryModel.getAssetId(),
                    assetInfoInventoryVo.getAssetType(), assetInfoInventoryModel.getInventory(), 1);
            try {
                assetInfoMapper.inventory(params);
                assetInventoryDetailMapper.insert(assetInventoryDetailEntity);
                AssetDetailEntity assetDetailEntity;
                String batchNumber = new Date().getTime() + "";
                for ( int i = 0; i < assetInfoInventoryModel.getInventory(); i++ ) {
                    assetDetailEntity = new AssetDetailEntity( assetInfoInventoryModel.getAssetId(), batchNumber, 0, assetInfoInventoryModel.getAssetId() );
                    assetDetailMapper.insert( assetDetailEntity );
                }
            } catch (Exception e) {
                LOGGER.error("【AssetInfoService】【inventory】", e);
            }
        }
        return true;
    }

    @Override
    public void exportExcel(String[] assetExcelTitle, ServletOutputStream out, AssetInfoListVO assetInfoListVo) {
        try {
            // 第一步，创建一个workbook，对应一个Excel文件
            HSSFWorkbook workbook = new HSSFWorkbook();
            // 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
            HSSFSheet hssfSheet = workbook.createSheet("sheet1");
            // 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short
            HSSFRow hssfRow = hssfSheet.createRow(0);
            // 第四步，创建单元格，并设置值表头 设置表头居中
            HSSFCellStyle hssfCellStyle = workbook.createCellStyle();
            //居中样式
            hssfCellStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);
            HSSFCell hssfCell;
            for (int i = 0; i < assetExcelTitle.length; i++) {
                hssfCell = hssfRow.createCell(i);//列索引从0开始
                hssfCell.setCellValue(assetExcelTitle[i]);//列名1
                hssfCell.setCellStyle(hssfCellStyle);//列居中显示
            }
            // 第五步，写入实体数据
            List<AssetInfoListModel> assetInfoList = assetInfoMapper.selectAssetInfoList(assetInfoListVo);
            if (assetInfoList != null && !assetInfoList.isEmpty()) {
                for (int i = 0; i < assetInfoList.size(); i++) {
                    hssfRow = hssfSheet.createRow(i + 1);
                    AssetInfoListModel assetInfoListModel = assetInfoList.get(i);
                    // 第六步，创建单元格，并设置值
                    String barCode = assetInfoListModel.getBarCode();
                    hssfRow.createCell( 0 ).setCellValue( barCode );
                    String typeName = assetInfoListModel.getTypeName();
                    hssfRow.createCell( 1 ).setCellValue( typeName );
                    String typeDetailName = assetInfoListModel.getTypeDetailName();
                    hssfRow.createCell( 2 ).setCellValue( typeDetailName );
                    String assetNumber = assetInfoListModel.getAssetNumber();
                    hssfRow.createCell( 3 ).setCellValue( assetNumber );
                    String assetName = assetInfoListModel.getAssetName();
                    hssfRow.createCell( 4 ).setCellValue( assetName );
                    String price = assetInfoListModel.getPrice();
                    hssfRow.createCell( 5 ).setCellValue( price );
                    String acreage = assetInfoListModel.getAcreage();
                    hssfRow.createCell( 6 ).setCellValue( acreage );
                    String priceTypeName = assetInfoListModel.getPriceTypeName();
                    hssfRow.createCell( 7 ).setCellValue( priceTypeName );
                    String acquireWayName = assetInfoListModel.getAcquireWayName();
                    hssfRow.createCell( 8 ).setCellValue( acquireWayName );
                    String financeAccountsDate = assetInfoListModel.getFinanceAccountsDate();
                    hssfRow.createCell( 9 ).setCellValue( financeAccountsDate );
                    String tabDate = assetInfoListModel.getTabDate();
                    hssfRow.createCell( 10 ).setCellValue( tabDate );
                    String guaranteeDate = assetInfoListModel.getGuaranteeDate();
                    hssfRow.createCell( 11 ).setCellValue( guaranteeDate );
                    String departmentName = assetInfoListModel.getDepartmentName();
                    hssfRow.createCell( 12 ).setCellValue( departmentName );
                    String realName = assetInfoListModel.getRealname();
                    hssfRow.createCell( 13 ).setCellValue( realName );
                    String useStatus = assetInfoListModel.getUseStatus();
                    hssfRow.createCell( 14 ).setCellValue( useStatus );
                    String financeSource = assetInfoListModel.getFinanceSource();
                    hssfRow.createCell( 15 ).setCellValue( financeSource );
                    String remark = assetInfoListModel.getRemark();
                    hssfRow.createCell( 16 ).setCellValue( remark );
                    String purpose = assetInfoListModel.getPurpose();
                    hssfRow.createCell( 17 ).setCellValue(purpose);
                    String specificationModel = assetInfoListModel.getSpecificationModel();
                    hssfRow.createCell( 18 ).setCellValue( specificationModel );
                    String brand = assetInfoListModel.getBrand();
                    hssfRow.createCell( 19 ).setCellValue( brand );
                    String voucherNumber = assetInfoListModel.getVoucherNumber();
                    hssfRow.createCell( 20 ).setCellValue( voucherNumber );
                    String purchaseOrganize = assetInfoListModel.getPurchaseOrganize();
                    hssfRow.createCell( 21 ).setCellValue( purchaseOrganize );
                    String count = assetInfoListModel.getInventory().toString();
                    hssfRow.createCell( 22 ).setCellValue( count );
                    String scrapDate = assetInfoListModel.getScrapDate();
                    hssfRow.createCell( 23 ).setCellValue( scrapDate );
                }
            }
            // 第七步，将文件输出到客户端浏览器
            try {
                workbook.write(out);
                out.flush();
                out.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void batchImport(MultipartFile file, String createUser) {
        String batchNumber = new Date().getTime() + "";
        Integer excelVersion = ExcelUtils.isExcleVersion(file.getOriginalFilename());
        if (excelVersion == 0) {
            return;
        }
        File excelFile = ExcelUtils.uploadFile(file);
        Workbook workbook = ExcelUtils.getWorkbook(excelFile, excelVersion);
        List<AssetInfoImportModel> importList = ExcelUtils.assetImport(workbook, excelFile);
        if ( importList == null || importList.size() == 0 ) {
            return;
        }
        for ( AssetInfoImportModel assetInfoImportModel : importList ) {
            // asset type
            String typeName = assetInfoImportModel.getTypeId().trim();
            AssetTypeInfoEntity assetTypeInfoEntity = assetTypeInfoMapper.selectByName(typeName);
            if ( assetTypeInfoEntity == null ) {
                assetTypeInfoEntity = new AssetTypeInfoEntity(typeName, typeName);
                assetTypeInfoMapper.insert(assetTypeInfoEntity);
            }
            Integer typeId = assetTypeInfoEntity.getTypeId();
            // asset type detail
            String typeDetailName = assetInfoImportModel.getTypeDetailId().trim();
            AssetTypeDetailEntity assetTypeDetailEntity = assetTypeDetailMapper.selectByName(typeDetailName);
            if ( assetTypeDetailEntity == null ) {
                assetTypeDetailEntity = new AssetTypeDetailEntity(typeDetailName, typeId, typeDetailName);
                assetTypeDetailMapper.insert(assetTypeDetailEntity);
            }
            Integer typeDetailId = assetTypeDetailEntity.getTypeDetailId();
            // price type
            String priceName = assetInfoImportModel.getPriceType().trim();
            DictionaryDetailEntity dictionaryDetailEntity = new DictionaryDetailEntity(priceName, DictionaryConstants.PRICE_TYPE);
            dictionaryDetailEntity = dictionaryDetailMapper.selectDictionaryDetailListByCondition(dictionaryDetailEntity);
            if ( dictionaryDetailEntity == null ) {
                DictionaryDetailEntity tempDictDetail = dictionaryDetailMapper.selectLast(DictionaryConstants.PRICE_TYPE);
                dictionaryDetailEntity = new DictionaryDetailEntity(tempDictDetail.generateItemCode(), priceName, DictionaryConstants.PRICE_TYPE);
                dictionaryDetailMapper.insert(dictionaryDetailEntity);
            }
            Integer priceType = dictionaryDetailEntity.getDictionaryDetailId();
            // acquire way
            String acquireWayName = assetInfoImportModel.getAcquireWay().trim();
            dictionaryDetailEntity = new DictionaryDetailEntity(acquireWayName, DictionaryConstants.ACQUIRE_WAY);
            dictionaryDetailEntity = dictionaryDetailMapper.selectDictionaryDetailListByCondition(dictionaryDetailEntity);
            if ( dictionaryDetailEntity == null ) {
                DictionaryDetailEntity tempDictDetail = dictionaryDetailMapper.selectLast(DictionaryConstants.ACQUIRE_WAY);
                dictionaryDetailEntity = new DictionaryDetailEntity(tempDictDetail.generateItemCode(), acquireWayName, DictionaryConstants.ACQUIRE_WAY);
                dictionaryDetailMapper.insert(dictionaryDetailEntity);
            }
            Integer acquireWay = dictionaryDetailEntity.getDictionaryDetailId();
            // manage department
            String departmentName = assetInfoImportModel.getManageDepartment().trim();
            DepartmentInfoEntity departmentInfoEntity = departmentInfoMapper.selectByName(departmentName);
            if ( departmentInfoEntity == null ) {
                departmentInfoEntity = new DepartmentInfoEntity(departmentName, departmentName, departmentName);
                departmentInfoMapper.insert(departmentInfoEntity);
            }
            String departmentId = departmentInfoEntity.getDepartmentId();
            // manage user
            String realName = assetInfoImportModel.getManageUser();
            AssetInfoEntity assetInfoEntity = assetInfoImportModel.transToAssetInfo(typeId, typeDetailId, priceType, acquireWay, departmentId, realName);
            assetInfoMapper.insert(assetInfoEntity);
            AssetDetailEntity assetDetailEntity;
            for ( int i = 0; i < assetInfoImportModel.getInventory(); i ++ ) {
                assetDetailEntity = new AssetDetailEntity( assetInfoEntity.getAssetId(), batchNumber, 0, createUser );
                assetDetailMapper.insert( assetDetailEntity );
            }
        }
    }

}