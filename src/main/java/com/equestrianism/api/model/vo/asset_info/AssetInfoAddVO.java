package com.equestrianism.api.model.vo.asset_info;

import com.equestrianism.api.core.model.BaseViewModel;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * Created by Chenzq on 2018/3/14.
 */
@JsonIgnoreProperties( ignoreUnknown = true )
public class AssetInfoAddVO extends BaseViewModel {

    private String barCode;
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
    private Integer inventory;
    private String scrapDate;

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
}
