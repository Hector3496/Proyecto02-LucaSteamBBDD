package com.ejemplo.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.ejemplo.spring.service.VideojuegoService;

public class VideojuegoController {

	@Autowired
	private VideojuegoService srv;
}
