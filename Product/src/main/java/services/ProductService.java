package services;

import java.util.List;

import entity.core.Product;
import entity.core.ProductBuilder;
import services.api.IProductService;
import storage.ProductStorage;
import storage.api.IProductStorage;

public class ProductService implements IProductService {
	private final IProductStorage storage;
	private static final ProductService instance = new ProductService();

	private ProductService() {
		this.storage = ProductStorage.getInstance();
	}

	@Override
	public List<Product> get() {
		return this.storage.get();
	}

	@Override
	public Product get(int id) {
		return this.storage.get(id);
	}

	@Override
	public void validate(Product item) {
		if (item == null) {
			throw new IllegalStateException("Вы не выбрали продукт");
		}
		if (item.getTitle() == null || item.getTitle().isBlank()) {
			throw new IllegalArgumentException("Название продукта введено некорректно");
		}
		if (item.getPrice()<=0) {
			throw new IllegalArgumentException("Стоимость введена некорректно");
		}
	}

	public static ProductService getInstance() {
		return instance;

	}

	@Override
	public void add(String title, double price, double discount, String description) {
		this.validate(ProductBuilder.create()
				.setTitle(title).setPrice(price).setDiscount(discount).setDescription(description).build());
	       this.storage.save(ProductBuilder.create().setTitle(title).setPrice(price).setDiscount(discount).setDescription(description).build());
	}

}
