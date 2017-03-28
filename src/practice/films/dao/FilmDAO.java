package practice.films.dao;

import java.util.List;

import com.google.common.collect.ImmutableList;
import practice.films.model.Film;

public class FilmDAO {
    private static FilmDAO filmDAO;

    private FilmDAO() {
    }

    public static FilmDAO getInstance() {
        if (filmDAO == null) {
            filmDAO = new FilmDAO();
        }
        return filmDAO;
    }

    //TODO: need to implement
    public List<Film> getAll() {
        Film film = new Film();
        film.setDescription("description");
        film.setName("name");
        return ImmutableList.of(film);
    }
}
