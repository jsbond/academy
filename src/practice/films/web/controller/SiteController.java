package practice.films.web.controller;

import java.util.List;

import practice.films.model.Film;
import practice.films.service.FilmService;
import practice.films.service.impl.FilmServiceImpl;
import practice.films.web.http.Component;
import practice.films.web.http.HttpMethod;
import practice.films.web.http.RequestMapping;

@Component
public class SiteController implements Controller {

    private FilmService filmService;

    //TODO add real functional with categories and another info on this page
    @RequestMapping(httpMethod = HttpMethod.GET, path = "")
    public List<Film> startMenu() {
        return filmService.getFilms();
    }



    private static SiteController siteController;
    private SiteController(FilmService filmService) {
        this.filmService = filmService;
    }

    public static SiteController getInstance() {
        if (siteController == null) {
            siteController = new SiteController(FilmServiceImpl.getInstance());
        }
        return siteController;
    }
}
