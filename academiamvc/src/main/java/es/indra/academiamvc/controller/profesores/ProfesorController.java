package es.indra.academiamvc.controller.profesores;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import es.indra.academiamvc.authentication.MyUserDetails;
import es.indra.academiamvc.model.entities.Profesor;
import es.indra.academiamvc.model.service.ProfesorService;

@Controller
@RequestMapping("/admin/profesores")
public class ProfesorController {
	@Autowired
	ProfesorService profesorService;

	@Autowired
	ProfesorFormValidator validador;
	private Logger log = LogManager.getLogger(ProfesorController.class);

	@RequestMapping(value = "/listado.html", method = RequestMethod.GET)
	public String listado(Model model) {

		
		this.log.info("listado Profesores");
		List<Profesor> listado = this.profesorService.findAll();
		model.addAttribute("listado", listado);
		return "profesores/listado";
	}
	
	@RequestMapping(value = "/listado.html", method = RequestMethod.POST)
	public String listadoPatron(@RequestParam("patron") String patron, Model model) {

		this.log.info("listado Profesores por patrón");
		List<Profesor> listado = null;

		if (patron != null || !patron.equals("")) {
			listado = this.profesorService.findProfesoresPatron(patron);
		} else {
			listado = this.profesorService.findAll();
		}

		model.addAttribute("listado", listado);
		return "profesores/listado";
	}

	@RequestMapping(value = "/nuevo.html", method = RequestMethod.GET)
	public String nuevo(Model model) {
		model.addAttribute("profesor", new ProfesorForm(new Profesor()));
		return "profesores/nuevo";
	}

	@RequestMapping(value = "/nuevo.html", method = RequestMethod.POST)
	public String nuevoPost(@Valid @ModelAttribute("profesor") ProfesorForm form, BindingResult result) {
		ArrayList<String> errores = new ArrayList<String>();
		this.validador.validate(form, result);
		if (result.hasErrors()) {
			return "profesores/nuevo";

		} else {

			this.profesorService.create(form.obtenerProfesor());
			return "redirect:/admin/profesores/listado.html?mensaje=correcto";

		}

	}

	@RequestMapping(value = "/modificar.html", method = RequestMethod.GET)
	public String modificar(@RequestParam("id") Long id, Model model) {
		if (id == null) {
			return "redirect:/admin/profesores/listado.html?mensaje=errorId";

		} else {
			Profesor profesor = this.profesorService.find(id);
			if (profesor != null) {
				ProfesorForm form = new ProfesorForm(profesor);
				model.addAttribute("formulario", form);
				return "profesores/modificar";

			} else {
				return "redirect:/admin/profesores/listado.html?mensaje=errorId";
			}

		}

	}

	@RequestMapping(value = "/modificar.html", method = RequestMethod.POST)
	public String modificarPost(@Valid @ModelAttribute("formulario") ProfesorForm profesor, BindingResult result) {
		ArrayList<String> errores = new ArrayList<String>();
		this.validador.validate(profesor, result);
		if (result.hasErrors()) {
			return "profesores/modificar";

		} else {

			this.profesorService.update(profesor.obtenerProfesor());
			return "redirect:/admin/profesores/listado.html?mensaje=correcto";

		}

	}

	@RequestMapping(value = "/eliminar.html", method = RequestMethod.GET)
	public String eliminar(@RequestParam("id") Long id, Model model) {

		if (id == null) {
			return "redirect:/admin/profesores/listado.html?mensaje=errorId";
		} else {
			Profesor profesor = this.profesorService.find(id);
			if (profesor != null) {
				this.profesorService.delete(id);
				return "redirect:/admin/profesores/listado.html?mensaje=correcto";
			} else {
				return "redirect:/admin/profesores/listado.html?mensaje=errorId";
			}

		}

	}
}
