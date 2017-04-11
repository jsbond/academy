package theory.lecture_13.serialization;

public class Shape {
    Thread thread = Thread.currentThread();

    public Shape() {
        System.out.println("Конструктор родителя");
    }
}
