package com.ejemplo.spring;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ejemplo.spring.model.Videojuego;

public

@SpringBootTest
class TerceraPruebaUnitaria {
	
	@Autowired
	private Videojuego  videojuego;
	
	@Test
	void contxtLoads() {
		assertThat(videojuego.getYear()%2 == 0).isNotNull();

	}
	

}
