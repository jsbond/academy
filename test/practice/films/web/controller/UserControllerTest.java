package practice.films.web.controller;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Lenovo on 11.04.2017.
 */
public class UserControllerTest {
    @Test
    public void shouldReturnErrorMessageWhenUserNotFound() throws Exception {
        UserController controller = UserController.getInstance();
        String result = controller.login("anton@mail.ru", "555");
        Assert.assertEquals("Please try again", result);
    }

    @Test
    public void shouldReturnPassesMessageWhenUserisFound() throws Exception {
        UserController controller = UserController.getInstance();
        String result = controller.login("anton@mail.ru", "olala");
        Assert.assertEquals("Identification passed", result);
    }

}