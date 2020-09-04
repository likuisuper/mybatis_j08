package tech.aistar.dto;

/**
 * 本类功能:
 *
 * @author cxylk
 * @date 2020/9/3 11:23
 */
public class EmployeeResult {
    private Integer id;
    private String empId;
    private String empName;
    private String empSex;
    private Integer empDepartment;
    private Integer depLeaderId;
    private String depLeaderName;

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
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpSex() {
        return empSex;
    }

    public void setEmpSex(String empSex) {
        this.empSex = empSex;
    }

    public Integer getEmpDepartment() {
        return empDepartment;
    }

    public void setEmpDepartment(Integer empDepartment) {
        this.empDepartment = empDepartment;
    }

    public Integer getDepLeaderId() {
        return depLeaderId;
    }

    public void setDepLeaderId(Integer depLeaderId) {
        this.depLeaderId = depLeaderId;
    }

    public String getDepLeaderName() {
        return depLeaderName;
    }

    public void setDepLeaderName(String depLeaderName) {
        this.depLeaderName = depLeaderName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EmployeeResult{");
        sb.append("id=").append(id);
        sb.append(", empId='").append(empId).append('\'');
        sb.append(", empName='").append(empName).append('\'');
        sb.append(", empSex='").append(empSex).append('\'');
        sb.append(", empDepartment=").append(empDepartment);
        sb.append(", depLeaderId=").append(depLeaderId);
        sb.append(", depLeaderName='").append(depLeaderName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
