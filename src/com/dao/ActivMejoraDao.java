package com.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.model.ActivMejora;
import com.conexion.Conexion;
import com.interfaces.IActivMejoraDao;

public class ActivMejoraDao implements IActivMejoraDao {

	@Override
	public boolean registrarAcme(ActivMejora acme) {
		// TODO Auto-generated method stub
			boolean registrar = false;
		
			Statement stm = null;
			Connection con = null;
		
			String sql = "INSERT INTO CHEKLIST VALUES (null,'"+acme.getAcme()+"')";
		

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
	public boolean modificarAcme() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminarAcme() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<ActivMejora> leerAcme() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String obtenerAcme() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
