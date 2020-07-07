package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import com.conexion.Conexion;
import com.interfaces.ISolicitudesDao;
import com.model.Solicitudes;







public class SolicitudesDao implements ISolicitudesDao{

	@Override
	public boolean crearSolicitud() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Solicitudes> leerSolicitudes() {
		
		
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		ResultSet rs2 = null;
		String rut ="";
		
		String sql = "select * from SOLICITUD_VISITA";
		
		ArrayList<Solicitudes> listaSolicitudes = new ArrayList<Solicitudes>();
		
		try {
			con = Conexion.getConexion();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			
			while (rs.next()) {
				Solicitudes s = new Solicitudes();
				s.setID(rs.getInt(3));
				s.setRutCliente(rs.getString(2));
				s.setEstado(rs.getInt(1));
				s.setTipoSolicitud(rs.getInt(4));
				listaSolicitudes.add(s);
				rut = rs.getString(2);
				
				
			}
			
			
			
			
			
			stm.close();
			rs.close();
			//con.close();
		} catch(SQLException e) {
			System.out.println("Error: Clase UsuarioDao, método leerUsuarios ");
			e.printStackTrace();
		}
		
		
		try {
			con = Conexion.getConexion();
			stm = con.createStatement();
			rs2 = stm.executeQuery(sql);
			
			for(Solicitudes solicitud: listaSolicitudes){
				
				
				
				String sql2 = "select RAZON_SOCIAL from CLIENTE where rut= " + rut;
				
				rs2 = stm.executeQuery(sql2);
				
				if (rs2.next()) {
					solicitud.setNombreCliente(rs2.getString(1));
				}
		
			
				
				
				
				
			}
			
			
			
			
			
			
			
			
			stm.close();
			rs.close();
			//con.close();
		} catch(SQLException e) {
			System.out.println("Error ");
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		return listaSolicitudes;


		
		
		
		
		
		
		
		
		
	}

	@Override
	public boolean actualizarSolicitudesPendientes(int id) {
		
		boolean actualizar = false;
		
		Connection con = null;
		Statement stm = null;
		
		
		
		
		String sql = "UPDATE SOLICITUD_VISITA SET ESTADO_SOLICITUD_ID = 2 WHERE id = '" + id + "'";
		
		try {
			con = Conexion.getConexion();
			stm = con.createStatement();
			stm.execute(sql);
			actualizar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		
	
		
		
				
				
		return actualizar;		
		
		
		
	}

	@Override
	public boolean eliminarSolicitudes() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Solicitudes obtenerSolicitudes(int ID) {
		
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		ResultSet rs2 = null;
		
		String sql = "select * from SOLICITUD_VISITA where ID = " + ID;
		
		
		Solicitudes solicitud = new Solicitudes();
		try {
			con = Conexion.getConexion();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			if (rs.next()) {
				
				solicitud.setID(rs.getInt(3));
				solicitud.setRutCliente(rs.getString(2));
				solicitud.setEstado(rs.getInt(1));
				solicitud.setTipoSolicitud(rs.getInt(4));
				
				
				
				
				
			}
			
			String rut = rs.getString(2);
			String sql2 = "select RAZON_SOCIAL from CLIENTE where rut= " + rut;
			
			rs2 = stm.executeQuery(sql2);
			
			if (rs2.next()) {
				solicitud.setNombreCliente(rs2.getString(1) );
			}
			
			
			stm.close();
			rs.close();
			//con.close();
		} catch(SQLException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		
		return solicitud;
		
		
		
		
		
		
		
		
		
		
	}

	@Override
	public boolean actualizarSolicitudesAgendadas(int id) {
		
		boolean actualizar = false;
		
		Connection con = null;
		Statement stm = null;
		
		
		System.out.println("id ingresado en SolicitudesDao.actualizarAgendadas " + id);
		
		String sql = "UPDATE SOLICITUD_VISITA SET ESTADO_SOLICITUD_ID = 3 WHERE id = '" + id + "'";
		
		try {
			con = Conexion.getConexion();
			stm = con.createStatement();
			stm.execute(sql);
			actualizar = true;
			stm.close();
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		
	
		
		
				
				
		return actualizar;		
		
		
	}

	@Override
	public ArrayList<Solicitudes> leerSolicitudesAgendadas() {
		
		

		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "SELECT S.estado_solicitud_id, S.cliente_rut, C.razon_social, S.id, s.tipo_id, v.fecha FROM SOLICITUD_VISITA S INNER JOIN Cliente C on  s.cliente_rut=c.rut INNER join VISITA v on v.solicitud_id = s.id";
		
		ArrayList<Solicitudes> listaSolicitudes = new ArrayList<Solicitudes>();
		
		try {
			con = Conexion.getConexion();
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			
			while (rs.next()) {
				if(rs.getInt(1) == 2) {
					Solicitudes s = new Solicitudes();
					s.setID(rs.getInt(4));
					s.setRutCliente(rs.getString(2));
					s.setNombreCliente(rs.getString(3));
					s.setEstado(rs.getInt(1));
					s.setFecha(rs.getNString(6));
					
					
					s.setTipoSolicitud(rs.getInt(5));
					listaSolicitudes.add(s);
					
															
				}
								
				
			}
			
			
			
			
			
			stm.close();
			rs.close();
			//con.close();
		} catch(SQLException e) {
			System.out.println("Error ");
			e.printStackTrace();
		}
		
		
		
		
		
		return listaSolicitudes;
	}

}
