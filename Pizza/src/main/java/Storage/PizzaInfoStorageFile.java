package Storage;

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

import Storage.api.IPizzaInfoStorage;
import core.PizzaInfo;

//public class PizzaInfoStorageFile implements IPizzaInfoStorage {
//
//	private String pathToFile;
//	private final ObjectMapper mapper = new ObjectMapper();
//	private final AtomicLong counter = new AtomicLong();
//
//
//	public PizzaInfoStorage() {
//		String home = System.getenv("CATALINA_HOME");
//		if (home == null || home.isBlank()) {
//			throw new IllegalArgumentException("Отсутствует переменная окружения");
//		}
//		this.pathToFile = home + File.separator + "conf" + File.separator + "products.txt";
//	}
//
//	public PizzaInfoStorage(String pathToDir) {
//		File f = new File(pathToDir);
//		if (!f.isDirectory()) {
//			throw new IllegalArgumentException("Требуется передать путь к папке");
//		}
//		if (!f.canWrite()) {
//			throw new IllegalArgumentException("Нет доступа на запись в директорию");
//		}
//		this.pathToFile = f.getAbsolutePath() + File.separator + "products.txt";
//	}
//
//	public List get() {
//		List<PizzaInfo> pizza = new ArrayList<PizzaInfo>();
//		try (BufferedReader reader = new BufferedReader(new FileReader(pathToFile))) {
//			String line;
//			while ((line = reader.readLine()) != null) {
//				pizza.add(mapper.readValue(line, PizzaInfo.class));
//			}
//			return pizza;
//		} catch (IOException e) {
//			throw new RuntimeException(e);
//		}
//	}
//
//	public void add(PizzaInfo type) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public PizzaInfo get(Long id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void delete(Long id) {
//		// TODO Auto-generated method stub
//		
//	}

//	public Object getItem(String name) {
//		String line;
//		try (BufferedReader reader = new BufferedReader(new FileReader(pathToFile))) {
//			while ((line = reader.readLine()) != null) {
//				PizzaInfo product = mapper.readValue(line, PizzaInfo.class);
//				if (name.equalsIgnoreCase(product.getName())) {
//					return product;
//				}
//			}
//
//			return null;
//		} catch (IOException e) {
//			throw new RuntimeException(e);
//		}
//	}

//	@Override
//	public void add(PizzaInfo pizza) {
//		pizza.setId(counter.incrementAndGet());
//				try (BufferedWriter writer = new BufferedWriter(new FileWriter(pathToFile, true))) {
//					writer.write(mapper.writeValueAsString(pizza));
//					writer.newLine();
//				} catch (IOException e) {
//					throw new RuntimeException(e);
//
//				}
//
//	}
//
//	@Override
//	public PizzaInfo get(long id) {
//		String line;
//		try (BufferedReader reader = new BufferedReader(new FileReader(pathToFile))) {
//			while ((line = reader.readLine()) != null) {
//				PizzaInfo product = mapper.readValue(line, PizzaInfo.class);
//				if (id==product.getId()) {
//					return product;
//				}
//			}
//
//			return null;
//		} catch (IOException e) {
//			throw new RuntimeException(e);
//		}
//	}
//}