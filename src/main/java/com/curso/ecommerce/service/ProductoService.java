package com.curso.ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.curso.ecommerce.model.Producto;

public interface ProductoService {//aqui definiremos nuestro CRUD
	
	public Producto save(Producto producto);
	public Optional<Producto> get(Integer id); //retorna un Optional de tipo producto,pq nos da la opción de validad si 
											   // el objeto existe o no
	public void update(Producto producto);
	public void delete(Integer id);
	public List<Producto> findAll();
	
	
	

}
