package tech.aistar.entity;

public class Admin {
    private Integer id;

    private String adminName;

    private String adminPwd;

    private String adminPortrait;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getAdminPwd() {
        return adminPwd;
    }

    public void setAdminPwd(String adminPwd) {
        this.adminPwd = adminPwd == null ? null : adminPwd.trim();
    }

    public String getAdminPortrait() {
        return adminPortrait;
    }

    public void setAdminPortrait(String adminPortrait) {
        this.adminPortrait = adminPortrait == null ? null : adminPortrait.trim();
    }
}