package tech.aistar.params;

import java.util.Date;

/**
 * 本类功能:
 *
 * @author cxylk
 * @date 2020/9/2 21:39
 */
public class TendecyQueryParameter {
    private String supCode;
    private Date startDate;
    private Date endDate;

    public String getSupCode() {
        return supCode;
    }

    public void setSupCode(String supCode) {
        this.supCode = supCode;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
