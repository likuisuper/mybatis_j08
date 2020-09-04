package tech.aistar.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tech.aistar.dto.TendencyResult;
import tech.aistar.entity.Tendency;
import tech.aistar.params.PageInfoParameter;
import tech.aistar.params.TendecyQueryParameter;
import tech.aistar.util.MybatisUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 本类功能:
 *
 * @author cxylk
 * @date 2020/9/2 20:40
 */
public class TestTendencyMapper {
    private SqlSession sqlSession;
    private TendencyMapper tendencyMapper;
    @BeforeEach
    public void testBefore(){
        sqlSession= MybatisUtil.getSqlSession();
        tendencyMapper=sqlSession.getMapper(TendencyMapper.class);
    }
    @AfterEach
    public void testAfter(){
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testSelectBySupCode(){
        List<Tendency> list=tendencyMapper.selectBySupCode("AP-001");
        list.forEach(System.out::println);
    }

    @Test
    public void testSelectBySupCodeAndDate() throws ParseException {
        Date createDate=parse("2017-01","yyyy-MM");
        Date endDate=parse("2017-10","yyyy-MM");
        List<Tendency> list=tendencyMapper.selectBySupCodeAndDate("AP-001",createDate,endDate);
        list.forEach(System.out::println);
    }

    @Test
    public void testSelectBySupCodeAndDateObject() throws ParseException {
        TendecyQueryParameter tendecyQueryParameter=new TendecyQueryParameter();

        //supCode=AP-001 startDate=2017-01 endDate=2017-12
        tendecyQueryParameter.setSupCode("AP-001");
        tendecyQueryParameter.setStartDate(parse("2017-01","yyyy-MM"));
        //小于等于2017-12-01 00:00:00 要加1 <=2018-01-01 00:00:00
        tendecyQueryParameter.setEndDate(parse("2017-12","yyyy-MM"));

        List<TendencyResult> tendencyResults=tendencyMapper.selectBySupCodeAndDateObject(tendecyQueryParameter);
        tendencyResults.forEach(System.out::println);

    }

    @Test
    public void testSelectBySupCodeAndDateMap() throws ParseException {
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("supCode","AP-001");
        map.put("startDate",parse("2017-01","yyyy-MM"));
        map.put("endDate",parse("2017-12","yyyy-MM"));
        List<TendencyResult> tendencyList=tendencyMapper.selectBySupCodeAndDateMap(map);
        tendencyList.forEach(System.out::println);
    }

    @Test
    public void testSelectByPage() throws ParseException {
        TendecyQueryParameter tendecyQueryParameter=new TendecyQueryParameter();
        tendecyQueryParameter.setSupCode("AP-001");
        tendecyQueryParameter.setStartDate(parse("2017-01","yyyy-MM"));
        tendecyQueryParameter.setEndDate(parse("2017-12","yyyy-MM"));

        PageInfoParameter pageInfoParameter=new PageInfoParameter();
        pageInfoParameter.setStartOffset(2);
        pageInfoParameter.setPageSize(2);

        List<TendencyResult> tendencyResults=tendencyMapper.selectByPage(tendecyQueryParameter,pageInfoParameter);

        System.out.println(tendencyResults.size());

        tendencyResults.forEach(System.out::println);
    }

    public static Date parse(String sdate,String pattern) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat(pattern);
        Date date=sdf.parse(sdate);
        return date;
    }
}
