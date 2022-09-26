package storage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import entity.core.Product;
import entity.core.ProductBuilder;
import storage.api.IProductStorage;

public class ProductStorage implements IProductStorage {

	private List<Product> data = new ArrayList<Product>();

	private Map<Integer, Product> products;

//	private static ProductStorage instance = new ProductStorage();
//	
	private int id = 5;
//
//	public ProductStorage() {
//		this.data.add(ProductBuilder.create().setId(1).setTitle("Молоко").setPrice(3.0).setDiscount(5.0)
//				.setDescription("3% жирность").build());
//		this.data.add(ProductBuilder.create().setId(1).setTitle("Сыр").setPrice(20.0).setDiscount(4.0)
//				.setDescription("Пармезан").build());
//		this.data.add(ProductBuilder.create().setId(1).setTitle("Хлеб").setPrice(5.0).setDiscount(1.0)
//				.setDescription("Бездрожжевой").build());
//
//	}

	public List<Product> get() {
		return new ArrayList<>(this.products.values());
	}

	public Product get(int id) {
		return this.products.get(id);
	}

	public void save(Product p) {
		if ((Integer)p.getId()!=null) {
			throw new IllegalStateException("id must be empty");
		}
		p.setId(this.products.size());
		this.products.put(p.getId(), p);

	}

//	public static ProductStorage getInstance() {
//		return instance;
//
//	}

}
