package com.ejemplo.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ejemplo.spring.model.Videojuego;

public interface VideojuegoRepository extends JpaRepository<Videojuego, Integer> {
	
	@Query("FROM User where username =?1")
	List<Videojuego> findByUsername(String username);
}
