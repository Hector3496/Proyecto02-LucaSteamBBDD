package com.ejemplo.spring;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ejemplo.spring.controller.VideojuegoController;
import com.ejemplo.spring.model.Videojuego;

@SpringBootTest
public class SegundaPruebaUnitaria {

	@Autowired
	private VideojuegoController controller;
	
	@Autowired
	private Videojuego videojuego;
	
	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
		assertThat(controller.readVideojuegos()).isNotNull();
		assertThat(videojuego.getEU_Sales()).isNotNull();
		assertThat(videojuego.getGenre()).isNotNull();
		assertThat(videojuego.getName()).isNotNull();
		
}
}