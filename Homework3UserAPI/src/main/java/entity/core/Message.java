package entity.core;
import java.time.LocalDateTime;

public class Message {
	private String text;
	private String sender;
	private String recipient;
	private LocalDateTime date;

	public Message(String text, String sender, String recipient, LocalDateTime date) {
		this.text = text;
		this.sender = sender;
		this.recipient = recipient;
		this.date = date;
	}

	public Message() {
	}

	public String getText() {
		return text;
	}

	public String getSender() {
		return sender;
	}

	public String getRecipient() {
		return recipient;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	@Override
	public String toString() {
		return "Message [text=" + text + ", sender=" + sender + ", recipient=" + recipient + ", date="
				+ date + "]";
	}

}