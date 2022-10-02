package storage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.fasterxml.jackson.databind.ObjectMapper;

import entity.core.Product;
import storage.api.IProductStorage;

public class FileProductStorage implements IProductStorage {

	private String pathToFile;
	private final ObjectMapper mapper = new ObjectMapper();
	private final AtomicLong counter = new AtomicLong();

	public FileProductStorage() {
		String home = System.getenv("CATALINA_HOME");
		if (home == null || home.isBlank()) {
			throw new IllegalArgumentException("Отсутствует переменная окружения");
		}
		this.pathToFile = home + File.separator + "conf" + File.separator + "products.txt";
	}

	public FileProductStorage(String pathToDir) {
		File f = new File(pathToDir);
		if (!f.isDirectory()) {
			throw new IllegalArgumentException("Требуется передать путь к папке");
		}
		if (!f.canWrite()) {
			throw new IllegalArgumentException("Нет доступа на запись в директорию");
		}
		this.pathToFile = f.getAbsolutePath() + File.separator + "products.txt";
	}

	@Override
	public Product get(long id) {
		String line;
		try (BufferedReader reader = new BufferedReader(new FileReader(pathToFile))) {
			while ((line = reader.readLine()) != null) {
				Product product = mapper.readValue(line, Product.class);
				if (id == product.getId()) {
					return product;
				}
			}

			return null;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void save(Product item) {
		item.setId(counter.incrementAndGet());
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathToFile, true))) {
			writer.write(mapper.writeValueAsString(item));
			writer.newLine();
		} catch (IOException e) {
			throw new RuntimeException(e);

		}
	}

	@Override
	public List<Product> get() {
		List<Product> products = new ArrayList<>();
		try (BufferedReader reader = new BufferedReader(new FileReader(pathToFile))) {
			String line;
			while ((line = reader.readLine()) != null) {
				products.add(mapper.readValue(line, Product.class));
			}
			return products;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
