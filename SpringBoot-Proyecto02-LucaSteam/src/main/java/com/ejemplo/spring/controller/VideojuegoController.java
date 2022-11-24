package com.ejemplo.spring.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.spring.model.Videojuego;
import com.ejemplo.spring.service.VideojuegoService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/videojuegos")
@Tag(name = "videojuego", description = "the Videojuego API")
public class VideojuegoController {

	@Autowired
	private VideojuegoService srv;
	
	private static final Logger logger = LoggerFactory.getLogger(VideojuegoController.class);

	@GetMapping
	public List<Videojuego> readVideojuegos(){
		logger.info("Va a motrar todos los juegos de la base de datos");
		return srv.findAll();
	}
	
	@PostMapping
	public void saveVideojuego(@RequestBody Videojuego juego) {
		logger.info("----- " + juego);
		srv.save(juego);
		logger.info("Ha guardado el juego " + juego.getName() + " en la base de datos");
	}
	@PostMapping("/importar")
	public void saveBBDD() {
		importarFichero();
		logger.info("Ha importado todos los juegos de la base de datos");
	}
	
	/*@GetMapping("/byName/{name}")
	public List<Videojuego> readByNname(@PathVariable String name) {
		return srv.findByName(name);
	}*/
	
	@GetMapping("/{id}")
	public Videojuego readVideojuego(@PathVariable int id) {
		logger.info("Ha mostrado el juego con id " + id + " de la base de datos");
		return srv.findById(id).orElseThrow(VideojuegoNotFoundException::new);
	}
	@GetMapping("/centuryXX")
	public List<Videojuego> readGamesCenturyXX(){
		return srv.readGamesXX();
	}
	
	@GetMapping("/editor/{publisher}")
	public List<Videojuego> editorByName(@PathVariable String publisher){
		return srv.editorByName(publisher);
	}
	
	@GetMapping("/byName/{genre}")
	public List<Videojuego> genreByName(@PathVariable String genre) {
		return srv.genreByName(genre);
	}
	
	@GetMapping("/editor/Nintendo")
	public List<Videojuego> findByPublisher(String publisher){
		publisher = "Nintendo";
		return srv.findByPublisher(publisher);
	}	
	
	@PutMapping
	public void uploadVideojuego(@RequestBody Videojuego juego) {
		srv.save(juego);
		logger.info("Ha actualizado el juego " + juego.getName() + " de la base de datos");
	}
	
	@DeleteMapping("/{id}")
	public void deleteVideojuego(@PathVariable int id) {
		srv.deleteById(id);
		logger.info("Ha borrado el juego con id " + id + " de la base de datos");
	}
	
	private void importarFichero() {
		File fich1 = new File("vgsales.csv");
		BufferedReader br = null;
		String line = null;
		if(fich1.exists()) {
			try {
				br = new BufferedReader(new FileReader(fich1));
				BBDDfromfile(line, br);
			} catch(Exception e) {
				e.printStackTrace();
				System.out.println("El fichero no existe");
			} finally {
				try {
					if(null != br) {
						br.close();
					}
				} catch(Exception c) {
					c.printStackTrace();
				}
			}
		}
	}
	private void BBDDfromfile(String line, BufferedReader br) throws IOException {
		line = br.readLine();
		line = br.readLine();
		//-------------------
		while(line != null) {
			Videojuego v1 = new Videojuego();
			String[] list = line.split(",");
			String num;
			num = list[0];
			int n = Integer.parseInt(num);
			n++;
			String rango= Integer.toString(n);
			v1.setRango(rango);
			v1.setName(list[1]);
			int m;
			try{
				m = Integer.parseInt(list[3]);
				v1.setYear(m);
			} catch(NumberFormatException e) {
				v1.setYear(0);
			}
			v1.setGenre(list[4]);
			v1.setPlatform(list[2]);
			v1.setPublisher(list[5]);
			v1.setEU_Sales(list[7]);
			line = br.readLine();
			srv.save(v1);
		}
	}
}
