package com.pruebas.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebas.model.Almacen;
import com.pruebas.repository.AlmacenRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/almacen")
public class AlmacenController {

	@Autowired(required = true)
	AlmacenRepository repository;

	@GetMapping("")
	public Iterable<Almacen> getAlmacen() {
		return repository.findAll();
	}

	@GetMapping("{id}")
	public Optional<Almacen> getAlmacenId(@PathVariable Long id) {
		return repository.findById(id);
	}

}
