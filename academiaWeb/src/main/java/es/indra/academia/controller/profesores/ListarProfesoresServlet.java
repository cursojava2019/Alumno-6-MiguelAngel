package es.indra.academia.controller.profesores;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import es.indra.academia.model.entities.Profesor;
import es.indra.academia.model.service.ProfesorService;

/**
 * Servlet implementation class ListarProfesoresServer
 */
@WebServlet("/admin/profesores/listado.html")
public class ListarProfesoresServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Logger log = LogManager.getLogger(ListarProfesoresServlet.class);
	
	ProfesorService profesorService;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListarProfesoresServlet() {
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.log.info("Se recibe una petición para listar alumnos");

		List<Profesor> profesores = this.profesorService.findAll();
		request.setAttribute("listado", profesores);

		RequestDispatcher dispacher = request.getRequestDispatcher("/WEB-INF/jsp/profesores/listado.jsp");
		this.log.debug("Se obtienen todos los alumnos de BBDD y se mandan al jsp");
		dispacher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String patron = request.getParameter("patron");
		List<Profesor> profesores = null;
		if (patron != null && !patron.equals("")) {
			profesores = profesorService.findProfesoresPatron(patron);
		} else {
			profesores = profesorService.findAll();
		}

		request.setAttribute("listado", profesores);

		RequestDispatcher dispacher = request.getRequestDispatcher("/WEB-INF/jsp/profesores/listado.jsp");
		dispacher.forward(request, response);
	}

}