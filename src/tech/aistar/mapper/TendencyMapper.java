package tech.aistar.mapper;

import org.apache.ibatis.annotations.Param;
import tech.aistar.dto.TendencyResult;
import tech.aistar.entity.Tendency;
import tech.aistar.params.PageInfoParameter;
import tech.aistar.params.TendecyQueryParameter;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 本类功能:
 *
 * @author cxylk
 * @date 2020/9/2 20:36
 */
public interface TendencyMapper {
    /**
     * 根据供应商编号查询
     * @param supCode
     * @return
     */
    List<Tendency> selectBySupCode(String supCode);

    /**
     * 参数不超过3个
     * 根据supcode与创建日期在开始日期结束日期之间进行查询
     * @Param 传递多个参数时，用于指定相应的参数及名称
     */
    List<Tendency> selectBySupCodeAndDate(@Param("sc") String supCode, @Param("cd") Date startDate, @Param("ed") Date endStart);

    /**
     * 参数过多使用对象去完成
     * @param tqp
     * @return
     */
    List<TendencyResult> selectBySupCodeAndDateObject(TendecyQueryParameter tqp);

    List<TendencyResult> selectBySupCodeAndDateMap(Map<String,Object> map);

    List<TendencyResult> selectByPage(@Param("tqp") TendecyQueryParameter tqp, @Param("pip")PageInfoParameter pip);
}
