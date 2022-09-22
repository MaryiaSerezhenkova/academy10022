package entity.core;

import java.util.Calendar;
import java.util.Objects;

public class User {
	private int id;

	public void setId(int id) {
		this.id = id;
	}

	public void setRegistrationDate(Calendar registrationDate) {
		this.registrationDate = registrationDate;
	}

	public void setRole(User.Role role) {
		this.role = role;
	}

	private final String login;
	private final String password;
	private final String firstName;
	private final String lastName;
	private final Calendar birthDate;
	private Calendar registrationDate;
	private User.Role role;

	public User(int id, String login, String password, String firstName, String lastName, Calendar birthDate,
			Calendar registrationDate, Role role) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.registrationDate = registrationDate;
		this.role = role;
	}

	public enum Role {
		ADMIN, USER
	}

	public User.Role getRole() {
		return role;
	}

	public int getId() {
		return id;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Calendar getBirthDate() {
		return birthDate;
	}

	public Calendar getRegistrationDate() {
		return registrationDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", login=" + login + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", birthDate=" + birthDate + ", registrationDate=" + registrationDate
				+ ", role=" + role + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(login, password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(login, other.login) && Objects.equals(password, other.password);
	}

}