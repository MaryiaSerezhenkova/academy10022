package storage.api;

import java.util.List;

public interface IEssenceStorage<TYPE> {
	List<TYPE> get();
	TYPE get (long id);
	
}
