package com.interfaces;

import java.util.ArrayList;
import java.util.List;

import com.model.Solicitudes;


public interface ISolicitudesDao {
	
	public boolean crearSolicitud();
	public ArrayList<Solicitudes> leerSolicitudes();
	public boolean actualizarSolicitudesPendientes(int id);
	public boolean actualizarSolicitudesAgendadas(int id);
	public boolean eliminarSolicitudes();
	public Solicitudes obtenerSolicitudes(int ID);
	
	

}
