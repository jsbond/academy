package practice.films.service;

import practice.films.model.User;

public interface UserService {
    User getUserById(long userId);
    String login(String login, String password);
}
