package by.academyy.exceptions;

public class WrongLoginException extends Exception {

	private static final long serialVersionUID = 1L;

	public WrongLoginException() {
		super();
	}

	public WrongLoginException(String message) {
		super(message);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("WrongLoginException []");
		return builder.toString();
	}

}
