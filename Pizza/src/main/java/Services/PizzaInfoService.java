package Services;

import java.util.List;


import Services.api.IPizzaInfoService;
import Storage.StorageFactory;
import Storage.api.IPizzaInfoStorage;
import core.PizzaInfo;
import core.dto.PizzaInfoDTO;

public class PizzaInfoService implements IPizzaInfoService {

	private IPizzaInfoStorage storage;
	private static PizzaInfoService instance = new PizzaInfoService();

	public PizzaInfoService() {
		this.storage = StorageFactory.getInstance().getPizzaInfoStorage();
	}

	@Override
	public List<PizzaInfo> get() {
		return this.storage.get();
	}


	@Override
	public void save(PizzaInfoDTO p) {
		PizzaInfo item = new PizzaInfo();
		item.setName(p.getName()); 
		item.setSize(p.getSize());
		this.storage.add(item);
		
	}

	@Override
	public PizzaInfo getById(Long id) {
		return this.storage.get(id);
	}

	

	
}