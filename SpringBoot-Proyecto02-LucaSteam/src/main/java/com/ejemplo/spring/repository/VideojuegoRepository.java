package com.ejemplo.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ejemplo.spring.model.Videojuego;

@Repository
public interface VideojuegoRepository extends JpaRepository<Videojuego, Integer> {
	
	@Query("FROM Videojuego where publisher =?1")
	List<Videojuego> editorByName(String publisher);
	
	@Query("FROM Videojuego where genre =?1")
	List<Videojuego> genreByName(String genre);
	
	@Query("FROM Videojuego where year > 1899 and year < 2000")
	List<Videojuego> readGamesXX();
	
	@Query("FROM Videojuego where nombre =?1")
	List<Videojuego> findByName(String name);
}
