package com.ejemplo.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Entity
@Table(name="videojuegos")
public class Videojuego {

	//datos que aparecen en la documentacion
	private int id;
	@NotEmpty(message = "Necesitamos que indiques un rango")
	private String rango;
	@NotEmpty(message = "El nombre no debe ser vacío")
	private String name;
	@Max(value = 2022)
	@Positive
	@Size(min=1, max=4)
	private int year;
	@NotEmpty(message = "El genero no debe ser vacío")
	private String genre;
	@NotEmpty(message = "La plataforma no debe ser vacío")
	private String platform;
	@NotEmpty(message = "El editor no debe ser vacío")
	private String publisher;
	@Positive
	private double eu_Sales;
	
	public Videojuego() {
		super();
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
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
		return this.eu_Sales;
	}

	public void setEU_Sales(double EU_Sales) {
		this.eu_Sales = EU_Sales;
	}

	@Override
	public String toString() {
		return "Videojuego [id= " + id + ", Rango= " + rango + ", Name= " + name + ", Year= " + year + ", Genre= " + genre
				+ ", Platform= " + platform + ", Publisher= " + publisher + ", EU_Sales= " + eu_Sales + "]";
	}		
}
