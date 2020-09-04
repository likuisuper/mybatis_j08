package tech.aistar.entity;

import java.util.Date;

public class Employee {
    private Integer id;

    private String empId;

    private String empName;

    private String empSex;

    private Date empBirthday;

    private Integer empPositionId;

    private String empPhone;

    private String empRemark;

    private Integer empDepartment;

    private String empPortrait;

    private Date empHairDate;

    private String empPwd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public String getEmpSex() {
        return empSex;
    }

    public void setEmpSex(String empSex) {
        this.empSex = empSex == null ? null : empSex.trim();
    }

    public Date getEmpBirthday() {
        return empBirthday;
    }

    public void setEmpBirthday(Date empBirthday) {
        this.empBirthday = empBirthday;
    }

    public Integer getEmpPositionId() {
        return empPositionId;
    }

    public void setEmpPositionId(Integer empPositionId) {
        this.empPositionId = empPositionId;
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone == null ? null : empPhone.trim();
    }

    public String getEmpRemark() {
        return empRemark;
    }

    public void setEmpRemark(String empRemark) {
        this.empRemark = empRemark == null ? null : empRemark.trim();
    }

    public Integer getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(Integer empDepartment) {
        this.empDepartment = empDepartment;
    }

    public String getEmpPortrait() {
        return empPortrait;
    }

    public void setEmpPortrait(String empPortrait) {
        this.empPortrait = empPortrait == null ? null : empPortrait.trim();
    }

    public Date getEmpHairDate() {
        return empHairDate;
    }

    public void setEmpHairDate(Date empHairDate) {
        this.empHairDate = empHairDate;
    }

    public String getEmpPwd() {
        return empPwd;
    }

    public void setEmpPwd(String empPwd) {
        this.empPwd = empPwd == null ? null : empPwd.trim();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("id=").append(id);
        sb.append(", empId='").append(empId).append('\'');
        sb.append(", empName='").append(empName).append('\'');
        sb.append(", empSex='").append(empSex).append('\'');
        sb.append(", empBirthday=").append(empBirthday);
        sb.append(", empPositionId=").append(empPositionId);
        sb.append(", empPhone='").append(empPhone).append('\'');
        sb.append(", empRemark='").append(empRemark).append('\'');
        sb.append(", empDepartment=").append(empDepartment);
        sb.append(", empPortrait='").append(empPortrait).append('\'');
        sb.append(", empHairDate=").append(empHairDate);
        sb.append(", empPwd='").append(empPwd).append('\'');
        sb.append('}');
        return sb.toString();
    }
}