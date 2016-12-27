package practice.monkey2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by StudentTC on 27.12.2016.
 */
public class Branch {
    private List<Branch> branches = new ArrayList<>();
    private List<Fruit> fruits;

    public Branch(int size) {
        fruits = new ArrayList<>(size);
    }

    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }

    public List<Fruit> getFruits() {
        return fruits;
    }

    public void setFruits(List<Fruit> fruits) {
        this.fruits = fruits;
    }
}
