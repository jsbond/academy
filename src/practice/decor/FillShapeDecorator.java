package practice.decor;

/**
 * Created by Lenovo on 13.04.2017.
 */
public class FillShapeDecorator extends AbstractDecorator {

    public FillShapeDecorator(AbstractDecorator decorator) {
        super(decorator);
    }

    public FillShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void drawShape() {
        System.out.println("fill shape with black color");
    }

}
