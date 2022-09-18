package storage;

import java.util.ArrayList;
import java.util.List;
import entity.core.Product;
import entity.core.ProductBuilder;
import storage.api.IProductStorage;

public class ProductStorage implements IProductStorage {

	private List<Product> data = new ArrayList<Product>();

	private static ProductStorage instance = new ProductStorage();

	public ProductStorage() {
		this.data.add(ProductBuilder.create().setId(1).setTitle("Молоко").setPrice(3.0).setDiscount(5.0)
				.setDescription("3% жирность").build());
		this.data.add(ProductBuilder.create().setId(1).setTitle("Сыр").setPrice(20.0).setDiscount(4.0)
				.setDescription("Пармезан").build());
		this.data.add(ProductBuilder.create().setId(1).setTitle("Хлеб").setPrice(5.0).setDiscount(1.0)
				.setDescription("Бездрожжевой").build());

	}

	public List<Product> get() {
		return this.data;
	}

	public Product get(int id) {
		return this.data.stream().filter(a -> a.getId() == id).findFirst().orElse(null);
	}

	public void save(Product item) {
		// TODO Auto-generated method stub

	}

	public static ProductStorage getInstance() {
		return instance;

	}

}
