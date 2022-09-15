package by.it_academy.voating.services;

import java.util.List;

import by.it_academy.voating.core.entity.Genre;
import by.it_academy.voating.services.api.IGenreService;
import by.it_academy.voating.storage.GenreStorage;
import by.it_academy.voating.storage.api.IGenreStorage;

public class GenreService implements IGenreService {

	private final IGenreStorage storage;
	private static final GenreService instance = new GenreService();

	private GenreService() {
		this.storage = GenreStorage.getInstance();
	}

	@Override
	public List<Genre> get() {
		return this.storage.get();
	}

	@Override
	public Genre get(int id) {
		return this.storage.get(id);
	}

	@Override
	public void validate(Genre item) {
		if (item == null) {
			throw new IllegalStateException("Вы не передали жанр");
		}

		if (item.getTitle() == null || item.getTitle().isBlank()) {
			throw new IllegalArgumentException("Вы не заполнили любимый жанр");
		}
	}

	public static GenreService getInstance() {
		return instance;
	}

}