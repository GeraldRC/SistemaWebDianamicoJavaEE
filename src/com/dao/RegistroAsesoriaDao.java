package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.conexion.Conexion;
import com.interfaces.IRegistroAsesoriaDao;
import com.model.RegistroCheklist;


public class RegistroAsesoriaDao implements IRegistroAsesoriaDao{
	
	
	

	@Override
	public boolean registrarChek(RegistroCheklist registro, int idAsesoria) {
		
		boolean registrar = false;
		
		Statement stm = null;
		Connection con = null;
		
		int idCheklist = registro.getIdChek();
		int estadoChek = registro.getValorChek();
		
		String sql2 = "INSERT INTO CHEKLIST-ASESORIA VALUES ('"+ idCheklist +"','"+ idAsesoria +"','"+ estadoChek +"')";
		

		try {
			con = Conexion.getConexion();
			stm = con.createStatement();
			stm.execute(sql2);
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean eliminarChek() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<RegistroCheklist> leerChek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String obtenerChek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int registrarAsesoria(int numeroVista) {
		
		int idAsesoria = 0;
		
		String sql1 = "INSERT INTO ASESORIA VALUES (null,'"+ numeroVista +"')";
		String sqlConsulta = " SELECT ID FROM ASESORIA WHERE VISITA_ID_1 ="+ numeroVista +"'";
		
		Statement stm = null;
		Connection con = null;
		ResultSet rs = null;
		

		try {
			con = Conexion.getConexion();
			
			stm = con.createStatement();
			
			stm.execute(sql1);
			
			rs = stm.executeQuery(sqlConsulta);
			
			if (rs.next()) {
				
				idAsesoria = rs.getInt(1);
			}
			
			System.out.println(idAsesoria);
			
			stm.close();
			
		}catch(SQLException e) {
			System.out.println("Error: ");
			e.printStackTrace();
		}
		
		
		
		return idAsesoria;
	}

	

}
