package tech.codeforc.source.orm.core;

import java.sql.SQLException;
import java.util.List;

/**
 * Author: Ifan·Huang
 * Description: 会话对象
 **/
public interface SqlSession {

    /**
     * 查询多个，条件查询
     * @param statementId sql唯一标识
     * @param <E> 泛型
     * @return E
     */
    <E> List<E> selectList(String statementId, Object... params) throws SQLException;

    <E> E selectOne(String statementId, Object... params);
}
