package storage;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import entity.core.User;
import entity.core.UserBuilder;
import storage.api.IUserStorage;

public class UserStorage implements IUserStorage {
	private static UserStorage instance = new UserStorage();
	private List<User> data = new ArrayList<User>();
	int id = 0;

	public UserStorage() {
		this.data.add(UserBuilder.create().setId(1).setLogin("Admin").setPassword("admin").setFirstName("Admin")
				.setLastName("Admin").setBirthDate(new GregorianCalendar(2000, Calendar.JANUARY, 1))
				.setRegistrationDate(GregorianCalendar.getInstance()).setRole(User.Role.ADMIN).build());

	}

	public List<User> get() {
		return this.data;
	}

	public User get(int id) {
		return this.data.get(id);
	}

	public void save(User item) {

		item.setId(id++);
		item.setRegistrationDate(GregorianCalendar.getInstance());
		item.setRole(User.Role.USER);
		data.add(item);

	}

	public static UserStorage getInstance() {
		if (instance == null) {
			instance = new UserStorage();
		}
		return instance;
	}

}
