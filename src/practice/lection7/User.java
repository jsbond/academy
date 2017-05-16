package practice.lection7;

/**
 * Created by Lenovo on 16.05.2017.
 */
public class User {
	private int id;
	private String name;
	private int age;
	private CreditCard creditCard;

	public User(int id, String name, int age, CreditCard creditCard) {
		this.name = name;
		this.age = age;
		this.creditCard = creditCard;
	}

	public User() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		User user = (User) o;

		if (id != user.id) return false;
		if (age != user.age) return false;
		if (name != null ? !name.equals(user.name) : user.name != null) return false;
		return creditCard != null ? creditCard.equals(user.creditCard) : user.creditCard == null;
	}

	@Override
	public int hashCode() {
		int result = id;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		result = 31 * result + age;
		result = 31 * result + (creditCard != null ? creditCard.hashCode() : 0);
		return result;
	}
}
