package es.indra.academia.controller.profesores;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import es.indra.academia.model.service.ProfesorService;

/**
 * Servlet implementation class CrearAlumnoServlet
 */
@WebServlet("/admin/profesores/nuevo.html")
public class CrearProfesorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	ProfesorService profesorService;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearProfesorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		ServletContext sc = getServletContext();
		WebApplicationContext wac = WebApplicationContextUtils.getWebApplicationContext(sc);
		this.profesorService = wac.getBean(ProfesorService.class);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispacher = request.getRequestDispatcher("/WEB-INF/jsp/profesores/nuevo.jsp");
		dispacher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<String> errores = new ArrayList<String>();
		
		ProfesorForm profesor = ProfesorForm.obtenerProfesorForm(request);

		profesor.validar(errores);
		if (errores.size() > 0) {
			request.setAttribute("formulario", profesor);
			request.setAttribute("errores", errores);

			RequestDispatcher dispacher = request.getRequestDispatcher("/WEB-INF/jsp/profesores/nuevo.jsp");
			dispacher.forward(request, response);
		} else {
			this.profesorService.create(profesor);

			response.sendRedirect("./listado.html?mensaje=correcto");
		}
	}

}
