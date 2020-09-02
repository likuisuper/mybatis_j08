package tech.aistar.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.*;
import tech.aistar.entity.Gender;
import tech.aistar.entity.User;
import tech.aistar.util.MybatisUtil;

import java.util.Date;
import java.util.List;

/**
 * 本类功能:
 *
 * @author cxylk
 * @date 2020/9/1 20:04
 */
public class TestUserMapper2 {
    private SqlSession sqlSession;
    private UserMapper userMapper;
    @BeforeEach
    public void testBefore(){
        System.out.println("before...");
        //无论测试哪个方法，都会先执行@before方法
        sqlSession= MybatisUtil.getSqlSession();
        userMapper=sqlSession.getMapper(UserMapper.class);
    }

    @AfterEach
    public void testAfter(){
        System.out.println("after...");
        //无论测试哪个方法，@after最后执行
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testSave(){
        System.out.println("===");
        User user=new User("carmen2","123",new Date(), Gender.M);
        userMapper.save(user);
    }

    @Test
    public void testDelById(){
        userMapper.delById(3);
    }

    @Test
    public void testFindLikeUserName(){
        List<User> users=userMapper.findLikeUserName("tom");
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testUpdate(){
        User user=userMapper.getById(6);
        user.setUsername("faker");
        user.setGender(Gender.M);

        userMapper.update(user);
    }
}
