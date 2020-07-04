package com.interfaces;

import java.util.ArrayList;

import com.model.Cheklist;


public interface ICheklistDao {

	public boolean  registrarChek(Cheklist chek);
	public boolean modificarChek();
	public boolean eliminarChek();
	public ArrayList<Cheklist> leerChek();
	public String obtenerChek();
	
}
