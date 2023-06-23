package com.codechallenge.Escuela.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.codechallenge.Escuela.Model.Clase;
import com.codechallenge.Escuela.Service.IClaseService;

@Controller
public class ClaseController {
	@Autowired
	private IClaseService service;
	
	@GetMapping("/listarclase")
	public String listarclase(Model model){
		service.listarclase();
		model.addAttribute("alumnos",service.listarclase());
		return "index";
	}
	
	@PostMapping("/nuevaclase")
	public String NuevaClase(@Validated Clase c){
		service.nuevaClase(c);
		return "nuevaclase"; 
		
	}
}
