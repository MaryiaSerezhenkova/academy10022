package controllers.listeners;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import entity.core.Message;
import entity.core.User;
import entity.core.User.Role;
import storage.MessageStorage;
import storage.UserStorage;

public class DefaultDataInitializer implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        UserStorage userStorage = UserStorage.getInstance();

        User user = new User();
        user.setLogin("Olga");
        user.setPassword("123");
        user.setFirstName("Olga");
        user.setLastName("Ivanova");
        user.setDateOfBirth(LocalDate.of(2000, 01, 01));
        user.setRegistrationDate(LocalDateTime.now());
        user.setRole(Role.ADMIN);

        userStorage.add(user);

        MessageStorage chatStorage = MessageStorage.getInstance();

        Message message = new Message();
        message.setSender("unknown");
        message.setDate(LocalDateTime.now());
        message.setText("Я слежу за тобой!");

        chatStorage.addMessage(user.getLogin(), message);
    }

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}
}
