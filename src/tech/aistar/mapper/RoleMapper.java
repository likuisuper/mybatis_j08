package tech.aistar.mapper;

import org.apache.ibatis.annotations.Param;
import tech.aistar.entity.Role;

import java.util.List;

/**
 * 本类功能:
 *
 * @author cxylk
 * @date 2020/9/3 14:00
 */
public interface RoleMapper {
    /**
     * 如果roleName为空，则查询所有role
     * 否则根据roleName查找
     * @param roleName
     * @return
     */
    List<Role> findRoleByName(@Param("rn") String roleName);

    /**
     * 如果roleName不为空，则根据roleName模糊查找
     * 如果note不为空，则根据note模糊查找
     * 如果roleName为空，就不作为查询条件
     * @param roleName
     * @param note
     * @return
     */
    List<Role> findRoleByNameAndNote(@Param("rn") String roleName,@Param("nt") String note);

    List<Role> findRoleByRole(Role role);

    /**
     * 如果role中名称不为空，则修改名称，为空则不修改
     *  备注不为空，则修改备注，为空则不修改
     *
     *  update role
     *  set role_name=#{rolename},note=#{note}
     *  where id=#{id}
     * @param role
     * @return
     */
    int updateRoleById(Role role);

    /**
     * select * from t_role
     * where id in(2,3,4)
     * @param ids
     * @return
     */
    List<Role> selectRoleByIds(List<Integer> ids);
}
