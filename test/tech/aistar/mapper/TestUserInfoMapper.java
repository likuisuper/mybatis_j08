package tech.aistar.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tech.aistar.entity.UserInfo;
import tech.aistar.util.MybatisUtil;

/**
 * 本类功能:
 *
 * @author cxylk
 * @date 2020/9/2 15:30
 */
public class TestUserInfoMapper {
    private SqlSession sqlSession;
    private UserInfoMapper userInfoMapper;
    @BeforeEach
    public void testBefore(){
        sqlSession= MybatisUtil.getSqlSession();
        userInfoMapper=sqlSession.getMapper(UserInfoMapper.class);
    }

    @AfterEach
    public void testAfter(){
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testInsertUserInfo(){

        //不用设置主键，在xml文件中会回调(自动生成)
        UserInfo userInfo=new UserInfo("李四","苏州");


        userInfoMapper.insertUserInfo(userInfo);
    }

    @Test
    public void testSelectById(){
        UserInfo userInfo=userInfoMapper.selectById(2);
        System.out.println(userInfo);
    }
}
