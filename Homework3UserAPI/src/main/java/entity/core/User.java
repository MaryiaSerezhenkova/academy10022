package entity.core;

import java.time.LocalDate;
import java.util.Objects;

public class User {
	private int id;
	private String login;
	private String password;
	private final String firstName;
	private final String lastName;
	private final LocalDate dateOfBirth;
	private LocalDate registrationDate;
	private User.Role role;

	public enum Role {
		ADMIN, USER
	}

	public User(int id, String login, String password, String firstName, String lastName, LocalDate dateOfBirth,
			LocalDate registrationDate, Role role) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.registrationDate = registrationDate;
		this.role = role;
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

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setRole(User.Role role) {
		this.role = role;
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

	@Override
	public String toString() {
		return "User [id=" + id + ", login=" + login + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + ", registrationDate=" + registrationDate
				+ ", role=" + role + "]";
	}

}