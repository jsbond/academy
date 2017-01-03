package theory.lecture_10.ex_2_annotations.framework;

/**
 *
 */
public class Bob implements Man {
    //для того, чтобы рассказать историю, как плавал Боб из 9 лекции,
    // я мог наследоваться от класса и переопределить его метод,
    // но предпочел использовать композицию - т.е. текущий класс Bob -
    // это обертка над классом Bob из 9 лекции.
    private theory.lecture_9.ex_1_throw_exception.Bob bob = new theory.lecture_9.ex_1_throw_exception.Bob();


    public String tellStory(Man man) {

        String result = "ты кто такой?";
        Class clazz = man.getClass();


        if (clazz.isAnnotationPresent(Wife.class)) {
            result = "привет, дорогая";
        } else if (clazz.isAnnotationPresent(Friend.class)){
            Friend annotation = (Friend) clazz.getAnnotation(Friend.class);
            StringBuilder stringBuilder = new StringBuilder();

            result = stringBuilder
                    .append(annotation.name())
                    .append(", ")
                    .append(getStory()).toString();
        }
        return result;
    }

    private String getStory() {
        try {
            bob.tellStory();
            return "Вот такая история";
        } catch (Exception e) {
            System.out.println(e);
            return "представляешь, настоящая акула!";
        }
    }
}
