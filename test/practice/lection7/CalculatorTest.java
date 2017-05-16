package practice.lection7;

import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Matchers;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;


public class CalculatorTest {

	private Calculator calculator;

	@BeforeClass
	public void init() {

	}

	@AfterClass
	public void shotdown() {

	}

	@Before
	public void setup() {
		calculator = new Calculator();
		System.out.println("!!!");
	}

	@Test
	public void shouldReturnSumingOfNumbers() {
		// given
		int expected = 3;

		// when
		int actual = calculator.summing(1, 2);

		// then
		assertEquals("!!! summing method was changed !!!", 3, actual);
		assertThat(actual, is(expected));
	}

	@Test
	public void shouldReturnResultOfDivision() {
		// when
		int actual = calculator.division(6, 2);

		// then
		assertEquals("!!! division method was changed !!!", 3, actual);
	}

	@After
	public void destroy() {
		System.out.println("???");
	}
}