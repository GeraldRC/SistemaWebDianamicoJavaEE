package com.controlador;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.RegistroAsesoriaDao;
import com.dao.cheklistDao;
import com.interfaces.IRegistroAsesoriaDao;
import com.model.Cheklist;
import com.model.RegistroCheklist;


@WebServlet("/RescatarAsesoria")
public class RescatarAsesoria extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
    public RescatarAsesoria() {

    	
    }


    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		cheklistDao cheklistDao = new cheklistDao();
		
		ArrayList<Cheklist> listaChek = new ArrayList<Cheklist>();
		
		listaChek = cheklistDao.leerChek();
		
		ArrayList<RegistroCheklist> cheklist = new ArrayList<RegistroCheklist>();
		
		IRegistroAsesoriaDao registro = new RegistroAsesoriaDao();
		
		
		
		
//		
//		for(Cheklist chek: listaChek) {
//			
//			RegistroCheklist cheklistProvisorio = new RegistroCheklist();
//			
//			int id = chek.getId();
//			
//			String idString = String.valueOf(id); 
//			
//			cheklistProvisorio.setIdChek(id);
//			
//			String valorChek = (request.getParameter(idString));
//			
//			System.out.println(valorChek);
//			
//			int valor = 4;
//			
//			if(valorChek != null) valor = Integer.parseInt(valorChek) ;
//			
//			
//			cheklistProvisorio.setValorChek(valor);			
//			
//			cheklist.add(cheklistProvisorio);
//			
//		}
		
		registro.registrarAsesoria(102);
		
		//for( RegistroCheklist reg: cheklist  ) {
			
			//registro.registrarChek(reg);
		//}
		
		
	}

}
