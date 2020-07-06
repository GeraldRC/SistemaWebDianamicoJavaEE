package com.interfaces;

import java.util.ArrayList;

import com.model.RegistroCheklist;

public interface IRegistroAsesoriaDao {
	
	
	public int registrarAsesoria(int numeroVista);
	public boolean modificarChek();
	public boolean eliminarChek();
	public ArrayList<RegistroCheklist> leerChek();
	public String obtenerChek();
	public boolean registrarChek(RegistroCheklist registro, int idAsesoria);
	
	

}
