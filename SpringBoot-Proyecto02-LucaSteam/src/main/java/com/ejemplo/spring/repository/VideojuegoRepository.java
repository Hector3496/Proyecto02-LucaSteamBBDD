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
	
	@Query("FROM Videojuego where publisher =?1")
	List<Videojuego> findByPublisher(String publisher);
	
	@Query("FROM Videojuego where nombre =?1")
	List<Videojuego> findByName(String name);
	
	@Query(value = "SELECT * FROM videojuegos where eu_Sales > (select avg(eu_Sales) FROM videojuegos)", nativeQuery = true)
    List<Videojuego> mediaVentas();
	
	@Query(value = "SELECT * FROM videojuegos where year%2=0 order by year", nativeQuery = true)
    List<Videojuego> yearPares();

	@Query("FROM Videojuego where year =?1")
	List<Videojuego> mostrarYear(int year);
	
}
