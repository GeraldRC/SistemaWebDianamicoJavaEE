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
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String chek = request.getParameter("txtcheck");
		String mensaje;
		if(chek.trim().length()==0) {
			mensaje="Ingrese un Check";
			request.setAttribute("mensaje", mensaje);
			request.getRequestDispatcher("checklist.jsp").forward(request, response);
			
		}else {
			Cheklist cheklist = new Cheklist(chek);//intancia de objeto check
		
			ICheklistDao chekdao = new cheklistDao();//instancia de objeto daoCheck
		
			ArrayList<Cheklist> lista = new ArrayList<Cheklist>();//instancia arrayList del tipo check para contener los objetos
		
			boolean registrar = chekdao.registrarChek(cheklist);// uso de metodo registrarCheck para obtener una respuesta
		
		
			if (registrar) {
				mensaje = "Registrado Exitosamente '"+chek.toUpperCase()+"'";
				lista = chekdao.leerChek();
				request.setAttribute("lista", lista);
				request.setAttribute("mensaje", mensaje);
				request.getRequestDispatcher("confirmacionChek.jsp").forward(request, response);
			}else {
			mensaje = "ocurrio algun problema al registrar el chek";
			request.setAttribute("mensaje", mensaje);
			request.getRequestDispatcher("checklist.jsp").forward(request, response);
			}
				
			
		}
		
		
		
		
		
		

		
		
		
		
				
		
		
		
		
		
		
		
	}

}
