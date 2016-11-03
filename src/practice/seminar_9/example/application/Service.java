package practice.seminar_9.example.application;

import practice.seminar_9.example.framework.Bob;

/**
 * Created by StudentTC on 03.11.2016.
 */
public class Service {
    public static void main(String[] args) {
        Bob bob = new Bob();
        Jack jack = new Jack();
        Sara sara = new Sara();
        Vasya vasya = new Vasya();

        System.out.println(bob.tellStory(jack));
    }
}
