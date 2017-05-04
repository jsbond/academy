package theory.lecture_3.ex_3_params;

public class MyObject {

    private int primitive = 10;
    private String string = "yes";


    public int getPrimitive() {
        return primitive;
    }

    public void setPrimitive(int primitive) {
        this.primitive = primitive;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return "MyObject{" +
                "primitive=" + primitive +
                ", string='" + string + '\'' +
                '}';
    }
}
