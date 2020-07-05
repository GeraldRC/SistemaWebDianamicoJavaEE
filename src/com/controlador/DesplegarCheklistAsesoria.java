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





@WebServlet("/DesplegarCheklistAsesoria")
public class DesplegarCheklistAsesoria extends HttpServlet {
	private static final long serialVersionUID = 1L;


	
	
    public DesplegarCheklistAsesoria() {

    	
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	
		
		ICheklistDao chekdao = new cheklistDao();
		ArrayList<Cheklist> cheklist = new ArrayList<Cheklist>();
		
		cheklist = chekdao.leerChek();
		
		request.setAttribute("cheklist", cheklist);
		request.getRequestDispatcher("ingresoAsesoria.jsp").forward(request, response);
		
		
		
		
		
		
	}



	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
