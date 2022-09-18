package storage.api;

import entity.core.Product;

public interface IProductStorage extends IEssenceStorage<Product> {
	void save (Product item);

}
