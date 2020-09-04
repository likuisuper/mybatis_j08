package tech.aistar.dto;

import java.util.Date;

/**
 * 本类功能:
 *
 * @author cxylk
 * @date 2020/9/4 13:24
 */
public class EmployeeDate {
    private String assetId;

    private String assetName;

    private String assetStatus;

    private Date assetPurDate;

    public EmployeeDate() {
    }

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getAssetStatus() {
        return assetStatus;
    }

    public void setAssetStatus(String assetStatus) {
        this.assetStatus = assetStatus;
    }

    public Date getAssetPurDate() {
        return assetPurDate;
    }

    public void setAssetPurDate(Date assetPurDate) {
        this.assetPurDate = assetPurDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EmployeeDate{");
        sb.append("assetId='").append(assetId).append('\'');
        sb.append(", assetName='").append(assetName).append('\'');
        sb.append(", assetStatus='").append(assetStatus).append('\'');
        sb.append(", assetPurDate=").append(assetPurDate);
        sb.append('}');
        return sb.toString();
    }
}
