package by.it_academy.voating.storage;

import java.util.ArrayList;
import java.util.List;

import by.it_academy.voating.core.entity.Genre;
import by.it_academy.voating.core.entity.GenreBuilder;
import by.it_academy.voating.storage.api.IGenreStorage;

public class GenreStorage implements IGenreStorage {
	private static GenreStorage instance = new GenreStorage();
	private List<Genre> data = new ArrayList<>();

	private GenreStorage() {
		this.data.add(GenreBuilder.create().setId(1).setTitle("Хип-хоп").build());
		this.data.add(GenreBuilder.create().setId(2).setTitle("Рок").build());
		this.data.add(GenreBuilder.create().setId(3).setTitle("Поп").build());
		this.data.add(GenreBuilder.create().setId(4).setTitle("Классика").build());
		this.data.add(GenreBuilder.create().setId(5).setTitle("Джаз").build());
		this.data.add(GenreBuilder.create().setId(6).setTitle("Блюз").build());
		this.data.add(GenreBuilder.create().setId(7).setTitle("Альтернатива").build());
		this.data.add(GenreBuilder.create().setId(8).setTitle("Кантри").build());
		this.data.add(GenreBuilder.create().setId(9).setTitle("Диско").build());
		this.data.add(GenreBuilder.create().setId(10).setTitle("Фьюжн").build());

	}

	@Override
	public List<Genre> get() {
		return this.data;
	}

	@Override
	public Genre get(int id) {
		return this.data.stream().filter(a -> a.getId() == id).findFirst().orElse(null);
	}

	@Override
	public void save(Genre item) {
		this.data.add(item);

	}

	public static GenreStorage getInstance() {
		return instance;
	}
}