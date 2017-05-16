package practice.lection7;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {

	@InjectMocks
	private UserController controller;

	@Mock
	private UserService userService;

	@Mock
	private CreditCardService creditCardService;

//	@Test(expected = NullPointerException.class)
	@Test
	public void shouldReturnUserWithCreditCard() {
		// given
		CreditCard card = new CreditCard();
		card.setNumber(232311121);

		User expected = new User();
		expected.setId(3);
		expected.setName("Vasya");
		expected.setAge(23);
		expected.setCreditCard(card);

		User userMock = new User();
		userMock.setId(3);
		userMock.setName("Vasya");
		userMock.setAge(23);

		Mockito.when(userService.getUser(3)).thenReturn(userMock);
		Mockito.when(creditCardService.getCard(3)).thenReturn(card);

		// when
		User actual = controller.getUser(3);

		// then
		Assert.assertEquals(expected, actual);
		Assert.assertThat(actual, CoreMatchers.is(expected));
	}
}