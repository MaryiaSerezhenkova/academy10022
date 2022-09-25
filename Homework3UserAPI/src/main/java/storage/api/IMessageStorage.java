package storage.api;

import java.util.List;

import entity.core.Message;

public interface IMessageStorage extends IEssenceStorage<Message> {
	List<Message> get(String login);

	void addMessage(String login, Message message);

}