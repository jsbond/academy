package practice.seminar_9.example.framework;

import practice.seminar_9.example.application.Sara;

import java.lang.annotation.Annotation;

/**
 * Created by StudentTC on 03.11.2016.
 */
public class Bob implements Man {

    public String tellStory(Man man) {
        String result = "ты кто такой?";
        Class clazz = man.getClass();
        if (clazz.isAnnotationPresent(Wife.class)) {
            result = "привет, дорогая";
        } else if (clazz.isAnnotationPresent(Friend.class)){
            Friend annotation = (Friend) clazz.getAnnotation(Friend.class);
            result = "привет, " + annotation.name();
        }
        return result;
    }
}
