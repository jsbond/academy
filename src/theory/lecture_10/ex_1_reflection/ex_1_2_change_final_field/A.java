package theory.lecture_10.ex_1_reflection.ex_1_2_change_final_field;

public class A {
    final int secret = 1;

    {
//        secret = 1;
    }
    A () {

    }

    int getSecret() {
        return secret;
    }

    public void print() {
        System.out.println(secret);
    }
}
