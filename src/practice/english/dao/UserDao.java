package practice.english.dao;

import practice.english.model.Phrase;
import practice.english.model.User;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by StudentTC on 12.01.2017.
 */
public class UserDao {
    /** name --> User */
    private Map<String, User> usersByName = new HashMap<>();

    public User getUserByName(String name) {
        return usersByName.get(name);
    }

    public void update(User user) {
        User fromDB = usersByName.get(user.getName());

        if (fromDB != null) {
            usersByName.put(user.getName(), user);
        }
    }





}
