package theory.lecture_5.inheritance.ex_1_inh_is_bad;

import java.util.ArrayList;

public class Stack extends ArrayList {
    private int stack_pointer = 0;

    public void push(Object article) {
        add(stack_pointer++, article);
    }

    public Object pop() {
        return remove(--stack_pointer);
    }

    public void push_many(Object[] articles) {
        for (int i = 0; i < articles.length; ++i) {
            push(articles[i]);
        }
    }
}
