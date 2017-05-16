package practice.lection7;

/**
 * Created by Lenovo on 16.05.2017.
 */
public class UserController {
	private UserService userService;
	private CreditCardService creditCardService;

	public UserController(UserService userService, CreditCardService creditCardService) {
		this.userService = userService;
		this.creditCardService = creditCardService;
	}

	public User getUser(int id) {
		User user = userService.getUser(id);
		CreditCard creditCard = creditCardService.getCard(id);
		user.setCreditCard(creditCard);
		return user;
	}
}
