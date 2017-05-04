package theory.lecture_4.ex_1_objects;

import theory.lecture_4.ex_2_object.MyObject;

public class A {

    //статическая переменная относится к классу, обращаться к ней нужно используя название класса
    // A.staticInt = 20; но эта переменная объявлена приватной, к ней не будет доступа
    private static int staticInt = 10;
    //ленивая инициализация, т.е. отложенная, будет сделана не на этапе создания класса
    // (или объекта в случае с не статической переменной)
    private static final String staticString;
    private MyObject object;

    //переменная экземпляра, относится к экземпляру, т.е. объекту
    private int nonStaticInt;
    private long nonStaticLong;

    //статический блок нужен для инициализации переменных, относящихся к классу (статических переменных)
    static {
        staticString = "a";
    }

    //логический блок, внутри него можно писать код, который выполнится перед тем, как вызовется конструктор
    {
        nonStaticInt = 50;
    }

    //конструктор по умолчанию. Если его не написать, то все равно он есть,
    // исключение - если у вас есть конструктор с параметрами,
    // тогда конструктор по умолчанию отсутствует, его нужно написать
    public A() {
        nonStaticLong = 20L;
    }

    //конструктор с параметром.
    public A(int nonStaticInt) {
        //this() - это вызов конструктора по умолчанию.
        // Т.е. отработает сначала инициализация с помощью дефаултного конструктора, потом все остальное что в этом блоке
        this("abc");
        //this - это обращение к самому объекту, который мы создаем с помощью конструктора
        //таким образом мы инициализируем переменную, относящуюся к объекту.
        this.nonStaticInt = nonStaticInt;

    }

    public A(String s) {
        int x = 20;
        int y = 30;

        if (true) {
            System.out.println(10);
        } else {
            int f = x == 20
                    ? 5
                    : 4;
        }
    }

    public A(A a) {
        this.nonStaticInt = a.nonStaticInt;
        MyObject o = new MyObject();

        this.object = o;

    }

    public MyObject getObject() {
        MyObject copy = new MyObject();
        copy.setName(object.getName());
        return copy;
    }

    public void run() {
        String[] strings = {"abc", "cde"};
        String result = concat("1", "2");
    }

    public void jump() {
        String result = concat("a", "b", "c", "D");
    }

    public String concat(String... strings) {
        String result = "";

        for (int i = 0; i < strings.length; i++) {
            result += strings[i];
        }
        return result;
    }
}
