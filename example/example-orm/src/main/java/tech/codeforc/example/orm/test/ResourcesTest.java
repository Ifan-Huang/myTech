package tech.codeforc.example.orm.test;

import org.dom4j.DocumentException;
import tech.codeforc.example.orm.entity.Product;
import tech.codeforc.example.orm.entity.User;
import tech.codeforc.source.orm.core.SqlSession;
import tech.codeforc.source.orm.core.SqlSessionFactory;
import tech.codeforc.source.orm.core.SqlSessionFactoryBuilder;
import tech.codeforc.source.orm.io.Resources;

import java.beans.PropertyVetoException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.List;

/**
 * Author: Ifan·Huang
 * Description: 测试resource读取配置文件
 **/
public class ResourcesTest {

    public void test() throws PropertyVetoException, DocumentException, SQLException {
        InputStream resourceAsSteam = Resources.getResourceAsSteam("SqlMapperConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsSteam);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        List<Product> products = sqlSession.selectList("product.selectList");
        List<User> users = sqlSession.selectList("user.selectList");
    }

}
