package practice.decor;

/**
 * Created by Lenovo on 13.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        Shape shape = new Rectangle();

        AbstractDecorator decorator1 = new RedBorderDecorator(shape);
//        decorator1.draw();

        AbstractDecorator decorator2 = new FillShapeDecorator(decorator1);
        decorator2.draw();


    }
}
