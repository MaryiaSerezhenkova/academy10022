package Services.api;
import java.util.List;


import core.PizzaInfo;
import core.dto.PizzaInfoDTO;

public interface IPizzaInfoService {
	
		List<PizzaInfo> get();
		PizzaInfo getById (Long id);
		void save(PizzaInfoDTO p);
		
}