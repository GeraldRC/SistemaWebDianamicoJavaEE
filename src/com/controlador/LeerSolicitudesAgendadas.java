package com.controlador;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.SolicitudesDao;
import com.interfaces.ISolicitudesDao;
import com.model.Solicitudes;




@WebServlet("/LeerSolicitudesAgendadas")
public class LeerSolicitudesAgendadas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	
    public LeerSolicitudesAgendadas() {
        super();
        // TODO Auto-generated constructor stub
    }



    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("llego al servlet");
		ArrayList<Solicitudes> listaSolicitudes = new ArrayList<Solicitudes>();
		
		ArrayList<Solicitudes> listaSolicitudesRevisadas = new ArrayList<Solicitudes>();
		
		ISolicitudesDao daoSolicitudes = new SolicitudesDao();
		
		listaSolicitudes = daoSolicitudes.leerSolicitudesAgendadas();
		
		for(Solicitudes sol: listaSolicitudes) {
			
			if(sol.getTipoSolicitud() == 2 ) {
				
				Solicitudes soli = new Solicitudes();
				soli =sol;
				listaSolicitudesRevisadas.add(soli);
				
			}
						
				
				
		}
		
		for(Solicitudes sol: listaSolicitudesRevisadas) {
			
			System.out.println(sol);
			
			
		}
		
		request.setAttribute("listaSolicitudes", listaSolicitudesRevisadas);
		request.getRequestDispatcher("SolicitudesAgendadas.jsp").forward(request, response);
		
		
		System.out.println("termino el servlet");
	}



	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	
	}

}
