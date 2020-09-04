package tech.aistar.entity;

import java.util.Date;

public class DealAsset {
    private Integer id;

    private Integer lentAssetId;

    private Integer lentEmpId;

    private String lentEmpName;

    private Integer lentAdminId;

    private Date lentDate;

    private String lentPurpose;

    private String lentRemark;

    private Date returnDate;

    private Integer returnAdminId;

    private String returnRemark;

    private String dealAssetStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLentAssetId() {
        return lentAssetId;
    }

    public void setLentAssetId(Integer lentAssetId) {
        this.lentAssetId = lentAssetId;
    }

    public Integer getLentEmpId() {
        return lentEmpId;
    }

    public void setLentEmpId(Integer lentEmpId) {
        this.lentEmpId = lentEmpId;
    }

    public String getLentEmpName() {
        return lentEmpName;
    }

    public void setLentEmpName(String lentEmpName) {
        this.lentEmpName = lentEmpName == null ? null : lentEmpName.trim();
    }

    public Integer getLentAdminId() {
        return lentAdminId;
    }

    public void setLentAdminId(Integer lentAdminId) {
        this.lentAdminId = lentAdminId;
    }

    public Date getLentDate() {
        return lentDate;
    }

    public void setLentDate(Date lentDate) {
        this.lentDate = lentDate;
    }

    public String getLentPurpose() {
        return lentPurpose;
    }

    public void setLentPurpose(String lentPurpose) {
        this.lentPurpose = lentPurpose == null ? null : lentPurpose.trim();
    }

    public String getLentRemark() {
        return lentRemark;
    }

    public void setLentRemark(String lentRemark) {
        this.lentRemark = lentRemark == null ? null : lentRemark.trim();
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Integer getReturnAdminId() {
        return returnAdminId;
    }

    public void setReturnAdminId(Integer returnAdminId) {
        this.returnAdminId = returnAdminId;
    }

    public String getReturnRemark() {
        return returnRemark;
    }

    public void setReturnRemark(String returnRemark) {
        this.returnRemark = returnRemark == null ? null : returnRemark.trim();
    }

    public String getDealAssetStatus() {
        return dealAssetStatus;
    }

    public void setDealAssetStatus(String dealAssetStatus) {
        this.dealAssetStatus = dealAssetStatus == null ? null : dealAssetStatus.trim();
    }
}