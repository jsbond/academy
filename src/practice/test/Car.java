package practice.test;

/**
 * Car class demonstrates simple java program example.
 */
public class Car {
    int wheels = 4;

    /**
     * @param args
     */
    public static void main(String[] args) {
        //commentary
        int x = 2;

        int result = run(x, 2);
//        System.out.println(result);

        Car auto = new Car();
        auto.wheels = 3;

        System.out.println(auto.wheels);
    }

    /**
     * calculate sum of two numbers.
     * @param x
     * @param y
     */
    public static int run(int x, int y) {

//        System.out.println(x + y + 2);
        return x + y;
    }

    public int getWheels() {

        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}
