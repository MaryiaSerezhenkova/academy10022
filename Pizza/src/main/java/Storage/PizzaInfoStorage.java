package Storage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Storage.api.IPizzaInfoStorage;
import core.PizzaInfo;

public class PizzaInfoStorage implements IPizzaInfoStorage {

	private Map<Long, PizzaInfo> pizzaInfo = new HashMap<>();


	@Override
	public void add(PizzaInfo item) {
		item.setId((long) (this.pizzaInfo.size()) + 1);
		this.pizzaInfo.put(item.getId(), item);

	}

	@Override
	public PizzaInfo get(Long id) {
		return this.pizzaInfo.get(id);
	}

	@Override
	public void delete(Long id) {
		if (pizzaInfo.containsKey(id)) {
			PizzaInfo newValue = null;
			pizzaInfo.put(id, newValue);
		} else {
			System.out.println("Item doesnt exist");
		}

	}

	@Override
	public List<PizzaInfo> get() {
		return new ArrayList<>(this.pizzaInfo.values());
	}
}
