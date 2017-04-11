package practice.films.dao;

import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;

/**
 * Created by Lenovo on 06.04.2017.
 */
public class JDBCFactoryTest {
    @Test
    public void getConnection() throws Exception {
        Connection connection = JDBCFactory.getConnection();
        Assert.assertNotNull(connection);
    }

}