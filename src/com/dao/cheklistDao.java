package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.conexion.Conexion;
import com.interfaces.ICheklistDao;
import com.model.Cheklist;



public class cheklistDao implements ICheklistDao {

	@Override
	public boolean registrarChek(Cheklist chek) {
		
		boolean registrar = false;
		
		Statement stm = null;
		Connection con = null;
		
		String sql = "INSERT INTO CHEKLIST VALUES (null,'"+chek.getChek()+"')";
		

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
	public boolean modificarChek() {
		
		return false;
	}

	
	
	
	@Override
	public boolean eliminarChek() {
		
		return false;
	}

	
	
	
	@Override
	public ArrayList<Cheklist> leerChek() {
		
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "select * from CHEKLIST";
		
		ArrayList<Cheklist> listaChek = new ArrayList<Cheklist>();
		
		try {
			con = Conexion.getConexion();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while (rs.next()) {
				Cheklist chek = new Cheklist();
				chek.setId(rs.getInt(1));
				chek.setChek(rs.getString(2));
				
				listaChek.add(chek);
			}
			stm.close();
			rs.close();
		} catch(SQLException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		
		return listaChek;
	}

	
	
	
	@Override
	public String obtenerChek() {
		
		return null;
	}
	
	
	

}
