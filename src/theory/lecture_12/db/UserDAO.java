package theory.lecture_12.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO extends AbstractDAO {

    String getQuery = "SELECT * FROM employee WHERE id=";

    @Override
    public User getUser(int userId) {
        User user = new User();
        try (Statement statement = connection.createStatement()) {

            ResultSet rs = statement.executeQuery(getQuery + userId);
//            statement.executeUpdate(getQuery);

            while (rs.next()) {
                user.setName(rs.getString(1));
                user.setAge(rs.getInt(2));
                //номер текущей колонки
//                rs.getRow();

            }

        } catch (SQLException e) {
        }
        return user;
    }
}
