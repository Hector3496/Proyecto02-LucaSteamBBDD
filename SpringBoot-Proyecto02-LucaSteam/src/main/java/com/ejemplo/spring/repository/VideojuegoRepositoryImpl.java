package com.ejemplo.spring.repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Repository;

import com.ejemplo.spring.model.Videojuego;

@Repository
public class VideojuegoRepositoryImpl implements VideojuegoRepository{

	@Override
	public List<Videojuego> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Videojuego> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Videojuego> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Videojuego> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Videojuego> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Videojuego> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Videojuego> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Videojuego getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Videojuego getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Videojuego getReferenceById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Videojuego> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Videojuego> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Videojuego> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Videojuego> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Videojuego> findById(Integer id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Videojuego entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Videojuego> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Videojuego> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends Videojuego> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Videojuego> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Videojuego> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Videojuego, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void importarFichero() {
		File fich1 = new File("vgsales.csv");
		BufferedReader br = null;
		String line = null;
		if(fich1.exists()) {
			try {
				br = new BufferedReader(new FileReader(fich1));
				BBDDfromfile(line, br);
			} catch(Exception e) {
				e.printStackTrace();
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
		System.out.println("Ha importado el fichero vgsales");
		
	}
public void BBDDfromfile(String line, BufferedReader br) throws IOException {
		
		line = br.readLine();
		line = br.readLine();
		
		//-------------------
		ArrayList<Videojuego> videojuegos = new ArrayList<>();
		while(line != null) {
			Videojuego v1 = new Videojuego();
			String[] list = line.split(",");
			String num;
			if(videojuegos.isEmpty()) {
				v1.setRango(list[0]);
			} else {
				num = list[0];
				int n = Integer.parseInt(num);
				n++;
				String rango= Integer.toString(n);
				v1.setRango(rango);
			}
			v1.setName(list[1]);
			v1.setYear(list[2]);
			v1.setGenre(list[3]);
			v1.setPlatform(list[4]);
			v1.setPublisher(list[5]);
			v1.setEU_Sales(list[6]);
			
			line = br.readLine();
			save(v1);
			videojuegos.add(v1);
		}
	}
	@Override
	public List<Videojuego> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
