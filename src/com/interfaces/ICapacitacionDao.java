package com.interfaces;

import java.util.ArrayList;

import com.model.Capacitacion;


public interface ICapacitacionDao {
	
	public boolean  registrarCapacitacion(Capacitacion c);
	public boolean modificarCapacitacion(Capacitacion c);
	public boolean eliminarCapacitacion(Capacitacion c);
	public ArrayList<Capacitacion> leerCapacitacion();
	public Capacitacion obtenerCapacitacion(int id);
	
	
	
	
	

}
