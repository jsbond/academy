package practice.films.dao;

import org.junit.Assert;
import org.junit.Test;
import practice.films.model.Movie;

import static org.junit.Assert.*;

/**
 * Created by Lenovo on 06.04.2017.
 */
public class MovieDAOTest {
    @Test
    public void test_get() {
        MovieDAO dao = MovieDAO.getInstance();

        Movie expected = new Movie();
        expected.setId(1L);
        expected.setName("Город грехов");
        expected.setRating(100);
        expected.setDescription("это город грехов");

        Movie actual = dao.get(1);
        Assert.assertNotNull(actual);
        Assert.assertEquals(expected, actual);


    }

}