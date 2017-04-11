package practice.films.web.controller;

import practice.films.model.User;
import practice.films.service.UserService;
import practice.films.service.impl.UserServiceImpl;
import practice.films.web.http.Component;
import practice.films.web.http.HttpMethod;
import practice.films.web.http.RequestMapping;

@Component
public class UserController implements Controller {

    private UserService userService;

    @RequestMapping(httpMethod = HttpMethod.GET, path = "/users/{userId}")
    public User getUser(String userId) {
        return userService.getUserById(Long.parseLong(userId));
    }

    @RequestMapping(httpMethod = HttpMethod.POST, path = "/users/login")
    public String login(String login, String password) {
        return userService.login(login, password);
    }

    private static UserController userController;
    private UserController(UserService userService) {
        this.userService = userService;
    }

    public static UserController getInstance() {
        if (userController == null) {
            userController = new UserController(UserServiceImpl.getInstance());
        }
        return userController;
    }
}
