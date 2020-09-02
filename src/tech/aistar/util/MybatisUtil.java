package tech.aistar.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * 本类功能:
 *
 * @author cxylk
 * @date 2020/9/1 15:05
 */
public class MybatisUtil {
    //内存中只要存在一个即可.
    private static SqlSessionFactory factory = null;

    //通过静态代码块来读取mybatis-config.xml主配置文件
    static{
        try(InputStream in = Resources.getResourceAsStream("mybatis-config.xml")) {
            //2. 通过SqlSessionFactoryBuilder对象来利用mybatis-config.xml文件来构建出
            //数据源对象SqlSessionFactory
            factory = new SqlSessionFactoryBuilder().build(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    static{
//        try(InputStream in=Resources.getResourceAsStream("mybatis-config.xml")){
//            //通过SqlSessionFactoryBuilder对象来利用mybatis-config.xml文件来构建出
//            //数据源对象SqlSessionFactory
//            factory=new SqlSessionFactoryBuilder().build(in);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    /**
     * 获取SqlSession对象 = Connection + Cache[mybatis默认开启的一级缓存]
     *
     * 面向用户的,提供了操作DB的一系列的API.这些操作是线程不安全的.
     * @return
     */
    public static SqlSession getSqlSession() {
        return factory == null ? null : factory.openSession();
    }

    public static void close(SqlSession sqlSession){
        if(null!=sqlSession){
            sqlSession.close();
        }
    }
}
