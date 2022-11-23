package com.ejemplo.spring.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.spring.model.Videojuego;
import com.ejemplo.spring.repository.VideojuegoRepository;

@Service
public class VideojuegoServiceImpl implements VideojuegoService {

	@Autowired
	private VideojuegoRepository repo;
	
	@Override
	public List<Videojuego> findAll() {
		return repo.findAll();
	}

	@Override
	public Optional<Videojuego> findById(int id) {
		return repo.findById(id);
	}

	@Override
	public void save(Videojuego juego) {
		repo.save(juego);
	}

	@Override
	public void deleteById(int id) {
		repo.deleteById(id);
	}

	@Override
	public List<Videojuego> findByName(String name) {
		return repo.findByName(name);
	}
	
	@Override
	public List<Videojuego> genreByName(String genre) {
		return repo.genreByName(genre);
	}

	@Override
	public List<Videojuego> editorByName(String publisher){
		return repo.editorByName(publisher);		
		}
	}

		
