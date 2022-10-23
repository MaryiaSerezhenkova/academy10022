package Storage;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;
//создаем столько, сколько БД. В конце нужно закрыть!
public class DataSourceCreator {
	private static DataSourceCreator instance;
	private ComboPooledDataSource cpds;

	private DataSourceCreator() throws IOException, SQLException, PropertyVetoException {
		cpds = new ComboPooledDataSource();
		cpds.setDriverClass("org.postgresql.Driver");
		cpds.setJdbcUrl("jdbc:postgresql://localhost:5432/Structure");
		cpds.setUser("postgres");
		cpds.setPassword("sql");
		cpds.setMinPoolSize(5);
		cpds.setAcquireIncrement(5);
		cpds.setMaxPoolSize(20);
		cpds.setMaxStatements(180);
	}

	public static DataSource getInstance() throws IOException, SQLException, PropertyVetoException {
		if (instance == null) {
			synchronized (DataSourceCreator.class) {
				instance = new DataSourceCreator();
			}
		}
		return instance.cpds;
	}
}
