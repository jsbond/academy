package practice.films.service.impl;


import java.util.List;

import practice.films.dao.FilmDAO;
import practice.films.model.Film;
import practice.films.service.FilmService;


public class FilmServiceImpl implements FilmService {
    private FilmDAO filmDAO;

    @Override
    public List<Film> getFilms() {
        return filmDAO.getAll();
    }

    private static FilmServiceImpl filmService;
    private FilmServiceImpl(FilmDAO filmDAO) {
        this.filmDAO = filmDAO;
    }

    public static FilmServiceImpl getInstance() {
        if (filmService == null) {
            filmService = new FilmServiceImpl(FilmDAO.getInstance());
        }
        return filmService;
    }
}
