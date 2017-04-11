package practice.films.service.impl;


import practice.films.dao.UserDAO;
import practice.films.model.User;
import practice.films.service.UserService;


public class UserServiceImpl implements UserService {
    private static final String CONST = "ABC";
    private UserDAO userDAO;

    public String login(String login, String password) {
        if (login == null || password == null) return "Please try again";

        User user = userDAO.getByLogin(login);

        String result = "Please try again";

        if (login.equals(user.getLogin()) && password.equals(user.getPassword())) {
            result = "Identification passed";
        }
        return result;
    }



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
