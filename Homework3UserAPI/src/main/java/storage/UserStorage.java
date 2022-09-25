package storage;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import entity.core.User;
import entity.core.UserBuilder;
import storage.api.IUserStorage;

public class UserStorage implements IUserStorage {
	private static UserStorage instance = new UserStorage();
	private final Map<String, User> users = new HashMap<>();
	int id = 0;

//	public UserStorage() {
//		((IUserStorage) this.users).add(UserBuilder.create().setId(1).setLogin("Admin").setPassword("admin").setFirstName("Admin")
//				.setLastName("Admin").setDateOfBirth(LocalDate.of(2000, 1, 1)).setRegistrationDate(LocalDate.now())
//				.setRole(User.Role.ADMIN).build());
//
//	}

	public static UserStorage getInstance() {
		UserStorage result = instance;
		synchronized (UserStorage.class) {
			if (instance == null) {
				synchronized (UserStorage.class) {
					result = instance = new UserStorage();
				}
			}
		}
		return result;
	}

	@Override
	public long getCount() {
		return this.users.size();
	}

	@Override
	public User get(String login) {
		return this.users.get(login);
	}

	@Override
	public void add(User user) {
		if (this.users.containsKey(user.getLogin())) {
			throw new IllegalArgumentException("Пользователь с логином " + user.getLogin() + " уже сущуствует");
		}
		this.users.put(user.getLogin(), user);
	}

	@Override
	public Collection<User> getAll() {
		return this.users.values();
	}
}