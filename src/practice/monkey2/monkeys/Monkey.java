package practice.monkey2.monkeys;

import practice.monkey2.Branch;
import practice.monkey2.Fruit;

import java.util.List;

/**
 * Created by StudentTC on 27.12.2016.
 */
public abstract class Monkey {
    private int count;

    public int calculate(Branch branch) {
        List<Fruit> fruits = branch.getFruits();

        for (Fruit fruit : fruits) {
            if (isCalculatable(fruit)) {
                count++;
            }
        }
        for (Branch child : branch.getBranches()) {
            calculate(child);
        }
        return count;
    }

    protected abstract boolean isCalculatable(Fruit fruit);

}
