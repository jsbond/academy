package theory.lecture_12.db;

import java.sql.Connection;

public abstract class AbstractDAO {
    Connection connection = JDBCFactory.getConnection();

    public abstract User getUser(int userId);
}
