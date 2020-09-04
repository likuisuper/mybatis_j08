package tech.aistar.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tech.aistar.entity.Role;
import tech.aistar.util.MybatisUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * 本类功能:
 *
 * @author cxylk
 * @date 2020/9/3 14:02
 */
public class TestRoleMapper {
    private SqlSession sqlSession;
    private RoleMapper roleMapper;
    @BeforeEach
    public void testBefore(){
        sqlSession= MybatisUtil.getSqlSession();
        roleMapper=sqlSession.getMapper(RoleMapper.class);
    }

    @AfterEach
    public void testAfter(){
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testFindRoleByName(){
        List<Role> roles=roleMapper.findRoleByName("导演");
        roles.forEach(System.out::println);
    }

    @Test
    public void testFindRoleByNameAndNote(){
        List<Role> roles=roleMapper.findRoleByNameAndNote("","好");
        roles.forEach(System.out::println);
    }

    @Test
    public void testFindRoleByRole(){
        Role role=new Role(2,"演","棒");
        //select * from t_role where 1=1 and id=?

        //select * from t_role where 1=1 and role_name like concat('%',?,'%')

        //select * from t_role where 1=1 and note like concat('%',?,'%')


        List<Role> roles=roleMapper.findRoleByRole(role);
        roles.forEach(System.out::println);
    }

    @Test
    public void testUpdateRoleById(){
        Role role=new Role(2,"刘德华","好的很");
        int m=roleMapper.updateRoleById(role);
        System.out.println(m);
    }

    @Test
    public void testSelectRoleByIds(){
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        //select * from t_role where id in ( ?,? )
        List<Role> roles=roleMapper.selectRoleByIds(list);
        roles.forEach(System.out::println);
    }
}
