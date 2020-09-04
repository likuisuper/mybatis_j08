package tech.aistar.entity;


import java.io.Serializable;

public class UserInfo implements Serializable {

  private Long id;
  private String username;
  private String userAddress;

  public UserInfo() {
  }

  public UserInfo(String username, String userAddress) {
    this.username = username;
    this.userAddress = userAddress;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getUserAddress() {
    return userAddress;
  }

  public void setUserAddress(String userAddress) {
    this.userAddress = userAddress;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Userinfo{");
    sb.append("id=").append(id);
    sb.append(", username='").append(username).append('\'');
    sb.append(", userAddress='").append(userAddress).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
