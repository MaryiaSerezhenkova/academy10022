package entity.core;
import java.time.LocalDateTime;

public class Message {
	private int id;
	private final String text;
	private final String sender;
	private final String recipient;
	private LocalDateTime date;

	public Message(int id, String text, String sender, String recipient, LocalDateTime date) {
		this.id = id;
		this.text = text;
		this.sender = sender;
		this.recipient = recipient;
		this.date = date;
	}

	public int getId() {
		return id;
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

	public void setId(int id) {
		this.id = id;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", text=" + text + ", sender=" + sender + ", recipient=" + recipient + ", date="
				+ date + "]";
	}

}