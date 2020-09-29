package com.pruebas.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebas.model.PruebaDTO;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/prueba")
public class PruebaController {
	
	@GetMapping("")
	public PruebaDTO getPrueba() {
		PruebaDTO prueba = new PruebaDTO();
		prueba.setNombre("Prueba....");
		return prueba;
	}

}
