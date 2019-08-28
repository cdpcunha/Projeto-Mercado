package database;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.Connection;


public class DB {

		private static Connection conn = null;
		
		private static Properties loadProperties() {
			try (FileInputStream fs = new FileInputStream("db.properties")) {
				Properties props = new Properties();
				props.load(fs);
				return props;
			} catch (IOException e) {
				throw new DbException(e.getLocalizedMessage());
			}
		}
		
		public static Connection getConnection() {
			if (conn == null) {
				try {
					Properties props = loadProperties();
					String url = props.getProperty("dburl");
					conn = DriverManager.getConnection(url, props);
				} catch (SQLException e) {
					throw new DbException(e.getLocalizedMessage());
				}
			}
			return conn;
		}
}
