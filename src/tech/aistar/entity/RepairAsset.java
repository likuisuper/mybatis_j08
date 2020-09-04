package tech.aistar.entity;

import java.math.BigDecimal;
import java.util.Date;

public class RepairAsset {
    private Integer id;

    private Integer repairAssetId;

    private Date repairSubmitTime;

    private String repairSubmitEmp;

    private String repairReason;

    private String repairReasonPics;

    private Integer repairEmp;

    private Short repairStatus;

    private String repairRemark;

    private BigDecimal repairCost;

    private String repairPics;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRepairAssetId() {
        return repairAssetId;
    }

    public void setRepairAssetId(Integer repairAssetId) {
        this.repairAssetId = repairAssetId;
    }

    public Date getRepairSubmitTime() {
        return repairSubmitTime;
    }

    public void setRepairSubmitTime(Date repairSubmitTime) {
        this.repairSubmitTime = repairSubmitTime;
    }

    public String getRepairSubmitEmp() {
        return repairSubmitEmp;
    }

    public void setRepairSubmitEmp(String repairSubmitEmp) {
        this.repairSubmitEmp = repairSubmitEmp == null ? null : repairSubmitEmp.trim();
    }

    public String getRepairReason() {
        return repairReason;
    }

    public void setRepairReason(String repairReason) {
        this.repairReason = repairReason == null ? null : repairReason.trim();
    }

    public String getRepairReasonPics() {
        return repairReasonPics;
    }

    public void setRepairReasonPics(String repairReasonPics) {
        this.repairReasonPics = repairReasonPics == null ? null : repairReasonPics.trim();
    }

    public Integer getRepairEmp() {
        return repairEmp;
    }

    public void setRepairEmp(Integer repairEmp) {
        this.repairEmp = repairEmp;
    }

    public Short getRepairStatus() {
        return repairStatus;
    }

    public void setRepairStatus(Short repairStatus) {
        this.repairStatus = repairStatus;
    }

    public String getRepairRemark() {
        return repairRemark;
    }

    public void setRepairRemark(String repairRemark) {
        this.repairRemark = repairRemark == null ? null : repairRemark.trim();
    }

    public BigDecimal getRepairCost() {
        return repairCost;
    }

    public void setRepairCost(BigDecimal repairCost) {
        this.repairCost = repairCost;
    }

    public String getRepairPics() {
        return repairPics;
    }

    public void setRepairPics(String repairPics) {
        this.repairPics = repairPics == null ? null : repairPics.trim();
    }
}