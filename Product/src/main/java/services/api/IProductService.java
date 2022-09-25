package services.api;

import entity.core.Product;

public interface IProductService extends IEssenceService<Product> {
	void add(String title, double price, double discount, String description);
}
