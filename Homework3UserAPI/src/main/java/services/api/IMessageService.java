package services.api;

import java.util.List;

import entity.core.Message;
import entity.core.User;
import entity.core.dto.MessageCreateDTO;

public interface IMessageService {

	List<Message> get(User currentUser);

	void addMessage(MessageCreateDTO message);

	long getCount(User currentUser);

	long getCount();
}
