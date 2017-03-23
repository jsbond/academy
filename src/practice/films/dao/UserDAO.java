package practice.films.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import practice.films.model.User;

public class UserDAO extends AbstractDAO<User> {
    private static UserDAO userDAO;

    private UserDAO() {
    }

    public static UserDAO getInstance() {
        if (userDAO == null) {
            userDAO = new UserDAO();
        }
        return userDAO;
    }

    public User get(long id) {
        User user = new User();
        try (Statement statement = mysqlConnection.createStatement()) {

            ResultSet rs = statement.executeQuery(GET_QUERY + id);

            while (rs.next()) {
                user.setLogin(rs.getString(1));
                user.setEmail(rs.getString(2));
            }

        } catch (SQLException e) {
            logger.error("can't get user with id" + id + " root exception is: " + e.getMessage());
        }
        return user;
    }


}
