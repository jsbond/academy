package theory.lecture_4.ex_3_compare;

/**
 * Created by Lenovo on 02.05.2017.
 */
public class Cat implements Comparable {
    private int age;
    private String name;
    private int count;

    @Override
    public int compareTo(Object o) {
        if (o.getClass() != this.getClass()) return 1;

        Cat that = (Cat) o;

        return this.age - that.age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        if (age != cat.age) return false;
        if (count != cat.count) return false;
        return name.equals(cat.name);
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + name.hashCode();
        result = 31 * result + count;
        return result;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", count=" + count +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
