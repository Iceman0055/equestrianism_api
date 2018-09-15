package com.equestrianism.api.model.model;

import com.equestrianism.api.core.model.BaseObject;
import com.equestrianism.api.model.po.AssetInfoEntity;

/**
 * Created by Chenzq on 2018/9/2.
 */
public class AssetInfoImportModel extends BaseObject {

    private String barCode;
    private String typeId;
    private String typeDetailId;
    private Integer assetType;
    private String assetNumber;
    private String assetName;
    private Integer inventory;
    private String price;
    private String acreage;
    private String priceType;
    private String acquireWay;
    private String financeAccountsDate;
    private String tabDate;
    private String guaranteeDate;
    private String manageDepartment;
    private String manageUser;
    private String remark;
    private String purpose;
    private String specificationModel;
    private String brand;
    private String voucherNumber;
    private String purchaseOrganize;
    private String scrapDate;
    private String useStatus;
    private String financeSource;

    public AssetInfoImportModel() {
    }

    public AssetInfoImportModel(String typeId, String typeDetailId, Integer assetType, String assetNumber,
                                String assetName, String price, String acreage, String priceType, String acquireWay,
                                String financeAccountsDate, String tabDate, String guaranteeDate, String manageDepartment,
                                String manageUser, String remark, String purpose, String specificationModel, String brand,
                                String voucherNumber, String purchaseOrganize, String barCode, Integer inventory,
                                String scrapDate, String useStatus, String financeSource ) {
        this.typeId = typeId;
        this.typeDetailId = typeDetailId;
        this.assetType = assetType;
        this.assetNumber = assetNumber;
        this.assetName = assetName;
        this.price = price;
        this.acreage = acreage;
        this.priceType = priceType;
        this.acquireWay = acquireWay;
        this.financeAccountsDate = financeAccountsDate;
        this.tabDate = tabDate;
        this.guaranteeDate = guaranteeDate;
        this.manageDepartment = manageDepartment;
        this.manageUser = manageUser;
        this.remark = remark;
        this.purpose = purpose;
        this.specificationModel = specificationModel;
        this.brand = brand;
        this.voucherNumber = voucherNumber;
        this.purchaseOrganize = purchaseOrganize;
        this.barCode = barCode;
        this.inventory = inventory;
        this.scrapDate = scrapDate;
        this.useStatus = useStatus;
        this.financeSource = financeSource;
    }

    public AssetInfoEntity transToAssetInfo(Integer typeId, Integer typeDetailId, Integer priceType, Integer acquireWay,
                                            String manageDepartment, String manageUser) {
        return new AssetInfoEntity(typeId, typeDetailId, this.assetType, this.assetNumber, this.assetName, this.price,
                this.acreage, priceType, acquireWay, this.financeAccountsDate, this.tabDate, this.guaranteeDate, manageDepartment,
                manageUser, this.remark, this.purpose, this.specificationModel, this.brand, this.voucherNumber, this.purchaseOrganize,
                this.barCode, this.inventory, this.scrapDate, this.useStatus, this.financeSource );
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getTypeDetailId() {
        return typeDetailId;
    }

    public void setTypeDetailId(String typeDetailId) {
        this.typeDetailId = typeDetailId;
    }

    public Integer getAssetType() {
        return assetType;
    }

    public void setAssetType(Integer assetType) {
        this.assetType = assetType;
    }

    public String getAssetNumber() {
        return assetNumber;
    }

    public void setAssetNumber(String assetNumber) {
        this.assetNumber = assetNumber;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAcreage() {
        return acreage;
    }

    public void setAcreage(String acreage) {
        this.acreage = acreage;
    }

    public String getPriceType() {
        return priceType;
    }

    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    public String getAcquireWay() {
        return acquireWay;
    }

    public void setAcquireWay(String acquireWay) {
        this.acquireWay = acquireWay;
    }

    public String getFinanceAccountsDate() {
        return financeAccountsDate;
    }

    public void setFinanceAccountsDate(String financeAccountsDate) {
        this.financeAccountsDate = financeAccountsDate;
    }

    public String getTabDate() {
        return tabDate;
    }

    public void setTabDate(String tabDate) {
        this.tabDate = tabDate;
    }

    public String getGuaranteeDate() {
        return guaranteeDate;
    }

    public void setGuaranteeDate(String guaranteeDate) {
        this.guaranteeDate = guaranteeDate;
    }

    public String getManageDepartment() {
        return manageDepartment;
    }

    public void setManageDepartment(String manageDepartment) {
        this.manageDepartment = manageDepartment;
    }

    public String getManageUser() {
        return manageUser;
    }

    public void setManageUser(String manageUser) {
        this.manageUser = manageUser;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getSpecificationModel() {
        return specificationModel;
    }

    public void setSpecificationModel(String specificationModel) {
        this.specificationModel = specificationModel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getVoucherNumber() {
        return voucherNumber;
    }

    public void setVoucherNumber(String voucherNumber) {
        this.voucherNumber = voucherNumber;
    }

    public String getPurchaseOrganize() {
        return purchaseOrganize;
    }

    public void setPurchaseOrganize(String purchaseOrganize) {
        this.purchaseOrganize = purchaseOrganize;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public String getScrapDate() {
        return scrapDate;
    }

    public void setScrapDate(String scrapDate) {
        this.scrapDate = scrapDate;
    }

    public String getFinanceSource() {
        return financeSource;
    }

    public void setFinanceSource(String financeSource) {
        this.financeSource = financeSource;
    }

    public String getUseStatus() {
        return useStatus;
    }

    public void setUseStatus(String useStatus) {
        this.useStatus = useStatus;
    }
}
