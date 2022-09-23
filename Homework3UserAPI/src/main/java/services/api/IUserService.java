package services.api;


import entity.core.User;

public interface IUserService extends IEssenceService<User> {
	 
	User getUserByLoginPassword(String login, String password);

}