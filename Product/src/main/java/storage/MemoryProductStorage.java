package storage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import entity.core.Product;
import storage.api.IProductStorage;

public class MemoryProductStorage implements IProductStorage {


	private Map<Long, Product> products=new HashMap<>();

	public List<Product> get() {
		return new ArrayList<>(this.products.values());
	}

	public Product get(long id) {
		return this.products.get(id);
	}

	@SuppressWarnings("unused")
	public void save(Product p) {
//		if ((long)p.getId()!=null) {
//			throw new IllegalStateException("id must be empty");
//		}
		p.setId((long)this.products.size()+1);
		this.products.put(p.getId(), p);

	}


}
