package by.academyy.oop;

public class Book {
	protected String title;
	protected String author;

	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [title=");
		builder.append(title);
		builder.append(", author=");
		builder.append(author);
		builder.append("]");
		return builder.toString();
	}
}