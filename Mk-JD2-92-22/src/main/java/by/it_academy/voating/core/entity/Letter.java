package by.it_academy.voating.core.entity;

public class Letter {
	private final String info;
	private int id;

	public Letter(String info, int id) {
		this.info = info;
		this.id = id;
	}

	public String getInfo() {
		return info;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}