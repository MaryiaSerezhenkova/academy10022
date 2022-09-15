package by.it_academy.voating.storage.api;

import by.it_academy.voating.core.entity.Artist;

public interface IArtistStorage extends IEssenceStorage<Artist> {
void save (Artist item);
}
