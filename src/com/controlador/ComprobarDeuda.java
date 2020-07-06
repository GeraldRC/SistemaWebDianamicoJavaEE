package com.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.ReporteAccidenteDao;
import com.model.Cliente;

/**
 * Servlet implementation class ComprobarDeuda
 */
@WebServlet("/deuda")
public class ComprobarDeuda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ComprobarDeuda() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession  sesion = request.getSession();
		
		Cliente c = (Cliente) sesion.getAttribute("cliente");
		ReporteAccidenteDao rdao = new ReporteAccidenteDao();
		
		boolean res = rdao.comprobarDeuda(c.getRut());
		String mensaje ="";
		if(res) {
			mensaje="USTED POSEE DEUDAS, PAGELAS PARA PODER SOLICITAR REPORTES Y VISITAS";
			request.setAttribute("mensaje", mensaje);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("formularios.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
	}

}
