package tech.codeforc.source.orm.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import tech.codeforc.source.orm.core.Configuration;

import java.beans.PropertyVetoException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

/**
 * Author: Ifan·Huang
 * Description: 使用dom4j
 **/
public class XmlConfigBuilder {

    private Configuration configuration;

    public XmlConfigBuilder() {
        this.configuration = new Configuration();
    }

    public Configuration parse(InputStream is) throws DocumentException, PropertyVetoException {
        Document configurationDocument = new SAXReader().read(is);
        Element rootElement = configurationDocument.getRootElement();
        List<Element> dataSourceElements = rootElement.selectNodes("//property");
        Properties configurationProperties = new Properties();
        for (Element dataSourceElement : dataSourceElements) {
            String name = dataSourceElement.attributeValue("name");
            String value = dataSourceElement.attributeValue("value");
            configurationProperties.setProperty(name, value);
        }

        configuration.setDataSource(loadDataSource(configurationProperties));

        return configuration;
    }

    private ComboPooledDataSource loadDataSource(Properties configurationProperties) throws PropertyVetoException {
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setDriverClass(configurationProperties.getProperty("driverClass"));
        comboPooledDataSource.setJdbcUrl(configurationProperties.getProperty("url"));
        comboPooledDataSource.setUser(configurationProperties.getProperty("username"));
        comboPooledDataSource.setPassword(configurationProperties.getProperty("password"));
        return comboPooledDataSource;
    }
}

