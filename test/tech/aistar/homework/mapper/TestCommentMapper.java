package tech.aistar.homework.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import tech.aistar.homework.entity.User;
import tech.aistar.util.MybatisUtil;

import java.util.List;

/**
 * 本类功能:
 *
 * @author cxylk
 * @date 2020/9/1 21:20
 */
public class TestCommentMapper {
    @Test
    public void testFindAll(){
        SqlSession sqlSession= MybatisUtil.getSqlSession();
        CommentMapper commentMapper=sqlSession.getMapper(CommentMapper.class);
        List<User> users=commentMapper.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
