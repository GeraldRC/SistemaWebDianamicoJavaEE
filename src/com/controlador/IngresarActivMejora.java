/**
 * @author Edgardo
 *  REVISADO 05-07-2020
 */


package com.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ActivMejoraDao;
import com.model.ActivMejora;

/**
 * Servlet implementation class IngresarActivMejora
 */
@WebServlet("/IngresarActivMejora")
public class IngresarActivMejora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IngresarActivMejora() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
				
		int asesoria_id = Integer.parseInt(request.getParameter("asesoriaid"));
		int id_1 = Integer.parseInt(request.getParameter("id1"));
		int estado_mejora_id = Integer.parseInt(request.getParameter("estadomejoraid"));
		String descripcion = request.getParameter("descripcion");
		
		ActivMejora acme = new ActivMejora(asesoria_id, id_1, estado_mejora_id, descripcion);
		
		ActivMejoraDao acmedao = new ActivMejoraDao();
		boolean agregar = acmedao.ingresarActivMejora(acme);
		
		String mensaje="";
		
		if (agregar)
			mensaje = "La Actividad de Mejora se ha ingresado exitosamente";
		else
			mensaje = "Ocurrió un ERROR al ingresar la Actividad de Mejora";
		
		request.setAttribute("cumensaje", mensaje);
		request.getRequestDispatcher("IngresoActividadMejora.jsp").forward(request, response);
		
		
		
	}

}
