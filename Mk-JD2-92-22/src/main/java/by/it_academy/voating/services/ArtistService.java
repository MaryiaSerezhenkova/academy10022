package by.it_academy.voating.services;

import java.util.List;

import by.it_academy.voating.core.entity.Artist;
import by.it_academy.voating.services.api.IArtistService;
import by.it_academy.voating.storage.ArtistStorage;
import by.it_academy.voating.storage.api.IArtistStorage;

public class ArtistService implements IArtistService {

	private final IArtistStorage storage;
	private static final ArtistService instance = new ArtistService();

	private ArtistService() {
		this.storage = ArtistStorage.getInstance();
	}

	@Override
	public List<Artist> get() {
		return this.storage.get();
	}

	@Override
	public Artist get(int id) {
		return this.storage.get(id);
	}

	@Override
	public void validate(Artist item) {
		if (item == null) {
			throw new IllegalStateException("Вы не передали артиста");
		}
		if (item.getName() == null || item.getName().isBlank()) {
			throw new IllegalArgumentException("Вы не заполнили имя артиста");
		}
	}
	public static ArtistService getInstance() {
		return instance;

}

}
