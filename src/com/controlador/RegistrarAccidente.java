package com.controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ReporteAccidenteDao;
import com.model.ReporteAccidente;

/**
 * Servlet implementation class RegistrarAccidente
 */
@WebServlet("/accidente")
public class RegistrarAccidente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrarAccidente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		int serie = Integer.parseInt(request.getParameter("txtserie"));
		String rutCli = request.getParameter("txtrucliente");
		String rutTra = request.getParameter("txtruttra");
		String nomTra = request.getParameter("txtnombrestra");
		String dirTra = request.getParameter("txtdirecciontra");
		String comTra = request.getParameter("txtcomtra");
		int telTra = Integer.parseInt(request.getParameter("txtteltra"));
		String sexTra = request.getParameter("sexo");
		
		boolean res=false;
		String mensaje = "";
		
		ReporteAccidente r = 
		new ReporteAccidente
		(serie,rutCli,rutTra,nomTra,dirTra,comTra,telTra,sexTra);
		ReporteAccidenteDao rdao = new ReporteAccidenteDao();
		res = rdao.registrarAccidente(r);
		if(res) {
			mensaje="Se Ingreso Correctamente el Accidente";
			request.setAttribute("mensaje", mensaje);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}else {
			mensaje = "Error de Registro";
			request.setAttribute("mensaje", mensaje);
			request.getRequestDispatcher("formAccidente.jsp").forward(request, response);
		}
		
		
	}

}
