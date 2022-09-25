package storage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import entity.core.Message;
import storage.api.IMessageStorage;

public class MessageStorage implements IMessageStorage {
	private static MessageStorage instance = new MessageStorage();
	private final Map <String, List<Message>> chats = new HashMap<>();


	public static MessageStorage getInstance() {
		MessageStorage result = instance;
		synchronized (MessageStorage.class) {
			if (instance == null) {
				synchronized (MessageStorage.class) {
					result = instance = new MessageStorage();
				}
			}
		}
		return result;
	}


	@Override
	public long getCount() {
		return this.chats.values().stream().mapToInt(List::size).sum();
	}


	@Override
	public List<Message> get(String login) {
		return this.chats.get(login);
	}


	@Override
	public void addMessage(String login, Message message) {
		List <Message> chat;
		if(this.chats.containsKey(login)) {
			chat=this.chats.get(login);
		}else {
			chat = new ArrayList<>();
			this.chats.put(login, chat);
		}
		chat.add(message);
		
	}


}
