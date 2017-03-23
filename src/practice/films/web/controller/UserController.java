package practice.films.web.controller;

import practice.films.service.UserService;
import practice.films.service.impl.UserServiceImpl;

public class UserController implements Controller {
    private static UserController userController;
    private UserService userService;

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
