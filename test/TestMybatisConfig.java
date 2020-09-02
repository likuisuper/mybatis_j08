import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * 本类功能:
 *
 * @author cxylk
 * @date 2020/9/1 10:00
 */
public class TestMybatisConfig {
    @Test
    public void testConfigXml(){
        //1.获取mybatis-config.xml文件输入流
        try {
            InputStream in= Resources.getResourceAsStream("mybatis-config.xml");

            //2.通过SqlSessionFactoryBuilder对象来利用mybatis-config.xml文件来构建出
            //数据对象SqlSessionFactory
            SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(in);

            //3.利用SqlSessionFactory来构建SqlSession对象
            SqlSession sqlSession=factory.openSession();

            System.out.println(sqlSession);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
