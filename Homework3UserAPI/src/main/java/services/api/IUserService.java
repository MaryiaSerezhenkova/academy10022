package services.api;


import entity.core.User;

public interface IUserService extends IEssenceService<User> {
    User confirmUser(String login, String password);
}
