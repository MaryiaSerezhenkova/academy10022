package core;

import api.IPizzaInfo;

public class PizzaInfo implements IPizzaInfo {

	private Long id;
	private String name;
	private String description;
	private int size;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PizzaInfo() {
		super();
	}

	public PizzaInfo(Long id, String name, String description, int size) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.size = size;
	}
	public PizzaInfo(String name, String description, int size) {
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

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "PizzaInfo [name=" + name + ", description=" + description + ", size=" + size + ", id=" + id + "]";
	}

}