package tech.codeforc.source.orm.core;

/**
 * Author: Ifan·Huang
 * Description: 默认的会话工厂
 **/
public class DefaultSqlSessionFactory implements SqlSessionFactory {

    private Configuration configuration;

    public DefaultSqlSessionFactory(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(configuration);
    }
}
