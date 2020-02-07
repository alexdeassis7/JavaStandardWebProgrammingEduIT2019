package com.educacionit.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
	private final static String bd = "alumnos";
	private final static String login = "root";
	private final static String password = "";
	private final static String url = "jdbc:mysql://localhost/" + bd;
	static Connection conn = null;
	// OBTENEMOS LA CONEXION A LA BASE
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, login, password);
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
	// CERRAMOS LA CONEXION A LA BASE
	public void desconectarDB() {
		if (conn != null) {
			conn = null;
			
		}
	}

}
