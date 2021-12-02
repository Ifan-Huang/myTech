package tech.codeforc.source.orm.core;

/**
 * Author: Ifan·Huang
 * Description: 会话工厂
 **/
public interface SqlSessionFactory {

    SqlSession openSession();
}
