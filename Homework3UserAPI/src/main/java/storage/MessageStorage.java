package storage;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import entity.core.Message;
import storage.api.IMessageStorage;

public class MessageStorage implements IMessageStorage {
	private static MessageStorage instance = new MessageStorage();
	private List<Message> data = new ArrayList<Message>();
	int id = 0;


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
	public List<Message> get() {
		return this.data;
	}


	@Override
	public Message get(int id) {
		return this.data.get(id);
	}

	@Override
	public void save(Message item) {
		item.setId(id++);
		item.setDate(LocalDateTime.now());
		data.add(item);
		
	}

}
