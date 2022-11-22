package com.ejemplo.spring.model;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import io.swagger.v3.oas.annotations.media.Schema;

@Entity
@Table(name="videojuegos")
public class Videojuego {

	//datos que aparecen en la documentacion
	private int id;
	@Size(min = 0, max = 30)
	private String Rank;
	private String name;
	private Date year;
	private String genre;
	private String platform;
	private String publisher;
	private double EU_Sales;
	
	public Videojuego() {
		super();
	}	

	public Videojuego(int id, @Size(min = 0, max = 30) String Rank, String name, Date year, String genre, String platform,
			String publisher, double EU_Sales) {
		super();
		this.id = id;
		this.Rank = Rank;
		this.name = name;
		this.year = year;
		this.genre = genre;
		this.platform = platform;
		this.publisher = publisher;
		this.EU_Sales = EU_Sales;
	}		

	@Id
<<<<<<< HEAD
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	public int getId() {
=======
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	public Long getId() {
>>>>>>> 992b8aeb4f391163faa908a61568f0a75746ea25
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRank() {
		return Rank;
	}

	public void setRank(String rank) {
		Rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getYear() {
		return year;
	}

	public void setYear(Date year) {
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
		String fecha = new SimpleDateFormat("dd-MM-yyyy").format(getYear());
		return "Videojuego [id= " + id + ", Rank= " + Rank + ", Name= " + name + ", Year= " + year + ", Genre= " + genre
				+ ", Platform= " + platform + ", Publisher= " + publisher + ", EU_Sales= " + EU_Sales + "]";
	}		
}
