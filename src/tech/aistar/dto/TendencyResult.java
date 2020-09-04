package tech.aistar.dto;

/**
 * 本类功能:
 *
 * @author cxylk
 * @date 2020/9/2 21:31
 */
public class TendencyResult {
    private String supCode;
    private String supName;
    private Double arvRate;
    private Double passRate;
    private String month;

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

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TendencyResult{");
        sb.append("supCode='").append(supCode).append('\'');
        sb.append(", supName='").append(supName).append('\'');
        sb.append(", arvRate=").append(arvRate);
        sb.append(", passRate=").append(passRate);
        sb.append(", month='").append(month).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
