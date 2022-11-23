package com.ejemplo.spring.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.spring.model.Videojuego;
import com.ejemplo.spring.service.VideojuegoService;

@RestController
@RequestMapping("/videojuegos")
public class VideojuegoController {

	@Autowired
	private VideojuegoService srv;
	
	private static final Logger logger = LoggerFactory.getLogger(VideojuegoController.class);

	@GetMapping
	public List<Videojuego> readVideojuegos(){
		return srv.findAll();
	}
	
	@PostMapping
	public void saveVideojuego(@RequestBody Videojuego juego) {
		logger.info("----- " + juego);
		srv.save(juego);
	}
	
	@GetMapping("/byName/{name}")
	public List<Videojuego> readByNname(@PathVariable String name) {
		return srv.findByName(name);
	}
	
	@GetMapping("/{id}")
	public Videojuego readVideojuego(@PathVariable int id) {
		return srv.findById(id).orElseThrow(VideojuegoNotFoundException::new);
	}
	
	@PutMapping
	public void uploadVideojuego(@RequestBody Videojuego juego) {
		srv.save(juego);
	}
	
	@DeleteMapping("/{id}")
	public void deleteVideojuego(@PathVariable int id) {
		srv.deleteById(id);
	}
	

}
