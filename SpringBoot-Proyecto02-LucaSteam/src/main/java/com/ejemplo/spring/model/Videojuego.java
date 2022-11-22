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
	@Schema(name = "id",
			description = "Identificación único para el videojuego",
			example = "1",
			required = true)
	private Long id;
	@Size(min = 0, max = 30)
	private String orden;
	private String nombre;
	private Date year;
	private String genero;
	private String plataforma;
	private String editor;
	private double ventas;
	
	public Videojuego() {
		
	}
	
	public Videojuego(@Size(min = 0, max = 30) String orden, String nombre, Date year, String genero, String plataforma,
			String editor, double ventas) {
		super();
		this.orden = orden;
		this.nombre = nombre;
		this.year = year;
		this.genero = genero;
		this.plataforma = plataforma;
		this.editor = editor;
		this.ventas = ventas;
	}	

	public Videojuego(Long id, @Size(min = 0, max = 30) String orden, String nombre, Date year, String genero,
			String plataforma, String editor, double ventas) {
		super();
		this.id = id;
		this.orden = orden;
		this.nombre = nombre;
		this.year = year;
		this.genero = genero;
		this.plataforma = plataforma;
		this.editor = editor;
		this.ventas = ventas;
	}	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrden() {
		return orden;
	}

	public void setOrden(String orden) {
		this.orden = orden;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getYear() {
		return year;
	}

	public void setYear(Date year) {
		this.year = year;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public double getVentas() {
		return ventas;
	}

	public void setVentas(double ventas) {
		this.ventas = ventas;
	}	

	@Override
	public String toString() {
		String fecha = new SimpleDateFormat("dd-MM-yyyy").format(getYear());
		return "Videojuego [CurrentID=" + id + ", Orden= " + orden + ", Nombre= " + nombre + ", Year= " + year + ", Género= "
				+ genero + ", Plataforma= " + plataforma + ", Editor= " + editor + ", Ventas= " + ventas + "]";
	}		
}
