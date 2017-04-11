package practice.films.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.google.common.collect.ImmutableList;
import practice.films.model.Movie;

public class MovieDAO extends AbstractDAO<Movie> {

    public Movie get(long id) {
        Movie movie = new Movie();

        try (Statement statement = mysqlConnection.createStatement()) {
            ResultSet rs = statement.executeQuery(
                    "SELECT `id`, `name`, `description`, `rating` from movies where id=" + id);

            while (rs.next()) {
                movie.setId(rs.getLong(1));
                movie.setName(rs.getString(2));
                movie.setDescription(rs.getString(3));
                movie.setRating(rs.getInt(4));
            }
            return movie;
        } catch (SQLException e) {
            logger.error(e.getMessage());
            return null;
        }
    }

//    public User get(long id) {
//        User user = new User();
//        try (Statement statement = mysqlConnection.createStatement()) {
//
//            ResultSet rs = statement.executeQuery(GET_QUERY + id);
//
//            while (rs.next()) {
//                user.setLogin(rs.getString(1));
//                user.setEmail(rs.getString(2));
//            }
//
//        } catch (SQLException e) {
//            logger.error("can't get user with id" + id + " root exception is: " + e.getMessage());
//        }
//        return user;
//    }


    private static MovieDAO movieDAO;

    private MovieDAO() {
    }

    public static MovieDAO getInstance() {
        if (movieDAO == null) {
            movieDAO = new MovieDAO();
        }
        return movieDAO;
    }

    //TODO: need to implement
    public List<Movie> getAll() {
        Movie movie = new Movie();
        movie.setDescription("description");
        movie.setName("name");
        return ImmutableList.of(movie);
    }
}
