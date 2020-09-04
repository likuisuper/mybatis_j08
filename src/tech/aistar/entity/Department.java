package tech.aistar.entity;

public class Department {
    private Integer id;

    private String depName;

    private Integer depLeaderId;

    private String depLeaderName;

    private Integer depSupId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName == null ? null : depName.trim();
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
        this.depLeaderName = depLeaderName == null ? null : depLeaderName.trim();
    }

    public Integer getDepSupId() {
        return depSupId;
    }

    public void setDepSupId(Integer depSupId) {
        this.depSupId = depSupId;
    }
}