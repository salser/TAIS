package com.pruebas.repository;

import org.springframework.data.repository.CrudRepository;

import com.pruebas.model.Inventario;

public interface InventarioRepository extends CrudRepository<Inventario, Long> {

}
