package theory.lecture_15.creational;

import com.google.common.collect.ImmutableList;
import theory.lecture_15.creational.builder.ChickenBurger;
import theory.lecture_15.creational.builder.Coke;
import theory.lecture_15.creational.builder.Meal;

/**
 * Created by Lenovo on 13.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        Meal meal = Meal.builder()
                .addItem(new ChickenBurger())
                .addItem(new Coke())
                .addItem(new ChickenBurger())
                .build();

        ImmutableList<Integer> list = ImmutableList.<Integer>builder()
                .add(1).add(2)
                .build();
    }
}
