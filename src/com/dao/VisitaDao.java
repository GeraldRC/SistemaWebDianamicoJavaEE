package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.conexion.Conexion;
import com.interfaces.IVisitaDao;
import com.model.Visita;

;

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
	public Visita obtenerVisita(int idSolicitudVisita) {
		
		
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "select id_1 from visita where SOLICITUD_ID =" + idSolicitudVisita;
		
		System.out.println(sql);
		
		Visita v = new Visita();
		try {
			con = Conexion.getConexion();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			if (rs.next()) {
				v.setID(rs.getInt(1));
				v.setIDSolicitud(idSolicitudVisita);
				
				
				
			}
			stm.close();
			rs.close();
			//con.close();
		} catch(SQLException e) {
			System.out.println("Error: Clase UsuarioDao, método obtenerUsuario ");
			e.printStackTrace();
		}
		
		return v;
		
		

		
	}

}
