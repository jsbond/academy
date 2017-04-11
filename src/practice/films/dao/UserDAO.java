package practice.films.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import practice.films.model.User;

public class UserDAO extends AbstractDAO<User> {
    private static UserDAO userDAO;
    private static String GET_BY_LOGIN = "SELECT `login`, `password` FROM `users` WHERE `login`=?";

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

    public User getByLogin(String login) {
        User user = new User();

        try (PreparedStatement statement = mysqlConnection.prepareStatement(GET_BY_LOGIN)) {
            statement.setString(1, login);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                user.setLogin(rs.getString(1));
                user.setPassword(rs.getString(2));
            }

        } catch (SQLException e) {
            logger.error("can't get user with login" + login + " root exception is: " + e.getMessage());
        }
        return user;
    }


}
