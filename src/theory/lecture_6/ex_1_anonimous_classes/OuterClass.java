package theory.lecture_6.ex_1_anonimous_classes;

/**
 * Created by StudentTC on 20.12.2016.
 */
public class OuterClass {
    public static void main(String[] args) {
        Runnable object = new Runnable() {
            @Override
            public void run() {

            }

            public void jump() {

            }
        };

    }
}
