package com.equestrianism.api.model.bo;

import com.equestrianism.api.core.model.BaseObject;


/**
 * Created by Chenzq on 2018/3/14.
 */
public class AssetInfoDetailBO extends BaseObject {

    private String assetId;
    private Integer typeId;
    private Integer typeDetailId;
    private Integer assetType;
    private String assetNumber;
    private String assetName;
    private String price;
    private String acreage;
    private Integer priceType;
    private Integer acquireWay;
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

    public AssetInfoDetailBO() {
    }

    public AssetInfoDetailBO( String assetId, Integer typeId, Integer typeDetailId, Integer assetType, String assetNumber,
                            String assetName, String price, String acreage, Integer priceType, Integer acquireWay,
                            String financeAccountsDate, String tabDate, String guaranteeDate, String manageDepartment,
                            String manageUser, String remark, String purpose, String specificationModel, String brand,
                            String voucherNumber, String purchaseOrganize ) {
        this.setAssetId(assetId);
        this.setTypeId(typeId);
        this.setTypeDetailId(typeDetailId);
        this.setAssetType(assetType);
        this.setAssetNumber(assetNumber);
        this.setAssetName(assetName);
        this.setPrice(price);
        this.setAcreage(acreage);
        this.setPriceType(priceType);
        this.setAcquireWay(acquireWay);
        this.setFinanceAccountsDate(financeAccountsDate);
        this.setTabDate(tabDate);
        this.setGuaranteeDate(guaranteeDate);
        this.setManageDepartment(manageDepartment);
        this.setManageUser(manageUser);
        this.setRemark(remark);
        this.setPurpose(purpose);
        this.setSpecificationModel(specificationModel);
        this.setBrand(brand);
        this.setVoucherNumber(voucherNumber);
        this.setPurchaseOrganize(purchaseOrganize);
    }

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getTypeDetailId() {
        return typeDetailId;
    }

    public void setTypeDetailId(Integer typeDetailId) {
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

    public Integer getPriceType() {
        return priceType;
    }

    public void setPriceType(Integer priceType) {
        this.priceType = priceType;
    }

    public Integer getAcquireWay() {
        return acquireWay;
    }

    public void setAcquireWay(Integer acquireWay) {
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
}
