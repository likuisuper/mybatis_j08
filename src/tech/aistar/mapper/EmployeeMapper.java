package tech.aistar.mapper;

import tech.aistar.dto.EmployeeAsset;
import tech.aistar.dto.EmployeeDate;
import tech.aistar.dto.EmployeeResult;
import tech.aistar.dto.StationCount;
import tech.aistar.entity.Employee;

import java.util.List;

/**
 * 本类功能:
 *
 * @author cxylk
 * @date 2020/9/3 11:28
 */
public interface EmployeeMapper {
    /**
     * 1.获取所有员工的基本信息 部门信息 领导姓名，分页展示，1页3条，要求也要输出总页数
     * @return
     */
    List<EmployeeResult> findAll();

    /**
     * 根据员工编号获取员工的编号 姓名 所属部门以及其借用的资产 借用原因 借用日期
     * @param id
     * @return
     */
    List<EmployeeAsset> findById(String empId);

    /**
     * 根据员工编号修改员工的所属部门
     */
    int updateDepartById(Employee employee);

    /**
     * 统计各岗位人数信息
     * @return
     */
    List<StationCount> getStationCount();

    /**
     * 根据资产编号或者资产名称或者资产状态，资产购买时间区间查询资产（动态SQL，只需要一条SQL就可以实现了）
     * @param employeeDate
     * @return
     */
    List<EmployeeDate> selectByDate(EmployeeDate employeeDate);
}
