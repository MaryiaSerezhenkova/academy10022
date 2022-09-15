package by.it_academy.voating.storage.api;

import by.it_academy.voating.core.entity.Genre;

public interface IGenreStorage  extends IEssenceStorage<Genre> {
    void save(Genre item);
 
}
 