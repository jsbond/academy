package theory.lecture_4.ex_2_object;

public class MyObject {
    private String name;
    public static void main(String[] args) {
        MyObject object = new MyObject();
        MyObject object2 = new MyObject();

        object.equals(object2);
        object.hashCode();

        object.toString();

//        object.finalize();
//        object.getClass();
//        object.notify();
//        object.notifyAll();
//        object.wait();
//
//        object.clone();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
