package storage.api;

import java.util.List;

public interface IEssenceStorage<TYPE> {
	List<TYPE> get();

	TYPE get(int id);

	void save(TYPE item);
}