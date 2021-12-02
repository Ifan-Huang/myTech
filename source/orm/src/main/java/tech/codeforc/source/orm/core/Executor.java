package tech.codeforc.source.orm.core;

import java.sql.SQLException;
import java.util.List;

public interface Executor {

    <E> List<E> query(Configuration configuration, MapperStatement mapperStatement, Object params) throws SQLException;
}
