package services.api;


import java.util.Collection;

import entity.core.User;
import entity.core.dto.UserCreateDTO;

public interface IUserService {
	void save (User user);

	//User getUserByLoginPassword(String login, String password);
	User get (String login);
	User signUp (UserCreateDTO User);
	Collection<User> getAll();
	long getCount();

}