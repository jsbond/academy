package practice.films.web.http;

public class Main {
    public static void main(String[] args) {
        Dispatcher d = Dispatcher.getInstance();
        String s =  d.dispatch("GET:www.kinogo.com/users/1");

        System.out.println(s);



    }
}
