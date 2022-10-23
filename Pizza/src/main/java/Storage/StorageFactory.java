package Storage;

import java.util.List;

import core.PizzaInfo;

import Storage.api.IPizzaInfoStorage;
import Storage.api.IStorageFactory;

public class StorageFactory implements IStorageFactory {
	private static final IStorageFactory instance = new StorageFactory();

	private IPizzaInfoStorage pizzaInfoStorage;

	public StorageFactory() {
		this.pizzaInfoStorage = new PizzaInfoStorage();
	}

	public static IStorageFactory getInstance() {
		return instance;
	}

	public IPizzaInfoStorage getPizzaInfoStorage() {
		return pizzaInfoStorage;
	}
}