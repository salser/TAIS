package com.pruebas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pruebas.model.Producto;
import com.pruebas.repository.ProductoRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/producto")
public class ProductoController {

	@Autowired(required = true)
	ProductoRepository repository;

	@GetMapping("")
	public String test() {
		return "{result: "+repository.count()+"}";
	}


}
