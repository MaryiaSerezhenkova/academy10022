package services;

import java.util.List;

import entity.core.Product;
import entity.core.ProductBuilder;
import entity.dto.ProductCreateDTO;
import services.api.IProductService;
import storage.StorageFactory;
import storage.api.IProductStorage;

public class ProductService implements IProductService {

	private IProductStorage storage;
	private static ProductService instance = new ProductService();

	public ProductService() {
		this.storage = StorageFactory.getInstance().getProductStorage();
	}

	@Override
	public List<Product> get() {
		return this.storage.get();
	}

	@Override
	public Product get(int id) {
		return this.storage.get(id);
	}

//	@Override
//	public void validate(Product item) {
//		if (item == null) {
//			throw new IllegalStateException("Вы не выбрали продукт");
//		}
//		if (item.getTitle() == null || item.getTitle().isBlank()) {
//			throw new IllegalArgumentException("Название продукта введено некорректно");
//		}
//		if (item.getPrice()<=0) {
//			throw new IllegalArgumentException("Стоимость введена некорректно");
//		}
//	}

//	@Override
//	public void add(String title, double price, double discount, String description) {
//		this.validate(ProductBuilder.create()
//				.setTitle(title).setPrice(price).setDiscount(discount).setDescription(description).build());
//	       this.storage.save(ProductBuilder.create().setTitle(title).setPrice(price).setDiscount(discount).setDescription(description).build());
//	}

	@Override
	public void save(ProductCreateDTO p) {
		Product product = ProductBuilder.create().setTitle(p.getTitle()).setPrice(p.getPrice())
				.setDiscount(p.getDiscount()).setDescription(p.getDescription()).build();
		this.storage.save(product);
	}

	@Override
	public void validate(Product item) {
		// TODO Auto-generated method stub

	}
	public static ProductService getInstance() {
		return instance;

	}

}
