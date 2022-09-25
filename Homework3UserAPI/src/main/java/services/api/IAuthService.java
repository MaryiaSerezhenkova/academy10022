package services.api;

import entity.core.User;
import entity.core.dto.UserLoginDTO;

public interface IAuthService {
	User authentication(UserLoginDTO credential);

}