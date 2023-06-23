package com.codechallenge.Escuela.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.codechallenge.Escuela.Model.Alumno;
import com.codechallenge.Escuela.Service.IAlumnoService;

@Controller
public class AlumnoController {
	@Autowired
	private IAlumnoService service;
	
	@GetMapping("/index")
	public String listar(Model model){
		service.listar();
		model.addAttribute("alumnos",service.listar());
		return "index";
	}
	@PostMapping("/nuevo")
	public String NuevoAlumno(@Validated Alumno a){
		service.nuevoAlumno(a);
		return "/nuevo"; 
		
	}
}
