package com.ejemplos.spring.controller.error;

public class VideojuegoNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public VideojuegoNotFoundException() { 
		super("Epic Fail: No existe el estudiante");
	}
	public VideojuegoNotFoundException(Long id) {
		super("Epic Fail: No existe el estudiante "+id);
	}	

}
