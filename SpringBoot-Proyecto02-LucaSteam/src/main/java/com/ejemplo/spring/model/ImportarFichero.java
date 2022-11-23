package com.ejemplo.spring.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ImportarFichero {
	
	public ArrayList<Videojuego> videojuegos;
	
	public ImportarFichero() {
		this.videojuegos = new ArrayList<>();
	}
			
	//Metodo para importar el fichero .csv
	public void importarFichero(String name) {
		File fich1 = new File(name + ".csv");
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
		System.out.println("Ha importado el fichero " + name);
	}
	
	//Metodo para leer el fichero a partir de introducirle un ArrayList
	public static void leerfichero(ArrayList<Videojuego> Listaactual) {
	
		for(Videojuego v : Listaactual) {
			System.out.println(v.toString());
			
		}
	}
	
	//Metodo para recorrer el fichero importado y que guarde los
	//datos dentro del ArrayList
	public void BBDDfromfile(String line, BufferedReader br) throws IOException {
		
		line = br.readLine();
		line = br.readLine();
		
		//-------------------
		
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
			this.videojuegos.add(v1);
		}
		System.out.println("Se han añadido correctamente " + videojuegos.size() + " videojuegos");
	}
}
