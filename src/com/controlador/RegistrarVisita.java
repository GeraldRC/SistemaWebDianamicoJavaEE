package com.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.SolicitudesDao;
import com.dao.VisitaDao;
import com.interfaces.ISolicitudesDao;
import com.interfaces.IVisitaDao;
import com.model.Visita;

/**
 * Servlet implementation class RegistrarVisita
 */
@WebServlet("/RegistrarVisita")
public class RegistrarVisita extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	
	
    public RegistrarVisita() {
        super();
        // TODO Auto-generated constructor stub
    }



    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}



	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String fecha = request.getParameter("fecha");
		int idSolicitud = Integer.parseInt(request.getParameter("idSolicitud"));
		int rutProfesional =  Integer.parseInt(request.getParameter("rutProfesional"));
		
		String mensaje;
		
		Visita visita = new Visita(rutProfesional, idSolicitud, fecha);
		
		IVisitaDao visitaDao = new VisitaDao();
		
		boolean confVisita = visitaDao.registrarVisita(visita);
		
		ISolicitudesDao solicitudDao = new SolicitudesDao();
		
		boolean confSolicitud = solicitudDao.actualizarSolicitudesPendientes(idSolicitud);
		
		
		if(confVisita && confSolicitud) {
			mensaje = "visita agendado con exito";
		}else {
			mensaje = " error al agendar visita";
		}
		
		request.setAttribute("mensaje", mensaje);
		request.getRequestDispatcher("ConfirmarRegistroVisita.jsp").forward(request, response);
		
		
		
	}

}
