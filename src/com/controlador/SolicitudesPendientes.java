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


@WebServlet("/SolicitudesPendientes")
public class SolicitudesPendientes extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public SolicitudesPendientes() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ISolicitudesDao solicitudesdDao = new SolicitudesDao();
		ArrayList<Solicitudes> listaSolicitudes = new ArrayList<Solicitudes>();
		
		listaSolicitudes = solicitudesdDao.leerSolicitudes();
		
		ArrayList<Solicitudes> solicitudes = new ArrayList<Solicitudes>();
		
		for(Solicitudes revisaSolicitudes: listaSolicitudes) {
			
			
			
			if(revisaSolicitudes.getEstado() == 1) {
				
				Solicitudes solicitudesIngresadas = new Solicitudes();
				
				solicitudesIngresadas = revisaSolicitudes;
				
				
				
			
				solicitudes.add(solicitudesIngresadas);
				
			}
			
			
		}
		
		request.setAttribute("solicitudes", solicitudes);
		request.getRequestDispatcher("PlanificarVisita.jsp").forward(request, response);
		
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
