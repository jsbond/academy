package theory.lecture_6.inner_classes.inner.ex_3_anonimous_classes;

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
