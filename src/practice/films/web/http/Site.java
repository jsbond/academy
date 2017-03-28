package practice.films.web.http;

import java.util.Map;

import com.google.common.collect.ImmutableMap;

public class Site {
    private Map<String, String> pagesUrls= ImmutableMap.<String, String>builder()
            .put("start", Urls.START_MENU)
            .put("login form", Urls.LOGIN_FORM)
            .put("login", Urls.LOGIN)
            .put("sign in form", Urls.SIGN_IN_FORM)
            .put("sign in", Urls.SIGN_IN)
            .put("user info", Urls.USER_PROFILE)
            .put("films", Urls.FILMS)
            .put("film", Urls.FILM)
            .build();

    public Site() {
    }

    public String startMenu() {
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, String> entry: pagesUrls.entrySet()) {
            builder
                    .append(entry.getKey())
                    .append(" - ")
                    .append(entry.getValue());
        }
        return builder.toString();
    }

    private static class Urls {
        private static final String BASIC = "kinogo.com";
        private static final String START_MENU = HttpMethod.GET + ":" + BASIC;
        private static final String LOGIN_FORM = HttpMethod.GET + ":" + BASIC + "/users/login";
        private static final String LOGIN = HttpMethod.POST + ":" + BASIC + "/users/login";
        private static final String SIGN_IN_FORM = HttpMethod.GET + ":" + BASIC + "/users/sign";
        private static final String SIGN_IN = HttpMethod.POST + ":" + BASIC + "/users/sign";
        private static final String USER_PROFILE = HttpMethod.GET + ":" + BASIC + "/users/{userId}";
        private static final String FILMS = HttpMethod.GET + ":" + BASIC + "/films";
        private static final String FILM = HttpMethod.GET + ":" + BASIC + "/films/{filmId}";
    }
}
