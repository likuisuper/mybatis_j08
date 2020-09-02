package tech.aistar.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import tech.aistar.entity.Gender;
import tech.aistar.entity.User;
import tech.aistar.util.MybatisUtil;

import java.util.Date;
import java.util.List;

/**
 * 本类功能:
 *
 * @author cxylk
 * @date 2020/9/1 19:30
 */
public class TestUserMapper {
    @Test
    public void testFindAll(){
        SqlSession sqlSession= MybatisUtil.getSqlSession();
        //获取mapper对象
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);

        List<User> users=userMapper.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void testSave(){
        SqlSession sqlSession=null;
        try {
            sqlSession=MybatisUtil.getSqlSession();
            UserMapper userMapper=sqlSession.getMapper(UserMapper.class);

            User user=new User("tom3","123",new Date(), Gender.F);
            userMapper.save(user);

            //执行DML操作一定要手动提交事务
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MybatisUtil.close(sqlSession);
        }
    }

    @Test
    public void testGetById(){
        SqlSession sqlSession=MybatisUtil.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        User user=userMapper.getById(2);
        System.out.println(user);
    }
}
