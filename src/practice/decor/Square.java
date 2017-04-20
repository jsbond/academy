package practice.decor;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square: draw");
    }
}
