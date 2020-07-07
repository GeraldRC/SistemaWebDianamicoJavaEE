package com.interfaces;

import java.util.ArrayList;


import com.model.Visita;

public interface IVisitaDao {
	
	public boolean  registrarVisita(Visita visita);
	public boolean modificarVisita();
	public boolean eliminarVisita();
	public ArrayList<Visita> leerVisita();
	public Visita obtenerVisita(int idSolicitudVisita);

}
