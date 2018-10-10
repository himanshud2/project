package utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

	private static Connection connection;
	public static Connection getConnection(){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return connection;
	}
}
