package tech.aistar.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 本类功能:
 *
 * @author cxylk
 * @date 2020/9/2 20:33
 */
public class Tendency implements Serializable {
    private Long id;

    //供应商编号
    private String supCode;

    //供应商名字
    private String supName;

    private Double arvRate;

    private Double passRate;

    private Date crateDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSupCode() {
        return supCode;
    }

    public void setSupCode(String supCode) {
        this.supCode = supCode;
    }

    public String getSupName() {
        return supName;
    }

    public void setSupName(String supName) {
        this.supName = supName;
    }

    public Double getArvRate() {
        return arvRate;
    }

    public void setArvRate(Double arvRate) {
        this.arvRate = arvRate;
    }

    public Double getPassRate() {
        return passRate;
    }

    public void setPassRate(Double passRate) {
        this.passRate = passRate;
    }

    public Date getCrateDate() {
        return crateDate;
    }

    public void setCrateDate(Date crateDate) {
        this.crateDate = crateDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tendency{");
        sb.append("id=").append(id);
        sb.append(", supCode='").append(supCode).append('\'');
        sb.append(", supName='").append(supName).append('\'');
        sb.append(", arvRate=").append(arvRate);
        sb.append(", passRate=").append(passRate);
        sb.append(", crateDate=").append(crateDate);
        sb.append('}');
        return sb.toString();
    }
}
