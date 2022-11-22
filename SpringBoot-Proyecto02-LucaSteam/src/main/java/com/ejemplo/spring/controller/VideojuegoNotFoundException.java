package com.ejemplo.spring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class VideojuegoNotFoundException extends RuntimeException{

	private final static long serialVersionUID = 1L;
	
	public VideojuegoNotFoundException() {
		super("Error. El videojuego no existe");
	}
	public VideojuegoNotFoundException(Long id) {
		super("Error. El videojuego " + id + " no existe");
	}
}
