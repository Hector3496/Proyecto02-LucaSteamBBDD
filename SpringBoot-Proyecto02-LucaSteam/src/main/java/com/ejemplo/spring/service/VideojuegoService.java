package com.ejemplo.spring.service;

import java.util.List;
import java.util.Optional;

import com.ejemplo.spring.model.Videojuego;

public interface VideojuegoService {
	
	public List<Videojuego> findAll();

	public Optional<Videojuego> findById(int id);
	
	public void save(Videojuego juego);
	
	public void deleteById(int id);
	
	public List<Videojuego> findByName(String name);
	
	public void importarFichero();
}
