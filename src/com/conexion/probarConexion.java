package com.conexion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class probarConexion {
	
	public static void main (String [] args) {
		
		
		
		try {	
	
	Connection conexion = Conexion.getConexion();
	
	Statement statement = conexion.createStatement();
	
	System.out.println("conexion exitosa");
	
	 ResultSet result = statement.executeQuery("select * from ROL");
	
	while(result.next()) {
		System.out.println(result.getString("id") +" " + result.getString("rol"));
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
