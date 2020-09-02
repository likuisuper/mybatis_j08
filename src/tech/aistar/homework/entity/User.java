package tech.aistar.homework.entity;


import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

  private Long id;
  private String username;
  private String password;
  private String status;
  private Date registerTime;

  public User() {
  }

  public User(String username, String password, String status, Date registerTime) {
    this.username = username;
    this.password = password;
    this.status = status;
    this.registerTime = registerTime;
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

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Date getRegisterTime() {
    return registerTime;
  }

  public void setRegisterTime(Date registerTime) {
    this.registerTime = registerTime;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("User{");
    sb.append("id=").append(id);
    sb.append(", username='").append(username).append('\'');
    sb.append(", password='").append(password).append('\'');
    sb.append(", status='").append(status).append('\'');
    sb.append(", registerTime=").append(registerTime);
    sb.append('}');
    return sb.toString();
  }
}
