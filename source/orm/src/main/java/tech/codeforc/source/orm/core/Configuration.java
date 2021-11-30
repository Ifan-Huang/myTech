package tech.codeforc.source.orm.core;

import javax.sql.DataSource;
import java.util.Map;

/**
 * Author: Ifan·Huang
 * Description: 配置dataSource对象
 **/
public class Configuration {

    /**
     * jdbc default dataSource
     */
    private DataSource dataSource;

    /**
     * Key: statementId.
     * value: mapperStatement object
     */
    private Map<String, MapperStatement> mapperStatementMap;


    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Map<String, MapperStatement> getMapperStatementMap() {
        return mapperStatementMap;
    }

    public void setMapperStatementMap(Map<String, MapperStatement> mapperStatementMap) {
        this.mapperStatementMap = mapperStatementMap;
    }
}
