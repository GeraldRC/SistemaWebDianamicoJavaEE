package com.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.conexion.Conexion;
import com.interfaces.ICrearCapacitacionDao;
import com.model.CrearCapacitacion;

public class CrearCapacitacionDao implements ICrearCapacitacionDao{
	
	
	@Override
	public boolean registrarCap(CrearCapacitacion cap) {
		
			boolean registrar = false;
		
			Statement stm = null;
			Connection con = null;
		
			String sql = "INSERT INTO CAPACITACION VALUES (null,'"+cap.getCap()+"')";
		

			try {
				con = Conexion.getConexion();
				stm = con.createStatement();
				stm.execute(sql);
				registrar = true;
				stm.close();
			
			}catch(SQLException e) {
			System.out.println("Error: ");
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean modificarCap() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminarCap() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<com.model.CrearCapacitacion> leerCap() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String obtenerCap() {
		// TODO Auto-generated method stub
		return null;
	}

}



