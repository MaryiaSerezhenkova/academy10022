package services;


import java.util.Objects;

import entity.core.User;
import entity.core.dto.UserLoginDTO;
import services.api.IAuthService;
import services.api.IUserService;

public class AuthService implements IAuthService {
    private final static AuthService instance = new AuthService();

    private final IUserService userService;

    private AuthService() {
        this.userService = UserService.getInstance();
    }

    @Override
    public User authentication(UserLoginDTO credential) {
        User user = this.userService.get(credential.getLogin());
        if(user == null){
            throw new IllegalArgumentException("Неверный логин или пароль");
        }

        if(!Objects.equals(user.getPassword(), credential.getPassword())){
            throw new IllegalArgumentException("Неверный логин или пароль");
        }

        return user;
    }

    public static AuthService getInstance() {
        return instance;
    }
}
