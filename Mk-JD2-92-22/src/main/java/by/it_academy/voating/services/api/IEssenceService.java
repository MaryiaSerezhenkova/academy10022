package by.it_academy.voating.services.api;

import java.util.List;

public interface IEssenceService<TYPE> {
	List<TYPE> get();
	TYPE get (int id);
	void validate(TYPE item);


}
