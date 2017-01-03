package theory.lecture_10.ex_2_annotations.application;

import theory.lecture_10.ex_2_annotations.framework.Bob;

/**
 * Класс демонстрирует использование написанного фреймворка.
 * Мы создаем людей (имплементят Man) и в зависимости от того,
 * кем человек является Бобу, он рассказывает историю, здоровается с женой,
 * спрашивает имя незнакомца
 */
public class Service {
    public static void main(String[] args) {
        Bob bob = new Bob();
        Jack jack = new Jack();
        Sara sara = new Sara();
        Vasya vasya = new Vasya();

        System.err.println(bob.tellStory(jack));
    }
}
