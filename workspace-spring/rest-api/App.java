package com.pruebas.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebas.model.Proceso;
import com.pruebas.repository.ProcesoRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/almacen")
public class App {

	@Autowired(required = true)
	ProcesoRepository repository;

	@GetMapping("")
	public Iterable<Proceso> getProceso() {
		return repository.findAll();
	}

	@GetMapping("{id}")
	public Optional<Proceso> getProcesoId(@PathVariable Long id) {
		return repository.findById(id);
	}



	
//Almacen






	
//Proceso




}
