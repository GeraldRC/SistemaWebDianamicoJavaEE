package com.controlador;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.cheklistDao;
import com.interfaces.ICheklistDao;
import com.model.Cheklist;



@WebServlet("/IngresarChek")
public class IngresarChek extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


    public IngresarChek() {

    }



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String chek = request.getParameter("txtcheck");
		String mensaje;
		
		Cheklist cheklist = new Cheklist(chek);
		
		ICheklistDao chekdao = new cheklistDao();
		
		boolean registrar = chekdao.registrarChek(cheklist);
		
		if (registrar) {
			mensaje = "se registro exitosamente el chek '" + chek + "'";
		}
		else {
			mensaje = "ocurrio algun problema al registrar el chek";
		}
		
		
		ICheklistDao cheklistdao = new cheklistDao();
		ArrayList<Cheklist> lista = new ArrayList<Cheklist>();
		
		lista = cheklistdao.leerChek();
		
		request.setAttribute("lista", lista);
		request.setAttribute("mensaje", mensaje);
		request.getRequestDispatcher("confirmacionChek.jsp").forward(request, response);
		
				
		
		
		
		
		
		
		
	}

}
