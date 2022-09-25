package storage.api;

import java.util.Collection;

import entity.core.User;

public interface IUserStorage {
	User get(String login);

	void add(User user);

	Collection<User> getAll();

	long getCount();

}
