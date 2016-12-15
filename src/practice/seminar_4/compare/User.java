package practice.seminar_4.compare;

/**
 * Created by StudentTC on 15.12.2016.
 */
public class User implements Comparable {
    private String login;
    private int counter;

    @Override
    public int compareTo(Object o) {
        User that = (User) o;
//        login.charAt(0);
        return this.counter - that.counter;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
