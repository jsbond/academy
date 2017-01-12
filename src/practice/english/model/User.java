package practice.english.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by StudentTC on 12.01.2017.
 */
public class User extends Entity {
    private String name;
    private String password;
    private List<Phrase> phrases = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Phrase> getPhrases() {
        return phrases;
    }

    public void setPhrases(List<Phrase> phrases) {
        this.phrases = phrases;
    }
}
