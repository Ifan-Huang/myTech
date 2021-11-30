package tech.codeforc.source.orm.core;

import org.dom4j.DocumentException;
import tech.codeforc.source.orm.config.XmlConfigBuilder;

import java.beans.PropertyVetoException;
import java.io.InputStream;

/**
 * Author: Ifan·Huang
 * Description: 使用dom4j解析配置文件，将解析出来的内容封装到configuration中。创建sqlSessionFactory对象
 **/
public class SqlSessionFactoryBuilder {

    /**
     * 通过xmlConfigBuilder解析出configuration
     *
     * @param is
     * @return
     */
    public SqlSessionFactory build(InputStream is) throws PropertyVetoException, DocumentException {
        XmlConfigBuilder xmlConfigBuilder = new XmlConfigBuilder();
        Configuration configuration = xmlConfigBuilder.parse(is);

        //TODO
        return null;
    }
}
