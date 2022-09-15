package by.it_academy.voating.core.entity;

public class GenreBuilder {
	
	private int id;
	private String title;
	
	private GenreBuilder() {
	}

	public static GenreBuilder create() {
		return new GenreBuilder();
	}

	public Genre build() {
		return new Genre(id, title);
	}

	public GenreBuilder setId(int id) {
		this.id = id;
		return this;
	}


	public GenreBuilder setTitle(String title) {
		this.title = title;
		return this;
	}

}
