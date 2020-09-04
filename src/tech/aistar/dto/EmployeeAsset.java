package tech.aistar.dto;

import java.util.Date;

/**
 * 本类功能:
 *
 * @author cxylk
 * @date 2020/9/4 12:49
 */
public class EmployeeAsset {
    private Integer id;
    private Integer empId;
    private String empName;
    private Integer empDepartment;
    private String depName;
    private String assetName;
    private String lentPurpose;
    private Date lentDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(Integer empDepartment) {
        this.empDepartment = empDepartment;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getLentPurpose() {
        return lentPurpose;
    }

    public void setLentPurpose(String lentPurpose) {
        this.lentPurpose = lentPurpose;
    }

    public Date getLentDate() {
        return lentDate;
    }

    public void setLentDate(Date lentDate) {
        this.lentDate = lentDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EmployeeAsset{");
        sb.append("id=").append(id);
        sb.append(", empId=").append(empId);
        sb.append(", empName='").append(empName).append('\'');
        sb.append(", empDepartment=").append(empDepartment);
        sb.append(", depName='").append(depName).append('\'');
        sb.append(", assetName='").append(assetName).append('\'');
        sb.append(", lentPurpose='").append(lentPurpose).append('\'');
        sb.append(", lentDate=").append(lentDate);
        sb.append('}');
        return sb.toString();
    }
}
