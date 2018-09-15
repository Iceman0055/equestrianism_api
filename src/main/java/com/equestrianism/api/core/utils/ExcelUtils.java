package com.equestrianism.api.core.utils;

import com.equestrianism.api.constants.AssetTypeEnum;
import com.equestrianism.api.model.model.AssetInfoImportModel;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chenzq on 2018/9/2.
 */
public class ExcelUtils {

    public static List<AssetInfoImportModel> assetImport( Workbook workbook, File excelFile ) {
        Sheet sheet = workbook.getSheetAt(0);
        List<AssetInfoImportModel> assetList = new ArrayList<>(sheet.getRow(0).getLastCellNum());
        AssetInfoImportModel assetInfoImportModel;
        // 获取值
        for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
            Row row = sheet.getRow(rowIndex);
            Cell cell = row.getCell(0);
            String barCode = "";
            if ( cell != null ) {
                barCode = cell.getStringCellValue();
            }
            cell = row.getCell(1);
            String typeName = cell.getStringCellValue();
            cell = row.getCell(2);
            String typeDetailName = cell.getStringCellValue();
            cell = row.getCell(3);
            String assetNumber = cell.getStringCellValue();
            cell = row.getCell(4);
            String assetName = cell.getStringCellValue();
            cell = row.getCell(5);
            String price = cell.getStringCellValue();
            cell = row.getCell(6);
            String acreage = cell.getStringCellValue();
            cell = row.getCell(7);
            String priceType = cell.getStringCellValue();
            cell = row.getCell(8);
            String acqyureWay = cell.getStringCellValue();
            cell = row.getCell(9);
            String financeDate = cell.getStringCellValue();
            cell = row.getCell(10);
            String tabDate = cell.getStringCellValue();
            cell = row.getCell(11);
            String guaranteeDate = cell.getStringCellValue();
            cell = row.getCell(12);
            String manageDepartment = cell.getStringCellValue();
            cell = row.getCell(13);
            String managerUser = cell.getStringCellValue();
            cell = row.getCell(14);
            String useStatus = cell.getStringCellValue();
            cell = row.getCell(15);
            String financeSource = cell.getStringCellValue();
            cell = row.getCell(16);
            String remark = cell.getStringCellValue();
            cell = row.getCell(17);
            String purpose = cell.getStringCellValue();
            cell = row.getCell(18);
            String model = cell.getStringCellValue();
            cell = row.getCell(19);
            String brand = cell.getStringCellValue();
            cell = row.getCell(20);
            String voucherNumber = cell.getStringCellValue();
            cell = row.getCell(21);
            String purchaseOrganize = cell.getStringCellValue();
            cell = row.getCell(22);
            String count = "0";
            if ( cell != null ) {
                count = cell.getStringCellValue();
            }
            cell = row.getCell(23);
            String scrapDate = "";
            if ( cell != null ) {
                scrapDate = cell.getStringCellValue();
            }
            assetInfoImportModel = new AssetInfoImportModel(typeName, typeDetailName, AssetTypeEnum.CENTER_ASSET_TYPE.type,
                    assetNumber, assetName, price, acreage, priceType, acqyureWay, financeDate, tabDate, guaranteeDate,
                    manageDepartment, managerUser, remark, purpose, model, brand, voucherNumber, purchaseOrganize,
                    barCode, Integer.parseInt(count), scrapDate, useStatus, financeSource );
            assetList.add(assetInfoImportModel);
        }
        excelFile.delete();
        return assetList;
    }

    public static File uploadFile(MultipartFile file) {
        String tempFilePath = PropertiesUtils.getValue("batch_import_path");
        String filePath = tempFilePath.concat(file.getOriginalFilename());
        File tempFile = new File(tempFilePath);
        if (!tempFile.exists()) {
            tempFile.mkdir();
        }
        tempFile = new File(filePath);
        CommonsMultipartFile commons = (CommonsMultipartFile) file;
        try {
            commons.getFileItem().write(tempFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tempFile;
    }

    /**
     * @param originalFilename
     * @return 1 ：2003
     * 2 ：2007
     * 0 ：不是Excle版本
     * @描述：判断Excel是什么版本
     */
    public static int isExcleVersion(String originalFilename) {
        int i = 0;

        if (originalFilename.matches("^.+\\.(?i)(xls)$")) i = 1;
        else if (originalFilename.matches("^.+\\.(?i)(xlsx)$")) i = 2;

        return i;
    }

    public static Workbook getWorkbook( File excelFile, Integer excelVersion) {
        FileInputStream is = null;
        POIFSFileSystem fs = null;
        Workbook workbook = null;
        try {
            //打开流
            is = new FileInputStream(excelFile);
            if (excelVersion == 1) {
                //把excel文件作为数据流来进行传入传出
                fs = new POIFSFileSystem(is);
                //解析Excel 2003版
                workbook = new HSSFWorkbook(fs);
            } else {
                //解析Excel 2007版
                workbook = new XSSFWorkbook(is);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return workbook;
    }

}
