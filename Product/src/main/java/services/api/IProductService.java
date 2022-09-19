package services.api;

import entity.core.Product;

public interface IProductService extends IEssenceService<Product> {
	void addNewProduct(int id, String title, double price, double discount, String description);
}
