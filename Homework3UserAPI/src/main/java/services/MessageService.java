package services;
import java.time.LocalDateTime;
import java.util.List;
import entity.core.Message;
import entity.core.User;
import entity.core.dto.MessageCreateDTO;
import services.api.IMessageService;
import storage.MessageStorage;
import storage.api.IMessageStorage;

public class MessageService implements IMessageService {

	 private static MessageService instance = new MessageService();

	    private final IMessageStorage chatStorage;

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
	        this.chatStorage = MessageStorage.getInstance();
	    }

	    @Override
	    public List<Message> get(User currentUser) {
	        return this.chatStorage.get(currentUser.getLogin());
	    }

	    public void addMessage(MessageCreateDTO message) {
	        this.validation(message);
	        Message entity = new Message();
	        entity.setSender(message.getSender());;
	        entity.setRecipient(message.getRecipient());
	        entity.setText(message.getText());
	        entity.setDate(LocalDateTime.now());

	        this.chatStorage.addMessage(entity.getRecipient(), entity);
	    }

	    public void validation(MessageCreateDTO message){
	        if(message.getRecipient() == null || message.getRecipient().isBlank()){
	            throw new IllegalArgumentException("Не заполнена информация кому отправили сообщение");
	        }
	    }

	    @Override
	    public long getCount(User currentUser) {
	        return this.chatStorage.get(currentUser.getLogin()).size();
	    }

	    @Override
	    public long getCount() {
	        return this.chatStorage.getCount();
	    }

	}

