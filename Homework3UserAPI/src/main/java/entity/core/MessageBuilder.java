package entity.core;
import java.time.LocalDateTime;

public class MessageBuilder {
	private String text;
	private String sender;
	private String recipient;
	private LocalDateTime date;

	private MessageBuilder() {
	}

	public static MessageBuilder create() {
		return new MessageBuilder();
	}

	public MessageBuilder setText(String text) {
		this.text = text;
		return this;
	}

	public MessageBuilder setSender(String sender) {
		this.sender = sender;
		return this;
	}

	public MessageBuilder setRecipient(String recipient) {
		this.recipient = recipient;
		return this;
	}

	public MessageBuilder setDate(LocalDateTime date) {
		this.date = date;
		return this;
	}

	public Message build() {
		return new Message(text, sender, recipient, date);

	}

}
