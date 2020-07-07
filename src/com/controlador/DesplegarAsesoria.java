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




@WebServlet("/DesplegarAsesoria")
public class DesplegarAsesoria extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	
    public DesplegarAsesoria() {
        super();
        // TODO Auto-generated constructor stub
    }



    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}



	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int idSolicitudVisita = Integer.parseInt(request.getParameter("asesoria"));
		System.out.println("id solicitud visita = " +idSolicitudVisita);
		
		ICheklistDao chekdao = new cheklistDao();
		ArrayList<Cheklist> cheklist = new ArrayList<Cheklist>();
		
		cheklist = chekdao.leerChek();
		
		request.setAttribute("cheklist", cheklist);
		
		request.setAttribute("idSolicitudVisita", idSolicitudVisita);
		request.getRequestDispatcher("ingresoAsesoria.jsp").forward(request, response);
		
		
	}

}
