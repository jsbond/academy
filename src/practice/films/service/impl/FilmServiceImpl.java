package practice.films.service.impl;


import java.util.List;

import practice.films.dao.MovieDAO;
import practice.films.model.Movie;
import practice.films.service.FilmService;


public class FilmServiceImpl implements FilmService {
    private MovieDAO movieDAO;

    @Override
    public List<Movie> getFilms() {
        return movieDAO.getAll();
    }

    private static FilmServiceImpl filmService;
    private FilmServiceImpl(MovieDAO movieDAO) {
        this.movieDAO = movieDAO;
    }

    public static FilmServiceImpl getInstance() {
        if (filmService == null) {
            filmService = new FilmServiceImpl(MovieDAO.getInstance());
        }
        return filmService;
    }
}
