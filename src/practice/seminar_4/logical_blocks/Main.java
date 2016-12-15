package practice.seminar_4.logical_blocks;

/**
 * Created by StudentTC on 15.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        int i = User.staticVariable;
        User user = new User();
        int x = user.staticVariable;
    }
}
