package com.interfaces;

import java.util.ArrayList;

import com.model.CrearCapacitacion;

public interface ICrearCapacitacionDao {
	
	public boolean registrarCap(CrearCapacitacion cap);
	public boolean modificarCap();
	public boolean eliminarCap();
	public ArrayList<CrearCapacitacion> leerCap();
	public String obtenerCap();

}
