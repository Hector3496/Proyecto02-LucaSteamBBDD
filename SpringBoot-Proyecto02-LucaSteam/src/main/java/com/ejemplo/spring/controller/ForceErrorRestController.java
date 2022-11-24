package com.ejemplo.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ForceErrorRestController {
	
    @GetMapping(value = "/videojuegos/throwException")
    public void throwException() {
        throw new IllegalArgumentException("\"Soy el mensaje de error de Rest Controller\"");
    }
}
