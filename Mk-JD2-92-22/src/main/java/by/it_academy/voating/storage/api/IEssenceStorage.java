package by.it_academy.voating.storage.api;

import java.util.List;

public interface IEssenceStorage<TYPE> {
	List<TYPE> get();
	TYPE get (int id);
	
}
