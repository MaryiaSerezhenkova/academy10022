package services.api;

import entity.core.Product;
import entity.dto.ProductCreateDTO;

public interface IProductService extends IEssenceService<Product> {
	//void add(String title, double price, double discount, String description);
	
	void save(ProductCreateDTO p);
}
