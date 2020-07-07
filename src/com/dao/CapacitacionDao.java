package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.conexion.Conexion;
import com.interfaces.ICapacitacionDao;
import com.model.Capacitacion;
import com.model.Solicitudes;

public class CapacitacionDao implements ICapacitacionDao{

	@Override
	public boolean registrarCapacitacion(Capacitacion c) {
		
		boolean registrar = false;
		
		Statement stm = null;
		Connection con = null;
		
		String sql = "INSERT INTO CAPACITACION VALUES (null,'"+c.getCapacitacion() +"')";
		

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
		
		return registrar;	
		
		
		
		
		
	
	}

	@Override
	public boolean modificarCapacitacion(Capacitacion c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminarCapacitacion(Capacitacion c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Capacitacion> leerCapacitacion() {


		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "select * from CAPACITACION";
		
		ArrayList<Capacitacion> listaCapacitacion = new ArrayList<Capacitacion>();
		
		try {
			con = Conexion.getConexion();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				Capacitacion c = new Capacitacion();
				c.setId(rs.getInt(1));
				c.setCapacitacion(rs.getString(2));
				
				listaCapacitacion.add(c);
			}
			stm.close();
			rs.close();
		} catch(SQLException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		
		return listaCapacitacion;
		
		
	}

	@Override
	public Capacitacion obtenerCapacitacion(int id) {


		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "select * from capacitacion where ID = " + id;
		
		
		Capacitacion c = new Capacitacion();
		try {
			con = Conexion.getConexion();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			if (rs.next()) {
				
				c.setId(rs.getInt(1));
				c.setCapacitacion(rs.getNString(2));
				
				
				
				
				
			}
			
			
		} catch(SQLException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		
		return c;
		
		
		
		
	}

}
