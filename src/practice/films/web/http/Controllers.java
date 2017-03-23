package practice.films.web.http;

import java.util.Map;

import com.google.common.collect.ImmutableMap;
import practice.films.web.controller.Controller;
import practice.films.web.controller.UserController;

public class Controllers {
    private static Controllers controllers;
    private final Map<String, Controller> table;

    private  Controllers() {
        table = ImmutableMap.<String, Controller>builder()
                .put("/users", UserController.getInstance())
                .build();
    }

    public static Controllers getInstance() {
        if (controllers == null) {
            controllers = new Controllers();
        }
        return controllers;
    }

    public Controller get(String url) {
        return table.get(url);
    }
}
