package storage;

import storage.api.IProductStorage;
import storage.api.IStorageFactory;

public class StorageFactory implements IStorageFactory {
	private static final IStorageFactory instance = new StorageFactory();

	private IProductStorage productStorage;

	public StorageFactory() {
		this.productStorage = new ProductStorage();
	}

	@Override

	public IProductStorage getProductStorage() {
		return productStorage;
	}

	public static IStorageFactory getInstance() {
		return instance;
	}
}
