package tech.aistar.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 本类功能:实体类
 *
 * @author cxylk
 * @date 2020/8/27 11:12
 */
public class User implements Serializable {
    private Integer id;

    private String userName;

    private String password;

    private Date birthday;

    private Gender gender;

    public User() {
    }


    public User(String userName, String password, Date birthday, Gender gender) {
        this.userName = userName;
        this.password = password;
        this.birthday = birthday;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return userName;
    }

    public void setUsername(String username) {
        this.userName = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", username='").append(userName).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", birthday=").append(birthday);
        sb.append(", gender=").append(gender);
        sb.append('}');
        return sb.toString();
    }
}
