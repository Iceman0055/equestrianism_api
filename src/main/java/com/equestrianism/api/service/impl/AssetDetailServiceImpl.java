package com.equestrianism.api.service.impl;

import com.equestrianism.api.constants.CodeEnum;
import com.equestrianism.api.core.container.BaseException;
import com.equestrianism.api.core.utils.PageUtils;
import com.equestrianism.api.dao.AssetDetailMapper;
import com.equestrianism.api.dao.AssetInfoMapper;
import com.equestrianism.api.model.bo.AssetDetailListBO;
import com.equestrianism.api.model.bo.AssetInfoListBO;
import com.equestrianism.api.model.model.AssetDetailListModel;
import com.equestrianism.api.model.model.AssetInfoListModel;
import com.equestrianism.api.model.po.AssetDetailEntity;
import com.equestrianism.api.model.vo.asset_detail.AssetDetailListVO;
import com.equestrianism.api.model.vo.asset_info.AssetInfoListVO;
import com.equestrianism.api.service.AssetDetailService;
import org.apache.poi.hssf.usermodel.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.ServletOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Iceman
 * 2018/9/3
 */
@Service( "assetDetailService" )
public class AssetDetailServiceImpl implements AssetDetailService {

    private static final Logger LOGGER = LoggerFactory.getLogger( AssetDetailServiceImpl.class );

    @Autowired
    private AssetDetailMapper assetDetailMapper;

    @Autowired
    private AssetInfoMapper assetInfoMapper;

    @Override
    public AssetDetailListBO assetDetailList( AssetDetailListVO assetDetailListVo ) {
        assetDetailListVo.calculateBeginIndex();
        try {
            List< AssetDetailListModel > assetDetailList = assetDetailMapper.selectAssetDetailListByPage( assetDetailListVo );
            Integer totalRecorders = assetDetailMapper.countAssetDetailListByPage( assetDetailListVo );
            AssetDetailListBO responseBo = new AssetDetailListBO( assetDetailList );
            responseBo.setTotalRecorders( totalRecorders );
            responseBo.setTotalPages( PageUtils.calculateTotalPages( totalRecorders, assetDetailListVo.getPageRecorders() ) );
            return responseBo;
        } catch ( Exception e ) {
            LOGGER.error( "【AssetDetailService】【assetDetailList】", e );
            throw new BaseException( CodeEnum.PROCESS_FAIL.note );
        }
    }

    @Override
    public Boolean scrap( String assetDetailId ) {
        // update asset_detail.scrap_type
        Integer updateCount = assetDetailMapper.updateScrapType( assetDetailId );
        System.out.println( updateCount );
        // update asset_info.inventory
        assetInfoMapper.scrap( assetDetailId );
        return true;
    }

    @Override
    public void exportExcel( String[] assetExcelTitle, ServletOutputStream out, AssetDetailListVO assetDetailListVo ) {
        assetDetailListVo.calculateBeginIndex();
        try {
            // 第一步，创建一个workbook，对应一个Excel文件
            HSSFWorkbook workbook = new HSSFWorkbook();
            // 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
            HSSFSheet hssfSheet = workbook.createSheet( "sheet1" );
            // 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short
            HSSFRow hssfRow = hssfSheet.createRow( 0 );
            // 第四步，创建单元格，并设置值表头 设置表头居中
            HSSFCellStyle hssfCellStyle = workbook.createCellStyle();
            //居中样式
            hssfCellStyle.setAlignment( HSSFCellStyle.ALIGN_CENTER );
            HSSFCell hssfCell;
            for ( int i = 0; i < assetExcelTitle.length; i++ ) {
                hssfCell = hssfRow.createCell( i );//列索引从0开始
                hssfCell.setCellValue( assetExcelTitle[i] );//列名1
                hssfCell.setCellStyle( hssfCellStyle );//列居中显示
            }
            // 第五步，写入实体数据
            List< AssetDetailListModel > assetInfoList = assetDetailMapper.selectAssetDetailList(assetDetailListVo);
            if ( assetInfoList != null && ! assetInfoList.isEmpty() ) {
                for ( int i = 0; i < assetInfoList.size(); i++ ) {
                    hssfRow = hssfSheet.createRow( i + 1 );
                    AssetDetailListModel assetDetailListModel = assetInfoList.get( i );
                    // 第六步，创建单元格，并设置值
                    String barCode = assetDetailListModel.getBarCode();
                    hssfRow.createCell( 0 ).setCellValue( barCode );
                    String typeName = assetDetailListModel.getTypeName();
                    hssfRow.createCell( 1 ).setCellValue( typeName );
                    String typeDetailName = assetDetailListModel.getTypeDetailName();
                    hssfRow.createCell( 2 ).setCellValue( typeDetailName );
                    String assetName = assetDetailListModel.getAssetName();
                    hssfRow.createCell( 3 ).setCellValue( assetName );
                    String price = assetDetailListModel.getPrice();
                    hssfRow.createCell( 4 ).setCellValue( price );
                    String acreage = assetDetailListModel.getAcreage();
                    hssfRow.createCell( 5 ).setCellValue( acreage );
                    String model = assetDetailListModel.getSpecificationModel();
                    hssfRow.createCell( 6 ).setCellValue( model );
                    String priceTypeName = assetDetailListModel.getPriceTypeName();
                    hssfRow.createCell( 7 ).setCellValue( priceTypeName );
                    String acquireWayName = assetDetailListModel.getAcquireWayName();
                    hssfRow.createCell( 8 ).setCellValue( acquireWayName );
                    String financeAccountsDate = assetDetailListModel.getFinanceAccountsDate();
                    hssfRow.createCell( 9 ).setCellValue( financeAccountsDate );
                    String tabDate = assetDetailListModel.getTabDate();
                    hssfRow.createCell( 10 ).setCellValue( tabDate );
                    String guaranteeDate = assetDetailListModel.getGuaranteeDate();
                    hssfRow.createCell( 11 ).setCellValue( guaranteeDate );
                    String departmentName = assetDetailListModel.getDepartmentName();
                    hssfRow.createCell( 12 ).setCellValue( departmentName );
                    String realName = assetDetailListModel.getRealname();
                    hssfRow.createCell( 13 ).setCellValue( realName );
                    String remark = assetDetailListModel.getRemark();
                    hssfRow.createCell( 14 ).setCellValue( remark );
                    String purpose = assetDetailListModel.getPurpose();
                    hssfRow.createCell( 15 ).setCellValue( purpose );
                    String specificationModel = assetDetailListModel.getSpecificationModel();
                    hssfRow.createCell( 16 ).setCellValue( specificationModel );
                    String brand = assetDetailListModel.getBrand();
                    hssfRow.createCell( 17 ).setCellValue( brand );
                    String voucherNumber = assetDetailListModel.getVoucherNumber();
                    hssfRow.createCell( 18 ).setCellValue( voucherNumber );
                    String purchaseOrganize = assetDetailListModel.getPurchaseOrganize();
                    hssfRow.createCell( 19 ).setCellValue( purchaseOrganize );
                    hssfRow.createCell( 20 ).setCellValue( "1" );
                    String scrapDate = assetDetailListModel.getScrapDate();
                    hssfRow.createCell( 21 ).setCellValue( scrapDate );
                }
            }
            // 第七步，将文件输出到客户端浏览器
            try {
                workbook.write( out );
                out.flush();
                out.close();
            } catch ( Exception e ) {
                e.printStackTrace();
            }
        } catch ( Exception e ) {
            e.printStackTrace();
        }
    }
}
