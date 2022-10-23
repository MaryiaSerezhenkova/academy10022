package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import main.entity.Employee;

public class jdbsStart {

	public static void main(String[] args) throws InterruptedException {
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}

		try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Structure", "postgres",
				"sql"); Statement stm = conn.createStatement()) {
			long start = System.currentTimeMillis();
			for (int i = 0; i < 10000; i++) {
				try (ResultSet rs = stm
						.executeQuery("SELECT id, name, job, dep\r\n" + "	FROM \"Structure\".emp;");) {
					List<Employee> employees = mapList(rs);

					System.out.println(employees);

				}
				try (ResultSet rs = stm
						.executeQuery("SELECT id, name, job, dep\r\n" + "	FROM \"Structure\".emp;");) {
					Employee emp = null;
					while (rs.next()) {
						emp = map(rs);
					}
					System.out.println(emp);
				}
			}
			long stop = System.currentTimeMillis();
			System.out.println(stop - start);
			// TimeUnit.SECONDS.sleep(100);

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static Employee map(ResultSet rs) throws SQLException {
		Employee emp = new Employee();
		emp.setId(rs.getLong("id"));
		emp.setName(rs.getString("name"));
		long depRow = rs.getLong("dep");
		if (!rs.wasNull()) {
			emp.setDep(depRow);
		}
		long jobRow = rs.getLong("job");
		if (!rs.wasNull()) {
			emp.setJob(jobRow);
			;
		}
		return emp;

	}

	public static List<Employee> mapList(ResultSet rs) throws SQLException {
		List<Employee> employees = new ArrayList<>();
		while (rs.next()) {
			employees.add(map(rs));
		}
		return employees;

	}
}
