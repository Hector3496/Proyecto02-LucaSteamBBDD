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
	
<<<<<<< HEAD
	public List<Videojuego> genreByName(String genre);
	
=======
	public List<Videojuego> editorByName(String publisher);
>>>>>>> 28569ebada8f898ad5d0b62f073de15b541dd563
}
