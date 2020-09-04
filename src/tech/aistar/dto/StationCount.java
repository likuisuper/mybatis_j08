package tech.aistar.dto;

/**
 * 本类功能:
 *
 * @author cxylk
 * @date 2020/9/4 16:34
 */
public class StationCount {
    private Integer id;
    private String posName;
    private Integer count;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPosName() {
        return posName;
    }

    public void setPosName(String posName) {
        this.posName = posName;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StationCount{");
        sb.append("id=").append(id);
        sb.append(", posName='").append(posName).append('\'');
        sb.append(", count=").append(count);
        sb.append('}');
        return sb.toString();
    }
}
