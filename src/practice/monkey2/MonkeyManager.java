package practice.monkey2;

import practice.monkey2.monkeys.BananaMonkey;
import practice.monkey2.monkeys.Monkey;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by StudentTC on 27.12.2016.
 */
public class MonkeyManager {
    public static void main(String[] args) {
        Branch tree = createTree();
        Monkey monkey = new BananaMonkey();

        int result = getCount(tree, monkey);
        System.out.println(result);
    }

    public static Branch createTree() {
        Branch tree = new Branch(7);
        populateFruits(tree, 7);
        populateBranches(tree, 5);

        return tree;
    }

    private static void populateBranches(Branch tree, int size) {
        List<Branch> branches = new ArrayList<>();

        for (int i = 0; i < size; i++ ) {
            Branch branch = new Branch(10);
            populateFruits(branch, 3);
            branches.add(branch);
        }
        tree.setBranches(branches);
    }

    private static void populateFruits(Branch tree, int size) {
        List<Fruit> fruitList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            fruitList.add(new Fruit("banana"));
        }
        tree.setFruits(fruitList);
    }

    public static int getCount(Branch branch, Monkey monkey) {
        return monkey.calculate(branch);
    }
}
