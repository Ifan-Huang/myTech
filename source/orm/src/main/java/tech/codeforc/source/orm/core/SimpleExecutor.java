package tech.codeforc.source.orm.core;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Author: Ifan·Huang
 * Description: 简易执行器
 **/
public class SimpleExecutor implements Executor {

    /**
     * 执行JDBC代码
     * 注册驱动、获取链接
     * 获取sql语句、转换sql语句
     */
    @Override
    public <E> List<E> query(Configuration configuration, MapperStatement mapperStatement, Object params) throws SQLException {
        DataSource dataSource = configuration.getDataSource();
        Connection connection = dataSource.getConnection();
        String sql = mapperStatement.getSql();
        BoundSql boundSql = getBoundSql(sql);

        return null;
    }

    /**
     * 对占位符的解析
     */
    private BoundSql getBoundSql(String sql) {

        return null;
    }
}
