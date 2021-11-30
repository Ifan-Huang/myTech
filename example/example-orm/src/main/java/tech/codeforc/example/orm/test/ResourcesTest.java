package tech.codeforc.example.orm.test;

import org.dom4j.DocumentException;
import tech.codeforc.source.orm.core.SqlSessionFactory;
import tech.codeforc.source.orm.core.SqlSessionFactoryBuilder;
import tech.codeforc.source.orm.io.Resources;

import java.beans.PropertyVetoException;
import java.io.InputStream;

/**
 * Author: Ifan·Huang
 * Description: 测试resource读取配置文件
 **/
public class ResourcesTest {

    public void test() throws PropertyVetoException, DocumentException {
        InputStream resourceAsSteam = Resources.getResourceAsSteam("SqlMapperConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsSteam);

    }

}
