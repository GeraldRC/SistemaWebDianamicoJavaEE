package com.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
	private static Connection con = null;
	private String driver;
	private	String usuario;
	private	String password;
	private	String url;
	
	
	private Conexion() {
			
		driver = "oracle.jdbc.driver.OracleDriver";
		usuario = "BASE";
		password =  "1234";
		url = "jdbc:oracle:thin:@localhost:1521:xe";
			
		try {
			//Class.forName(driver);
			con = DriverManager.getConnection(url, usuario, password);
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}
		
	public static Connection getConexion() {
		
		if(con == null) {
			 new Conexion();
		}
		return con;
	}

}
