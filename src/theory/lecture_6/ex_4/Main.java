package theory.lecture_6.ex_4;

/**
 * Created by Lenovo on 09.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        User user1 = new User(null);
        User user2 = new User(null);
        User user3 = new User(null);
        User user4 = new User(null);



        User user11 = new User(getUsers());
        User user21 = new User(getUsers());
        User user31 = new User(getUsers());

        User[] uss = new User[3];
        uss[0] = user11;
        uss[1] = user21;
        uss[2] = user31;

        User ss = new User(uss);


    }

    public static User[] getUsers() {
        User[] users = new User[4];

        for (int i = 0; i < users.length; i++) {
            users[i] = new User(null);
        }
        return users;
    }

}
