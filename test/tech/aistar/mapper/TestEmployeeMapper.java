package tech.aistar.mapper;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tech.aistar.dto.EmployeeAsset;
import tech.aistar.dto.EmployeeDate;
import tech.aistar.dto.EmployeeResult;
import tech.aistar.dto.StationCount;
import tech.aistar.entity.Employee;
import tech.aistar.util.MybatisUtil;
import tech.aistar.util.StringToDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 本类功能:
 *
 * @author cxylk
 * @date 2020/9/3 12:22
 */
public class TestEmployeeMapper {
    private SqlSession sqlSession;
    private EmployeeMapper employeeMapper;
    @BeforeEach
    public void testBefore(){
        sqlSession= MybatisUtil.getSqlSession();
        employeeMapper=sqlSession.getMapper(EmployeeMapper.class);
    }

    @AfterEach
    public void testAfter(){
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testFindAll(){
        //一定要在查询之前设置分页参数
        PageHelper.startPage(1,3);
        List<EmployeeResult> list=employeeMapper.findAll();
        PageInfo<EmployeeResult> pageInfo=new PageInfo<EmployeeResult>(list);
        System.out.println(pageInfo);
        list.forEach(System.out::println);
    }

    @Test
    public void testFindById(){
        List<EmployeeAsset> list=employeeMapper.findById("00001");
        list.forEach(System.out::println);
    }

    @Test
    public void testUpdateDepartById(){
        Employee employee=new Employee();
        employee.setEmpId("00003");
        employee.setEmpDepartment(2);
        int length=employeeMapper.updateDepartById(employee);
        System.out.println(length);
    }

    @Test
    public void testGetStationCount(){
        List<StationCount> employees=employeeMapper.getStationCount();
        employees.forEach(System.out::println);
    }

    @Test
    public void selectByDate() throws ParseException {
        EmployeeDate employeeDate=new EmployeeDate();
        //employeeDate.setAssetId("0000001");
        employeeDate.setAssetPurDate(StringToDate.parse("2020-04-08","yyyy-MM-dd"));
        //employeeDate.setAssetName("华为pro");

        List<EmployeeDate> list=employeeMapper.selectByDate(employeeDate);
        list.forEach(System.out::println);
    }

}
