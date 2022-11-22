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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.spring.model.Videojuego;
import com.ejemplo.spring.service.VideojuegoService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

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
	
	@GetMapping("/byname/{name}")
	public List<Videojuego> readByUsername(@PathVariable String name) {
		return srv.findByUsername(name);
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
	
	@PostMapping
	public void addVideojuego(@RequestBody Videojuego juego) {
		srv.save(juego);
	}
}
