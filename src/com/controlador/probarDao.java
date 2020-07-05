package com.controlador;

import java.util.ArrayList;

import com.dao.cheklistDao;
import com.interfaces.ICheklistDao;
import com.model.Cheklist;

public class probarDao {

	public static void main(String[] args) {
		
		//Cheklist prueba = new Cheklist("esta es una prueba de cheklist 4");
		
		ICheklistDao pruebaDao = new cheklistDao();
		
		//pruebaDao.registrarChek(prueba);
		
		ArrayList<Cheklist> listaChek= pruebaDao.leerChek();
		
		for(Cheklist cheks: listaChek) {
			
			System.out.println(cheks);
			
		}
		
		

	}

}
