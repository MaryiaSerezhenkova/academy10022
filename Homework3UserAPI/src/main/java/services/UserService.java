package services;

import java.util.List;
import entity.core.User;
import services.api.IUserService;
import storage.UserStorage;
import storage.api.IUserStorage;

public class UserService implements IUserService {

	private static final IUserStorage storage = UserStorage.getInstance();

	private static UserService instance = null;

	public static UserService getInstance() {
		UserService result = instance;
		synchronized (UserService.class) {
			if (result == null) {
				synchronized (UserService.class) {
					result = instance = new UserService();
				}
			}
		}
		return result;
	}

	private UserService() {
	}

	public List<User> get() {
		return storage.get();
	}

	public User get(int id) {
		return storage.get(id);
	}

	public void validate(User item) {
		if (item == null) {
			throw new IllegalStateException("No letter passed");
		}

		if (storage.get().contains(item)) {
			throw new IllegalStateException("User already exists");
		}

		if (item.getLogin() == null || item.getLogin().isBlank()) {
			throw new IllegalStateException("Login is empty");
		}

		if (item.getPassword() == null || item.getPassword().isBlank()) {
			throw new IllegalStateException("Password is empty");
		}

		if (item.getFirstName() == null || item.getFirstName().isBlank()) {
			throw new IllegalStateException("First name is empty");
		}

		if (item.getLastName() == null || item.getLastName().isBlank()) {
			throw new IllegalStateException("Last name is empty");
		}

		if (item.getDateOfBirth() == null) {
			throw new IllegalStateException("Birth date is empty");
		}

	}

	public void save(User item) {
		validate(item);
		storage.save(item);
	}

	public User getUserByLoginPassword(String login, String password) {
		User confirmUser = null;
		for (User item : storage.get()) {
			if (item.getLogin().equals(login) && item.getPassword().equals(password)) {
			confirmUser = item;
		}
		}
		return confirmUser;

	}
	
}