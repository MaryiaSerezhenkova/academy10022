package storage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junitpioneer.jupiter.SetEnvironmentVariable;

import storage.api.IStorageFactory;

public class StorageFactoryTest {
	@SetEnvironmentVariable(key = "CATALINA_HOME", value = "C:/")

	@Test
	public void ProductStorageFactory() {
		IStorageFactory instance1 = StorageFactory.getInstance();
		IStorageFactory instance2 = StorageFactory.getInstance();
		assertEquals(instance1, instance2);
	}

}
