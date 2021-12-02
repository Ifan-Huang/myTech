package tech.codeforc.source.orm.core;

import java.sql.SQLException;
import java.util.List;

/**
 * Author: Ifan·Huang
 * Description: 基本的会话对象
 **/
public class DefaultSqlSession implements SqlSession {

    private Configuration configuration;

    public DefaultSqlSession(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public <E> List<E> selectList(String statementId, Object... params) throws SQLException {
        SimpleExecutor simpleExecutor = new SimpleExecutor();
        return simpleExecutor.query(configuration, configuration.getMapperStatementMap().get(statementId), params);
    }

    @Override
    public <E> E selectOne(String statementId, Object... params) {
        return null;
    }
}
