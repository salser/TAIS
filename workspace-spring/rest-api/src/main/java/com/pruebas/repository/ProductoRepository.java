package com.pruebas.repository;

import org.springframework.data.repository.CrudRepository;

import com.pruebas.model.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long> {

}
