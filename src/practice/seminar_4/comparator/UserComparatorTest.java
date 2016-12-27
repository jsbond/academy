package practice.seminar_4.comparator;

import org.junit.*;
import practice.seminar_4.compare.User;

import java.util.Comparator;

/**
 * Created by StudentTC on 15.12.2016.
 */
public class UserComparatorTest {
    Comparator comparator;
    User user1;
    User user2;

    @Before
    public void init() {
        comparator = new UserComparator();
        user1 = new User();
        user2 = new User();
    }

    @Test
    public void shouldResultBePositiveWhenUserOneHasBiggerCounter() {
        //given
        user1.setCounter(10);
        user2.setCounter(3);

        //when
        int result = comparator.compare(user1, user2);

        //then
        Assert.assertTrue(result > 0);
    }

    @Test
    public void shouldResultBeZeroWhenUsersHaveEqualCounters() {
        //given
        user1.setCounter(5);
        user2.setCounter(5);

        //when
        int result = comparator.compare(user1, user2);

        //then
        Assert.assertEquals(0, result);
    }

    @After
    public void destroy() {

    }

}
