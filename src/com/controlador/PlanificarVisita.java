package com.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.SolicitudesDao;
import com.interfaces.ISolicitudesDao;
import com.model.Solicitudes;
import com.model.Visita;


@WebServlet("/PlanificarVisita")
public class PlanificarVisita extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
       

    public PlanificarVisita() {

    	
    	
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}



	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int idSolicitud = Integer.parseInt(request.getParameter("AGENDAR"));
		
		
		Solicitudes solicitud ;
		
		ISolicitudesDao solicitudDao = new SolicitudesDao();
		
		solicitud = solicitudDao.obtenerSolicitudes(idSolicitud);
		
		
		int rutProfesional = 12345678; //modificar forma de ingresar el rut segun sesion
		
		Visita visita = new Visita(rutProfesional, idSolicitud);
		//System.out.println(visita);
		
		request.setAttribute("solicitud", solicitud);
		request.setAttribute("visita", visita);
		request.setAttribute("idSolicitud", idSolicitud);
		request.setAttribute("rutProfesional", rutProfesional);
		request.getRequestDispatcher("RegistrarVisita.jsp").forward(request, response);
		
		
		
		
		
	}

}
