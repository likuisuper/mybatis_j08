package tech.aistar.mapper;

import tech.aistar.entity.UserInfo;

/**
 * 本类功能:
 *
 * @author cxylk
 * @date 2020/9/2 15:18
 */
public interface UserInfoMapper {
    /**
     * 主键回调
     * @param userInfo
     */
    void insertUserInfo(UserInfo userInfo);

    /**
     * resultMap方式查询
     * @return
     */
    UserInfo selectById(Integer id);
}
