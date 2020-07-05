package com.controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.cheklistDao;
import com.interfaces.ICheklistDao;
import com.model.Cheklist;


@WebServlet("/LeerCheklist")
public class LeerCheklist extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


    public LeerCheklist() {

    	
    }



    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}



	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		ICheklistDao chekdao = new cheklistDao();
		ArrayList<Cheklist> cheklist = new ArrayList<Cheklist>();
		
		cheklist = chekdao.leerChek();
		
		request.setAttribute("cheklist", cheklist);
		request.getRequestDispatcher("  .jsp").forward(request, response);
		
		
		
		
		
	}

}
