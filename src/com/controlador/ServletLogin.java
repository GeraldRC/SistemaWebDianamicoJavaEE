package com.controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UsuarioDao;
import com.model.Cliente;
import com.model.Usuario;

@WebServlet("/login")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletLogin() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		response.setContentType("text/html");
		
		
	    PrintWriter out = response.getWriter();
	    request.getRequestDispatcher("login.jsp").include(request, response);
        String usu = request.getParameter("usuario");
        String con = request.getParameter("contrasena");
        String rol ="";
        System.out.println(usu);
        System.out.println(con);
        UsuarioDao dao = new UsuarioDao();
        
        Usuario u = dao.comprobarUsuario(usu,con);
        System.out.println(u.getApellido());
        rol = dao.obtenerRol(u.getId_rol());
        System.out.println(rol);
        if (u != null) {
			if(rol.equalsIgnoreCase("cliente")) {
				
				Cliente c = dao.ObtenerDatosCliente(u.getId());
				HttpSession  sesion = request.getSession();
				sesion.setAttribute("user", u);
				sesion.setAttribute("rol", rol);
				sesion.setAttribute("cliente", c);
	            request.getRequestDispatcher("index.jsp").forward(request, response);
	            
			}else if(rol.equalsIgnoreCase("profesional")) {
				
				HttpSession  sesion = request.getSession();
				sesion.setAttribute("user", u);
				sesion.setAttribute("rol", rol);
	            request.getRequestDispatcher("PanelProfesional.jsp").forward(request, response);
	            
			}else if(rol.equalsIgnoreCase("administrador")) {
				
				HttpSession  sesion = request.getSession();
				sesion.setAttribute("user", u);
				sesion.setAttribute("rol", rol);
	            request.getRequestDispatcher("PanelAdmin.jsp").forward(request, response);
			}
		}else {
			 out.println("<p>Error de datos</p>");

		}
        
        
	}
}
