package tech.codeforc.source.orm.config;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import tech.codeforc.source.orm.core.Configuration;
import tech.codeforc.source.orm.core.MapperStatement;

import java.io.InputStream;
import java.util.List;

/**
 * Author: Ifan·Huang
 * Description: mapper xml解析
 **/
public class XmlMapperBuilder {

    private Configuration configuration;

    public XmlMapperBuilder(Configuration configuration) {
        this.configuration = configuration;
    }

    public void parse(InputStream is) throws DocumentException {
        Document mapperDocument = new SAXReader().read(is);
        Element mapperRootElement = mapperDocument.getRootElement();
        List<Element> selectElements = mapperRootElement.selectNodes("//select");
        String namespace = mapperRootElement.attributeValue("namespace");
        for (Element selectElement : selectElements) {
            String id = selectElement.attributeValue("id");
            String resultType = selectElement.attributeValue("resultType");
            String parameterType = selectElement.attributeValue("parameterType");
            String sqlText = selectElement.getTextTrim();
            MapperStatement mapperStatement = new MapperStatement();
            mapperStatement.setId(id);
            mapperStatement.setParameterType(parameterType);
            mapperStatement.setResultType(resultType);
            mapperStatement.setSql(sqlText);
            configuration.getMapperStatementMap().put(namespace + "." + id, mapperStatement);
        }


    }
}
