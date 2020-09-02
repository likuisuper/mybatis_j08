package tech.aistar.dao;

import org.junit.jupiter.api.Test;
import tech.aistar.dao.impl.UserDaoImpl;
import tech.aistar.entity.User;

import java.util.List;

/**
 * 本类功能:
 *
 * @author cxylk
 * @date 2020/9/1 10:43
 */
public class TestUserDao {
    private IUserDao userDao=new UserDaoImpl();
    @Test
    public void testFindAll(){
        List<User> users=userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testGetByUserName(){
        User user=userDao.getByUserName("tom2");
        System.out.println(user);
    }
}
