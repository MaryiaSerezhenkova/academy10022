package services.api;

import java.util.List;

import entity.core.Message;



public interface IMessageService extends IEssenceService<Message> {

	List<Message> get(String login);
}
