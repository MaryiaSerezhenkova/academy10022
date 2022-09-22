package entity.core;

import java.util.Calendar;

public class UserBuilder {
	private int id;
	private String login;
	private String password;
	private String firstName;
	private String lastName;
	private Calendar birthDate;
	private Calendar registrationDate;
	private User.Role role;

	private UserBuilder() {
	}

	public static UserBuilder create() {
		return new UserBuilder();
	}

	public UserBuilder setId(int id) {
		this.id = id;
		return this;
	}

	public UserBuilder setLogin(String login) {
		this.login = login;
		return this;

	}

	public UserBuilder setPassword(String password) {
		this.password = password;
		return this;
	}

	public UserBuilder setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	public UserBuilder setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	public UserBuilder setBirthDate(Calendar birthDate) {
		this.birthDate = birthDate;
		return this;
	}

	public UserBuilder setRegistrationDate(Calendar registrationDate) {
		this.registrationDate = registrationDate;
		return this;
	}

	public UserBuilder setRole(User.Role role) {
		this.role = role;
		return this;
	}

	public User build() {
		return new User(id, login, password, firstName, lastName, birthDate, registrationDate, role);

	}

}
