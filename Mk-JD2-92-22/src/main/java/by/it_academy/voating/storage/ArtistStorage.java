package by.it_academy.voating.storage;

import java.util.ArrayList;
import java.util.List;

import by.it_academy.voating.core.entity.Artist;
import by.it_academy.voating.core.entity.ArtistBuilder;
import by.it_academy.voating.storage.api.IArtistStorage;

public class ArtistStorage implements IArtistStorage {

	private List<Artist> data = new ArrayList<>();
	
	private static ArtistStorage instance = new ArtistStorage();

	public ArtistStorage() {
		this.data.add(ArtistBuilder.create().setId(1).setName("Сектор газа").build());

		this.data.add(ArtistBuilder.create().setId(2).setName("Рианна").build());

		this.data.add(ArtistBuilder.create().setId(3).setName("СнупДог").build());
		this.data.add(ArtistBuilder.create().setId(4).setName("Рамштайн").build());
	}

	@Override
	public List<Artist> get() {
		return this.data;
	}

	@Override
	public Artist get(int id) {
		return this.data.stream().filter(a -> a.getId()==id).findFirst().orElse(null);
	}

	@Override
	public void save(Artist item) {
		
	}
	public static ArtistStorage getInstance() {
		return instance;

}
}
