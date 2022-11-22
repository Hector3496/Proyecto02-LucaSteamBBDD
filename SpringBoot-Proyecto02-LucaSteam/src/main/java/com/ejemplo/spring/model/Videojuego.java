package com.ejemplo.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="videojuegos")
public class Videojuego {

	//datos que aparecen en la documentacion
	private int id;
	@Size(min = 0, max = 30)
	private String rango;
	private String name;
	private String year;
	private String genre;
	private String platform;
	private String publisher;
	private double EU_Sales;
	
	public Videojuego() {
		super();
	}	

	public Videojuego(int id, @Size(min = 0, max = 30) String rango, String name, String year, String genre, String platform,
			String publisher, double EU_Sales) {
		super();
		this.id = id;
		this.rango = rango;
		this.name = name;
		this.year = year;
		this.genre = genre;
		this.platform = platform;
		this.publisher = publisher;
		this.EU_Sales = EU_Sales;
	}		

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRango() {
		return rango;
	}

	public void setRango(String rang) {
		rango = rang;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public double getEU_Sales() {
		return EU_Sales;
	}

	public void setEU_Sales(double eU_Sales) {
		EU_Sales = eU_Sales;
	}

	@Override
	public String toString() {
		return "Videojuego [id= " + id + ", Rango= " + rango + ", Name= " + name + ", Year= " + year + ", Genre= " + genre
				+ ", Platform= " + platform + ", Publisher= " + publisher + ", EU_Sales= " + EU_Sales + "]";
	}		
}
