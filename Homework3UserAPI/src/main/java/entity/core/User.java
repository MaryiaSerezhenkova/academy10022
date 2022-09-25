package entity.core;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class User {
	private String login;
	private String password;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private LocalDateTime registrationDate;
	private User.Role role;

	public enum Role {
		ADMIN, USER
	}
	public User(String login, String password, String firstName, String lastName, LocalDate dateOfBirth,
			LocalDateTime registrationDate, Role role) {
		super();
		this.login = login;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.registrationDate = registrationDate;
		this.role = role;
	}

	public User() {
		super();
	}

	public User.Role getRole() {
		return role;
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

	public LocalDateTime getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDateTime registrationDate) {
		this.registrationDate = registrationDate;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setRole(User.Role role) {
		this.role = role;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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
		return "User [login=" + login + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + ", registrationDate=" + registrationDate
				+ ", role=" + role + "]";
	}

}