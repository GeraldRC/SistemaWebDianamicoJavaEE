package com.controlador;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CapacitacionDao;
import com.dao.cheklistDao;
import com.interfaces.ICapacitacionDao;
import com.interfaces.ICheklistDao;
import com.model.Capacitacion;
import com.model.Cheklist;




@WebServlet("/CrearCapacitacion")
public class CrearCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	
    public CrearCapacitacion() {
        super();
        // TODO Auto-generated constructor stub
    }



    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}



	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String ingreso = request.getParameter("capacitacion");
		
		String mensaje;
		
		Capacitacion capacitacion = new Capacitacion(ingreso);
		
		ICapacitacionDao capacitacionDao = new CapacitacionDao();
		
		boolean registrar = capacitacionDao.registrarCapacitacion(capacitacion);
		
		if (registrar) {
			mensaje = "se registro exitosamente la capacitacion '" + ingreso + "'";
		}
		else {
			mensaje = "ocurrio algun problema al registrar el capacitacion";
		}
		
		
		ArrayList<Capacitacion> listaCapacitaciones = new ArrayList<Capacitacion>();
		
		listaCapacitaciones = capacitacionDao.leerCapacitacion();
				
		request.setAttribute("lista", listaCapacitaciones);
		request.setAttribute("mensaje", mensaje);
		request.getRequestDispatcher("ConfirmacionCapacitacion.jsp").forward(request, response);
		
		
	}

}
