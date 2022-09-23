package services;
import java.util.List;
import java.util.stream.Collectors;

import entity.core.Message;
import services.api.IMessageService;
import storage.MessageStorage;
import storage.api.IMessageStorage;

public class MessageService implements IMessageService {

	private static final IMessageStorage storage = MessageStorage.getInstance();

	private static MessageService instance = null;

	public static MessageService getInstance() {
		MessageService result = instance;
		synchronized (MessageService.class) {
			if (result == null) {
				synchronized (MessageService.class) {
					result = instance = new MessageService();
				}
			}
		}
		return result;
	}

	private MessageService() {
	}

	
	
	@Override
	public List<Message> get(String login) {
		return (List<Message>) storage.get().stream()
				.filter(message -> message.getSender().equals(login) || message.getRecipient().equals(login))
				.collect(Collectors.toList());
	}

	@Override
	public List<Message> get() {
		return storage.get();
	}

	@Override
	public Message get(int id) {
		return storage.get(id);
		}
	

	@Override
	public void validate(Message item) {
		if (item == null) {
			throw new IllegalStateException("No letter passed");
		}

		if (item.getSender() == null || item.getSender().isBlank()) {
			throw new IllegalStateException("Sender is empty");
		}

		if (item.getRecipient() == null || item.getRecipient().isBlank()) {
			throw new IllegalStateException("Receiver is empty");
		}

//		if (!User.getLogin().equals(item.getSender())) {
//			throw new IllegalStateException("Sender does not exist");
//		}
////
//		if (userService.get().stream().noneMatch(user -> user.getLogin().equals(item.getRecipient()))) {
//			throw new IllegalStateException("Receiver does not exist");
//		}

		if (item.getText() == null || item.getText().isBlank()) {
			throw new IllegalStateException("Text is empty");
		}
	}
	
	@Override
	public void save(Message item) {
		validate(item);
		storage.save(item);
	}

}