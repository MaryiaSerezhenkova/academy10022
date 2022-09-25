package services;

import java.time.LocalDateTime;
import java.util.Collection;

import entity.core.User;
import entity.core.User.Role;
import entity.core.dto.UserCreateDTO;
import services.api.IMessageService;
import services.api.IUserService;
import storage.UserStorage;
import storage.api.IUserStorage;

public class UserService implements IUserService {

	private final IUserStorage userStorage;
	private final IMessageService messageService;;
	private static final IUserStorage storage = UserStorage.getInstance();

	private static UserService instance = new UserService();

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
		this.userStorage = UserStorage.getInstance();
		this.messageService = MessageService.getInstance();
	}

	@Override
	public User get(String login) {
		return this.userStorage.get(login);
	}

	@Override
	public User signUp(UserCreateDTO user) {
		this.validationForSignUp(user);
		User entity = new User();
		entity.setLogin(user.getLogin());
		entity.setPassword(user.getPassword());
		entity.setFirstName(user.getFirstName());
		entity.setLastName(user.getLastName());
		entity.setDateOfBirth(user.getDateOfBirth());
		entity.setRegistrationDate(LocalDateTime.now());
		;
		entity.setRole(Role.USER);
		this.userStorage.add(entity);
		return entity;
	}

	private void validationForSignUp(UserCreateDTO user) {
		String errorMessage = "";
		if (this.nullOrEmpty(user.getLogin())) {
			errorMessage += "Логин обязателен для заполнения";
		}
		if (this.nullOrEmpty(user.getPassword())) {
			if (!errorMessage.isEmpty()) {
				errorMessage += "; ";
			}
			errorMessage += "Пароль обязателен для заполнения";
		}
		if (this.nullOrEmpty(user.getFirstName())) {
			if (!errorMessage.isEmpty()) {
				errorMessage += "; ";
			}
			errorMessage += "Имя обязательно для заполнения";
		}
		if (this.nullOrEmpty(user.getLastName())) {
			if (!errorMessage.isEmpty()) {
				errorMessage += "; ";
			}
			errorMessage += "Фамилия обязательна для заполнения";
		}

		if (!errorMessage.isEmpty()) {
			throw new IllegalArgumentException(errorMessage);
		}
	}

	private boolean nullOrEmpty(String val) {
		return val == null || val.isEmpty();
	}

	@Override
	public Collection<User> getAll() {
		return this.userStorage.getAll();
	}

	@Override
	public long getCount() {
		return this.userStorage.getCount();
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub

	}

//	public User getUserByLoginPassword(String login, String password) {
//		User confirmUser = null;
//		for (User item : storage.get()) {
//			if (item.getLogin().equals(login) && item.getPassword().equals(password)) {
//			confirmUser = item;
//		}
//		}
//		return confirmUser;
//
//	}

}