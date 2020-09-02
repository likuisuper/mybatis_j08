package tech.aistar.dao;

import tech.aistar.entity.User;

import java.util.List;

/**
 * 本类功能:
 *
 * @author cxylk
 * @date 2020/9/1 10:39
 */
public interface IUserDao {
    List<User> findAll();

    /**
     * 根据用户的名称进行查询
     * @param username 唯一的
     * @return
     */
    User getByUserName(String username);
}
