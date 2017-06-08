package theory.lecture_11_1.serialization;

public class Shape {
    Thread thread = Thread.currentThread();

    public Shape() {
        System.out.println("Конструктор родителя");
    }
}
