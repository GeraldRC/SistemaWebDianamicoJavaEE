package com.interfaces;

import java.util.ArrayList;

import com.model.ActivMejora;
import com.model.Cheklist;

public interface IActivMejoraDao {
	public boolean  registrarAcme(ActivMejora acme);
	public boolean modificarAcme();
	public boolean eliminarAcme();
	public ArrayList<ActivMejora> leerAcme();
	public String obtenerAcme();

	
	
}
