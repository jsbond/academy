package practice.junit;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by StudentTC on 22.12.2016.
 */
public class CalculatorTests {

    @Test(expected = ArithmeticException.class)
    public void shouldSumTwoNumbers() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.summ(1, 5);

        //then
        Assert.assertEquals(6, result);
    }


}
