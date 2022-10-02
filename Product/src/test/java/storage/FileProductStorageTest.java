package storage;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;

import entity.core.Product;
import entity.core.ProductBuilder;

public class FileProductStorageTest {

	@Test
	public void save() {
		System.out.println(System.getProperty("java.io.tmpdir"));
		
		FileProductStorage storage = new FileProductStorage(System.getProperty("java.io.tmpdir")); 
		Product product = ProductBuilder.create().setTitle("Milk").setPrice(11).setDiscount(1).build();
		storage.save(product);
		assertNotNull(product.getId());
		Product byId = storage.get(product.getId());
		assertEquals("Milk", byId.getTitle());
	}
	public void get() {
		
		FileProductStorage storage = new FileProductStorage(System.getProperty("java.io.tmpdir")); 
		List<Product> beforeSave = storage.get();
		Product product = ProductBuilder.create().setTitle("Milk").setPrice(11).setDiscount(1).build();
		storage.save(product);
		assertNotNull(product.getId());
		List<Product> afterSave = storage.get();
		assertEquals(beforeSave.size()+1, afterSave.size());
	}

}
