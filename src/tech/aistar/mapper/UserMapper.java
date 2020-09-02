package tech.aistar.mapper;

import tech.aistar.entity.User;

import java.util.List;

/**
 * 本类功能:持久层接口
 *
 * @author cxylk
 * @date 2020/9/1 19:27
 */
public interface UserMapper {
    List<User> findAll();

    /**
     * 保存一个用户
     * @param user
     */
    void save(User user);

    /**
     * 根据ID获取
     * @param id
     * @return
     */
    User getById(Integer id);

    void delById(Integer id);

    /**
     * 模糊查询
     * @param userName
     * @return
     */
    List<User> findLikeUserName(String userName);

    /**
     * 更新
     * @param user
     */
    void update(User user);
}
