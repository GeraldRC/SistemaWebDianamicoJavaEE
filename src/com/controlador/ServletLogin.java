package com.controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletLogin() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		response.setContentType("text/html");
		
		
	    PrintWriter out = response.getWriter();
	    request.getRequestDispatcher("login.jsp").include(request,response);
		String usu = request.getParameter("usuario");
		String con = request.getParameter("contrasena");
		
		
		if(usu.trim().length()== 0 || con.trim().length()== 0){
			out.print("<script>\r\n" + 
					"        alert(\"Ingrese Datos\");\r\n" + 
					"    </script>");
		}else if(usu.equalsIgnoreCase("gerald") && con.equalsIgnoreCase("123")) {
			HttpSession session=request.getSession();  
	        session.setAttribute("usuario",usu);
            request.getRequestDispatcher("index.jsp").forward(request, response);
		}else {
			out.print("<script>\r\n" + 
					"        alert(\"Error de Datos\");\r\n" + 
					"    </script>");  
		}
		
	}
}
