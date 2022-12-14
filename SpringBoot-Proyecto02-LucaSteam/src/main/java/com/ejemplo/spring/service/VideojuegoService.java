package com.ejemplo.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;

import com.ejemplo.spring.model.Videojuego;

public interface VideojuegoService {
	
	public List<Videojuego> findAll();

	public Optional<Videojuego> findById(int id);
	
	public void save(Videojuego juego);
	
	public void deleteById(int id);
	
	public List<Videojuego> findByName(String name);
	
	public List<Videojuego> readGamesXX();
	
	public List<Videojuego> editorByName(String publisher);
	
	public List<Videojuego> genreByName(String genre);
	
	public List<Videojuego> findByPublisher(String publisher);
	
	public List<Videojuego> mediaVentas();

	public List<Videojuego> yearPares();
	
	public List<Videojuego> mostrarYear(int year);

}
