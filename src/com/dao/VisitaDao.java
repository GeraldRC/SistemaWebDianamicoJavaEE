package com.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.conexion.Conexion;
import com.interfaces.IVisitaDao;
import com.model.Visita;

public class VisitaDao implements IVisitaDao{

	@Override
	public boolean registrarVisita(Visita visita) {
		
		boolean registrar = false;
		
		Statement stm = null;
		Connection con = null;
		
		String sql = "INSERT INTO Visita VALUES ('" +visita.getRutProfesional() + "', null ,'"+visita.getIDSolicitud()+"', '"+ visita.getFecha()+"')";
		

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
	public boolean modificarVisita() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminarVisita() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Visita> leerVisita() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Visita obtenerVisita(int idVisita) {
		// TODO Auto-generated method stub
		return null;
	}

}
