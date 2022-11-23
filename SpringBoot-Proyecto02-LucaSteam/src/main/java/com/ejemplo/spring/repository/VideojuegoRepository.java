package com.ejemplo.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ejemplo.spring.model.Videojuego;

@Repository
public interface VideojuegoRepository extends JpaRepository<Videojuego, Integer> {
		
	@Query("FROM Videojuego where nombre =?1")
	List<Videojuego> findByName(String name);
	
	@Query("FROM Videojuego where publisher =?1")
	List<Videojuego> editorByName(String publisher);
}
