package tech.aistar.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Asset {
    private Integer id;

    private String assetId;

    private Integer assetCatId;

    private Integer assetSubId;

    private String assetName;

    private String assetModel;

    private BigDecimal assetPrice;

    private Date assetPurDate;

    private String assetStatus;

    private String assetRemark;

    private Integer assetLimit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId == null ? null : assetId.trim();
    }

    public Integer getAssetCatId() {
        return assetCatId;
    }

    public void setAssetCatId(Integer assetCatId) {
        this.assetCatId = assetCatId;
    }

    public Integer getAssetSubId() {
        return assetSubId;
    }

    public void setAssetSubId(Integer assetSubId) {
        this.assetSubId = assetSubId;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName == null ? null : assetName.trim();
    }

    public String getAssetModel() {
        return assetModel;
    }

    public void setAssetModel(String assetModel) {
        this.assetModel = assetModel == null ? null : assetModel.trim();
    }

    public BigDecimal getAssetPrice() {
        return assetPrice;
    }

    public void setAssetPrice(BigDecimal assetPrice) {
        this.assetPrice = assetPrice;
    }

    public Date getAssetPurDate() {
        return assetPurDate;
    }

    public void setAssetPurDate(Date assetPurDate) {
        this.assetPurDate = assetPurDate;
    }

    public String getAssetStatus() {
        return assetStatus;
    }

    public void setAssetStatus(String assetStatus) {
        this.assetStatus = assetStatus == null ? null : assetStatus.trim();
    }

    public String getAssetRemark() {
        return assetRemark;
    }

    public void setAssetRemark(String assetRemark) {
        this.assetRemark = assetRemark == null ? null : assetRemark.trim();
    }

    public Integer getAssetLimit() {
        return assetLimit;
    }

    public void setAssetLimit(Integer assetLimit) {
        this.assetLimit = assetLimit;
    }
}