package com.ejemplo.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.spring.service.VideojuegoService;

@RestController
@RequestMapping("/videojuegos")
public class VideojuegoController {

	@Autowired
	private VideojuegoService srv;
}
