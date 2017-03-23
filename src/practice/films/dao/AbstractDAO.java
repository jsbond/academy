package practice.films.dao;

import java.sql.Connection;

import org.apache.log4j.Logger;

public abstract class AbstractDAO<E> {
    protected Connection mysqlConnection = JDBCFactory.getConnection();
    protected String GET_QUERY;
    protected Logger logger = Logger.getLogger(this.getClass());

    public abstract E get(long id);
}
