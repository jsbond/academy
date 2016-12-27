package practice.monkey2.monkeys;

import practice.monkey2.Branch;
import practice.monkey2.Fruit;

import java.util.List;

/**
 * Created by StudentTC on 27.12.2016.
 */
public class BananaMonkey extends Monkey {
    private final String FRUIT_TYPE = "banana";

    @Override
    protected boolean isCalculatable(Fruit fruit) {
        return FRUIT_TYPE.equals(fruit.getType());
    }
}
