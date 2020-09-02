package tech.aistar.homework.mapper;

import tech.aistar.homework.entity.User;

import java.util.List;

/**
 * 本类功能:
 *
 * @author cxylk
 * @date 2020/9/1 21:13
 */
public interface CommentMapper {
    List<User> findAll();
}
