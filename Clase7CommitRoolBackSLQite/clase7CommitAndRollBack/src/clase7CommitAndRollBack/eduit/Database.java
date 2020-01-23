package clase7CommitAndRollBack.eduit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @web https://www.jc-mouse.net/
 * @author Mouse
 */
public class Database {

	private final static String bd = "baseDeDatos.s3db";
	private final static String login = "";
	private final static String password = "";
	private final static String url = "jdbc:sqlite:baseDeDatos.s3db";// + bd;

	public static Connection getConnection() {
		try {
			Class.forName("org.sqlite.JDBC");
			
			Connection conn = null;
			conn=DriverManager.getConnection(url);//(url, login, password);
			if (conn != null) {
				System.out.println("Conectado a la base de datos [" + bd + "]");
			}
			return conn;
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.err.println(e.getMessage());
		}
		return null;
	}

}