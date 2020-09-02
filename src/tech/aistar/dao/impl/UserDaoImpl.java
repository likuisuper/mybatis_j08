package tech.aistar.dao.impl;

import org.apache.ibatis.session.SqlSession;
import tech.aistar.dao.IUserDao;
import tech.aistar.entity.User;
import tech.aistar.util.MybatisUtil;

import java.util.List;

/**
 * 本类功能:
 *
 * @author cxylk
 * @date 2020/9/1 10:40
 */
public class UserDaoImpl implements IUserDao{
    @Override
    public List<User> findAll() {
        //1.获取SqlSession对象
        SqlSession sqlSession= MybatisUtil.getSqlSession();

        //selectList参数告诉程序使用的是哪个mapper.xml文件中的哪条sql标签下的sql语句
        List<User> users=sqlSession.selectList("user.getAll");
        sqlSession.commit();
        return users;
    }

    @Override
    public User getByUserName(String username) {
        SqlSession sqlSession=MybatisUtil.getSqlSession();

        User user=sqlSession.selectOne("user.findName",username);
        sqlSession.commit();
        sqlSession.close();
        return user;
    }
}
