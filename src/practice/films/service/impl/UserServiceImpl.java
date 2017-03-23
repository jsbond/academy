package practice.films.service.impl;


import practice.films.dao.UserDAO;
import practice.films.model.User;
import practice.films.service.UserService;


public class UserServiceImpl implements UserService {

    private UserDAO userDAO;

    private static UserServiceImpl userService;

    private UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public static UserServiceImpl getInstance() {
        if (userService == null) {
            userService = new UserServiceImpl(UserDAO.getInstance());
        }
        return userService;
    }

    public User getUserById(long id) {
        return userDAO.get(id);
    }


}
