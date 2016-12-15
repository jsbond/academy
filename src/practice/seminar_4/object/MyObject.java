package practice.seminar_4.object;

/**
 * Created by StudentTC on 15.12.2016.
 */
public class MyObject implements Cloneable {
    private int example;
    private int example1;
    private int example2;
    private int example3;
    private int example4;
    private MyObject field;

    public MyObject() {
        example = 1;
        example1 = 1;
        example2 = 1;

    }

    public MyObject(MyObject object) {
        if (object != null) {
            this.example = object.getExample();
            //делается для всех полей
        }
    }

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//
//         field = (MyObject) field.clone();
//    }



    public MyObject(int example3) {
        this();
        this.example3 = example3;
    }

    public MyObject(int example3, int example4) {
        this(example3);
        this.example4 = example4;
    }

    public int apply() {
        int example;
        this.example = 20;
        return 1;
    }

    public int apply(int anyInt) {
        return 1;
    }

    @Override
    public String toString() {
        return "vasya";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyObject myObject = (MyObject) o;

        if (example != myObject.example) return false;
        if (example1 != myObject.example1) return false;
        if (example2 != myObject.example2) return false;
        if (example3 != myObject.example3) return false;
        return example4 == myObject.example4;

    }

    @Override
    public int hashCode() {
        int result = example;
        result = 31 * result + example1;
        result = 31 * result + example2;
        result = 31 * result + example3;
        result = 31 * result + example4;
        return result;
    }

    public int getExample() {
        return example;
    }

    public void setExample(int example) {
        this.example = example;
    }

    public int getExample1() {
        return example1;
    }

    public void setExample1(int example1) {
        this.example1 = example1;
    }

    public int getExample2() {
        return example2;
    }

    public void setExample2(int example2) {
        this.example2 = example2;
    }

    public int getExample3() {
        return example3;
    }

    public void setExample3(int example3) {
        this.example3 = example3;
    }

    public int getExample4() {
        return example4;
    }

    public void setExample4(int example4) {
        this.example4 = example4;
    }

    public MyObject getField() {
        return field;
    }

    public void setField(MyObject field) {
        this.field = field;
    }
}
