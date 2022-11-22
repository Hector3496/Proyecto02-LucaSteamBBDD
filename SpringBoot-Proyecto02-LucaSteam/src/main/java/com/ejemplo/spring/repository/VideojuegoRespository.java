package com.ejemplo.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejemplo.spring.model.Videojuego;

public interface VideojuegoRespository extends JpaRepository<Videojuego, Integer> {

}
