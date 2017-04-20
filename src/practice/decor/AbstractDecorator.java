package practice.decor;

/**
 * Created by Lenovo on 13.04.2017.
 */
public abstract class AbstractDecorator {
    protected AbstractDecorator decorator;
    protected Shape shape;

    public AbstractDecorator(AbstractDecorator decorator) {
        this.decorator = decorator;
    }

    public AbstractDecorator(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        if (shape != null) {
            shape.draw();
        }
        if (decorator != null) {
            decorator.draw();
        }
        drawShape();
    }

    public abstract void drawShape();
}
