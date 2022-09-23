package storage;

import java.util.ArrayList;
import java.util.List;
import entity.core.User;
import entity.core.UserBuilder;
import storage.api.IUserStorage;
import java.time.LocalDate;

public class UserStorage implements IUserStorage {
	private static UserStorage instance = new UserStorage();
	private List<User> data = new ArrayList<User>();
	int id = 0;

	public UserStorage() {
		this.data.add(UserBuilder.create().setId(1).setLogin("Admin").setPassword("admin").setFirstName("Admin")
				.setLastName("Admin").setDateOfBirth(LocalDate.of(2000, 1, 1)).setRegistrationDate(LocalDate.now())
				.setRole(User.Role.ADMIN).build());

	}

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

	public List<User> get() {
		return this.data;
	}

	public User get(int id) {
		return this.data.get(id);
	}

	public void save(User item) {
		item.setId(id++);
		item.setRegistrationDate(LocalDate.now());
		item.setRole(User.Role.USER);
		data.add(item);
	}
}