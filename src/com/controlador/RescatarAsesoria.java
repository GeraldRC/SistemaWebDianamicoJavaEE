package com.controlador;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.RegistroAsesoriaDao;
import com.dao.SolicitudesDao;
import com.dao.VisitaDao;
import com.dao.cheklistDao;
import com.interfaces.IRegistroAsesoriaDao;
import com.interfaces.ISolicitudesDao;
import com.interfaces.IVisitaDao;
import com.model.Cheklist;
import com.model.RegistroCheklist;
import com.model.Visita;


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
		
		ISolicitudesDao solicitudDao = new SolicitudesDao();
		
		System.out.println("request get parameter id solicitud visita" + request.getParameter("idSolicitudVisita"));
		
		int idSolicitudVisita = Integer.parseInt(request.getParameter("idSolicitudVisita"));
		
		System.out.println( "id solicitud visita en servlet rescatar visita" + idSolicitudVisita);
		
		Visita visita = new Visita();
		
		IVisitaDao visitaDao = new VisitaDao();
		
		System.out.println("id de solicitud desde controlador rescatarAsesoria " + idSolicitudVisita);
		
		visita = visitaDao.obtenerVisita(idSolicitudVisita);
		
		System.out.println("visita desde RescatarAsesoria" + visita);
		
		System.out.println("id de visita desde Rescatar asesoriaDao" + visita.getID());
		  
		
		int idAsesoria = registro.registrarAsesoria(visita.getID() );//debo pasar el id de visita
		
		
		
		
		
		
		
		for(Cheklist chek: listaChek) {
			
			RegistroCheklist cheklistProvisorio = new RegistroCheklist();
			
			int id = chek.getId();
			
			String idString = String.valueOf(id); 
			
			cheklistProvisorio.setIdChek(id);
			
			String valorChek = (request.getParameter(idString));
			
			System.out.println(valorChek);
			
			int valor = 4;
			
			if(valorChek != null) valor = Integer.parseInt(valorChek) ;
			
			
			cheklistProvisorio.setValorChek(valor);			
			
			cheklist.add(cheklistProvisorio);
			
		}
		
		boolean ok = false ;
		
		for( RegistroCheklist reg: cheklist  ) {
			
			 ok = registro.registrarChek(reg, idAsesoria);
		}
		
		
		
		
		 boolean cambioEstado = solicitudDao.actualizarSolicitudesAgendadas(visita.getIDSolicitud());
		 
		 String mensaje ;
		 
		 if (cambioEstado && ok) {
			 mensaje = "asesoria guardada con exito";
		 }else {
			 mensaje = "hubo en error en guardar asesoria";
		 }
		 
		 request.setAttribute("mensaje", mensaje);
		request.getRequestDispatcher("RespuestaAsesoria.jsp").forward(request, response);
		
		
		
		
		
		
		
		
	}

}
