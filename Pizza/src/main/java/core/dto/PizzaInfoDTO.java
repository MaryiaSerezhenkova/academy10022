package core.dto;

import api.IPizzaInfo;

public class PizzaInfoDTO implements IPizzaInfo {

	private String name;
	private String description;
	private int size;


	public PizzaInfoDTO() {
		super();
	}

	public PizzaInfoDTO(String name, String description, int size) {
		super();
		this.name = name;
		this.description = description;
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public String getDescription() {
		return description;
	}
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pizza [name=");
		builder.append(name);
		builder.append(", description=");
		builder.append(description);
		builder.append(", size=");
		builder.append(size);
		builder.append("]");
		return builder.toString();
	}
}