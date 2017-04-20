package practice.decor;

/**
 * Created by Lenovo on 13.04.2017.
 */
public class RedBorderDecorator extends AbstractDecorator {

    public RedBorderDecorator(AbstractDecorator decorator) {
        super(decorator);
    }

    public RedBorderDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void drawShape() {
        System.out.println("red border");
    }
}
