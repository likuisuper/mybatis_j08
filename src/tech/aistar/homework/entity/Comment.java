package tech.aistar.homework.entity;


import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable {

  private Long id;
  private String content;
  private Long state;
  private Long praseCount;
  private Date createtime;
  private Date updatetime;

  public Comment() {
  }

  public Comment(String content, Long state, Long praseCount, Date createtime, Date updatetime) {
    this.content = content;
    this.state = state;
    this.praseCount = praseCount;
    this.createtime = createtime;
    this.updatetime = updatetime;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public Long getState() {
    return state;
  }

  public void setState(Long state) {
    this.state = state;
  }

  public Long getPraseCount() {
    return praseCount;
  }

  public void setPraseCount(Long praseCount) {
    this.praseCount = praseCount;
  }

  public Date getCreatetime() {
    return createtime;
  }

  public void setCreatetime(Date createtime) {
    this.createtime = createtime;
  }

  public Date getUpdatetime() {
    return updatetime;
  }

  public void setUpdatetime(Date updatetime) {
    this.updatetime = updatetime;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Comment{");
    sb.append("id=").append(id);
    sb.append(", content='").append(content).append('\'');
    sb.append(", state=").append(state);
    sb.append(", praseCount=").append(praseCount);
    sb.append(", createtime=").append(createtime);
    sb.append(", updatetime=").append(updatetime);
    sb.append('}');
    return sb.toString();
  }
}
