package theory.lecture_6.inner_classes.inner.ex_3_anonimous_classes;

/**
 * Created by StudentTC on 20.12.2016.
 */
public class OuterClass implements Runnable {

    @Override
    public void run() {
        System.out.println("333");
    }

    public static void main(String[] args) {
        Runnable object = new Extended();
        object.run();

        Runnable object2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("222");
            }
        };
        object2.run();

        Runnable outer = new OuterClass();
        outer.run();

        Runnable object3 = new Runnable() {
            @Override
            public void run() {
                System.out.println("444");
            }
        };
        object3.run();

        Runnable[] array = new Runnable[5];
        array[0] = object;
        array[1] = object2;
        array[3] = object3;
        array[2] = outer;

        int x = 1;



    }
}
